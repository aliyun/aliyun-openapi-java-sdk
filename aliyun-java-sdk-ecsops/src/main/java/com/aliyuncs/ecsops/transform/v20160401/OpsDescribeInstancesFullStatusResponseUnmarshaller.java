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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeInstancesFullStatusResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeInstancesFullStatusResponse.InstanceFullStatusType;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeInstancesFullStatusResponse.InstanceFullStatusType.HealthStatus;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeInstancesFullStatusResponse.InstanceFullStatusType.ScheduledSystemEventType;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeInstancesFullStatusResponse.InstanceFullStatusType.ScheduledSystemEventType.EventCycleStatus;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeInstancesFullStatusResponse.InstanceFullStatusType.ScheduledSystemEventType.EventType;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeInstancesFullStatusResponse.InstanceFullStatusType.Status;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeInstancesFullStatusResponseUnmarshaller {

	public static OpsDescribeInstancesFullStatusResponse unmarshall(OpsDescribeInstancesFullStatusResponse opsDescribeInstancesFullStatusResponse, UnmarshallerContext _ctx) {
		
		opsDescribeInstancesFullStatusResponse.setRequestId(_ctx.stringValue("OpsDescribeInstancesFullStatusResponse.RequestId"));
		opsDescribeInstancesFullStatusResponse.setTotalCount(_ctx.integerValue("OpsDescribeInstancesFullStatusResponse.TotalCount"));
		opsDescribeInstancesFullStatusResponse.setPageNumber(_ctx.integerValue("OpsDescribeInstancesFullStatusResponse.PageNumber"));
		opsDescribeInstancesFullStatusResponse.setPageSize(_ctx.integerValue("OpsDescribeInstancesFullStatusResponse.PageSize"));

		List<InstanceFullStatusType> instanceFullStatusSet = new ArrayList<InstanceFullStatusType>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeInstancesFullStatusResponse.InstanceFullStatusSet.Length"); i++) {
			InstanceFullStatusType instanceFullStatusType = new InstanceFullStatusType();
			instanceFullStatusType.setInstanceId(_ctx.stringValue("OpsDescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].InstanceId"));

			Status status = new Status();
			status.setCode(_ctx.integerValue("OpsDescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].Status.Code"));
			status.setName(_ctx.stringValue("OpsDescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].Status.Name"));
			instanceFullStatusType.setStatus(status);

			HealthStatus healthStatus = new HealthStatus();
			healthStatus.setCode(_ctx.integerValue("OpsDescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].HealthStatus.Code"));
			healthStatus.setName(_ctx.stringValue("OpsDescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].HealthStatus.Name"));
			instanceFullStatusType.setHealthStatus(healthStatus);

			List<ScheduledSystemEventType> scheduledSystemEventSet = new ArrayList<ScheduledSystemEventType>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].ScheduledSystemEventSet.Length"); j++) {
				ScheduledSystemEventType scheduledSystemEventType = new ScheduledSystemEventType();
				scheduledSystemEventType.setEventId(_ctx.stringValue("OpsDescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].ScheduledSystemEventSet["+ j +"].EventId"));
				scheduledSystemEventType.setEventInitiateBy(_ctx.stringValue("OpsDescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].ScheduledSystemEventSet["+ j +"].EventInitiateBy"));
				scheduledSystemEventType.setEventPublishTime(_ctx.stringValue("OpsDescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].ScheduledSystemEventSet["+ j +"].EventPublishTime"));
				scheduledSystemEventType.setNotBefore(_ctx.stringValue("OpsDescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].ScheduledSystemEventSet["+ j +"].NotBefore"));

				EventCycleStatus eventCycleStatus = new EventCycleStatus();
				eventCycleStatus.setCode(_ctx.integerValue("OpsDescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].ScheduledSystemEventSet["+ j +"].EventCycleStatus.Code"));
				eventCycleStatus.setName(_ctx.stringValue("OpsDescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].ScheduledSystemEventSet["+ j +"].EventCycleStatus.Name"));
				scheduledSystemEventType.setEventCycleStatus(eventCycleStatus);

				EventType eventType = new EventType();
				eventType.setCode(_ctx.integerValue("OpsDescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].ScheduledSystemEventSet["+ j +"].EventType.Code"));
				eventType.setName(_ctx.stringValue("OpsDescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].ScheduledSystemEventSet["+ j +"].EventType.Name"));
				scheduledSystemEventType.setEventType(eventType);

				scheduledSystemEventSet.add(scheduledSystemEventType);
			}
			instanceFullStatusType.setScheduledSystemEventSet(scheduledSystemEventSet);

			instanceFullStatusSet.add(instanceFullStatusType);
		}
		opsDescribeInstancesFullStatusResponse.setInstanceFullStatusSet(instanceFullStatusSet);
	 
	 	return opsDescribeInstancesFullStatusResponse;
	}
}