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

package com.aliyuncs.openitag.transform.v20220616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.openitag.model.v20220616.ListTasksResponse;
import com.aliyuncs.openitag.model.v20220616.ListTasksResponse.TasksItem;
import com.aliyuncs.openitag.model.v20220616.ListTasksResponse.TasksItem.Creator;
import com.aliyuncs.openitag.model.v20220616.ListTasksResponse.TasksItem.Modifier;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTasksResponseUnmarshaller {

	public static ListTasksResponse unmarshall(ListTasksResponse listTasksResponse, UnmarshallerContext _ctx) {
		
		listTasksResponse.setRequestId(_ctx.stringValue("ListTasksResponse.RequestId"));
		listTasksResponse.setCode(_ctx.integerValue("ListTasksResponse.Code"));
		listTasksResponse.setMessage(_ctx.stringValue("ListTasksResponse.Message"));
		listTasksResponse.setDetails(_ctx.stringValue("ListTasksResponse.Details"));
		listTasksResponse.setSuccess(_ctx.booleanValue("ListTasksResponse.Success"));
		listTasksResponse.setPageNumber(_ctx.integerValue("ListTasksResponse.PageNumber"));
		listTasksResponse.setPageSize(_ctx.integerValue("ListTasksResponse.PageSize"));
		listTasksResponse.setTotalPage(_ctx.integerValue("ListTasksResponse.TotalPage"));
		listTasksResponse.setTotalCount(_ctx.integerValue("ListTasksResponse.TotalCount"));
		listTasksResponse.setErrorCode(_ctx.stringValue("ListTasksResponse.ErrorCode"));

		List<TasksItem> tasks = new ArrayList<TasksItem>();
		for (int i = 0; i < _ctx.lengthValue("ListTasksResponse.Tasks.Length"); i++) {
			TasksItem tasksItem = new TasksItem();
			tasksItem.setGmtCreateTime(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].GmtCreateTime"));
			tasksItem.setGmtModifiedTime(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].GmtModifiedTime"));
			tasksItem.setTaskName(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].TaskName"));
			tasksItem.setTaskId(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].TaskId"));
			tasksItem.setTemplateId(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].TemplateId"));
			tasksItem.setTaskType(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].TaskType"));
			tasksItem.setTenantId(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].TenantId"));
			tasksItem.setRemark(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].Remark"));
			tasksItem.setLabelStyle(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].LabelStyle"));
			tasksItem.setArchived(_ctx.booleanValue("ListTasksResponse.Tasks["+ i +"].Archived"));
			tasksItem.setStage(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].Stage"));
			tasksItem.setArchivedInfos(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].ArchivedInfos"));
			tasksItem.setStatus(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].Status"));
			tasksItem.setRefTaskId(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].RefTaskId"));
			tasksItem.setUUID(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].UUID"));

			List<String> workflowNodes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListTasksResponse.Tasks["+ i +"].WorkflowNodes.Length"); j++) {
				workflowNodes.add(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].WorkflowNodes["+ j +"]"));
			}
			tasksItem.setWorkflowNodes(workflowNodes);

			List<String> tags = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListTasksResponse.Tasks["+ i +"].Tags.Length"); j++) {
				tags.add(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].Tags["+ j +"]"));
			}
			tasksItem.setTags(tags);

			Creator creator = new Creator();
			creator.setUserId(_ctx.longValue("ListTasksResponse.Tasks["+ i +"].Creator.UserId"));
			creator.setAccountType(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].Creator.AccountType"));
			creator.setAccountNo(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].Creator.AccountNo"));
			creator.setUserName(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].Creator.UserName"));
			creator.setRole(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].Creator.Role"));
			tasksItem.setCreator(creator);

			Modifier modifier = new Modifier();
			modifier.setUserId(_ctx.longValue("ListTasksResponse.Tasks["+ i +"].Modifier.UserId"));
			modifier.setAccountType(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].Modifier.AccountType"));
			modifier.setAccountNo(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].Modifier.AccountNo"));
			modifier.setUserName(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].Modifier.UserName"));
			modifier.setRole(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].Modifier.Role"));
			tasksItem.setModifier(modifier);

			tasks.add(tasksItem);
		}
		listTasksResponse.setTasks(tasks);
	 
	 	return listTasksResponse;
	}
}