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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeTasksResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeTasksResponse.Task;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTasksResponseUnmarshaller {

	public static DescribeTasksResponse unmarshall(DescribeTasksResponse describeTasksResponse, UnmarshallerContext context) {
		
		describeTasksResponse.setRequestId(context.stringValue("DescribeTasksResponse.RequestId"));
		describeTasksResponse.setStartTime(context.stringValue("DescribeTasksResponse.StartTime"));
		describeTasksResponse.setEndTime(context.stringValue("DescribeTasksResponse.EndTime"));
		describeTasksResponse.setTotalRecordCount(context.integerValue("DescribeTasksResponse.TotalRecordCount"));
		describeTasksResponse.setPageNumber(context.integerValue("DescribeTasksResponse.PageNumber"));
		describeTasksResponse.setPageRecordCount(context.integerValue("DescribeTasksResponse.PageRecordCount"));

		List<Task> tasks = new ArrayList<Task>();
		for (int i = 0; i < context.lengthValue("DescribeTasksResponse.Tasks.Length"); i++) {
			Task task = new Task();
			task.setTaskId(context.stringValue("DescribeTasksResponse.Tasks["+ i +"].TaskId"));
			task.setBeginTime(context.stringValue("DescribeTasksResponse.Tasks["+ i +"].BeginTime"));
			task.setFinishTime(context.stringValue("DescribeTasksResponse.Tasks["+ i +"].FinishTime"));
			task.setExpectedFinishTime(context.stringValue("DescribeTasksResponse.Tasks["+ i +"].ExpectedFinishTime"));
			task.setTaskAction(context.stringValue("DescribeTasksResponse.Tasks["+ i +"].TaskAction"));
			task.setProgress(context.integerValue("DescribeTasksResponse.Tasks["+ i +"].Progress"));
			task.setDBName(context.stringValue("DescribeTasksResponse.Tasks["+ i +"].DBName"));
			task.setProgressInfo(context.stringValue("DescribeTasksResponse.Tasks["+ i +"].ProgressInfo"));
			task.setTaskErrorCode(context.stringValue("DescribeTasksResponse.Tasks["+ i +"].TaskErrorCode"));
			task.setTaskErrorMessage(context.stringValue("DescribeTasksResponse.Tasks["+ i +"].TaskErrorMessage"));

			tasks.add(task);
		}
		describeTasksResponse.setTasks(tasks);
	 
	 	return describeTasksResponse;
	}
}