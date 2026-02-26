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
import com.aliyuncs.devops.transform.v20210625.ListProjectTemplatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListProjectTemplatesResponse extends AcsResponse {

	private String requestId;

	private String errorMsg;

	private String errorCode;

	private Boolean success;

	private List<Template> templates;

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

	public List<Template> getTemplates() {
		return this.templates;
	}

	public void setTemplates(List<Template> templates) {
		this.templates = templates;
	}

	public static class Template {

		private String creator;

		private String description;

		private Long gmtCreate;

		private Long gmtModified;

		private Long type;

		private String icon;

		private String identifier;

		private String modifier;

		private String name;

		private String nameEn;

		private String resourceCategory;

		private String copyFrom;

		private String resourceType;

		private String spaceIdentifier;

		private String spaceType;

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

		public Long getType() {
			return this.type;
		}

		public void setType(Long type) {
			this.type = type;
		}

		public String getIcon() {
			return this.icon;
		}

		public void setIcon(String icon) {
			this.icon = icon;
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

		public String getNameEn() {
			return this.nameEn;
		}

		public void setNameEn(String nameEn) {
			this.nameEn = nameEn;
		}

		public String getResourceCategory() {
			return this.resourceCategory;
		}

		public void setResourceCategory(String resourceCategory) {
			this.resourceCategory = resourceCategory;
		}

		public String getCopyFrom() {
			return this.copyFrom;
		}

		public void setCopyFrom(String copyFrom) {
			this.copyFrom = copyFrom;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getSpaceIdentifier() {
			return this.spaceIdentifier;
		}

		public void setSpaceIdentifier(String spaceIdentifier) {
			this.spaceIdentifier = spaceIdentifier;
		}

		public String getSpaceType() {
			return this.spaceType;
		}

		public void setSpaceType(String spaceType) {
			this.spaceType = spaceType;
		}
	}

	@Override
	public ListProjectTemplatesResponse getInstance(UnmarshallerContext context) {
		return	ListProjectTemplatesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
