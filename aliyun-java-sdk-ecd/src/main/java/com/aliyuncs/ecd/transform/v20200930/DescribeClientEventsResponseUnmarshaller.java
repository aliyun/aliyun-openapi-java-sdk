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

package com.aliyuncs.ecd.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.DescribeClientEventsResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeClientEventsResponse.Event;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClientEventsResponseUnmarshaller {

	public static DescribeClientEventsResponse unmarshall(DescribeClientEventsResponse describeClientEventsResponse, UnmarshallerContext _ctx) {
		
		describeClientEventsResponse.setRequestId(_ctx.stringValue("DescribeClientEventsResponse.RequestId"));
		describeClientEventsResponse.setNextToken(_ctx.stringValue("DescribeClientEventsResponse.NextToken"));

		List<Event> events = new ArrayList<Event>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClientEventsResponse.Events.Length"); i++) {
			Event event = new Event();
			event.setEventId(_ctx.stringValue("DescribeClientEventsResponse.Events["+ i +"].EventId"));
			event.setEventType(_ctx.stringValue("DescribeClientEventsResponse.Events["+ i +"].EventType"));
			event.setEventTime(_ctx.stringValue("DescribeClientEventsResponse.Events["+ i +"].EventTime"));
			event.setRegionId(_ctx.stringValue("DescribeClientEventsResponse.Events["+ i +"].RegionId"));
			event.setAliUid(_ctx.stringValue("DescribeClientEventsResponse.Events["+ i +"].AliUid"));
			event.setEndUserId(_ctx.stringValue("DescribeClientEventsResponse.Events["+ i +"].EndUserId"));
			event.setDesktopId(_ctx.stringValue("DescribeClientEventsResponse.Events["+ i +"].DesktopId"));
			event.setDesktopIp(_ctx.stringValue("DescribeClientEventsResponse.Events["+ i +"].DesktopIp"));
			event.setDirectoryId(_ctx.stringValue("DescribeClientEventsResponse.Events["+ i +"].DirectoryId"));
			event.setOfficeSiteId(_ctx.stringValue("DescribeClientEventsResponse.Events["+ i +"].OfficeSiteId"));
			event.setDirectoryType(_ctx.stringValue("DescribeClientEventsResponse.Events["+ i +"].DirectoryType"));
			event.setOfficeSiteType(_ctx.stringValue("DescribeClientEventsResponse.Events["+ i +"].OfficeSiteType"));
			event.setClientOS(_ctx.stringValue("DescribeClientEventsResponse.Events["+ i +"].ClientOS"));
			event.setClientVersion(_ctx.stringValue("DescribeClientEventsResponse.Events["+ i +"].ClientVersion"));
			event.setClientIp(_ctx.stringValue("DescribeClientEventsResponse.Events["+ i +"].ClientIp"));
			event.setBytesSend(_ctx.stringValue("DescribeClientEventsResponse.Events["+ i +"].BytesSend"));
			event.setBytesReceived(_ctx.stringValue("DescribeClientEventsResponse.Events["+ i +"].BytesReceived"));
			event.setStatus(_ctx.stringValue("DescribeClientEventsResponse.Events["+ i +"].Status"));

			events.add(event);
		}
		describeClientEventsResponse.setEvents(events);
	 
	 	return describeClientEventsResponse;
	}
}