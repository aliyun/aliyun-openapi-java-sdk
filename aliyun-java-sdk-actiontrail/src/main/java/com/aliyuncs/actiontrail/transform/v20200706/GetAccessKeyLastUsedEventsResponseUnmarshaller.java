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

package com.aliyuncs.actiontrail.transform.v20200706;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.actiontrail.model.v20200706.GetAccessKeyLastUsedEventsResponse;
import com.aliyuncs.actiontrail.model.v20200706.GetAccessKeyLastUsedEventsResponse.EventsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAccessKeyLastUsedEventsResponseUnmarshaller {

	public static GetAccessKeyLastUsedEventsResponse unmarshall(GetAccessKeyLastUsedEventsResponse getAccessKeyLastUsedEventsResponse, UnmarshallerContext _ctx) {
		
		getAccessKeyLastUsedEventsResponse.setRequestId(_ctx.stringValue("GetAccessKeyLastUsedEventsResponse.RequestId"));
		getAccessKeyLastUsedEventsResponse.setNextToken(_ctx.stringValue("GetAccessKeyLastUsedEventsResponse.NextToken"));

		List<EventsItem> events = new ArrayList<EventsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAccessKeyLastUsedEventsResponse.Events.Length"); i++) {
			EventsItem eventsItem = new EventsItem();
			eventsItem.setUsedTimestamp(_ctx.longValue("GetAccessKeyLastUsedEventsResponse.Events["+ i +"].UsedTimestamp"));
			eventsItem.setDetail(_ctx.stringValue("GetAccessKeyLastUsedEventsResponse.Events["+ i +"].Detail"));
			eventsItem.setEventName(_ctx.stringValue("GetAccessKeyLastUsedEventsResponse.Events["+ i +"].EventName"));
			eventsItem.setSource(_ctx.stringValue("GetAccessKeyLastUsedEventsResponse.Events["+ i +"].Source"));

			events.add(eventsItem);
		}
		getAccessKeyLastUsedEventsResponse.setEvents(events);
	 
	 	return getAccessKeyLastUsedEventsResponse;
	}
}