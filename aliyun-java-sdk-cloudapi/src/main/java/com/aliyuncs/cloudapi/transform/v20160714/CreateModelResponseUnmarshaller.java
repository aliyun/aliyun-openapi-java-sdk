package com.aliyuncs.cloudapi.transform.v20160714;

import com.aliyuncs.cloudapi.model.v20160714.CreateModelResponse;
import com.aliyuncs.transform.UnmarshallerContext;

public class CreateModelResponseUnmarshaller {
    public static CreateModelResponse unmarshall(CreateModelResponse createModelResponse, UnmarshallerContext context) {

        createModelResponse.setRequestId(context.stringValue("CreateModelResponse.RequestId"));
        createModelResponse.setModelId(context.stringValue("CreateModelResponse.ModelId"));
        createModelResponse.setModelRef(context.stringValue("CreateModelResponse.ModelRef"));
        createModelResponse.setModelName(context.stringValue("CreateModelResponse.ModelName"));
        createModelResponse.setGroupId(context.stringValue("CreateModelResponse.GroupId"));
        createModelResponse.setSchema(context.stringValue("CreateModelResponse.Schema"));
        createModelResponse.setRegionId(context.stringValue("CreateModelResponse.RegionId"));
        createModelResponse.setDescription(context.stringValue("CreateModelResponse.Description"));
        createModelResponse.setCreatedTime(context.stringValue("CreateModelResponse.CreatedTime"));
        createModelResponse.setModifiedTime(context.stringValue("CreateModelResponse.ModifiedTime"));

        return createModelResponse;
    }
}
