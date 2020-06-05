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

package com.aliyuncs.sgw.transform.v20180511;

import com.aliyuncs.sgw.model.v20180511.DescribeGatewayTypesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGatewayTypesResponseUnmarshaller {

	public static DescribeGatewayTypesResponse unmarshall(DescribeGatewayTypesResponse describeGatewayTypesResponse, UnmarshallerContext _ctx) {
		
		describeGatewayTypesResponse.setRequestId(_ctx.stringValue("DescribeGatewayTypesResponse.RequestId"));
		describeGatewayTypesResponse.setSuccess(_ctx.booleanValue("DescribeGatewayTypesResponse.Success"));
		describeGatewayTypesResponse.setCode(_ctx.stringValue("DescribeGatewayTypesResponse.Code"));
		describeGatewayTypesResponse.setMessage(_ctx.stringValue("DescribeGatewayTypesResponse.Message"));
		describeGatewayTypesResponse.setTypes(_ctx.stringValue("DescribeGatewayTypesResponse.Types"));
	 
	 	return describeGatewayTypesResponse;
	}
}