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

import com.aliyuncs.sgw.model.v20180511.DescribeGatewayFileStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGatewayFileStatusResponseUnmarshaller {

	public static DescribeGatewayFileStatusResponse unmarshall(DescribeGatewayFileStatusResponse describeGatewayFileStatusResponse, UnmarshallerContext _ctx) {
		
		describeGatewayFileStatusResponse.setRequestId(_ctx.stringValue("DescribeGatewayFileStatusResponse.RequestId"));
		describeGatewayFileStatusResponse.setSuccess(_ctx.booleanValue("DescribeGatewayFileStatusResponse.Success"));
		describeGatewayFileStatusResponse.setCode(_ctx.stringValue("DescribeGatewayFileStatusResponse.Code"));
		describeGatewayFileStatusResponse.setMessage(_ctx.stringValue("DescribeGatewayFileStatusResponse.Message"));
		describeGatewayFileStatusResponse.setStatus(_ctx.stringValue("DescribeGatewayFileStatusResponse.Status"));
	 
	 	return describeGatewayFileStatusResponse;
	}
}