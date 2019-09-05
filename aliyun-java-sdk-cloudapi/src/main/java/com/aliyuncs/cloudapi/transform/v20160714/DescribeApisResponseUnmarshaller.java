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

import com.aliyuncs.cloudapi.model.v20160714.DescribeApisResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApisResponse.ApiSummary;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApisResponseUnmarshaller {

	public static DescribeApisResponse unmarshall(DescribeApisResponse describeApisResponse, UnmarshallerContext _ctx) {
		
		describeApisResponse.setRequestId(_ctx.stringValue("DescribeApisResponse.RequestId"));
		describeApisResponse.setTotalCount(_ctx.integerValue("DescribeApisResponse.TotalCount"));
		describeApisResponse.setPageSize(_ctx.integerValue("DescribeApisResponse.PageSize"));
		describeApisResponse.setPageNumber(_ctx.integerValue("DescribeApisResponse.PageNumber"));

		List<ApiSummary> apiSummarys = new ArrayList<ApiSummary>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApisResponse.ApiSummarys.Length"); i++) {
			ApiSummary apiSummary = new ApiSummary();
			apiSummary.setRegionId(_ctx.stringValue("DescribeApisResponse.ApiSummarys["+ i +"].RegionId"));
			apiSummary.setGroupId(_ctx.stringValue("DescribeApisResponse.ApiSummarys["+ i +"].GroupId"));
			apiSummary.setGroupName(_ctx.stringValue("DescribeApisResponse.ApiSummarys["+ i +"].GroupName"));
			apiSummary.setApiId(_ctx.stringValue("DescribeApisResponse.ApiSummarys["+ i +"].ApiId"));
			apiSummary.setApiName(_ctx.stringValue("DescribeApisResponse.ApiSummarys["+ i +"].ApiName"));
			apiSummary.setVisibility(_ctx.stringValue("DescribeApisResponse.ApiSummarys["+ i +"].Visibility"));
			apiSummary.setDescription(_ctx.stringValue("DescribeApisResponse.ApiSummarys["+ i +"].Description"));
			apiSummary.setCreatedTime(_ctx.stringValue("DescribeApisResponse.ApiSummarys["+ i +"].CreatedTime"));
			apiSummary.setModifiedTime(_ctx.stringValue("DescribeApisResponse.ApiSummarys["+ i +"].ModifiedTime"));

			apiSummarys.add(apiSummary);
		}
		describeApisResponse.setApiSummarys(apiSummarys);
	 
	 	return describeApisResponse;
	}
}