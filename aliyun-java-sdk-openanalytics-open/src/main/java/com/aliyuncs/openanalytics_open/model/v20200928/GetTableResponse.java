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
import com.aliyuncs.openanalytics_open.transform.v20200928.GetTableResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTableResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String code;

	private Boolean success;

	private Table table;

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

	public Table getTable() {
		return this.table;
	}

	public void setTable(Table table) {
		this.table = table;
	}

	public static class Table {

		private String tableName;

		private String viewOriginalText;

		private String owner;

		private String tableType;

		private Map<Object,Object> parameters;

		private String viewExpandedText;

		private Long createTime;

		private String dbName;

		private Long lastAccessTime;

		private List<PartitionKeysItem> partitionKeys;

		private StorageDescriptor storageDescriptor;

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public String getViewOriginalText() {
			return this.viewOriginalText;
		}

		public void setViewOriginalText(String viewOriginalText) {
			this.viewOriginalText = viewOriginalText;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public String getTableType() {
			return this.tableType;
		}

		public void setTableType(String tableType) {
			this.tableType = tableType;
		}

		public Map<Object,Object> getParameters() {
			return this.parameters;
		}

		public void setParameters(Map<Object,Object> parameters) {
			this.parameters = parameters;
		}

		public String getViewExpandedText() {
			return this.viewExpandedText;
		}

		public void setViewExpandedText(String viewExpandedText) {
			this.viewExpandedText = viewExpandedText;
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

		public Long getLastAccessTime() {
			return this.lastAccessTime;
		}

		public void setLastAccessTime(Long lastAccessTime) {
			this.lastAccessTime = lastAccessTime;
		}

		public List<PartitionKeysItem> getPartitionKeys() {
			return this.partitionKeys;
		}

		public void setPartitionKeys(List<PartitionKeysItem> partitionKeys) {
			this.partitionKeys = partitionKeys;
		}

		public StorageDescriptor getStorageDescriptor() {
			return this.storageDescriptor;
		}

		public void setStorageDescriptor(StorageDescriptor storageDescriptor) {
			this.storageDescriptor = storageDescriptor;
		}

		public static class PartitionKeysItem {

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

		public static class StorageDescriptor {

			private Map<Object,Object> parameters;

			private String inputFormat;

			private String outputFormat;

			private String location;

			private List<ColsItem> cols;

			private SerDeInfo serDeInfo;

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

			public List<ColsItem> getCols() {
				return this.cols;
			}

			public void setCols(List<ColsItem> cols) {
				this.cols = cols;
			}

			public SerDeInfo getSerDeInfo() {
				return this.serDeInfo;
			}

			public void setSerDeInfo(SerDeInfo serDeInfo) {
				this.serDeInfo = serDeInfo;
			}

			public static class ColsItem {

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

			public static class SerDeInfo {

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
	public GetTableResponse getInstance(UnmarshallerContext context) {
		return	GetTableResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
