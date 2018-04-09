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

package com.aliyuncs.cms.transform.v20180308;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20180308.TaskConfigListResponse;
import com.aliyuncs.cms.model.v20180308.TaskConfigListResponse.NodeTaskConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class TaskConfigListResponseUnmarshaller {

	public static TaskConfigListResponse unmarshall(TaskConfigListResponse taskConfigListResponse, UnmarshallerContext context) {
		
		taskConfigListResponse.setRequestId(context.stringValue("TaskConfigListResponse.RequestId"));
		taskConfigListResponse.setErrorCode(context.integerValue("TaskConfigListResponse.ErrorCode"));
		taskConfigListResponse.setErrorMessage(context.stringValue("TaskConfigListResponse.ErrorMessage"));
		taskConfigListResponse.setSuccess(context.booleanValue("TaskConfigListResponse.Success"));
		taskConfigListResponse.setPageNumber(context.integerValue("TaskConfigListResponse.PageNumber"));
		taskConfigListResponse.setPageSize(context.integerValue("TaskConfigListResponse.PageSize"));
		taskConfigListResponse.setPageTotal(context.integerValue("TaskConfigListResponse.PageTotal"));
		taskConfigListResponse.setTotal(context.integerValue("TaskConfigListResponse.Total"));

		List<NodeTaskConfig> taskList = new ArrayList<NodeTaskConfig>();
		for (int i = 0; i < context.lengthValue("TaskConfigListResponse.TaskList.Length"); i++) {
			NodeTaskConfig nodeTaskConfig = new NodeTaskConfig();
			nodeTaskConfig.setId(context.longValue("TaskConfigListResponse.TaskList["+ i +"].Id"));
			nodeTaskConfig.setTaskName(context.stringValue("TaskConfigListResponse.TaskList["+ i +"].TaskName"));
			nodeTaskConfig.setTaskType(context.stringValue("TaskConfigListResponse.TaskList["+ i +"].TaskType"));
			nodeTaskConfig.setTaskScope(context.stringValue("TaskConfigListResponse.TaskList["+ i +"].TaskScope"));
			nodeTaskConfig.setDisabled(context.booleanValue("TaskConfigListResponse.TaskList["+ i +"].Disabled"));
			nodeTaskConfig.setGroupId(context.longValue("TaskConfigListResponse.TaskList["+ i +"].GroupId"));
			nodeTaskConfig.setGroupName(context.stringValue("TaskConfigListResponse.TaskList["+ i +"].GroupName"));
			nodeTaskConfig.setJsonData(context.stringValue("TaskConfigListResponse.TaskList["+ i +"].JsonData"));
			nodeTaskConfig.setAlertConfig(context.stringValue("TaskConfigListResponse.TaskList["+ i +"].AlertConfig"));

			List<String> instanceList = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("TaskConfigListResponse.TaskList["+ i +"].InstanceList.Length"); j++) {
				instanceList.add(context.stringValue("TaskConfigListResponse.TaskList["+ i +"].InstanceList["+ j +"]"));
			}
			nodeTaskConfig.setInstanceList(instanceList);

			taskList.add(nodeTaskConfig);
		}
		taskConfigListResponse.setTaskList(taskList);
	 
	 	return taskConfigListResponse;
	}
}