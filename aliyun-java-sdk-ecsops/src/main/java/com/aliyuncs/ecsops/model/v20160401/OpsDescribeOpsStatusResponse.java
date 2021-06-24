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
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeOpsStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeOpsStatusResponse extends AcsResponse {

	private Boolean ncInTest;

	private String requestId;

	private Boolean ncInYaoChiTest;

	private String bizMessage;

	private Boolean ncInBlack;

	private Boolean ncIsDownAndNoVm;

	private String bizCode;

	private List<MaintenanceInfo> maintenanceRecord;

	private List<NcReleaseHistoryItem> ncReleaseHistory;

	private List<VmOpsEventItem> vmOpsEvent;

	private NcInAlarmCenterBlack ncInAlarmCenterBlack;

	private NcInGammaTest ncInGammaTest;

	public Boolean getNcInTest() {
		return this.ncInTest;
	}

	public void setNcInTest(Boolean ncInTest) {
		this.ncInTest = ncInTest;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getNcInYaoChiTest() {
		return this.ncInYaoChiTest;
	}

	public void setNcInYaoChiTest(Boolean ncInYaoChiTest) {
		this.ncInYaoChiTest = ncInYaoChiTest;
	}

	public String getBizMessage() {
		return this.bizMessage;
	}

	public void setBizMessage(String bizMessage) {
		this.bizMessage = bizMessage;
	}

	public Boolean getNcInBlack() {
		return this.ncInBlack;
	}

	public void setNcInBlack(Boolean ncInBlack) {
		this.ncInBlack = ncInBlack;
	}

	public Boolean getNcIsDownAndNoVm() {
		return this.ncIsDownAndNoVm;
	}

	public void setNcIsDownAndNoVm(Boolean ncIsDownAndNoVm) {
		this.ncIsDownAndNoVm = ncIsDownAndNoVm;
	}

	public String getBizCode() {
		return this.bizCode;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public List<MaintenanceInfo> getMaintenanceRecord() {
		return this.maintenanceRecord;
	}

	public void setMaintenanceRecord(List<MaintenanceInfo> maintenanceRecord) {
		this.maintenanceRecord = maintenanceRecord;
	}

	public List<NcReleaseHistoryItem> getNcReleaseHistory() {
		return this.ncReleaseHistory;
	}

	public void setNcReleaseHistory(List<NcReleaseHistoryItem> ncReleaseHistory) {
		this.ncReleaseHistory = ncReleaseHistory;
	}

	public List<VmOpsEventItem> getVmOpsEvent() {
		return this.vmOpsEvent;
	}

	public void setVmOpsEvent(List<VmOpsEventItem> vmOpsEvent) {
		this.vmOpsEvent = vmOpsEvent;
	}

	public NcInAlarmCenterBlack getNcInAlarmCenterBlack() {
		return this.ncInAlarmCenterBlack;
	}

	public void setNcInAlarmCenterBlack(NcInAlarmCenterBlack ncInAlarmCenterBlack) {
		this.ncInAlarmCenterBlack = ncInAlarmCenterBlack;
	}

	public NcInGammaTest getNcInGammaTest() {
		return this.ncInGammaTest;
	}

	public void setNcInGammaTest(NcInGammaTest ncInGammaTest) {
		this.ncInGammaTest = ncInGammaTest;
	}

	public static class MaintenanceInfo {

		private String status;

		private String ncId;

		private String opsType;

		private String comment;

		private String gmtCreate;

		private String gmtModified;

		private String reason;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getNcId() {
			return this.ncId;
		}

		public void setNcId(String ncId) {
			this.ncId = ncId;
		}

		public String getOpsType() {
			return this.opsType;
		}

		public void setOpsType(String opsType) {
			this.opsType = opsType;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
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

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}
	}

	public static class NcReleaseHistoryItem {

		private String changeDescription;

		private String createTime;

		private String serverRole;

		private String ncIp;

		private String operator;

		private String planId;

		private String operationStatus;

		public String getChangeDescription() {
			return this.changeDescription;
		}

		public void setChangeDescription(String changeDescription) {
			this.changeDescription = changeDescription;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getServerRole() {
			return this.serverRole;
		}

		public void setServerRole(String serverRole) {
			this.serverRole = serverRole;
		}

		public String getNcIp() {
			return this.ncIp;
		}

		public void setNcIp(String ncIp) {
			this.ncIp = ncIp;
		}

		public String getOperator() {
			return this.operator;
		}

		public void setOperator(String operator) {
			this.operator = operator;
		}

		public String getPlanId() {
			return this.planId;
		}

		public void setPlanId(String planId) {
			this.planId = planId;
		}

		public String getOperationStatus() {
			return this.operationStatus;
		}

		public void setOperationStatus(String operationStatus) {
			this.operationStatus = operationStatus;
		}
	}

	public static class VmOpsEventItem {

		private String planTime;

		private String vmName;

		private String aliUid;

		private String ncIp;

		private String opsCode;

		private String endTime;

		private String startTime;

		private String publishTime;

		private String opsType;

		private String clusterAlias;

		private String clusterName;

		private String eventStatus;

		public String getPlanTime() {
			return this.planTime;
		}

		public void setPlanTime(String planTime) {
			this.planTime = planTime;
		}

		public String getVmName() {
			return this.vmName;
		}

		public void setVmName(String vmName) {
			this.vmName = vmName;
		}

		public String getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(String aliUid) {
			this.aliUid = aliUid;
		}

		public String getNcIp() {
			return this.ncIp;
		}

		public void setNcIp(String ncIp) {
			this.ncIp = ncIp;
		}

		public String getOpsCode() {
			return this.opsCode;
		}

		public void setOpsCode(String opsCode) {
			this.opsCode = opsCode;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getPublishTime() {
			return this.publishTime;
		}

		public void setPublishTime(String publishTime) {
			this.publishTime = publishTime;
		}

		public String getOpsType() {
			return this.opsType;
		}

		public void setOpsType(String opsType) {
			this.opsType = opsType;
		}

		public String getClusterAlias() {
			return this.clusterAlias;
		}

		public void setClusterAlias(String clusterAlias) {
			this.clusterAlias = clusterAlias;
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
	}

	public static class NcInAlarmCenterBlack {

		private String extension;

		private String dueTime;

		private String staffId;

		private String nickName;

		private Boolean ncInTest;

		public String getExtension() {
			return this.extension;
		}

		public void setExtension(String extension) {
			this.extension = extension;
		}

		public String getDueTime() {
			return this.dueTime;
		}

		public void setDueTime(String dueTime) {
			this.dueTime = dueTime;
		}

		public String getStaffId() {
			return this.staffId;
		}

		public void setStaffId(String staffId) {
			this.staffId = staffId;
		}

		public String getNickName() {
			return this.nickName;
		}

		public void setNickName(String nickName) {
			this.nickName = nickName;
		}

		public Boolean getNcInTest() {
			return this.ncInTest;
		}

		public void setNcInTest(Boolean ncInTest) {
			this.ncInTest = ncInTest;
		}
	}

	public static class NcInGammaTest {

		private String userGroup;

		private String staffId;

		private Boolean ncInTest;

		public String getUserGroup() {
			return this.userGroup;
		}

		public void setUserGroup(String userGroup) {
			this.userGroup = userGroup;
		}

		public String getStaffId() {
			return this.staffId;
		}

		public void setStaffId(String staffId) {
			this.staffId = staffId;
		}

		public Boolean getNcInTest() {
			return this.ncInTest;
		}

		public void setNcInTest(Boolean ncInTest) {
			this.ncInTest = ncInTest;
		}
	}

	@Override
	public OpsDescribeOpsStatusResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeOpsStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
