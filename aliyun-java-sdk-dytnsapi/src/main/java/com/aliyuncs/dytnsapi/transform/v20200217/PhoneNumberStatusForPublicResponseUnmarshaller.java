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

import com.aliyuncs.dytnsapi.model.v20200217.PhoneNumberStatusForPublicResponse;
import com.aliyuncs.dytnsapi.model.v20200217.PhoneNumberStatusForPublicResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class PhoneNumberStatusForPublicResponseUnmarshaller {

	public static PhoneNumberStatusForPublicResponse unmarshall(PhoneNumberStatusForPublicResponse phoneNumberStatusForPublicResponse, UnmarshallerContext _ctx) {
		
		phoneNumberStatusForPublicResponse.setRequestId(_ctx.stringValue("PhoneNumberStatusForPublicResponse.RequestId"));
		phoneNumberStatusForPublicResponse.setMessage(_ctx.stringValue("PhoneNumberStatusForPublicResponse.Message"));
		phoneNumberStatusForPublicResponse.setCode(_ctx.stringValue("PhoneNumberStatusForPublicResponse.Code"));

		Data data = new Data();
		data.setStatus(_ctx.stringValue("PhoneNumberStatusForPublicResponse.Data.Status"));
		data.setCarrier(_ctx.stringValue("PhoneNumberStatusForPublicResponse.Data.Carrier"));
		phoneNumberStatusForPublicResponse.setData(data);
	 
	 	return phoneNumberStatusForPublicResponse;
	}
}