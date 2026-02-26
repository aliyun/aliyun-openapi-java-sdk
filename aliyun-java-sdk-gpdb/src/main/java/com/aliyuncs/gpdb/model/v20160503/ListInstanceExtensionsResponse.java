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

package com.aliyuncs.gpdb.model.v20160503;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.ListInstanceExtensionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListInstanceExtensionsResponse extends AcsResponse {

	private String requestId;

	private Integer totalRecordCount;

	private Integer pageNumber;

	private Integer pageRecordCount;

	private List<ItemsItem> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Integer totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(Integer pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public List<ItemsItem> getItems() {
		return this.items;
	}

	public void setItems(List<ItemsItem> items) {
		this.items = items;
	}

	public static class ItemsItem {

		private String extensionId;

		private String name;

		private String installedDatabases;

		private String currentVersion;

		private String latestVersion;

		private String status;

		private String description;

		private Boolean isInstallNeedRestart;

		public String getExtensionId() {
			return this.extensionId;
		}

		public void setExtensionId(String extensionId) {
			this.extensionId = extensionId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getInstalledDatabases() {
			return this.installedDatabases;
		}

		public void setInstalledDatabases(String installedDatabases) {
			this.installedDatabases = installedDatabases;
		}

		public String getCurrentVersion() {
			return this.currentVersion;
		}

		public void setCurrentVersion(String currentVersion) {
			this.currentVersion = currentVersion;
		}

		public String getLatestVersion() {
			return this.latestVersion;
		}

		public void setLatestVersion(String latestVersion) {
			this.latestVersion = latestVersion;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Boolean getIsInstallNeedRestart() {
			return this.isInstallNeedRestart;
		}

		public void setIsInstallNeedRestart(Boolean isInstallNeedRestart) {
			this.isInstallNeedRestart = isInstallNeedRestart;
		}
	}

	@Override
	public ListInstanceExtensionsResponse getInstance(UnmarshallerContext context) {
		return	ListInstanceExtensionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
