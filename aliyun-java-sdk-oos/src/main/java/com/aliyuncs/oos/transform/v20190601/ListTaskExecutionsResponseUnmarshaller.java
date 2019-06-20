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

import com.aliyuncs.oos.model.v20190601.ListTaskExecutionsResponse;
import com.aliyuncs.oos.model.v20190601.ListTaskExecutionsResponse.TaskExecution;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTaskExecutionsResponseUnmarshaller {

	public static ListTaskExecutionsResponse unmarshall(ListTaskExecutionsResponse listTaskExecutionsResponse, UnmarshallerContext context) {
		
		listTaskExecutionsResponse.setRequestId(context.stringValue("ListTaskExecutionsResponse.RequestId"));
		listTaskExecutionsResponse.setMaxResults(context.integerValue("ListTaskExecutionsResponse.MaxResults"));
		listTaskExecutionsResponse.setNextToken(context.stringValue("ListTaskExecutionsResponse.NextToken"));

		List<TaskExecution> taskExecutions = new ArrayList<TaskExecution>();
		for (int i = 0; i < context.lengthValue("ListTaskExecutionsResponse.TaskExecutions.Length"); i++) {
			TaskExecution taskExecution = new TaskExecution();
			taskExecution.setExecutionId(context.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].ExecutionId"));
			taskExecution.setTaskExecutionId(context.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].TaskExecutionId"));
			taskExecution.setTemplateId(context.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].TemplateId"));
			taskExecution.setStartDate(context.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].StartDate"));
			taskExecution.setEndDate(context.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].EndDate"));
			taskExecution.setCreateDate(context.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].CreateDate"));
			taskExecution.setUpdateDate(context.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].UpdateDate"));
			taskExecution.setStatus(context.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].Status"));
			taskExecution.setProperties(context.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].Properties"));
			taskExecution.setOutputs(context.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].Outputs"));
			taskExecution.setTaskAction(context.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].TaskAction"));
			taskExecution.setTaskName(context.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].TaskName"));
			taskExecution.setStatusMessage(context.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].StatusMessage"));
			taskExecution.setChildExecutionId(context.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].ChildExecutionId"));
			taskExecution.setParentTaskExecutionId(context.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].ParentTaskExecutionId"));
			taskExecution.setLoopItem(context.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].LoopItem"));
			taskExecution.setLoop(context.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].Loop"));
			taskExecution.setExtraData(context.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].ExtraData"));

			taskExecutions.add(taskExecution);
		}
		listTaskExecutionsResponse.setTaskExecutions(taskExecutions);
	 
	 	return listTaskExecutionsResponse;
	}
}