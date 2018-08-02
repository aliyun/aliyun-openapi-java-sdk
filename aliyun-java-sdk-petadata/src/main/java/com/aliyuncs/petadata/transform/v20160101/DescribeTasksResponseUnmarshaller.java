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

package com.aliyuncs.petadata.transform.v20160101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.petadata.model.v20160101.DescribeTasksResponse;
import com.aliyuncs.petadata.model.v20160101.DescribeTasksResponse.Task;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTasksResponseUnmarshaller {

	public static DescribeTasksResponse unmarshall(DescribeTasksResponse describeTasksResponse, UnmarshallerContext context) {
		
		describeTasksResponse.setRequestId(context.stringValue("DescribeTasksResponse.RequestId"));
		describeTasksResponse.setInstanceId(context.stringValue("DescribeTasksResponse.InstanceId"));
		describeTasksResponse.setStartTime(context.stringValue("DescribeTasksResponse.StartTime"));
		describeTasksResponse.setEndTime(context.stringValue("DescribeTasksResponse.EndTime"));
		describeTasksResponse.setTotalRecords(context.stringValue("DescribeTasksResponse.TotalRecords"));
		describeTasksResponse.setMaxRecordsPerPage(context.stringValue("DescribeTasksResponse.MaxRecordsPerPage"));
		describeTasksResponse.setPageNumbers(context.stringValue("DescribeTasksResponse.PageNumbers"));

		List<Task> tasks = new ArrayList<Task>();
		for (int i = 0; i < context.lengthValue("DescribeTasksResponse.Tasks.Length"); i++) {
			Task task = new Task();
			task.setTaskId(context.stringValue("DescribeTasksResponse.Tasks["+ i +"].TaskId"));
			task.setBeginTime(context.stringValue("DescribeTasksResponse.Tasks["+ i +"].BeginTime"));
			task.setFinishTime(context.stringValue("DescribeTasksResponse.Tasks["+ i +"].FinishTime"));
			task.setExpectedFinishTime(context.stringValue("DescribeTasksResponse.Tasks["+ i +"].ExpectedFinishTime"));
			task.setStatus(context.stringValue("DescribeTasksResponse.Tasks["+ i +"].Status"));
			task.setTaskAction(context.stringValue("DescribeTasksResponse.Tasks["+ i +"].TaskAction"));
			task.setProgress(context.stringValue("DescribeTasksResponse.Tasks["+ i +"].Progress"));
			task.setDBName(context.stringValue("DescribeTasksResponse.Tasks["+ i +"].DBName"));
			task.setProgressInfo(context.stringValue("DescribeTasksResponse.Tasks["+ i +"].ProgressInfo"));

			tasks.add(task);
		}
		describeTasksResponse.setTasks(tasks);
	 
	 	return describeTasksResponse;
	}
}