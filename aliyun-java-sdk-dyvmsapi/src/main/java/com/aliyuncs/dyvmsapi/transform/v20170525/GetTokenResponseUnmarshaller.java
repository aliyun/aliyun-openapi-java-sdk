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

package com.aliyuncs.dyvmsapi.transform.v20170525;

import com.aliyuncs.dyvmsapi.model.v20170525.GetTokenResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTokenResponseUnmarshaller {

	public static GetTokenResponse unmarshall(GetTokenResponse getTokenResponse, UnmarshallerContext _ctx) {
		
		getTokenResponse.setRequestId(_ctx.stringValue("GetTokenResponse.RequestId"));
		getTokenResponse.setCode(_ctx.stringValue("GetTokenResponse.Code"));
		getTokenResponse.setMessage(_ctx.stringValue("GetTokenResponse.Message"));
		getTokenResponse.setSuccess(_ctx.booleanValue("GetTokenResponse.Success"));
		getTokenResponse.setToken(_ctx.stringValue("GetTokenResponse.Token"));
	 
	 	return getTokenResponse;
	}
}