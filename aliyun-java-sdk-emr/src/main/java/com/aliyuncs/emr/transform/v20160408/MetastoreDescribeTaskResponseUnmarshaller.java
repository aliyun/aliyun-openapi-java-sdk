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

	public static MetastoreDescribeTaskResponse unmarshall(MetastoreDescribeTaskResponse metastoreDescribeTaskResponse, UnmarshallerContext _ctx) {
		
		metastoreDescribeTaskResponse.setRequestId(_ctx.stringValue("MetastoreDescribeTaskResponse.RequestId"));

		Task task = new Task();
		task.setBizId(_ctx.stringValue("MetastoreDescribeTaskResponse.Task.BizId"));
		task.setDataSourceId(_ctx.stringValue("MetastoreDescribeTaskResponse.Task.DataSourceId"));
		task.setTaskType(_ctx.stringValue("MetastoreDescribeTaskResponse.Task.TaskType"));
		task.setTaskStatus(_ctx.stringValue("MetastoreDescribeTaskResponse.Task.TaskStatus"));
		task.setStartTime(_ctx.longValue("MetastoreDescribeTaskResponse.Task.StartTime"));
		task.setEndTime(_ctx.longValue("MetastoreDescribeTaskResponse.Task.EndTime"));
		task.setTaskDetail(_ctx.stringValue("MetastoreDescribeTaskResponse.Task.TaskDetail"));
		task.setTaskObject(_ctx.stringValue("MetastoreDescribeTaskResponse.Task.TaskObject"));
		task.setTaskResultDetail(_ctx.stringValue("MetastoreDescribeTaskResponse.Task.TaskResultDetail"));
		task.setTaskProcess(_ctx.integerValue("MetastoreDescribeTaskResponse.Task.TaskProcess"));
		task.setTriggerUser(_ctx.stringValue("MetastoreDescribeTaskResponse.Task.TriggerUser"));
		task.setTriggerType(_ctx.stringValue("MetastoreDescribeTaskResponse.Task.TriggerType"));
		task.setGmtCreate(_ctx.longValue("MetastoreDescribeTaskResponse.Task.GmtCreate"));
		task.setGmtModified(_ctx.longValue("MetastoreDescribeTaskResponse.Task.GmtModified"));
		task.setExecuteTime(_ctx.longValue("MetastoreDescribeTaskResponse.Task.ExecuteTime"));
		metastoreDescribeTaskResponse.setTask(task);
	 
	 	return metastoreDescribeTaskResponse;
	}
}