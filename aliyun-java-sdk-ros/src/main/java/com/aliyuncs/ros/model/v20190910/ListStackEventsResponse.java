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

package com.aliyuncs.ros.model.v20190910;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ros.transform.v20190910.ListStackEventsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListStackEventsResponse extends AcsResponse {

	private Integer pageNumber;

	private Integer pageSize;

	private String requestId;

	private Integer totalCount;

	private List<Event> events;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

		private String createTime;

		private String eventId;

		private String logicalResourceId;

		private String physicalResourceId;

		private String resourceType;

		private String stackId;

		private String stackName;

		private String status;

		private String statusReason;

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getEventId() {
			return this.eventId;
		}

		public void setEventId(String eventId) {
			this.eventId = eventId;
		}

		public String getLogicalResourceId() {
			return this.logicalResourceId;
		}

		public void setLogicalResourceId(String logicalResourceId) {
			this.logicalResourceId = logicalResourceId;
		}

		public String getPhysicalResourceId() {
			return this.physicalResourceId;
		}

		public void setPhysicalResourceId(String physicalResourceId) {
			this.physicalResourceId = physicalResourceId;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getStackId() {
			return this.stackId;
		}

		public void setStackId(String stackId) {
			this.stackId = stackId;
		}

		public String getStackName() {
			return this.stackName;
		}

		public void setStackName(String stackName) {
			this.stackName = stackName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getStatusReason() {
			return this.statusReason;
		}

		public void setStatusReason(String statusReason) {
			this.statusReason = statusReason;
		}
	}

	@Override
	public ListStackEventsResponse getInstance(UnmarshallerContext context) {
		return	ListStackEventsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
