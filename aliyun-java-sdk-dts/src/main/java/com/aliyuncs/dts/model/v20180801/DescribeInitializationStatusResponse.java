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
import com.aliyuncs.dts.transform.v20180801.DescribeInitializationStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInitializationStatusResponse extends AcsResponse {

	private List<StructureInitializationDetail> structureInitializationDetails;

	private List<DataInitializationDetail> dataInitializationDetails;

	private List<DataSynchronizationDetail> dataSynchronizationDetails;

	public List<StructureInitializationDetail> getStructureInitializationDetails() {
		return this.structureInitializationDetails;
	}

	public void setStructureInitializationDetails(List<StructureInitializationDetail> structureInitializationDetails) {
		this.structureInitializationDetails = structureInitializationDetails;
	}

	public List<DataInitializationDetail> getDataInitializationDetails() {
		return this.dataInitializationDetails;
	}

	public void setDataInitializationDetails(List<DataInitializationDetail> dataInitializationDetails) {
		this.dataInitializationDetails = dataInitializationDetails;
	}

	public List<DataSynchronizationDetail> getDataSynchronizationDetails() {
		return this.dataSynchronizationDetails;
	}

	public void setDataSynchronizationDetails(List<DataSynchronizationDetail> dataSynchronizationDetails) {
		this.dataSynchronizationDetails = dataSynchronizationDetails;
	}

	public static class StructureInitializationDetail {

		private String objectName;

		private String objectType;

		private String sourceOwnerDBName;

		private String destinationOwnerDBName;

		private String status;

		private String errorMessage;

		private String objectDefinition;

		private List<StructureInitializationDetail1> constraints;

		public String getObjectName() {
			return this.objectName;
		}

		public void setObjectName(String objectName) {
			this.objectName = objectName;
		}

		public String getObjectType() {
			return this.objectType;
		}

		public void setObjectType(String objectType) {
			this.objectType = objectType;
		}

		public String getSourceOwnerDBName() {
			return this.sourceOwnerDBName;
		}

		public void setSourceOwnerDBName(String sourceOwnerDBName) {
			this.sourceOwnerDBName = sourceOwnerDBName;
		}

		public String getDestinationOwnerDBName() {
			return this.destinationOwnerDBName;
		}

		public void setDestinationOwnerDBName(String destinationOwnerDBName) {
			this.destinationOwnerDBName = destinationOwnerDBName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public String getObjectDefinition() {
			return this.objectDefinition;
		}

		public void setObjectDefinition(String objectDefinition) {
			this.objectDefinition = objectDefinition;
		}

		public List<StructureInitializationDetail1> getConstraints() {
			return this.constraints;
		}

		public void setConstraints(List<StructureInitializationDetail1> constraints) {
			this.constraints = constraints;
		}

		public static class StructureInitializationDetail1 {

			private String objectName;

			private String objectType;

			private String sourceOwnerDBName;

			private String destinationOwnerDBName;

			private String status;

			private String errorMessage;

			private String objectDefinition;

			public String getObjectName() {
				return this.objectName;
			}

			public void setObjectName(String objectName) {
				this.objectName = objectName;
			}

			public String getObjectType() {
				return this.objectType;
			}

			public void setObjectType(String objectType) {
				this.objectType = objectType;
			}

			public String getSourceOwnerDBName() {
				return this.sourceOwnerDBName;
			}

			public void setSourceOwnerDBName(String sourceOwnerDBName) {
				this.sourceOwnerDBName = sourceOwnerDBName;
			}

			public String getDestinationOwnerDBName() {
				return this.destinationOwnerDBName;
			}

			public void setDestinationOwnerDBName(String destinationOwnerDBName) {
				this.destinationOwnerDBName = destinationOwnerDBName;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getErrorMessage() {
				return this.errorMessage;
			}

			public void setErrorMessage(String errorMessage) {
				this.errorMessage = errorMessage;
			}

			public String getObjectDefinition() {
				return this.objectDefinition;
			}

			public void setObjectDefinition(String objectDefinition) {
				this.objectDefinition = objectDefinition;
			}
		}
	}

	public static class DataInitializationDetail {

		private String tableName;

		private String sourceOwnerDBName;

		private String destinationOwnerDBName;

		private String status;

		private String errorMessage;

		private String totalRowNum;

		private String finishRowNum;

		private String usedTime;

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public String getSourceOwnerDBName() {
			return this.sourceOwnerDBName;
		}

		public void setSourceOwnerDBName(String sourceOwnerDBName) {
			this.sourceOwnerDBName = sourceOwnerDBName;
		}

		public String getDestinationOwnerDBName() {
			return this.destinationOwnerDBName;
		}

		public void setDestinationOwnerDBName(String destinationOwnerDBName) {
			this.destinationOwnerDBName = destinationOwnerDBName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public String getTotalRowNum() {
			return this.totalRowNum;
		}

		public void setTotalRowNum(String totalRowNum) {
			this.totalRowNum = totalRowNum;
		}

		public String getFinishRowNum() {
			return this.finishRowNum;
		}

		public void setFinishRowNum(String finishRowNum) {
			this.finishRowNum = finishRowNum;
		}

		public String getUsedTime() {
			return this.usedTime;
		}

		public void setUsedTime(String usedTime) {
			this.usedTime = usedTime;
		}
	}

	public static class DataSynchronizationDetail {

		private String tableName;

		private String sourceOwnerDBName;

		private String destinationOwnerDBName;

		private String status;

		private String errorMessage;

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public String getSourceOwnerDBName() {
			return this.sourceOwnerDBName;
		}

		public void setSourceOwnerDBName(String sourceOwnerDBName) {
			this.sourceOwnerDBName = sourceOwnerDBName;
		}

		public String getDestinationOwnerDBName() {
			return this.destinationOwnerDBName;
		}

		public void setDestinationOwnerDBName(String destinationOwnerDBName) {
			this.destinationOwnerDBName = destinationOwnerDBName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}
	}

	@Override
	public DescribeInitializationStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeInitializationStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
