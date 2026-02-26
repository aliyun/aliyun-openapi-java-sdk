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

package com.aliyuncs.openitag.transform.v20220616;

import com.aliyuncs.openitag.model.v20220616.UpdateTaskWorkforceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateTaskWorkforceResponseUnmarshaller {

	public static UpdateTaskWorkforceResponse unmarshall(UpdateTaskWorkforceResponse updateTaskWorkforceResponse, UnmarshallerContext _ctx) {
		
		updateTaskWorkforceResponse.setRequestId(_ctx.stringValue("UpdateTaskWorkforceResponse.RequestId"));
		updateTaskWorkforceResponse.setCode(_ctx.integerValue("UpdateTaskWorkforceResponse.Code"));
		updateTaskWorkforceResponse.setMessage(_ctx.stringValue("UpdateTaskWorkforceResponse.Message"));
		updateTaskWorkforceResponse.setDetails(_ctx.stringValue("UpdateTaskWorkforceResponse.Details"));
		updateTaskWorkforceResponse.setSuccess(_ctx.booleanValue("UpdateTaskWorkforceResponse.Success"));
		updateTaskWorkforceResponse.setErrorCode(_ctx.stringValue("UpdateTaskWorkforceResponse.ErrorCode"));
	 
	 	return updateTaskWorkforceResponse;
	}
}