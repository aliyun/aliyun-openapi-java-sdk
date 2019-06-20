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
import com.aliyuncs.transform.UnmarshallerContext;


public class ListExecutionsResponseUnmarshaller {

	public static ListExecutionsResponse unmarshall(ListExecutionsResponse listExecutionsResponse, UnmarshallerContext context) {
		
		listExecutionsResponse.setRequestId(context.stringValue("ListExecutionsResponse.RequestId"));
		listExecutionsResponse.setMaxResults(context.integerValue("ListExecutionsResponse.MaxResults"));
		listExecutionsResponse.setNextToken(context.stringValue("ListExecutionsResponse.NextToken"));

		List<Execution> executions = new ArrayList<Execution>();
		for (int i = 0; i < context.lengthValue("ListExecutionsResponse.Executions.Length"); i++) {
			Execution execution = new Execution();
			execution.setExecutionId(context.stringValue("ListExecutionsResponse.Executions["+ i +"].ExecutionId"));
			execution.setTemplateName(context.stringValue("ListExecutionsResponse.Executions["+ i +"].TemplateName"));
			execution.setTemplateId(context.stringValue("ListExecutionsResponse.Executions["+ i +"].TemplateId"));
			execution.setTemplateVersion(context.stringValue("ListExecutionsResponse.Executions["+ i +"].TemplateVersion"));
			execution.setMode(context.stringValue("ListExecutionsResponse.Executions["+ i +"].Mode"));
			execution.setExecutedBy(context.stringValue("ListExecutionsResponse.Executions["+ i +"].ExecutedBy"));
			execution.setStartDate(context.stringValue("ListExecutionsResponse.Executions["+ i +"].StartDate"));
			execution.setEndDate(context.stringValue("ListExecutionsResponse.Executions["+ i +"].EndDate"));
			execution.setCreateDate(context.stringValue("ListExecutionsResponse.Executions["+ i +"].CreateDate"));
			execution.setUpdateDate(context.stringValue("ListExecutionsResponse.Executions["+ i +"].UpdateDate"));
			execution.setStatus(context.stringValue("ListExecutionsResponse.Executions["+ i +"].Status"));
			execution.setStatusMessage(context.stringValue("ListExecutionsResponse.Executions["+ i +"].StatusMessage"));
			execution.setParentExecutionId(context.stringValue("ListExecutionsResponse.Executions["+ i +"].ParentExecutionId"));
			execution.setParameters(context.stringValue("ListExecutionsResponse.Executions["+ i +"].Parameters"));
			execution.setOutputs(context.stringValue("ListExecutionsResponse.Executions["+ i +"].Outputs"));
			execution.setSafetyCheck(context.stringValue("ListExecutionsResponse.Executions["+ i +"].SafetyCheck"));
			execution.setRamRole(context.stringValue("ListExecutionsResponse.Executions["+ i +"].RamRole"));
			execution.setCounters(context.stringValue("ListExecutionsResponse.Executions["+ i +"].Counters"));
			execution.setIsParent(context.booleanValue("ListExecutionsResponse.Executions["+ i +"].IsParent"));

			List<CurrentTask> currentTasks = new ArrayList<CurrentTask>();
			for (int j = 0; j < context.lengthValue("ListExecutionsResponse.Executions["+ i +"].CurrentTasks.Length"); j++) {
				CurrentTask currentTask = new CurrentTask();
				currentTask.setTaskExecutionId(context.stringValue("ListExecutionsResponse.Executions["+ i +"].CurrentTasks["+ j +"].TaskExecutionId"));
				currentTask.setTaskName(context.stringValue("ListExecutionsResponse.Executions["+ i +"].CurrentTasks["+ j +"].TaskName"));
				currentTask.setTaskAction(context.stringValue("ListExecutionsResponse.Executions["+ i +"].CurrentTasks["+ j +"].TaskAction"));

				currentTasks.add(currentTask);
			}
			execution.setCurrentTasks(currentTasks);

			executions.add(execution);
		}
		listExecutionsResponse.setExecutions(executions);
	 
	 	return listExecutionsResponse;
	}
}