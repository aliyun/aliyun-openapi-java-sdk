package com.aliyuncs.cloudapi.transform.v20160714;

import com.aliyuncs.cloudapi.model.v20160714.AttachPluginResponse;
import com.aliyuncs.cloudapi.model.v20160714.CreatePluginResponse;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @Author: wuling
 * @Date: 2018/11/13 上午11:02
 */
public class AttachPluginResponseUnmarshaller {
    public static AttachPluginResponse unmarshall(AttachPluginResponse attachPluginResponse, UnmarshallerContext context) {

        attachPluginResponse.setRequestId(context.stringValue("AttachPluginResponse.RequestId"));


        return attachPluginResponse;
    }
}
