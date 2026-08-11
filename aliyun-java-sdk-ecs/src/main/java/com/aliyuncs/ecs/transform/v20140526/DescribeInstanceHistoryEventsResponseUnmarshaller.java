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
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceHistoryEventsResponse.InstanceSystemEventType.ExtendedAttribute.InactiveDisk;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceHistoryEventsResponseUnmarshaller {

	public static DescribeInstanceHistoryEventsResponse unmarshall(DescribeInstanceHistoryEventsResponse describeInstanceHistoryEventsResponse, UnmarshallerContext _ctx) {
		
		describeInstanceHistoryEventsResponse.setRequestId(_ctx.stringValue("DescribeInstanceHistoryEventsResponse.RequestId"));
		describeInstanceHistoryEventsResponse.setTotalCount(_ctx.integerValue("DescribeInstanceHistoryEventsResponse.TotalCount"));
		describeInstanceHistoryEventsResponse.setPageSize(_ctx.integerValue("DescribeInstanceHistoryEventsResponse.PageSize"));
		describeInstanceHistoryEventsResponse.setNextToken(_ctx.stringValue("DescribeInstanceHistoryEventsResponse.NextToken"));
		describeInstanceHistoryEventsResponse.setPageNumber(_ctx.integerValue("DescribeInstanceHistoryEventsResponse.PageNumber"));

		List<InstanceSystemEventType> instanceSystemEventSet = new ArrayList<InstanceSystemEventType>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet.Length"); i++) {
			InstanceSystemEventType instanceSystemEventType = new InstanceSystemEventType();
			instanceSystemEventType.setEventFinishTime(_ctx.stringValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].EventFinishTime"));
			instanceSystemEventType.setEventPublishTime(_ctx.stringValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].EventPublishTime"));
			instanceSystemEventType.setInstanceId(_ctx.stringValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].InstanceId"));
			instanceSystemEventType.setImpactLevel(_ctx.stringValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ImpactLevel"));
			instanceSystemEventType.setEventId(_ctx.stringValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].EventId"));
			instanceSystemEventType.setResourceType(_ctx.stringValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ResourceType"));
			instanceSystemEventType.setNotBefore(_ctx.stringValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].NotBefore"));
			instanceSystemEventType.setReasonCode(_ctx.stringValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ReasonCode"));
			instanceSystemEventType.setReason(_ctx.stringValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].Reason"));

			EventCycleStatus eventCycleStatus = new EventCycleStatus();
			eventCycleStatus.setCode(_ctx.integerValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].EventCycleStatus.Code"));
			eventCycleStatus.setName(_ctx.stringValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].EventCycleStatus.Name"));
			instanceSystemEventType.setEventCycleStatus(eventCycleStatus);

			EventType eventType = new EventType();
			eventType.setCode(_ctx.integerValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].EventType.Code"));
			eventType.setName(_ctx.stringValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].EventType.Name"));
			instanceSystemEventType.setEventType(eventType);

			ExtendedAttribute extendedAttribute = new ExtendedAttribute();
			extendedAttribute.setDevice(_ctx.stringValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ExtendedAttribute.Device"));
			extendedAttribute.setPunishType(_ctx.stringValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ExtendedAttribute.PunishType"));
			extendedAttribute.setPunishDomain(_ctx.stringValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ExtendedAttribute.PunishDomain"));
			extendedAttribute.setInitialNotBefore(_ctx.stringValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ExtendedAttribute.InitialNotBefore"));
			extendedAttribute.setHostId(_ctx.stringValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ExtendedAttribute.HostId"));
			extendedAttribute.setCode(_ctx.stringValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ExtendedAttribute.Code"));
			extendedAttribute.setCanAccept(_ctx.stringValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ExtendedAttribute.CanAccept"));
			extendedAttribute.setRack(_ctx.stringValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ExtendedAttribute.Rack"));
			extendedAttribute.setPunishUrl(_ctx.stringValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ExtendedAttribute.PunishUrl"));
			extendedAttribute.setMetricName(_ctx.stringValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ExtendedAttribute.MetricName"));
			extendedAttribute.setHostType(_ctx.stringValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ExtendedAttribute.HostType"));
			extendedAttribute.setMetricValue(_ctx.stringValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ExtendedAttribute.MetricValue"));
			extendedAttribute.setResponseResult(_ctx.stringValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ExtendedAttribute.ResponseResult"));
			extendedAttribute.setDiskId(_ctx.stringValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ExtendedAttribute.DiskId"));
			extendedAttribute.setOnlineRepairPolicy(_ctx.stringValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ExtendedAttribute.OnlineRepairPolicy"));

			List<String> migrationOptions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ExtendedAttribute.MigrationOptions.Length"); j++) {
				migrationOptions.add(_ctx.stringValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ExtendedAttribute.MigrationOptions["+ j +"]"));
			}
			extendedAttribute.setMigrationOptions(migrationOptions);

			List<InactiveDisk> inactiveDisks = new ArrayList<InactiveDisk>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ExtendedAttribute.InactiveDisks.Length"); j++) {
				InactiveDisk inactiveDisk = new InactiveDisk();
				inactiveDisk.setDeviceType(_ctx.stringValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ExtendedAttribute.InactiveDisks["+ j +"].DeviceType"));
				inactiveDisk.setReleaseTime(_ctx.stringValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ExtendedAttribute.InactiveDisks["+ j +"].ReleaseTime"));
				inactiveDisk.setDeviceSize(_ctx.stringValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ExtendedAttribute.InactiveDisks["+ j +"].DeviceSize"));
				inactiveDisk.setCreationTime(_ctx.stringValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ExtendedAttribute.InactiveDisks["+ j +"].CreationTime"));
				inactiveDisk.setDeviceCategory(_ctx.stringValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ExtendedAttribute.InactiveDisks["+ j +"].DeviceCategory"));

				inactiveDisks.add(inactiveDisk);
			}
			extendedAttribute.setInactiveDisks(inactiveDisks);
			instanceSystemEventType.setExtendedAttribute(extendedAttribute);

			instanceSystemEventSet.add(instanceSystemEventType);
		}
		describeInstanceHistoryEventsResponse.setInstanceSystemEventSet(instanceSystemEventSet);
	 
	 	return describeInstanceHistoryEventsResponse;
	}
}