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

package com.aliyuncs.ddoscoo.transform.v20200101;

import com.aliyuncs.ddoscoo.model.v20200101.DescribeHeadersResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeHeadersResponse.CustomHeader;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHeadersResponseUnmarshaller {

	public static DescribeHeadersResponse unmarshall(DescribeHeadersResponse describeHeadersResponse, UnmarshallerContext _ctx) {
		
		describeHeadersResponse.setRequestId(_ctx.stringValue("DescribeHeadersResponse.RequestId"));

		CustomHeader customHeader = new CustomHeader();
		customHeader.setHeaders(_ctx.stringValue("DescribeHeadersResponse.CustomHeader.Headers"));
		customHeader.setDomain(_ctx.stringValue("DescribeHeadersResponse.CustomHeader.Domain"));
		describeHeadersResponse.setCustomHeader(customHeader);
	 
	 	return describeHeadersResponse;
	}
}