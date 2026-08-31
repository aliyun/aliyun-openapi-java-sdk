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

package com.aliyuncs.dataphin_public.model.v20230630;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.ExecKgGremlinResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ExecKgGremlinResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Integer httpStatusCode;

	private String code;

	private Boolean success;

	private Data data;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String execQuery;

		private List<Row> rowList;

		private List<Node> nodeList;

		private List<Edge> edgeList;

		public String getExecQuery() {
			return this.execQuery;
		}

		public void setExecQuery(String execQuery) {
			this.execQuery = execQuery;
		}

		public List<Row> getRowList() {
			return this.rowList;
		}

		public void setRowList(List<Row> rowList) {
			this.rowList = rowList;
		}

		public List<Node> getNodeList() {
			return this.nodeList;
		}

		public void setNodeList(List<Node> nodeList) {
			this.nodeList = nodeList;
		}

		public List<Edge> getEdgeList() {
			return this.edgeList;
		}

		public void setEdgeList(List<Edge> edgeList) {
			this.edgeList = edgeList;
		}

		public static class Row {

			private List<Column> columns;

			public List<Column> getColumns() {
				return this.columns;
			}

			public void setColumns(List<Column> columns) {
				this.columns = columns;
			}

			public static class Column {

				private String value;

				private String code;

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public String getCode() {
					return this.code;
				}

				public void setCode(String code) {
					this.code = code;
				}
			}
		}

		public static class Node {

			private String entityType;

			private String dataId;

			private List<Propertie> properties;

			public String getEntityType() {
				return this.entityType;
			}

			public void setEntityType(String entityType) {
				this.entityType = entityType;
			}

			public String getDataId() {
				return this.dataId;
			}

			public void setDataId(String dataId) {
				this.dataId = dataId;
			}

			public List<Propertie> getProperties() {
				return this.properties;
			}

			public void setProperties(List<Propertie> properties) {
				this.properties = properties;
			}

			public static class Propertie {

				private String value;

				private String code;

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public String getCode() {
					return this.code;
				}

				public void setCode(String code) {
					this.code = code;
				}
			}
		}

		public static class Edge {

			private String targetEntityType;

			private String dataId;

			private String sourceEntityType;

			private String relationType;

			private String sourceEntityDataId;

			private String targetEntityDataId;

			private List<Propertie2> properties1;

			public String getTargetEntityType() {
				return this.targetEntityType;
			}

			public void setTargetEntityType(String targetEntityType) {
				this.targetEntityType = targetEntityType;
			}

			public String getDataId() {
				return this.dataId;
			}

			public void setDataId(String dataId) {
				this.dataId = dataId;
			}

			public String getSourceEntityType() {
				return this.sourceEntityType;
			}

			public void setSourceEntityType(String sourceEntityType) {
				this.sourceEntityType = sourceEntityType;
			}

			public String getRelationType() {
				return this.relationType;
			}

			public void setRelationType(String relationType) {
				this.relationType = relationType;
			}

			public String getSourceEntityDataId() {
				return this.sourceEntityDataId;
			}

			public void setSourceEntityDataId(String sourceEntityDataId) {
				this.sourceEntityDataId = sourceEntityDataId;
			}

			public String getTargetEntityDataId() {
				return this.targetEntityDataId;
			}

			public void setTargetEntityDataId(String targetEntityDataId) {
				this.targetEntityDataId = targetEntityDataId;
			}

			public List<Propertie2> getProperties1() {
				return this.properties1;
			}

			public void setProperties1(List<Propertie2> properties1) {
				this.properties1 = properties1;
			}

			public static class Propertie2 {

				private String value;

				private String code;

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public String getCode() {
					return this.code;
				}

				public void setCode(String code) {
					this.code = code;
				}
			}
		}
	}

	@Override
	public ExecKgGremlinResponse getInstance(UnmarshallerContext context) {
		return	ExecKgGremlinResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
