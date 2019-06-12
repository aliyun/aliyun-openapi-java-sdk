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

package com.aliyuncs.imm.transform.v20170906;

import com.aliyuncs.imm.model.v20170906.GetVideoTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVideoTaskResponseUnmarshaller {

	public static GetVideoTaskResponse unmarshall(GetVideoTaskResponse getVideoTaskResponse, UnmarshallerContext context) {
		
		getVideoTaskResponse.setRequestId(context.stringValue("GetVideoTaskResponse.RequestId"));
		getVideoTaskResponse.setTaskId(context.stringValue("GetVideoTaskResponse.TaskId"));
		getVideoTaskResponse.setTaskType(context.stringValue("GetVideoTaskResponse.TaskType"));
		getVideoTaskResponse.setParameters(context.stringValue("GetVideoTaskResponse.Parameters"));
		getVideoTaskResponse.setResult(context.stringValue("GetVideoTaskResponse.Result"));
		getVideoTaskResponse.setStatus(context.stringValue("GetVideoTaskResponse.Status"));
		getVideoTaskResponse.setStartTime(context.stringValue("GetVideoTaskResponse.StartTime"));
		getVideoTaskResponse.setEndTime(context.stringValue("GetVideoTaskResponse.EndTime"));
		getVideoTaskResponse.setErrorMessage(context.stringValue("GetVideoTaskResponse.ErrorMessage"));
		getVideoTaskResponse.setNotifyEndpoint(context.stringValue("GetVideoTaskResponse.NotifyEndpoint"));
		getVideoTaskResponse.setNotifyTopicName(context.stringValue("GetVideoTaskResponse.NotifyTopicName"));
		getVideoTaskResponse.setProgress(context.integerValue("GetVideoTaskResponse.Progress"));
	 
	 	return getVideoTaskResponse;
	}
}