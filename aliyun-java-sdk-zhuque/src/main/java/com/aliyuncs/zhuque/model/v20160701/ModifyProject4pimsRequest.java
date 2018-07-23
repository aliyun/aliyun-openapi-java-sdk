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
public class ModifyProject4pimsRequest extends RpcAcsRequest<ModifyProject4pimsResponse> {
	
	public ModifyProject4pimsRequest() {
		super("Zhuque", "2016-07-01", "ModifyProject4pims");
	}

	private Boolean hack;

	private String versionId;

	private String projectId;

	private String status;

	public Boolean getHack() {
		return this.hack;
	}

	public void setHack(Boolean hack) {
		this.hack = hack;
		if(hack != null){
			putQueryParameter("Hack", hack.toString());
		}
	}

	public String getVersionId() {
		return this.versionId;
	}

	public void setVersionId(String versionId) {
		this.versionId = versionId;
		if(versionId != null){
			putQueryParameter("VersionId", versionId);
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putQueryParameter("ProjectId", projectId);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	@Override
	public Class<ModifyProject4pimsResponse> getResponseClass() {
		return ModifyProject4pimsResponse.class;
	}

}
