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

package com.aliyuncs.cams.transform.v20200606;

import com.aliyuncs.cams.model.v20200606.GetPhoneNumberVerificationStatusResponse;
import com.aliyuncs.cams.model.v20200606.GetPhoneNumberVerificationStatusResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPhoneNumberVerificationStatusResponseUnmarshaller {

	public static GetPhoneNumberVerificationStatusResponse unmarshall(GetPhoneNumberVerificationStatusResponse getPhoneNumberVerificationStatusResponse, UnmarshallerContext _ctx) {
		
		getPhoneNumberVerificationStatusResponse.setRequestId(_ctx.stringValue("GetPhoneNumberVerificationStatusResponse.RequestId"));
		getPhoneNumberVerificationStatusResponse.setCode(_ctx.stringValue("GetPhoneNumberVerificationStatusResponse.Code"));
		getPhoneNumberVerificationStatusResponse.setMessage(_ctx.stringValue("GetPhoneNumberVerificationStatusResponse.Message"));

		Data data = new Data();
		data.setPhoneNumber(_ctx.stringValue("GetPhoneNumberVerificationStatusResponse.Data.PhoneNumber"));
		data.setId(_ctx.stringValue("GetPhoneNumberVerificationStatusResponse.Data.Id"));
		data.setCodeVerificationStatus(_ctx.stringValue("GetPhoneNumberVerificationStatusResponse.Data.CodeVerificationStatus"));
		getPhoneNumberVerificationStatusResponse.setData(data);
	 
	 	return getPhoneNumberVerificationStatusResponse;
	}
}