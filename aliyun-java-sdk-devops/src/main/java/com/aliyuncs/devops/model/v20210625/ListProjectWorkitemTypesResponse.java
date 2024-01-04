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
import com.aliyuncs.devops.transform.v20210625.ListProjectWorkitemTypesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListProjectWorkitemTypesResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private List<WorkitemType> workitemTypes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<WorkitemType> getWorkitemTypes() {
		return this.workitemTypes;
	}

	public void setWorkitemTypes(List<WorkitemType> workitemTypes) {
		this.workitemTypes = workitemTypes;
	}

	public static class WorkitemType {

		private String identifier;

		private String name;

		private String nameEn;

		private String categoryIdentifier;

		private Boolean systemDefault;

		private Long gmtCreate;

		private String creator;

		private String description;

		private Boolean enable;

		private Boolean defaultType;

		private Long gmtAdd;

		private String addUser;

		public String getIdentifier() {
			return this.identifier;
		}

		public void setIdentifier(String identifier) {
			this.identifier = identifier;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getNameEn() {
			return this.nameEn;
		}

		public void setNameEn(String nameEn) {
			this.nameEn = nameEn;
		}

		public String getCategoryIdentifier() {
			return this.categoryIdentifier;
		}

		public void setCategoryIdentifier(String categoryIdentifier) {
			this.categoryIdentifier = categoryIdentifier;
		}

		public Boolean getSystemDefault() {
			return this.systemDefault;
		}

		public void setSystemDefault(Boolean systemDefault) {
			this.systemDefault = systemDefault;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

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

		public Boolean getEnable() {
			return this.enable;
		}

		public void setEnable(Boolean enable) {
			this.enable = enable;
		}

		public Boolean getDefaultType() {
			return this.defaultType;
		}

		public void setDefaultType(Boolean defaultType) {
			this.defaultType = defaultType;
		}

		public Long getGmtAdd() {
			return this.gmtAdd;
		}

		public void setGmtAdd(Long gmtAdd) {
			this.gmtAdd = gmtAdd;
		}

		public String getAddUser() {
			return this.addUser;
		}

		public void setAddUser(String addUser) {
			this.addUser = addUser;
		}
	}

	@Override
	public ListProjectWorkitemTypesResponse getInstance(UnmarshallerContext context) {
		return	ListProjectWorkitemTypesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
