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

	private String requestId;

	private String bizCode;

	private String bizMessage;

	private Boolean ncInBlack;

	private Boolean ncInTest;

	private Boolean ncInYaoChiTest;

	private Boolean ncIsDownAndNoVm;

	private List<VmOpsEventItem> vmOpsEvent;

	private List<MaintenanceInfo> maintenanceRecord;

	private List<NcReleaseHistoryItem> ncReleaseHistory;

	private NcInGammaTest ncInGammaTest;

	private NcInAlarmCenterBlack ncInAlarmCenterBlack;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getBizCode() {
		return this.bizCode;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
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

	public Boolean getNcInTest() {
		return this.ncInTest;
	}

	public void setNcInTest(Boolean ncInTest) {
		this.ncInTest = ncInTest;
	}

	public Boolean getNcInYaoChiTest() {
		return this.ncInYaoChiTest;
	}

	public void setNcInYaoChiTest(Boolean ncInYaoChiTest) {
		this.ncInYaoChiTest = ncInYaoChiTest;
	}

	public Boolean getNcIsDownAndNoVm() {
		return this.ncIsDownAndNoVm;
	}

	public void setNcIsDownAndNoVm(Boolean ncIsDownAndNoVm) {
		this.ncIsDownAndNoVm = ncIsDownAndNoVm;
	}

	public List<VmOpsEventItem> getVmOpsEvent() {
		return this.vmOpsEvent;
	}

	public void setVmOpsEvent(List<VmOpsEventItem> vmOpsEvent) {
		this.vmOpsEvent = vmOpsEvent;
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

	public NcInGammaTest getNcInGammaTest() {
		return this.ncInGammaTest;
	}

	public void setNcInGammaTest(NcInGammaTest ncInGammaTest) {
		this.ncInGammaTest = ncInGammaTest;
	}

	public NcInAlarmCenterBlack getNcInAlarmCenterBlack() {
		return this.ncInAlarmCenterBlack;
	}

	public void setNcInAlarmCenterBlack(NcInAlarmCenterBlack ncInAlarmCenterBlack) {
		this.ncInAlarmCenterBlack = ncInAlarmCenterBlack;
	}

	public static class VmOpsEventItem {

		private String aliUid;

		private String clusterAlias;

		private String endTime;

		private String eventStatus;

		private String ncIp;

		private String opsCode;

		private String opsType;

		private String planTime;

		private String publishTime;

		private String startTime;

		private String vmName;

		private String clusterName;

		public String getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(String aliUid) {
			this.aliUid = aliUid;
		}

		public String getClusterAlias() {
			return this.clusterAlias;
		}

		public void setClusterAlias(String clusterAlias) {
			this.clusterAlias = clusterAlias;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getEventStatus() {
			return this.eventStatus;
		}

		public void setEventStatus(String eventStatus) {
			this.eventStatus = eventStatus;
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

		public String getOpsType() {
			return this.opsType;
		}

		public void setOpsType(String opsType) {
			this.opsType = opsType;
		}

		public String getPlanTime() {
			return this.planTime;
		}

		public void setPlanTime(String planTime) {
			this.planTime = planTime;
		}

		public String getPublishTime() {
			return this.publishTime;
		}

		public void setPublishTime(String publishTime) {
			this.publishTime = publishTime;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getVmName() {
			return this.vmName;
		}

		public void setVmName(String vmName) {
			this.vmName = vmName;
		}

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}
	}

	public static class MaintenanceInfo {

		private String ncId;

		private String reason;

		private String gmtCreate;

		private String gmtModified;

		private String opsType;

		private String comment;

		private String status;

		public String getNcId() {
			return this.ncId;
		}

		public void setNcId(String ncId) {
			this.ncId = ncId;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
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

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	public static class NcReleaseHistoryItem {

		private String ncIp;

		private String planId;

		private String serverRole;

		private String operator;

		private String createTime;

		private String operationStatus;

		private String changeDescription;

		public String getNcIp() {
			return this.ncIp;
		}

		public void setNcIp(String ncIp) {
			this.ncIp = ncIp;
		}

		public String getPlanId() {
			return this.planId;
		}

		public void setPlanId(String planId) {
			this.planId = planId;
		}

		public String getServerRole() {
			return this.serverRole;
		}

		public void setServerRole(String serverRole) {
			this.serverRole = serverRole;
		}

		public String getOperator() {
			return this.operator;
		}

		public void setOperator(String operator) {
			this.operator = operator;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getOperationStatus() {
			return this.operationStatus;
		}

		public void setOperationStatus(String operationStatus) {
			this.operationStatus = operationStatus;
		}

		public String getChangeDescription() {
			return this.changeDescription;
		}

		public void setChangeDescription(String changeDescription) {
			this.changeDescription = changeDescription;
		}
	}

	public static class NcInGammaTest {

		private Boolean ncInTest;

		private String staffId;

		private String userGroup;

		public Boolean getNcInTest() {
			return this.ncInTest;
		}

		public void setNcInTest(Boolean ncInTest) {
			this.ncInTest = ncInTest;
		}

		public String getStaffId() {
			return this.staffId;
		}

		public void setStaffId(String staffId) {
			this.staffId = staffId;
		}

		public String getUserGroup() {
			return this.userGroup;
		}

		public void setUserGroup(String userGroup) {
			this.userGroup = userGroup;
		}
	}

	public static class NcInAlarmCenterBlack {

		private Boolean ncInTest;

		private String staffId;

		private String extension;

		private String nickName;

		private String dueTime;

		public Boolean getNcInTest() {
			return this.ncInTest;
		}

		public void setNcInTest(Boolean ncInTest) {
			this.ncInTest = ncInTest;
		}

		public String getStaffId() {
			return this.staffId;
		}

		public void setStaffId(String staffId) {
			this.staffId = staffId;
		}

		public String getExtension() {
			return this.extension;
		}

		public void setExtension(String extension) {
			this.extension = extension;
		}

		public String getNickName() {
			return this.nickName;
		}

		public void setNickName(String nickName) {
			this.nickName = nickName;
		}

		public String getDueTime() {
			return this.dueTime;
		}

		public void setDueTime(String dueTime) {
			this.dueTime = dueTime;
		}
	}

	@Override
	public OpsDescribeOpsStatusResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeOpsStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
