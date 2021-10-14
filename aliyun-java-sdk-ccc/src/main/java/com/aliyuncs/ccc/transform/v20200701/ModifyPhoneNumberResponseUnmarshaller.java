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

package com.aliyuncs.ccc.transform.v20200701;

import com.aliyuncs.ccc.model.v20200701.ModifyPhoneNumberResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyPhoneNumberResponseUnmarshaller {

	public static ModifyPhoneNumberResponse unmarshall(ModifyPhoneNumberResponse modifyPhoneNumberResponse, UnmarshallerContext _ctx) {
		
		modifyPhoneNumberResponse.setRequestId(_ctx.stringValue("ModifyPhoneNumberResponse.RequestId"));
		modifyPhoneNumberResponse.setCode(_ctx.stringValue("ModifyPhoneNumberResponse.Code"));
		modifyPhoneNumberResponse.setHttpStatusCode(_ctx.integerValue("ModifyPhoneNumberResponse.HttpStatusCode"));
		modifyPhoneNumberResponse.setMessage(_ctx.stringValue("ModifyPhoneNumberResponse.Message"));
	 
	 	return modifyPhoneNumberResponse;
	}
}