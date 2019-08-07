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

package com.aliyuncs.webplus.transform.v20190320;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.webplus.model.v20190320.DescribeEventsResponse;
import com.aliyuncs.webplus.model.v20190320.DescribeEventsResponse.Event;
import com.aliyuncs.webplus.model.v20190320.DescribeEventsResponse.Event.ObjectAttr;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEventsResponseUnmarshaller {

	public static DescribeEventsResponse unmarshall(DescribeEventsResponse describeEventsResponse, UnmarshallerContext _ctx) {
		
		describeEventsResponse.setRequestId(_ctx.stringValue("DescribeEventsResponse.RequestId"));
		describeEventsResponse.setCode(_ctx.stringValue("DescribeEventsResponse.Code"));
		describeEventsResponse.setMessage(_ctx.stringValue("DescribeEventsResponse.Message"));
		describeEventsResponse.setPageNumber(_ctx.integerValue("DescribeEventsResponse.PageNumber"));
		describeEventsResponse.setPageSize(_ctx.integerValue("DescribeEventsResponse.PageSize"));
		describeEventsResponse.setTotalCount(_ctx.integerValue("DescribeEventsResponse.TotalCount"));

		List<Event> events = new ArrayList<Event>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEventsResponse.Events.Length"); i++) {
			Event event = new Event();
			event.setEventId(_ctx.stringValue("DescribeEventsResponse.Events["+ i +"].EventId"));
			event.setEventTimestamp(_ctx.longValue("DescribeEventsResponse.Events["+ i +"].EventTimestamp"));
			event.setEventMessage(_ctx.stringValue("DescribeEventsResponse.Events["+ i +"].EventMessage"));
			event.setEnvId(_ctx.stringValue("DescribeEventsResponse.Events["+ i +"].EnvId"));
			event.setAppId(_ctx.stringValue("DescribeEventsResponse.Events["+ i +"].AppId"));
			event.setEventLevel(_ctx.stringValue("DescribeEventsResponse.Events["+ i +"].EventLevel"));
			event.setTraceId(_ctx.stringValue("DescribeEventsResponse.Events["+ i +"].TraceId"));
			event.setEnventName(_ctx.stringValue("DescribeEventsResponse.Events["+ i +"].EnventName"));
			event.setMsgCode(_ctx.stringValue("DescribeEventsResponse.Events["+ i +"].MsgCode"));
			event.setPrimaryUserId(_ctx.stringValue("DescribeEventsResponse.Events["+ i +"].PrimaryUserId"));
			event.setPrimaryUserName(_ctx.stringValue("DescribeEventsResponse.Events["+ i +"].PrimaryUserName"));
			event.setSecondUserId(_ctx.stringValue("DescribeEventsResponse.Events["+ i +"].SecondUserId"));
			event.setSecondUserName(_ctx.stringValue("DescribeEventsResponse.Events["+ i +"].SecondUserName"));
			event.setObjectId(_ctx.stringValue("DescribeEventsResponse.Events["+ i +"].ObjectId"));
			event.setObjectName(_ctx.stringValue("DescribeEventsResponse.Events["+ i +"].ObjectName"));
			event.setObjectType(_ctx.stringValue("DescribeEventsResponse.Events["+ i +"].ObjectType"));

			List<String> msgParams = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeEventsResponse.Events["+ i +"].MsgParams.Length"); j++) {
				msgParams.add(_ctx.stringValue("DescribeEventsResponse.Events["+ i +"].MsgParams["+ j +"]"));
			}
			event.setMsgParams(msgParams);

			List<ObjectAttr> objectAttrs = new ArrayList<ObjectAttr>();
			for (int j = 0; j < _ctx.lengthValue("DescribeEventsResponse.Events["+ i +"].ObjectAttrs.Length"); j++) {
				ObjectAttr objectAttr = new ObjectAttr();
				objectAttr.setAttributeName(_ctx.stringValue("DescribeEventsResponse.Events["+ i +"].ObjectAttrs["+ j +"].AttributeName"));
				objectAttr.setAttributeValue(_ctx.stringValue("DescribeEventsResponse.Events["+ i +"].ObjectAttrs["+ j +"].AttributeValue"));

				objectAttrs.add(objectAttr);
			}
			event.setObjectAttrs(objectAttrs);

			events.add(event);
		}
		describeEventsResponse.setEvents(events);
	 
	 	return describeEventsResponse;
	}
}