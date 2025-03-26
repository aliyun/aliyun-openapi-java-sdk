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
		describeScheduledTasksResponse.setPageNumber(_ctx.integerValue("DescribeScheduledTasksResponse.PageNumber"));
		describeScheduledTasksResponse.setPageSize(_ctx.integerValue("DescribeScheduledTasksResponse.PageSize"));
		describeScheduledTasksResponse.setTotalCount(_ctx.integerValue("DescribeScheduledTasksResponse.TotalCount"));

		List<ScheduledTask> scheduledTasks = new ArrayList<ScheduledTask>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScheduledTasksResponse.ScheduledTasks.Length"); i++) {
			ScheduledTask scheduledTask = new ScheduledTask();
			scheduledTask.setTaskEnabled(_ctx.booleanValue("DescribeScheduledTasksResponse.ScheduledTasks["+ i +"].TaskEnabled"));
			scheduledTask.setRecurrenceValue(_ctx.stringValue("DescribeScheduledTasksResponse.ScheduledTasks["+ i +"].RecurrenceValue"));
			scheduledTask.setRecurrenceType(_ctx.stringValue("DescribeScheduledTasksResponse.ScheduledTasks["+ i +"].RecurrenceType"));
			scheduledTask.setMaxValue(_ctx.integerValue("DescribeScheduledTasksResponse.ScheduledTasks["+ i +"].MaxValue"));
			scheduledTask.setScheduledTaskName(_ctx.stringValue("DescribeScheduledTasksResponse.ScheduledTasks["+ i +"].ScheduledTaskName"));
			scheduledTask.setRecurrenceEndTime(_ctx.stringValue("DescribeScheduledTasksResponse.ScheduledTasks["+ i +"].RecurrenceEndTime"));
			scheduledTask.setDesiredCapacity(_ctx.integerValue("DescribeScheduledTasksResponse.ScheduledTasks["+ i +"].DesiredCapacity"));
			scheduledTask.setScheduledTaskId(_ctx.stringValue("DescribeScheduledTasksResponse.ScheduledTasks["+ i +"].ScheduledTaskId"));
			scheduledTask.setMinValue(_ctx.integerValue("DescribeScheduledTasksResponse.ScheduledTasks["+ i +"].MinValue"));
			scheduledTask.setScalingGroupId(_ctx.stringValue("DescribeScheduledTasksResponse.ScheduledTasks["+ i +"].ScalingGroupId"));
			scheduledTask.setLaunchExpirationTime(_ctx.integerValue("DescribeScheduledTasksResponse.ScheduledTasks["+ i +"].LaunchExpirationTime"));
			scheduledTask.setDescription(_ctx.stringValue("DescribeScheduledTasksResponse.ScheduledTasks["+ i +"].Description"));
			scheduledTask.setScheduledAction(_ctx.stringValue("DescribeScheduledTasksResponse.ScheduledTasks["+ i +"].ScheduledAction"));
			scheduledTask.setLaunchTime(_ctx.stringValue("DescribeScheduledTasksResponse.ScheduledTasks["+ i +"].LaunchTime"));

			scheduledTasks.add(scheduledTask);
		}
		describeScheduledTasksResponse.setScheduledTasks(scheduledTasks);
	 
	 	return describeScheduledTasksResponse;
	}
}