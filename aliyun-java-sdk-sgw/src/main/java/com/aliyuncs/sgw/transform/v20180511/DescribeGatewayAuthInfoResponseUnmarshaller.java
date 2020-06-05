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

import com.aliyuncs.sgw.model.v20180511.DescribeGatewayAuthInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGatewayAuthInfoResponseUnmarshaller {

	public static DescribeGatewayAuthInfoResponse unmarshall(DescribeGatewayAuthInfoResponse describeGatewayAuthInfoResponse, UnmarshallerContext _ctx) {
		
		describeGatewayAuthInfoResponse.setRequestId(_ctx.stringValue("DescribeGatewayAuthInfoResponse.RequestId"));
		describeGatewayAuthInfoResponse.setSuccess(_ctx.booleanValue("DescribeGatewayAuthInfoResponse.Success"));
		describeGatewayAuthInfoResponse.setCode(_ctx.stringValue("DescribeGatewayAuthInfoResponse.Code"));
		describeGatewayAuthInfoResponse.setMessage(_ctx.stringValue("DescribeGatewayAuthInfoResponse.Message"));
		describeGatewayAuthInfoResponse.setPublicIp(_ctx.stringValue("DescribeGatewayAuthInfoResponse.PublicIp"));
		describeGatewayAuthInfoResponse.setUsername(_ctx.stringValue("DescribeGatewayAuthInfoResponse.Username"));
		describeGatewayAuthInfoResponse.setPassword(_ctx.stringValue("DescribeGatewayAuthInfoResponse.Password"));
	 
	 	return describeGatewayAuthInfoResponse;
	}
}