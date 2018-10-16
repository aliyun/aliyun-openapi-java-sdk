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
import com.aliyuncs.ecs.transform.v20140526.DescribeDisksFullStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDisksFullStatusResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<DiskFullStatusType> diskFullStatusSet;

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

	public List<DiskFullStatusType> getDiskFullStatusSet() {
		return this.diskFullStatusSet;
	}

	public void setDiskFullStatusSet(List<DiskFullStatusType> diskFullStatusSet) {
		this.diskFullStatusSet = diskFullStatusSet;
	}

	public static class DiskFullStatusType {

		private String diskId;

		private String instanceId;

		private String device;

		private List<DiskEventType> diskEventSet;

		private Status status;

		private HealthStatus healthStatus;

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

		public String getDevice() {
			return this.device;
		}

		public void setDevice(String device) {
			this.device = device;
		}

		public List<DiskEventType> getDiskEventSet() {
			return this.diskEventSet;
		}

		public void setDiskEventSet(List<DiskEventType> diskEventSet) {
			this.diskEventSet = diskEventSet;
		}

		public Status getStatus() {
			return this.status;
		}

		public void setStatus(Status status) {
			this.status = status;
		}

		public HealthStatus getHealthStatus() {
			return this.healthStatus;
		}

		public void setHealthStatus(HealthStatus healthStatus) {
			this.healthStatus = healthStatus;
		}

		public static class DiskEventType {

			private String eventId;

			private String eventTime;

			private String eventEndTime;

			private EventType eventType;

			public String getEventId() {
				return this.eventId;
			}

			public void setEventId(String eventId) {
				this.eventId = eventId;
			}

			public String getEventTime() {
				return this.eventTime;
			}

			public void setEventTime(String eventTime) {
				this.eventTime = eventTime;
			}

			public String getEventEndTime() {
				return this.eventEndTime;
			}

			public void setEventEndTime(String eventEndTime) {
				this.eventEndTime = eventEndTime;
			}

			public EventType getEventType() {
				return this.eventType;
			}

			public void setEventType(EventType eventType) {
				this.eventType = eventType;
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
		}

		public static class Status {

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

		public static class HealthStatus {

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
	}

	@Override
	public DescribeDisksFullStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeDisksFullStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
