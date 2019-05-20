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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import com.aliyuncs.cloudcallcenter.model.v20170705.DisablePhoneNumberResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DisablePhoneNumberResponseUnmarshaller {

	public static DisablePhoneNumberResponse unmarshall(DisablePhoneNumberResponse disablePhoneNumberResponse, UnmarshallerContext context) {
		
		disablePhoneNumberResponse.setRequestId(context.stringValue("DisablePhoneNumberResponse.RequestId"));
		disablePhoneNumberResponse.setSuccess(context.booleanValue("DisablePhoneNumberResponse.Success"));
		disablePhoneNumberResponse.setCode(context.stringValue("DisablePhoneNumberResponse.Code"));
		disablePhoneNumberResponse.setMessage(context.stringValue("DisablePhoneNumberResponse.Message"));
		disablePhoneNumberResponse.setHttpStatusCode(context.integerValue("DisablePhoneNumberResponse.HttpStatusCode"));
	 
	 	return disablePhoneNumberResponse;
	}
}