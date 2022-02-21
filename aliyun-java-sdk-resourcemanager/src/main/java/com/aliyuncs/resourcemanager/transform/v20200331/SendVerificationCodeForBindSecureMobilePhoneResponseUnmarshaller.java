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

package com.aliyuncs.resourcemanager.transform.v20200331;

import com.aliyuncs.resourcemanager.model.v20200331.SendVerificationCodeForBindSecureMobilePhoneResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SendVerificationCodeForBindSecureMobilePhoneResponseUnmarshaller {

	public static SendVerificationCodeForBindSecureMobilePhoneResponse unmarshall(SendVerificationCodeForBindSecureMobilePhoneResponse sendVerificationCodeForBindSecureMobilePhoneResponse, UnmarshallerContext _ctx) {
		
		sendVerificationCodeForBindSecureMobilePhoneResponse.setRequestId(_ctx.stringValue("SendVerificationCodeForBindSecureMobilePhoneResponse.RequestId"));
		sendVerificationCodeForBindSecureMobilePhoneResponse.setExpirationDate(_ctx.stringValue("SendVerificationCodeForBindSecureMobilePhoneResponse.ExpirationDate"));
	 
	 	return sendVerificationCodeForBindSecureMobilePhoneResponse;
	}
}