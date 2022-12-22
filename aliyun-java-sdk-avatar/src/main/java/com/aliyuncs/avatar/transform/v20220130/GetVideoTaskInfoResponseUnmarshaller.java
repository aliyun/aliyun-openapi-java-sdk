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

package com.aliyuncs.avatar.transform.v20220130;

import com.aliyuncs.avatar.model.v20220130.GetVideoTaskInfoResponse;
import com.aliyuncs.avatar.model.v20220130.GetVideoTaskInfoResponse.Data;
import com.aliyuncs.avatar.model.v20220130.GetVideoTaskInfoResponse.Data.TaskResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVideoTaskInfoResponseUnmarshaller {

	public static GetVideoTaskInfoResponse unmarshall(GetVideoTaskInfoResponse getVideoTaskInfoResponse, UnmarshallerContext _ctx) {
		
		getVideoTaskInfoResponse.setRequestId(_ctx.stringValue("GetVideoTaskInfoResponse.RequestId"));
		getVideoTaskInfoResponse.setCode(_ctx.stringValue("GetVideoTaskInfoResponse.Code"));
		getVideoTaskInfoResponse.setMessage(_ctx.stringValue("GetVideoTaskInfoResponse.Message"));
		getVideoTaskInfoResponse.setSuccess(_ctx.booleanValue("GetVideoTaskInfoResponse.Success"));

		Data data = new Data();
		data.setTaskUuid(_ctx.stringValue("GetVideoTaskInfoResponse.Data.TaskUuid"));
		data.setType(_ctx.stringValue("GetVideoTaskInfoResponse.Data.Type"));
		data.setStatus(_ctx.stringValue("GetVideoTaskInfoResponse.Data.Status"));
		data.setProcess(_ctx.stringValue("GetVideoTaskInfoResponse.Data.Process"));

		TaskResult taskResult = new TaskResult();
		taskResult.setVideoUrl(_ctx.stringValue("GetVideoTaskInfoResponse.Data.TaskResult.VideoUrl"));
		taskResult.setSubtitlesUrl(_ctx.stringValue("GetVideoTaskInfoResponse.Data.TaskResult.SubtitlesUrl"));
		taskResult.setFailReason(_ctx.stringValue("GetVideoTaskInfoResponse.Data.TaskResult.FailReason"));
		taskResult.setFailCode(_ctx.stringValue("GetVideoTaskInfoResponse.Data.TaskResult.FailCode"));
		data.setTaskResult(taskResult);
		getVideoTaskInfoResponse.setData(data);
	 
	 	return getVideoTaskInfoResponse;
	}
}