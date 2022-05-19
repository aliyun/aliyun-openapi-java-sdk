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

package com.aliyuncs.lmztest.model.v20100101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.lmztest.transform.v20100101.GetProjectInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetProjectInfoResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private Result result;

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

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String category;

		private String categoryIdentifier;

		private String creator;

		private String customCode;

		private String description;

		private Long gmtCreate;

		private Long gmtModified;

		private String iconGroup;

		private String icon;

		private String iconBig;

		private String iconSmall;

		private String id;

		private String identifier;

		private String identifierPath;

		private String logicalStatus;

		private String modifier;

		private String name;

		private String organizationIdentifier;

		private String parentIdentifier;

		private String scope;

		private String statusIdentifier;

		private String statusStageIdentifier;

		private String subType;

		private String typeIdentifier;

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getCategoryIdentifier() {
			return this.categoryIdentifier;
		}

		public void setCategoryIdentifier(String categoryIdentifier) {
			this.categoryIdentifier = categoryIdentifier;
		}

		public String getCreator() {
			return this.creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public String getCustomCode() {
			return this.customCode;
		}

		public void setCustomCode(String customCode) {
			this.customCode = customCode;
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

		public String getIconGroup() {
			return this.iconGroup;
		}

		public void setIconGroup(String iconGroup) {
			this.iconGroup = iconGroup;
		}

		public String getIcon() {
			return this.icon;
		}

		public void setIcon(String icon) {
			this.icon = icon;
		}

		public String getIconBig() {
			return this.iconBig;
		}

		public void setIconBig(String iconBig) {
			this.iconBig = iconBig;
		}

		public String getIconSmall() {
			return this.iconSmall;
		}

		public void setIconSmall(String iconSmall) {
			this.iconSmall = iconSmall;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getIdentifier() {
			return this.identifier;
		}

		public void setIdentifier(String identifier) {
			this.identifier = identifier;
		}

		public String getIdentifierPath() {
			return this.identifierPath;
		}

		public void setIdentifierPath(String identifierPath) {
			this.identifierPath = identifierPath;
		}

		public String getLogicalStatus() {
			return this.logicalStatus;
		}

		public void setLogicalStatus(String logicalStatus) {
			this.logicalStatus = logicalStatus;
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

		public String getOrganizationIdentifier() {
			return this.organizationIdentifier;
		}

		public void setOrganizationIdentifier(String organizationIdentifier) {
			this.organizationIdentifier = organizationIdentifier;
		}

		public String getParentIdentifier() {
			return this.parentIdentifier;
		}

		public void setParentIdentifier(String parentIdentifier) {
			this.parentIdentifier = parentIdentifier;
		}

		public String getScope() {
			return this.scope;
		}

		public void setScope(String scope) {
			this.scope = scope;
		}

		public String getStatusIdentifier() {
			return this.statusIdentifier;
		}

		public void setStatusIdentifier(String statusIdentifier) {
			this.statusIdentifier = statusIdentifier;
		}

		public String getStatusStageIdentifier() {
			return this.statusStageIdentifier;
		}

		public void setStatusStageIdentifier(String statusStageIdentifier) {
			this.statusStageIdentifier = statusStageIdentifier;
		}

		public String getSubType() {
			return this.subType;
		}

		public void setSubType(String subType) {
			this.subType = subType;
		}

		public String getTypeIdentifier() {
			return this.typeIdentifier;
		}

		public void setTypeIdentifier(String typeIdentifier) {
			this.typeIdentifier = typeIdentifier;
		}
	}

	@Override
	public GetProjectInfoResponse getInstance(UnmarshallerContext context) {
		return	GetProjectInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
