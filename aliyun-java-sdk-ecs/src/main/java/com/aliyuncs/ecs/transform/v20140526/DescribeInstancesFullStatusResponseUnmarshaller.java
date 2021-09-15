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
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesFullStatusResponse.InstanceFullStatusType.ScheduledSystemEventType.ExtendedAttribute.InactiveDisk;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesFullStatusResponse.InstanceFullStatusType.Status;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstancesFullStatusResponseUnmarshaller {

	public static DescribeInstancesFullStatusResponse unmarshall(DescribeInstancesFullStatusResponse describeInstancesFullStatusResponse, UnmarshallerContext _ctx) {
		
		describeInstancesFullStatusResponse.setRequestId(_ctx.stringValue("DescribeInstancesFullStatusResponse.RequestId"));
		describeInstancesFullStatusResponse.setPageSize(_ctx.integerValue("DescribeInstancesFullStatusResponse.PageSize"));
		describeInstancesFullStatusResponse.setPageNumber(_ctx.integerValue("DescribeInstancesFullStatusResponse.PageNumber"));
		describeInstancesFullStatusResponse.setTotalCount(_ctx.integerValue("DescribeInstancesFullStatusResponse.TotalCount"));

		List<InstanceFullStatusType> instanceFullStatusSet = new ArrayList<InstanceFullStatusType>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstancesFullStatusResponse.InstanceFullStatusSet.Length"); i++) {
			InstanceFullStatusType instanceFullStatusType = new InstanceFullStatusType();
			instanceFullStatusType.setInstanceId(_ctx.stringValue("DescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].InstanceId"));

			Status status = new Status();
			status.setName(_ctx.stringValue("DescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].Status.Name"));
			status.setCode(_ctx.integerValue("DescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].Status.Code"));
			instanceFullStatusType.setStatus(status);

			HealthStatus healthStatus = new HealthStatus();
			healthStatus.setName(_ctx.stringValue("DescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].HealthStatus.Name"));
			healthStatus.setCode(_ctx.integerValue("DescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].HealthStatus.Code"));
			instanceFullStatusType.setHealthStatus(healthStatus);

			List<ScheduledSystemEventType> scheduledSystemEventSet = new ArrayList<ScheduledSystemEventType>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].ScheduledSystemEventSet.Length"); j++) {
				ScheduledSystemEventType scheduledSystemEventType = new ScheduledSystemEventType();
				scheduledSystemEventType.setEventPublishTime(_ctx.stringValue("DescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].ScheduledSystemEventSet["+ j +"].EventPublishTime"));
				scheduledSystemEventType.setEventId(_ctx.stringValue("DescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].ScheduledSystemEventSet["+ j +"].EventId"));
				scheduledSystemEventType.setNotBefore(_ctx.stringValue("DescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].ScheduledSystemEventSet["+ j +"].NotBefore"));
				scheduledSystemEventType.setImpactLevel(_ctx.stringValue("DescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].ScheduledSystemEventSet["+ j +"].ImpactLevel"));
				scheduledSystemEventType.setReason(_ctx.stringValue("DescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].ScheduledSystemEventSet["+ j +"].Reason"));

				EventCycleStatus eventCycleStatus = new EventCycleStatus();
				eventCycleStatus.setName(_ctx.stringValue("DescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].ScheduledSystemEventSet["+ j +"].EventCycleStatus.Name"));
				eventCycleStatus.setCode(_ctx.integerValue("DescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].ScheduledSystemEventSet["+ j +"].EventCycleStatus.Code"));
				scheduledSystemEventType.setEventCycleStatus(eventCycleStatus);

				EventType eventType = new EventType();
				eventType.setName(_ctx.stringValue("DescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].ScheduledSystemEventSet["+ j +"].EventType.Name"));
				eventType.setCode(_ctx.integerValue("DescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].ScheduledSystemEventSet["+ j +"].EventType.Code"));
				scheduledSystemEventType.setEventType(eventType);

				ExtendedAttribute extendedAttribute = new ExtendedAttribute();
				extendedAttribute.setDevice(_ctx.stringValue("DescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].ScheduledSystemEventSet["+ j +"].ExtendedAttribute.Device"));
				extendedAttribute.setDiskId(_ctx.stringValue("DescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].ScheduledSystemEventSet["+ j +"].ExtendedAttribute.DiskId"));

				List<InactiveDisk> inactiveDisks = new ArrayList<InactiveDisk>();
				for (int k = 0; k < _ctx.lengthValue("DescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].ScheduledSystemEventSet["+ j +"].ExtendedAttribute.InactiveDisks.Length"); k++) {
					InactiveDisk inactiveDisk = new InactiveDisk();
					inactiveDisk.setCreationTime(_ctx.stringValue("DescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].ScheduledSystemEventSet["+ j +"].ExtendedAttribute.InactiveDisks["+ k +"].CreationTime"));
					inactiveDisk.setDeviceSize(_ctx.stringValue("DescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].ScheduledSystemEventSet["+ j +"].ExtendedAttribute.InactiveDisks["+ k +"].DeviceSize"));
					inactiveDisk.setDeviceCategory(_ctx.stringValue("DescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].ScheduledSystemEventSet["+ j +"].ExtendedAttribute.InactiveDisks["+ k +"].DeviceCategory"));
					inactiveDisk.setDeviceType(_ctx.stringValue("DescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].ScheduledSystemEventSet["+ j +"].ExtendedAttribute.InactiveDisks["+ k +"].DeviceType"));
					inactiveDisk.setReleaseTime(_ctx.stringValue("DescribeInstancesFullStatusResponse.InstanceFullStatusSet["+ i +"].ScheduledSystemEventSet["+ j +"].ExtendedAttribute.InactiveDisks["+ k +"].ReleaseTime"));

					inactiveDisks.add(inactiveDisk);
				}
				extendedAttribute.setInactiveDisks(inactiveDisks);
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