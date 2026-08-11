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

	private Integer totalCount;

	private Integer pageSize;

	private String requestId;

	private String nextToken;

	private Integer pageNumber;

	private List<InstanceSystemEventType> instanceSystemEventSet;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
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

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<InstanceSystemEventType> getInstanceSystemEventSet() {
		return this.instanceSystemEventSet;
	}

	public void setInstanceSystemEventSet(List<InstanceSystemEventType> instanceSystemEventSet) {
		this.instanceSystemEventSet = instanceSystemEventSet;
	}

	public static class InstanceSystemEventType {

		private String eventFinishTime;

		private String eventPublishTime;

		private String instanceId;

		private String impactLevel;

		private String eventId;

		private String resourceType;

		private String notBefore;

		private String reasonCode;

		private String reason;

		private EventCycleStatus eventCycleStatus;

		private EventType eventType;

		private ExtendedAttribute extendedAttribute;

		public String getEventFinishTime() {
			return this.eventFinishTime;
		}

		public void setEventFinishTime(String eventFinishTime) {
			this.eventFinishTime = eventFinishTime;
		}

		public String getEventPublishTime() {
			return this.eventPublishTime;
		}

		public void setEventPublishTime(String eventPublishTime) {
			this.eventPublishTime = eventPublishTime;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getImpactLevel() {
			return this.impactLevel;
		}

		public void setImpactLevel(String impactLevel) {
			this.impactLevel = impactLevel;
		}

		public String getEventId() {
			return this.eventId;
		}

		public void setEventId(String eventId) {
			this.eventId = eventId;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getNotBefore() {
			return this.notBefore;
		}

		public void setNotBefore(String notBefore) {
			this.notBefore = notBefore;
		}

		public String getReasonCode() {
			return this.reasonCode;
		}

		public void setReasonCode(String reasonCode) {
			this.reasonCode = reasonCode;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public EventCycleStatus getEventCycleStatus() {
			return this.eventCycleStatus;
		}

		public void setEventCycleStatus(EventCycleStatus eventCycleStatus) {
			this.eventCycleStatus = eventCycleStatus;
		}

		public EventType getEventType() {
			return this.eventType;
		}

		public void setEventType(EventType eventType) {
			this.eventType = eventType;
		}

		public ExtendedAttribute getExtendedAttribute() {
			return this.extendedAttribute;
		}

		public void setExtendedAttribute(ExtendedAttribute extendedAttribute) {
			this.extendedAttribute = extendedAttribute;
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

		public static class ExtendedAttribute {

			private String device;

			private String punishType;

			private String punishDomain;

			private String initialNotBefore;

			private String hostId;

			private String code;

			private String canAccept;

			private String rack;

			private String punishUrl;

			private String metricName;

			private String hostType;

			private String metricValue;

			private String responseResult;

			private String diskId;

			private String onlineRepairPolicy;

			private List<InactiveDisk> inactiveDisks;

			private List<String> migrationOptions;

			public String getDevice() {
				return this.device;
			}

			public void setDevice(String device) {
				this.device = device;
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

			public String getInitialNotBefore() {
				return this.initialNotBefore;
			}

			public void setInitialNotBefore(String initialNotBefore) {
				this.initialNotBefore = initialNotBefore;
			}

			public String getHostId() {
				return this.hostId;
			}

			public void setHostId(String hostId) {
				this.hostId = hostId;
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

			public String getRack() {
				return this.rack;
			}

			public void setRack(String rack) {
				this.rack = rack;
			}

			public String getPunishUrl() {
				return this.punishUrl;
			}

			public void setPunishUrl(String punishUrl) {
				this.punishUrl = punishUrl;
			}

			public String getMetricName() {
				return this.metricName;
			}

			public void setMetricName(String metricName) {
				this.metricName = metricName;
			}

			public String getHostType() {
				return this.hostType;
			}

			public void setHostType(String hostType) {
				this.hostType = hostType;
			}

			public String getMetricValue() {
				return this.metricValue;
			}

			public void setMetricValue(String metricValue) {
				this.metricValue = metricValue;
			}

			public String getResponseResult() {
				return this.responseResult;
			}

			public void setResponseResult(String responseResult) {
				this.responseResult = responseResult;
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

				private String deviceType;

				private String releaseTime;

				private String deviceSize;

				private String creationTime;

				private String deviceCategory;

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

				public String getDeviceSize() {
					return this.deviceSize;
				}

				public void setDeviceSize(String deviceSize) {
					this.deviceSize = deviceSize;
				}

				public String getCreationTime() {
					return this.creationTime;
				}

				public void setCreationTime(String creationTime) {
					this.creationTime = creationTime;
				}

				public String getDeviceCategory() {
					return this.deviceCategory;
				}

				public void setDeviceCategory(String deviceCategory) {
					this.deviceCategory = deviceCategory;
				}
			}
		}
	}

	@Override
	public DescribeInstanceHistoryEventsResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceHistoryEventsResponseUnmarshaller.unmarshall(this, context);
	}
}
