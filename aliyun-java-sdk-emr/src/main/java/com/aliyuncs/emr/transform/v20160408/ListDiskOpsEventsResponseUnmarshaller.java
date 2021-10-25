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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListDiskOpsEventsResponse;
import com.aliyuncs.emr.model.v20160408.ListDiskOpsEventsResponse.DiskOpsEventInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDiskOpsEventsResponseUnmarshaller {

	public static ListDiskOpsEventsResponse unmarshall(ListDiskOpsEventsResponse listDiskOpsEventsResponse, UnmarshallerContext _ctx) {
		
		listDiskOpsEventsResponse.setRequestId(_ctx.stringValue("ListDiskOpsEventsResponse.RequestId"));
		listDiskOpsEventsResponse.setPageNumber(_ctx.integerValue("ListDiskOpsEventsResponse.PageNumber"));
		listDiskOpsEventsResponse.setPageSize(_ctx.integerValue("ListDiskOpsEventsResponse.PageSize"));
		listDiskOpsEventsResponse.setTotalCount(_ctx.integerValue("ListDiskOpsEventsResponse.TotalCount"));

		List<DiskOpsEventInfo> eventList = new ArrayList<DiskOpsEventInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListDiskOpsEventsResponse.EventList.Length"); i++) {
			DiskOpsEventInfo diskOpsEventInfo = new DiskOpsEventInfo();
			diskOpsEventInfo.setRegionId(_ctx.stringValue("ListDiskOpsEventsResponse.EventList["+ i +"].RegionId"));
			diskOpsEventInfo.setUserId(_ctx.stringValue("ListDiskOpsEventsResponse.EventList["+ i +"].UserId"));
			diskOpsEventInfo.setClusterBizId(_ctx.stringValue("ListDiskOpsEventsResponse.EventList["+ i +"].ClusterBizId"));
			diskOpsEventInfo.setClusterName(_ctx.stringValue("ListDiskOpsEventsResponse.EventList["+ i +"].ClusterName"));
			diskOpsEventInfo.setInstanceId(_ctx.stringValue("ListDiskOpsEventsResponse.EventList["+ i +"].InstanceId"));
			diskOpsEventInfo.setInstanceName(_ctx.stringValue("ListDiskOpsEventsResponse.EventList["+ i +"].InstanceName"));
			diskOpsEventInfo.setInstanceStatus(_ctx.stringValue("ListDiskOpsEventsResponse.EventList["+ i +"].InstanceStatus"));
			diskOpsEventInfo.setPrivateIp(_ctx.stringValue("ListDiskOpsEventsResponse.EventList["+ i +"].PrivateIp"));
			diskOpsEventInfo.setDiskId(_ctx.stringValue("ListDiskOpsEventsResponse.EventList["+ i +"].DiskId"));
			diskOpsEventInfo.setDiskDevice(_ctx.stringValue("ListDiskOpsEventsResponse.EventList["+ i +"].DiskDevice"));
			diskOpsEventInfo.setDiskMountPoint(_ctx.stringValue("ListDiskOpsEventsResponse.EventList["+ i +"].DiskMountPoint"));
			diskOpsEventInfo.setEventId(_ctx.stringValue("ListDiskOpsEventsResponse.EventList["+ i +"].EventId"));
			diskOpsEventInfo.setEventType(_ctx.stringValue("ListDiskOpsEventsResponse.EventList["+ i +"].EventType"));
			diskOpsEventInfo.setEventTriggerTime(_ctx.longValue("ListDiskOpsEventsResponse.EventList["+ i +"].EventTriggerTime"));
			diskOpsEventInfo.setCurrentActivity(_ctx.stringValue("ListDiskOpsEventsResponse.EventList["+ i +"].CurrentActivity"));
			diskOpsEventInfo.setCurrentActivityState(_ctx.stringValue("ListDiskOpsEventsResponse.EventList["+ i +"].CurrentActivityState"));

			eventList.add(diskOpsEventInfo);
		}
		listDiskOpsEventsResponse.setEventList(eventList);
	 
	 	return listDiskOpsEventsResponse;
	}
}