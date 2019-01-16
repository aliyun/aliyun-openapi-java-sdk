package com.aliyuncs.cloudapi.transform.v20160714;

import com.aliyuncs.cloudapi.model.v20160714.CreatePluginResponse;
import com.aliyuncs.cloudapi.model.v20160714.ModifyPluginResponse;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @Author: wuling
 * @Date: 2018/11/13 上午11:02
 */
public class ModifyPluginResponseUnmarshaller {
    public static ModifyPluginResponse unmarshall(ModifyPluginResponse modifyPluginResponse, UnmarshallerContext context) {

        modifyPluginResponse.setRequestId(context.stringValue("ModifyPluginResponse.RequestId"));


        return modifyPluginResponse;
    }
}
