package com.aliyuncs.http.clients;

import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.concurrent.TimeUnit;

import org.apache.http.conn.HttpClientConnectionManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

public class ApacheIdleConnectionCleanerTest {

    @Before
    public void init(){
        ApacheIdleConnectionCleaner.shutdown();
    }

    @Test
    public void getSetTest() {
        ApacheIdleConnectionCleaner.setPeriodSec(1);
        Assert.assertEquals(1, ApacheIdleConnectionCleaner.getPeriodSec());
    }

    @Test
    public void registerAndShutdownWhenInstanceIsNullAndManagerIsNormal() {

        ApacheIdleConnectionCleaner.setPeriodSec(1);
        HttpClientConnectionManager manager = mock(HttpClientConnectionManager.class);
        ApacheIdleConnectionCleaner.registerConnectionManager(manager, 30 * 1000L);
        doAnswer(new Answer() {
            @Override
            public Object answer(InvocationOnMock invocationOnMock) {
                long idleTime = invocationOnMock.getArgumentAt(0, long.class);
                Assert.assertEquals(idleTime, idleTime, 30 * 1000L);
                return null;
            }
        }).when(manager).closeIdleConnections(30 * 1000L, TimeUnit.MILLISECONDS);

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ApacheIdleConnectionCleaner.shutdown();
        verify(manager, times(1)).closeIdleConnections(30 * 1000L, TimeUnit.MILLISECONDS);
        try {
            Thread.sleep(2 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void registerAndShutdownWhenInstanceIsNullAndManagerThrowException() {
        ApacheIdleConnectionCleaner.setPeriodSec(1);
        HttpClientConnectionManager manager = mock(HttpClientConnectionManager.class);
        RuntimeException e0 = new RuntimeException("mock");
        doThrow(e0).when(manager).closeIdleConnections(60 * 1000L, TimeUnit.MILLISECONDS);
        ApacheIdleConnectionCleaner.registerConnectionManager(manager, 60 * 1000L);

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ApacheIdleConnectionCleaner.shutdown();
        verify(manager, times(1)).closeIdleConnections(60 * 1000L, TimeUnit.MILLISECONDS);
        try {
            Thread.sleep(2 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void registerTwiceAndShutDownTwiceConnection() {
        ApacheIdleConnectionCleaner.setPeriodSec(1);
        HttpClientConnectionManager manager1 = mock(HttpClientConnectionManager.class);
        HttpClientConnectionManager manager2 = mock(HttpClientConnectionManager.class);
        ApacheIdleConnectionCleaner.registerConnectionManager(manager1, 60 * 1000L);
        ApacheIdleConnectionCleaner.registerConnectionManager(manager2, 60 * 1000L);
        doAnswer(new Answer() {
            @Override
            public Object answer(InvocationOnMock invocationOnMock) {
                long idleTime = invocationOnMock.getArgumentAt(0, long.class);
                Assert.assertEquals(idleTime, idleTime, 30 * 1000L);
                return null;
            }
        }).when(manager1).closeIdleConnections(30 * 1000L, TimeUnit.MILLISECONDS);

        doAnswer(new Answer() {
            @Override
            public Object answer(InvocationOnMock invocationOnMock) {
                long idleTime = invocationOnMock.getArgumentAt(0, long.class);
                Assert.assertEquals(idleTime, idleTime, 30 * 1000L);
                return null;
            }
        }).when(manager2).closeIdleConnections(30 * 1000L, TimeUnit.MILLISECONDS);

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ApacheIdleConnectionCleaner.shutdown();
        ApacheIdleConnectionCleaner.shutdown();
        verify(manager1, times(1)).closeIdleConnections(60 * 1000L, TimeUnit.MILLISECONDS);
        verify(manager2, times(1)).closeIdleConnections(60 * 1000L, TimeUnit.MILLISECONDS);
        try {
            Thread.sleep(2 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void registerOnceAndRemoveManager() {
        ApacheIdleConnectionCleaner.setPeriodSec(1);
        HttpClientConnectionManager manager = mock(HttpClientConnectionManager.class);
        doAnswer(new Answer() {
            @Override
            public Object answer(InvocationOnMock invocationOnMock) {
                long idleTime = invocationOnMock.getArgumentAt(0, long.class);
                Assert.assertEquals(idleTime, idleTime, 30 * 1000L);
                return null;
            }
        }).when(manager).closeIdleConnections(30 * 1000L, TimeUnit.MILLISECONDS);
        ApacheIdleConnectionCleaner.registerConnectionManager(manager, 60 * 1000L);

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ApacheIdleConnectionCleaner.removeConnectionManager(manager);
        verify(manager, times(1)).closeIdleConnections(60 * 1000L, TimeUnit.MILLISECONDS);
        try {
            Thread.sleep(2 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void registerTwiceAndRemoveTwiceManager() {
        ApacheIdleConnectionCleaner.setPeriodSec(1);
        HttpClientConnectionManager manager1 = mock(HttpClientConnectionManager.class);
        HttpClientConnectionManager manager2 = mock(HttpClientConnectionManager.class);
        doAnswer(new Answer() {
            @Override
            public Object answer(InvocationOnMock invocationOnMock) {
                long idleTime = invocationOnMock.getArgumentAt(0, long.class);
                Assert.assertEquals(idleTime, idleTime, 30 * 1000L);
                return null;
            }
        }).when(manager1).closeIdleConnections(30 * 1000L, TimeUnit.MILLISECONDS);
        doAnswer(new Answer() {
            @Override
            public Object answer(InvocationOnMock invocationOnMock) {
                long idleTime = invocationOnMock.getArgumentAt(0, long.class);
                Assert.assertEquals(idleTime, idleTime, 30 * 1000L);
                return null;
            }
        }).when(manager2).closeIdleConnections(30 * 1000L, TimeUnit.MILLISECONDS);
        ApacheIdleConnectionCleaner.registerConnectionManager(manager1, 60 * 1000L);
        ApacheIdleConnectionCleaner.registerConnectionManager(manager2, 60 * 1000L);

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ApacheIdleConnectionCleaner.removeConnectionManager(manager1);
        ApacheIdleConnectionCleaner.removeConnectionManager(manager2);
        verify(manager1, times(1)).closeIdleConnections(60 * 1000L, TimeUnit.MILLISECONDS);
        verify(manager2, times(1)).closeIdleConnections(60 * 1000L, TimeUnit.MILLISECONDS);
        try {
            Thread.sleep(2 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
