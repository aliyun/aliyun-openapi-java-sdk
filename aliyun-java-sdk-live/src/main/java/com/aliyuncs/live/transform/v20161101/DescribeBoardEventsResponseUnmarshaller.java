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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeBoardEventsResponse;
import com.aliyuncs.live.model.v20161101.DescribeBoardEventsResponse.Event;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBoardEventsResponseUnmarshaller {

	public static DescribeBoardEventsResponse unmarshall(DescribeBoardEventsResponse describeBoardEventsResponse, UnmarshallerContext context) {
		
		describeBoardEventsResponse.setRequestId(context.stringValue("DescribeBoardEventsResponse.RequestId"));

		List<Event> events = new ArrayList<Event>();
		for (int i = 0; i < context.lengthValue("DescribeBoardEventsResponse.Events.Length"); i++) {
			Event event = new Event();
			event.setEventId(context.longValue("DescribeBoardEventsResponse.Events["+ i +"].EventId"));
			event.setEventType(context.integerValue("DescribeBoardEventsResponse.Events["+ i +"].EventType"));
			event.setUserId(context.integerValue("DescribeBoardEventsResponse.Events["+ i +"].UserId"));
			event.setData(context.stringValue("DescribeBoardEventsResponse.Events["+ i +"].Data"));
			event.setTimestamp(context.longValue("DescribeBoardEventsResponse.Events["+ i +"].Timestamp"));

			events.add(event);
		}
		describeBoardEventsResponse.setEvents(events);
	 
	 	return describeBoardEventsResponse;
	}
}