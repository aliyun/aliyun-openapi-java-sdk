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

package com.aliyuncs.eas.model.v20210701;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eas.transform.v20210701.DescribeServiceEventResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeServiceEventResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private Long totalPageNum;

	private Long pageNum;

	private List<EventsItem> events;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Long getTotalPageNum() {
		return this.totalPageNum;
	}

	public void setTotalPageNum(Long totalPageNum) {
		this.totalPageNum = totalPageNum;
	}

	public Long getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public List<EventsItem> getEvents() {
		return this.events;
	}

	public void setEvents(List<EventsItem> events) {
		this.events = events;
	}

	public static class EventsItem {

		private String type;

		private String reason;

		private String message;

		private String time;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getTime() {
			return this.time;
		}

		public void setTime(String time) {
			this.time = time;
		}
	}

	@Override
	public DescribeServiceEventResponse getInstance(UnmarshallerContext context) {
		return	DescribeServiceEventResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
