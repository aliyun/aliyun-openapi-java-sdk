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

package com.aliyuncs.ecs.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20160314.DescribeLocalDiskRepairActivitiesResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeLocalDiskRepairActivitiesResponse.LocalDiskRepairActivity;
import com.aliyuncs.ecs.model.v20160314.DescribeLocalDiskRepairActivitiesResponse.LocalDiskRepairActivity.DiskEvent;
import com.aliyuncs.ecs.model.v20160314.DescribeLocalDiskRepairActivitiesResponse.LocalDiskRepairActivity.DiskEvent.EventType1;
import com.aliyuncs.ecs.model.v20160314.DescribeLocalDiskRepairActivitiesResponse.LocalDiskRepairActivity.InstanceEvent;
import com.aliyuncs.ecs.model.v20160314.DescribeLocalDiskRepairActivitiesResponse.LocalDiskRepairActivity.InstanceEvent.EventCycleStatus;
import com.aliyuncs.ecs.model.v20160314.DescribeLocalDiskRepairActivitiesResponse.LocalDiskRepairActivity.InstanceEvent.EventType;
import com.aliyuncs.ecs.model.v20160314.DescribeLocalDiskRepairActivitiesResponse.LocalDiskRepairActivity.InstanceEvent.ExtendedAttribute;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLocalDiskRepairActivitiesResponseUnmarshaller {

	public static DescribeLocalDiskRepairActivitiesResponse unmarshall(DescribeLocalDiskRepairActivitiesResponse describeLocalDiskRepairActivitiesResponse, UnmarshallerContext _ctx) {
		
		describeLocalDiskRepairActivitiesResponse.setRequestId(_ctx.stringValue("DescribeLocalDiskRepairActivitiesResponse.RequestId"));
		describeLocalDiskRepairActivitiesResponse.setPageSize(_ctx.integerValue("DescribeLocalDiskRepairActivitiesResponse.PageSize"));
		describeLocalDiskRepairActivitiesResponse.setPageNumber(_ctx.integerValue("DescribeLocalDiskRepairActivitiesResponse.PageNumber"));
		describeLocalDiskRepairActivitiesResponse.setTotalCount(_ctx.integerValue("DescribeLocalDiskRepairActivitiesResponse.TotalCount"));

		List<LocalDiskRepairActivity> localDiskRepairActivities = new ArrayList<LocalDiskRepairActivity>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLocalDiskRepairActivitiesResponse.LocalDiskRepairActivities.Length"); i++) {
			LocalDiskRepairActivity localDiskRepairActivity = new LocalDiskRepairActivity();
			localDiskRepairActivity.setDiskId(_ctx.stringValue("DescribeLocalDiskRepairActivitiesResponse.LocalDiskRepairActivities["+ i +"].DiskId"));
			localDiskRepairActivity.setInstanceId(_ctx.stringValue("DescribeLocalDiskRepairActivitiesResponse.LocalDiskRepairActivities["+ i +"].InstanceId"));
			localDiskRepairActivity.setProgress(_ctx.stringValue("DescribeLocalDiskRepairActivitiesResponse.LocalDiskRepairActivities["+ i +"].Progress"));

			DiskEvent diskEvent = new DiskEvent();
			diskEvent.setEventId(_ctx.stringValue("DescribeLocalDiskRepairActivitiesResponse.LocalDiskRepairActivities["+ i +"].DiskEvent.EventId"));
			diskEvent.setEventEndTime(_ctx.stringValue("DescribeLocalDiskRepairActivitiesResponse.LocalDiskRepairActivities["+ i +"].DiskEvent.EventEndTime"));
			diskEvent.setEventTime(_ctx.stringValue("DescribeLocalDiskRepairActivitiesResponse.LocalDiskRepairActivities["+ i +"].DiskEvent.EventTime"));

			EventType1 eventType1 = new EventType1();
			eventType1.setName(_ctx.stringValue("DescribeLocalDiskRepairActivitiesResponse.LocalDiskRepairActivities["+ i +"].DiskEvent.EventType.Name"));
			eventType1.setCode(_ctx.integerValue("DescribeLocalDiskRepairActivitiesResponse.LocalDiskRepairActivities["+ i +"].DiskEvent.EventType.Code"));
			diskEvent.setEventType1(eventType1);
			localDiskRepairActivity.setDiskEvent(diskEvent);

			List<InstanceEvent> instanceEvents = new ArrayList<InstanceEvent>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLocalDiskRepairActivitiesResponse.LocalDiskRepairActivities["+ i +"].InstanceEvents.Length"); j++) {
				InstanceEvent instanceEvent = new InstanceEvent();
				instanceEvent.setEventPublishTime(_ctx.stringValue("DescribeLocalDiskRepairActivitiesResponse.LocalDiskRepairActivities["+ i +"].InstanceEvents["+ j +"].EventPublishTime"));
				instanceEvent.setEventId(_ctx.stringValue("DescribeLocalDiskRepairActivitiesResponse.LocalDiskRepairActivities["+ i +"].InstanceEvents["+ j +"].EventId"));
				instanceEvent.setEventFinishTime(_ctx.stringValue("DescribeLocalDiskRepairActivitiesResponse.LocalDiskRepairActivities["+ i +"].InstanceEvents["+ j +"].EventFinishTime"));
				instanceEvent.setInstanceId(_ctx.stringValue("DescribeLocalDiskRepairActivitiesResponse.LocalDiskRepairActivities["+ i +"].InstanceEvents["+ j +"].InstanceId"));
				instanceEvent.setReason(_ctx.stringValue("DescribeLocalDiskRepairActivitiesResponse.LocalDiskRepairActivities["+ i +"].InstanceEvents["+ j +"].Reason"));

				EventType eventType = new EventType();
				eventType.setName(_ctx.stringValue("DescribeLocalDiskRepairActivitiesResponse.LocalDiskRepairActivities["+ i +"].InstanceEvents["+ j +"].EventType.Name"));
				eventType.setCode(_ctx.integerValue("DescribeLocalDiskRepairActivitiesResponse.LocalDiskRepairActivities["+ i +"].InstanceEvents["+ j +"].EventType.Code"));
				instanceEvent.setEventType(eventType);

				EventCycleStatus eventCycleStatus = new EventCycleStatus();
				eventCycleStatus.setName(_ctx.stringValue("DescribeLocalDiskRepairActivitiesResponse.LocalDiskRepairActivities["+ i +"].InstanceEvents["+ j +"].EventCycleStatus.Name"));
				eventCycleStatus.setCode(_ctx.integerValue("DescribeLocalDiskRepairActivitiesResponse.LocalDiskRepairActivities["+ i +"].InstanceEvents["+ j +"].EventCycleStatus.Code"));
				instanceEvent.setEventCycleStatus(eventCycleStatus);

				ExtendedAttribute extendedAttribute = new ExtendedAttribute();
				extendedAttribute.setDevice(_ctx.stringValue("DescribeLocalDiskRepairActivitiesResponse.LocalDiskRepairActivities["+ i +"].InstanceEvents["+ j +"].ExtendedAttribute.Device"));
				extendedAttribute.setDiskId(_ctx.stringValue("DescribeLocalDiskRepairActivitiesResponse.LocalDiskRepairActivities["+ i +"].InstanceEvents["+ j +"].ExtendedAttribute.DiskId"));
				extendedAttribute.setOnlineRepairPolicy(_ctx.stringValue("DescribeLocalDiskRepairActivitiesResponse.LocalDiskRepairActivities["+ i +"].InstanceEvents["+ j +"].ExtendedAttribute.OnlineRepairPolicy"));
				instanceEvent.setExtendedAttribute(extendedAttribute);

				instanceEvents.add(instanceEvent);
			}
			localDiskRepairActivity.setInstanceEvents(instanceEvents);

			localDiskRepairActivities.add(localDiskRepairActivity);
		}
		describeLocalDiskRepairActivitiesResponse.setLocalDiskRepairActivities(localDiskRepairActivities);
	 
	 	return describeLocalDiskRepairActivitiesResponse;
	}
}