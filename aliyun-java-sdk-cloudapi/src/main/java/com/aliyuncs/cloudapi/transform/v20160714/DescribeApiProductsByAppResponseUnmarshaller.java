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

import com.aliyuncs.cloudapi.model.v20160714.DescribeApiProductsByAppResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiProductsByAppResponse.ApiProductInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApiProductsByAppResponseUnmarshaller {

	public static DescribeApiProductsByAppResponse unmarshall(DescribeApiProductsByAppResponse describeApiProductsByAppResponse, UnmarshallerContext _ctx) {
		
		describeApiProductsByAppResponse.setRequestId(_ctx.stringValue("DescribeApiProductsByAppResponse.RequestId"));
		describeApiProductsByAppResponse.setPageSize(_ctx.integerValue("DescribeApiProductsByAppResponse.PageSize"));
		describeApiProductsByAppResponse.setPageNumber(_ctx.integerValue("DescribeApiProductsByAppResponse.PageNumber"));
		describeApiProductsByAppResponse.setTotalCount(_ctx.integerValue("DescribeApiProductsByAppResponse.TotalCount"));

		List<ApiProductInfo> apiProductInfoList = new ArrayList<ApiProductInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiProductsByAppResponse.ApiProductInfoList.Length"); i++) {
			ApiProductInfo apiProductInfo = new ApiProductInfo();
			apiProductInfo.setApiProductId(_ctx.stringValue("DescribeApiProductsByAppResponse.ApiProductInfoList["+ i +"].ApiProductId"));

			apiProductInfoList.add(apiProductInfo);
		}
		describeApiProductsByAppResponse.setApiProductInfoList(apiProductInfoList);
	 
	 	return describeApiProductsByAppResponse;
	}
}