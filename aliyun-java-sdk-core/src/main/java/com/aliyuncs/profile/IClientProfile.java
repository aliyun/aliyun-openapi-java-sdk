package com.aliyuncs.profile;

import com.aliyuncs.auth.AlibabaCloudCredentialsProvider;
import com.aliyuncs.auth.Credential;
import com.aliyuncs.auth.ISigner;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.HttpClientConfig;
import org.slf4j.Logger;

@SuppressWarnings("deprecation")
public interface IClientProfile {

    /**
     * @Deprecated : Use Signer.getSigner(AlibabaCloudCredentials credentials) instead of this
     */
    @Deprecated
    public ISigner getSigner();

    public String getRegionId();

    public FormatType getFormat();

    /**
     * @Deprecated : Use AlibabaCloudCredentialsProvider getCredentials() instead of this
     */
    @Deprecated
    public Credential getCredential();

    /**
     * This method exists because ClientProfile holds too much modules like endpoint management
     *
     * @param credentialsProvider
     */
    public void setCredentialsProvider(AlibabaCloudCredentialsProvider credentialsProvider);

    /**
     * use HttpClientConfig.getCertPath instead
     */
    @Deprecated
    public String getCertPath();

    /**
     * use HttpClientConfig.setCertPath instead
     *
     * @param certPath
     */
    @Deprecated
    public void setCertPath(String certPath);

    /**
     * http client configs
     */
    public HttpClientConfig getHttpClientConfig();

    public void setHttpClientConfig(HttpClientConfig httpClientConfig);

    public void enableUsingInternalLocationService();

    public boolean isUsingInternalLocationService();

    public boolean isUsingVpcEndpoint();

    public void enableUsingVpcEndpoint();

    /**
     * @Deprecated : Use enableUsingInternalLocationService instead of this
     */
    @Deprecated
    public void setUsingInternalLocationService();

    public Logger getLogger();

    public void setLogger(Logger logger);

    public String getLogFormat();

    public void setLogFormat(String logFormat);
}
