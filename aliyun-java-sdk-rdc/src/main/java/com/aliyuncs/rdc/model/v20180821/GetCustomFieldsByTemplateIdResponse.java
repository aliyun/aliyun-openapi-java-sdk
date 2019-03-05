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

package com.aliyuncs.rdc.model.v20180821;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rdc.transform.v20180821.GetCustomFieldsByTemplateIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCustomFieldsByTemplateIdResponse extends AcsResponse {

	private Integer code;

	private Boolean success;

	private String requestId;

	private List<DataItem> data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private Long createdAt;

		private String defaultValue;

		private String description;

		private Boolean dynamic;

		private Boolean editable;

		private String fieldFormat;

		private Integer id;

		private Boolean isDelete;

		private Boolean isRemember;

		private Boolean isRequired;

		private Integer maxLength;

		private Integer minLength;

		private String name;

		private String nameI18N;

		private String other;

		private String possibleValues;

		private String type;

		private Long updatedAt;

		public Long getCreatedAt() {
			return this.createdAt;
		}

		public void setCreatedAt(Long createdAt) {
			this.createdAt = createdAt;
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

		public Boolean getDynamic() {
			return this.dynamic;
		}

		public void setDynamic(Boolean dynamic) {
			this.dynamic = dynamic;
		}

		public Boolean getEditable() {
			return this.editable;
		}

		public void setEditable(Boolean editable) {
			this.editable = editable;
		}

		public String getFieldFormat() {
			return this.fieldFormat;
		}

		public void setFieldFormat(String fieldFormat) {
			this.fieldFormat = fieldFormat;
		}

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Boolean getIsDelete() {
			return this.isDelete;
		}

		public void setIsDelete(Boolean isDelete) {
			this.isDelete = isDelete;
		}

		public Boolean getIsRemember() {
			return this.isRemember;
		}

		public void setIsRemember(Boolean isRemember) {
			this.isRemember = isRemember;
		}

		public Boolean getIsRequired() {
			return this.isRequired;
		}

		public void setIsRequired(Boolean isRequired) {
			this.isRequired = isRequired;
		}

		public Integer getMaxLength() {
			return this.maxLength;
		}

		public void setMaxLength(Integer maxLength) {
			this.maxLength = maxLength;
		}

		public Integer getMinLength() {
			return this.minLength;
		}

		public void setMinLength(Integer minLength) {
			this.minLength = minLength;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getNameI18N() {
			return this.nameI18N;
		}

		public void setNameI18N(String nameI18N) {
			this.nameI18N = nameI18N;
		}

		public String getOther() {
			return this.other;
		}

		public void setOther(String other) {
			this.other = other;
		}

		public String getPossibleValues() {
			return this.possibleValues;
		}

		public void setPossibleValues(String possibleValues) {
			this.possibleValues = possibleValues;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Long getUpdatedAt() {
			return this.updatedAt;
		}

		public void setUpdatedAt(Long updatedAt) {
			this.updatedAt = updatedAt;
		}
	}

	@Override
	public GetCustomFieldsByTemplateIdResponse getInstance(UnmarshallerContext context) {
		return	GetCustomFieldsByTemplateIdResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
