package com.aliyuncs.http.clients;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.conn.HttpClientConnectionManager;

import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class ApacheIdleConnectionCleaner extends Thread {

    private static final Log LOG = LogFactory.getLog(ApacheIdleConnectionCleaner.class);

    public static int getPeriodSec() {
        return periodSec;
    }

    public static void setPeriodSec(int periodSec) {
        ApacheIdleConnectionCleaner.periodSec = periodSec;
    }

    private static final int DEFAULT_PERIOD_SEC = 60;
    private static int periodSec = DEFAULT_PERIOD_SEC;
    private static final Map<HttpClientConnectionManager, Long> CONNMGRMAP = new ConcurrentHashMap<HttpClientConnectionManager, Long>();
    private static volatile ApacheIdleConnectionCleaner instance;
    private volatile boolean isShuttingDown;

    private ApacheIdleConnectionCleaner() {
        super("sdk-apache-idle-connection-cleaner");
        setDaemon(true);
    }

    public static void registerConnectionManager(HttpClientConnectionManager connMgr, Long idleTimeMills) {
        if (instance == null) {
            synchronized (ApacheIdleConnectionCleaner.class) {
                if (instance == null) {
                    instance = new ApacheIdleConnectionCleaner();
                    instance.start();
                }
            }
        }
        CONNMGRMAP.put(connMgr, idleTimeMills);
    }

    public static void removeConnectionManager(HttpClientConnectionManager connectionManager) {
        CONNMGRMAP.remove(connectionManager);
        if (CONNMGRMAP.isEmpty()) {
            shutdown();
        }
    }

    public static void shutdown() {
        if (instance != null) {
            instance.isShuttingDown = true;
            instance.interrupt();
            CONNMGRMAP.clear();
            instance = null;
        }
    }

    @Override
    public void run() {
        while (true) {
            if (isShuttingDown) {
                LOG.debug("Shutting down.");
                return;
            }
            try {
                Thread.sleep(periodSec * 1000);

                for (Entry<HttpClientConnectionManager, Long> entry : CONNMGRMAP.entrySet()) {
                    try {
                        entry.getKey().closeIdleConnections(entry.getValue(), TimeUnit.MILLISECONDS);
                    } catch (Exception t) {
                        LOG.warn("close idle connections failed", t);
                    }
                }
            } catch (InterruptedException e) {
                LOG.debug("interrupted.", e);
            }
        }
    }

}