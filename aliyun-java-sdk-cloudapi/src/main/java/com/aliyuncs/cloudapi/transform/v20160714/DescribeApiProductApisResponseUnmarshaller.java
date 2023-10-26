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

import com.aliyuncs.cloudapi.model.v20160714.DescribeApiProductApisResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiProductApisResponse.ApiInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApiProductApisResponseUnmarshaller {

	public static DescribeApiProductApisResponse unmarshall(DescribeApiProductApisResponse describeApiProductApisResponse, UnmarshallerContext _ctx) {
		
		describeApiProductApisResponse.setRequestId(_ctx.stringValue("DescribeApiProductApisResponse.RequestId"));
		describeApiProductApisResponse.setPageNumber(_ctx.integerValue("DescribeApiProductApisResponse.PageNumber"));
		describeApiProductApisResponse.setPageSize(_ctx.integerValue("DescribeApiProductApisResponse.PageSize"));
		describeApiProductApisResponse.setTotalCount(_ctx.integerValue("DescribeApiProductApisResponse.TotalCount"));

		List<ApiInfo> apiInfoList = new ArrayList<ApiInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiProductApisResponse.ApiInfoList.Length"); i++) {
			ApiInfo apiInfo = new ApiInfo();
			apiInfo.setApiId(_ctx.stringValue("DescribeApiProductApisResponse.ApiInfoList["+ i +"].ApiId"));
			apiInfo.setDescription(_ctx.stringValue("DescribeApiProductApisResponse.ApiInfoList["+ i +"].Description"));
			apiInfo.setGroupName(_ctx.stringValue("DescribeApiProductApisResponse.ApiInfoList["+ i +"].GroupName"));
			apiInfo.setGroupId(_ctx.stringValue("DescribeApiProductApisResponse.ApiInfoList["+ i +"].GroupId"));
			apiInfo.setPath(_ctx.stringValue("DescribeApiProductApisResponse.ApiInfoList["+ i +"].Path"));
			apiInfo.setBizMethod(_ctx.stringValue("DescribeApiProductApisResponse.ApiInfoList["+ i +"].Method"));
			apiInfo.setStageName(_ctx.stringValue("DescribeApiProductApisResponse.ApiInfoList["+ i +"].StageName"));
			apiInfo.setApiName(_ctx.stringValue("DescribeApiProductApisResponse.ApiInfoList["+ i +"].ApiName"));
			apiInfo.setRegionId(_ctx.stringValue("DescribeApiProductApisResponse.ApiInfoList["+ i +"].RegionId"));

			apiInfoList.add(apiInfo);
		}
		describeApiProductApisResponse.setApiInfoList(apiInfoList);
	 
	 	return describeApiProductApisResponse;
	}
}