package com.aliyuncs.cloudapi.transform.v20160714;

import com.aliyuncs.cloudapi.model.v20160714.ModifyModelResponse;
import com.aliyuncs.transform.UnmarshallerContext;

public class ModifyModelResponseUnmarshaller {
    public static ModifyModelResponse unmarshall(ModifyModelResponse modifyModelResponse, UnmarshallerContext context) {
        modifyModelResponse.setRequestId(context.stringValue("ModifyModelResponse.RequestId"));
        return modifyModelResponse;
    }
}
