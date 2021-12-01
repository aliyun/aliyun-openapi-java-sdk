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
import com.aliyuncs.dts.transform.v20200101.DescribeMigrationJobDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMigrationJobDetailResponse extends AcsResponse {

	private String requestId;

	private String errCode;

	private Integer pageRecordCount;

	private String success;

	private Long totalRecordCount;

	private String errMessage;

	private Integer pageNumber;

	private List<DataInitializationDetail> dataInitializationDetailList;

	private List<DataSynchronizationDetail> dataSynchronizationDetailList;

	private List<StructureInitializationDetail> structureInitializationDetailList;

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

	public Integer getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(Integer pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public Long getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Long totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public String getErrMessage() {
		return this.errMessage;
	}

	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<DataInitializationDetail> getDataInitializationDetailList() {
		return this.dataInitializationDetailList;
	}

	public void setDataInitializationDetailList(List<DataInitializationDetail> dataInitializationDetailList) {
		this.dataInitializationDetailList = dataInitializationDetailList;
	}

	public List<DataSynchronizationDetail> getDataSynchronizationDetailList() {
		return this.dataSynchronizationDetailList;
	}

	public void setDataSynchronizationDetailList(List<DataSynchronizationDetail> dataSynchronizationDetailList) {
		this.dataSynchronizationDetailList = dataSynchronizationDetailList;
	}

	public List<StructureInitializationDetail> getStructureInitializationDetailList() {
		return this.structureInitializationDetailList;
	}

	public void setStructureInitializationDetailList(List<StructureInitializationDetail> structureInitializationDetailList) {
		this.structureInitializationDetailList = structureInitializationDetailList;
	}

	public static class DataInitializationDetail {

		private String sourceOwnerDBName;

		private String status;

		private String tableName;

		private String errorMessage;

		private String finishRowNum;

		private String migrationTime;

		private String destinationOwnerDBName;

		private String totalRowNum;

		public String getSourceOwnerDBName() {
			return this.sourceOwnerDBName;
		}

		public void setSourceOwnerDBName(String sourceOwnerDBName) {
			this.sourceOwnerDBName = sourceOwnerDBName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public String getFinishRowNum() {
			return this.finishRowNum;
		}

		public void setFinishRowNum(String finishRowNum) {
			this.finishRowNum = finishRowNum;
		}

		public String getMigrationTime() {
			return this.migrationTime;
		}

		public void setMigrationTime(String migrationTime) {
			this.migrationTime = migrationTime;
		}

		public String getDestinationOwnerDBName() {
			return this.destinationOwnerDBName;
		}

		public void setDestinationOwnerDBName(String destinationOwnerDBName) {
			this.destinationOwnerDBName = destinationOwnerDBName;
		}

		public String getTotalRowNum() {
			return this.totalRowNum;
		}

		public void setTotalRowNum(String totalRowNum) {
			this.totalRowNum = totalRowNum;
		}
	}

	public static class DataSynchronizationDetail {

		private String status;

		private String sourceOwnerDBName;

		private String tableName;

		private String errorMessage;

		private String destinationOwnerDBName;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getSourceOwnerDBName() {
			return this.sourceOwnerDBName;
		}

		public void setSourceOwnerDBName(String sourceOwnerDBName) {
			this.sourceOwnerDBName = sourceOwnerDBName;
		}

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public String getDestinationOwnerDBName() {
			return this.destinationOwnerDBName;
		}

		public void setDestinationOwnerDBName(String destinationOwnerDBName) {
			this.destinationOwnerDBName = destinationOwnerDBName;
		}
	}

	public static class StructureInitializationDetail {

		private String status;

		private String sourceOwnerDBName;

		private String objectDefinition;

		private String objectType;

		private String errorMessage;

		private String destinationOwnerDBName;

		private String objectName;

		private List<StructureInitializationDetail1> constraintList;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getSourceOwnerDBName() {
			return this.sourceOwnerDBName;
		}

		public void setSourceOwnerDBName(String sourceOwnerDBName) {
			this.sourceOwnerDBName = sourceOwnerDBName;
		}

		public String getObjectDefinition() {
			return this.objectDefinition;
		}

		public void setObjectDefinition(String objectDefinition) {
			this.objectDefinition = objectDefinition;
		}

		public String getObjectType() {
			return this.objectType;
		}

		public void setObjectType(String objectType) {
			this.objectType = objectType;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public String getDestinationOwnerDBName() {
			return this.destinationOwnerDBName;
		}

		public void setDestinationOwnerDBName(String destinationOwnerDBName) {
			this.destinationOwnerDBName = destinationOwnerDBName;
		}

		public String getObjectName() {
			return this.objectName;
		}

		public void setObjectName(String objectName) {
			this.objectName = objectName;
		}

		public List<StructureInitializationDetail1> getConstraintList() {
			return this.constraintList;
		}

		public void setConstraintList(List<StructureInitializationDetail1> constraintList) {
			this.constraintList = constraintList;
		}

		public static class StructureInitializationDetail1 {

			private String status;

			private String sourceOwnerDBName;

			private String objectDefinition;

			private String objectType;

			private String errorMessage;

			private String destinationOwnerDBName;

			private String objectName;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getSourceOwnerDBName() {
				return this.sourceOwnerDBName;
			}

			public void setSourceOwnerDBName(String sourceOwnerDBName) {
				this.sourceOwnerDBName = sourceOwnerDBName;
			}

			public String getObjectDefinition() {
				return this.objectDefinition;
			}

			public void setObjectDefinition(String objectDefinition) {
				this.objectDefinition = objectDefinition;
			}

			public String getObjectType() {
				return this.objectType;
			}

			public void setObjectType(String objectType) {
				this.objectType = objectType;
			}

			public String getErrorMessage() {
				return this.errorMessage;
			}

			public void setErrorMessage(String errorMessage) {
				this.errorMessage = errorMessage;
			}

			public String getDestinationOwnerDBName() {
				return this.destinationOwnerDBName;
			}

			public void setDestinationOwnerDBName(String destinationOwnerDBName) {
				this.destinationOwnerDBName = destinationOwnerDBName;
			}

			public String getObjectName() {
				return this.objectName;
			}

			public void setObjectName(String objectName) {
				this.objectName = objectName;
			}
		}
	}

	@Override
	public DescribeMigrationJobDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeMigrationJobDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
