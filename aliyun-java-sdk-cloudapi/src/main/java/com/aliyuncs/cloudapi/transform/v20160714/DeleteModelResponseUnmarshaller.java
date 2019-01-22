package com.aliyuncs.cloudapi.transform.v20160714;

import com.aliyuncs.cloudapi.model.v20160714.DeleteModelResponse;
import com.aliyuncs.transform.UnmarshallerContext;

public class DeleteModelResponseUnmarshaller {
    public static DeleteModelResponse unmarshall(DeleteModelResponse deleteModelResponse, UnmarshallerContext context) {

        deleteModelResponse.setRequestId(context.stringValue("DeleteModelResponse.RequestId"));
        return deleteModelResponse;
    }
}
