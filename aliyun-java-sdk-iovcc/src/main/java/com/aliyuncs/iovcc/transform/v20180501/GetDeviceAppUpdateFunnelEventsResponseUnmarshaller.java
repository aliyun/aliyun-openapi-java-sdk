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

package com.aliyuncs.iovcc.transform.v20180501;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iovcc.model.v20180501.GetDeviceAppUpdateFunnelEventsResponse;
import com.aliyuncs.iovcc.model.v20180501.GetDeviceAppUpdateFunnelEventsResponse.EventListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDeviceAppUpdateFunnelEventsResponseUnmarshaller {

	public static GetDeviceAppUpdateFunnelEventsResponse unmarshall(GetDeviceAppUpdateFunnelEventsResponse getDeviceAppUpdateFunnelEventsResponse, UnmarshallerContext _ctx) {
		
		getDeviceAppUpdateFunnelEventsResponse.setRequestId(_ctx.stringValue("GetDeviceAppUpdateFunnelEventsResponse.RequestId"));

		List<EventListItem> eventList = new ArrayList<EventListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDeviceAppUpdateFunnelEventsResponse.EventList.Length"); i++) {
			EventListItem eventListItem = new EventListItem();
			eventListItem.setTenantId(_ctx.stringValue("GetDeviceAppUpdateFunnelEventsResponse.EventList["+ i +"].TenantId"));
			eventListItem.setDeviceId(_ctx.stringValue("GetDeviceAppUpdateFunnelEventsResponse.EventList["+ i +"].DeviceId"));
			eventListItem.setTargetVersionCode(_ctx.stringValue("GetDeviceAppUpdateFunnelEventsResponse.EventList["+ i +"].TargetVersionCode"));
			eventListItem.setEvent(_ctx.stringValue("GetDeviceAppUpdateFunnelEventsResponse.EventList["+ i +"].Event"));
			eventListItem.setReportTime(_ctx.stringValue("GetDeviceAppUpdateFunnelEventsResponse.EventList["+ i +"].ReportTime"));
			eventListItem.setPackageName(_ctx.stringValue("GetDeviceAppUpdateFunnelEventsResponse.EventList["+ i +"].PackageName"));
			eventListItem.setReportTimestamp(_ctx.longValue("GetDeviceAppUpdateFunnelEventsResponse.EventList["+ i +"].ReportTimestamp"));

			eventList.add(eventListItem);
		}
		getDeviceAppUpdateFunnelEventsResponse.setEventList(eventList);
	 
	 	return getDeviceAppUpdateFunnelEventsResponse;
	}
}