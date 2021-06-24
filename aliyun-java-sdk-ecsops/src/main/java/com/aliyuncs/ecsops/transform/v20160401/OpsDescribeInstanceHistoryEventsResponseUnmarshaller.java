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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeInstanceHistoryEventsResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeInstanceHistoryEventsResponse.InstanceSystemEventType;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeInstanceHistoryEventsResponse.InstanceSystemEventType.EventCycleStatus;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeInstanceHistoryEventsResponse.InstanceSystemEventType.EventType;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeInstanceHistoryEventsResponseUnmarshaller {

	public static OpsDescribeInstanceHistoryEventsResponse unmarshall(OpsDescribeInstanceHistoryEventsResponse opsDescribeInstanceHistoryEventsResponse, UnmarshallerContext _ctx) {
		
		opsDescribeInstanceHistoryEventsResponse.setRequestId(_ctx.stringValue("OpsDescribeInstanceHistoryEventsResponse.RequestId"));
		opsDescribeInstanceHistoryEventsResponse.setTotalCount(_ctx.integerValue("OpsDescribeInstanceHistoryEventsResponse.TotalCount"));
		opsDescribeInstanceHistoryEventsResponse.setPageSize(_ctx.integerValue("OpsDescribeInstanceHistoryEventsResponse.PageSize"));
		opsDescribeInstanceHistoryEventsResponse.setPageNumber(_ctx.integerValue("OpsDescribeInstanceHistoryEventsResponse.PageNumber"));

		List<InstanceSystemEventType> instanceSystemEventSet = new ArrayList<InstanceSystemEventType>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeInstanceHistoryEventsResponse.InstanceSystemEventSet.Length"); i++) {
			InstanceSystemEventType instanceSystemEventType = new InstanceSystemEventType();
			instanceSystemEventType.setEventId(_ctx.stringValue("OpsDescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].EventId"));
			instanceSystemEventType.setEventPublishTime(_ctx.stringValue("OpsDescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].EventPublishTime"));
			instanceSystemEventType.setEventFinishTime(_ctx.stringValue("OpsDescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].EventFinishTime"));
			instanceSystemEventType.setNotBefore(_ctx.stringValue("OpsDescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].NotBefore"));
			instanceSystemEventType.setInstanceId(_ctx.stringValue("OpsDescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].InstanceId"));
			instanceSystemEventType.setEventInitiateBy(_ctx.stringValue("OpsDescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].EventInitiateBy"));

			EventType eventType = new EventType();
			eventType.setCode(_ctx.integerValue("OpsDescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].EventType.Code"));
			eventType.setName(_ctx.stringValue("OpsDescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].EventType.Name"));
			instanceSystemEventType.setEventType(eventType);

			EventCycleStatus eventCycleStatus = new EventCycleStatus();
			eventCycleStatus.setCode(_ctx.integerValue("OpsDescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].EventCycleStatus.Code"));
			eventCycleStatus.setName(_ctx.stringValue("OpsDescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].EventCycleStatus.Name"));
			instanceSystemEventType.setEventCycleStatus(eventCycleStatus);

			instanceSystemEventSet.add(instanceSystemEventType);
		}
		opsDescribeInstanceHistoryEventsResponse.setInstanceSystemEventSet(instanceSystemEventSet);
	 
	 	return opsDescribeInstanceHistoryEventsResponse;
	}
}