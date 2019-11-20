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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeInstanceHistoryEventsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceHistoryEventsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<InstanceSystemEventType> instanceSystemEventSet;

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

	public List<InstanceSystemEventType> getInstanceSystemEventSet() {
		return this.instanceSystemEventSet;
	}

	public void setInstanceSystemEventSet(List<InstanceSystemEventType> instanceSystemEventSet) {
		this.instanceSystemEventSet = instanceSystemEventSet;
	}

	public static class InstanceSystemEventType {

		private String instanceId;

		private String eventId;

		private String eventPublishTime;

		private String notBefore;

		private String eventFinishTime;

		private String reason;

		private EventType eventType;

		private EventCycleStatus eventCycleStatus;

		private ExtendedAttribute extendedAttribute;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getEventId() {
			return this.eventId;
		}

		public void setEventId(String eventId) {
			this.eventId = eventId;
		}

		public String getEventPublishTime() {
			return this.eventPublishTime;
		}

		public void setEventPublishTime(String eventPublishTime) {
			this.eventPublishTime = eventPublishTime;
		}

		public String getNotBefore() {
			return this.notBefore;
		}

		public void setNotBefore(String notBefore) {
			this.notBefore = notBefore;
		}

		public String getEventFinishTime() {
			return this.eventFinishTime;
		}

		public void setEventFinishTime(String eventFinishTime) {
			this.eventFinishTime = eventFinishTime;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public EventType getEventType() {
			return this.eventType;
		}

		public void setEventType(EventType eventType) {
			this.eventType = eventType;
		}

		public EventCycleStatus getEventCycleStatus() {
			return this.eventCycleStatus;
		}

		public void setEventCycleStatus(EventCycleStatus eventCycleStatus) {
			this.eventCycleStatus = eventCycleStatus;
		}

		public ExtendedAttribute getExtendedAttribute() {
			return this.extendedAttribute;
		}

		public void setExtendedAttribute(ExtendedAttribute extendedAttribute) {
			this.extendedAttribute = extendedAttribute;
		}

		public static class EventType {

			private Integer code;

			private String name;

			public Integer getCode() {
				return this.code;
			}

			public void setCode(Integer code) {
				this.code = code;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}

		public static class EventCycleStatus {

			private Integer code;

			private String name;

			public Integer getCode() {
				return this.code;
			}

			public void setCode(Integer code) {
				this.code = code;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}

		public static class ExtendedAttribute {

			private String diskId;

			private String device;

			public String getDiskId() {
				return this.diskId;
			}

			public void setDiskId(String diskId) {
				this.diskId = diskId;
			}

			public String getDevice() {
				return this.device;
			}

			public void setDevice(String device) {
				this.device = device;
			}
		}
	}

	@Override
	public DescribeInstanceHistoryEventsResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceHistoryEventsResponseUnmarshaller.unmarshall(this, context);
	}
}
