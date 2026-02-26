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

package com.aliyuncs.ccc.model.v20200701;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20200701.ListTicketTemplatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTicketTemplatesResponse extends AcsResponse {

	private String requestId;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private List<String> params;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<String> getParams() {
		return this.params;
	}

	public void setParams(List<String> params) {
		this.params = params;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer totalCount;

		private Integer pageNumber;

		private Integer pageSize;

		private List<ListItem> list;

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

		public List<ListItem> getList() {
			return this.list;
		}

		public void setList(List<ListItem> list) {
			this.list = list;
		}

		public static class ListItem {

			private String instanceId;

			private String templateId;

			private String name;

			private String state;

			private String editor;

			private String processDefinition;

			private Long updatedTime;

			private String categoryId;

			private String appliedVersion;

			private String latestVersion;

			private List<TicketField> ticketFields;

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getTemplateId() {
				return this.templateId;
			}

			public void setTemplateId(String templateId) {
				this.templateId = templateId;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public String getEditor() {
				return this.editor;
			}

			public void setEditor(String editor) {
				this.editor = editor;
			}

			public String getProcessDefinition() {
				return this.processDefinition;
			}

			public void setProcessDefinition(String processDefinition) {
				this.processDefinition = processDefinition;
			}

			public Long getUpdatedTime() {
				return this.updatedTime;
			}

			public void setUpdatedTime(Long updatedTime) {
				this.updatedTime = updatedTime;
			}

			public String getCategoryId() {
				return this.categoryId;
			}

			public void setCategoryId(String categoryId) {
				this.categoryId = categoryId;
			}

			public String getAppliedVersion() {
				return this.appliedVersion;
			}

			public void setAppliedVersion(String appliedVersion) {
				this.appliedVersion = appliedVersion;
			}

			public String getLatestVersion() {
				return this.latestVersion;
			}

			public void setLatestVersion(String latestVersion) {
				this.latestVersion = latestVersion;
			}

			public List<TicketField> getTicketFields() {
				return this.ticketFields;
			}

			public void setTicketFields(List<TicketField> ticketFields) {
				this.ticketFields = ticketFields;
			}

			public static class TicketField {

				private String displayName;

				private String description;

				private String name;

				private String dataType;

				private String pattern;

				private String patternErrorMessage;

				private Integer minLength;

				private Integer maxLength;

				private Double minimum;

				private Double maximum;

				private Boolean required;

				private Boolean system;

				private Boolean disabled;

				private Boolean array;

				private Boolean readOnly;

				private String editorType;

				private String attribute;

				private Integer displayOrder;

				private Long createdTime;

				private Long updatedTime;

				private String creator;

				public String getDisplayName() {
					return this.displayName;
				}

				public void setDisplayName(String displayName) {
					this.displayName = displayName;
				}

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getDataType() {
					return this.dataType;
				}

				public void setDataType(String dataType) {
					this.dataType = dataType;
				}

				public String getPattern() {
					return this.pattern;
				}

				public void setPattern(String pattern) {
					this.pattern = pattern;
				}

				public String getPatternErrorMessage() {
					return this.patternErrorMessage;
				}

				public void setPatternErrorMessage(String patternErrorMessage) {
					this.patternErrorMessage = patternErrorMessage;
				}

				public Integer getMinLength() {
					return this.minLength;
				}

				public void setMinLength(Integer minLength) {
					this.minLength = minLength;
				}

				public Integer getMaxLength() {
					return this.maxLength;
				}

				public void setMaxLength(Integer maxLength) {
					this.maxLength = maxLength;
				}

				public Double getMinimum() {
					return this.minimum;
				}

				public void setMinimum(Double minimum) {
					this.minimum = minimum;
				}

				public Double getMaximum() {
					return this.maximum;
				}

				public void setMaximum(Double maximum) {
					this.maximum = maximum;
				}

				public Boolean getRequired() {
					return this.required;
				}

				public void setRequired(Boolean required) {
					this.required = required;
				}

				public Boolean getSystem() {
					return this.system;
				}

				public void setSystem(Boolean system) {
					this.system = system;
				}

				public Boolean getDisabled() {
					return this.disabled;
				}

				public void setDisabled(Boolean disabled) {
					this.disabled = disabled;
				}

				public Boolean getArray() {
					return this.array;
				}

				public void setArray(Boolean array) {
					this.array = array;
				}

				public Boolean getReadOnly() {
					return this.readOnly;
				}

				public void setReadOnly(Boolean readOnly) {
					this.readOnly = readOnly;
				}

				public String getEditorType() {
					return this.editorType;
				}

				public void setEditorType(String editorType) {
					this.editorType = editorType;
				}

				public String getAttribute() {
					return this.attribute;
				}

				public void setAttribute(String attribute) {
					this.attribute = attribute;
				}

				public Integer getDisplayOrder() {
					return this.displayOrder;
				}

				public void setDisplayOrder(Integer displayOrder) {
					this.displayOrder = displayOrder;
				}

				public Long getCreatedTime() {
					return this.createdTime;
				}

				public void setCreatedTime(Long createdTime) {
					this.createdTime = createdTime;
				}

				public Long getUpdatedTime() {
					return this.updatedTime;
				}

				public void setUpdatedTime(Long updatedTime) {
					this.updatedTime = updatedTime;
				}

				public String getCreator() {
					return this.creator;
				}

				public void setCreator(String creator) {
					this.creator = creator;
				}
			}
		}
	}

	@Override
	public ListTicketTemplatesResponse getInstance(UnmarshallerContext context) {
		return	ListTicketTemplatesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
