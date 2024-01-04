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

package com.aliyuncs.devops.model.v20210625;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.devops.transform.v20210625.ListWorkItemAllFieldsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListWorkItemAllFieldsResponse extends AcsResponse {

	private String requestId;

	private String errorMsg;

	private String errorCode;

	private Boolean success;

	private List<Field> fields;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<Field> getFields() {
		return this.fields;
	}

	public void setFields(List<Field> fields) {
		this.fields = fields;
	}

	public static class Field {

		private String creator;

		private String description;

		private Long gmtCreate;

		private Long gmtModified;

		private String type;

		private String identifier;

		private String modifier;

		private String name;

		private String format;

		private String className;

		private String resourceType;

		private String defaultValue;

		private Boolean isRequired;

		private Boolean isSystemRequired;

		private String linkWithService;

		private Boolean isShowWhenCreate;

		private List<Option> options;

		public String getCreator() {
			return this.creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getIdentifier() {
			return this.identifier;
		}

		public void setIdentifier(String identifier) {
			this.identifier = identifier;
		}

		public String getModifier() {
			return this.modifier;
		}

		public void setModifier(String modifier) {
			this.modifier = modifier;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getFormat() {
			return this.format;
		}

		public void setFormat(String format) {
			this.format = format;
		}

		public String getClassName() {
			return this.className;
		}

		public void setClassName(String className) {
			this.className = className;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getDefaultValue() {
			return this.defaultValue;
		}

		public void setDefaultValue(String defaultValue) {
			this.defaultValue = defaultValue;
		}

		public Boolean getIsRequired() {
			return this.isRequired;
		}

		public void setIsRequired(Boolean isRequired) {
			this.isRequired = isRequired;
		}

		public Boolean getIsSystemRequired() {
			return this.isSystemRequired;
		}

		public void setIsSystemRequired(Boolean isSystemRequired) {
			this.isSystemRequired = isSystemRequired;
		}

		public String getLinkWithService() {
			return this.linkWithService;
		}

		public void setLinkWithService(String linkWithService) {
			this.linkWithService = linkWithService;
		}

		public Boolean getIsShowWhenCreate() {
			return this.isShowWhenCreate;
		}

		public void setIsShowWhenCreate(Boolean isShowWhenCreate) {
			this.isShowWhenCreate = isShowWhenCreate;
		}

		public List<Option> getOptions() {
			return this.options;
		}

		public void setOptions(List<Option> options) {
			this.options = options;
		}

		public static class Option {

			private String identifier;

			private String fieldIdentifier;

			private String value;

			private String valueEn;

			private String displayValue;

			private Long position;

			private Long level;

			public String getIdentifier() {
				return this.identifier;
			}

			public void setIdentifier(String identifier) {
				this.identifier = identifier;
			}

			public String getFieldIdentifier() {
				return this.fieldIdentifier;
			}

			public void setFieldIdentifier(String fieldIdentifier) {
				this.fieldIdentifier = fieldIdentifier;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getValueEn() {
				return this.valueEn;
			}

			public void setValueEn(String valueEn) {
				this.valueEn = valueEn;
			}

			public String getDisplayValue() {
				return this.displayValue;
			}

			public void setDisplayValue(String displayValue) {
				this.displayValue = displayValue;
			}

			public Long getPosition() {
				return this.position;
			}

			public void setPosition(Long position) {
				this.position = position;
			}

			public Long getLevel() {
				return this.level;
			}

			public void setLevel(Long level) {
				this.level = level;
			}
		}
	}

	@Override
	public ListWorkItemAllFieldsResponse getInstance(UnmarshallerContext context) {
		return	ListWorkItemAllFieldsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
