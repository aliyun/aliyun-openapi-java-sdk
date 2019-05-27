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
public class RegistFaceRequest extends RpcAcsRequest<RegistFaceResponse> {
	
	public RegistFaceRequest() {
		super("imm", "2017-09-06", "RegistFace", "imm");
	}

	private Boolean chooseBiggestFace;

	private Boolean isQualityLimit;

	private String project;

	private String srcUri;

	private String registerCheckLevel;

	private String groupName;

	private String user;

	public Boolean getChooseBiggestFace() {
		return this.chooseBiggestFace;
	}

	public void setChooseBiggestFace(Boolean chooseBiggestFace) {
		this.chooseBiggestFace = chooseBiggestFace;
		if(chooseBiggestFace != null){
			putQueryParameter("ChooseBiggestFace", chooseBiggestFace.toString());
		}
	}

	public Boolean getIsQualityLimit() {
		return this.isQualityLimit;
	}

	public void setIsQualityLimit(Boolean isQualityLimit) {
		this.isQualityLimit = isQualityLimit;
		if(isQualityLimit != null){
			putQueryParameter("IsQualityLimit", isQualityLimit.toString());
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

	public String getSrcUri() {
		return this.srcUri;
	}

	public void setSrcUri(String srcUri) {
		this.srcUri = srcUri;
		if(srcUri != null){
			putQueryParameter("SrcUri", srcUri);
		}
	}

	public String getRegisterCheckLevel() {
		return this.registerCheckLevel;
	}

	public void setRegisterCheckLevel(String registerCheckLevel) {
		this.registerCheckLevel = registerCheckLevel;
		if(registerCheckLevel != null){
			putQueryParameter("RegisterCheckLevel", registerCheckLevel);
		}
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
		if(groupName != null){
			putQueryParameter("GroupName", groupName);
		}
	}

	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
		if(user != null){
			putQueryParameter("User", user);
		}
	}

	@Override
	public Class<RegistFaceResponse> getResponseClass() {
		return RegistFaceResponse.class;
	}

}
