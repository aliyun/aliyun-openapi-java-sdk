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

package com.aliyuncs.dyplsapi.transform.v20170525;

import com.aliyuncs.dyplsapi.model.v20170525.UpdatePhoneNumberResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdatePhoneNumberResponseUnmarshaller {

	public static UpdatePhoneNumberResponse unmarshall(UpdatePhoneNumberResponse updatePhoneNumberResponse, UnmarshallerContext _ctx) {
		
		updatePhoneNumberResponse.setRequestId(_ctx.stringValue("UpdatePhoneNumberResponse.RequestId"));
		updatePhoneNumberResponse.setCode(_ctx.stringValue("UpdatePhoneNumberResponse.Code"));
		updatePhoneNumberResponse.setMessage(_ctx.stringValue("UpdatePhoneNumberResponse.Message"));
		updatePhoneNumberResponse.setData(_ctx.stringValue("UpdatePhoneNumberResponse.Data"));
	 
	 	return updatePhoneNumberResponse;
	}
}