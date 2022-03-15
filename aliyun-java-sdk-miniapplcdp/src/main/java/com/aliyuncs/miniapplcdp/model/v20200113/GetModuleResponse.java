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

package com.aliyuncs.miniapplcdp.model.v20200113;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.miniapplcdp.transform.v20200113.GetModuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetModuleResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String description;

		private String createTime;

		private String modifiedTime;

		private String icon;

		private String latestPublishedCommit;

		private String latestPublishedVersion;

		private String minimumPlatformVersion;

		private String moduleId;

		private String moduleName;

		private String ownerUserId;

		private String platform;

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public String getIcon() {
			return this.icon;
		}

		public void setIcon(String icon) {
			this.icon = icon;
		}

		public String getLatestPublishedCommit() {
			return this.latestPublishedCommit;
		}

		public void setLatestPublishedCommit(String latestPublishedCommit) {
			this.latestPublishedCommit = latestPublishedCommit;
		}

		public String getLatestPublishedVersion() {
			return this.latestPublishedVersion;
		}

		public void setLatestPublishedVersion(String latestPublishedVersion) {
			this.latestPublishedVersion = latestPublishedVersion;
		}

		public String getMinimumPlatformVersion() {
			return this.minimumPlatformVersion;
		}

		public void setMinimumPlatformVersion(String minimumPlatformVersion) {
			this.minimumPlatformVersion = minimumPlatformVersion;
		}

		public String getModuleId() {
			return this.moduleId;
		}

		public void setModuleId(String moduleId) {
			this.moduleId = moduleId;
		}

		public String getModuleName() {
			return this.moduleName;
		}

		public void setModuleName(String moduleName) {
			this.moduleName = moduleName;
		}

		public String getOwnerUserId() {
			return this.ownerUserId;
		}

		public void setOwnerUserId(String ownerUserId) {
			this.ownerUserId = ownerUserId;
		}

		public String getPlatform() {
			return this.platform;
		}

		public void setPlatform(String platform) {
			this.platform = platform;
		}
	}

	@Override
	public GetModuleResponse getInstance(UnmarshallerContext context) {
		return	GetModuleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
