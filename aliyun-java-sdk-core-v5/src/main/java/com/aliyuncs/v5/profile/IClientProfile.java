package com.aliyuncs.v5.profile;

import com.aliyuncs.v5.auth.AlibabaCloudCredentialsProvider;
import com.aliyuncs.v5.auth.Credential;
import com.aliyuncs.v5.auth.ISigner;
import com.aliyuncs.v5.http.FormatType;
import com.aliyuncs.v5.http.HttpClientConfig;
import org.slf4j.Logger;

@SuppressWarnings("deprecation")
public interface IClientProfile {

    /**
     * @Deprecated : Use Signer.getSigner(AlibabaCloudCredentials credentials) instead of this
     */
    @Deprecated
           ISigner getSigner();

           String getRegionId();

           FormatType getFormat();

    /**
     * @Deprecated : Use AlibabaCloudCredentialsProvider getCredentials() instead of this
     */
    @Deprecated
            Credential getCredential();

    /**
     * This method exists because ClientProfile holds too much modules like endpoint management
     *
     * @param credentialsProvider
     */
        void setCredentialsProvider(AlibabaCloudCredentialsProvider credentialsProvider);

    /**
     * use HttpClientConfig.getCertPath instead
     */
    @Deprecated
         String getCertPath();

    /**
     * use HttpClientConfig.setCertPath instead
     *
     * @param certPath
     */
    @Deprecated
          void setCertPath(String certPath);

    /**
     * http client configs
     */
          HttpClientConfig getHttpClientConfig();

          void setHttpClientConfig(HttpClientConfig httpClientConfig);

          void enableUsingInternalLocationService();

          boolean isUsingInternalLocationService();

          boolean isUsingVpcEndpoint();

          void enableUsingVpcEndpoint();

    /**
     * @Deprecated : Use enableUsingInternalLocationService instead of this
     */
    @Deprecated
          void setUsingInternalLocationService();

          Logger getLogger();

          void setLogger(Logger logger);

          String getLogFormat();

          void setLogFormat(String logFormat);

         boolean isCloseTrace();

         void setCloseTrace(boolean closeTrace);
}
