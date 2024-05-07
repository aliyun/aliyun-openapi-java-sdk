/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.cloudapi.transform.v20160714;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudapi.model.v20160714.DescribePluginApisResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribePluginApisResponse.ApiPluginSummary;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePluginApisResponseUnmarshaller {

	public static DescribePluginApisResponse unmarshall(DescribePluginApisResponse describePluginApisResponse, UnmarshallerContext _ctx) {
		
		describePluginApisResponse.setRequestId(_ctx.stringValue("DescribePluginApisResponse.RequestId"));
		describePluginApisResponse.setPageNumber(_ctx.integerValue("DescribePluginApisResponse.PageNumber"));
		describePluginApisResponse.setPageSize(_ctx.integerValue("DescribePluginApisResponse.PageSize"));
		describePluginApisResponse.setTotalCount(_ctx.integerValue("DescribePluginApisResponse.TotalCount"));

		List<ApiPluginSummary> apiSummarys = new ArrayList<ApiPluginSummary>();
		for (int i = 0; i < _ctx.lengthValue("DescribePluginApisResponse.ApiSummarys.Length"); i++) {
			ApiPluginSummary apiPluginSummary = new ApiPluginSummary();
			apiPluginSummary.setApiId(_ctx.stringValue("DescribePluginApisResponse.ApiSummarys["+ i +"].ApiId"));
			apiPluginSummary.setDescription(_ctx.stringValue("DescribePluginApisResponse.ApiSummarys["+ i +"].Description"));
			apiPluginSummary.setGroupName(_ctx.stringValue("DescribePluginApisResponse.ApiSummarys["+ i +"].GroupName"));
			apiPluginSummary.setGroupId(_ctx.stringValue("DescribePluginApisResponse.ApiSummarys["+ i +"].GroupId"));
			apiPluginSummary.setPath(_ctx.stringValue("DescribePluginApisResponse.ApiSummarys["+ i +"].Path"));
			apiPluginSummary.setBizMethod(_ctx.stringValue("DescribePluginApisResponse.ApiSummarys["+ i +"].Method"));
			apiPluginSummary.setStageName(_ctx.stringValue("DescribePluginApisResponse.ApiSummarys["+ i +"].StageName"));
			apiPluginSummary.setApiName(_ctx.stringValue("DescribePluginApisResponse.ApiSummarys["+ i +"].ApiName"));
			apiPluginSummary.setRegionId(_ctx.stringValue("DescribePluginApisResponse.ApiSummarys["+ i +"].RegionId"));
			apiPluginSummary.setStageAlias(_ctx.stringValue("DescribePluginApisResponse.ApiSummarys["+ i +"].StageAlias"));

			apiSummarys.add(apiPluginSummary);
		}
		describePluginApisResponse.setApiSummarys(apiSummarys);
	 
	 	return describePluginApisResponse;
	}
}