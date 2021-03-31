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

package com.aliyuncs.openanalytics_open.model.v20200928;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.openanalytics_open.transform.v20200928.GetPartitionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPartitionResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String code;

	private Boolean success;

	private PartitionModel partitionModel;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public PartitionModel getPartitionModel() {
		return this.partitionModel;
	}

	public void setPartitionModel(PartitionModel partitionModel) {
		this.partitionModel = partitionModel;
	}

	public static class PartitionModel {

		private String tableName;

		private Map<Object,Object> parameters;

		private Long createTime;

		private String dbName;

		private List<String> values;

		private StorageDescriptorModel storageDescriptorModel;

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public Map<Object,Object> getParameters() {
			return this.parameters;
		}

		public void setParameters(Map<Object,Object> parameters) {
			this.parameters = parameters;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getDbName() {
			return this.dbName;
		}

		public void setDbName(String dbName) {
			this.dbName = dbName;
		}

		public List<String> getValues() {
			return this.values;
		}

		public void setValues(List<String> values) {
			this.values = values;
		}

		public StorageDescriptorModel getStorageDescriptorModel() {
			return this.storageDescriptorModel;
		}

		public void setStorageDescriptorModel(StorageDescriptorModel storageDescriptorModel) {
			this.storageDescriptorModel = storageDescriptorModel;
		}

		public static class StorageDescriptorModel {

			private Map<Object,Object> parameters;

			private String inputFormat;

			private String outputFormat;

			private String location;

			private List<FieldSchemaModel> cols;

			private SerDeInfoModel serDeInfoModel;

			public Map<Object,Object> getParameters() {
				return this.parameters;
			}

			public void setParameters(Map<Object,Object> parameters) {
				this.parameters = parameters;
			}

			public String getInputFormat() {
				return this.inputFormat;
			}

			public void setInputFormat(String inputFormat) {
				this.inputFormat = inputFormat;
			}

			public String getOutputFormat() {
				return this.outputFormat;
			}

			public void setOutputFormat(String outputFormat) {
				this.outputFormat = outputFormat;
			}

			public String getLocation() {
				return this.location;
			}

			public void setLocation(String location) {
				this.location = location;
			}

			public List<FieldSchemaModel> getCols() {
				return this.cols;
			}

			public void setCols(List<FieldSchemaModel> cols) {
				this.cols = cols;
			}

			public SerDeInfoModel getSerDeInfoModel() {
				return this.serDeInfoModel;
			}

			public void setSerDeInfoModel(SerDeInfoModel serDeInfoModel) {
				this.serDeInfoModel = serDeInfoModel;
			}

			public static class FieldSchemaModel {

				private String comment;

				private String type;

				private String name;

				public String getComment() {
					return this.comment;
				}

				public void setComment(String comment) {
					this.comment = comment;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}
			}

			public static class SerDeInfoModel {

				private String serializationLib;

				private Map<Object,Object> parameters;

				private String name;

				public String getSerializationLib() {
					return this.serializationLib;
				}

				public void setSerializationLib(String serializationLib) {
					this.serializationLib = serializationLib;
				}

				public Map<Object,Object> getParameters() {
					return this.parameters;
				}

				public void setParameters(Map<Object,Object> parameters) {
					this.parameters = parameters;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}
			}
		}
	}

	@Override
	public GetPartitionResponse getInstance(UnmarshallerContext context) {
		return	GetPartitionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
