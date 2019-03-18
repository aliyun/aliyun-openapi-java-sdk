package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version
 */
public class CreatePluginRequest extends RpcAcsRequest<CreatePluginResponse> {

    public CreatePluginRequest() {
        super("CloudAPI", "2016-07-14", "CreatePlugin", "apigateway");
    }

    private String pluginName;
    private String pluginType;
    private String pluginData;
    private String description;

    public String getPluginName() {
        return pluginName;
    }

    public void setPluginName(String pluginName) {
        this.pluginName = pluginName;
        putQueryParameter("PluginName",pluginName);
    }

    public String getPluginType() {
        return pluginType;
    }

    public void setPluginType(String pluginType) {
        this.pluginType = pluginType;
        putQueryParameter("PluginType",pluginType);
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
    public Class<CreatePluginResponse> getResponseClass() {
        return CreatePluginResponse.class;
    }
}
