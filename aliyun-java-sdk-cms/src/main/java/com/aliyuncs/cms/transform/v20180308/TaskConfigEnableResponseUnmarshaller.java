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

package com.aliyuncs.cms.transform.v20180308;

import com.aliyuncs.cms.model.v20180308.TaskConfigEnableResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class TaskConfigEnableResponseUnmarshaller {

	public static TaskConfigEnableResponse unmarshall(TaskConfigEnableResponse taskConfigEnableResponse, UnmarshallerContext context) {
		
		taskConfigEnableResponse.setRequestId(context.stringValue("TaskConfigEnableResponse.RequestId"));
		taskConfigEnableResponse.setErrorCode(context.integerValue("TaskConfigEnableResponse.ErrorCode"));
		taskConfigEnableResponse.setErrorMessage(context.stringValue("TaskConfigEnableResponse.ErrorMessage"));
		taskConfigEnableResponse.setSuccess(context.booleanValue("TaskConfigEnableResponse.Success"));
	 
	 	return taskConfigEnableResponse;
	}
}