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

package com.aliyuncs.aegis.transform.v20161111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.DescribeWebLockEventsResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeWebLockEventsResponse.EventInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWebLockEventsResponseUnmarshaller {

	public static DescribeWebLockEventsResponse unmarshall(DescribeWebLockEventsResponse describeWebLockEventsResponse, UnmarshallerContext context) {
		
		describeWebLockEventsResponse.setRequestId(context.stringValue("DescribeWebLockEventsResponse.RequestId"));
		describeWebLockEventsResponse.setCurrentPage(context.integerValue("DescribeWebLockEventsResponse.CurrentPage"));
		describeWebLockEventsResponse.setPageSize(context.integerValue("DescribeWebLockEventsResponse.PageSize"));
		describeWebLockEventsResponse.setTotalCount(context.integerValue("DescribeWebLockEventsResponse.TotalCount"));

		List<EventInfo> eventList = new ArrayList<EventInfo>();
		for (int i = 0; i < context.lengthValue("DescribeWebLockEventsResponse.EventList.Length"); i++) {
			EventInfo eventInfo = new EventInfo();
			eventInfo.setUuid(context.stringValue("DescribeWebLockEventsResponse.EventList["+ i +"].Uuid"));
			eventInfo.setIp(context.stringValue("DescribeWebLockEventsResponse.EventList["+ i +"].Ip"));
			eventInfo.setInternetIp(context.stringValue("DescribeWebLockEventsResponse.EventList["+ i +"].InternetIp"));
			eventInfo.setIntranetIp(context.stringValue("DescribeWebLockEventsResponse.EventList["+ i +"].IntranetIp"));
			eventInfo.setInstanceName(context.stringValue("DescribeWebLockEventsResponse.EventList["+ i +"].InstanceName"));
			eventInfo.setEventType(context.stringValue("DescribeWebLockEventsResponse.EventList["+ i +"].EventType"));
			eventInfo.setEventName(context.stringValue("DescribeWebLockEventsResponse.EventList["+ i +"].EventName"));
			eventInfo.setLevel(context.stringValue("DescribeWebLockEventsResponse.EventList["+ i +"].Level"));
			eventInfo.setStatus(context.stringValue("DescribeWebLockEventsResponse.EventList["+ i +"].Status"));
			eventInfo.setGmtEvent(context.longValue("DescribeWebLockEventsResponse.EventList["+ i +"].GmtEvent"));
			eventInfo.setPath(context.stringValue("DescribeWebLockEventsResponse.EventList["+ i +"].Path"));
			eventInfo.setSolution(context.stringValue("DescribeWebLockEventsResponse.EventList["+ i +"].Solution"));

			eventList.add(eventInfo);
		}
		describeWebLockEventsResponse.setEventList(eventList);
	 
	 	return describeWebLockEventsResponse;
	}
}