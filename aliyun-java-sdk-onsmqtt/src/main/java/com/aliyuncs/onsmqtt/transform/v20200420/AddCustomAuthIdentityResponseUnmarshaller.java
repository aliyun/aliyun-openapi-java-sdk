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

package com.aliyuncs.onsmqtt.transform.v20200420;

import com.aliyuncs.onsmqtt.model.v20200420.AddCustomAuthIdentityResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddCustomAuthIdentityResponseUnmarshaller {

	public static AddCustomAuthIdentityResponse unmarshall(AddCustomAuthIdentityResponse addCustomAuthIdentityResponse, UnmarshallerContext _ctx) {
		
		addCustomAuthIdentityResponse.setRequestId(_ctx.stringValue("AddCustomAuthIdentityResponse.RequestId"));
		addCustomAuthIdentityResponse.setCode(_ctx.integerValue("AddCustomAuthIdentityResponse.Code"));
		addCustomAuthIdentityResponse.setSuccess(_ctx.booleanValue("AddCustomAuthIdentityResponse.Success"));
		addCustomAuthIdentityResponse.setMessage(_ctx.stringValue("AddCustomAuthIdentityResponse.Message"));
	 
	 	return addCustomAuthIdentityResponse;
	}
}