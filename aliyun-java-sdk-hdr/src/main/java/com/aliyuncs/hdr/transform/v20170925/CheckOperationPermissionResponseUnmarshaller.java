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

package com.aliyuncs.hdr.transform.v20170925;

import com.aliyuncs.hdr.model.v20170925.CheckOperationPermissionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckOperationPermissionResponseUnmarshaller {

	public static CheckOperationPermissionResponse unmarshall(CheckOperationPermissionResponse checkOperationPermissionResponse, UnmarshallerContext _ctx) {
		
		checkOperationPermissionResponse.setRequestId(_ctx.stringValue("CheckOperationPermissionResponse.RequestId"));
		checkOperationPermissionResponse.setSuccess(_ctx.booleanValue("CheckOperationPermissionResponse.Success"));
		checkOperationPermissionResponse.setCode(_ctx.stringValue("CheckOperationPermissionResponse.Code"));
		checkOperationPermissionResponse.setMessage(_ctx.stringValue("CheckOperationPermissionResponse.Message"));
		checkOperationPermissionResponse.setResult(_ctx.booleanValue("CheckOperationPermissionResponse.Result"));
	 
	 	return checkOperationPermissionResponse;
	}
}