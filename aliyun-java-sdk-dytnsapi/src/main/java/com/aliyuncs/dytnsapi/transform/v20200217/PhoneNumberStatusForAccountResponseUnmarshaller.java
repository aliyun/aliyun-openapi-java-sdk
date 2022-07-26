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

import com.aliyuncs.dytnsapi.model.v20200217.PhoneNumberStatusForAccountResponse;
import com.aliyuncs.dytnsapi.model.v20200217.PhoneNumberStatusForAccountResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class PhoneNumberStatusForAccountResponseUnmarshaller {

	public static PhoneNumberStatusForAccountResponse unmarshall(PhoneNumberStatusForAccountResponse phoneNumberStatusForAccountResponse, UnmarshallerContext _ctx) {
		
		phoneNumberStatusForAccountResponse.setRequestId(_ctx.stringValue("PhoneNumberStatusForAccountResponse.RequestId"));
		phoneNumberStatusForAccountResponse.setCode(_ctx.stringValue("PhoneNumberStatusForAccountResponse.Code"));
		phoneNumberStatusForAccountResponse.setMessage(_ctx.stringValue("PhoneNumberStatusForAccountResponse.Message"));

		Data data = new Data();
		data.setStatus(_ctx.stringValue("PhoneNumberStatusForAccountResponse.Data.Status"));
		data.setCarrier(_ctx.stringValue("PhoneNumberStatusForAccountResponse.Data.Carrier"));
		phoneNumberStatusForAccountResponse.setData(data);
	 
	 	return phoneNumberStatusForAccountResponse;
	}
}