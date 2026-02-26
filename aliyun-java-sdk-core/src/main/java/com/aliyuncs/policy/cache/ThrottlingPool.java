package com.aliyuncs.policy.cache;

import org.apache.commons.lang3.concurrent.BasicThreadFactory;

import java.util.Map;
import java.util.concurrent.*;

public class ThrottlingPool {

    private final static Map<String, Entity> map = new ConcurrentHashMap<String, Entity>();
    private final static ScheduledExecutorService executor = new ScheduledThreadPoolExecutor(1, new BasicThreadFactory.Builder().namingPattern("throttling-pool-%d").daemon(true).build());

    public synchronized static void put(String key, Object data) {
        ThrottlingPool.put(key, data, -1);
    }

    public synchronized static void put(final String key, Object data, int expire) {
        ThrottlingPool.remove(key);
        if (data != null) {
            if (expire >= 0) {
                Future<?> future = executor.schedule(new Runnable() {
                    @Override
                    public void run() {
                        synchronized (ThrottlingPool.class) {
                            map.remove(key);
                        }
                    }
                }, expire, TimeUnit.MILLISECONDS);
                map.put(key, new Entity(data, expire, future));
            } else {
                map.put(key, new Entity(data, expire, null));
            }
        }
    }

    public synchronized static Object get(String key) {
        Entity entity = map.get(key);
        return entity != null ? entity.getValue() : null;
    }

    public synchronized static <T> T get(String key, Class<T> clazz) {
        return clazz.cast(ThrottlingPool.get(key));
    }

    public synchronized static int getExpire(String key) {
        Entity entity = map.get(key);
        return entity != null ? entity.getExpire() : 0;
    }

    public synchronized static Object remove(String key) {
        Entity entity = map.remove(key);
        if (entity == null) return null;
        Future<?> future = entity.getFuture();
        if (future != null) future.cancel(true);
        return entity.getValue();
    }

    public synchronized static int size() {
        return map.size();
    }

    public synchronized static void clear() {
        for (Entity entity : map.values()) {
            if (entity != null) {
                Future<?> future = entity.getFuture();
                if (future != null) future.cancel(true);
            }
        }
        map.clear();
    }

    public synchronized static Map<String, Entity> getPool() {
        return map;
    }

    private static class Entity {
        private Object value;
        private int expire;
        private Future<?> future;

        public Entity(Object value, int expire, Future<?> future) {
            this.value = value;
            this.expire = expire;
            this.future = future;
        }

        public Object getValue() {
            return value;
        }

        public int getExpire() {
            return expire;
        }

        public Future<?> getFuture() {
            return future;
        }
    }
}
