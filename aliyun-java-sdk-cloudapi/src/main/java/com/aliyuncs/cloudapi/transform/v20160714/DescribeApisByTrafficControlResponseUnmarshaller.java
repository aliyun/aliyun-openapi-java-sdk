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

import com.aliyuncs.cloudapi.model.v20160714.DescribeApisByTrafficControlResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApisByTrafficControlResponse.ApiInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApisByTrafficControlResponseUnmarshaller {

	public static DescribeApisByTrafficControlResponse unmarshall(DescribeApisByTrafficControlResponse describeApisByTrafficControlResponse, UnmarshallerContext _ctx) {
		
		describeApisByTrafficControlResponse.setRequestId(_ctx.stringValue("DescribeApisByTrafficControlResponse.RequestId"));
		describeApisByTrafficControlResponse.setTotalCount(_ctx.integerValue("DescribeApisByTrafficControlResponse.TotalCount"));
		describeApisByTrafficControlResponse.setPageSize(_ctx.integerValue("DescribeApisByTrafficControlResponse.PageSize"));
		describeApisByTrafficControlResponse.setPageNumber(_ctx.integerValue("DescribeApisByTrafficControlResponse.PageNumber"));

		List<ApiInfo> apiInfos = new ArrayList<ApiInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApisByTrafficControlResponse.ApiInfos.Length"); i++) {
			ApiInfo apiInfo = new ApiInfo();
			apiInfo.setRegionId(_ctx.stringValue("DescribeApisByTrafficControlResponse.ApiInfos["+ i +"].RegionId"));
			apiInfo.setGroupId(_ctx.stringValue("DescribeApisByTrafficControlResponse.ApiInfos["+ i +"].GroupId"));
			apiInfo.setGroupName(_ctx.stringValue("DescribeApisByTrafficControlResponse.ApiInfos["+ i +"].GroupName"));
			apiInfo.setStageName(_ctx.stringValue("DescribeApisByTrafficControlResponse.ApiInfos["+ i +"].StageName"));
			apiInfo.setApiId(_ctx.stringValue("DescribeApisByTrafficControlResponse.ApiInfos["+ i +"].ApiId"));
			apiInfo.setApiName(_ctx.stringValue("DescribeApisByTrafficControlResponse.ApiInfos["+ i +"].ApiName"));
			apiInfo.setDescription(_ctx.stringValue("DescribeApisByTrafficControlResponse.ApiInfos["+ i +"].Description"));
			apiInfo.setVisibility(_ctx.stringValue("DescribeApisByTrafficControlResponse.ApiInfos["+ i +"].Visibility"));
			apiInfo.setBoundTime(_ctx.stringValue("DescribeApisByTrafficControlResponse.ApiInfos["+ i +"].BoundTime"));

			apiInfos.add(apiInfo);
		}
		describeApisByTrafficControlResponse.setApiInfos(apiInfos);
	 
	 	return describeApisByTrafficControlResponse;
	}
}