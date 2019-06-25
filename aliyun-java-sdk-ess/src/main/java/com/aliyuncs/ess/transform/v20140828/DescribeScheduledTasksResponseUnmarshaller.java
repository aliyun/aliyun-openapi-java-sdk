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

	public static DescribeScheduledTasksResponse unmarshall(DescribeScheduledTasksResponse describeScheduledTasksResponse, UnmarshallerContext context) {
		
		describeScheduledTasksResponse.setRequestId(context.stringValue("DescribeScheduledTasksResponse.RequestId"));
		describeScheduledTasksResponse.setTotalCount(context.integerValue("DescribeScheduledTasksResponse.TotalCount"));
		describeScheduledTasksResponse.setPageNumber(context.integerValue("DescribeScheduledTasksResponse.PageNumber"));
		describeScheduledTasksResponse.setPageSize(context.integerValue("DescribeScheduledTasksResponse.PageSize"));

		List<ScheduledTask> scheduledTasks = new ArrayList<ScheduledTask>();
		for (int i = 0; i < context.lengthValue("DescribeScheduledTasksResponse.ScheduledTasks.Length"); i++) {
			ScheduledTask scheduledTask = new ScheduledTask();
			scheduledTask.setScheduledTaskId(context.stringValue("DescribeScheduledTasksResponse.ScheduledTasks["+ i +"].ScheduledTaskId"));
			scheduledTask.setScheduledTaskName(context.stringValue("DescribeScheduledTasksResponse.ScheduledTasks["+ i +"].ScheduledTaskName"));
			scheduledTask.setDescription(context.stringValue("DescribeScheduledTasksResponse.ScheduledTasks["+ i +"].Description"));
			scheduledTask.setScheduledAction(context.stringValue("DescribeScheduledTasksResponse.ScheduledTasks["+ i +"].ScheduledAction"));
			scheduledTask.setRecurrenceEndTime(context.stringValue("DescribeScheduledTasksResponse.ScheduledTasks["+ i +"].RecurrenceEndTime"));
			scheduledTask.setLaunchTime(context.stringValue("DescribeScheduledTasksResponse.ScheduledTasks["+ i +"].LaunchTime"));
			scheduledTask.setRecurrenceType(context.stringValue("DescribeScheduledTasksResponse.ScheduledTasks["+ i +"].RecurrenceType"));
			scheduledTask.setRecurrenceValue(context.stringValue("DescribeScheduledTasksResponse.ScheduledTasks["+ i +"].RecurrenceValue"));
			scheduledTask.setLaunchExpirationTime(context.integerValue("DescribeScheduledTasksResponse.ScheduledTasks["+ i +"].LaunchExpirationTime"));
			scheduledTask.setTaskEnabled(context.booleanValue("DescribeScheduledTasksResponse.ScheduledTasks["+ i +"].TaskEnabled"));
			scheduledTask.setMaxValue(context.integerValue("DescribeScheduledTasksResponse.ScheduledTasks["+ i +"].MaxValue"));
			scheduledTask.setMinValue(context.integerValue("DescribeScheduledTasksResponse.ScheduledTasks["+ i +"].MinValue"));

			scheduledTasks.add(scheduledTask);
		}
		describeScheduledTasksResponse.setScheduledTasks(scheduledTasks);
	 
	 	return describeScheduledTasksResponse;
	}
}