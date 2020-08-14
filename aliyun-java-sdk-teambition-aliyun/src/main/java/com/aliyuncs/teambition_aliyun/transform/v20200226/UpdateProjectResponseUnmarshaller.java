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

package com.aliyuncs.teambition_aliyun.transform.v20200226;

import com.aliyuncs.teambition_aliyun.model.v20200226.UpdateProjectResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateProjectResponseUnmarshaller {

	public static UpdateProjectResponse unmarshall(UpdateProjectResponse updateProjectResponse, UnmarshallerContext _ctx) {
		
		updateProjectResponse.setRequestId(_ctx.stringValue("UpdateProjectResponse.RequestId"));
		updateProjectResponse.setErrorCode(_ctx.stringValue("UpdateProjectResponse.ErrorCode"));
		updateProjectResponse.setErrorMessage(_ctx.stringValue("UpdateProjectResponse.ErrorMessage"));
		updateProjectResponse.setSuccess(_ctx.booleanValue("UpdateProjectResponse.Success"));
		updateProjectResponse.setObject(_ctx.stringValue("UpdateProjectResponse.Object"));
	 
	 	return updateProjectResponse;
	}
}