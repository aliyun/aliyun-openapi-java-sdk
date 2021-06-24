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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeCloudOpsVmOpsEventsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeCloudOpsVmOpsEventsResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private Integer pageSize;

	private String bizMessage;

	private Integer page;

	private Integer count;

	private String bizCode;

	private List<OpsEventInfo> data;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getBizMessage() {
		return this.bizMessage;
	}

	public void setBizMessage(String bizMessage) {
		this.bizMessage = bizMessage;
	}

	public Integer getPage() {
		return this.page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getBizCode() {
		return this.bizCode;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public List<OpsEventInfo> getData() {
		return this.data;
	}

	public void setData(List<OpsEventInfo> data) {
		this.data = data;
	}

	public static class OpsEventInfo {

		private String extendData;

		private String comment;

		private String eventType;

		private String clusterName;

		private String eventStatus;

		private String vmName;

		private Long id;

		private List<EventInfo> eventInfos;

		private MaintenanceReason maintenanceReason;

		public String getExtendData() {
			return this.extendData;
		}

		public void setExtendData(String extendData) {
			this.extendData = extendData;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public String getEventType() {
			return this.eventType;
		}

		public void setEventType(String eventType) {
			this.eventType = eventType;
		}

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}

		public String getEventStatus() {
			return this.eventStatus;
		}

		public void setEventStatus(String eventStatus) {
			this.eventStatus = eventStatus;
		}

		public String getVmName() {
			return this.vmName;
		}

		public void setVmName(String vmName) {
			this.vmName = vmName;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public List<EventInfo> getEventInfos() {
			return this.eventInfos;
		}

		public void setEventInfos(List<EventInfo> eventInfos) {
			this.eventInfos = eventInfos;
		}

		public MaintenanceReason getMaintenanceReason() {
			return this.maintenanceReason;
		}

		public void setMaintenanceReason(MaintenanceReason maintenanceReason) {
			this.maintenanceReason = maintenanceReason;
		}

		public static class EventInfo {

			private String eventFinishTime;

			private String eventStartTime;

			private String updateTime;

			private String extendData;

			private String comment;

			private String userAction;

			private String planTime;

			private String ncIp;

			private String publishTime;

			private String eventType;

			private String eventStatus;

			private String clusterName;

			private String opsUser;

			private String reason;

			private Long id;

			private MaintenanceReason1 maintenanceReason1;

			public String getEventFinishTime() {
				return this.eventFinishTime;
			}

			public void setEventFinishTime(String eventFinishTime) {
				this.eventFinishTime = eventFinishTime;
			}

			public String getEventStartTime() {
				return this.eventStartTime;
			}

			public void setEventStartTime(String eventStartTime) {
				this.eventStartTime = eventStartTime;
			}

			public String getUpdateTime() {
				return this.updateTime;
			}

			public void setUpdateTime(String updateTime) {
				this.updateTime = updateTime;
			}

			public String getExtendData() {
				return this.extendData;
			}

			public void setExtendData(String extendData) {
				this.extendData = extendData;
			}

			public String getComment() {
				return this.comment;
			}

			public void setComment(String comment) {
				this.comment = comment;
			}

			public String getUserAction() {
				return this.userAction;
			}

			public void setUserAction(String userAction) {
				this.userAction = userAction;
			}

			public String getPlanTime() {
				return this.planTime;
			}

			public void setPlanTime(String planTime) {
				this.planTime = planTime;
			}

			public String getNcIp() {
				return this.ncIp;
			}

			public void setNcIp(String ncIp) {
				this.ncIp = ncIp;
			}

			public String getPublishTime() {
				return this.publishTime;
			}

			public void setPublishTime(String publishTime) {
				this.publishTime = publishTime;
			}

			public String getEventType() {
				return this.eventType;
			}

			public void setEventType(String eventType) {
				this.eventType = eventType;
			}

			public String getEventStatus() {
				return this.eventStatus;
			}

			public void setEventStatus(String eventStatus) {
				this.eventStatus = eventStatus;
			}

			public String getClusterName() {
				return this.clusterName;
			}

			public void setClusterName(String clusterName) {
				this.clusterName = clusterName;
			}

			public String getOpsUser() {
				return this.opsUser;
			}

			public void setOpsUser(String opsUser) {
				this.opsUser = opsUser;
			}

			public String getReason() {
				return this.reason;
			}

			public void setReason(String reason) {
				this.reason = reason;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public MaintenanceReason1 getMaintenanceReason1() {
				return this.maintenanceReason1;
			}

			public void setMaintenanceReason1(MaintenanceReason1 maintenanceReason1) {
				this.maintenanceReason1 = maintenanceReason1;
			}

			public static class MaintenanceReason1 {

				private String reasonLevel3;

				private String reasonLevel1;

				private Integer isDeleted;

				private String gmtCreate;

				private String reasonLevel2;

				private String gmtModified;

				private String reasonType;

				public String getReasonLevel3() {
					return this.reasonLevel3;
				}

				public void setReasonLevel3(String reasonLevel3) {
					this.reasonLevel3 = reasonLevel3;
				}

				public String getReasonLevel1() {
					return this.reasonLevel1;
				}

				public void setReasonLevel1(String reasonLevel1) {
					this.reasonLevel1 = reasonLevel1;
				}

				public Integer getIsDeleted() {
					return this.isDeleted;
				}

				public void setIsDeleted(Integer isDeleted) {
					this.isDeleted = isDeleted;
				}

				public String getGmtCreate() {
					return this.gmtCreate;
				}

				public void setGmtCreate(String gmtCreate) {
					this.gmtCreate = gmtCreate;
				}

				public String getReasonLevel2() {
					return this.reasonLevel2;
				}

				public void setReasonLevel2(String reasonLevel2) {
					this.reasonLevel2 = reasonLevel2;
				}

				public String getGmtModified() {
					return this.gmtModified;
				}

				public void setGmtModified(String gmtModified) {
					this.gmtModified = gmtModified;
				}

				public String getReasonType() {
					return this.reasonType;
				}

				public void setReasonType(String reasonType) {
					this.reasonType = reasonType;
				}
			}
		}

		public static class MaintenanceReason {

			private String reasonLevel3;

			private String reasonLevel1;

			private Integer isDeleted;

			private String gmtCreate;

			private String reasonLevel2;

			private String gmtModified;

			private String reasonType;

			public String getReasonLevel3() {
				return this.reasonLevel3;
			}

			public void setReasonLevel3(String reasonLevel3) {
				this.reasonLevel3 = reasonLevel3;
			}

			public String getReasonLevel1() {
				return this.reasonLevel1;
			}

			public void setReasonLevel1(String reasonLevel1) {
				this.reasonLevel1 = reasonLevel1;
			}

			public Integer getIsDeleted() {
				return this.isDeleted;
			}

			public void setIsDeleted(Integer isDeleted) {
				this.isDeleted = isDeleted;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getReasonLevel2() {
				return this.reasonLevel2;
			}

			public void setReasonLevel2(String reasonLevel2) {
				this.reasonLevel2 = reasonLevel2;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getReasonType() {
				return this.reasonType;
			}

			public void setReasonType(String reasonType) {
				this.reasonType = reasonType;
			}
		}
	}

	@Override
	public OpsDescribeCloudOpsVmOpsEventsResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeCloudOpsVmOpsEventsResponseUnmarshaller.unmarshall(this, context);
	}
}
