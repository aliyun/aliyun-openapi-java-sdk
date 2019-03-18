package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version
 */
public class DetachPluginRequest extends RpcAcsRequest<DetachPluginResponse> {

    public DetachPluginRequest() {
        super("CloudAPI", "2016-07-14", "DetachPlugin", "apigateway");
    }

    private String pluginId;
    private String apiId;
    private String stageName;

    public String getPluginId() {
        return pluginId;
    }

    public void setPluginId(String pluginId) {
        this.pluginId = pluginId;
        putQueryParameter("PluginId",pluginId);
    }

    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
        putQueryParameter("ApiId", apiId);
    }

    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
        putQueryParameter("StageName",stageName);
    }

    @Override
    public Class<DetachPluginResponse> getResponseClass() {
        return DetachPluginResponse.class;
    }
}
