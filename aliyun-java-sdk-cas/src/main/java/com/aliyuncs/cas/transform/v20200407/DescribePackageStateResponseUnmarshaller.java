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

package com.aliyuncs.cas.transform.v20200407;

import com.aliyuncs.cas.model.v20200407.DescribePackageStateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePackageStateResponseUnmarshaller {

	public static DescribePackageStateResponse unmarshall(DescribePackageStateResponse describePackageStateResponse, UnmarshallerContext _ctx) {
		
		describePackageStateResponse.setRequestId(_ctx.stringValue("DescribePackageStateResponse.RequestId"));
		describePackageStateResponse.setTotalCount(_ctx.longValue("DescribePackageStateResponse.TotalCount"));
		describePackageStateResponse.setUsedCount(_ctx.longValue("DescribePackageStateResponse.UsedCount"));
		describePackageStateResponse.setIssuedCount(_ctx.longValue("DescribePackageStateResponse.IssuedCount"));
		describePackageStateResponse.setProductCode(_ctx.stringValue("DescribePackageStateResponse.ProductCode"));
	 
	 	return describePackageStateResponse;
	}
}