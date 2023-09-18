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

package com.aliyuncs.avatar.transform.v20220130;

import com.aliyuncs.avatar.model.v20220130.ClientAuthResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ClientAuthResponseUnmarshaller {

	public static ClientAuthResponse unmarshall(ClientAuthResponse clientAuthResponse, UnmarshallerContext _ctx) {
		
		clientAuthResponse.setRequestId(_ctx.stringValue("ClientAuthResponse.RequestId"));
		clientAuthResponse.setSuccess(_ctx.booleanValue("ClientAuthResponse.Success"));
		clientAuthResponse.setCode(_ctx.stringValue("ClientAuthResponse.Code"));
		clientAuthResponse.setMessage(_ctx.stringValue("ClientAuthResponse.Message"));
	 
	 	return clientAuthResponse;
	}
}