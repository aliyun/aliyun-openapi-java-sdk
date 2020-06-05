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

import com.aliyuncs.sgw.model.v20180511.GenerateGatewayTokenResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GenerateGatewayTokenResponseUnmarshaller {

	public static GenerateGatewayTokenResponse unmarshall(GenerateGatewayTokenResponse generateGatewayTokenResponse, UnmarshallerContext _ctx) {
		
		generateGatewayTokenResponse.setRequestId(_ctx.stringValue("GenerateGatewayTokenResponse.RequestId"));
		generateGatewayTokenResponse.setSuccess(_ctx.booleanValue("GenerateGatewayTokenResponse.Success"));
		generateGatewayTokenResponse.setCode(_ctx.stringValue("GenerateGatewayTokenResponse.Code"));
		generateGatewayTokenResponse.setMessage(_ctx.stringValue("GenerateGatewayTokenResponse.Message"));
		generateGatewayTokenResponse.setToken(_ctx.stringValue("GenerateGatewayTokenResponse.Token"));
	 
	 	return generateGatewayTokenResponse;
	}
}