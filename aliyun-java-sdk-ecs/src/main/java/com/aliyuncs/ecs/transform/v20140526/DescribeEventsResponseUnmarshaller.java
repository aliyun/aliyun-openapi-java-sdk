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

import com.aliyuncs.ecs.model.v20140526.DescribeEventsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeEventsResponse.Event;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEventsResponseUnmarshaller {

	public static DescribeEventsResponse unmarshall(DescribeEventsResponse describeEventsResponse, UnmarshallerContext context) {
		
		describeEventsResponse.setRequestId(context.stringValue("DescribeEventsResponse.RequestId"));
		describeEventsResponse.setPageNumber(context.integerValue("DescribeEventsResponse.PageNumber"));
		describeEventsResponse.setPageSize(context.integerValue("DescribeEventsResponse.PageSize"));
		describeEventsResponse.setTotalCount(context.integerValue("DescribeEventsResponse.TotalCount"));

		List<Event> events = new ArrayList<Event>();
		for (int i = 0; i < context.lengthValue("DescribeEventsResponse.Events.Length"); i++) {
			Event event = new Event();
			event.setResourceId(context.stringValue("DescribeEventsResponse.Events["+ i +"].ResourceId"));
			event.setEventType(context.stringValue("DescribeEventsResponse.Events["+ i +"].EventType"));
			event.setEventCategory(context.stringValue("DescribeEventsResponse.Events["+ i +"].EventCategory"));
			event.setStatus(context.stringValue("DescribeEventsResponse.Events["+ i +"].Status"));
			event.setSupportModify(context.stringValue("DescribeEventsResponse.Events["+ i +"].SupportModify"));
			event.setPlanTime(context.stringValue("DescribeEventsResponse.Events["+ i +"].PlanTime"));
			event.setExpireTime(context.stringValue("DescribeEventsResponse.Events["+ i +"].ExpireTime"));
			event.setEventId(context.stringValue("DescribeEventsResponse.Events["+ i +"].EventId"));

			events.add(event);
		}
		describeEventsResponse.setEvents(events);
	 
	 	return describeEventsResponse;
	}
}