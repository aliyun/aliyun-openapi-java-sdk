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

package com.aliyuncs.eventbridge.transform.v20200401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eventbridge.model.v20200401.QueryTracedEventsResponse;
import com.aliyuncs.eventbridge.model.v20200401.QueryTracedEventsResponse.Data;
import com.aliyuncs.eventbridge.model.v20200401.QueryTracedEventsResponse.Data.EventsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTracedEventsResponseUnmarshaller {

	public static QueryTracedEventsResponse unmarshall(QueryTracedEventsResponse queryTracedEventsResponse, UnmarshallerContext _ctx) {
		
		queryTracedEventsResponse.setRequestId(_ctx.stringValue("QueryTracedEventsResponse.RequestId"));
		queryTracedEventsResponse.setMessage(_ctx.stringValue("QueryTracedEventsResponse.Message"));
		queryTracedEventsResponse.setCode(_ctx.stringValue("QueryTracedEventsResponse.Code"));
		queryTracedEventsResponse.setSuccess(_ctx.booleanValue("QueryTracedEventsResponse.Success"));

		Data data = new Data();
		data.setNextToken(_ctx.stringValue("QueryTracedEventsResponse.Data.NextToken"));
		data.setTotal(_ctx.integerValue("QueryTracedEventsResponse.Data.Total"));

		List<EventsItem> events = new ArrayList<EventsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryTracedEventsResponse.Data.Events.Length"); i++) {
			EventsItem eventsItem = new EventsItem();
			eventsItem.setEventId(_ctx.stringValue("QueryTracedEventsResponse.Data.Events["+ i +"].EventId"));
			eventsItem.setEventBusName(_ctx.stringValue("QueryTracedEventsResponse.Data.Events["+ i +"].EventBusName"));
			eventsItem.setEventReceivedTime(_ctx.longValue("QueryTracedEventsResponse.Data.Events["+ i +"].EventReceivedTime"));
			eventsItem.setEventSource(_ctx.stringValue("QueryTracedEventsResponse.Data.Events["+ i +"].EventSource"));
			eventsItem.setEventType(_ctx.stringValue("QueryTracedEventsResponse.Data.Events["+ i +"].EventType"));

			events.add(eventsItem);
		}
		data.setEvents(events);
		queryTracedEventsResponse.setData(data);
	 
	 	return queryTracedEventsResponse;
	}
}