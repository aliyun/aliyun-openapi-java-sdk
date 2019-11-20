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

import com.aliyuncs.ecs.model.v20140526.DescribeInstanceHistoryEventsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceHistoryEventsResponse.InstanceSystemEventType;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceHistoryEventsResponse.InstanceSystemEventType.EventCycleStatus;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceHistoryEventsResponse.InstanceSystemEventType.EventType;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceHistoryEventsResponse.InstanceSystemEventType.ExtendedAttribute;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceHistoryEventsResponseUnmarshaller {

	public static DescribeInstanceHistoryEventsResponse unmarshall(DescribeInstanceHistoryEventsResponse describeInstanceHistoryEventsResponse, UnmarshallerContext _ctx) {
		
		describeInstanceHistoryEventsResponse.setRequestId(_ctx.stringValue("DescribeInstanceHistoryEventsResponse.RequestId"));
		describeInstanceHistoryEventsResponse.setTotalCount(_ctx.integerValue("DescribeInstanceHistoryEventsResponse.TotalCount"));
		describeInstanceHistoryEventsResponse.setPageNumber(_ctx.integerValue("DescribeInstanceHistoryEventsResponse.PageNumber"));
		describeInstanceHistoryEventsResponse.setPageSize(_ctx.integerValue("DescribeInstanceHistoryEventsResponse.PageSize"));

		List<InstanceSystemEventType> instanceSystemEventSet = new ArrayList<InstanceSystemEventType>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet.Length"); i++) {
			InstanceSystemEventType instanceSystemEventType = new InstanceSystemEventType();
			instanceSystemEventType.setInstanceId(_ctx.stringValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].InstanceId"));
			instanceSystemEventType.setEventId(_ctx.stringValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].EventId"));
			instanceSystemEventType.setEventPublishTime(_ctx.stringValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].EventPublishTime"));
			instanceSystemEventType.setNotBefore(_ctx.stringValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].NotBefore"));
			instanceSystemEventType.setEventFinishTime(_ctx.stringValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].EventFinishTime"));
			instanceSystemEventType.setReason(_ctx.stringValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].Reason"));

			EventType eventType = new EventType();
			eventType.setCode(_ctx.integerValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].EventType.Code"));
			eventType.setName(_ctx.stringValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].EventType.Name"));
			instanceSystemEventType.setEventType(eventType);

			EventCycleStatus eventCycleStatus = new EventCycleStatus();
			eventCycleStatus.setCode(_ctx.integerValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].EventCycleStatus.Code"));
			eventCycleStatus.setName(_ctx.stringValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].EventCycleStatus.Name"));
			instanceSystemEventType.setEventCycleStatus(eventCycleStatus);

			ExtendedAttribute extendedAttribute = new ExtendedAttribute();
			extendedAttribute.setDiskId(_ctx.stringValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ExtendedAttribute.DiskId"));
			extendedAttribute.setDevice(_ctx.stringValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ExtendedAttribute.Device"));
			instanceSystemEventType.setExtendedAttribute(extendedAttribute);

			instanceSystemEventSet.add(instanceSystemEventType);
		}
		describeInstanceHistoryEventsResponse.setInstanceSystemEventSet(instanceSystemEventSet);
	 
	 	return describeInstanceHistoryEventsResponse;
	}
}