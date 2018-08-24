package com.system.biz;

import com.system.biz.rpc.IMainService;
import com.system.biz.rpc.response.main.*;
import com.system.entity.main.MainBannerVo;
import com.system.entity.main.MainBlockVo;
import com.system.mapper.main.*;
import com.system.utils.map.QueryChainMap;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by Nero on 2018-08-22.
 */
@Service
public class MainService implements IMainService{

    @Autowired
    MainBannerMapper mainBannerMapper;
    @Autowired
    MainMarkMapper mainMarkMapper;
    @Autowired
    MainUserMapper mainUserMapper;
    @Autowired
    MainBlockMapper mainBlockMapper;
    @Autowired
    MainRecommendMapper mainRecommendMapper;
    @Autowired
    MainRankMapper mainRankMapper;


    @Override
    public MainDataResponse getMainData() {
        MainDataResponse mainDataResponse = new MainDataResponse();

        //-banner推荐位
        QueryChainMap bannerCondition = QueryChainMap.generateQueryChain().chainPut("state",1);
        List<MainBannerVo> listBanner = mainBannerMapper.getListMainBanner(bannerCondition);
        List<MainBannerResponse> mainBannerResponses = new ArrayList<>();
        for(MainBannerVo mainBannerVo : listBanner){
            MainBannerResponse mainBannerResponse = new MainBannerResponse();
            BeanUtils.copyProperties(mainBannerVo,mainBannerResponse);
            mainBannerResponses.add(mainBannerResponse);
        }

        //-标签推荐
        QueryChainMap markCondition = QueryChainMap.generateQueryChain()
                                            .chainPut("state",1).chainPut("type",1);
        List<MainMarkResponse> listMarks = mainMarkMapper.getListMainMark(markCondition);

        //-明星用户
        List<MainUserResponse> listUsers = mainUserMapper.getMainUserList(null);
        MainUserResponse starUser = null;
        if(null != listUsers && listUsers.size() > 0){
            starUser = listUsers.get(0);
        }

        //-故事版块推荐
        List<MainBlockVo> listBlocks = mainBlockMapper.getMainBlockList(null);
        MainBLockResponse mainBLockResponse = new MainBLockResponse();
        if(null != listBlocks && listBlocks.size() > 0){
            MainBlockVo mainBlockVo = listBlocks.get(0);
            BeanUtils.copyProperties(mainBlockVo,mainBLockResponse);
        }

        //-今日专辑故事推荐
        List<MainRecommendResponse> listRec = mainRecommendMapper.getListMainRec(markCondition);

        //我的收藏
        //-TODO 值得关注用户随机算法

        //-九宫格标签推荐
        markCondition.chainPut("type",2);
        List<MainMarkResponse> listNineMarks = mainMarkMapper.getListMainMark(markCondition);

        //-公益排行榜
        List<MainLoveRankResponse> listRank = mainRankMapper.getRankList(null);
        for(int i = 0 ; i < listRank.size() ; i++){
            listRank.get(i).setRank(i+1);
        }

        mainDataResponse.setMainBannerResponses(mainBannerResponses);
        mainDataResponse.setMainMarkResponses(listMarks);
        mainDataResponse.setMainUserResponse(starUser);
        mainDataResponse.setMainBLockResponse(mainBLockResponse);
        mainDataResponse.setMainRecommendResponses(listRec);
        mainDataResponse.setListNineMarks(listNineMarks);
        mainDataResponse.setMainLoveRankResponses(listRank);
        return mainDataResponse;
    }
}
