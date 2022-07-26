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

package com.aliyuncs.dytnsapi.transform.v20200217;

import com.aliyuncs.dytnsapi.model.v20200217.PhoneNumberStatusForSmsResponse;
import com.aliyuncs.dytnsapi.model.v20200217.PhoneNumberStatusForSmsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class PhoneNumberStatusForSmsResponseUnmarshaller {

	public static PhoneNumberStatusForSmsResponse unmarshall(PhoneNumberStatusForSmsResponse phoneNumberStatusForSmsResponse, UnmarshallerContext _ctx) {
		
		phoneNumberStatusForSmsResponse.setRequestId(_ctx.stringValue("PhoneNumberStatusForSmsResponse.RequestId"));
		phoneNumberStatusForSmsResponse.setCode(_ctx.stringValue("PhoneNumberStatusForSmsResponse.Code"));
		phoneNumberStatusForSmsResponse.setMessage(_ctx.stringValue("PhoneNumberStatusForSmsResponse.Message"));

		Data data = new Data();
		data.setStatus(_ctx.stringValue("PhoneNumberStatusForSmsResponse.Data.Status"));
		data.setCarrier(_ctx.stringValue("PhoneNumberStatusForSmsResponse.Data.Carrier"));
		phoneNumberStatusForSmsResponse.setData(data);
	 
	 	return phoneNumberStatusForSmsResponse;
	}
}