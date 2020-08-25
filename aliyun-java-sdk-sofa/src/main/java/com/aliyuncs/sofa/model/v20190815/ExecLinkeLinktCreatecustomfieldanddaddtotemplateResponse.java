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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Long errorCode;

	private String errorMessage;

	private Long responseStatusCode;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Long getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(Long errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
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

		private Long copyFrom;

		private Long createdAt;

		private String creator;

		private String defaultValue;

		private Boolean deleted;

		private String description;

		private String dynamicOptionFetchUrl;

		private Boolean editable;

		private Boolean enableSearch;

		private String fieldFormat;

		private String fieldLabel;

		private Boolean formInvisible;

		private Long id;

		private Boolean invisible;

		private String name;

		private String projectSign;

		private Boolean required;

		private Long type;

		private Long updatedAt;

		private List<Long> dynamicFieldRequiredDependentFields;

		private List<Long> dynamicFieldRequiredInfluencedFields;

		private List<Long> dynamicOptionFetchDependentFields;

		private List<Long> dynamicOptionFetchInfluencedFields;

		private List<String> possibleValues;

		public Long getCopyFrom() {
			return this.copyFrom;
		}

		public void setCopyFrom(Long copyFrom) {
			this.copyFrom = copyFrom;
		}

		public Long getCreatedAt() {
			return this.createdAt;
		}

		public void setCreatedAt(Long createdAt) {
			this.createdAt = createdAt;
		}

		public String getCreator() {
			return this.creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public String getDefaultValue() {
			return this.defaultValue;
		}

		public void setDefaultValue(String defaultValue) {
			this.defaultValue = defaultValue;
		}

		public Boolean getDeleted() {
			return this.deleted;
		}

		public void setDeleted(Boolean deleted) {
			this.deleted = deleted;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getDynamicOptionFetchUrl() {
			return this.dynamicOptionFetchUrl;
		}

		public void setDynamicOptionFetchUrl(String dynamicOptionFetchUrl) {
			this.dynamicOptionFetchUrl = dynamicOptionFetchUrl;
		}

		public Boolean getEditable() {
			return this.editable;
		}

		public void setEditable(Boolean editable) {
			this.editable = editable;
		}

		public Boolean getEnableSearch() {
			return this.enableSearch;
		}

		public void setEnableSearch(Boolean enableSearch) {
			this.enableSearch = enableSearch;
		}

		public String getFieldFormat() {
			return this.fieldFormat;
		}

		public void setFieldFormat(String fieldFormat) {
			this.fieldFormat = fieldFormat;
		}

		public String getFieldLabel() {
			return this.fieldLabel;
		}

		public void setFieldLabel(String fieldLabel) {
			this.fieldLabel = fieldLabel;
		}

		public Boolean getFormInvisible() {
			return this.formInvisible;
		}

		public void setFormInvisible(Boolean formInvisible) {
			this.formInvisible = formInvisible;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Boolean getInvisible() {
			return this.invisible;
		}

		public void setInvisible(Boolean invisible) {
			this.invisible = invisible;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getProjectSign() {
			return this.projectSign;
		}

		public void setProjectSign(String projectSign) {
			this.projectSign = projectSign;
		}

		public Boolean getRequired() {
			return this.required;
		}

		public void setRequired(Boolean required) {
			this.required = required;
		}

		public Long getType() {
			return this.type;
		}

		public void setType(Long type) {
			this.type = type;
		}

		public Long getUpdatedAt() {
			return this.updatedAt;
		}

		public void setUpdatedAt(Long updatedAt) {
			this.updatedAt = updatedAt;
		}

		public List<Long> getDynamicFieldRequiredDependentFields() {
			return this.dynamicFieldRequiredDependentFields;
		}

		public void setDynamicFieldRequiredDependentFields(List<Long> dynamicFieldRequiredDependentFields) {
			this.dynamicFieldRequiredDependentFields = dynamicFieldRequiredDependentFields;
		}

		public List<Long> getDynamicFieldRequiredInfluencedFields() {
			return this.dynamicFieldRequiredInfluencedFields;
		}

		public void setDynamicFieldRequiredInfluencedFields(List<Long> dynamicFieldRequiredInfluencedFields) {
			this.dynamicFieldRequiredInfluencedFields = dynamicFieldRequiredInfluencedFields;
		}

		public List<Long> getDynamicOptionFetchDependentFields() {
			return this.dynamicOptionFetchDependentFields;
		}

		public void setDynamicOptionFetchDependentFields(List<Long> dynamicOptionFetchDependentFields) {
			this.dynamicOptionFetchDependentFields = dynamicOptionFetchDependentFields;
		}

		public List<Long> getDynamicOptionFetchInfluencedFields() {
			return this.dynamicOptionFetchInfluencedFields;
		}

		public void setDynamicOptionFetchInfluencedFields(List<Long> dynamicOptionFetchInfluencedFields) {
			this.dynamicOptionFetchInfluencedFields = dynamicOptionFetchInfluencedFields;
		}

		public List<String> getPossibleValues() {
			return this.possibleValues;
		}

		public void setPossibleValues(List<String> possibleValues) {
			this.possibleValues = possibleValues;
		}
	}

	@Override
	public ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse getInstance(UnmarshallerContext context) {
		return	ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
