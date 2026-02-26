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

package com.aliyuncs.ros.model.v20190910;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ros.transform.v20190910.GetTemplateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTemplateResponse extends AcsResponse {

	private String templateARN;

	private String description;

	private String requestId;

	private String createTime;

	private String stackGroupName;

	private String templateVersion;

	private String templateBody;

	private String changeSetId;

	private String ownerId;

	private String updateTime;

	private String templateName;

	private String regionId;

	private String templateId;

	private String stackId;

	private String shareType;

	private String resourceGroupId;

	private String _interface;

	private List<Permission> permissions;

	private List<TagsItem> tags;

	public String getTemplateARN() {
		return this.templateARN;
	}

	public void setTemplateARN(String templateARN) {
		this.templateARN = templateARN;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getStackGroupName() {
		return this.stackGroupName;
	}

	public void setStackGroupName(String stackGroupName) {
		this.stackGroupName = stackGroupName;
	}

	public String getTemplateVersion() {
		return this.templateVersion;
	}

	public void setTemplateVersion(String templateVersion) {
		this.templateVersion = templateVersion;
	}

	public String getTemplateBody() {
		return this.templateBody;
	}

	public void setTemplateBody(String templateBody) {
		this.templateBody = templateBody;
	}

	public String getChangeSetId() {
		return this.changeSetId;
	}

	public void setChangeSetId(String changeSetId) {
		this.changeSetId = changeSetId;
	}

	public String getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getTemplateName() {
		return this.templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getStackId() {
		return this.stackId;
	}

	public void setStackId(String stackId) {
		this.stackId = stackId;
	}

	public String getShareType() {
		return this.shareType;
	}

	public void setShareType(String shareType) {
		this.shareType = shareType;
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
	}

	public String get_Interface() {
		return this._interface;
	}

	public void set_Interface(String _interface) {
		this._interface = _interface;
	}

	public List<Permission> getPermissions() {
		return this.permissions;
	}

	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}

	public List<TagsItem> getTags() {
		return this.tags;
	}

	public void setTags(List<TagsItem> tags) {
		this.tags = tags;
	}

	public static class Permission {

		private String versionOption;

		private String accountId;

		private String shareOption;

		private String templateVersion;

		private String shareSource;

		public String getVersionOption() {
			return this.versionOption;
		}

		public void setVersionOption(String versionOption) {
			this.versionOption = versionOption;
		}

		public String getAccountId() {
			return this.accountId;
		}

		public void setAccountId(String accountId) {
			this.accountId = accountId;
		}

		public String getShareOption() {
			return this.shareOption;
		}

		public void setShareOption(String shareOption) {
			this.shareOption = shareOption;
		}

		public String getTemplateVersion() {
			return this.templateVersion;
		}

		public void setTemplateVersion(String templateVersion) {
			this.templateVersion = templateVersion;
		}

		public String getShareSource() {
			return this.shareSource;
		}

		public void setShareSource(String shareSource) {
			this.shareSource = shareSource;
		}
	}

	public static class TagsItem {

		private String key;

		private String value;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	@Override
	public GetTemplateResponse getInstance(UnmarshallerContext context) {
		return	GetTemplateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
