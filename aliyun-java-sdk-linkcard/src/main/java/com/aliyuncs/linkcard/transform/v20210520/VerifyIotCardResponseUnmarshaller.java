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

package com.aliyuncs.linkcard.transform.v20210520;

import com.aliyuncs.linkcard.model.v20210520.VerifyIotCardResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class VerifyIotCardResponseUnmarshaller {

	public static VerifyIotCardResponse unmarshall(VerifyIotCardResponse verifyIotCardResponse, UnmarshallerContext _ctx) {
		
		verifyIotCardResponse.setRequestId(_ctx.stringValue("VerifyIotCardResponse.RequestId"));
		verifyIotCardResponse.setSuccess(_ctx.booleanValue("VerifyIotCardResponse.Success"));
		verifyIotCardResponse.setCode(_ctx.stringValue("VerifyIotCardResponse.Code"));
		verifyIotCardResponse.setErrorMessage(_ctx.stringValue("VerifyIotCardResponse.ErrorMessage"));
		verifyIotCardResponse.setLocalizedMessage(_ctx.stringValue("VerifyIotCardResponse.LocalizedMessage"));
		verifyIotCardResponse.setData(_ctx.booleanValue("VerifyIotCardResponse.Data"));
	 
	 	return verifyIotCardResponse;
	}
}