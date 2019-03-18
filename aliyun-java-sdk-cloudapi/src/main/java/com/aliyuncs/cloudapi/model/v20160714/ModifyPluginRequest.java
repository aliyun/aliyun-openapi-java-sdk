package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version
 */
public class ModifyPluginRequest extends RpcAcsRequest<ModifyPluginResponse> {

    public ModifyPluginRequest() {
        super("CloudAPI", "2016-07-14", "ModifyPlugin", "apigateway");
    }

    private String pluginId;
    private String pluginName;
    private String pluginData;
    private String description;

    public String getPluginName() {
        return pluginName;
    }

    public void setPluginName(String pluginName) {
        this.pluginName = pluginName;
        putQueryParameter("PluginName",pluginName);
    }

    public String getPluginId() {
        return pluginId;
    }

    public void setPluginId(String pluginId) {
        this.pluginId = pluginId;
        putQueryParameter("PluginId",pluginId);
    }

    public String getPluginData() {
        return pluginData;
    }

    public void setPluginData(String pluginData) {
        this.pluginData = pluginData;
        putQueryParameter("PluginData",pluginData);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        putQueryParameter("Description",description);
    }

    @Override
    public Class<ModifyPluginResponse> getResponseClass() {
        return ModifyPluginResponse.class;
    }
}
