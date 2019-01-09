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

package com.aliyuncs.imm.model.v20170906;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class UpdateFaceGroupByIdRequest extends RpcAcsRequest<UpdateFaceGroupByIdResponse> {
	
	public UpdateFaceGroupByIdRequest() {
		super("imm", "2017-09-06", "UpdateFaceGroupById", "imm");
	}

	private String project;

	private String setId;

	private String newGroupId;

	private String faceIds;

	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
		if(project != null){
			putQueryParameter("Project", project);
		}
	}

	public String getSetId() {
		return this.setId;
	}

	public void setSetId(String setId) {
		this.setId = setId;
		if(setId != null){
			putQueryParameter("SetId", setId);
		}
	}

	public String getNewGroupId() {
		return this.newGroupId;
	}

	public void setNewGroupId(String newGroupId) {
		this.newGroupId = newGroupId;
		if(newGroupId != null){
			putQueryParameter("NewGroupId", newGroupId);
		}
	}

	public String getFaceIds() {
		return this.faceIds;
	}

	public void setFaceIds(String faceIds) {
		this.faceIds = faceIds;
		if(faceIds != null){
			putQueryParameter("FaceIds", faceIds);
		}
	}

	@Override
	public Class<UpdateFaceGroupByIdResponse> getResponseClass() {
		return UpdateFaceGroupByIdResponse.class;
	}

}
