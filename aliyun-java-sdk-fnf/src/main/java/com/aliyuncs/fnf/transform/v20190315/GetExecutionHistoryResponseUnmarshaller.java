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

package com.aliyuncs.fnf.transform.v20190315;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.fnf.model.v20190315.GetExecutionHistoryResponse;
import com.aliyuncs.fnf.model.v20190315.GetExecutionHistoryResponse.EventsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetExecutionHistoryResponseUnmarshaller {

	public static GetExecutionHistoryResponse unmarshall(GetExecutionHistoryResponse getExecutionHistoryResponse, UnmarshallerContext _ctx) {
		
		getExecutionHistoryResponse.setRequestId(_ctx.stringValue("GetExecutionHistoryResponse.RequestId"));
		getExecutionHistoryResponse.setNextToken(_ctx.stringValue("GetExecutionHistoryResponse.NextToken"));

		List<EventsItem> events = new ArrayList<EventsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetExecutionHistoryResponse.Events.Length"); i++) {
			EventsItem eventsItem = new EventsItem();
			eventsItem.setStepName(_ctx.stringValue("GetExecutionHistoryResponse.Events["+ i +"].StepName"));
			eventsItem.setType(_ctx.stringValue("GetExecutionHistoryResponse.Events["+ i +"].Type"));
			eventsItem.setEventId(_ctx.longValue("GetExecutionHistoryResponse.Events["+ i +"].EventId"));
			eventsItem.setScheduleEventId(_ctx.longValue("GetExecutionHistoryResponse.Events["+ i +"].ScheduleEventId"));
			eventsItem.setEventDetail(_ctx.stringValue("GetExecutionHistoryResponse.Events["+ i +"].EventDetail"));
			eventsItem.setTime(_ctx.stringValue("GetExecutionHistoryResponse.Events["+ i +"].Time"));

			events.add(eventsItem);
		}
		getExecutionHistoryResponse.setEvents(events);
	 
	 	return getExecutionHistoryResponse;
	}
}