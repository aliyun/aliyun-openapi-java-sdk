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

package com.aliyuncs.emr.transform.v20160408;

import com.aliyuncs.emr.model.v20160408.MetastoreDescribeTaskResponse;
import com.aliyuncs.emr.model.v20160408.MetastoreDescribeTaskResponse.Task;
import com.aliyuncs.transform.UnmarshallerContext;


public class MetastoreDescribeTaskResponseUnmarshaller {

	public static MetastoreDescribeTaskResponse unmarshall(MetastoreDescribeTaskResponse metastoreDescribeTaskResponse, UnmarshallerContext context) {
		
		metastoreDescribeTaskResponse.setRequestId(context.stringValue("MetastoreDescribeTaskResponse.RequestId"));

		Task task = new Task();
		task.setBizId(context.stringValue("MetastoreDescribeTaskResponse.Task.BizId"));
		task.setDataSourceId(context.stringValue("MetastoreDescribeTaskResponse.Task.DataSourceId"));
		task.setTaskType(context.stringValue("MetastoreDescribeTaskResponse.Task.TaskType"));
		task.setTaskStatus(context.stringValue("MetastoreDescribeTaskResponse.Task.TaskStatus"));
		task.setStartTime(context.longValue("MetastoreDescribeTaskResponse.Task.StartTime"));
		task.setEndTime(context.longValue("MetastoreDescribeTaskResponse.Task.EndTime"));
		task.setTaskDetail(context.stringValue("MetastoreDescribeTaskResponse.Task.TaskDetail"));
		task.setTaskResultDetail(context.stringValue("MetastoreDescribeTaskResponse.Task.TaskResultDetail"));
		task.setTaskProcess(context.integerValue("MetastoreDescribeTaskResponse.Task.TaskProcess"));
		task.setTriggerUser(context.stringValue("MetastoreDescribeTaskResponse.Task.TriggerUser"));
		task.setTriggerType(context.stringValue("MetastoreDescribeTaskResponse.Task.TriggerType"));
		task.setGmtCreate(context.longValue("MetastoreDescribeTaskResponse.Task.GmtCreate"));
		task.setGmtModified(context.longValue("MetastoreDescribeTaskResponse.Task.GmtModified"));
		task.setExecuteTime(context.longValue("MetastoreDescribeTaskResponse.Task.ExecuteTime"));
		metastoreDescribeTaskResponse.setTask(task);
	 
	 	return metastoreDescribeTaskResponse;
	}
}