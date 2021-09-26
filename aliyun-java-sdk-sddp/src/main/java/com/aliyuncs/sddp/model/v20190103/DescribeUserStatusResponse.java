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

package com.aliyuncs.sddp.model.v20190103;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sddp.transform.v20190103.DescribeUserStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUserStatusResponse extends AcsResponse {

	private String requestId;

	private UserStatus userStatus;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public UserStatus getUserStatus() {
		return this.userStatus;
	}

	public void setUserStatus(UserStatus userStatus) {
		this.userStatus = userStatus;
	}

	public static class UserStatus {

		private Boolean authed;

		private Boolean buyed;

		private Boolean ossBucketSet;

		private Boolean odpsSet;

		private Boolean rdsSet;

		private String authProductList;

		private String accessKeyId;

		private Boolean trail;

		private Integer instanceStatus;

		private String instanceId;

		private Integer remainDays;

		private Boolean renewStatus;

		private Integer instanceNum;

		private Integer useInstanceNum;

		private Long ossSize;

		private Long useOssSize;

		private String chargeType;

		private Integer labStatus;

		private String version;

		private Integer dbAuditStatus;

		private Boolean assetScanned;

		private Boolean auditUpgradeStatus;

		private Long sensitiveTable;

		private Long sensitiveObject;

		private Long datamaskColumns;

		private Long alarmCount;

		private Long divulgeCount;

		private String displayTime;

		private Long totalDataMaskColumns;

		private Long dataMaskTasks;

		private Long dataMaskColumns;

		private Long sensitiveTables;

		private Long sensitiveObjects;

		private Long incSensitiveTables;

		private Long incSensitiveObjects;

		private String sensitiveTop;

		private Long dlpTotalCount;

		private Long dlpCount;

		private String sensitiveTotalTop;

		public Boolean getAuthed() {
			return this.authed;
		}

		public void setAuthed(Boolean authed) {
			this.authed = authed;
		}

		public Boolean getBuyed() {
			return this.buyed;
		}

		public void setBuyed(Boolean buyed) {
			this.buyed = buyed;
		}

		public Boolean getOssBucketSet() {
			return this.ossBucketSet;
		}

		public void setOssBucketSet(Boolean ossBucketSet) {
			this.ossBucketSet = ossBucketSet;
		}

		public Boolean getOdpsSet() {
			return this.odpsSet;
		}

		public void setOdpsSet(Boolean odpsSet) {
			this.odpsSet = odpsSet;
		}

		public Boolean getRdsSet() {
			return this.rdsSet;
		}

		public void setRdsSet(Boolean rdsSet) {
			this.rdsSet = rdsSet;
		}

		public String getAuthProductList() {
			return this.authProductList;
		}

		public void setAuthProductList(String authProductList) {
			this.authProductList = authProductList;
		}

		public String getAccessKeyId() {
			return this.accessKeyId;
		}

		public void setAccessKeyId(String accessKeyId) {
			this.accessKeyId = accessKeyId;
		}

		public Boolean getTrail() {
			return this.trail;
		}

		public void setTrail(Boolean trail) {
			this.trail = trail;
		}

		public Integer getInstanceStatus() {
			return this.instanceStatus;
		}

		public void setInstanceStatus(Integer instanceStatus) {
			this.instanceStatus = instanceStatus;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Integer getRemainDays() {
			return this.remainDays;
		}

		public void setRemainDays(Integer remainDays) {
			this.remainDays = remainDays;
		}

		public Boolean getRenewStatus() {
			return this.renewStatus;
		}

		public void setRenewStatus(Boolean renewStatus) {
			this.renewStatus = renewStatus;
		}

		public Integer getInstanceNum() {
			return this.instanceNum;
		}

		public void setInstanceNum(Integer instanceNum) {
			this.instanceNum = instanceNum;
		}

		public Integer getUseInstanceNum() {
			return this.useInstanceNum;
		}

		public void setUseInstanceNum(Integer useInstanceNum) {
			this.useInstanceNum = useInstanceNum;
		}

		public Long getOssSize() {
			return this.ossSize;
		}

		public void setOssSize(Long ossSize) {
			this.ossSize = ossSize;
		}

		public Long getUseOssSize() {
			return this.useOssSize;
		}

		public void setUseOssSize(Long useOssSize) {
			this.useOssSize = useOssSize;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public Integer getLabStatus() {
			return this.labStatus;
		}

		public void setLabStatus(Integer labStatus) {
			this.labStatus = labStatus;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public Integer getDbAuditStatus() {
			return this.dbAuditStatus;
		}

		public void setDbAuditStatus(Integer dbAuditStatus) {
			this.dbAuditStatus = dbAuditStatus;
		}

		public Boolean getAssetScanned() {
			return this.assetScanned;
		}

		public void setAssetScanned(Boolean assetScanned) {
			this.assetScanned = assetScanned;
		}

		public Boolean getAuditUpgradeStatus() {
			return this.auditUpgradeStatus;
		}

		public void setAuditUpgradeStatus(Boolean auditUpgradeStatus) {
			this.auditUpgradeStatus = auditUpgradeStatus;
		}

		public Long getSensitiveTable() {
			return this.sensitiveTable;
		}

		public void setSensitiveTable(Long sensitiveTable) {
			this.sensitiveTable = sensitiveTable;
		}

		public Long getSensitiveObject() {
			return this.sensitiveObject;
		}

		public void setSensitiveObject(Long sensitiveObject) {
			this.sensitiveObject = sensitiveObject;
		}

		public Long getDatamaskColumns() {
			return this.datamaskColumns;
		}

		public void setDatamaskColumns(Long datamaskColumns) {
			this.datamaskColumns = datamaskColumns;
		}

		public Long getAlarmCount() {
			return this.alarmCount;
		}

		public void setAlarmCount(Long alarmCount) {
			this.alarmCount = alarmCount;
		}

		public Long getDivulgeCount() {
			return this.divulgeCount;
		}

		public void setDivulgeCount(Long divulgeCount) {
			this.divulgeCount = divulgeCount;
		}

		public String getDisplayTime() {
			return this.displayTime;
		}

		public void setDisplayTime(String displayTime) {
			this.displayTime = displayTime;
		}

		public Long getTotalDataMaskColumns() {
			return this.totalDataMaskColumns;
		}

		public void setTotalDataMaskColumns(Long totalDataMaskColumns) {
			this.totalDataMaskColumns = totalDataMaskColumns;
		}

		public Long getDataMaskTasks() {
			return this.dataMaskTasks;
		}

		public void setDataMaskTasks(Long dataMaskTasks) {
			this.dataMaskTasks = dataMaskTasks;
		}

		public Long getDataMaskColumns() {
			return this.dataMaskColumns;
		}

		public void setDataMaskColumns(Long dataMaskColumns) {
			this.dataMaskColumns = dataMaskColumns;
		}

		public Long getSensitiveTables() {
			return this.sensitiveTables;
		}

		public void setSensitiveTables(Long sensitiveTables) {
			this.sensitiveTables = sensitiveTables;
		}

		public Long getSensitiveObjects() {
			return this.sensitiveObjects;
		}

		public void setSensitiveObjects(Long sensitiveObjects) {
			this.sensitiveObjects = sensitiveObjects;
		}

		public Long getIncSensitiveTables() {
			return this.incSensitiveTables;
		}

		public void setIncSensitiveTables(Long incSensitiveTables) {
			this.incSensitiveTables = incSensitiveTables;
		}

		public Long getIncSensitiveObjects() {
			return this.incSensitiveObjects;
		}

		public void setIncSensitiveObjects(Long incSensitiveObjects) {
			this.incSensitiveObjects = incSensitiveObjects;
		}

		public String getSensitiveTop() {
			return this.sensitiveTop;
		}

		public void setSensitiveTop(String sensitiveTop) {
			this.sensitiveTop = sensitiveTop;
		}

		public Long getDlpTotalCount() {
			return this.dlpTotalCount;
		}

		public void setDlpTotalCount(Long dlpTotalCount) {
			this.dlpTotalCount = dlpTotalCount;
		}

		public Long getDlpCount() {
			return this.dlpCount;
		}

		public void setDlpCount(Long dlpCount) {
			this.dlpCount = dlpCount;
		}

		public String getSensitiveTotalTop() {
			return this.sensitiveTotalTop;
		}

		public void setSensitiveTotalTop(String sensitiveTotalTop) {
			this.sensitiveTotalTop = sensitiveTotalTop;
		}
	}

	@Override
	public DescribeUserStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeUserStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
