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

package com.aliyuncs.devops_rdc.transform.v20200303;

import com.aliyuncs.devops_rdc.model.v20200303.UpdateDevopsProjectResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateDevopsProjectResponseUnmarshaller {

	public static UpdateDevopsProjectResponse unmarshall(UpdateDevopsProjectResponse updateDevopsProjectResponse, UnmarshallerContext _ctx) {
		
		updateDevopsProjectResponse.setRequestId(_ctx.stringValue("UpdateDevopsProjectResponse.RequestId"));
		updateDevopsProjectResponse.setErrorCode(_ctx.stringValue("UpdateDevopsProjectResponse.ErrorCode"));
		updateDevopsProjectResponse.setErrorMessage(_ctx.stringValue("UpdateDevopsProjectResponse.ErrorMessage"));
		updateDevopsProjectResponse.setSuccess(_ctx.booleanValue("UpdateDevopsProjectResponse.Success"));
		updateDevopsProjectResponse.setObject(_ctx.stringValue("UpdateDevopsProjectResponse.Object"));
	 
	 	return updateDevopsProjectResponse;
	}
}