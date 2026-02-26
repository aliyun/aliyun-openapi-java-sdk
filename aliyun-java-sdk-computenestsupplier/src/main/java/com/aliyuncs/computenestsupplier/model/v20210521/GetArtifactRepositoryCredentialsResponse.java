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

package com.aliyuncs.computenestsupplier.model.v20210521;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.computenestsupplier.transform.v20210521.GetArtifactRepositoryCredentialsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetArtifactRepositoryCredentialsResponse extends AcsResponse {

	private String requestId;

	private String expireDate;

	private List<AvailableResourcesItem> availableResources;

	private Credentials credentials;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getExpireDate() {
		return this.expireDate;
	}

	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	public List<AvailableResourcesItem> getAvailableResources() {
		return this.availableResources;
	}

	public void setAvailableResources(List<AvailableResourcesItem> availableResources) {
		this.availableResources = availableResources;
	}

	public Credentials getCredentials() {
		return this.credentials;
	}

	public void setCredentials(Credentials credentials) {
		this.credentials = credentials;
	}

	public static class AvailableResourcesItem {

		private String regionId;

		private String repositoryName;

		private String path;

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getRepositoryName() {
			return this.repositoryName;
		}

		public void setRepositoryName(String repositoryName) {
			this.repositoryName = repositoryName;
		}

		public String getPath() {
			return this.path;
		}

		public void setPath(String path) {
			this.path = path;
		}
	}

	public static class Credentials {

		private String username;

		private String password;

		private String accessKeyId;

		private String accessKeySecret;

		private String securityToken;

		public String getUsername() {
			return this.username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return this.password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getAccessKeyId() {
			return this.accessKeyId;
		}

		public void setAccessKeyId(String accessKeyId) {
			this.accessKeyId = accessKeyId;
		}

		public String getAccessKeySecret() {
			return this.accessKeySecret;
		}

		public void setAccessKeySecret(String accessKeySecret) {
			this.accessKeySecret = accessKeySecret;
		}

		public String getSecurityToken() {
			return this.securityToken;
		}

		public void setSecurityToken(String securityToken) {
			this.securityToken = securityToken;
		}
	}

	@Override
	public GetArtifactRepositoryCredentialsResponse getInstance(UnmarshallerContext context) {
		return	GetArtifactRepositoryCredentialsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
