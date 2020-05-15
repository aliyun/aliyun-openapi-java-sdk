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

package com.aliyuncs.ess.transform.v20140828;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ess.model.v20140828.DescribeScheduledTasksResponse;
import com.aliyuncs.ess.model.v20140828.DescribeScheduledTasksResponse.ScheduledTask;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScheduledTasksResponseUnmarshaller {

	public static DescribeScheduledTasksResponse unmarshall(DescribeScheduledTasksResponse describeScheduledTasksResponse, UnmarshallerContext _ctx) {
		
		describeScheduledTasksResponse.setRequestId(_ctx.stringValue("DescribeScheduledTasksResponse.RequestId"));
		describeScheduledTasksResponse.setTotalCount(_ctx.integerValue("DescribeScheduledTasksResponse.TotalCount"));
		describeScheduledTasksResponse.setPageNumber(_ctx.integerValue("DescribeScheduledTasksResponse.PageNumber"));
		describeScheduledTasksResponse.setPageSize(_ctx.integerValue("DescribeScheduledTasksResponse.PageSize"));

		List<ScheduledTask> scheduledTasks = new ArrayList<ScheduledTask>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScheduledTasksResponse.ScheduledTasks.Length"); i++) {
			ScheduledTask scheduledTask = new ScheduledTask();
			scheduledTask.setScheduledTaskId(_ctx.stringValue("DescribeScheduledTasksResponse.ScheduledTasks["+ i +"].ScheduledTaskId"));
			scheduledTask.setScheduledTaskName(_ctx.stringValue("DescribeScheduledTasksResponse.ScheduledTasks["+ i +"].ScheduledTaskName"));
			scheduledTask.setDescription(_ctx.stringValue("DescribeScheduledTasksResponse.ScheduledTasks["+ i +"].Description"));
			scheduledTask.setScheduledAction(_ctx.stringValue("DescribeScheduledTasksResponse.ScheduledTasks["+ i +"].ScheduledAction"));
			scheduledTask.setRecurrenceEndTime(_ctx.stringValue("DescribeScheduledTasksResponse.ScheduledTasks["+ i +"].RecurrenceEndTime"));
			scheduledTask.setLaunchTime(_ctx.stringValue("DescribeScheduledTasksResponse.ScheduledTasks["+ i +"].LaunchTime"));
			scheduledTask.setRecurrenceType(_ctx.stringValue("DescribeScheduledTasksResponse.ScheduledTasks["+ i +"].RecurrenceType"));
			scheduledTask.setRecurrenceValue(_ctx.stringValue("DescribeScheduledTasksResponse.ScheduledTasks["+ i +"].RecurrenceValue"));
			scheduledTask.setLaunchExpirationTime(_ctx.integerValue("DescribeScheduledTasksResponse.ScheduledTasks["+ i +"].LaunchExpirationTime"));
			scheduledTask.setTaskEnabled(_ctx.booleanValue("DescribeScheduledTasksResponse.ScheduledTasks["+ i +"].TaskEnabled"));
			scheduledTask.setMaxValue(_ctx.integerValue("DescribeScheduledTasksResponse.ScheduledTasks["+ i +"].MaxValue"));
			scheduledTask.setMinValue(_ctx.integerValue("DescribeScheduledTasksResponse.ScheduledTasks["+ i +"].MinValue"));
			scheduledTask.setDesiredCapacity(_ctx.integerValue("DescribeScheduledTasksResponse.ScheduledTasks["+ i +"].DesiredCapacity"));
			scheduledTask.setScalingGroupId(_ctx.stringValue("DescribeScheduledTasksResponse.ScheduledTasks["+ i +"].ScalingGroupId"));

			scheduledTasks.add(scheduledTask);
		}
		describeScheduledTasksResponse.setScheduledTasks(scheduledTasks);
	 
	 	return describeScheduledTasksResponse;
	}
}