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

import com.aliyuncs.oos.model.v20190601.ListExecutionsResponse;
import com.aliyuncs.oos.model.v20190601.ListExecutionsResponse.Execution;
import com.aliyuncs.oos.model.v20190601.ListExecutionsResponse.Execution.CurrentTask;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListExecutionsResponseUnmarshaller {

	public static ListExecutionsResponse unmarshall(ListExecutionsResponse listExecutionsResponse, UnmarshallerContext _ctx) {
		
		listExecutionsResponse.setRequestId(_ctx.stringValue("ListExecutionsResponse.RequestId"));
		listExecutionsResponse.setNextToken(_ctx.stringValue("ListExecutionsResponse.NextToken"));
		listExecutionsResponse.setMaxResults(_ctx.integerValue("ListExecutionsResponse.MaxResults"));

		List<Execution> executions = new ArrayList<Execution>();
		for (int i = 0; i < _ctx.lengthValue("ListExecutionsResponse.Executions.Length"); i++) {
			Execution execution = new Execution();
			execution.setStatus(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].Status"));
			execution.setWaitingStatus(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].WaitingStatus"));
			execution.setTargets(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].Targets"));
			execution.setStatusReason(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].StatusReason"));
			execution.setTags(_ctx.mapValue("ListExecutionsResponse.Executions["+ i +"].Tags"));
			execution.setLastSuccessfulTriggerTime(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].LastSuccessfulTriggerTime"));
			execution.setMode(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].Mode"));
			execution.setSafetyCheck(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].SafetyCheck"));
			execution.setTemplateName(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].TemplateName"));
			execution.setTemplateVersion(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].TemplateVersion"));
			execution.setCreateDate(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].CreateDate"));
			execution.setUpdateDate(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].UpdateDate"));
			execution.setDescription(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].Description"));
			execution.setLastTriggerTime(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].LastTriggerTime"));
			execution.setParentExecutionId(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].ParentExecutionId"));
			execution.setLastTriggerStatus(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].LastTriggerStatus"));
			execution.setStatusMessage(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].StatusMessage"));
			execution.setOutputs(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].Outputs"));
			execution.setExecutedBy(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].ExecutedBy"));
			execution.setEndDate(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].EndDate"));
			execution.setIsParent(_ctx.booleanValue("ListExecutionsResponse.Executions["+ i +"].IsParent"));
			execution.setStartDate(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].StartDate"));
			execution.setExecutionId(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].ExecutionId"));
			execution.setParameters(_ctx.mapValue("ListExecutionsResponse.Executions["+ i +"].Parameters"));
			execution.setCounters(_ctx.mapValue("ListExecutionsResponse.Executions["+ i +"].Counters"));
			execution.setResourceGroupId(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].ResourceGroupId"));
			execution.setCategory(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].Category"));
			execution.setTemplateId(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].TemplateId"));
			execution.setRamRole(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].RamRole"));
			execution.setResourceStatus(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].ResourceStatus"));
			execution.setLastTriggerStatusMessage(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].LastTriggerStatusMessage"));
			execution.setLastTriggerOutputs(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].LastTriggerOutputs"));

			List<CurrentTask> currentTasks = new ArrayList<CurrentTask>();
			for (int j = 0; j < _ctx.lengthValue("ListExecutionsResponse.Executions["+ i +"].CurrentTasks.Length"); j++) {
				CurrentTask currentTask = new CurrentTask();
				currentTask.setTaskExecutionId(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].CurrentTasks["+ j +"].TaskExecutionId"));
				currentTask.setTaskName(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].CurrentTasks["+ j +"].TaskName"));
				currentTask.setTaskAction(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].CurrentTasks["+ j +"].TaskAction"));

				currentTasks.add(currentTask);
			}
			execution.setCurrentTasks(currentTasks);

			executions.add(execution);
		}
		listExecutionsResponse.setExecutions(executions);
	 
	 	return listExecutionsResponse;
	}
}