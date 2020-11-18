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

package com.aliyuncs.rtc.transform.v20180111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rtc.model.v20180111.DescribeRtcUserEventsResponse;
import com.aliyuncs.rtc.model.v20180111.DescribeRtcUserEventsResponse.Event;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRtcUserEventsResponseUnmarshaller {

	public static DescribeRtcUserEventsResponse unmarshall(DescribeRtcUserEventsResponse describeRtcUserEventsResponse, UnmarshallerContext _ctx) {
		
		describeRtcUserEventsResponse.setRequestId(_ctx.stringValue("DescribeRtcUserEventsResponse.RequestId"));

		List<Event> events = new ArrayList<Event>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRtcUserEventsResponse.Events.Length"); i++) {
			Event event = new Event();
			event.setEventId(_ctx.stringValue("DescribeRtcUserEventsResponse.Events["+ i +"].EventId"));
			event.setEventTime(_ctx.longValue("DescribeRtcUserEventsResponse.Events["+ i +"].EventTime"));
			event.setCategory(_ctx.stringValue("DescribeRtcUserEventsResponse.Events["+ i +"].Category"));

			events.add(event);
		}
		describeRtcUserEventsResponse.setEvents(events);
	 
	 	return describeRtcUserEventsResponse;
	}
}