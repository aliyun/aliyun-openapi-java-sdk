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

	private String errorMsg;

	private String requestId;

	private Boolean successful;

	private String errorCode;

	private Object object;

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

	public Object getObject() {
		return this.object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public static class Object {

		private String sortMethod;

		private String uniqueIdPrefix;

		private String normalType;

		private String modifierId;

		private String sourceType;

		private Boolean isTemplate;

		private String description;

		private String defaultRoleId;

		private String rootCollectionId;

		private Boolean isDeleted;

		private String updated;

		private String name;

		private Boolean isArchived;

		private String endDate;

		private String logo;

		private String startDate;

		private String pinyin;

		private String creatorId;

		private String sourceId;

		private String defaultCollectionId;

		private Boolean isSuspended;

		private String organizationId;

		private String visibility;

		private String py;

		private String category;

		private Integer nextTaskUniqueId;

		private String customfields;

		private String created;

		private String id;

		public String getSortMethod() {
			return this.sortMethod;
		}

		public void setSortMethod(String sortMethod) {
			this.sortMethod = sortMethod;
		}

		public String getUniqueIdPrefix() {
			return this.uniqueIdPrefix;
		}

		public void setUniqueIdPrefix(String uniqueIdPrefix) {
			this.uniqueIdPrefix = uniqueIdPrefix;
		}

		public String getNormalType() {
			return this.normalType;
		}

		public void setNormalType(String normalType) {
			this.normalType = normalType;
		}

		public String getModifierId() {
			return this.modifierId;
		}

		public void setModifierId(String modifierId) {
			this.modifierId = modifierId;
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

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getDefaultRoleId() {
			return this.defaultRoleId;
		}

		public void setDefaultRoleId(String defaultRoleId) {
			this.defaultRoleId = defaultRoleId;
		}

		public String getRootCollectionId() {
			return this.rootCollectionId;
		}

		public void setRootCollectionId(String rootCollectionId) {
			this.rootCollectionId = rootCollectionId;
		}

		public Boolean getIsDeleted() {
			return this.isDeleted;
		}

		public void setIsDeleted(Boolean isDeleted) {
			this.isDeleted = isDeleted;
		}

		public String getUpdated() {
			return this.updated;
		}

		public void setUpdated(String updated) {
			this.updated = updated;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Boolean getIsArchived() {
			return this.isArchived;
		}

		public void setIsArchived(Boolean isArchived) {
			this.isArchived = isArchived;
		}

		public String getEndDate() {
			return this.endDate;
		}

		public void setEndDate(String endDate) {
			this.endDate = endDate;
		}

		public String getLogo() {
			return this.logo;
		}

		public void setLogo(String logo) {
			this.logo = logo;
		}

		public String getStartDate() {
			return this.startDate;
		}

		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}

		public String getPinyin() {
			return this.pinyin;
		}

		public void setPinyin(String pinyin) {
			this.pinyin = pinyin;
		}

		public String getCreatorId() {
			return this.creatorId;
		}

		public void setCreatorId(String creatorId) {
			this.creatorId = creatorId;
		}

		public String getSourceId() {
			return this.sourceId;
		}

		public void setSourceId(String sourceId) {
			this.sourceId = sourceId;
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

		public String getOrganizationId() {
			return this.organizationId;
		}

		public void setOrganizationId(String organizationId) {
			this.organizationId = organizationId;
		}

		public String getVisibility() {
			return this.visibility;
		}

		public void setVisibility(String visibility) {
			this.visibility = visibility;
		}

		public String getPy() {
			return this.py;
		}

		public void setPy(String py) {
			this.py = py;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public Integer getNextTaskUniqueId() {
			return this.nextTaskUniqueId;
		}

		public void setNextTaskUniqueId(Integer nextTaskUniqueId) {
			this.nextTaskUniqueId = nextTaskUniqueId;
		}

		public String getCustomfields() {
			return this.customfields;
		}

		public void setCustomfields(String customfields) {
			this.customfields = customfields;
		}

		public String getCreated() {
			return this.created;
		}

		public void setCreated(String created) {
			this.created = created;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
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
