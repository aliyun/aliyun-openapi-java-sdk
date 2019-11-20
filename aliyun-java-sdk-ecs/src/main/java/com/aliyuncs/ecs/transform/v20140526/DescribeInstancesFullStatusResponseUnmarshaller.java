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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeInstancesFullStatusResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesFullStatusResponse.InstanceFullStatusType;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesFullStatusResponse.InstanceFullStatusType.HealthStatus;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesFullStatusResponse.InstanceFullStatusType.ScheduledSystemEventType;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesFullStatusResponse.InstanceFullStatusType.ScheduledSystemEventType.EventCycleStatus;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesFullStatusResponse.InstanceFullStatusType.ScheduledSystemEventType.EventType;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesFullStatusResponse.InstanceFullStatusType.ScheduledSystemEventType.ExtendedAttribute;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesFullStatusResponse.InstanceFullStatusType.Status;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstancesFullStatusResponseUnmarshaller {

	public static DescribeInstancesFullStatusResponse unmarshall(DescribeInstancesFullStatusResponse describeInstancesFullStatusResponse, UnmarshallerContext _ctx) {
		
		describeInstancesFullStatusResponse.setRequestId(_ctx.stringValue("DescribeInstancesFullStatusResponse.RequestId"));
		describeInstancesFullStatusResponse.setTotalCount(_ctx.integerValue("DescribeInstancesFullStatusResponse.TotalCount"));
		describeInstancesFullStatusResponse.setPageNumber(_ctx.integerValue("DescribeInstancesFullStatusResponse.PageNumber"));
		describeInstancesFullStatusResponse.setPageSize(_ctx.integerValue("DescribeInstancesFullStatusResponse.PageSize"));

		List<InstanceFullStatusType> instanceFullStatusSet = new ArrayList<InstanceFullStatusType>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstancesFullStatusResponse.InstanceFullStatusSet.Length"); i++) {
			InstanceFullStatusType instanceFullStatusType = new InstanceFullStatusType();
			instanceFullStatusType.setInstanceId(_ctx.stringValue("DescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].InstanceId"));

			Status status = new Status();
			status.setCode(_ctx.integerValue("DescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].Status.Code"));
			status.setName(_ctx.stringValue("DescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].Status.Name"));
			instanceFullStatusType.setStatus(status);

			HealthStatus healthStatus = new HealthStatus();
			healthStatus.setCode(_ctx.integerValue("DescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].HealthStatus.Code"));
			healthStatus.setName(_ctx.stringValue("DescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].HealthStatus.Name"));
			instanceFullStatusType.setHealthStatus(healthStatus);

			List<ScheduledSystemEventType> scheduledSystemEventSet = new ArrayList<ScheduledSystemEventType>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].ScheduledSystemEventSet.Length"); j++) {
				ScheduledSystemEventType scheduledSystemEventType = new ScheduledSystemEventType();
				scheduledSystemEventType.setEventId(_ctx.stringValue("DescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].ScheduledSystemEventSet["+ j +"].EventId"));
				scheduledSystemEventType.setEventPublishTime(_ctx.stringValue("DescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].ScheduledSystemEventSet["+ j +"].EventPublishTime"));
				scheduledSystemEventType.setNotBefore(_ctx.stringValue("DescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].ScheduledSystemEventSet["+ j +"].NotBefore"));
				scheduledSystemEventType.setReason(_ctx.stringValue("DescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].ScheduledSystemEventSet["+ j +"].Reason"));

				EventCycleStatus eventCycleStatus = new EventCycleStatus();
				eventCycleStatus.setCode(_ctx.integerValue("DescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].ScheduledSystemEventSet["+ j +"].EventCycleStatus.Code"));
				eventCycleStatus.setName(_ctx.stringValue("DescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].ScheduledSystemEventSet["+ j +"].EventCycleStatus.Name"));
				scheduledSystemEventType.setEventCycleStatus(eventCycleStatus);

				EventType eventType = new EventType();
				eventType.setCode(_ctx.integerValue("DescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].ScheduledSystemEventSet["+ j +"].EventType.Code"));
				eventType.setName(_ctx.stringValue("DescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].ScheduledSystemEventSet["+ j +"].EventType.Name"));
				scheduledSystemEventType.setEventType(eventType);

				ExtendedAttribute extendedAttribute = new ExtendedAttribute();
				extendedAttribute.setDiskId(_ctx.stringValue("DescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].ScheduledSystemEventSet["+ j +"].ExtendedAttribute.DiskId"));
				extendedAttribute.setDevice(_ctx.stringValue("DescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].ScheduledSystemEventSet["+ j +"].ExtendedAttribute.Device"));
				scheduledSystemEventType.setExtendedAttribute(extendedAttribute);

				scheduledSystemEventSet.add(scheduledSystemEventType);
			}
			instanceFullStatusType.setScheduledSystemEventSet(scheduledSystemEventSet);

			instanceFullStatusSet.add(instanceFullStatusType);
		}
		describeInstancesFullStatusResponse.setInstanceFullStatusSet(instanceFullStatusSet);
	 
	 	return describeInstancesFullStatusResponse;
	}
}