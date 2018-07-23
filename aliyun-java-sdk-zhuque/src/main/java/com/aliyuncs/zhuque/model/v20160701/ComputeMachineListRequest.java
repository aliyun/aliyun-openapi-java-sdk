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
public class ComputeMachineListRequest extends RpcAcsRequest<ComputeMachineListResponse> {
	
	public ComputeMachineListRequest() {
		super("Zhuque", "2016-07-01", "ComputeMachineList");
	}

	private String versionId;

	private String project;

	private Boolean clearHistory;

	private Boolean unDeploy;

	public String getVersionId() {
		return this.versionId;
	}

	public void setVersionId(String versionId) {
		this.versionId = versionId;
		if(versionId != null){
			putQueryParameter("VersionId", versionId);
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

	public Boolean getClearHistory() {
		return this.clearHistory;
	}

	public void setClearHistory(Boolean clearHistory) {
		this.clearHistory = clearHistory;
		if(clearHistory != null){
			putQueryParameter("ClearHistory", clearHistory.toString());
		}
	}

	public Boolean getUnDeploy() {
		return this.unDeploy;
	}

	public void setUnDeploy(Boolean unDeploy) {
		this.unDeploy = unDeploy;
		if(unDeploy != null){
			putQueryParameter("UnDeploy", unDeploy.toString());
		}
	}

	@Override
	public Class<ComputeMachineListResponse> getResponseClass() {
		return ComputeMachineListResponse.class;
	}

}
