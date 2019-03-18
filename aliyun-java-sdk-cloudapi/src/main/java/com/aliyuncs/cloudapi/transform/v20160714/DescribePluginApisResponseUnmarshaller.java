package com.aliyuncs.cloudapi.transform.v20160714;

import com.aliyuncs.cloudapi.model.v20160714.AttachPluginResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeIpControlsResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribePluginApisResponse;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author auto create
 * @version
 */
public class DescribePluginApisResponseUnmarshaller {
    public static DescribePluginApisResponse unmarshall(DescribePluginApisResponse describePluginApisResponse, UnmarshallerContext context) {

        describePluginApisResponse.setRequestId(context.stringValue("DescribePluginApisResponse.RequestId"));
        describePluginApisResponse.setTotalCount(context.integerValue("DescribePluginApisResponse.TotalCount"));
        describePluginApisResponse.setPageSize(context.integerValue("DescribePluginApisResponse.PageSize"));
        describePluginApisResponse.setPageNumber(context.integerValue("DescribePluginApisResponse.PageNumber"));
        List<DescribePluginApisResponse.ApiPluginSummary>
            apiSummaries = new ArrayList<DescribePluginApisResponse.ApiPluginSummary>();
        for (int i = 0; i < context.lengthValue("DescribePluginApisResponse.ApiSummarys.Length"); i++) {
            DescribePluginApisResponse.ApiPluginSummary apiSummary = new DescribePluginApisResponse.ApiPluginSummary();
            apiSummary.setRegionId(context.stringValue("DescribePluginApisResponse.ApiSummarys["+ i +"].RegionId"));
            apiSummary.setGroupId(context.stringValue("DescribePluginApisResponse.ApiSummarys["+ i +"].GroupId"));
            apiSummary.setGroupName(context.stringValue("DescribePluginApisResponse.ApiSummarys["+ i +"].GroupName"));
            apiSummary.setStageName(context.stringValue("DescribePluginApisResponse.ApiSummarys["+ i +"].StageName"));
            apiSummary.setApiId(context.stringValue("DescribePluginApisResponse.ApiSummarys["+ i +"].ApiId"));
            apiSummary.setApiName(context.stringValue("DescribePluginApisResponse.ApiSummarys["+ i +"].ApiName"));
            apiSummary.setDescription(context.stringValue("DescribePluginApisResponse.ApiSummarys["+ i +"].Description"));
            apiSummary.setPath(context.stringValue("DescribePluginApisResponse.ApiSummarys["+ i +"].Path"));
            apiSummary.setMethod(context.stringValue("DescribePluginApisResponse.ApiSummarys["+ i +"].Method"));

            apiSummaries.add(apiSummary);
        }
        describePluginApisResponse.setApiPluginSummaries(apiSummaries);

        return describePluginApisResponse;
    }
}
