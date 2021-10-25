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

package com.aliyuncs.dts.model.v20200101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dts.transform.v20200101.DescribeMigrationJobStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMigrationJobStatusResponse extends AcsResponse {

	private String errCode;

	private String errMessage;

	private String migrationJobClass;

	private String migrationJobId;

	private String migrationJobName;

	private String migrationJobStatus;

	private String migrationObject;

	private String payType;

	private String requestId;

	private String success;

	private String taskId;

	private DataInitializationStatus dataInitializationStatus;

	private DataSynchronizationStatus dataSynchronizationStatus;

	private DestinationEndpoint destinationEndpoint;

	private MigrationMode migrationMode;

	private PrecheckStatus precheckStatus;

	private SourceEndpoint sourceEndpoint;

	private StructureInitializationStatus structureInitializationStatus;

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

	public String getMigrationJobClass() {
		return this.migrationJobClass;
	}

	public void setMigrationJobClass(String migrationJobClass) {
		this.migrationJobClass = migrationJobClass;
	}

	public String getMigrationJobId() {
		return this.migrationJobId;
	}

	public void setMigrationJobId(String migrationJobId) {
		this.migrationJobId = migrationJobId;
	}

	public String getMigrationJobName() {
		return this.migrationJobName;
	}

	public void setMigrationJobName(String migrationJobName) {
		this.migrationJobName = migrationJobName;
	}

	public String getMigrationJobStatus() {
		return this.migrationJobStatus;
	}

	public void setMigrationJobStatus(String migrationJobStatus) {
		this.migrationJobStatus = migrationJobStatus;
	}

	public String getMigrationObject() {
		return this.migrationObject;
	}

	public void setMigrationObject(String migrationObject) {
		this.migrationObject = migrationObject;
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public DataInitializationStatus getDataInitializationStatus() {
		return this.dataInitializationStatus;
	}

	public void setDataInitializationStatus(DataInitializationStatus dataInitializationStatus) {
		this.dataInitializationStatus = dataInitializationStatus;
	}

	public DataSynchronizationStatus getDataSynchronizationStatus() {
		return this.dataSynchronizationStatus;
	}

	public void setDataSynchronizationStatus(DataSynchronizationStatus dataSynchronizationStatus) {
		this.dataSynchronizationStatus = dataSynchronizationStatus;
	}

	public DestinationEndpoint getDestinationEndpoint() {
		return this.destinationEndpoint;
	}

	public void setDestinationEndpoint(DestinationEndpoint destinationEndpoint) {
		this.destinationEndpoint = destinationEndpoint;
	}

	public MigrationMode getMigrationMode() {
		return this.migrationMode;
	}

	public void setMigrationMode(MigrationMode migrationMode) {
		this.migrationMode = migrationMode;
	}

	public PrecheckStatus getPrecheckStatus() {
		return this.precheckStatus;
	}

	public void setPrecheckStatus(PrecheckStatus precheckStatus) {
		this.precheckStatus = precheckStatus;
	}

	public SourceEndpoint getSourceEndpoint() {
		return this.sourceEndpoint;
	}

	public void setSourceEndpoint(SourceEndpoint sourceEndpoint) {
		this.sourceEndpoint = sourceEndpoint;
	}

	public StructureInitializationStatus getStructureInitializationStatus() {
		return this.structureInitializationStatus;
	}

	public void setStructureInitializationStatus(StructureInitializationStatus structureInitializationStatus) {
		this.structureInitializationStatus = structureInitializationStatus;
	}

	public static class DataInitializationStatus {

		private String errorMessage;

		private String percent;

		private String progress;

		private String status;

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public String getPercent() {
			return this.percent;
		}

		public void setPercent(String percent) {
			this.percent = percent;
		}

		public String getProgress() {
			return this.progress;
		}

		public void setProgress(String progress) {
			this.progress = progress;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	public static class DataSynchronizationStatus {

		private String checkpoint;

		private String delay;

		private String errorMessage;

		private String percent;

		private String status;

		public String getCheckpoint() {
			return this.checkpoint;
		}

		public void setCheckpoint(String checkpoint) {
			this.checkpoint = checkpoint;
		}

		public String getDelay() {
			return this.delay;
		}

		public void setDelay(String delay) {
			this.delay = delay;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public String getPercent() {
			return this.percent;
		}

		public void setPercent(String percent) {
			this.percent = percent;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	public static class DestinationEndpoint {

		private String databaseName;

		private String engineName;

		private String iP;

		private String instanceId;

		private String instanceType;

		private String port;

		private String userName;

		private String oracleSID;

		public String getDatabaseName() {
			return this.databaseName;
		}

		public void setDatabaseName(String databaseName) {
			this.databaseName = databaseName;
		}

		public String getEngineName() {
			return this.engineName;
		}

		public void setEngineName(String engineName) {
			this.engineName = engineName;
		}

		public String getIP() {
			return this.iP;
		}

		public void setIP(String iP) {
			this.iP = iP;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getPort() {
			return this.port;
		}

		public void setPort(String port) {
			this.port = port;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getOracleSID() {
			return this.oracleSID;
		}

		public void setOracleSID(String oracleSID) {
			this.oracleSID = oracleSID;
		}
	}

	public static class MigrationMode {

		private Boolean dataInitialization;

		private Boolean dataSynchronization;

		private Boolean structureInitialization;

		public Boolean getDataInitialization() {
			return this.dataInitialization;
		}

		public void setDataInitialization(Boolean dataInitialization) {
			this.dataInitialization = dataInitialization;
		}

		public Boolean getDataSynchronization() {
			return this.dataSynchronization;
		}

		public void setDataSynchronization(Boolean dataSynchronization) {
			this.dataSynchronization = dataSynchronization;
		}

		public Boolean getStructureInitialization() {
			return this.structureInitialization;
		}

		public void setStructureInitialization(Boolean structureInitialization) {
			this.structureInitialization = structureInitialization;
		}
	}

	public static class PrecheckStatus {

		private String percent;

		private String status;

		private List<CheckItem> detail;

		public String getPercent() {
			return this.percent;
		}

		public void setPercent(String percent) {
			this.percent = percent;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public List<CheckItem> getDetail() {
			return this.detail;
		}

		public void setDetail(List<CheckItem> detail) {
			this.detail = detail;
		}

		public static class CheckItem {

			private String checkStatus;

			private String errorMessage;

			private String itemName;

			private String repairMethod;

			public String getCheckStatus() {
				return this.checkStatus;
			}

			public void setCheckStatus(String checkStatus) {
				this.checkStatus = checkStatus;
			}

			public String getErrorMessage() {
				return this.errorMessage;
			}

			public void setErrorMessage(String errorMessage) {
				this.errorMessage = errorMessage;
			}

			public String getItemName() {
				return this.itemName;
			}

			public void setItemName(String itemName) {
				this.itemName = itemName;
			}

			public String getRepairMethod() {
				return this.repairMethod;
			}

			public void setRepairMethod(String repairMethod) {
				this.repairMethod = repairMethod;
			}
		}
	}

	public static class SourceEndpoint {

		private String databaseName;

		private String engineName;

		private String iP;

		private String instanceId;

		private String instanceType;

		private String port;

		private String userName;

		private String oracleSID;

		public String getDatabaseName() {
			return this.databaseName;
		}

		public void setDatabaseName(String databaseName) {
			this.databaseName = databaseName;
		}

		public String getEngineName() {
			return this.engineName;
		}

		public void setEngineName(String engineName) {
			this.engineName = engineName;
		}

		public String getIP() {
			return this.iP;
		}

		public void setIP(String iP) {
			this.iP = iP;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getPort() {
			return this.port;
		}

		public void setPort(String port) {
			this.port = port;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getOracleSID() {
			return this.oracleSID;
		}

		public void setOracleSID(String oracleSID) {
			this.oracleSID = oracleSID;
		}
	}

	public static class StructureInitializationStatus {

		private String errorMessage;

		private String percent;

		private String progress;

		private String status;

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public String getPercent() {
			return this.percent;
		}

		public void setPercent(String percent) {
			this.percent = percent;
		}

		public String getProgress() {
			return this.progress;
		}

		public void setProgress(String progress) {
			this.progress = progress;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public DescribeMigrationJobStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeMigrationJobStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
