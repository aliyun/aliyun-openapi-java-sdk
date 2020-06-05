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

import com.aliyuncs.sgw.model.v20180511.DescribeGatewayCredentialResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGatewayCredentialResponseUnmarshaller {

	public static DescribeGatewayCredentialResponse unmarshall(DescribeGatewayCredentialResponse describeGatewayCredentialResponse, UnmarshallerContext _ctx) {
		
		describeGatewayCredentialResponse.setRequestId(_ctx.stringValue("DescribeGatewayCredentialResponse.RequestId"));
		describeGatewayCredentialResponse.setSuccess(_ctx.booleanValue("DescribeGatewayCredentialResponse.Success"));
		describeGatewayCredentialResponse.setCode(_ctx.stringValue("DescribeGatewayCredentialResponse.Code"));
		describeGatewayCredentialResponse.setMessage(_ctx.stringValue("DescribeGatewayCredentialResponse.Message"));
		describeGatewayCredentialResponse.setEcsIp(_ctx.stringValue("DescribeGatewayCredentialResponse.EcsIp"));
		describeGatewayCredentialResponse.setEcsPassword(_ctx.stringValue("DescribeGatewayCredentialResponse.EcsPassword"));
		describeGatewayCredentialResponse.setConsoleUsername(_ctx.stringValue("DescribeGatewayCredentialResponse.ConsoleUsername"));
		describeGatewayCredentialResponse.setConsolePassword(_ctx.stringValue("DescribeGatewayCredentialResponse.ConsolePassword"));
		describeGatewayCredentialResponse.setVpcId(_ctx.stringValue("DescribeGatewayCredentialResponse.VpcId"));
		describeGatewayCredentialResponse.setVSwitchId(_ctx.stringValue("DescribeGatewayCredentialResponse.VSwitchId"));
	 
	 	return describeGatewayCredentialResponse;
	}
}