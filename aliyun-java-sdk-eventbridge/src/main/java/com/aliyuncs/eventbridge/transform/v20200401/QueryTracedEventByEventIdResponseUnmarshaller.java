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

import com.aliyuncs.eventbridge.model.v20200401.QueryTracedEventByEventIdResponse;
import com.aliyuncs.eventbridge.model.v20200401.QueryTracedEventByEventIdResponse.DataItem;
import com.aliyuncs.eventbridge.model.v20200401.QueryTracedEventByEventIdResponse.DataItem.EventsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTracedEventByEventIdResponseUnmarshaller {

	public static QueryTracedEventByEventIdResponse unmarshall(QueryTracedEventByEventIdResponse queryTracedEventByEventIdResponse, UnmarshallerContext _ctx) {
		
		queryTracedEventByEventIdResponse.setRequestId(_ctx.stringValue("QueryTracedEventByEventIdResponse.RequestId"));
		queryTracedEventByEventIdResponse.setMessage(_ctx.stringValue("QueryTracedEventByEventIdResponse.Message"));
		queryTracedEventByEventIdResponse.setCode(_ctx.stringValue("QueryTracedEventByEventIdResponse.Code"));
		queryTracedEventByEventIdResponse.setSuccess(_ctx.booleanValue("QueryTracedEventByEventIdResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryTracedEventByEventIdResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setNextToken(_ctx.stringValue("QueryTracedEventByEventIdResponse.Data["+ i +"].NextToken"));
			dataItem.setTotal(_ctx.integerValue("QueryTracedEventByEventIdResponse.Data["+ i +"].Total"));

			List<EventsItem> events = new ArrayList<EventsItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryTracedEventByEventIdResponse.Data["+ i +"].Events.Length"); j++) {
				EventsItem eventsItem = new EventsItem();
				eventsItem.setEventId(_ctx.stringValue("QueryTracedEventByEventIdResponse.Data["+ i +"].Events["+ j +"].EventId"));
				eventsItem.setEventBusName(_ctx.stringValue("QueryTracedEventByEventIdResponse.Data["+ i +"].Events["+ j +"].EventBusName"));
				eventsItem.setEventReceivedTime(_ctx.longValue("QueryTracedEventByEventIdResponse.Data["+ i +"].Events["+ j +"].EventReceivedTime"));
				eventsItem.setEventSource(_ctx.stringValue("QueryTracedEventByEventIdResponse.Data["+ i +"].Events["+ j +"].EventSource"));
				eventsItem.setEventType(_ctx.stringValue("QueryTracedEventByEventIdResponse.Data["+ i +"].Events["+ j +"].EventType"));

				events.add(eventsItem);
			}
			dataItem.setEvents(events);

			data.add(dataItem);
		}
		queryTracedEventByEventIdResponse.setData(data);
	 
	 	return queryTracedEventByEventIdResponse;
	}
}