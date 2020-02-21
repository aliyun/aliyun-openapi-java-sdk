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
		listExecutionsResponse.setMaxResults(_ctx.integerValue("ListExecutionsResponse.MaxResults"));
		listExecutionsResponse.setNextToken(_ctx.stringValue("ListExecutionsResponse.NextToken"));

		List<Execution> executions = new ArrayList<Execution>();
		for (int i = 0; i < _ctx.lengthValue("ListExecutionsResponse.Executions.Length"); i++) {
			Execution execution = new Execution();
			execution.setExecutionId(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].ExecutionId"));
			execution.setTemplateName(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].TemplateName"));
			execution.setTemplateId(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].TemplateId"));
			execution.setTemplateVersion(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].TemplateVersion"));
			execution.setMode(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].Mode"));
			execution.setExecutedBy(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].ExecutedBy"));
			execution.setStartDate(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].StartDate"));
			execution.setEndDate(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].EndDate"));
			execution.setCreateDate(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].CreateDate"));
			execution.setUpdateDate(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].UpdateDate"));
			execution.setStatus(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].Status"));
			execution.setStatusMessage(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].StatusMessage"));
			execution.setStatusReason(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].StatusReason"));
			execution.setWaitingStatus(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].WaitingStatus"));
			execution.setParentExecutionId(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].ParentExecutionId"));
			execution.setParameters(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].Parameters"));
			execution.setOutputs(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].Outputs"));
			execution.setSafetyCheck(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].SafetyCheck"));
			execution.setIsParent(_ctx.booleanValue("ListExecutionsResponse.Executions["+ i +"].IsParent"));
			execution.setRamRole(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].RamRole"));
			execution.setCounters(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].Counters"));
			execution.setCategory(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].Category"));
			execution.setTags(_ctx.mapValue("ListExecutionsResponse.Executions["+ i +"].Tags"));
			execution.setDescription(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].Description"));

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