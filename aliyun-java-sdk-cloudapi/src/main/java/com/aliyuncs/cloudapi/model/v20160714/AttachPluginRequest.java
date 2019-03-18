package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version
 */
public class AttachPluginRequest extends RpcAcsRequest<AttachPluginResponse> {

    public AttachPluginRequest() {
        super("CloudAPI", "2016-07-14", "AttachPlugin", "apigateway");
    }

    private String pluginId;
    private String apiId;
    private String stageName;

    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
        putQueryParameter("ApiId", apiId);
    }

    public String getPluginId() {
        return pluginId;
    }

    public void setPluginId(String pluginId) {
        this.pluginId = pluginId;
        putQueryParameter("PluginId",pluginId);
    }

    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
        putQueryParameter("StageName",stageName);
    }

    @Override
    public Class<AttachPluginResponse> getResponseClass() {
        return AttachPluginResponse.class;
    }
}
