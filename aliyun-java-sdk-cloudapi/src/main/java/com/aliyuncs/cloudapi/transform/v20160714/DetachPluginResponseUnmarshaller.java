package com.aliyuncs.cloudapi.transform.v20160714;

import com.aliyuncs.cloudapi.model.v20160714.DeletePluginResponse;
import com.aliyuncs.cloudapi.model.v20160714.DetachPluginResponse;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version
 */
public class DetachPluginResponseUnmarshaller {
    public static DetachPluginResponse unmarshall(DetachPluginResponse detachPluginResponse, UnmarshallerContext context) {

        detachPluginResponse.setRequestId(context.stringValue("DetachPluginResponse.RequestId"));


        return detachPluginResponse;
    }
}
