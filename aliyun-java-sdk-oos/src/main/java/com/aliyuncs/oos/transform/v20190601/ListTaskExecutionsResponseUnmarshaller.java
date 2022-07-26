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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTaskExecutionsResponseUnmarshaller {

	public static ListTaskExecutionsResponse unmarshall(ListTaskExecutionsResponse listTaskExecutionsResponse, UnmarshallerContext _ctx) {
		
		listTaskExecutionsResponse.setRequestId(_ctx.stringValue("ListTaskExecutionsResponse.RequestId"));
		listTaskExecutionsResponse.setNextToken(_ctx.stringValue("ListTaskExecutionsResponse.NextToken"));
		listTaskExecutionsResponse.setMaxResults(_ctx.integerValue("ListTaskExecutionsResponse.MaxResults"));

		List<TaskExecution> taskExecutions = new ArrayList<TaskExecution>();
		for (int i = 0; i < _ctx.lengthValue("ListTaskExecutionsResponse.TaskExecutions.Length"); i++) {
			TaskExecution taskExecution = new TaskExecution();
			taskExecution.setChildExecutionId(_ctx.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].ChildExecutionId"));
			taskExecution.setOutputs(_ctx.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].Outputs"));
			taskExecution.setStatus(_ctx.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].Status"));
			taskExecution.setEndDate(_ctx.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].EndDate"));
			taskExecution.setParentTaskExecutionId(_ctx.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].ParentTaskExecutionId"));
			taskExecution.setTaskName(_ctx.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].TaskName"));
			taskExecution.setStartDate(_ctx.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].StartDate"));
			taskExecution.setLoopItem(_ctx.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].LoopItem"));
			taskExecution.setCreateDate(_ctx.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].CreateDate"));
			taskExecution.setExecutionId(_ctx.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].ExecutionId"));
			taskExecution.setTaskAction(_ctx.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].TaskAction"));
			taskExecution.setTaskExecutionId(_ctx.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].TaskExecutionId"));
			taskExecution.setUpdateDate(_ctx.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].UpdateDate"));
			taskExecution.setLoop(_ctx.mapValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].Loop"));
			taskExecution.setTemplateId(_ctx.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].TemplateId"));
			taskExecution.setLoopBatchNumber(_ctx.integerValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].LoopBatchNumber"));
			taskExecution.setStatusMessage(_ctx.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].StatusMessage"));
			taskExecution.setExtraData(_ctx.mapValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].ExtraData"));
			taskExecution.setProperties(_ctx.stringValue("ListTaskExecutionsResponse.TaskExecutions["+ i +"].Properties"));

			taskExecutions.add(taskExecution);
		}
		listTaskExecutionsResponse.setTaskExecutions(taskExecutions);
	 
	 	return listTaskExecutionsResponse;
	}
}