package com.aliyuncs.http;

import org.apache.http.client.CredentialsProvider;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public class HttpClientConfig {

    public static final long DEFAULT_CONNECTION_TIMEOUT = 5000;

    public static final long DEFAULT_READ_TIMEOUT = 10000;

    public static final String IGNORE_SSL_ENV = "ALIBABACLOUD_JAVA_CORE_INGNORE_SSL";
    /**
     * client type
     */
    private HttpClientType clientType = null;
    private String customClientClassName = null;

    /**
     * connectionPool
     **/
    private int maxIdleConnections = 128;
    private long maxIdleTimeMillis = 60 * 1000L;
    private long keepAliveDurationMillis = 5000L;

    /**
     * timeout
     **/
    private long connectionTimeoutMillis = DEFAULT_CONNECTION_TIMEOUT;
    private long readTimeoutMillis = DEFAULT_READ_TIMEOUT;
    private long writeTimeoutMillis = 60 * 1000L;

    /**
     * global protocolType
     **/
    private ProtocolType protocolType = ProtocolType.HTTP;

    /**
     * https
     **/
    private boolean ignoreSSLCerts = false;
    private SSLSocketFactory sslSocketFactory = null;
    private KeyManager[] keyManagers = null;
    private X509TrustManager[] x509TrustManagers = null;
    private SecureRandom secureRandom = null;
    private HostnameVerifier hostnameVerifier = null;
    @Deprecated
    private String certPath = null;

    /**
     * dispatcher
     **/
    private int maxRequests = 128;
    private int maxRequestsPerHost = 128;
    private Runnable idleCallback = null;
    private ExecutorService executorService = null;


    /**
     * proxy configurations
     */

    private String httpProxy = null;
    private String httpsProxy = null;
    private String noProxy = null;
    private CredentialsProvider credentialsProvider;

    /**
     * extra params
     */
    private Map<String, Object> extParams = new HashMap<String, Object>();

    private boolean compatibleMode = false;

    public static HttpClientConfig getDefault() {
        HttpClientConfig config = new HttpClientConfig();
        config.setClientType(HttpClientType.ApacheHttpClient);
        return config;
    }

    public HttpClientType getClientType() {
        return clientType;
    }

    public void setClientType(HttpClientType clientType) {
        this.clientType = clientType;
    }


    @Deprecated
    public String getCertPath() {
        return certPath;
    }

    /**
     * use HttpClientConfig.setX509TrustManagers() and HttpClientConfig.setKeyManagers() instead
     */
    @Deprecated
    public void setCertPath(String certPath) {
        this.certPath = certPath;
    }

    public int getMaxIdleConnections() {
        return maxIdleConnections;
    }

    public void setMaxIdleConnections(int maxIdleConnections) {
        this.maxIdleConnections = maxIdleConnections;
    }

    public long getMaxIdleTimeMillis() {
        return maxIdleTimeMillis;
    }

    public void setMaxIdleTimeMillis(long maxIdleTimeMillis) {
        this.maxIdleTimeMillis = maxIdleTimeMillis;
    }

    public long getKeepAliveDurationMillis() {
        return keepAliveDurationMillis;
    }

    public void setKeepAliveDurationMillis(long keepAliveDurationMillis) {
        this.keepAliveDurationMillis = keepAliveDurationMillis;
    }

    public long getConnectionTimeoutMillis() {
        return connectionTimeoutMillis;
    }

    public void setConnectionTimeoutMillis(long connectionTimeoutMillis) {
        this.connectionTimeoutMillis = connectionTimeoutMillis;
    }

    public long getReadTimeoutMillis() {
        return readTimeoutMillis;
    }

    public void setReadTimeoutMillis(long readTimeoutMillis) {
        this.readTimeoutMillis = readTimeoutMillis;
    }

    public long getWriteTimeoutMillis() {
        return writeTimeoutMillis;
    }

    public void setWriteTimeoutMillis(long writeTimeoutMillis) {
        this.writeTimeoutMillis = writeTimeoutMillis;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    public void setSslSocketFactory(SSLSocketFactory sslSocketFactory) {
        this.sslSocketFactory = sslSocketFactory;
    }

    public KeyManager[] getKeyManagers() {
        return keyManagers;
    }

    public void setKeyManagers(KeyManager[] keyManagers) {
        this.keyManagers = keyManagers;
    }

    public X509TrustManager[] getX509TrustManagers() {
        return x509TrustManagers;
    }

    public void setX509TrustManagers(X509TrustManager[] x509TrustManagers) {
        this.x509TrustManagers = x509TrustManagers;
    }

    public SecureRandom getSecureRandom() {
        return secureRandom;
    }

    public void setSecureRandom(SecureRandom secureRandom) {
        this.secureRandom = secureRandom;
    }

    public HostnameVerifier getHostnameVerifier() {
        return hostnameVerifier;
    }

    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.hostnameVerifier = hostnameVerifier;
    }

    public int getMaxRequests() {
        return maxRequests;
    }

    public void setMaxRequests(int maxRequests) {
        this.maxRequests = maxRequests;
    }

    public int getMaxRequestsPerHost() {
        return maxRequestsPerHost;
    }

    public void setMaxRequestsPerHost(int maxRequestsPerHost) {
        this.maxRequestsPerHost = maxRequestsPerHost;
    }

    public Runnable getIdleCallback() {
        return idleCallback;
    }

    public void setIdleCallback(Runnable idleCallback) {
        this.idleCallback = idleCallback;
    }

    public ExecutorService getExecutorService() {
        return executorService;
    }

    public void setExecutorService(ExecutorService executorService) {
        this.executorService = executorService;
    }

    public Map<String, Object> getExtParams() {
        return extParams;
    }

    public void setExtParams(Map<String, Object> extParams) {
        this.extParams = extParams;
    }

    public String getCustomClientClassName() {
        return customClientClassName;
    }

    public void setCustomClientClassName(String customClientClassName) {
        this.customClientClassName = customClientClassName;
    }

    public Object getExtParam(Object key) {
        return extParams.get(key);
    }

    public Object setExtParam(String key, Object value) {
        return extParams.put(key, value);
    }

    public boolean containsExtParam(Object key) {
        return extParams.containsKey(key);
    }

    public boolean isIgnoreSSLCerts() {
        return "YES".equals(System.getProperty(IGNORE_SSL_ENV)) || "YES".equals(System.getenv(IGNORE_SSL_ENV)) || this.ignoreSSLCerts;
    }

    public void setIgnoreSSLCerts(boolean ignoreSSLCerts) {
        this.ignoreSSLCerts = ignoreSSLCerts;
    }

    public boolean isCompatibleMode() {
        return compatibleMode;
    }

    public void setCompatibleMode(boolean compatibleMode) {
        this.compatibleMode = compatibleMode;
    }

    public ProtocolType getProtocolType() {
        return protocolType;
    }

    public void setProtocolType(ProtocolType protocolType) {
        this.protocolType = protocolType;
    }

    public String getHttpProxy() {
        return httpProxy;
    }

    public void setHttpProxy(String httpProxy) {
        this.httpProxy = httpProxy;
    }

    public String getHttpsProxy() {
        return httpsProxy;
    }

    public void setHttpsProxy(String httpsProxy) {
        this.httpsProxy = httpsProxy;
    }

    public String getNoProxy() {
        return noProxy;
    }

    public void setNoProxy(String noProxy) {
        this.noProxy = noProxy;
    }

    public CredentialsProvider getCredentialsProvider() {
        return credentialsProvider;
    }

    public void setCredentialsProvider(CredentialsProvider credentialsProvider) {
        this.credentialsProvider = credentialsProvider;
    }
}
