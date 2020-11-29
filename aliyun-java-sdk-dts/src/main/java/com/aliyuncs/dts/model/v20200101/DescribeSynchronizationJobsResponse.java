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
import com.aliyuncs.dts.transform.v20200101.DescribeSynchronizationJobsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSynchronizationJobsResponse extends AcsResponse {

	private Integer pageNumber;

	private Integer pageRecordCount;

	private String requestId;

	private Long totalRecordCount;

	private List<SynchronizationInstance> synchronizationInstances;

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

	public List<SynchronizationInstance> getSynchronizationInstances() {
		return this.synchronizationInstances;
	}

	public void setSynchronizationInstances(List<SynchronizationInstance> synchronizationInstances) {
		this.synchronizationInstances = synchronizationInstances;
	}

	public static class SynchronizationInstance {

		private String createTime;

		private String dataInitialization;

		private String delay;

		private String errorMessage;

		private String expireTime;

		private String payType;

		private String status;

		private String structureInitialization;

		private String synchronizationDirection;

		private String synchronizationJobClass;

		private String synchronizationJobId;

		private String synchronizationJobName;

		private List<SynchronizationObject> synchronizationObjects;

		private DataInitializationStatus dataInitializationStatus;

		private DataSynchronizationStatus dataSynchronizationStatus;

		private DestinationEndpoint destinationEndpoint;

		private Performance performance;

		private PrecheckStatus precheckStatus;

		private SourceEndpoint sourceEndpoint;

		private StructureInitializationStatus structureInitializationStatus;

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getDataInitialization() {
			return this.dataInitialization;
		}

		public void setDataInitialization(String dataInitialization) {
			this.dataInitialization = dataInitialization;
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

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getStructureInitialization() {
			return this.structureInitialization;
		}

		public void setStructureInitialization(String structureInitialization) {
			this.structureInitialization = structureInitialization;
		}

		public String getSynchronizationDirection() {
			return this.synchronizationDirection;
		}

		public void setSynchronizationDirection(String synchronizationDirection) {
			this.synchronizationDirection = synchronizationDirection;
		}

		public String getSynchronizationJobClass() {
			return this.synchronizationJobClass;
		}

		public void setSynchronizationJobClass(String synchronizationJobClass) {
			this.synchronizationJobClass = synchronizationJobClass;
		}

		public String getSynchronizationJobId() {
			return this.synchronizationJobId;
		}

		public void setSynchronizationJobId(String synchronizationJobId) {
			this.synchronizationJobId = synchronizationJobId;
		}

		public String getSynchronizationJobName() {
			return this.synchronizationJobName;
		}

		public void setSynchronizationJobName(String synchronizationJobName) {
			this.synchronizationJobName = synchronizationJobName;
		}

		public List<SynchronizationObject> getSynchronizationObjects() {
			return this.synchronizationObjects;
		}

		public void setSynchronizationObjects(List<SynchronizationObject> synchronizationObjects) {
			this.synchronizationObjects = synchronizationObjects;
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

		public Performance getPerformance() {
			return this.performance;
		}

		public void setPerformance(Performance performance) {
			this.performance = performance;
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

		public static class SynchronizationObject {

			private String newSchemaName;

			private String schemaName;

			private List<TableExclude> tableExcludes;

			private List<TableInclude> tableIncludes;

			public String getNewSchemaName() {
				return this.newSchemaName;
			}

			public void setNewSchemaName(String newSchemaName) {
				this.newSchemaName = newSchemaName;
			}

			public String getSchemaName() {
				return this.schemaName;
			}

			public void setSchemaName(String schemaName) {
				this.schemaName = schemaName;
			}

			public List<TableExclude> getTableExcludes() {
				return this.tableExcludes;
			}

			public void setTableExcludes(List<TableExclude> tableExcludes) {
				this.tableExcludes = tableExcludes;
			}

			public List<TableInclude> getTableIncludes() {
				return this.tableIncludes;
			}

			public void setTableIncludes(List<TableInclude> tableIncludes) {
				this.tableIncludes = tableIncludes;
			}

			public static class TableExclude {

				private String tableName;

				public String getTableName() {
					return this.tableName;
				}

				public void setTableName(String tableName) {
					this.tableName = tableName;
				}
			}

			public static class TableInclude {

				private String tableName;

				public String getTableName() {
					return this.tableName;
				}

				public void setTableName(String tableName) {
					this.tableName = tableName;
				}
			}
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

			private String engineName;

			private String iP;

			private String instanceId;

			private String instanceType;

			private String port;

			private String userName;

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
		}

		public static class Performance {

			private String fLOW;

			private String rPS;

			public String getFLOW() {
				return this.fLOW;
			}

			public void setFLOW(String fLOW) {
				this.fLOW = fLOW;
			}

			public String getRPS() {
				return this.rPS;
			}

			public void setRPS(String rPS) {
				this.rPS = rPS;
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

			private String engineName;

			private String iP;

			private String instanceId;

			private String instanceType;

			private String port;

			private String userName;

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
	}

	@Override
	public DescribeSynchronizationJobsResponse getInstance(UnmarshallerContext context) {
		return	DescribeSynchronizationJobsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
