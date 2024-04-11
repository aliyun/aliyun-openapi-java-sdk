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

import com.aliyuncs.cams.model.v20200606.GetPhoneEncryptionPublicKeyResponse;
import com.aliyuncs.cams.model.v20200606.GetPhoneEncryptionPublicKeyResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPhoneEncryptionPublicKeyResponseUnmarshaller {

	public static GetPhoneEncryptionPublicKeyResponse unmarshall(GetPhoneEncryptionPublicKeyResponse getPhoneEncryptionPublicKeyResponse, UnmarshallerContext _ctx) {
		
		getPhoneEncryptionPublicKeyResponse.setRequestId(_ctx.stringValue("GetPhoneEncryptionPublicKeyResponse.RequestId"));
		getPhoneEncryptionPublicKeyResponse.setCode(_ctx.stringValue("GetPhoneEncryptionPublicKeyResponse.Code"));
		getPhoneEncryptionPublicKeyResponse.setMessage(_ctx.stringValue("GetPhoneEncryptionPublicKeyResponse.Message"));

		Data data = new Data();
		data.setPhoneNumber(_ctx.stringValue("GetPhoneEncryptionPublicKeyResponse.Data.PhoneNumber"));
		data.setEncryptionPublicKey(_ctx.stringValue("GetPhoneEncryptionPublicKeyResponse.Data.EncryptionPublicKey"));
		data.setEncryptionPublicKeyStatus(_ctx.stringValue("GetPhoneEncryptionPublicKeyResponse.Data.EncryptionPublicKeyStatus"));
		getPhoneEncryptionPublicKeyResponse.setData(data);
	 
	 	return getPhoneEncryptionPublicKeyResponse;
	}
}