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

package com.aliyuncs.ecsops.transform.v20160401;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeEventResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeEventResponse.Event;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeEventResponseUnmarshaller {

	public static OpsDescribeEventResponse unmarshall(OpsDescribeEventResponse opsDescribeEventResponse, UnmarshallerContext _ctx) {
		
		opsDescribeEventResponse.setRequestId(_ctx.stringValue("OpsDescribeEventResponse.RequestId"));
		opsDescribeEventResponse.setCode(_ctx.stringValue("OpsDescribeEventResponse.Code"));
		opsDescribeEventResponse.setMessage(_ctx.stringValue("OpsDescribeEventResponse.Message"));
		opsDescribeEventResponse.setSuccess(_ctx.stringValue("OpsDescribeEventResponse.Success"));

		Event event = new Event();
		event.setEventID(_ctx.stringValue("OpsDescribeEventResponse.Event.eventID"));
		event.setEventType(_ctx.stringValue("OpsDescribeEventResponse.Event.eventType"));
		event.setEventTypeVersion(_ctx.stringValue("OpsDescribeEventResponse.Event.eventTypeVersion"));
		event.setCloudEventsVersion(_ctx.stringValue("OpsDescribeEventResponse.Event.cloudEventsVersion"));
		event.setSource(_ctx.stringValue("OpsDescribeEventResponse.Event.source"));
		event.setEventTime(_ctx.stringValue("OpsDescribeEventResponse.Event.eventTime"));
		event.setSchemaURL(_ctx.stringValue("OpsDescribeEventResponse.Event.schemaURL"));
		event.setContentType(_ctx.stringValue("OpsDescribeEventResponse.Event.contentType"));
		event.setExtensions(_ctx.mapValue("OpsDescribeEventResponse.Event.extensions"));
		event.setData(_ctx.mapValue("OpsDescribeEventResponse.Event.data"));
		opsDescribeEventResponse.setEvent(event);
	 
	 	return opsDescribeEventResponse;
	}
}