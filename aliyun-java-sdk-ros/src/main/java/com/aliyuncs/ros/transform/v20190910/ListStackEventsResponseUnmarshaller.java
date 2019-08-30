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

package com.aliyuncs.ros.transform.v20190910;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ros.model.v20190910.ListStackEventsResponse;
import com.aliyuncs.ros.model.v20190910.ListStackEventsResponse.Event;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListStackEventsResponseUnmarshaller {

	public static ListStackEventsResponse unmarshall(ListStackEventsResponse listStackEventsResponse, UnmarshallerContext _ctx) {
		
		listStackEventsResponse.setRequestId(_ctx.stringValue("ListStackEventsResponse.RequestId"));
		listStackEventsResponse.setPageNumber(_ctx.integerValue("ListStackEventsResponse.PageNumber"));
		listStackEventsResponse.setPageSize(_ctx.integerValue("ListStackEventsResponse.PageSize"));
		listStackEventsResponse.setTotalCount(_ctx.integerValue("ListStackEventsResponse.TotalCount"));

		List<Event> events = new ArrayList<Event>();
		for (int i = 0; i < _ctx.lengthValue("ListStackEventsResponse.Events.Length"); i++) {
			Event event = new Event();
			event.setCreateTime(_ctx.stringValue("ListStackEventsResponse.Events["+ i +"].CreateTime"));
			event.setEventId(_ctx.stringValue("ListStackEventsResponse.Events["+ i +"].EventId"));
			event.setLogicalResourceId(_ctx.stringValue("ListStackEventsResponse.Events["+ i +"].LogicalResourceId"));
			event.setPhysicalResourceId(_ctx.stringValue("ListStackEventsResponse.Events["+ i +"].PhysicalResourceId"));
			event.setResourceType(_ctx.stringValue("ListStackEventsResponse.Events["+ i +"].ResourceType"));
			event.setStackId(_ctx.stringValue("ListStackEventsResponse.Events["+ i +"].StackId"));
			event.setStackName(_ctx.stringValue("ListStackEventsResponse.Events["+ i +"].StackName"));
			event.setStatus(_ctx.stringValue("ListStackEventsResponse.Events["+ i +"].Status"));
			event.setStatusReason(_ctx.stringValue("ListStackEventsResponse.Events["+ i +"].StatusReason"));

			events.add(event);
		}
		listStackEventsResponse.setEvents(events);
	 
	 	return listStackEventsResponse;
	}
}