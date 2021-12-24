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

import com.aliyuncs.sgw.model.v20180511.DescribeGatewayLDAPInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGatewayLDAPInfoResponseUnmarshaller {

	public static DescribeGatewayLDAPInfoResponse unmarshall(DescribeGatewayLDAPInfoResponse describeGatewayLDAPInfoResponse, UnmarshallerContext _ctx) {
		
		describeGatewayLDAPInfoResponse.setRequestId(_ctx.stringValue("DescribeGatewayLDAPInfoResponse.RequestId"));
		describeGatewayLDAPInfoResponse.setRootDN(_ctx.stringValue("DescribeGatewayLDAPInfoResponse.RootDN"));
		describeGatewayLDAPInfoResponse.setMessage(_ctx.stringValue("DescribeGatewayLDAPInfoResponse.Message"));
		describeGatewayLDAPInfoResponse.setIsEnabled(_ctx.booleanValue("DescribeGatewayLDAPInfoResponse.IsEnabled"));
		describeGatewayLDAPInfoResponse.setBaseDN(_ctx.stringValue("DescribeGatewayLDAPInfoResponse.BaseDN"));
		describeGatewayLDAPInfoResponse.setServerIp(_ctx.stringValue("DescribeGatewayLDAPInfoResponse.ServerIp"));
		describeGatewayLDAPInfoResponse.setIsTls(_ctx.booleanValue("DescribeGatewayLDAPInfoResponse.IsTls"));
		describeGatewayLDAPInfoResponse.setCode(_ctx.stringValue("DescribeGatewayLDAPInfoResponse.Code"));
		describeGatewayLDAPInfoResponse.setSuccess(_ctx.booleanValue("DescribeGatewayLDAPInfoResponse.Success"));
	 
	 	return describeGatewayLDAPInfoResponse;
	}
}