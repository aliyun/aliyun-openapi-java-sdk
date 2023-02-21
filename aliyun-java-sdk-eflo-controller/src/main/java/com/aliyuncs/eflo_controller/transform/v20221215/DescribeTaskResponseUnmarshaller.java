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

package com.aliyuncs.eflo_controller.transform.v20221215;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eflo_controller.model.v20221215.DescribeTaskResponse;
import com.aliyuncs.eflo_controller.model.v20221215.DescribeTaskResponse.StepsItem;
import com.aliyuncs.eflo_controller.model.v20221215.DescribeTaskResponse.StepsItem.SubTasksItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTaskResponseUnmarshaller {

	public static DescribeTaskResponse unmarshall(DescribeTaskResponse describeTaskResponse, UnmarshallerContext _ctx) {
		
		describeTaskResponse.setRequestId(_ctx.stringValue("DescribeTaskResponse.RequestId"));
		describeTaskResponse.setClusterId(_ctx.stringValue("DescribeTaskResponse.ClusterId"));
		describeTaskResponse.setClusterName(_ctx.stringValue("DescribeTaskResponse.ClusterName"));
		describeTaskResponse.setTaskState(_ctx.stringValue("DescribeTaskResponse.TaskState"));
		describeTaskResponse.setTaskType(_ctx.stringValue("DescribeTaskResponse.TaskType"));
		describeTaskResponse.setMessage(_ctx.stringValue("DescribeTaskResponse.Message"));
		describeTaskResponse.setCreateTime(_ctx.stringValue("DescribeTaskResponse.CreateTime"));
		describeTaskResponse.setUpdateTime(_ctx.stringValue("DescribeTaskResponse.UpdateTime"));

		List<StepsItem> steps = new ArrayList<StepsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTaskResponse.Steps.Length"); i++) {
			StepsItem stepsItem = new StepsItem();
			stepsItem.setStepName(_ctx.stringValue("DescribeTaskResponse.Steps["+ i +"].StepName"));
			stepsItem.setStepState(_ctx.stringValue("DescribeTaskResponse.Steps["+ i +"].StepState"));
			stepsItem.setStepType(_ctx.stringValue("DescribeTaskResponse.Steps["+ i +"].StepType"));
			stepsItem.setStageTag(_ctx.stringValue("DescribeTaskResponse.Steps["+ i +"].StageTag"));
			stepsItem.setMessage(_ctx.stringValue("DescribeTaskResponse.Steps["+ i +"].Message"));
			stepsItem.setStartTime(_ctx.stringValue("DescribeTaskResponse.Steps["+ i +"].StartTime"));
			stepsItem.setUpdateTime(_ctx.stringValue("DescribeTaskResponse.Steps["+ i +"].UpdateTime"));

			List<SubTasksItem> subTasks = new ArrayList<SubTasksItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeTaskResponse.Steps["+ i +"].SubTasks.Length"); j++) {
				SubTasksItem subTasksItem = new SubTasksItem();
				subTasksItem.setTaskId(_ctx.stringValue("DescribeTaskResponse.Steps["+ i +"].SubTasks["+ j +"].TaskId"));
				subTasksItem.setTaskType(_ctx.stringValue("DescribeTaskResponse.Steps["+ i +"].SubTasks["+ j +"].TaskType"));
				subTasksItem.setCreateTime(_ctx.stringValue("DescribeTaskResponse.Steps["+ i +"].SubTasks["+ j +"].CreateTime"));
				subTasksItem.setUpdateTime(_ctx.stringValue("DescribeTaskResponse.Steps["+ i +"].SubTasks["+ j +"].UpdateTime"));
				subTasksItem.setMessage(_ctx.stringValue("DescribeTaskResponse.Steps["+ i +"].SubTasks["+ j +"].Message"));
				subTasksItem.setTaskState(_ctx.stringValue("DescribeTaskResponse.Steps["+ i +"].SubTasks["+ j +"].TaskState"));

				subTasks.add(subTasksItem);
			}
			stepsItem.setSubTasks(subTasks);

			steps.add(stepsItem);
		}
		describeTaskResponse.setSteps(steps);
	 
	 	return describeTaskResponse;
	}
}