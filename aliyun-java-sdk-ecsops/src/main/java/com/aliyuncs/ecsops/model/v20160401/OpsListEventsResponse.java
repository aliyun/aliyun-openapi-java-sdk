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

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsListEventsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsListEventsResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private String success;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<Event> events;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Event> getEvents() {
		return this.events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	public static class Event {

		private String eventID;

		private String eventType;

		private String eventTypeVersion;

		private String cloudEventsVersion;

		private String source;

		private String eventTime;

		private String schemaURL;

		private String contentType;

		private Map<Object,Object> extensions;

		private Map<Object,Object> data;

		public String getEventID() {
			return this.eventID;
		}

		public void setEventID(String eventID) {
			this.eventID = eventID;
		}

		public String getEventType() {
			return this.eventType;
		}

		public void setEventType(String eventType) {
			this.eventType = eventType;
		}

		public String getEventTypeVersion() {
			return this.eventTypeVersion;
		}

		public void setEventTypeVersion(String eventTypeVersion) {
			this.eventTypeVersion = eventTypeVersion;
		}

		public String getCloudEventsVersion() {
			return this.cloudEventsVersion;
		}

		public void setCloudEventsVersion(String cloudEventsVersion) {
			this.cloudEventsVersion = cloudEventsVersion;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getEventTime() {
			return this.eventTime;
		}

		public void setEventTime(String eventTime) {
			this.eventTime = eventTime;
		}

		public String getSchemaURL() {
			return this.schemaURL;
		}

		public void setSchemaURL(String schemaURL) {
			this.schemaURL = schemaURL;
		}

		public String getContentType() {
			return this.contentType;
		}

		public void setContentType(String contentType) {
			this.contentType = contentType;
		}

		public Map<Object,Object> getExtensions() {
			return this.extensions;
		}

		public void setExtensions(Map<Object,Object> extensions) {
			this.extensions = extensions;
		}

		public Map<Object,Object> getData() {
			return this.data;
		}

		public void setData(Map<Object,Object> data) {
			this.data = data;
		}
	}

	@Override
	public OpsListEventsResponse getInstance(UnmarshallerContext context) {
		return	OpsListEventsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
