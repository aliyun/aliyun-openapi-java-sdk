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
import com.aliyuncs.dts.transform.v20200101.DescribeMigrationJobsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMigrationJobsResponse extends AcsResponse {

	private Integer pageNumber;

	private Integer pageRecordCount;

	private String requestId;

	private Long totalRecordCount;

	private List<MigrationJob> migrationJobs;

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(Integer pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Long totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public List<MigrationJob> getMigrationJobs() {
		return this.migrationJobs;
	}

	public void setMigrationJobs(List<MigrationJob> migrationJobs) {
		this.migrationJobs = migrationJobs;
	}

	public static class MigrationJob {

		private String migrationJobClass;

		private String migrationJobID;

		private String migrationJobName;

		private String migrationJobStatus;

		private String payType;

		private List<SynchronousObject> migrationObject;

		private DataInitialization dataInitialization;

		private DataSynchronization dataSynchronization;

		private DestinationEndpoint destinationEndpoint;

		private MigrationMode migrationMode;

		private Precheck precheck;

		private SourceEndpoint sourceEndpoint;

		private StructureInitialization structureInitialization;

		public String getMigrationJobClass() {
			return this.migrationJobClass;
		}

		public void setMigrationJobClass(String migrationJobClass) {
			this.migrationJobClass = migrationJobClass;
		}

		public String getMigrationJobID() {
			return this.migrationJobID;
		}

		public void setMigrationJobID(String migrationJobID) {
			this.migrationJobID = migrationJobID;
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

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public List<SynchronousObject> getMigrationObject() {
			return this.migrationObject;
		}

		public void setMigrationObject(List<SynchronousObject> migrationObject) {
			this.migrationObject = migrationObject;
		}

		public DataInitialization getDataInitialization() {
			return this.dataInitialization;
		}

		public void setDataInitialization(DataInitialization dataInitialization) {
			this.dataInitialization = dataInitialization;
		}

		public DataSynchronization getDataSynchronization() {
			return this.dataSynchronization;
		}

		public void setDataSynchronization(DataSynchronization dataSynchronization) {
			this.dataSynchronization = dataSynchronization;
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

		public Precheck getPrecheck() {
			return this.precheck;
		}

		public void setPrecheck(Precheck precheck) {
			this.precheck = precheck;
		}

		public SourceEndpoint getSourceEndpoint() {
			return this.sourceEndpoint;
		}

		public void setSourceEndpoint(SourceEndpoint sourceEndpoint) {
			this.sourceEndpoint = sourceEndpoint;
		}

		public StructureInitialization getStructureInitialization() {
			return this.structureInitialization;
		}

		public void setStructureInitialization(StructureInitialization structureInitialization) {
			this.structureInitialization = structureInitialization;
		}

		public static class SynchronousObject {

			private String databaseName;

			private String wholeDatabase;

			private List<String> tableList;

			public String getDatabaseName() {
				return this.databaseName;
			}

			public void setDatabaseName(String databaseName) {
				this.databaseName = databaseName;
			}

			public String getWholeDatabase() {
				return this.wholeDatabase;
			}

			public void setWholeDatabase(String wholeDatabase) {
				this.wholeDatabase = wholeDatabase;
			}

			public List<String> getTableList() {
				return this.tableList;
			}

			public void setTableList(List<String> tableList) {
				this.tableList = tableList;
			}
		}

		public static class DataInitialization {

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

		public static class DataSynchronization {

			private String delay;

			private String errorMessage;

			private String percent;

			private String status;

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

			private String instanceID;

			private String instanceType;

			private String oracleSID;

			private String port;

			private String userName;

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

			public String getInstanceID() {
				return this.instanceID;
			}

			public void setInstanceID(String instanceID) {
				this.instanceID = instanceID;
			}

			public String getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(String instanceType) {
				this.instanceType = instanceType;
			}

			public String getOracleSID() {
				return this.oracleSID;
			}

			public void setOracleSID(String oracleSID) {
				this.oracleSID = oracleSID;
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

		public static class Precheck {

			private String percent;

			private String status;

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

		public static class SourceEndpoint {

			private String databaseName;

			private String engineName;

			private String iP;

			private String instanceID;

			private String instanceType;

			private String oracleSID;

			private String port;

			private String userName;

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

			public String getInstanceID() {
				return this.instanceID;
			}

			public void setInstanceID(String instanceID) {
				this.instanceID = instanceID;
			}

			public String getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(String instanceType) {
				this.instanceType = instanceType;
			}

			public String getOracleSID() {
				return this.oracleSID;
			}

			public void setOracleSID(String oracleSID) {
				this.oracleSID = oracleSID;
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
		}

		public static class StructureInitialization {

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
	}

	@Override
	public DescribeMigrationJobsResponse getInstance(UnmarshallerContext context) {
		return	DescribeMigrationJobsResponseUnmarshaller.unmarshall(this, context);
	}
}
