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

package com.aliyuncs.devops_rdc.model.v20200303;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.devops_rdc.transform.v20200303.GetDevopsProjectInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDevopsProjectInfoResponse extends AcsResponse {

	private Boolean successful;

	private String errorCode;

	private String errorMsg;

	private String requestId;

	private Object object;

	public Boolean getSuccessful() {
		return this.successful;
	}

	public void setSuccessful(Boolean successful) {
		this.successful = successful;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Object getObject() {
		return this.object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public static class Object {

		private String rootCollectionId;

		private String endDate;

		private Boolean isArchived;

		private String modifierId;

		private String sourceId;

		private String description;

		private String py;

		private String defaultRoleId;

		private String customfields;

		private Boolean isDeleted;

		private String uniqueIdPrefix;

		private Integer nextTaskUniqueId;

		private String creatorId;

		private String logo;

		private String defaultCollectionId;

		private Boolean isSuspended;

		private String visibility;

		private String normalType;

		private String created;

		private String organizationId;

		private String sortMethod;

		private String pinyin;

		private String sourceType;

		private Boolean isTemplate;

		private String name;

		private String id;

		private String category;

		private String updated;

		private String startDate;

		public String getRootCollectionId() {
			return this.rootCollectionId;
		}

		public void setRootCollectionId(String rootCollectionId) {
			this.rootCollectionId = rootCollectionId;
		}

		public String getEndDate() {
			return this.endDate;
		}

		public void setEndDate(String endDate) {
			this.endDate = endDate;
		}

		public Boolean getIsArchived() {
			return this.isArchived;
		}

		public void setIsArchived(Boolean isArchived) {
			this.isArchived = isArchived;
		}

		public String getModifierId() {
			return this.modifierId;
		}

		public void setModifierId(String modifierId) {
			this.modifierId = modifierId;
		}

		public String getSourceId() {
			return this.sourceId;
		}

		public void setSourceId(String sourceId) {
			this.sourceId = sourceId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getPy() {
			return this.py;
		}

		public void setPy(String py) {
			this.py = py;
		}

		public String getDefaultRoleId() {
			return this.defaultRoleId;
		}

		public void setDefaultRoleId(String defaultRoleId) {
			this.defaultRoleId = defaultRoleId;
		}

		public String getCustomfields() {
			return this.customfields;
		}

		public void setCustomfields(String customfields) {
			this.customfields = customfields;
		}

		public Boolean getIsDeleted() {
			return this.isDeleted;
		}

		public void setIsDeleted(Boolean isDeleted) {
			this.isDeleted = isDeleted;
		}

		public String getUniqueIdPrefix() {
			return this.uniqueIdPrefix;
		}

		public void setUniqueIdPrefix(String uniqueIdPrefix) {
			this.uniqueIdPrefix = uniqueIdPrefix;
		}

		public Integer getNextTaskUniqueId() {
			return this.nextTaskUniqueId;
		}

		public void setNextTaskUniqueId(Integer nextTaskUniqueId) {
			this.nextTaskUniqueId = nextTaskUniqueId;
		}

		public String getCreatorId() {
			return this.creatorId;
		}

		public void setCreatorId(String creatorId) {
			this.creatorId = creatorId;
		}

		public String getLogo() {
			return this.logo;
		}

		public void setLogo(String logo) {
			this.logo = logo;
		}

		public String getDefaultCollectionId() {
			return this.defaultCollectionId;
		}

		public void setDefaultCollectionId(String defaultCollectionId) {
			this.defaultCollectionId = defaultCollectionId;
		}

		public Boolean getIsSuspended() {
			return this.isSuspended;
		}

		public void setIsSuspended(Boolean isSuspended) {
			this.isSuspended = isSuspended;
		}

		public String getVisibility() {
			return this.visibility;
		}

		public void setVisibility(String visibility) {
			this.visibility = visibility;
		}

		public String getNormalType() {
			return this.normalType;
		}

		public void setNormalType(String normalType) {
			this.normalType = normalType;
		}

		public String getCreated() {
			return this.created;
		}

		public void setCreated(String created) {
			this.created = created;
		}

		public String getOrganizationId() {
			return this.organizationId;
		}

		public void setOrganizationId(String organizationId) {
			this.organizationId = organizationId;
		}

		public String getSortMethod() {
			return this.sortMethod;
		}

		public void setSortMethod(String sortMethod) {
			this.sortMethod = sortMethod;
		}

		public String getPinyin() {
			return this.pinyin;
		}

		public void setPinyin(String pinyin) {
			this.pinyin = pinyin;
		}

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}

		public Boolean getIsTemplate() {
			return this.isTemplate;
		}

		public void setIsTemplate(Boolean isTemplate) {
			this.isTemplate = isTemplate;
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

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getUpdated() {
			return this.updated;
		}

		public void setUpdated(String updated) {
			this.updated = updated;
		}

		public String getStartDate() {
			return this.startDate;
		}

		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}
	}

	@Override
	public GetDevopsProjectInfoResponse getInstance(UnmarshallerContext context) {
		return	GetDevopsProjectInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
