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

import com.aliyuncs.cloudapi.model.v20160714.DescribeApisBySignatureResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApisBySignatureResponse.ApiInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApisBySignatureResponseUnmarshaller {

	public static DescribeApisBySignatureResponse unmarshall(DescribeApisBySignatureResponse describeApisBySignatureResponse, UnmarshallerContext _ctx) {
		
		describeApisBySignatureResponse.setRequestId(_ctx.stringValue("DescribeApisBySignatureResponse.RequestId"));
		describeApisBySignatureResponse.setTotalCount(_ctx.integerValue("DescribeApisBySignatureResponse.TotalCount"));
		describeApisBySignatureResponse.setPageSize(_ctx.integerValue("DescribeApisBySignatureResponse.PageSize"));
		describeApisBySignatureResponse.setPageNumber(_ctx.integerValue("DescribeApisBySignatureResponse.PageNumber"));

		List<ApiInfo> apiInfos = new ArrayList<ApiInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApisBySignatureResponse.ApiInfos.Length"); i++) {
			ApiInfo apiInfo = new ApiInfo();
			apiInfo.setRegionId(_ctx.stringValue("DescribeApisBySignatureResponse.ApiInfos["+ i +"].RegionId"));
			apiInfo.setGroupId(_ctx.stringValue("DescribeApisBySignatureResponse.ApiInfos["+ i +"].GroupId"));
			apiInfo.setGroupName(_ctx.stringValue("DescribeApisBySignatureResponse.ApiInfos["+ i +"].GroupName"));
			apiInfo.setStageName(_ctx.stringValue("DescribeApisBySignatureResponse.ApiInfos["+ i +"].StageName"));
			apiInfo.setApiId(_ctx.stringValue("DescribeApisBySignatureResponse.ApiInfos["+ i +"].ApiId"));
			apiInfo.setApiName(_ctx.stringValue("DescribeApisBySignatureResponse.ApiInfos["+ i +"].ApiName"));
			apiInfo.setDescription(_ctx.stringValue("DescribeApisBySignatureResponse.ApiInfos["+ i +"].Description"));
			apiInfo.setVisibility(_ctx.stringValue("DescribeApisBySignatureResponse.ApiInfos["+ i +"].Visibility"));
			apiInfo.setBoundTime(_ctx.stringValue("DescribeApisBySignatureResponse.ApiInfos["+ i +"].BoundTime"));

			apiInfos.add(apiInfo);
		}
		describeApisBySignatureResponse.setApiInfos(apiInfos);
	 
	 	return describeApisBySignatureResponse;
	}
}