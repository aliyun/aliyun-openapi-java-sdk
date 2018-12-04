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

package com.aliyuncs.baas.model.v20180731;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.baas.transform.v20180731.GetBcSchemaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetBcSchemaResponse extends AcsResponse {

	private String requestId;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private List<ResponsesItem> responses;

		private Schema schema;

		public List<ResponsesItem> getResponses() {
			return this.responses;
		}

		public void setResponses(List<ResponsesItem> responses) {
			this.responses = responses;
		}

		public Schema getSchema() {
			return this.schema;
		}

		public void setSchema(Schema schema) {
			this.schema = schema;
		}

		public static class ResponsesItem {

			private String categoryName;

			private String description;

			private String category;

			private Properties properties;

			public String getCategoryName() {
				return this.categoryName;
			}

			public void setCategoryName(String categoryName) {
				this.categoryName = categoryName;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getCategory() {
				return this.category;
			}

			public void setCategory(String category) {
				this.category = category;
			}

			public Properties getProperties() {
				return this.properties;
			}

			public void setProperties(Properties properties) {
				this.properties = properties;
			}

			public static class Properties {

				private Integer count;

				private List<DataSourceItem> dataSource;

				public Integer getCount() {
					return this.count;
				}

				public void setCount(Integer count) {
					this.count = count;
				}

				public List<DataSourceItem> getDataSource() {
					return this.dataSource;
				}

				public void setDataSource(List<DataSourceItem> dataSource) {
					this.dataSource = dataSource;
				}

				public static class DataSourceItem {

					private Integer key;

					private String field;

					private String type;

					private Integer length;

					private Integer allowNull;

					private String reg;

					private Integer indexes;

					private String annotation;

					public Integer getKey() {
						return this.key;
					}

					public void setKey(Integer key) {
						this.key = key;
					}

					public String getField() {
						return this.field;
					}

					public void setField(String field) {
						this.field = field;
					}

					public String getType() {
						return this.type;
					}

					public void setType(String type) {
						this.type = type;
					}

					public Integer getLength() {
						return this.length;
					}

					public void setLength(Integer length) {
						this.length = length;
					}

					public Integer getAllowNull() {
						return this.allowNull;
					}

					public void setAllowNull(Integer allowNull) {
						this.allowNull = allowNull;
					}

					public String getReg() {
						return this.reg;
					}

					public void setReg(String reg) {
						this.reg = reg;
					}

					public Integer getIndexes() {
						return this.indexes;
					}

					public void setIndexes(Integer indexes) {
						this.indexes = indexes;
					}

					public String getAnnotation() {
						return this.annotation;
					}

					public void setAnnotation(String annotation) {
						this.annotation = annotation;
					}
				}
			}
		}

		public static class Schema {

			private Long id;

			private String name;

			private String description;

			private Long version;

			private Long createTime;

			private Long updateTime;

			private Boolean isTemplate;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public Long getVersion() {
				return this.version;
			}

			public void setVersion(Long version) {
				this.version = version;
			}

			public Long getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(Long createTime) {
				this.createTime = createTime;
			}

			public Long getUpdateTime() {
				return this.updateTime;
			}

			public void setUpdateTime(Long updateTime) {
				this.updateTime = updateTime;
			}

			public Boolean getIsTemplate() {
				return this.isTemplate;
			}

			public void setIsTemplate(Boolean isTemplate) {
				this.isTemplate = isTemplate;
			}
		}
	}

	@Override
	public GetBcSchemaResponse getInstance(UnmarshallerContext context) {
		return	GetBcSchemaResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
