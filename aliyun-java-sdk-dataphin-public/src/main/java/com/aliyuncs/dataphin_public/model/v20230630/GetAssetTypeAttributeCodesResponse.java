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
import com.aliyuncs.dataphin_public.transform.v20230630.GetAssetTypeAttributeCodesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAssetTypeAttributeCodesResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Integer httpStatusCode;

	private String code;

	private Boolean success;

	private List<DataItem> data;

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

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String inputMode;

		private String enumSourceType;

		private String attributeSource;

		private String description;

		private String valueType;

		private Integer maxLength;

		private String attributeCode;

		private String systemReferenceType;

		private Boolean required;

		private String linkTarget;

		private String attributeType;

		private String attributeName;

		private List<EnumValue> enumValues;

		private List<String> editableIn;

		private List<String> visibleIn;

		public String getInputMode() {
			return this.inputMode;
		}

		public void setInputMode(String inputMode) {
			this.inputMode = inputMode;
		}

		public String getEnumSourceType() {
			return this.enumSourceType;
		}

		public void setEnumSourceType(String enumSourceType) {
			this.enumSourceType = enumSourceType;
		}

		public String getAttributeSource() {
			return this.attributeSource;
		}

		public void setAttributeSource(String attributeSource) {
			this.attributeSource = attributeSource;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getValueType() {
			return this.valueType;
		}

		public void setValueType(String valueType) {
			this.valueType = valueType;
		}

		public Integer getMaxLength() {
			return this.maxLength;
		}

		public void setMaxLength(Integer maxLength) {
			this.maxLength = maxLength;
		}

		public String getAttributeCode() {
			return this.attributeCode;
		}

		public void setAttributeCode(String attributeCode) {
			this.attributeCode = attributeCode;
		}

		public String getSystemReferenceType() {
			return this.systemReferenceType;
		}

		public void setSystemReferenceType(String systemReferenceType) {
			this.systemReferenceType = systemReferenceType;
		}

		public Boolean getRequired() {
			return this.required;
		}

		public void setRequired(Boolean required) {
			this.required = required;
		}

		public String getLinkTarget() {
			return this.linkTarget;
		}

		public void setLinkTarget(String linkTarget) {
			this.linkTarget = linkTarget;
		}

		public String getAttributeType() {
			return this.attributeType;
		}

		public void setAttributeType(String attributeType) {
			this.attributeType = attributeType;
		}

		public String getAttributeName() {
			return this.attributeName;
		}

		public void setAttributeName(String attributeName) {
			this.attributeName = attributeName;
		}

		public List<EnumValue> getEnumValues() {
			return this.enumValues;
		}

		public void setEnumValues(List<EnumValue> enumValues) {
			this.enumValues = enumValues;
		}

		public List<String> getEditableIn() {
			return this.editableIn;
		}

		public void setEditableIn(List<String> editableIn) {
			this.editableIn = editableIn;
		}

		public List<String> getVisibleIn() {
			return this.visibleIn;
		}

		public void setVisibleIn(List<String> visibleIn) {
			this.visibleIn = visibleIn;
		}

		public static class EnumValue {

			private String value;

			private String displayName;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getDisplayName() {
				return this.displayName;
			}

			public void setDisplayName(String displayName) {
				this.displayName = displayName;
			}
		}
	}

	@Override
	public GetAssetTypeAttributeCodesResponse getInstance(UnmarshallerContext context) {
		return	GetAssetTypeAttributeCodesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
