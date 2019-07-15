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

package com.aliyuncs.aas.transform.v20150701;

import com.aliyuncs.aas.model.v20150701.CheckMfaBindResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckMfaBindResponseUnmarshaller {

	public static CheckMfaBindResponse unmarshall(CheckMfaBindResponse checkMfaBindResponse, UnmarshallerContext _ctx) {
		
		checkMfaBindResponse.setRequestId(_ctx.stringValue("CheckMfaBindResponse.RequestId"));
		checkMfaBindResponse.setIsBindMfa(_ctx.booleanValue("CheckMfaBindResponse.IsBindMfa"));
		checkMfaBindResponse.setCode(_ctx.integerValue("CheckMfaBindResponse.Code"));
		checkMfaBindResponse.setMessage(_ctx.stringValue("CheckMfaBindResponse.Message"));
		checkMfaBindResponse.setSuccess(_ctx.booleanValue("CheckMfaBindResponse.Success"));
	 
	 	return checkMfaBindResponse;
	}
}