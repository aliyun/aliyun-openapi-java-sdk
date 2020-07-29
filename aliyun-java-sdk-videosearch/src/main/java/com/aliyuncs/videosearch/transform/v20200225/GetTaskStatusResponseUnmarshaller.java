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

package com.aliyuncs.videosearch.transform.v20200225;

import com.aliyuncs.videosearch.model.v20200225.GetTaskStatusResponse;
import com.aliyuncs.videosearch.model.v20200225.GetTaskStatusResponse.TaskInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTaskStatusResponseUnmarshaller {

	public static GetTaskStatusResponse unmarshall(GetTaskStatusResponse getTaskStatusResponse, UnmarshallerContext _ctx) {
		
		getTaskStatusResponse.setRequestId(_ctx.stringValue("GetTaskStatusResponse.RequestId"));
		getTaskStatusResponse.setData(_ctx.integerValue("GetTaskStatusResponse.Data"));

		TaskInfo taskInfo = new TaskInfo();
		taskInfo.setAnalysisUseTime(_ctx.longValue("GetTaskStatusResponse.TaskInfo.AnalysisUseTime"));
		taskInfo.setDuration(_ctx.floatValue("GetTaskStatusResponse.TaskInfo.Duration"));
		taskInfo.setProcessResultOss(_ctx.stringValue("GetTaskStatusResponse.TaskInfo.ProcessResultOss"));
		taskInfo.setResolution(_ctx.stringValue("GetTaskStatusResponse.TaskInfo.Resolution"));
		taskInfo.setStatus(_ctx.integerValue("GetTaskStatusResponse.TaskInfo.Status"));
		taskInfo.setSubmitTime(_ctx.longValue("GetTaskStatusResponse.TaskInfo.SubmitTime"));
		taskInfo.setFinishTime(_ctx.longValue("GetTaskStatusResponse.TaskInfo.FinishTime"));
		taskInfo.setTaskId(_ctx.longValue("GetTaskStatusResponse.TaskInfo.TaskId"));
		taskInfo.setErrorInfo(_ctx.stringValue("GetTaskStatusResponse.TaskInfo.ErrorInfo"));
		taskInfo.setStorageInfo(_ctx.integerValue("GetTaskStatusResponse.TaskInfo.StorageInfo"));
		taskInfo.setDescription(_ctx.stringValue("GetTaskStatusResponse.TaskInfo.Description"));
		taskInfo.setVideoId(_ctx.stringValue("GetTaskStatusResponse.TaskInfo.VideoId"));
		taskInfo.setVideoTags(_ctx.stringValue("GetTaskStatusResponse.TaskInfo.VideoTags"));
		taskInfo.setVideoUrl(_ctx.stringValue("GetTaskStatusResponse.TaskInfo.VideoUrl"));
		taskInfo.setQueryTags(_ctx.stringValue("GetTaskStatusResponse.TaskInfo.QueryTags"));
		getTaskStatusResponse.setTaskInfo(taskInfo);
	 
	 	return getTaskStatusResponse;
	}
}