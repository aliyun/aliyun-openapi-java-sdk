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

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private Integer totalCount;

	private String nextToken;

	private List<InstanceSystemEventType> instanceSystemEventSet;

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

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<InstanceSystemEventType> getInstanceSystemEventSet() {
		return this.instanceSystemEventSet;
	}

	public void setInstanceSystemEventSet(List<InstanceSystemEventType> instanceSystemEventSet) {
		this.instanceSystemEventSet = instanceSystemEventSet;
	}

	public static class InstanceSystemEventType {

		private String eventId;

		private String eventPublishTime;

		private String eventFinishTime;

		private String resourceType;

		private String impactLevel;

		private String notBefore;

		private String instanceId;

		private String reason;

		private String reasonCode;

		private EventType eventType;

		private EventCycleStatus eventCycleStatus;

		private ExtendedAttribute extendedAttribute;

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

		public String getEventFinishTime() {
			return this.eventFinishTime;
		}

		public void setEventFinishTime(String eventFinishTime) {
			this.eventFinishTime = eventFinishTime;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getImpactLevel() {
			return this.impactLevel;
		}

		public void setImpactLevel(String impactLevel) {
			this.impactLevel = impactLevel;
		}

		public String getNotBefore() {
			return this.notBefore;
		}

		public void setNotBefore(String notBefore) {
			this.notBefore = notBefore;
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

		public String getReasonCode() {
			return this.reasonCode;
		}

		public void setReasonCode(String reasonCode) {
			this.reasonCode = reasonCode;
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

			private String hostType;

			private String hostId;

			private String onlineRepairPolicy;

			private String rack;

			private String punishType;

			private String punishDomain;

			private String punishUrl;

			private String code;

			private String canAccept;

			private String responseResult;

			private List<InactiveDisk> inactiveDisks;

			private List<String> migrationOptions;

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

			public String getHostType() {
				return this.hostType;
			}

			public void setHostType(String hostType) {
				this.hostType = hostType;
			}

			public String getHostId() {
				return this.hostId;
			}

			public void setHostId(String hostId) {
				this.hostId = hostId;
			}

			public String getOnlineRepairPolicy() {
				return this.onlineRepairPolicy;
			}

			public void setOnlineRepairPolicy(String onlineRepairPolicy) {
				this.onlineRepairPolicy = onlineRepairPolicy;
			}

			public String getRack() {
				return this.rack;
			}

			public void setRack(String rack) {
				this.rack = rack;
			}

			public String getPunishType() {
				return this.punishType;
			}

			public void setPunishType(String punishType) {
				this.punishType = punishType;
			}

			public String getPunishDomain() {
				return this.punishDomain;
			}

			public void setPunishDomain(String punishDomain) {
				this.punishDomain = punishDomain;
			}

			public String getPunishUrl() {
				return this.punishUrl;
			}

			public void setPunishUrl(String punishUrl) {
				this.punishUrl = punishUrl;
			}

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}

			public String getCanAccept() {
				return this.canAccept;
			}

			public void setCanAccept(String canAccept) {
				this.canAccept = canAccept;
			}

			public String getResponseResult() {
				return this.responseResult;
			}

			public void setResponseResult(String responseResult) {
				this.responseResult = responseResult;
			}

			public List<InactiveDisk> getInactiveDisks() {
				return this.inactiveDisks;
			}

			public void setInactiveDisks(List<InactiveDisk> inactiveDisks) {
				this.inactiveDisks = inactiveDisks;
			}

			public List<String> getMigrationOptions() {
				return this.migrationOptions;
			}

			public void setMigrationOptions(List<String> migrationOptions) {
				this.migrationOptions = migrationOptions;
			}

			public static class InactiveDisk {

				private String creationTime;

				private String deviceSize;

				private String deviceCategory;

				private String deviceType;

				private String releaseTime;

				public String getCreationTime() {
					return this.creationTime;
				}

				public void setCreationTime(String creationTime) {
					this.creationTime = creationTime;
				}

				public String getDeviceSize() {
					return this.deviceSize;
				}

				public void setDeviceSize(String deviceSize) {
					this.deviceSize = deviceSize;
				}

				public String getDeviceCategory() {
					return this.deviceCategory;
				}

				public void setDeviceCategory(String deviceCategory) {
					this.deviceCategory = deviceCategory;
				}

				public String getDeviceType() {
					return this.deviceType;
				}

				public void setDeviceType(String deviceType) {
					this.deviceType = deviceType;
				}

				public String getReleaseTime() {
					return this.releaseTime;
				}

				public void setReleaseTime(String releaseTime) {
					this.releaseTime = releaseTime;
				}
			}
		}
	}

	@Override
	public DescribeInstanceHistoryEventsResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceHistoryEventsResponseUnmarshaller.unmarshall(this, context);
	}
}
