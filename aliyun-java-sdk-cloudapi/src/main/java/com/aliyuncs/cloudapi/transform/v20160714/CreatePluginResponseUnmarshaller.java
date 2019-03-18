package com.aliyuncs.cloudapi.transform.v20160714;

import com.aliyuncs.cloudapi.model.v20160714.CreatePluginResponse;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version
 */
public class CreatePluginResponseUnmarshaller {
    public static CreatePluginResponse unmarshall(CreatePluginResponse createPluginResponse, UnmarshallerContext context) {

        createPluginResponse.setRequestId(context.stringValue("CreatePluginResponse.RequestId"));
        createPluginResponse.setPluginId(context.stringValue("CreatePluginResponse.PluginId"));


        return createPluginResponse;
    }
}
