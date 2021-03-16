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

package com.aliyuncs.cccxspaceinner.model.v20191227;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class EditXspaceGroupRequest extends RpcAcsRequest<EditXspaceGroupResponse> {
	   

	private Long groupId;

	private String groupName;

	private String showName;

	private Boolean supportIm;

	private Boolean supportPhone;

	private Boolean supportCase;

	private Integer isSwitchShow;

	private String description;

	private Long createAgentId;
	public EditXspaceGroupRequest() {
		super("CCCXSpaceInner", "2019-12-27", "EditXspaceGroup");
		setMethod(MethodType.POST);
	}

	public Long getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putBodyParameter("GroupId", groupId.toString());
		}
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
		if(groupName != null){
			putBodyParameter("GroupName", groupName);
		}
	}

	public String getShowName() {
		return this.showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
		if(showName != null){
			putBodyParameter("ShowName", showName);
		}
	}

	public Boolean getSupportIm() {
		return this.supportIm;
	}

	public void setSupportIm(Boolean supportIm) {
		this.supportIm = supportIm;
		if(supportIm != null){
			putBodyParameter("SupportIm", supportIm.toString());
		}
	}

	public Boolean getSupportPhone() {
		return this.supportPhone;
	}

	public void setSupportPhone(Boolean supportPhone) {
		this.supportPhone = supportPhone;
		if(supportPhone != null){
			putBodyParameter("SupportPhone", supportPhone.toString());
		}
	}

	public Boolean getSupportCase() {
		return this.supportCase;
	}

	public void setSupportCase(Boolean supportCase) {
		this.supportCase = supportCase;
		if(supportCase != null){
			putBodyParameter("SupportCase", supportCase.toString());
		}
	}

	public Integer getIsSwitchShow() {
		return this.isSwitchShow;
	}

	public void setIsSwitchShow(Integer isSwitchShow) {
		this.isSwitchShow = isSwitchShow;
		if(isSwitchShow != null){
			putBodyParameter("IsSwitchShow", isSwitchShow.toString());
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public Long getCreateAgentId() {
		return this.createAgentId;
	}

	public void setCreateAgentId(Long createAgentId) {
		this.createAgentId = createAgentId;
		if(createAgentId != null){
			putBodyParameter("CreateAgentId", createAgentId.toString());
		}
	}

	@Override
	public Class<EditXspaceGroupResponse> getResponseClass() {
		return EditXspaceGroupResponse.class;
	}

}
