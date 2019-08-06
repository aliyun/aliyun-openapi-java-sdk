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

package com.aliyuncs.drds.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20190123.DescribeDrdsDbTasksResponse;
import com.aliyuncs.drds.model.v20190123.DescribeDrdsDbTasksResponse.Task;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDrdsDbTasksResponseUnmarshaller {

	public static DescribeDrdsDbTasksResponse unmarshall(DescribeDrdsDbTasksResponse describeDrdsDbTasksResponse, UnmarshallerContext _ctx) {
		
		describeDrdsDbTasksResponse.setRequestId(_ctx.stringValue("DescribeDrdsDbTasksResponse.RequestId"));
		describeDrdsDbTasksResponse.setSuccess(_ctx.booleanValue("DescribeDrdsDbTasksResponse.Success"));

		List<Task> tasks = new ArrayList<Task>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDrdsDbTasksResponse.Tasks.Length"); i++) {
			Task task = new Task();
			task.setTaskName(_ctx.stringValue("DescribeDrdsDbTasksResponse.Tasks["+ i +"].TaskName"));
			task.setGmtCreate(_ctx.longValue("DescribeDrdsDbTasksResponse.Tasks["+ i +"].GmtCreate"));
			task.setTaskDetail(_ctx.stringValue("DescribeDrdsDbTasksResponse.Tasks["+ i +"].TaskDetail"));
			task.setTaskType(_ctx.integerValue("DescribeDrdsDbTasksResponse.Tasks["+ i +"].TaskType"));
			task.setTaskStatus(_ctx.integerValue("DescribeDrdsDbTasksResponse.Tasks["+ i +"].TaskStatus"));
			task.setProgress(_ctx.integerValue("DescribeDrdsDbTasksResponse.Tasks["+ i +"].Progress"));
			task.setTaskPhase(_ctx.stringValue("DescribeDrdsDbTasksResponse.Tasks["+ i +"].TaskPhase"));
			task.setShowProgress(_ctx.booleanValue("DescribeDrdsDbTasksResponse.Tasks["+ i +"].ShowProgress"));
			task.setAllowCancel(_ctx.booleanValue("DescribeDrdsDbTasksResponse.Tasks["+ i +"].AllowCancel"));
			task.setParentJobId(_ctx.stringValue("DescribeDrdsDbTasksResponse.Tasks["+ i +"].ParentJobId"));
			task.setExpandType(_ctx.stringValue("DescribeDrdsDbTasksResponse.Tasks["+ i +"].ExpandType"));
			task.setTargetId(_ctx.longValue("DescribeDrdsDbTasksResponse.Tasks["+ i +"].TargetId"));
			task.setLabel(_ctx.stringValue("DescribeDrdsDbTasksResponse.Tasks["+ i +"].Label"));

			tasks.add(task);
		}
		describeDrdsDbTasksResponse.setTasks(tasks);
	 
	 	return describeDrdsDbTasksResponse;
	}
}