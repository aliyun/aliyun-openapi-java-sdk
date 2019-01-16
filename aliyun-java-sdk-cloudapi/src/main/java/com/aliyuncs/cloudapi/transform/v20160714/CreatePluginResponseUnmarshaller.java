package com.aliyuncs.cloudapi.transform.v20160714;

import com.aliyuncs.cloudapi.model.v20160714.CreatePluginResponse;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @Author: wuling
 * @Date: 2018/11/13 上午11:02
 */
public class CreatePluginResponseUnmarshaller {
    public static CreatePluginResponse unmarshall(CreatePluginResponse createPluginResponse, UnmarshallerContext context) {

        createPluginResponse.setRequestId(context.stringValue("CreatePluginResponse.RequestId"));
        createPluginResponse.setPluginId(context.stringValue("CreatePluginResponse.PluginId"));


        return createPluginResponse;
    }
}
