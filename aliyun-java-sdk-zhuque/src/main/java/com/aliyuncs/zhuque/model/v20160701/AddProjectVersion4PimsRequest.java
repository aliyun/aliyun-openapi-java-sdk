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
public class AddProjectVersion4PimsRequest extends RpcAcsRequest<AddProjectVersion4PimsResponse> {
	
	public AddProjectVersion4PimsRequest() {
		super("Zhuque", "2016-07-01", "AddProjectVersion4Pims");
	}

	private String creator;

	private String description;

	private String businessVersionId;

	private String projectId;

	private String versionName;

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
		if(creator != null){
			putQueryParameter("Creator", creator);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getBusinessVersionId() {
		return this.businessVersionId;
	}

	public void setBusinessVersionId(String businessVersionId) {
		this.businessVersionId = businessVersionId;
		if(businessVersionId != null){
			putQueryParameter("BusinessVersionId", businessVersionId);
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

	public String getVersionName() {
		return this.versionName;
	}

	public void setVersionName(String versionName) {
		this.versionName = versionName;
		if(versionName != null){
			putQueryParameter("VersionName", versionName);
		}
	}

	@Override
	public Class<AddProjectVersion4PimsResponse> getResponseClass() {
		return AddProjectVersion4PimsResponse.class;
	}

}
