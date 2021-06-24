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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsQueryScheduledTasksResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryScheduledTasksResponse.ScheduledTaskConfig;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryScheduledTasksResponse.ScheduledTaskConfig.ScheduleFactory;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryScheduledTasksResponse.ScheduledTaskConfig.ScheduleFactory.ScheduleConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryScheduledTasksResponseUnmarshaller {

	public static OpsQueryScheduledTasksResponse unmarshall(OpsQueryScheduledTasksResponse opsQueryScheduledTasksResponse, UnmarshallerContext _ctx) {
		
		opsQueryScheduledTasksResponse.setRequestId(_ctx.stringValue("OpsQueryScheduledTasksResponse.RequestId"));
		opsQueryScheduledTasksResponse.setCount(_ctx.integerValue("OpsQueryScheduledTasksResponse.Count"));

		List<ScheduledTaskConfig> scheduledTaskConfigs = new ArrayList<ScheduledTaskConfig>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryScheduledTasksResponse.ScheduledTaskConfigs.Length"); i++) {
			ScheduledTaskConfig scheduledTaskConfig = new ScheduledTaskConfig();
			scheduledTaskConfig.setConcurrentHandleCount(_ctx.integerValue("OpsQueryScheduledTasksResponse.ScheduledTaskConfigs["+ i +"].ConcurrentHandleCount"));
			scheduledTaskConfig.setSize(_ctx.integerValue("OpsQueryScheduledTasksResponse.ScheduledTaskConfigs["+ i +"].Size"));
			scheduledTaskConfig.setTaskExecuteTimeout(_ctx.integerValue("OpsQueryScheduledTasksResponse.ScheduledTaskConfigs["+ i +"].TaskExecuteTimeout"));
			scheduledTaskConfig.setName(_ctx.stringValue("OpsQueryScheduledTasksResponse.ScheduledTaskConfigs["+ i +"].Name"));
			scheduledTaskConfig.setId(_ctx.longValue("OpsQueryScheduledTasksResponse.ScheduledTaskConfigs["+ i +"].Id"));
			scheduledTaskConfig.setTaskPendingTimeout(_ctx.integerValue("OpsQueryScheduledTasksResponse.ScheduledTaskConfigs["+ i +"].TaskPendingTimeout"));

			ScheduleFactory scheduleFactory = new ScheduleFactory();
			scheduleFactory.setMaxSize(_ctx.longValue("OpsQueryScheduledTasksResponse.ScheduledTaskConfigs["+ i +"].ScheduleFactory.MaxSize"));
			scheduleFactory.setTaskName(_ctx.stringValue("OpsQueryScheduledTasksResponse.ScheduledTaskConfigs["+ i +"].ScheduleFactory.TaskName"));
			scheduleFactory.setConcurrentSize(_ctx.integerValue("OpsQueryScheduledTasksResponse.ScheduledTaskConfigs["+ i +"].ScheduleFactory.ConcurrentSize"));

			List<ScheduleConfig> scheduleConfigs = new ArrayList<ScheduleConfig>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryScheduledTasksResponse.ScheduledTaskConfigs["+ i +"].ScheduleFactory.ScheduleConfigs.Length"); j++) {
				ScheduleConfig scheduleConfig = new ScheduleConfig();
				scheduleConfig.setMaxSize(_ctx.longValue("OpsQueryScheduledTasksResponse.ScheduledTaskConfigs["+ i +"].ScheduleFactory.ScheduleConfigs["+ j +"].MaxSize"));
				scheduleConfig.setScheduleFactor(_ctx.stringValue("OpsQueryScheduledTasksResponse.ScheduledTaskConfigs["+ i +"].ScheduleFactory.ScheduleConfigs["+ j +"].ScheduleFactor"));
				scheduleConfig.setConcurrentSize(_ctx.integerValue("OpsQueryScheduledTasksResponse.ScheduledTaskConfigs["+ i +"].ScheduleFactory.ScheduleConfigs["+ j +"].ConcurrentSize"));

				scheduleConfigs.add(scheduleConfig);
			}
			scheduleFactory.setScheduleConfigs(scheduleConfigs);
			scheduledTaskConfig.setScheduleFactory(scheduleFactory);

			scheduledTaskConfigs.add(scheduledTaskConfig);
		}
		opsQueryScheduledTasksResponse.setScheduledTaskConfigs(scheduledTaskConfigs);
	 
	 	return opsQueryScheduledTasksResponse;
	}
}