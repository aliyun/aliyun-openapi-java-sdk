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

package com.aliyuncs.gdb.transform.v20181129;

import com.aliyuncs.gdb.model.v20181129.ResetAccountPasswordResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ResetAccountPasswordResponseUnmarshaller {

	public static ResetAccountPasswordResponse unmarshall(ResetAccountPasswordResponse resetAccountPasswordResponse, UnmarshallerContext context) {
		
		resetAccountPasswordResponse.setRequestId(context.stringValue("ResetAccountPasswordResponse.RequestId"));
		resetAccountPasswordResponse.setCode(context.stringValue("ResetAccountPasswordResponse.Code"));
		resetAccountPasswordResponse.setData(context.stringValue("ResetAccountPasswordResponse.Data"));
		resetAccountPasswordResponse.setMessage(context.stringValue("ResetAccountPasswordResponse.Message"));
		resetAccountPasswordResponse.setSuccess(context.stringValue("ResetAccountPasswordResponse.Success"));
		resetAccountPasswordResponse.setSynchro(context.stringValue("ResetAccountPasswordResponse.Synchro"));
	 
	 	return resetAccountPasswordResponse;
	}
}