package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version
 */
public class DeletePluginRequest extends RpcAcsRequest<DeletePluginResponse> {

    public DeletePluginRequest() {
        super("CloudAPI", "2016-07-14", "DeletePlugin", "apigateway");
    }

    private String pluginId;

    public String getPluginId() {
        return pluginId;
    }

    public void setPluginId(String pluginId) {
        this.pluginId = pluginId;
        putQueryParameter("PluginId",pluginId);
    }


    @Override
    public Class<DeletePluginResponse> getResponseClass() {
        return DeletePluginResponse.class;
    }
}
