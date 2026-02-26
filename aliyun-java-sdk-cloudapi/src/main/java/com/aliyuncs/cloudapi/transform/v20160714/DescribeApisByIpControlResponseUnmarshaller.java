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

import com.aliyuncs.cloudapi.model.v20160714.DescribeApisByIpControlResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApisByIpControlResponse.ApiInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApisByIpControlResponseUnmarshaller {

	public static DescribeApisByIpControlResponse unmarshall(DescribeApisByIpControlResponse describeApisByIpControlResponse, UnmarshallerContext _ctx) {
		
		describeApisByIpControlResponse.setRequestId(_ctx.stringValue("DescribeApisByIpControlResponse.RequestId"));
		describeApisByIpControlResponse.setPageNumber(_ctx.integerValue("DescribeApisByIpControlResponse.PageNumber"));
		describeApisByIpControlResponse.setPageSize(_ctx.integerValue("DescribeApisByIpControlResponse.PageSize"));
		describeApisByIpControlResponse.setTotalCount(_ctx.integerValue("DescribeApisByIpControlResponse.TotalCount"));

		List<ApiInfo> apiInfos = new ArrayList<ApiInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApisByIpControlResponse.ApiInfos.Length"); i++) {
			ApiInfo apiInfo = new ApiInfo();
			apiInfo.setBoundTime(_ctx.stringValue("DescribeApisByIpControlResponse.ApiInfos["+ i +"].BoundTime"));
			apiInfo.setVisibility(_ctx.stringValue("DescribeApisByIpControlResponse.ApiInfos["+ i +"].Visibility"));
			apiInfo.setApiId(_ctx.stringValue("DescribeApisByIpControlResponse.ApiInfos["+ i +"].ApiId"));
			apiInfo.setDescription(_ctx.stringValue("DescribeApisByIpControlResponse.ApiInfos["+ i +"].Description"));
			apiInfo.setGroupName(_ctx.stringValue("DescribeApisByIpControlResponse.ApiInfos["+ i +"].GroupName"));
			apiInfo.setGroupId(_ctx.stringValue("DescribeApisByIpControlResponse.ApiInfos["+ i +"].GroupId"));
			apiInfo.setStageName(_ctx.stringValue("DescribeApisByIpControlResponse.ApiInfos["+ i +"].StageName"));
			apiInfo.setApiName(_ctx.stringValue("DescribeApisByIpControlResponse.ApiInfos["+ i +"].ApiName"));
			apiInfo.setRegionId(_ctx.stringValue("DescribeApisByIpControlResponse.ApiInfos["+ i +"].RegionId"));

			apiInfos.add(apiInfo);
		}
		describeApisByIpControlResponse.setApiInfos(apiInfos);
	 
	 	return describeApisByIpControlResponse;
	}
}