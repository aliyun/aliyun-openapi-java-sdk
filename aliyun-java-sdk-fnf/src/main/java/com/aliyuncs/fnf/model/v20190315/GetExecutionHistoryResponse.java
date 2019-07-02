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

package com.aliyuncs.fnf.model.v20190315;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.fnf.transform.v20190315.GetExecutionHistoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetExecutionHistoryResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private List<EventsItem> events;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<EventsItem> getEvents() {
		return this.events;
	}

	public void setEvents(List<EventsItem> events) {
		this.events = events;
	}

	public static class EventsItem {

		private String stepName;

		private String type;

		private Long eventId;

		private Long scheduleEventId;

		private String eventDetail;

		private String time;

		public String getStepName() {
			return this.stepName;
		}

		public void setStepName(String stepName) {
			this.stepName = stepName;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Long getEventId() {
			return this.eventId;
		}

		public void setEventId(Long eventId) {
			this.eventId = eventId;
		}

		public Long getScheduleEventId() {
			return this.scheduleEventId;
		}

		public void setScheduleEventId(Long scheduleEventId) {
			this.scheduleEventId = scheduleEventId;
		}

		public String getEventDetail() {
			return this.eventDetail;
		}

		public void setEventDetail(String eventDetail) {
			this.eventDetail = eventDetail;
		}

		public String getTime() {
			return this.time;
		}

		public void setTime(String time) {
			this.time = time;
		}
	}

	@Override
	public GetExecutionHistoryResponse getInstance(UnmarshallerContext context) {
		return	GetExecutionHistoryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
