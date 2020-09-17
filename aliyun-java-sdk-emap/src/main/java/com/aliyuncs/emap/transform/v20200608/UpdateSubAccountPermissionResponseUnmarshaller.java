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

package com.aliyuncs.emap.transform.v20200608;

import com.aliyuncs.emap.model.v20200608.UpdateSubAccountPermissionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateSubAccountPermissionResponseUnmarshaller {

	public static UpdateSubAccountPermissionResponse unmarshall(UpdateSubAccountPermissionResponse updateSubAccountPermissionResponse, UnmarshallerContext _ctx) {
		
		updateSubAccountPermissionResponse.setRequestId(_ctx.stringValue("UpdateSubAccountPermissionResponse.RequestId"));
		updateSubAccountPermissionResponse.setMessage(_ctx.stringValue("UpdateSubAccountPermissionResponse.Message"));
		updateSubAccountPermissionResponse.setErrorCode(_ctx.stringValue("UpdateSubAccountPermissionResponse.ErrorCode"));
		updateSubAccountPermissionResponse.setErrorMessage(_ctx.stringValue("UpdateSubAccountPermissionResponse.ErrorMessage"));
		updateSubAccountPermissionResponse.setDynamicMessage(_ctx.stringValue("UpdateSubAccountPermissionResponse.DynamicMessage"));
		updateSubAccountPermissionResponse.setSuccess(_ctx.booleanValue("UpdateSubAccountPermissionResponse.Success"));
		updateSubAccountPermissionResponse.setDynamicCode(_ctx.stringValue("UpdateSubAccountPermissionResponse.DynamicCode"));
		updateSubAccountPermissionResponse.setCode(_ctx.stringValue("UpdateSubAccountPermissionResponse.Code"));
	 
	 	return updateSubAccountPermissionResponse;
	}
}