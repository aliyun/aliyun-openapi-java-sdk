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

package com.aliyuncs.polardbx.model.v20200202;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardbx.transform.v20200202.DescribeEventsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEventsResponse extends AcsResponse {

	private String requestId;

	private Long totalRecordCount;

	private Long pageSize;

	private Long pageNumber;

	private List<EventItemsItem> eventItems;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Long totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<EventItemsItem> getEventItems() {
		return this.eventItems;
	}

	public void setEventItems(List<EventItemsItem> eventItems) {
		this.eventItems = eventItems;
	}

	public static class EventItemsItem {

		private Long eventId;

		private String eventName;

		private String eventPayload;

		private String eventReason;

		private String eventRecordTime;

		private String eventTime;

		private String eventType;

		private String eventUserType;

		private String regionId;

		private String resourceName;

		private String resourceType;

		public Long getEventId() {
			return this.eventId;
		}

		public void setEventId(Long eventId) {
			this.eventId = eventId;
		}

		public String getEventName() {
			return this.eventName;
		}

		public void setEventName(String eventName) {
			this.eventName = eventName;
		}

		public String getEventPayload() {
			return this.eventPayload;
		}

		public void setEventPayload(String eventPayload) {
			this.eventPayload = eventPayload;
		}

		public String getEventReason() {
			return this.eventReason;
		}

		public void setEventReason(String eventReason) {
			this.eventReason = eventReason;
		}

		public String getEventRecordTime() {
			return this.eventRecordTime;
		}

		public void setEventRecordTime(String eventRecordTime) {
			this.eventRecordTime = eventRecordTime;
		}

		public String getEventTime() {
			return this.eventTime;
		}

		public void setEventTime(String eventTime) {
			this.eventTime = eventTime;
		}

		public String getEventType() {
			return this.eventType;
		}

		public void setEventType(String eventType) {
			this.eventType = eventType;
		}

		public String getEventUserType() {
			return this.eventUserType;
		}

		public void setEventUserType(String eventUserType) {
			this.eventUserType = eventUserType;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getResourceName() {
			return this.resourceName;
		}

		public void setResourceName(String resourceName) {
			this.resourceName = resourceName;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}
	}

	@Override
	public DescribeEventsResponse getInstance(UnmarshallerContext context) {
		return	DescribeEventsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
