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

package com.aliyuncs.websitebuild.transform.v20250429;

import com.aliyuncs.websitebuild.model.v20250429.CreateLogoTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLogoTaskResponseUnmarshaller {

	public static CreateLogoTaskResponse unmarshall(CreateLogoTaskResponse createLogoTaskResponse, UnmarshallerContext _ctx) {
		
		createLogoTaskResponse.setRequestId(_ctx.stringValue("CreateLogoTaskResponse.RequestId"));
		createLogoTaskResponse.setErrorMsg(_ctx.stringValue("CreateLogoTaskResponse.ErrorMsg"));
		createLogoTaskResponse.setSuccess(_ctx.booleanValue("CreateLogoTaskResponse.Success"));
		createLogoTaskResponse.setErrorCode(_ctx.stringValue("CreateLogoTaskResponse.ErrorCode"));
		createLogoTaskResponse.setTaskId(_ctx.stringValue("CreateLogoTaskResponse.TaskId"));
	 
	 	return createLogoTaskResponse;
	}
}