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
import com.aliyuncs.transform.UnmarshallerContext;


public class StartExecutionResponseUnmarshaller {

	public static StartExecutionResponse unmarshall(StartExecutionResponse startExecutionResponse, UnmarshallerContext context) {
		
		startExecutionResponse.setRequestId(context.stringValue("StartExecutionResponse.RequestId"));

		Execution execution = new Execution();
		execution.setExecutionId(context.stringValue("StartExecutionResponse.Execution.ExecutionId"));
		execution.setTemplateName(context.stringValue("StartExecutionResponse.Execution.TemplateName"));
		execution.setTemplateId(context.stringValue("StartExecutionResponse.Execution.TemplateId"));
		execution.setTemplateVersion(context.stringValue("StartExecutionResponse.Execution.TemplateVersion"));
		execution.setMode(context.stringValue("StartExecutionResponse.Execution.Mode"));
		execution.setExecutedBy(context.stringValue("StartExecutionResponse.Execution.ExecutedBy"));
		execution.setStartDate(context.stringValue("StartExecutionResponse.Execution.StartDate"));
		execution.setEndDate(context.stringValue("StartExecutionResponse.Execution.EndDate"));
		execution.setCreateDate(context.stringValue("StartExecutionResponse.Execution.CreateDate"));
		execution.setUpdateDate(context.stringValue("StartExecutionResponse.Execution.UpdateDate"));
		execution.setStatus(context.stringValue("StartExecutionResponse.Execution.Status"));
		execution.setStatusMessage(context.stringValue("StartExecutionResponse.Execution.StatusMessage"));
		execution.setParentExecutionId(context.stringValue("StartExecutionResponse.Execution.ParentExecutionId"));
		execution.setParameters(context.stringValue("StartExecutionResponse.Execution.Parameters"));
		execution.setOutputs(context.stringValue("StartExecutionResponse.Execution.Outputs"));
		execution.setSafetyCheck(context.stringValue("StartExecutionResponse.Execution.SafetyCheck"));
		execution.setCounters(context.stringValue("StartExecutionResponse.Execution.Counters"));
		execution.setRamRole(context.stringValue("StartExecutionResponse.Execution.RamRole"));

		List<CurrentTask> currentTasks = new ArrayList<CurrentTask>();
		for (int i = 0; i < context.lengthValue("StartExecutionResponse.Execution.CurrentTasks.Length"); i++) {
			CurrentTask currentTask = new CurrentTask();
			currentTask.setTaskExecutionId(context.stringValue("StartExecutionResponse.Execution.CurrentTasks["+ i +"].TaskExecutionId"));
			currentTask.setTaskName(context.stringValue("StartExecutionResponse.Execution.CurrentTasks["+ i +"].TaskName"));
			currentTask.setTaskAction(context.stringValue("StartExecutionResponse.Execution.CurrentTasks["+ i +"].TaskAction"));

			currentTasks.add(currentTask);
		}
		execution.setCurrentTasks(currentTasks);
		startExecutionResponse.setExecution(execution);
	 
	 	return startExecutionResponse;
	}
}