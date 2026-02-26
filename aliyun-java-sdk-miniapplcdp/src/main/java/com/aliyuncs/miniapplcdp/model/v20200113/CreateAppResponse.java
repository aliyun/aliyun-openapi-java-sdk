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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.miniapplcdp.transform.v20200113.CreateAppResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateAppResponse extends AcsResponse {

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

		private String appId;

		private String description;

		private String createTime;

		private String modifiedTime;

		private String icon;

		private Boolean isTemplate;

		private String lastEditTime;

		private String mainModuleId;

		private String appName;

		private String schemaVersion;

		private String source;

		private String appStatus;

		private String appType;

		private String platformVersion;

		private List<CategoryItem> categories;

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

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

		public Boolean getIsTemplate() {
			return this.isTemplate;
		}

		public void setIsTemplate(Boolean isTemplate) {
			this.isTemplate = isTemplate;
		}

		public String getLastEditTime() {
			return this.lastEditTime;
		}

		public void setLastEditTime(String lastEditTime) {
			this.lastEditTime = lastEditTime;
		}

		public String getMainModuleId() {
			return this.mainModuleId;
		}

		public void setMainModuleId(String mainModuleId) {
			this.mainModuleId = mainModuleId;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getSchemaVersion() {
			return this.schemaVersion;
		}

		public void setSchemaVersion(String schemaVersion) {
			this.schemaVersion = schemaVersion;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getAppStatus() {
			return this.appStatus;
		}

		public void setAppStatus(String appStatus) {
			this.appStatus = appStatus;
		}

		public String getAppType() {
			return this.appType;
		}

		public void setAppType(String appType) {
			this.appType = appType;
		}

		public String getPlatformVersion() {
			return this.platformVersion;
		}

		public void setPlatformVersion(String platformVersion) {
			this.platformVersion = platformVersion;
		}

		public List<CategoryItem> getCategories() {
			return this.categories;
		}

		public void setCategories(List<CategoryItem> categories) {
			this.categories = categories;
		}

		public static class CategoryItem {

			private String categoryId;

			private String categoryName;

			private String parentCategoryId;

			public String getCategoryId() {
				return this.categoryId;
			}

			public void setCategoryId(String categoryId) {
				this.categoryId = categoryId;
			}

			public String getCategoryName() {
				return this.categoryName;
			}

			public void setCategoryName(String categoryName) {
				this.categoryName = categoryName;
			}

			public String getParentCategoryId() {
				return this.parentCategoryId;
			}

			public void setParentCategoryId(String parentCategoryId) {
				this.parentCategoryId = parentCategoryId;
			}
		}
	}

	@Override
	public CreateAppResponse getInstance(UnmarshallerContext context) {
		return	CreateAppResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
