package com.application.db.datasource.change;

/**
 * Created by Nero on 2018-04-16.
 */
public class ConnectionHolder {
    private static ThreadLocal<ConnectionType> holder = new ThreadLocal<>();

    public static void set(ConnectionType type)
    {
        holder.set(type);
    }

    public static ConnectionType get()
    {
        return (ConnectionType)holder.get();
    }

    public static void release()
    {
        holder.remove();
    }

}
