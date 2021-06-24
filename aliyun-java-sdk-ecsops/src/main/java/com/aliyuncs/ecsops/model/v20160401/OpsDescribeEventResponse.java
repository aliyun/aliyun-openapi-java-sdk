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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeEventResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeEventResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private String success;

	private Event event;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public Event getEvent() {
		return this.event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public static class Event {

		private String eventID;

		private String cloudEventsVersion;

		private String eventTypeVersion;

		private String schemaURL;

		private Map<Object,Object> data;

		private String eventTime;

		private String source;

		private String contentType;

		private String eventType;

		private Map<Object,Object> extensions;

		public String getEventID() {
			return this.eventID;
		}

		public void setEventID(String eventID) {
			this.eventID = eventID;
		}

		public String getCloudEventsVersion() {
			return this.cloudEventsVersion;
		}

		public void setCloudEventsVersion(String cloudEventsVersion) {
			this.cloudEventsVersion = cloudEventsVersion;
		}

		public String getEventTypeVersion() {
			return this.eventTypeVersion;
		}

		public void setEventTypeVersion(String eventTypeVersion) {
			this.eventTypeVersion = eventTypeVersion;
		}

		public String getSchemaURL() {
			return this.schemaURL;
		}

		public void setSchemaURL(String schemaURL) {
			this.schemaURL = schemaURL;
		}

		public Map<Object,Object> getData() {
			return this.data;
		}

		public void setData(Map<Object,Object> data) {
			this.data = data;
		}

		public String getEventTime() {
			return this.eventTime;
		}

		public void setEventTime(String eventTime) {
			this.eventTime = eventTime;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getContentType() {
			return this.contentType;
		}

		public void setContentType(String contentType) {
			this.contentType = contentType;
		}

		public String getEventType() {
			return this.eventType;
		}

		public void setEventType(String eventType) {
			this.eventType = eventType;
		}

		public Map<Object,Object> getExtensions() {
			return this.extensions;
		}

		public void setExtensions(Map<Object,Object> extensions) {
			this.extensions = extensions;
		}
	}

	@Override
	public OpsDescribeEventResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeEventResponseUnmarshaller.unmarshall(this, context);
	}
}
