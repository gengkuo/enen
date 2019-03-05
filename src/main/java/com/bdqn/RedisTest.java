package com.bdqn;

import redis.clients.jedis.Jedis;

public class RedisTest {
    public static void main(String[] args) {
        Jedis jedis = new Jedis();
        jedis.set("zzz","耿阔");

        System.out.println(jedis.get("zzz"));

        jedis.rpush("xxx","1","2","3");

        jedis.lrange("xxx",0,-1).forEach(System.out::println);
    }
}
