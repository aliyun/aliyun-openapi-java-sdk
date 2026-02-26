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

package com.aliyuncs.eas.transform.v20210701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eas.model.v20210701.DescribeServiceEventResponse;
import com.aliyuncs.eas.model.v20210701.DescribeServiceEventResponse.EventsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeServiceEventResponseUnmarshaller {

	public static DescribeServiceEventResponse unmarshall(DescribeServiceEventResponse describeServiceEventResponse, UnmarshallerContext _ctx) {
		
		describeServiceEventResponse.setRequestId(_ctx.stringValue("DescribeServiceEventResponse.RequestId"));
		describeServiceEventResponse.setTotalCount(_ctx.longValue("DescribeServiceEventResponse.TotalCount"));
		describeServiceEventResponse.setTotalPageNum(_ctx.longValue("DescribeServiceEventResponse.TotalPageNum"));
		describeServiceEventResponse.setPageNum(_ctx.longValue("DescribeServiceEventResponse.PageNum"));

		List<EventsItem> events = new ArrayList<EventsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeServiceEventResponse.Events.Length"); i++) {
			EventsItem eventsItem = new EventsItem();
			eventsItem.setType(_ctx.stringValue("DescribeServiceEventResponse.Events["+ i +"].Type"));
			eventsItem.setReason(_ctx.stringValue("DescribeServiceEventResponse.Events["+ i +"].Reason"));
			eventsItem.setMessage(_ctx.stringValue("DescribeServiceEventResponse.Events["+ i +"].Message"));
			eventsItem.setTime(_ctx.stringValue("DescribeServiceEventResponse.Events["+ i +"].Time"));

			events.add(eventsItem);
		}
		describeServiceEventResponse.setEvents(events);
	 
	 	return describeServiceEventResponse;
	}
}