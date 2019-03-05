package com.bdqn.util;

import org.apache.ibatis.cache.Cache;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.io.Serializable;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class RedisCache implements Cache {

    private Jedis redisClient = createClient();
    private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private String id;

    public RedisCache(final String id) {

        if(id == null){
            throw new IllegalArgumentException("Cache instances require an ID");
        }
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public void putObject(Object o, Object o1) {
         //redisClient.set(SerializeUtil.serialize(key.toString()), SerializeUtil.serialize(value));
    }

    @Override
    public Object getObject(Object o) {
//        Object value = SerializeUtil.unserialize(redisClient.get(SerializeUtil.serialize(key.toString())));
      //  return value;
        return null;

    }

    @Override
    public Object removeObject(Object o) {
//        return redisClient.expire(SerializeUtil.serialize(key.toString()), 0);
        return null;

    }

    @Override
    public void clear() {
        redisClient.flushDB();

    }

    @Override
    public int getSize() {
        return Integer.valueOf(redisClient.dbSize().toString());
    }

    @Override
    public ReadWriteLock getReadWriteLock() {
        return readWriteLock;

    }
    protected static Jedis createClient() {
        try{
            JedisPool pool = new JedisPool(new JedisPoolConfig(),"127.0.0.1");
            return pool.getResource();
        }catch (Exception e){
            e.printStackTrace();
        }
        throw new RuntimeException("connect failed");
    }

}
