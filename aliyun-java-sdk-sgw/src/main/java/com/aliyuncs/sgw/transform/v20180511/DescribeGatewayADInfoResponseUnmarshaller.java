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

import com.aliyuncs.sgw.model.v20180511.DescribeGatewayADInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGatewayADInfoResponseUnmarshaller {

	public static DescribeGatewayADInfoResponse unmarshall(DescribeGatewayADInfoResponse describeGatewayADInfoResponse, UnmarshallerContext _ctx) {
		
		describeGatewayADInfoResponse.setRequestId(_ctx.stringValue("DescribeGatewayADInfoResponse.RequestId"));
		describeGatewayADInfoResponse.setSuccess(_ctx.booleanValue("DescribeGatewayADInfoResponse.Success"));
		describeGatewayADInfoResponse.setCode(_ctx.stringValue("DescribeGatewayADInfoResponse.Code"));
		describeGatewayADInfoResponse.setMessage(_ctx.stringValue("DescribeGatewayADInfoResponse.Message"));
		describeGatewayADInfoResponse.setUsername(_ctx.stringValue("DescribeGatewayADInfoResponse.Username"));
		describeGatewayADInfoResponse.setServerIp(_ctx.stringValue("DescribeGatewayADInfoResponse.ServerIp"));
		describeGatewayADInfoResponse.setDomainName(_ctx.stringValue("DescribeGatewayADInfoResponse.DomainName"));
		describeGatewayADInfoResponse.setIsEnabled(_ctx.booleanValue("DescribeGatewayADInfoResponse.IsEnabled"));
	 
	 	return describeGatewayADInfoResponse;
	}
}