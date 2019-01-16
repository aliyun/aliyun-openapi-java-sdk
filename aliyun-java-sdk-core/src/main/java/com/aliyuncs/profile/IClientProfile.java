package com.aliyuncs.profile;

import com.aliyuncs.auth.AlibabaCloudCredentialsProvider;
import com.aliyuncs.auth.Credential;
import com.aliyuncs.auth.ISigner;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.HttpClientConfig;

@SuppressWarnings("deprecation")
public interface IClientProfile {

    @Deprecated
    public ISigner getSigner();

    public String getRegionId();

    public FormatType getFormat();

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
    @Deprecated
    public void setUsingInternalLocationService();
}
