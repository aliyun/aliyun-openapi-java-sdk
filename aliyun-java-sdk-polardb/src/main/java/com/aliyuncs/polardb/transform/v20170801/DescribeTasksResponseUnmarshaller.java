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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTasksResponseUnmarshaller {

	public static DescribeTasksResponse unmarshall(DescribeTasksResponse describeTasksResponse, UnmarshallerContext _ctx) {
		
		describeTasksResponse.setRequestId(_ctx.stringValue("DescribeTasksResponse.RequestId"));
		describeTasksResponse.setTotalRecordCount(_ctx.integerValue("DescribeTasksResponse.TotalRecordCount"));
		describeTasksResponse.setPageRecordCount(_ctx.integerValue("DescribeTasksResponse.PageRecordCount"));
		describeTasksResponse.setEndTime(_ctx.stringValue("DescribeTasksResponse.EndTime"));
		describeTasksResponse.setPageNumber(_ctx.integerValue("DescribeTasksResponse.PageNumber"));
		describeTasksResponse.setStartTime(_ctx.stringValue("DescribeTasksResponse.StartTime"));
		describeTasksResponse.setDBClusterId(_ctx.stringValue("DescribeTasksResponse.DBClusterId"));

		List<Task> tasks = new ArrayList<Task>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTasksResponse.Tasks.Length"); i++) {
			Task task = new Task();
			task.setFinishTime(_ctx.stringValue("DescribeTasksResponse.Tasks["+ i +"].FinishTime"));
			task.setStepsInfo(_ctx.stringValue("DescribeTasksResponse.Tasks["+ i +"].StepsInfo"));
			task.setProgress(_ctx.integerValue("DescribeTasksResponse.Tasks["+ i +"].Progress"));
			task.setExpectedFinishTime(_ctx.stringValue("DescribeTasksResponse.Tasks["+ i +"].ExpectedFinishTime"));
			task.setBeginTime(_ctx.stringValue("DescribeTasksResponse.Tasks["+ i +"].BeginTime"));
			task.setTaskErrorCode(_ctx.stringValue("DescribeTasksResponse.Tasks["+ i +"].TaskErrorCode"));
			task.setProgressInfo(_ctx.stringValue("DescribeTasksResponse.Tasks["+ i +"].ProgressInfo"));
			task.setCurrentStepName(_ctx.stringValue("DescribeTasksResponse.Tasks["+ i +"].CurrentStepName"));
			task.setStepProgressInfo(_ctx.stringValue("DescribeTasksResponse.Tasks["+ i +"].StepProgressInfo"));
			task.setTaskErrorMessage(_ctx.stringValue("DescribeTasksResponse.Tasks["+ i +"].TaskErrorMessage"));
			task.setTaskAction(_ctx.stringValue("DescribeTasksResponse.Tasks["+ i +"].TaskAction"));
			task.setDBName(_ctx.stringValue("DescribeTasksResponse.Tasks["+ i +"].DBName"));
			task.setRemain(_ctx.integerValue("DescribeTasksResponse.Tasks["+ i +"].Remain"));
			task.setTaskId(_ctx.stringValue("DescribeTasksResponse.Tasks["+ i +"].TaskId"));

			tasks.add(task);
		}
		describeTasksResponse.setTasks(tasks);
	 
	 	return describeTasksResponse;
	}
}