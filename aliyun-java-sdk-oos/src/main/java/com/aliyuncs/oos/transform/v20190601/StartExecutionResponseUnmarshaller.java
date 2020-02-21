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

package com.aliyuncs.oos.transform.v20190601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oos.model.v20190601.StartExecutionResponse;
import com.aliyuncs.oos.model.v20190601.StartExecutionResponse.Execution;
import com.aliyuncs.oos.model.v20190601.StartExecutionResponse.Execution.CurrentTask;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartExecutionResponseUnmarshaller {

	public static StartExecutionResponse unmarshall(StartExecutionResponse startExecutionResponse, UnmarshallerContext _ctx) {
		
		startExecutionResponse.setRequestId(_ctx.stringValue("StartExecutionResponse.RequestId"));

		Execution execution = new Execution();
		execution.setExecutionId(_ctx.stringValue("StartExecutionResponse.Execution.ExecutionId"));
		execution.setTemplateName(_ctx.stringValue("StartExecutionResponse.Execution.TemplateName"));
		execution.setTemplateId(_ctx.stringValue("StartExecutionResponse.Execution.TemplateId"));
		execution.setTemplateVersion(_ctx.stringValue("StartExecutionResponse.Execution.TemplateVersion"));
		execution.setMode(_ctx.stringValue("StartExecutionResponse.Execution.Mode"));
		execution.setLoopMode(_ctx.stringValue("StartExecutionResponse.Execution.LoopMode"));
		execution.setExecutedBy(_ctx.stringValue("StartExecutionResponse.Execution.ExecutedBy"));
		execution.setStartDate(_ctx.stringValue("StartExecutionResponse.Execution.StartDate"));
		execution.setEndDate(_ctx.stringValue("StartExecutionResponse.Execution.EndDate"));
		execution.setCreateDate(_ctx.stringValue("StartExecutionResponse.Execution.CreateDate"));
		execution.setUpdateDate(_ctx.stringValue("StartExecutionResponse.Execution.UpdateDate"));
		execution.setStatus(_ctx.stringValue("StartExecutionResponse.Execution.Status"));
		execution.setStatusMessage(_ctx.stringValue("StartExecutionResponse.Execution.StatusMessage"));
		execution.setParentExecutionId(_ctx.stringValue("StartExecutionResponse.Execution.ParentExecutionId"));
		execution.setParameters(_ctx.stringValue("StartExecutionResponse.Execution.Parameters"));
		execution.setOutputs(_ctx.stringValue("StartExecutionResponse.Execution.Outputs"));
		execution.setSafetyCheck(_ctx.stringValue("StartExecutionResponse.Execution.SafetyCheck"));
		execution.setIsParent(_ctx.booleanValue("StartExecutionResponse.Execution.IsParent"));
		execution.setCounters(_ctx.stringValue("StartExecutionResponse.Execution.Counters"));
		execution.setRamRole(_ctx.stringValue("StartExecutionResponse.Execution.RamRole"));
		execution.setTags(_ctx.mapValue("StartExecutionResponse.Execution.Tags"));
		execution.setDescription(_ctx.stringValue("StartExecutionResponse.Execution.Description"));

		List<CurrentTask> currentTasks = new ArrayList<CurrentTask>();
		for (int i = 0; i < _ctx.lengthValue("StartExecutionResponse.Execution.CurrentTasks.Length"); i++) {
			CurrentTask currentTask = new CurrentTask();
			currentTask.setTaskExecutionId(_ctx.stringValue("StartExecutionResponse.Execution.CurrentTasks["+ i +"].TaskExecutionId"));
			currentTask.setTaskName(_ctx.stringValue("StartExecutionResponse.Execution.CurrentTasks["+ i +"].TaskName"));
			currentTask.setTaskAction(_ctx.stringValue("StartExecutionResponse.Execution.CurrentTasks["+ i +"].TaskAction"));

			currentTasks.add(currentTask);
		}
		execution.setCurrentTasks(currentTasks);
		startExecutionResponse.setExecution(execution);
	 
	 	return startExecutionResponse;
	}
}