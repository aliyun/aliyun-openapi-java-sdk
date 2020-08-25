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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.QueryAKSBuildPackTechStackVersionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryAKSBuildPackTechStackVersionsResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Long total;

	private List<ListItem> list;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<ListItem> getList() {
		return this.list;
	}

	public void setList(List<ListItem> list) {
		this.list = list;
	}

	public static class ListItem {

		private String description;

		private String externalDestImage;

		private String externalRegistryPassword;

		private String externalRegistryUser;

		private String fromImage;

		private String id;

		private String name;

		private Boolean online;

		private String owner;

		private String packageDir;

		private String regionId;

		private String registryPassword;

		private String registryUser;

		private String scope;

		private String techStack;

		private String techStackId;

		private String utcCreated;

		private String utcModified;

		private String version;

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getExternalDestImage() {
			return this.externalDestImage;
		}

		public void setExternalDestImage(String externalDestImage) {
			this.externalDestImage = externalDestImage;
		}

		public String getExternalRegistryPassword() {
			return this.externalRegistryPassword;
		}

		public void setExternalRegistryPassword(String externalRegistryPassword) {
			this.externalRegistryPassword = externalRegistryPassword;
		}

		public String getExternalRegistryUser() {
			return this.externalRegistryUser;
		}

		public void setExternalRegistryUser(String externalRegistryUser) {
			this.externalRegistryUser = externalRegistryUser;
		}

		public String getFromImage() {
			return this.fromImage;
		}

		public void setFromImage(String fromImage) {
			this.fromImage = fromImage;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Boolean getOnline() {
			return this.online;
		}

		public void setOnline(Boolean online) {
			this.online = online;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public String getPackageDir() {
			return this.packageDir;
		}

		public void setPackageDir(String packageDir) {
			this.packageDir = packageDir;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getRegistryPassword() {
			return this.registryPassword;
		}

		public void setRegistryPassword(String registryPassword) {
			this.registryPassword = registryPassword;
		}

		public String getRegistryUser() {
			return this.registryUser;
		}

		public void setRegistryUser(String registryUser) {
			this.registryUser = registryUser;
		}

		public String getScope() {
			return this.scope;
		}

		public void setScope(String scope) {
			this.scope = scope;
		}

		public String getTechStack() {
			return this.techStack;
		}

		public void setTechStack(String techStack) {
			this.techStack = techStack;
		}

		public String getTechStackId() {
			return this.techStackId;
		}

		public void setTechStackId(String techStackId) {
			this.techStackId = techStackId;
		}

		public String getUtcCreated() {
			return this.utcCreated;
		}

		public void setUtcCreated(String utcCreated) {
			this.utcCreated = utcCreated;
		}

		public String getUtcModified() {
			return this.utcModified;
		}

		public void setUtcModified(String utcModified) {
			this.utcModified = utcModified;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}
	}

	@Override
	public QueryAKSBuildPackTechStackVersionsResponse getInstance(UnmarshallerContext context) {
		return	QueryAKSBuildPackTechStackVersionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
