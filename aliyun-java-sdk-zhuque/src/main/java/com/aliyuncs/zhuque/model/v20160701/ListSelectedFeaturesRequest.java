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

package com.aliyuncs.zhuque.model.v20160701;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ListSelectedFeaturesRequest extends RpcAcsRequest<ListSelectedFeaturesResponse> {
	
	public ListSelectedFeaturesRequest() {
		super("Zhuque", "2016-07-01", "ListSelectedFeatures");
	}

	private String versionId;

	private String cloudType;

	private String commit;

	private String project;

	private Boolean isAll;

	private String branch;

	public String getVersionId() {
		return this.versionId;
	}

	public void setVersionId(String versionId) {
		this.versionId = versionId;
		if(versionId != null){
			putQueryParameter("VersionId", versionId);
		}
	}

	public String getCloudType() {
		return this.cloudType;
	}

	public void setCloudType(String cloudType) {
		this.cloudType = cloudType;
		if(cloudType != null){
			putQueryParameter("CloudType", cloudType);
		}
	}

	public String getCommit() {
		return this.commit;
	}

	public void setCommit(String commit) {
		this.commit = commit;
		if(commit != null){
			putQueryParameter("Commit", commit);
		}
	}

	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
		if(project != null){
			putQueryParameter("Project", project);
		}
	}

	public Boolean getIsAll() {
		return this.isAll;
	}

	public void setIsAll(Boolean isAll) {
		this.isAll = isAll;
		if(isAll != null){
			putQueryParameter("IsAll", isAll.toString());
		}
	}

	public String getBranch() {
		return this.branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
		if(branch != null){
			putQueryParameter("Branch", branch);
		}
	}

	@Override
	public Class<ListSelectedFeaturesResponse> getResponseClass() {
		return ListSelectedFeaturesResponse.class;
	}

}
