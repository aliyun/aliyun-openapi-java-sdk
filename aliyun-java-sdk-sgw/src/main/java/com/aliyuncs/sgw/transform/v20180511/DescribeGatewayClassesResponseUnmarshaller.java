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

import com.aliyuncs.sgw.model.v20180511.DescribeGatewayClassesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGatewayClassesResponseUnmarshaller {

	public static DescribeGatewayClassesResponse unmarshall(DescribeGatewayClassesResponse describeGatewayClassesResponse, UnmarshallerContext _ctx) {
		
		describeGatewayClassesResponse.setRequestId(_ctx.stringValue("DescribeGatewayClassesResponse.RequestId"));
		describeGatewayClassesResponse.setSuccess(_ctx.booleanValue("DescribeGatewayClassesResponse.Success"));
		describeGatewayClassesResponse.setCode(_ctx.stringValue("DescribeGatewayClassesResponse.Code"));
		describeGatewayClassesResponse.setMessage(_ctx.stringValue("DescribeGatewayClassesResponse.Message"));
		describeGatewayClassesResponse.setClasses(_ctx.stringValue("DescribeGatewayClassesResponse.Classes"));
	 
	 	return describeGatewayClassesResponse;
	}
}