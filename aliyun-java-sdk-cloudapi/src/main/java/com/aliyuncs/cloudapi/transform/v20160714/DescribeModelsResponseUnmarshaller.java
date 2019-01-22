package com.aliyuncs.cloudapi.transform.v20160714;

import com.aliyuncs.cloudapi.model.v20160714.DescribeModelsResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeModelsResponse.ModelDetail;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;

public class DescribeModelsResponseUnmarshaller {
    public static DescribeModelsResponse unmarshall(DescribeModelsResponse describeModelsResponse, UnmarshallerContext context) {

        describeModelsResponse.setRequestId(context.stringValue("DescribeModelsResponse.RequestId"));
        describeModelsResponse.setTotalCount(context.integerValue("DescribeModelsResponse.TotalCount"));
        describeModelsResponse.setPageSize(context.integerValue("DescribeModelsResponse.PageSize"));
        describeModelsResponse.setPageNumber(context.integerValue("DescribeModelsResponse.PageNumber"));

        List<ModelDetail> modelDetails = new ArrayList<ModelDetail>();
        for (int i = 0; i < context.lengthValue("DescribeModelsResponse.ModelDetails.Length"); i++) {
            ModelDetail modelDetail = new ModelDetail();
            modelDetail.setGroupId(context.stringValue("DescribeModelsResponse.ModelDetails["+ i +"].GroupId"));
            modelDetail.setModelId(context.stringValue("DescribeModelsResponse.ModelDetails["+ i +"].ModelId"));
            modelDetail.setModelName(context.stringValue("DescribeModelsResponse.ModelDetails["+ i +"].ModelName"));
            modelDetail.setSchema(context.stringValue("DescribeModelsResponse.ModelDetails["+ i +"].Schema"));
            modelDetail.setDescription(context.stringValue("DescribeModelsResponse.ModelDetails["+ i +"].Description"));
            modelDetail.setCreatedTime(context.stringValue("DescribeModelsResponse.ModelDetails["+ i +"].CreatedTime"));
            modelDetail.setModifiedTime(context.stringValue("DescribeModelsResponse.ModelDetails["+ i +"].ModifiedTime"));
            modelDetail.setModelRef(context.stringValue("DescribeModelsResponse.ModelDetails["+ i +"].ModelRef"));

            modelDetails.add(modelDetail);
        }
        describeModelsResponse.setModelDetails(modelDetails);

        return describeModelsResponse;
    }
}
