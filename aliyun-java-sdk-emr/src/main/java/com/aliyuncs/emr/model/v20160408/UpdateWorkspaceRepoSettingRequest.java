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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.emr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateWorkspaceRepoSettingRequest extends RpcAcsRequest<UpdateWorkspaceRepoSettingResponse> {
	
	public UpdateWorkspaceRepoSettingRequest() {
		super("Emr", "2016-04-08", "UpdateWorkspaceRepoSetting", "emr");
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Long resourceOwnerId;

	private List<RepoMaven> repoMavens;

	private List<RepoPip> repoPips;

	private String workspaceId;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public List<RepoMaven> getRepoMavens() {
		return this.repoMavens;
	}

	public void setRepoMavens(List<RepoMaven> repoMavens) {
		this.repoMavens = repoMavens;	
		if (repoMavens != null) {
			for (int depth1 = 0; depth1 < repoMavens.size(); depth1++) {
				putQueryParameter("RepoMaven." + (depth1 + 1) + ".GroupId" , repoMavens.get(depth1).getGroupId());
				putQueryParameter("RepoMaven." + (depth1 + 1) + ".ArtifactId" , repoMavens.get(depth1).getArtifactId());
				putQueryParameter("RepoMaven." + (depth1 + 1) + ".Version" , repoMavens.get(depth1).getVersion());
			}
		}	
	}

	public List<RepoPip> getRepoPips() {
		return this.repoPips;
	}

	public void setRepoPips(List<RepoPip> repoPips) {
		this.repoPips = repoPips;	
		if (repoPips != null) {
			for (int depth1 = 0; depth1 < repoPips.size(); depth1++) {
				putQueryParameter("RepoPip." + (depth1 + 1) + ".PackageName" , repoPips.get(depth1).getPackageName());
				putQueryParameter("RepoPip." + (depth1 + 1) + ".Version" , repoPips.get(depth1).getVersion());
			}
		}	
	}

	public String getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
		this.workspaceId = workspaceId;
		if(workspaceId != null){
			putQueryParameter("WorkspaceId", workspaceId);
		}
	}

	public static class RepoMaven {

		private String groupId;

		private String artifactId;

		private String version;

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getArtifactId() {
			return this.artifactId;
		}

		public void setArtifactId(String artifactId) {
			this.artifactId = artifactId;
		}

		public String getBizVersion() {
			return this.version;
		}

		public void setBizVersion(String version) {
			this.version = version;
		}

		/**
		 * @deprecated use getBizVersion instead of this.
		 */
		@Deprecated
		public String getVersion() {
			return this.version;
		}

		/**
		 * @deprecated use setBizVersion instead of this.
		 */
		@Deprecated
		public void setVersion(String version) {
			this.version = version;
		}
	}

	public static class RepoPip {

		private String packageName;

		private String version;

		public String getPackageName() {
			return this.packageName;
		}

		public void setPackageName(String packageName) {
			this.packageName = packageName;
		}

		public String getBizVersion() {
			return this.version;
		}

		public void setBizVersion(String version) {
			this.version = version;
		}

		/**
		 * @deprecated use getBizVersion instead of this.
		 */
		@Deprecated
		public String getVersion() {
			return this.version;
		}

		/**
		 * @deprecated use setBizVersion instead of this.
		 */
		@Deprecated
		public void setVersion(String version) {
			this.version = version;
		}
	}

	@Override
	public Class<UpdateWorkspaceRepoSettingResponse> getResponseClass() {
		return UpdateWorkspaceRepoSettingResponse.class;
	}

}
