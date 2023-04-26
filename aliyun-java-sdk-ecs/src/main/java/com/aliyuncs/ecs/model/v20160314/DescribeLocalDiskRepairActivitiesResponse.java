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

package com.aliyuncs.ecs.model.v20160314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20160314.DescribeLocalDiskRepairActivitiesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLocalDiskRepairActivitiesResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private Integer totalCount;

	private List<LocalDiskRepairActivity> localDiskRepairActivities;

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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<LocalDiskRepairActivity> getLocalDiskRepairActivities() {
		return this.localDiskRepairActivities;
	}

	public void setLocalDiskRepairActivities(List<LocalDiskRepairActivity> localDiskRepairActivities) {
		this.localDiskRepairActivities = localDiskRepairActivities;
	}

	public static class LocalDiskRepairActivity {

		private String diskId;

		private String instanceId;

		private String progress;

		private List<InstanceEvent> instanceEvents;

		private DiskEvent diskEvent;

		public String getDiskId() {
			return this.diskId;
		}

		public void setDiskId(String diskId) {
			this.diskId = diskId;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getProgress() {
			return this.progress;
		}

		public void setProgress(String progress) {
			this.progress = progress;
		}

		public List<InstanceEvent> getInstanceEvents() {
			return this.instanceEvents;
		}

		public void setInstanceEvents(List<InstanceEvent> instanceEvents) {
			this.instanceEvents = instanceEvents;
		}

		public DiskEvent getDiskEvent() {
			return this.diskEvent;
		}

		public void setDiskEvent(DiskEvent diskEvent) {
			this.diskEvent = diskEvent;
		}

		public static class InstanceEvent {

			private String eventPublishTime;

			private String eventId;

			private String eventFinishTime;

			private String instanceId;

			private String reason;

			private EventType eventType;

			private EventCycleStatus eventCycleStatus;

			private ExtendedAttribute extendedAttribute;

			public String getEventPublishTime() {
				return this.eventPublishTime;
			}

			public void setEventPublishTime(String eventPublishTime) {
				this.eventPublishTime = eventPublishTime;
			}

			public String getEventId() {
				return this.eventId;
			}

			public void setEventId(String eventId) {
				this.eventId = eventId;
			}

			public String getEventFinishTime() {
				return this.eventFinishTime;
			}

			public void setEventFinishTime(String eventFinishTime) {
				this.eventFinishTime = eventFinishTime;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
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

				private String name;

				private Integer code;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public Integer getCode() {
					return this.code;
				}

				public void setCode(Integer code) {
					this.code = code;
				}
			}

			public static class EventCycleStatus {

				private String name;

				private Integer code;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public Integer getCode() {
					return this.code;
				}

				public void setCode(Integer code) {
					this.code = code;
				}
			}

			public static class ExtendedAttribute {

				private String device;

				private String diskId;

				private String onlineRepairPolicy;

				public String getDevice() {
					return this.device;
				}

				public void setDevice(String device) {
					this.device = device;
				}

				public String getDiskId() {
					return this.diskId;
				}

				public void setDiskId(String diskId) {
					this.diskId = diskId;
				}

				public String getOnlineRepairPolicy() {
					return this.onlineRepairPolicy;
				}

				public void setOnlineRepairPolicy(String onlineRepairPolicy) {
					this.onlineRepairPolicy = onlineRepairPolicy;
				}
			}
		}

		public static class DiskEvent {

			private String eventId;

			private String eventEndTime;

			private String eventTime;

			private EventType1 eventType1;

			public String getEventId() {
				return this.eventId;
			}

			public void setEventId(String eventId) {
				this.eventId = eventId;
			}

			public String getEventEndTime() {
				return this.eventEndTime;
			}

			public void setEventEndTime(String eventEndTime) {
				this.eventEndTime = eventEndTime;
			}

			public String getEventTime() {
				return this.eventTime;
			}

			public void setEventTime(String eventTime) {
				this.eventTime = eventTime;
			}

			public EventType1 getEventType1() {
				return this.eventType1;
			}

			public void setEventType1(EventType1 eventType1) {
				this.eventType1 = eventType1;
			}

			public static class EventType1 {

				private String name;

				private Integer code;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public Integer getCode() {
					return this.code;
				}

				public void setCode(Integer code) {
					this.code = code;
				}
			}
		}
	}

	@Override
	public DescribeLocalDiskRepairActivitiesResponse getInstance(UnmarshallerContext context) {
		return	DescribeLocalDiskRepairActivitiesResponseUnmarshaller.unmarshall(this, context);
	}
}
