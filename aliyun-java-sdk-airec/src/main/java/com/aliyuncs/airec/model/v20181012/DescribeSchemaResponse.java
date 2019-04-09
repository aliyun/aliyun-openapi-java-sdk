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

package com.aliyuncs.airec.model.v20181012;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.airec.transform.v20181012.DescribeSchemaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSchemaResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String id;

		private String description;

		private List<MetaItem> meta;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public List<MetaItem> getMeta() {
			return this.meta;
		}

		public void setMeta(List<MetaItem> meta) {
			this.meta = meta;
		}

		public static class MetaItem {

			private String tableName;

			private List<FieldsItem> fields;

			public String getTableName() {
				return this.tableName;
			}

			public void setTableName(String tableName) {
				this.tableName = tableName;
			}

			public List<FieldsItem> getFields() {
				return this.fields;
			}

			public void setFields(List<FieldsItem> fields) {
				this.fields = fields;
			}

			public static class FieldsItem {

				private String name;

				private String type;

				private String description;

				private Boolean required;

				private String example;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}

				public Boolean getRequired() {
					return this.required;
				}

				public void setRequired(Boolean required) {
					this.required = required;
				}

				public String getExample() {
					return this.example;
				}

				public void setExample(String example) {
					this.example = example;
				}
			}
		}
	}

	@Override
	public DescribeSchemaResponse getInstance(UnmarshallerContext context) {
		return	DescribeSchemaResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
