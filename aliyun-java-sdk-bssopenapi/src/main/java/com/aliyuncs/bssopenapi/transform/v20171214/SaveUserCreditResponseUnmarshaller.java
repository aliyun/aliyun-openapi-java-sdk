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

package com.aliyuncs.bssopenapi.transform.v20171214;

import com.aliyuncs.bssopenapi.model.v20171214.SaveUserCreditResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveUserCreditResponseUnmarshaller {

	public static SaveUserCreditResponse unmarshall(SaveUserCreditResponse saveUserCreditResponse, UnmarshallerContext _ctx) {
		
		saveUserCreditResponse.setRequestId(_ctx.stringValue("SaveUserCreditResponse.RequestId"));
		saveUserCreditResponse.setCode(_ctx.stringValue("SaveUserCreditResponse.Code"));
		saveUserCreditResponse.setSuccess(_ctx.booleanValue("SaveUserCreditResponse.Success"));
		saveUserCreditResponse.setMessage(_ctx.stringValue("SaveUserCreditResponse.Message"));
	 
	 	return saveUserCreditResponse;
	}
}