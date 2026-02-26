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

import com.aliyuncs.cams.model.v20200606.GetPreValidatePhoneIdResponse;
import com.aliyuncs.cams.model.v20200606.GetPreValidatePhoneIdResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPreValidatePhoneIdResponseUnmarshaller {

	public static GetPreValidatePhoneIdResponse unmarshall(GetPreValidatePhoneIdResponse getPreValidatePhoneIdResponse, UnmarshallerContext _ctx) {
		
		getPreValidatePhoneIdResponse.setRequestId(_ctx.stringValue("GetPreValidatePhoneIdResponse.RequestId"));
		getPreValidatePhoneIdResponse.setCode(_ctx.stringValue("GetPreValidatePhoneIdResponse.Code"));
		getPreValidatePhoneIdResponse.setMessage(_ctx.stringValue("GetPreValidatePhoneIdResponse.Message"));

		Data data = new Data();
		data.setPhoneNumberId(_ctx.stringValue("GetPreValidatePhoneIdResponse.Data.PhoneNumberId"));
		data.setPhoneNumber(_ctx.stringValue("GetPreValidatePhoneIdResponse.Data.PhoneNumber"));
		getPreValidatePhoneIdResponse.setData(data);
	 
	 	return getPreValidatePhoneIdResponse;
	}
}