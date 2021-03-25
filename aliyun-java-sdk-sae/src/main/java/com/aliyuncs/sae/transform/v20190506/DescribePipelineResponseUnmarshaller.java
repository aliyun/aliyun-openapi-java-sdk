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

package com.aliyuncs.sae.transform.v20190506;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sae.model.v20190506.DescribePipelineResponse;
import com.aliyuncs.sae.model.v20190506.DescribePipelineResponse.Data;
import com.aliyuncs.sae.model.v20190506.DescribePipelineResponse.Data.Stage;
import com.aliyuncs.sae.model.v20190506.DescribePipelineResponse.Data.Stage.Task;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePipelineResponseUnmarshaller {

	public static DescribePipelineResponse unmarshall(DescribePipelineResponse describePipelineResponse, UnmarshallerContext _ctx) {
		
		describePipelineResponse.setRequestId(_ctx.stringValue("DescribePipelineResponse.RequestId"));
		describePipelineResponse.setMessage(_ctx.stringValue("DescribePipelineResponse.Message"));
		describePipelineResponse.setTraceId(_ctx.stringValue("DescribePipelineResponse.TraceId"));
		describePipelineResponse.setErrorCode(_ctx.stringValue("DescribePipelineResponse.ErrorCode"));
		describePipelineResponse.setCode(_ctx.stringValue("DescribePipelineResponse.Code"));
		describePipelineResponse.setSuccess(_ctx.booleanValue("DescribePipelineResponse.Success"));

		Data data = new Data();
		data.setPipelineStatus(_ctx.integerValue("DescribePipelineResponse.Data.PipelineStatus"));
		data.setShowBatch(_ctx.booleanValue("DescribePipelineResponse.Data.ShowBatch"));
		data.setCurrentPoint(_ctx.integerValue("DescribePipelineResponse.Data.CurrentPoint"));
		data.setPipelineName(_ctx.stringValue("DescribePipelineResponse.Data.PipelineName"));
		data.setPipelineId(_ctx.stringValue("DescribePipelineResponse.Data.PipelineId"));
		data.setCurrentStageId(_ctx.stringValue("DescribePipelineResponse.Data.CurrentStageId"));
		data.setCoStatus(_ctx.stringValue("DescribePipelineResponse.Data.CoStatus"));
		data.setNextPipelineId(_ctx.stringValue("DescribePipelineResponse.Data.NextPipelineId"));

		List<Stage> stageList = new ArrayList<Stage>();
		for (int i = 0; i < _ctx.lengthValue("DescribePipelineResponse.Data.StageList.Length"); i++) {
			Stage stage = new Stage();
			stage.setStatus(_ctx.integerValue("DescribePipelineResponse.Data.StageList["+ i +"].Status"));
			stage.setStageName(_ctx.stringValue("DescribePipelineResponse.Data.StageList["+ i +"].StageName"));
			stage.setExecutorType(_ctx.integerValue("DescribePipelineResponse.Data.StageList["+ i +"].ExecutorType"));
			stage.setStageId(_ctx.stringValue("DescribePipelineResponse.Data.StageList["+ i +"].StageId"));

			List<Task> taskList = new ArrayList<Task>();
			for (int j = 0; j < _ctx.lengthValue("DescribePipelineResponse.Data.StageList["+ i +"].TaskList.Length"); j++) {
				Task task = new Task();
				task.setStatus(_ctx.integerValue("DescribePipelineResponse.Data.StageList["+ i +"].TaskList["+ j +"].Status"));
				task.setErrorIgnore(_ctx.integerValue("DescribePipelineResponse.Data.StageList["+ i +"].TaskList["+ j +"].ErrorIgnore"));
				task.setTaskId(_ctx.stringValue("DescribePipelineResponse.Data.StageList["+ i +"].TaskList["+ j +"].TaskId"));
				task.setMessage(_ctx.stringValue("DescribePipelineResponse.Data.StageList["+ i +"].TaskList["+ j +"].Message"));
				task.setShowManualIgnore(_ctx.booleanValue("DescribePipelineResponse.Data.StageList["+ i +"].TaskList["+ j +"].ShowManualIgnore"));
				task.setTaskName(_ctx.stringValue("DescribePipelineResponse.Data.StageList["+ i +"].TaskList["+ j +"].TaskName"));
				task.setStageId(_ctx.stringValue("DescribePipelineResponse.Data.StageList["+ i +"].TaskList["+ j +"].StageId"));
				task.setErrorCode(_ctx.stringValue("DescribePipelineResponse.Data.StageList["+ i +"].TaskList["+ j +"].ErrorCode"));
				task.setErrorMessage(_ctx.stringValue("DescribePipelineResponse.Data.StageList["+ i +"].TaskList["+ j +"].ErrorMessage"));

				taskList.add(task);
			}
			stage.setTaskList(taskList);

			stageList.add(stage);
		}
		data.setStageList(stageList);
		describePipelineResponse.setData(data);
	 
	 	return describePipelineResponse;
	}
}