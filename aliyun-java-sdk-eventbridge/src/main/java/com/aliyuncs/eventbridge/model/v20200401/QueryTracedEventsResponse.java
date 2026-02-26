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

package com.aliyuncs.eventbridge.model.v20200401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eventbridge.transform.v20200401.QueryTracedEventsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryTracedEventsResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private Boolean success;

	private Data data;

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String nextToken;

		private Integer total;

		private List<EventsItem> events;

		public String getNextToken() {
			return this.nextToken;
		}

		public void setNextToken(String nextToken) {
			this.nextToken = nextToken;
		}

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public List<EventsItem> getEvents() {
			return this.events;
		}

		public void setEvents(List<EventsItem> events) {
			this.events = events;
		}

		public static class EventsItem {

			private String eventId;

			private String eventBusName;

			private Long eventReceivedTime;

			private String eventSource;

			private String eventType;

			public String getEventId() {
				return this.eventId;
			}

			public void setEventId(String eventId) {
				this.eventId = eventId;
			}

			public String getEventBusName() {
				return this.eventBusName;
			}

			public void setEventBusName(String eventBusName) {
				this.eventBusName = eventBusName;
			}

			public Long getEventReceivedTime() {
				return this.eventReceivedTime;
			}

			public void setEventReceivedTime(Long eventReceivedTime) {
				this.eventReceivedTime = eventReceivedTime;
			}

			public String getEventSource() {
				return this.eventSource;
			}

			public void setEventSource(String eventSource) {
				this.eventSource = eventSource;
			}

			public String getEventType() {
				return this.eventType;
			}

			public void setEventType(String eventType) {
				this.eventType = eventType;
			}
		}
	}

	@Override
	public QueryTracedEventsResponse getInstance(UnmarshallerContext context) {
		return	QueryTracedEventsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
