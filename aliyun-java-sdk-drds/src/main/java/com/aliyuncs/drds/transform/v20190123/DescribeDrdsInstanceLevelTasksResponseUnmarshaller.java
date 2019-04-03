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

import com.aliyuncs.drds.model.v20190123.DescribeDrdsInstanceLevelTasksResponse;
import com.aliyuncs.drds.model.v20190123.DescribeDrdsInstanceLevelTasksResponse.Task;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDrdsInstanceLevelTasksResponseUnmarshaller {

	public static DescribeDrdsInstanceLevelTasksResponse unmarshall(DescribeDrdsInstanceLevelTasksResponse describeDrdsInstanceLevelTasksResponse, UnmarshallerContext context) {
		
		describeDrdsInstanceLevelTasksResponse.setRequestId(context.stringValue("DescribeDrdsInstanceLevelTasksResponse.RequestId"));
		describeDrdsInstanceLevelTasksResponse.setSuccess(context.booleanValue("DescribeDrdsInstanceLevelTasksResponse.Success"));

		List<Task> tasks = new ArrayList<Task>();
		for (int i = 0; i < context.lengthValue("DescribeDrdsInstanceLevelTasksResponse.Tasks.Length"); i++) {
			Task task = new Task();
			task.setTaskName(context.stringValue("DescribeDrdsInstanceLevelTasksResponse.Tasks["+ i +"].TaskName"));
			task.setGmtCreate(context.longValue("DescribeDrdsInstanceLevelTasksResponse.Tasks["+ i +"].GmtCreate"));
			task.setTaskType(context.integerValue("DescribeDrdsInstanceLevelTasksResponse.Tasks["+ i +"].TaskType"));
			task.setTaskStatus(context.integerValue("DescribeDrdsInstanceLevelTasksResponse.Tasks["+ i +"].TaskStatus"));
			task.setProgress(context.integerValue("DescribeDrdsInstanceLevelTasksResponse.Tasks["+ i +"].Progress"));
			task.setProgressDescription(context.stringValue("DescribeDrdsInstanceLevelTasksResponse.Tasks["+ i +"].ProgressDescription"));
			task.setTaskPhase(context.stringValue("DescribeDrdsInstanceLevelTasksResponse.Tasks["+ i +"].TaskPhase"));
			task.setErrMsg(context.stringValue("DescribeDrdsInstanceLevelTasksResponse.Tasks["+ i +"].ErrMsg"));
			task.setShowProgress(context.booleanValue("DescribeDrdsInstanceLevelTasksResponse.Tasks["+ i +"].ShowProgress"));
			task.setAllowCancel(context.booleanValue("DescribeDrdsInstanceLevelTasksResponse.Tasks["+ i +"].AllowCancel"));

			tasks.add(task);
		}
		describeDrdsInstanceLevelTasksResponse.setTasks(tasks);
	 
	 	return describeDrdsInstanceLevelTasksResponse;
	}
}