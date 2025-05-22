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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeRCInstanceHistoryEventsResponse;
import com.aliyuncs.rds.model.v20140815.DescribeRCInstanceHistoryEventsResponse.InstanceSystemEventSetItem;
import com.aliyuncs.rds.model.v20140815.DescribeRCInstanceHistoryEventsResponse.InstanceSystemEventSetItem.EventCycleStatus;
import com.aliyuncs.rds.model.v20140815.DescribeRCInstanceHistoryEventsResponse.InstanceSystemEventSetItem.EventType;
import com.aliyuncs.rds.model.v20140815.DescribeRCInstanceHistoryEventsResponse.InstanceSystemEventSetItem.ExtendedAttribute;
import com.aliyuncs.rds.model.v20140815.DescribeRCInstanceHistoryEventsResponse.InstanceSystemEventSetItem.ExtendedAttribute.InactiveDisk;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRCInstanceHistoryEventsResponseUnmarshaller {

	public static DescribeRCInstanceHistoryEventsResponse unmarshall(DescribeRCInstanceHistoryEventsResponse describeRCInstanceHistoryEventsResponse, UnmarshallerContext _ctx) {
		
		describeRCInstanceHistoryEventsResponse.setRequestId(_ctx.stringValue("DescribeRCInstanceHistoryEventsResponse.RequestId"));
		describeRCInstanceHistoryEventsResponse.setPageNumber(_ctx.integerValue("DescribeRCInstanceHistoryEventsResponse.PageNumber"));
		describeRCInstanceHistoryEventsResponse.setPageSize(_ctx.integerValue("DescribeRCInstanceHistoryEventsResponse.PageSize"));
		describeRCInstanceHistoryEventsResponse.setTotalCount(_ctx.integerValue("DescribeRCInstanceHistoryEventsResponse.TotalCount"));
		describeRCInstanceHistoryEventsResponse.setNextToken(_ctx.stringValue("DescribeRCInstanceHistoryEventsResponse.NextToken"));

		List<InstanceSystemEventSetItem> instanceSystemEventSet = new ArrayList<InstanceSystemEventSetItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRCInstanceHistoryEventsResponse.InstanceSystemEventSet.Length"); i++) {
			InstanceSystemEventSetItem instanceSystemEventSetItem = new InstanceSystemEventSetItem();
			instanceSystemEventSetItem.setEventId(_ctx.stringValue("DescribeRCInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].EventId"));
			instanceSystemEventSetItem.setEventPublishTime(_ctx.stringValue("DescribeRCInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].EventPublishTime"));
			instanceSystemEventSetItem.setEventFinishTime(_ctx.stringValue("DescribeRCInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].EventFinishTime"));
			instanceSystemEventSetItem.setResourceType(_ctx.stringValue("DescribeRCInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ResourceType"));
			instanceSystemEventSetItem.setImpactLevel(_ctx.stringValue("DescribeRCInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ImpactLevel"));
			instanceSystemEventSetItem.setNotBefore(_ctx.stringValue("DescribeRCInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].NotBefore"));
			instanceSystemEventSetItem.setInstanceId(_ctx.stringValue("DescribeRCInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].InstanceId"));
			instanceSystemEventSetItem.setReason(_ctx.stringValue("DescribeRCInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].Reason"));
			instanceSystemEventSetItem.setReasonCode(_ctx.stringValue("DescribeRCInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ReasonCode"));

			EventType eventType = new EventType();
			eventType.setName(_ctx.stringValue("DescribeRCInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].EventType.Name"));
			eventType.setCode(_ctx.stringValue("DescribeRCInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].EventType.Code"));
			instanceSystemEventSetItem.setEventType(eventType);

			EventCycleStatus eventCycleStatus = new EventCycleStatus();
			eventCycleStatus.setName(_ctx.stringValue("DescribeRCInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].EventCycleStatus.Name"));
			eventCycleStatus.setCode(_ctx.stringValue("DescribeRCInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].EventCycleStatus.Code"));
			instanceSystemEventSetItem.setEventCycleStatus(eventCycleStatus);

			ExtendedAttribute extendedAttribute = new ExtendedAttribute();
			extendedAttribute.setDevice(_ctx.stringValue("DescribeRCInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ExtendedAttribute.Device"));
			extendedAttribute.setDiskId(_ctx.stringValue("DescribeRCInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ExtendedAttribute.DiskId"));
			extendedAttribute.setHostType(_ctx.stringValue("DescribeRCInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ExtendedAttribute.HostType"));
			extendedAttribute.setHostId(_ctx.stringValue("DescribeRCInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ExtendedAttribute.HostId"));
			extendedAttribute.setOnlineRepairPolicy(_ctx.stringValue("DescribeRCInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ExtendedAttribute.OnlineRepairPolicy"));
			extendedAttribute.setRack(_ctx.stringValue("DescribeRCInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ExtendedAttribute.Rack"));
			extendedAttribute.setPunishType(_ctx.stringValue("DescribeRCInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ExtendedAttribute.PunishType"));
			extendedAttribute.setPunishDomain(_ctx.stringValue("DescribeRCInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ExtendedAttribute.PunishDomain"));
			extendedAttribute.setPunishUrl(_ctx.stringValue("DescribeRCInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ExtendedAttribute.PunishUrl"));
			extendedAttribute.setCode(_ctx.stringValue("DescribeRCInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ExtendedAttribute.Code"));
			extendedAttribute.setCanAccept(_ctx.stringValue("DescribeRCInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ExtendedAttribute.CanAccept"));
			extendedAttribute.setResponseResult(_ctx.stringValue("DescribeRCInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ExtendedAttribute.ResponseResult"));

			List<String> migrationOptions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRCInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ExtendedAttribute.MigrationOptions.Length"); j++) {
				migrationOptions.add(_ctx.stringValue("DescribeRCInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ExtendedAttribute.MigrationOptions["+ j +"]"));
			}
			extendedAttribute.setMigrationOptions(migrationOptions);

			List<InactiveDisk> inactiveDisks = new ArrayList<InactiveDisk>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRCInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ExtendedAttribute.InactiveDisks.Length"); j++) {
				InactiveDisk inactiveDisk = new InactiveDisk();
				inactiveDisk.setCreationTime(_ctx.stringValue("DescribeRCInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ExtendedAttribute.InactiveDisks["+ j +"].CreationTime"));
				inactiveDisk.setDeviceSize(_ctx.stringValue("DescribeRCInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ExtendedAttribute.InactiveDisks["+ j +"].DeviceSize"));
				inactiveDisk.setDeviceCategory(_ctx.stringValue("DescribeRCInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ExtendedAttribute.InactiveDisks["+ j +"].DeviceCategory"));
				inactiveDisk.setDeviceType(_ctx.stringValue("DescribeRCInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ExtendedAttribute.InactiveDisks["+ j +"].DeviceType"));
				inactiveDisk.setReleaseTime(_ctx.stringValue("DescribeRCInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].ExtendedAttribute.InactiveDisks["+ j +"].ReleaseTime"));

				inactiveDisks.add(inactiveDisk);
			}
			extendedAttribute.setInactiveDisks(inactiveDisks);
			instanceSystemEventSetItem.setExtendedAttribute(extendedAttribute);

			instanceSystemEventSet.add(instanceSystemEventSetItem);
		}
		describeRCInstanceHistoryEventsResponse.setInstanceSystemEventSet(instanceSystemEventSet);
	 
	 	return describeRCInstanceHistoryEventsResponse;
	}
}