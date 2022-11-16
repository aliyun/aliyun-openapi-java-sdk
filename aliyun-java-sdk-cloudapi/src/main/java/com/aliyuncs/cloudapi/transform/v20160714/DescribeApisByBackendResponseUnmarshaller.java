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

import com.aliyuncs.cloudapi.model.v20160714.DescribeApisByBackendResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApisByBackendResponse.ApiInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApisByBackendResponseUnmarshaller {

	public static DescribeApisByBackendResponse unmarshall(DescribeApisByBackendResponse describeApisByBackendResponse, UnmarshallerContext _ctx) {
		
		describeApisByBackendResponse.setRequestId(_ctx.stringValue("DescribeApisByBackendResponse.RequestId"));
		describeApisByBackendResponse.setPageNumber(_ctx.integerValue("DescribeApisByBackendResponse.PageNumber"));
		describeApisByBackendResponse.setPageSize(_ctx.integerValue("DescribeApisByBackendResponse.PageSize"));
		describeApisByBackendResponse.setTotalCount(_ctx.integerValue("DescribeApisByBackendResponse.TotalCount"));

		List<ApiInfo> apiInfoList = new ArrayList<ApiInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApisByBackendResponse.ApiInfoList.Length"); i++) {
			ApiInfo apiInfo = new ApiInfo();
			apiInfo.setApiId(_ctx.stringValue("DescribeApisByBackendResponse.ApiInfoList["+ i +"].ApiId"));
			apiInfo.setDescription(_ctx.stringValue("DescribeApisByBackendResponse.ApiInfoList["+ i +"].Description"));
			apiInfo.setGroupName(_ctx.stringValue("DescribeApisByBackendResponse.ApiInfoList["+ i +"].GroupName"));
			apiInfo.setGroupId(_ctx.stringValue("DescribeApisByBackendResponse.ApiInfoList["+ i +"].GroupId"));
			apiInfo.setPath(_ctx.stringValue("DescribeApisByBackendResponse.ApiInfoList["+ i +"].Path"));
			apiInfo.setBizMethod(_ctx.stringValue("DescribeApisByBackendResponse.ApiInfoList["+ i +"].Method"));
			apiInfo.setApiName(_ctx.stringValue("DescribeApisByBackendResponse.ApiInfoList["+ i +"].ApiName"));

			apiInfoList.add(apiInfo);
		}
		describeApisByBackendResponse.setApiInfoList(apiInfoList);
	 
	 	return describeApisByBackendResponse;
	}
}