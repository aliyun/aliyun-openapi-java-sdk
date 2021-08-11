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

package com.aliyuncs.aiccs.transform.v20191015;

import com.aliyuncs.aiccs.model.v20191015.EncryptPhoneNumResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class EncryptPhoneNumResponseUnmarshaller {

	public static EncryptPhoneNumResponse unmarshall(EncryptPhoneNumResponse encryptPhoneNumResponse, UnmarshallerContext _ctx) {
		
		encryptPhoneNumResponse.setRequestId(_ctx.stringValue("EncryptPhoneNumResponse.RequestId"));
		encryptPhoneNumResponse.setSuccess(_ctx.booleanValue("EncryptPhoneNumResponse.Success"));
		encryptPhoneNumResponse.setCode(_ctx.stringValue("EncryptPhoneNumResponse.Code"));
		encryptPhoneNumResponse.setMessage(_ctx.stringValue("EncryptPhoneNumResponse.Message"));
		encryptPhoneNumResponse.setData(_ctx.stringValue("EncryptPhoneNumResponse.Data"));
	 
	 	return encryptPhoneNumResponse;
	}
}