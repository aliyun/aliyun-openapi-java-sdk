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

	public static DescribeDrdsInstanceLevelTasksResponse unmarshall(DescribeDrdsInstanceLevelTasksResponse describeDrdsInstanceLevelTasksResponse, UnmarshallerContext _ctx) {
		
		describeDrdsInstanceLevelTasksResponse.setRequestId(_ctx.stringValue("DescribeDrdsInstanceLevelTasksResponse.RequestId"));
		describeDrdsInstanceLevelTasksResponse.setSuccess(_ctx.booleanValue("DescribeDrdsInstanceLevelTasksResponse.Success"));

		List<Task> tasks = new ArrayList<Task>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDrdsInstanceLevelTasksResponse.Tasks.Length"); i++) {
			Task task = new Task();
			task.setTaskName(_ctx.stringValue("DescribeDrdsInstanceLevelTasksResponse.Tasks["+ i +"].TaskName"));
			task.setGmtCreate(_ctx.longValue("DescribeDrdsInstanceLevelTasksResponse.Tasks["+ i +"].GmtCreate"));
			task.setTaskType(_ctx.integerValue("DescribeDrdsInstanceLevelTasksResponse.Tasks["+ i +"].TaskType"));
			task.setTargetId(_ctx.longValue("DescribeDrdsInstanceLevelTasksResponse.Tasks["+ i +"].TargetId"));
			task.setTaskStatus(_ctx.integerValue("DescribeDrdsInstanceLevelTasksResponse.Tasks["+ i +"].TaskStatus"));
			task.setProgress(_ctx.integerValue("DescribeDrdsInstanceLevelTasksResponse.Tasks["+ i +"].Progress"));
			task.setProgressDescription(_ctx.stringValue("DescribeDrdsInstanceLevelTasksResponse.Tasks["+ i +"].ProgressDescription"));
			task.setTaskPhase(_ctx.stringValue("DescribeDrdsInstanceLevelTasksResponse.Tasks["+ i +"].TaskPhase"));
			task.setErrMsg(_ctx.stringValue("DescribeDrdsInstanceLevelTasksResponse.Tasks["+ i +"].ErrMsg"));
			task.setShowProgress(_ctx.booleanValue("DescribeDrdsInstanceLevelTasksResponse.Tasks["+ i +"].ShowProgress"));
			task.setAllowCancel(_ctx.booleanValue("DescribeDrdsInstanceLevelTasksResponse.Tasks["+ i +"].AllowCancel"));

			tasks.add(task);
		}
		describeDrdsInstanceLevelTasksResponse.setTasks(tasks);
	 
	 	return describeDrdsInstanceLevelTasksResponse;
	}
}