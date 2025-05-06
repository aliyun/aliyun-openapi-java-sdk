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

package com.aliyuncs.itag.transform.v20210517;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.itag.model.v20210517.TaskStageStatResponse;
import com.aliyuncs.itag.model.v20210517.TaskStageStatResponse.ITagTaskStageStat;
import com.aliyuncs.transform.UnmarshallerContext;


public class TaskStageStatResponseUnmarshaller {

	public static TaskStageStatResponse unmarshall(TaskStageStatResponse taskStageStatResponse, UnmarshallerContext _ctx) {
		
		taskStageStatResponse.setRequestId(_ctx.stringValue("TaskStageStatResponse.RequestId"));
		taskStageStatResponse.setCode(_ctx.stringValue("TaskStageStatResponse.Code"));
		taskStageStatResponse.setErrInfo(_ctx.stringValue("TaskStageStatResponse.ErrInfo"));
		taskStageStatResponse.setMsg(_ctx.stringValue("TaskStageStatResponse.Msg"));
		taskStageStatResponse.setSucc(_ctx.booleanValue("TaskStageStatResponse.Succ"));
		taskStageStatResponse.setErrorCode(_ctx.stringValue("TaskStageStatResponse.ErrorCode"));

		List<ITagTaskStageStat> result = new ArrayList<ITagTaskStageStat>();
		for (int i = 0; i < _ctx.lengthValue("TaskStageStatResponse.Result.Length"); i++) {
			ITagTaskStageStat iTagTaskStageStat = new ITagTaskStageStat();
			iTagTaskStageStat.setStage(_ctx.stringValue("TaskStageStatResponse.Result["+ i +"].Stage"));
			iTagTaskStageStat.setNum(_ctx.integerValue("TaskStageStatResponse.Result["+ i +"].Num"));

			result.add(iTagTaskStageStat);
		}
		taskStageStatResponse.setResult(result);
	 
	 	return taskStageStatResponse;
	}
}