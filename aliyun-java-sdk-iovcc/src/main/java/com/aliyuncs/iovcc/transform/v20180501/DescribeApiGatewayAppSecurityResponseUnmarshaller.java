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

package com.aliyuncs.iovcc.transform.v20180501;

import com.aliyuncs.iovcc.model.v20180501.DescribeApiGatewayAppSecurityResponse;
import com.aliyuncs.iovcc.model.v20180501.DescribeApiGatewayAppSecurityResponse.ApiGatewayAppSecurity;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApiGatewayAppSecurityResponseUnmarshaller {

	public static DescribeApiGatewayAppSecurityResponse unmarshall(DescribeApiGatewayAppSecurityResponse describeApiGatewayAppSecurityResponse, UnmarshallerContext _ctx) {
		
		describeApiGatewayAppSecurityResponse.setRequestId(_ctx.stringValue("DescribeApiGatewayAppSecurityResponse.RequestId"));

		ApiGatewayAppSecurity apiGatewayAppSecurity = new ApiGatewayAppSecurity();
		apiGatewayAppSecurity.setGatewayAppId(_ctx.stringValue("DescribeApiGatewayAppSecurityResponse.ApiGatewayAppSecurity.GatewayAppId"));
		apiGatewayAppSecurity.setGatewayAppKey(_ctx.stringValue("DescribeApiGatewayAppSecurityResponse.ApiGatewayAppSecurity.GatewayAppKey"));
		apiGatewayAppSecurity.setGatewayAppSecret(_ctx.stringValue("DescribeApiGatewayAppSecurityResponse.ApiGatewayAppSecurity.GatewayAppSecret"));
		apiGatewayAppSecurity.setGmtCreate(_ctx.longValue("DescribeApiGatewayAppSecurityResponse.ApiGatewayAppSecurity.GmtCreate"));
		apiGatewayAppSecurity.setGmtModified(_ctx.longValue("DescribeApiGatewayAppSecurityResponse.ApiGatewayAppSecurity.GmtModified"));
		describeApiGatewayAppSecurityResponse.setApiGatewayAppSecurity(apiGatewayAppSecurity);
	 
	 	return describeApiGatewayAppSecurityResponse;
	}
}