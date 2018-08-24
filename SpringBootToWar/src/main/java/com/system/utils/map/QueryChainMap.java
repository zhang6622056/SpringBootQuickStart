package com.system.utils.map;

import java.util.HashMap;
import java.util.Map;

/**
 * 链式调用
 * 用于mybatis Map传参
 * Created by Nero on 2018/1/15.
 */
public class QueryChainMap<K,V> extends HashMap<K,V>{


    public QueryChainMap chainPut(K k,V v){
        this.put(k,v);
        return this;
    }

    public static QueryChainMap generateQueryChain(){
            return new QueryChainMap<String,Object>();
    }

    public static void main(String[] args) {
        Map<String,Object> querychain = QueryChainMap.generateQueryChain()
                .chainPut("1",2)
                .chainPut("2",3);
        System.out.println(querychain.get("1"));
        System.out.println(querychain.get("2"));
    }

}
