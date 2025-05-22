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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribePostgresExtensionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePostgresExtensionsResponse extends AcsResponse {

	private Map<Object,Object> overview;

	private String requestId;

	private List<Extension> installedExtensions;

	private List<Extension> uninstalledExtensions;

	public Map<Object,Object> getOverview() {
		return this.overview;
	}

	public void setOverview(Map<Object,Object> overview) {
		this.overview = overview;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Extension> getInstalledExtensions() {
		return this.installedExtensions;
	}

	public void setInstalledExtensions(List<Extension> installedExtensions) {
		this.installedExtensions = installedExtensions;
	}

	public List<Extension> getUninstalledExtensions() {
		return this.uninstalledExtensions;
	}

	public void setUninstalledExtensions(List<Extension> uninstalledExtensions) {
		this.uninstalledExtensions = uninstalledExtensions;
	}

	public static class Extension {

		private String category;

		private String comment;

		private String defaultVersion;

		private String installedVersion;

		private String name;

		private String owner;

		private String priority;

		private String requires;

		private String uid;

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
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

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
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

		public String getUid() {
			return this.uid;
		}

		public void setUid(String uid) {
			this.uid = uid;
		}
	}

	@Override
	public DescribePostgresExtensionsResponse getInstance(UnmarshallerContext context) {
		return	DescribePostgresExtensionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
