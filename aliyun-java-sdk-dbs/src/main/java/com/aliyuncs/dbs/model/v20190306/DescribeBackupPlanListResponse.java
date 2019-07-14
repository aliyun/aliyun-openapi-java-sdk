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

	private Boolean success;

	private String errCode;

	private String errMessage;

	private Integer httpStatusCode;

	private String requestId;

	private Integer totalPages;

	private Integer pageSize;

	private Integer pageNum;

	private Integer totalElements;

	private List<BackupPlanDetail> items;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrCode() {
		return this.errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getErrMessage() {
		return this.errMessage;
	}

	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalPages() {
		return this.totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getTotalElements() {
		return this.totalElements;
	}

	public void setTotalElements(Integer totalElements) {
		this.totalElements = totalElements;
	}

	public List<BackupPlanDetail> getItems() {
		return this.items;
	}

	public void setItems(List<BackupPlanDetail> items) {
		this.items = items;
	}

	public static class BackupPlanDetail {

		private String backupPlanId;

		private String sourceEndpointInstanceType;

		private String sourceEndpointRegion;

		private String sourceEndpointInstanceID;

		private String sourceEndpointIpPort;

		private String sourceEndpointDatabaseName;

		private String sourceEndpointUserName;

		private String backupObjects;

		private Long backupGatewayId;

		private String oSSBucketRegion;

		private String oSSBucketName;

		private String backupPeriod;

		private String backupStartTime;

		private Boolean enableBackupLog;

		private Integer backupRetentionPeriod;

		private Integer duplicationInfrequentAccessPeriod;

		private Integer duplicationArchivePeriod;

		private String backupPlanName;

		private String sourceEndpointOracleSID;

		private String instanceClass;

		private String backupMethod;

		private Long backupPlanCreateTime;

		private String backupPlanStatus;

		private Long beginTimestampForRestore;

		private Long endTimestampForRestore;

		public String getBackupPlanId() {
			return this.backupPlanId;
		}

		public void setBackupPlanId(String backupPlanId) {
			this.backupPlanId = backupPlanId;
		}

		public String getSourceEndpointInstanceType() {
			return this.sourceEndpointInstanceType;
		}

		public void setSourceEndpointInstanceType(String sourceEndpointInstanceType) {
			this.sourceEndpointInstanceType = sourceEndpointInstanceType;
		}

		public String getSourceEndpointRegion() {
			return this.sourceEndpointRegion;
		}

		public void setSourceEndpointRegion(String sourceEndpointRegion) {
			this.sourceEndpointRegion = sourceEndpointRegion;
		}

		public String getSourceEndpointInstanceID() {
			return this.sourceEndpointInstanceID;
		}

		public void setSourceEndpointInstanceID(String sourceEndpointInstanceID) {
			this.sourceEndpointInstanceID = sourceEndpointInstanceID;
		}

		public String getSourceEndpointIpPort() {
			return this.sourceEndpointIpPort;
		}

		public void setSourceEndpointIpPort(String sourceEndpointIpPort) {
			this.sourceEndpointIpPort = sourceEndpointIpPort;
		}

		public String getSourceEndpointDatabaseName() {
			return this.sourceEndpointDatabaseName;
		}

		public void setSourceEndpointDatabaseName(String sourceEndpointDatabaseName) {
			this.sourceEndpointDatabaseName = sourceEndpointDatabaseName;
		}

		public String getSourceEndpointUserName() {
			return this.sourceEndpointUserName;
		}

		public void setSourceEndpointUserName(String sourceEndpointUserName) {
			this.sourceEndpointUserName = sourceEndpointUserName;
		}

		public String getBackupObjects() {
			return this.backupObjects;
		}

		public void setBackupObjects(String backupObjects) {
			this.backupObjects = backupObjects;
		}

		public Long getBackupGatewayId() {
			return this.backupGatewayId;
		}

		public void setBackupGatewayId(Long backupGatewayId) {
			this.backupGatewayId = backupGatewayId;
		}

		public String getOSSBucketRegion() {
			return this.oSSBucketRegion;
		}

		public void setOSSBucketRegion(String oSSBucketRegion) {
			this.oSSBucketRegion = oSSBucketRegion;
		}

		public String getOSSBucketName() {
			return this.oSSBucketName;
		}

		public void setOSSBucketName(String oSSBucketName) {
			this.oSSBucketName = oSSBucketName;
		}

		public String getBackupPeriod() {
			return this.backupPeriod;
		}

		public void setBackupPeriod(String backupPeriod) {
			this.backupPeriod = backupPeriod;
		}

		public String getBackupStartTime() {
			return this.backupStartTime;
		}

		public void setBackupStartTime(String backupStartTime) {
			this.backupStartTime = backupStartTime;
		}

		public Boolean getEnableBackupLog() {
			return this.enableBackupLog;
		}

		public void setEnableBackupLog(Boolean enableBackupLog) {
			this.enableBackupLog = enableBackupLog;
		}

		public Integer getBackupRetentionPeriod() {
			return this.backupRetentionPeriod;
		}

		public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
			this.backupRetentionPeriod = backupRetentionPeriod;
		}

		public Integer getDuplicationInfrequentAccessPeriod() {
			return this.duplicationInfrequentAccessPeriod;
		}

		public void setDuplicationInfrequentAccessPeriod(Integer duplicationInfrequentAccessPeriod) {
			this.duplicationInfrequentAccessPeriod = duplicationInfrequentAccessPeriod;
		}

		public Integer getDuplicationArchivePeriod() {
			return this.duplicationArchivePeriod;
		}

		public void setDuplicationArchivePeriod(Integer duplicationArchivePeriod) {
			this.duplicationArchivePeriod = duplicationArchivePeriod;
		}

		public String getBackupPlanName() {
			return this.backupPlanName;
		}

		public void setBackupPlanName(String backupPlanName) {
			this.backupPlanName = backupPlanName;
		}

		public String getSourceEndpointOracleSID() {
			return this.sourceEndpointOracleSID;
		}

		public void setSourceEndpointOracleSID(String sourceEndpointOracleSID) {
			this.sourceEndpointOracleSID = sourceEndpointOracleSID;
		}

		public String getInstanceClass() {
			return this.instanceClass;
		}

		public void setInstanceClass(String instanceClass) {
			this.instanceClass = instanceClass;
		}

		public String getBackupMethod() {
			return this.backupMethod;
		}

		public void setBackupMethod(String backupMethod) {
			this.backupMethod = backupMethod;
		}

		public Long getBackupPlanCreateTime() {
			return this.backupPlanCreateTime;
		}

		public void setBackupPlanCreateTime(Long backupPlanCreateTime) {
			this.backupPlanCreateTime = backupPlanCreateTime;
		}

		public String getBackupPlanStatus() {
			return this.backupPlanStatus;
		}

		public void setBackupPlanStatus(String backupPlanStatus) {
			this.backupPlanStatus = backupPlanStatus;
		}

		public Long getBeginTimestampForRestore() {
			return this.beginTimestampForRestore;
		}

		public void setBeginTimestampForRestore(Long beginTimestampForRestore) {
			this.beginTimestampForRestore = beginTimestampForRestore;
		}

		public Long getEndTimestampForRestore() {
			return this.endTimestampForRestore;
		}

		public void setEndTimestampForRestore(Long endTimestampForRestore) {
			this.endTimestampForRestore = endTimestampForRestore;
		}
	}

	@Override
	public DescribeBackupPlanListResponse getInstance(UnmarshallerContext context) {
		return	DescribeBackupPlanListResponseUnmarshaller.unmarshall(this, context);
	}
}
