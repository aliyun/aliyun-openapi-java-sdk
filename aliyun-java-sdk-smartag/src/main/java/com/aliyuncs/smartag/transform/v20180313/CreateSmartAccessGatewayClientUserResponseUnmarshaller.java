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

package com.aliyuncs.smartag.transform.v20180313;

import com.aliyuncs.smartag.model.v20180313.CreateSmartAccessGatewayClientUserResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSmartAccessGatewayClientUserResponseUnmarshaller {

	public static CreateSmartAccessGatewayClientUserResponse unmarshall(CreateSmartAccessGatewayClientUserResponse createSmartAccessGatewayClientUserResponse, UnmarshallerContext _ctx) {
		
		createSmartAccessGatewayClientUserResponse.setRequestId(_ctx.stringValue("CreateSmartAccessGatewayClientUserResponse.RequestId"));
		createSmartAccessGatewayClientUserResponse.setUserName(_ctx.stringValue("CreateSmartAccessGatewayClientUserResponse.UserName"));
		createSmartAccessGatewayClientUserResponse.setUserMail(_ctx.stringValue("CreateSmartAccessGatewayClientUserResponse.UserMail"));
		createSmartAccessGatewayClientUserResponse.setBandwidth(_ctx.integerValue("CreateSmartAccessGatewayClientUserResponse.Bandwidth"));
		createSmartAccessGatewayClientUserResponse.setClientIp(_ctx.stringValue("CreateSmartAccessGatewayClientUserResponse.ClientIp"));
	 
	 	return createSmartAccessGatewayClientUserResponse;
	}
}