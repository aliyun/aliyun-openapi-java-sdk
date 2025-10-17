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

package com.aliyuncs.polardb.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.DescribeExtensionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeExtensionsResponse extends AcsResponse {

	private String requestId;

	private String overview;

	private List<UninstalledExtensionsItem> uninstalledExtensions;

	private List<InstalledExtensionsItem> installedExtensions;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getOverview() {
		return this.overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public List<UninstalledExtensionsItem> getUninstalledExtensions() {
		return this.uninstalledExtensions;
	}

	public void setUninstalledExtensions(List<UninstalledExtensionsItem> uninstalledExtensions) {
		this.uninstalledExtensions = uninstalledExtensions;
	}

	public List<InstalledExtensionsItem> getInstalledExtensions() {
		return this.installedExtensions;
	}

	public void setInstalledExtensions(List<InstalledExtensionsItem> installedExtensions) {
		this.installedExtensions = installedExtensions;
	}

	public static class UninstalledExtensionsItem {

		private String name;

		private String defaultVersion;

		private String installedVersion;

		private String comment;

		private String owner;

		private String priority;

		private String requires;

		private String category;

		private String restart;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDefaultVersion() {
			return this.defaultVersion;
		}

		public void setDefaultVersion(String defaultVersion) {
			this.defaultVersion = defaultVersion;
		}

		public String getInstalledVersion() {
			return this.installedVersion;
		}

		public void setInstalledVersion(String installedVersion) {
			this.installedVersion = installedVersion;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public String getPriority() {
			return this.priority;
		}

		public void setPriority(String priority) {
			this.priority = priority;
		}

		public String getRequires() {
			return this.requires;
		}

		public void setRequires(String requires) {
			this.requires = requires;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getRestart() {
			return this.restart;
		}

		public void setRestart(String restart) {
			this.restart = restart;
		}
	}

	public static class InstalledExtensionsItem {

		private String name;

		private String defaultVersion;

		private String installedVersion;

		private String comment;

		private String owner;

		private String priority;

		private String requires;

		private String category;

		private String restart;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDefaultVersion() {
			return this.defaultVersion;
		}

		public void setDefaultVersion(String defaultVersion) {
			this.defaultVersion = defaultVersion;
		}

		public String getInstalledVersion() {
			return this.installedVersion;
		}

		public void setInstalledVersion(String installedVersion) {
			this.installedVersion = installedVersion;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public String getPriority() {
			return this.priority;
		}

		public void setPriority(String priority) {
			this.priority = priority;
		}

		public String getRequires() {
			return this.requires;
		}

		public void setRequires(String requires) {
			this.requires = requires;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getRestart() {
			return this.restart;
		}

		public void setRestart(String restart) {
			this.restart = restart;
		}
	}

	@Override
	public DescribeExtensionsResponse getInstance(UnmarshallerContext context) {
		return	DescribeExtensionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
