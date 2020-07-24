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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateFaceGroupRequest extends RpcAcsRequest<UpdateFaceGroupResponse> {
	   

	private String project;

	private String externalId;

	private String groupId;

	private String remarksB;

	private String remarksA;

	private String groupName;

	private String remarksArrayA;

	private String remarksArrayB;

	private String remarksD;

	private String remarksC;

	private String setId;

	private String groupCoverFaceId;
	public UpdateFaceGroupRequest() {
		super("imm", "2017-09-06", "UpdateFaceGroup");
		setMethod(MethodType.POST);
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

	public String getExternalId() {
		return this.externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
		if(externalId != null){
			putQueryParameter("ExternalId", externalId);
		}
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId);
		}
	}

	public String getRemarksB() {
		return this.remarksB;
	}

	public void setRemarksB(String remarksB) {
		this.remarksB = remarksB;
		if(remarksB != null){
			putQueryParameter("RemarksB", remarksB);
		}
	}

	public String getRemarksA() {
		return this.remarksA;
	}

	public void setRemarksA(String remarksA) {
		this.remarksA = remarksA;
		if(remarksA != null){
			putQueryParameter("RemarksA", remarksA);
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

	public String getRemarksArrayA() {
		return this.remarksArrayA;
	}

	public void setRemarksArrayA(String remarksArrayA) {
		this.remarksArrayA = remarksArrayA;
		if(remarksArrayA != null){
			putQueryParameter("RemarksArrayA", remarksArrayA);
		}
	}

	public String getRemarksArrayB() {
		return this.remarksArrayB;
	}

	public void setRemarksArrayB(String remarksArrayB) {
		this.remarksArrayB = remarksArrayB;
		if(remarksArrayB != null){
			putQueryParameter("RemarksArrayB", remarksArrayB);
		}
	}

	public String getRemarksD() {
		return this.remarksD;
	}

	public void setRemarksD(String remarksD) {
		this.remarksD = remarksD;
		if(remarksD != null){
			putQueryParameter("RemarksD", remarksD);
		}
	}

	public String getRemarksC() {
		return this.remarksC;
	}

	public void setRemarksC(String remarksC) {
		this.remarksC = remarksC;
		if(remarksC != null){
			putQueryParameter("RemarksC", remarksC);
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

	public String getGroupCoverFaceId() {
		return this.groupCoverFaceId;
	}

	public void setGroupCoverFaceId(String groupCoverFaceId) {
		this.groupCoverFaceId = groupCoverFaceId;
		if(groupCoverFaceId != null){
			putQueryParameter("GroupCoverFaceId", groupCoverFaceId);
		}
	}

	@Override
	public Class<UpdateFaceGroupResponse> getResponseClass() {
		return UpdateFaceGroupResponse.class;
	}

}
