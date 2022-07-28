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

package com.aliyuncs.dbs.model.v20190306;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dbs.transform.v20190306.DescribeBackupPlanListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBackupPlanListResponse extends AcsResponse {

	private Integer httpStatusCode;

	private Integer pageNum;

	private String requestId;

	private String errCode;

	private Boolean success;

	private String errMessage;

	private Integer totalPages;

	private Integer totalElements;

	private Integer pageSize;

	private List<BackupPlanDetail> items;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrCode() {
		return this.errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrMessage() {
		return this.errMessage;
	}

	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}

	public Integer getTotalPages() {
		return this.totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	public Integer getTotalElements() {
		return this.totalElements;
	}

	public void setTotalElements(Integer totalElements) {
		this.totalElements = totalElements;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<BackupPlanDetail> getItems() {
		return this.items;
	}

	public void setItems(List<BackupPlanDetail> items) {
		this.items = items;
	}

	public static class BackupPlanDetail {

		private String crossRoleName;

		private String sourceEndpointInstanceType;

		private String backupSetDownloadDir;

		private String sourceEndpointIpPort;

		private String crossAliyunId;

		private Integer duplicationArchivePeriod;

		private String backupPlanId;

		private Long endTimestampForRestore;

		private String backupPlanStatus;

		private String backupSetDownloadFullDataFormat;

		private Integer backupRetentionPeriod;

		private String oSSBucketRegion;

		private String sourceEndpointOracleSID;

		private String backupStorageType;

		private String backupMethod;

		private String sourceEndpointRegion;

		private String backupPeriod;

		private String sourceEndpointDatabaseName;

		private Long backupSetDownloadGatewayId;

		private Long backupPlanCreateTime;

		private String instanceClass;

		private String backupSetDownloadTargetType;

		private Integer duplicationInfrequentAccessPeriod;

		private String backupStartTime;

		private String errMessage;

		private String backupObjects;

		private Long beginTimestampForRestore;

		private String sourceEndpointInstanceID;

		private Boolean openBackupSetAutoDownload;

		private String backupPlanName;

		private String oSSBucketName;

		private Long backupGatewayId;

		private String sourceEndpointUserName;

		private String backupSetDownloadIncrementDataFormat;

		private Boolean enableBackupLog;

		private String resourceGroupId;

		public String getCrossRoleName() {
			return this.crossRoleName;
		}

		public void setCrossRoleName(String crossRoleName) {
			this.crossRoleName = crossRoleName;
		}

		public String getSourceEndpointInstanceType() {
			return this.sourceEndpointInstanceType;
		}

		public void setSourceEndpointInstanceType(String sourceEndpointInstanceType) {
			this.sourceEndpointInstanceType = sourceEndpointInstanceType;
		}

		public String getBackupSetDownloadDir() {
			return this.backupSetDownloadDir;
		}

		public void setBackupSetDownloadDir(String backupSetDownloadDir) {
			this.backupSetDownloadDir = backupSetDownloadDir;
		}

		public String getSourceEndpointIpPort() {
			return this.sourceEndpointIpPort;
		}

		public void setSourceEndpointIpPort(String sourceEndpointIpPort) {
			this.sourceEndpointIpPort = sourceEndpointIpPort;
		}

		public String getCrossAliyunId() {
			return this.crossAliyunId;
		}

		public void setCrossAliyunId(String crossAliyunId) {
			this.crossAliyunId = crossAliyunId;
		}

		public Integer getDuplicationArchivePeriod() {
			return this.duplicationArchivePeriod;
		}

		public void setDuplicationArchivePeriod(Integer duplicationArchivePeriod) {
			this.duplicationArchivePeriod = duplicationArchivePeriod;
		}

		public String getBackupPlanId() {
			return this.backupPlanId;
		}

		public void setBackupPlanId(String backupPlanId) {
			this.backupPlanId = backupPlanId;
		}

		public Long getEndTimestampForRestore() {
			return this.endTimestampForRestore;
		}

		public void setEndTimestampForRestore(Long endTimestampForRestore) {
			this.endTimestampForRestore = endTimestampForRestore;
		}

		public String getBackupPlanStatus() {
			return this.backupPlanStatus;
		}

		public void setBackupPlanStatus(String backupPlanStatus) {
			this.backupPlanStatus = backupPlanStatus;
		}

		public String getBackupSetDownloadFullDataFormat() {
			return this.backupSetDownloadFullDataFormat;
		}

		public void setBackupSetDownloadFullDataFormat(String backupSetDownloadFullDataFormat) {
			this.backupSetDownloadFullDataFormat = backupSetDownloadFullDataFormat;
		}

		public Integer getBackupRetentionPeriod() {
			return this.backupRetentionPeriod;
		}

		public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
			this.backupRetentionPeriod = backupRetentionPeriod;
		}

		public String getOSSBucketRegion() {
			return this.oSSBucketRegion;
		}

		public void setOSSBucketRegion(String oSSBucketRegion) {
			this.oSSBucketRegion = oSSBucketRegion;
		}

		public String getSourceEndpointOracleSID() {
			return this.sourceEndpointOracleSID;
		}

		public void setSourceEndpointOracleSID(String sourceEndpointOracleSID) {
			this.sourceEndpointOracleSID = sourceEndpointOracleSID;
		}

		public String getBackupStorageType() {
			return this.backupStorageType;
		}

		public void setBackupStorageType(String backupStorageType) {
			this.backupStorageType = backupStorageType;
		}

		public String getBackupMethod() {
			return this.backupMethod;
		}

		public void setBackupMethod(String backupMethod) {
			this.backupMethod = backupMethod;
		}

		public String getSourceEndpointRegion() {
			return this.sourceEndpointRegion;
		}

		public void setSourceEndpointRegion(String sourceEndpointRegion) {
			this.sourceEndpointRegion = sourceEndpointRegion;
		}

		public String getBackupPeriod() {
			return this.backupPeriod;
		}

		public void setBackupPeriod(String backupPeriod) {
			this.backupPeriod = backupPeriod;
		}

		public String getSourceEndpointDatabaseName() {
			return this.sourceEndpointDatabaseName;
		}

		public void setSourceEndpointDatabaseName(String sourceEndpointDatabaseName) {
			this.sourceEndpointDatabaseName = sourceEndpointDatabaseName;
		}

		public Long getBackupSetDownloadGatewayId() {
			return this.backupSetDownloadGatewayId;
		}

		public void setBackupSetDownloadGatewayId(Long backupSetDownloadGatewayId) {
			this.backupSetDownloadGatewayId = backupSetDownloadGatewayId;
		}

		public Long getBackupPlanCreateTime() {
			return this.backupPlanCreateTime;
		}

		public void setBackupPlanCreateTime(Long backupPlanCreateTime) {
			this.backupPlanCreateTime = backupPlanCreateTime;
		}

		public String getInstanceClass() {
			return this.instanceClass;
		}

		public void setInstanceClass(String instanceClass) {
			this.instanceClass = instanceClass;
		}

		public String getBackupSetDownloadTargetType() {
			return this.backupSetDownloadTargetType;
		}

		public void setBackupSetDownloadTargetType(String backupSetDownloadTargetType) {
			this.backupSetDownloadTargetType = backupSetDownloadTargetType;
		}

		public Integer getDuplicationInfrequentAccessPeriod() {
			return this.duplicationInfrequentAccessPeriod;
		}

		public void setDuplicationInfrequentAccessPeriod(Integer duplicationInfrequentAccessPeriod) {
			this.duplicationInfrequentAccessPeriod = duplicationInfrequentAccessPeriod;
		}

		public String getBackupStartTime() {
			return this.backupStartTime;
		}

		public void setBackupStartTime(String backupStartTime) {
			this.backupStartTime = backupStartTime;
		}

		public String getErrMessage() {
			return this.errMessage;
		}

		public void setErrMessage(String errMessage) {
			this.errMessage = errMessage;
		}

		public String getBackupObjects() {
			return this.backupObjects;
		}

		public void setBackupObjects(String backupObjects) {
			this.backupObjects = backupObjects;
		}

		public Long getBeginTimestampForRestore() {
			return this.beginTimestampForRestore;
		}

		public void setBeginTimestampForRestore(Long beginTimestampForRestore) {
			this.beginTimestampForRestore = beginTimestampForRestore;
		}

		public String getSourceEndpointInstanceID() {
			return this.sourceEndpointInstanceID;
		}

		public void setSourceEndpointInstanceID(String sourceEndpointInstanceID) {
			this.sourceEndpointInstanceID = sourceEndpointInstanceID;
		}

		public Boolean getOpenBackupSetAutoDownload() {
			return this.openBackupSetAutoDownload;
		}

		public void setOpenBackupSetAutoDownload(Boolean openBackupSetAutoDownload) {
			this.openBackupSetAutoDownload = openBackupSetAutoDownload;
		}

		public String getBackupPlanName() {
			return this.backupPlanName;
		}

		public void setBackupPlanName(String backupPlanName) {
			this.backupPlanName = backupPlanName;
		}

		public String getOSSBucketName() {
			return this.oSSBucketName;
		}

		public void setOSSBucketName(String oSSBucketName) {
			this.oSSBucketName = oSSBucketName;
		}

		public Long getBackupGatewayId() {
			return this.backupGatewayId;
		}

		public void setBackupGatewayId(Long backupGatewayId) {
			this.backupGatewayId = backupGatewayId;
		}

		public String getSourceEndpointUserName() {
			return this.sourceEndpointUserName;
		}

		public void setSourceEndpointUserName(String sourceEndpointUserName) {
			this.sourceEndpointUserName = sourceEndpointUserName;
		}

		public String getBackupSetDownloadIncrementDataFormat() {
			return this.backupSetDownloadIncrementDataFormat;
		}

		public void setBackupSetDownloadIncrementDataFormat(String backupSetDownloadIncrementDataFormat) {
			this.backupSetDownloadIncrementDataFormat = backupSetDownloadIncrementDataFormat;
		}

		public Boolean getEnableBackupLog() {
			return this.enableBackupLog;
		}

		public void setEnableBackupLog(Boolean enableBackupLog) {
			this.enableBackupLog = enableBackupLog;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}
	}

	@Override
	public DescribeBackupPlanListResponse getInstance(UnmarshallerContext context) {
		return	DescribeBackupPlanListResponseUnmarshaller.unmarshall(this, context);
	}
}
