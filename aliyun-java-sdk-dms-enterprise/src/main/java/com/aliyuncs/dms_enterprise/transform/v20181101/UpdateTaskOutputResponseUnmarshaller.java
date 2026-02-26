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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import com.aliyuncs.dms_enterprise.model.v20181101.UpdateTaskOutputResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateTaskOutputResponseUnmarshaller {

	public static UpdateTaskOutputResponse unmarshall(UpdateTaskOutputResponse updateTaskOutputResponse, UnmarshallerContext _ctx) {
		
		updateTaskOutputResponse.setRequestId(_ctx.stringValue("UpdateTaskOutputResponse.RequestId"));
		updateTaskOutputResponse.setErrorCode(_ctx.stringValue("UpdateTaskOutputResponse.ErrorCode"));
		updateTaskOutputResponse.setErrorMessage(_ctx.stringValue("UpdateTaskOutputResponse.ErrorMessage"));
		updateTaskOutputResponse.setSuccess(_ctx.booleanValue("UpdateTaskOutputResponse.Success"));
	 
	 	return updateTaskOutputResponse;
	}
}