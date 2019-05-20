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

import com.aliyuncs.cloudcallcenter.model.v20170705.EnablePhoneNumberResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class EnablePhoneNumberResponseUnmarshaller {

	public static EnablePhoneNumberResponse unmarshall(EnablePhoneNumberResponse enablePhoneNumberResponse, UnmarshallerContext context) {
		
		enablePhoneNumberResponse.setRequestId(context.stringValue("EnablePhoneNumberResponse.RequestId"));
		enablePhoneNumberResponse.setSuccess(context.booleanValue("EnablePhoneNumberResponse.Success"));
		enablePhoneNumberResponse.setCode(context.stringValue("EnablePhoneNumberResponse.Code"));
		enablePhoneNumberResponse.setMessage(context.stringValue("EnablePhoneNumberResponse.Message"));
		enablePhoneNumberResponse.setHttpStatusCode(context.integerValue("EnablePhoneNumberResponse.HttpStatusCode"));
	 
	 	return enablePhoneNumberResponse;
	}
}