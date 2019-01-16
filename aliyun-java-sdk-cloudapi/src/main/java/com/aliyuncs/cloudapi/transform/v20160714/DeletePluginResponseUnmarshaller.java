package com.aliyuncs.cloudapi.transform.v20160714;

import com.aliyuncs.cloudapi.model.v20160714.AttachPluginResponse;
import com.aliyuncs.cloudapi.model.v20160714.DeletePluginResponse;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @Author: wuling
 * @Date: 2018/11/13 上午11:02
 */
public class DeletePluginResponseUnmarshaller {
    public static DeletePluginResponse unmarshall(DeletePluginResponse deletePluginResponse, UnmarshallerContext context) {

        deletePluginResponse.setRequestId(context.stringValue("DeletePluginResponse.RequestId"));


        return deletePluginResponse;
    }
}
