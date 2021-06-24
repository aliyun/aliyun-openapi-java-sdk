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
import com.aliyuncs.ecsops.transform.v20160401.OpsListCusOpsEventsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsListCusOpsEventsResponse extends AcsResponse {

	private String requestId;

	private Integer pageNo;

	private Integer pageSize;

	private Integer total;

	private List<OpsEventModel> opsEventModelList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<OpsEventModel> getOpsEventModelList() {
		return this.opsEventModelList;
	}

	public void setOpsEventModelList(List<OpsEventModel> opsEventModelList) {
		this.opsEventModelList = opsEventModelList;
	}

	public static class OpsEventModel {

		private Long id;

		private String gmtCreate;

		private String gmtModified;

		private String eventId;

		private Long aliUid;

		private Long regionId;

		private Long zoneId;

		private String regionNo;

		private String zoneNo;

		private String vmName;

		private String diskId;

		private String hostId;

		private String ncIp;

		private String clusterName;

		private String opsType;

		private String opsUser;

		private String publishTime;

		private String planTime;

		private String startTime;

		private String endTime;

		private String opsCode;

		private String eventStatus;

		private String opsBeforeInstanceStatus;

		private String opsBeforeSystemStatus;

		private String opsInstanceStatus;

		private String opsSystemStatus;

		private String diskEventType;

		private String hostEventType;

		private String diskHealthStatus;

		private String comments;

		private String opsSource;

		private String ext1;

		private String ext2;

		private String ext3;

		private String dstNcIp;

		private String ts;

		private String reasonLevel1;

		private String reasonLevel2;

		private String reasonLevel3;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getEventId() {
			return this.eventId;
		}

		public void setEventId(String eventId) {
			this.eventId = eventId;
		}

		public Long getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(Long aliUid) {
			this.aliUid = aliUid;
		}

		public Long getRegionId() {
			return this.regionId;
		}

		public void setRegionId(Long regionId) {
			this.regionId = regionId;
		}

		public Long getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(Long zoneId) {
			this.zoneId = zoneId;
		}

		public String getRegionNo() {
			return this.regionNo;
		}

		public void setRegionNo(String regionNo) {
			this.regionNo = regionNo;
		}

		public String getZoneNo() {
			return this.zoneNo;
		}

		public void setZoneNo(String zoneNo) {
			this.zoneNo = zoneNo;
		}

		public String getVmName() {
			return this.vmName;
		}

		public void setVmName(String vmName) {
			this.vmName = vmName;
		}

		public String getDiskId() {
			return this.diskId;
		}

		public void setDiskId(String diskId) {
			this.diskId = diskId;
		}

		public String getHostId() {
			return this.hostId;
		}

		public void setHostId(String hostId) {
			this.hostId = hostId;
		}

		public String getNcIp() {
			return this.ncIp;
		}

		public void setNcIp(String ncIp) {
			this.ncIp = ncIp;
		}

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}

		public String getOpsType() {
			return this.opsType;
		}

		public void setOpsType(String opsType) {
			this.opsType = opsType;
		}

		public String getOpsUser() {
			return this.opsUser;
		}

		public void setOpsUser(String opsUser) {
			this.opsUser = opsUser;
		}

		public String getPublishTime() {
			return this.publishTime;
		}

		public void setPublishTime(String publishTime) {
			this.publishTime = publishTime;
		}

		public String getPlanTime() {
			return this.planTime;
		}

		public void setPlanTime(String planTime) {
			this.planTime = planTime;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getOpsCode() {
			return this.opsCode;
		}

		public void setOpsCode(String opsCode) {
			this.opsCode = opsCode;
		}

		public String getEventStatus() {
			return this.eventStatus;
		}

		public void setEventStatus(String eventStatus) {
			this.eventStatus = eventStatus;
		}

		public String getOpsBeforeInstanceStatus() {
			return this.opsBeforeInstanceStatus;
		}

		public void setOpsBeforeInstanceStatus(String opsBeforeInstanceStatus) {
			this.opsBeforeInstanceStatus = opsBeforeInstanceStatus;
		}

		public String getOpsBeforeSystemStatus() {
			return this.opsBeforeSystemStatus;
		}

		public void setOpsBeforeSystemStatus(String opsBeforeSystemStatus) {
			this.opsBeforeSystemStatus = opsBeforeSystemStatus;
		}

		public String getOpsInstanceStatus() {
			return this.opsInstanceStatus;
		}

		public void setOpsInstanceStatus(String opsInstanceStatus) {
			this.opsInstanceStatus = opsInstanceStatus;
		}

		public String getOpsSystemStatus() {
			return this.opsSystemStatus;
		}

		public void setOpsSystemStatus(String opsSystemStatus) {
			this.opsSystemStatus = opsSystemStatus;
		}

		public String getDiskEventType() {
			return this.diskEventType;
		}

		public void setDiskEventType(String diskEventType) {
			this.diskEventType = diskEventType;
		}

		public String getHostEventType() {
			return this.hostEventType;
		}

		public void setHostEventType(String hostEventType) {
			this.hostEventType = hostEventType;
		}

		public String getDiskHealthStatus() {
			return this.diskHealthStatus;
		}

		public void setDiskHealthStatus(String diskHealthStatus) {
			this.diskHealthStatus = diskHealthStatus;
		}

		public String getComments() {
			return this.comments;
		}

		public void setComments(String comments) {
			this.comments = comments;
		}

		public String getOpsSource() {
			return this.opsSource;
		}

		public void setOpsSource(String opsSource) {
			this.opsSource = opsSource;
		}

		public String getExt1() {
			return this.ext1;
		}

		public void setExt1(String ext1) {
			this.ext1 = ext1;
		}

		public String getExt2() {
			return this.ext2;
		}

		public void setExt2(String ext2) {
			this.ext2 = ext2;
		}

		public String getExt3() {
			return this.ext3;
		}

		public void setExt3(String ext3) {
			this.ext3 = ext3;
		}

		public String getDstNcIp() {
			return this.dstNcIp;
		}

		public void setDstNcIp(String dstNcIp) {
			this.dstNcIp = dstNcIp;
		}

		public String getTs() {
			return this.ts;
		}

		public void setTs(String ts) {
			this.ts = ts;
		}

		public String getReasonLevel1() {
			return this.reasonLevel1;
		}

		public void setReasonLevel1(String reasonLevel1) {
			this.reasonLevel1 = reasonLevel1;
		}

		public String getReasonLevel2() {
			return this.reasonLevel2;
		}

		public void setReasonLevel2(String reasonLevel2) {
			this.reasonLevel2 = reasonLevel2;
		}

		public String getReasonLevel3() {
			return this.reasonLevel3;
		}

		public void setReasonLevel3(String reasonLevel3) {
			this.reasonLevel3 = reasonLevel3;
		}
	}

	@Override
	public OpsListCusOpsEventsResponse getInstance(UnmarshallerContext context) {
		return	OpsListCusOpsEventsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
