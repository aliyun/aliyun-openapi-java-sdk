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

package com.aliyuncs.dts.model.v20180801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dts.transform.v20180801.DescribeMigrationJobStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMigrationJobStatusResponse extends AcsResponse {

	private String migrationJobId;

	private String migrationJobName;

	private String payType;

	private String migrationJobClass;

	private String migrationObject;

	private String migrationJobStatus;

	private SourceEndpoint sourceEndpoint;

	private DestinationEndpoint destinationEndpoint;

	private MigrationMode migrationMode;

	private PrecheckStatus precheckStatus;

	private StructureInitializationStatus structureInitializationStatus;

	private DataInitializationStatus dataInitializationStatus;

	private DataSynchronizationStatus dataSynchronizationStatus;

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

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getMigrationJobClass() {
		return this.migrationJobClass;
	}

	public void setMigrationJobClass(String migrationJobClass) {
		this.migrationJobClass = migrationJobClass;
	}

	public String getMigrationObject() {
		return this.migrationObject;
	}

	public void setMigrationObject(String migrationObject) {
		this.migrationObject = migrationObject;
	}

	public String getMigrationJobStatus() {
		return this.migrationJobStatus;
	}

	public void setMigrationJobStatus(String migrationJobStatus) {
		this.migrationJobStatus = migrationJobStatus;
	}

	public SourceEndpoint getSourceEndpoint() {
		return this.sourceEndpoint;
	}

	public void setSourceEndpoint(SourceEndpoint sourceEndpoint) {
		this.sourceEndpoint = sourceEndpoint;
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

	public StructureInitializationStatus getStructureInitializationStatus() {
		return this.structureInitializationStatus;
	}

	public void setStructureInitializationStatus(StructureInitializationStatus structureInitializationStatus) {
		this.structureInitializationStatus = structureInitializationStatus;
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

	public static class SourceEndpoint {

		private String instanceType;

		private String instanceId;

		private String engineName;

		private String iP;

		private String port;

		private String databaseName;

		private String oracleSID;

		private String userName;

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
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

		public String getPort() {
			return this.port;
		}

		public void setPort(String port) {
			this.port = port;
		}

		public String getDatabaseName() {
			return this.databaseName;
		}

		public void setDatabaseName(String databaseName) {
			this.databaseName = databaseName;
		}

		public String getOracleSID() {
			return this.oracleSID;
		}

		public void setOracleSID(String oracleSID) {
			this.oracleSID = oracleSID;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}
	}

	public static class DestinationEndpoint {

		private String instanceType;

		private String instanceId;

		private String engineName;

		private String iP;

		private String port;

		private String databaseName;

		private String oracleSID;

		private String userName;

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
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

		public String getPort() {
			return this.port;
		}

		public void setPort(String port) {
			this.port = port;
		}

		public String getDatabaseName() {
			return this.databaseName;
		}

		public void setDatabaseName(String databaseName) {
			this.databaseName = databaseName;
		}

		public String getOracleSID() {
			return this.oracleSID;
		}

		public void setOracleSID(String oracleSID) {
			this.oracleSID = oracleSID;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}
	}

	public static class MigrationMode {

		private Boolean structureInitialization;

		private Boolean dataInitialization;

		private Boolean dataSynchronization;

		public Boolean getStructureInitialization() {
			return this.structureInitialization;
		}

		public void setStructureInitialization(Boolean structureInitialization) {
			this.structureInitialization = structureInitialization;
		}

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
	}

	public static class PrecheckStatus {

		private String status;

		private String percent;

		private List<CheckItem> detail;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getPercent() {
			return this.percent;
		}

		public void setPercent(String percent) {
			this.percent = percent;
		}

		public List<CheckItem> getDetail() {
			return this.detail;
		}

		public void setDetail(List<CheckItem> detail) {
			this.detail = detail;
		}

		public static class CheckItem {

			private String itemName;

			private String checkStatus;

			private String errorMessage;

			private String repairMethod;

			public String getItemName() {
				return this.itemName;
			}

			public void setItemName(String itemName) {
				this.itemName = itemName;
			}

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

			public String getRepairMethod() {
				return this.repairMethod;
			}

			public void setRepairMethod(String repairMethod) {
				this.repairMethod = repairMethod;
			}
		}
	}

	public static class StructureInitializationStatus {

		private String status;

		private String percent;

		private String errorMessage;

		private String progress;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getPercent() {
			return this.percent;
		}

		public void setPercent(String percent) {
			this.percent = percent;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public String getProgress() {
			return this.progress;
		}

		public void setProgress(String progress) {
			this.progress = progress;
		}
	}

	public static class DataInitializationStatus {

		private String status;

		private String percent;

		private String errorMessage;

		private String progress;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getPercent() {
			return this.percent;
		}

		public void setPercent(String percent) {
			this.percent = percent;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public String getProgress() {
			return this.progress;
		}

		public void setProgress(String progress) {
			this.progress = progress;
		}
	}

	public static class DataSynchronizationStatus {

		private String status;

		private String percent;

		private String errorMessage;

		private String delay;

		private String checkpoint;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getPercent() {
			return this.percent;
		}

		public void setPercent(String percent) {
			this.percent = percent;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public String getDelay() {
			return this.delay;
		}

		public void setDelay(String delay) {
			this.delay = delay;
		}

		public String getCheckpoint() {
			return this.checkpoint;
		}

		public void setCheckpoint(String checkpoint) {
			this.checkpoint = checkpoint;
		}
	}

	@Override
	public DescribeMigrationJobStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeMigrationJobStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
