package com.aliyuncs.cloudapi.transform.v20160714;

import com.aliyuncs.cloudapi.model.v20160714.AttachPluginResponse;
import com.aliyuncs.cloudapi.model.v20160714.DeletePluginResponse;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version
 */
public class DeletePluginResponseUnmarshaller {
    public static DeletePluginResponse unmarshall(DeletePluginResponse deletePluginResponse, UnmarshallerContext context) {

        deletePluginResponse.setRequestId(context.stringValue("DeletePluginResponse.RequestId"));


        return deletePluginResponse;
    }
}
