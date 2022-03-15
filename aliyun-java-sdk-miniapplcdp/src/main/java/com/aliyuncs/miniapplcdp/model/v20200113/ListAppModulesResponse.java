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
import com.aliyuncs.miniapplcdp.transform.v20200113.ListAppModulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAppModulesResponse extends AcsResponse {

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

		private List<ModuleItem> items;

		public List<ModuleItem> getItems() {
			return this.items;
		}

		public void setItems(List<ModuleItem> items) {
			this.items = items;
		}

		public static class ModuleItem {

			private String commitId;

			private String description;

			private Boolean directDependency;

			private String icon;

			private String minimumPlatformVersion;

			private String moduleId;

			private String moduleName;

			private String ownerUserId;

			private String platform;

			private String version;

			public String getCommitId() {
				return this.commitId;
			}

			public void setCommitId(String commitId) {
				this.commitId = commitId;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public Boolean getDirectDependency() {
				return this.directDependency;
			}

			public void setDirectDependency(Boolean directDependency) {
				this.directDependency = directDependency;
			}

			public String getIcon() {
				return this.icon;
			}

			public void setIcon(String icon) {
				this.icon = icon;
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

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}
		}
	}

	@Override
	public ListAppModulesResponse getInstance(UnmarshallerContext context) {
		return	ListAppModulesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
