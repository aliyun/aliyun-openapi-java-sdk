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

	public static ListTaskExecutionsResponse unmarshall(ListTaskExecutionsResponse listTaskExecutionsResponse, UnmarshallerContext _ctx) {
		
		listTaskExecutionsResponse.setRequestId(_ctx.stringValue("ListTaskExecutionsResponse.RequestId"));
		listTaskExecutionsResponse.setMaxResults(_ctx.integerValue("ListTaskExecutionsResponse.MaxResults"));
		listTaskExecutionsResponse.setNextToken(_ctx.stringValue("ListTaskExecutionsResponse.NextToken"));

		List<TaskExecution> taskExecutions = new ArrayList<TaskExecution>();
		for (int i = 0; i < _ctx.lengthValue("ListTaskExecutionsResponse.TaskExecutions.Length"); i++) {
			TaskExecution taskExecution = new TaskExecution();
			taskExecution.setExecutionId(_ctx.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].ExecutionId"));
			taskExecution.setTaskExecutionId(_ctx.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].TaskExecutionId"));
			taskExecution.setTemplateId(_ctx.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].TemplateId"));
			taskExecution.setStartDate(_ctx.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].StartDate"));
			taskExecution.setEndDate(_ctx.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].EndDate"));
			taskExecution.setCreateDate(_ctx.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].CreateDate"));
			taskExecution.setUpdateDate(_ctx.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].UpdateDate"));
			taskExecution.setStatus(_ctx.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].Status"));
			taskExecution.setProperties(_ctx.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].Properties"));
			taskExecution.setOutputs(_ctx.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].Outputs"));
			taskExecution.setTaskAction(_ctx.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].TaskAction"));
			taskExecution.setTaskName(_ctx.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].TaskName"));
			taskExecution.setStatusMessage(_ctx.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].StatusMessage"));
			taskExecution.setChildExecutionId(_ctx.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].ChildExecutionId"));
			taskExecution.setParentTaskExecutionId(_ctx.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].ParentTaskExecutionId"));
			taskExecution.setLoopItem(_ctx.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].LoopItem"));
			taskExecution.setLoop(_ctx.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].Loop"));
			taskExecution.setExtraData(_ctx.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].ExtraData"));
			taskExecution.setLoopBatchNumber(_ctx.integerValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].LoopBatchNumber"));

			taskExecutions.add(taskExecution);
		}
		listTaskExecutionsResponse.setTaskExecutions(taskExecutions);
	 
	 	return listTaskExecutionsResponse;
	}
}