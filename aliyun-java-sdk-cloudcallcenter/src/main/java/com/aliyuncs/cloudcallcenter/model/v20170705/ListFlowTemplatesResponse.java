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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudcallcenter.transform.v20170705.ListFlowTemplatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFlowTemplatesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private Templates templates;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Templates getTemplates() {
		return this.templates;
	}

	public void setTemplates(Templates templates) {
		this.templates = templates;
	}

	public static class Templates {

		private Integer totalCount;

		private Integer pageNumber;

		private Integer pageSize;

		private List<FlowTemplate> list;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public List<FlowTemplate> getList() {
			return this.list;
		}

		public void setList(List<FlowTemplate> list) {
			this.list = list;
		}

		public static class FlowTemplate {

			private String flowJson;

			private String name;

			private String id;

			private List<Parameter> parameters;

			private List<Category> categories;

			public String getFlowJson() {
				return this.flowJson;
			}

			public void setFlowJson(String flowJson) {
				this.flowJson = flowJson;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public List<Parameter> getParameters() {
				return this.parameters;
			}

			public void setParameters(List<Parameter> parameters) {
				this.parameters = parameters;
			}

			public List<Category> getCategories() {
				return this.categories;
			}

			public void setCategories(List<Category> categories) {
				this.categories = categories;
			}

			public static class Parameter {

				private String title;

				private String name;

				private String defaultValue;

				private String description;

				private String type;

				public String getTitle() {
					return this.title;
				}

				public void setTitle(String title) {
					this.title = title;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getDefaultValue() {
					return this.defaultValue;
				}

				public void setDefaultValue(String defaultValue) {
					this.defaultValue = defaultValue;
				}

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}
			}

			public static class Category {

				private String type;

				private String name;

				private String options;

				private String id;

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

				public String getOptions() {
					return this.options;
				}

				public void setOptions(String options) {
					this.options = options;
				}

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}
			}
		}
	}

	@Override
	public ListFlowTemplatesResponse getInstance(UnmarshallerContext context) {
		return	ListFlowTemplatesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
