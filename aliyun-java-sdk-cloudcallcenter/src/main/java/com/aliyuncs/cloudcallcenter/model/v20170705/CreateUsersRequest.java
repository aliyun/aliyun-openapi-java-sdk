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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class CreateUsersRequest extends RpcAcsRequest<CreateUsersResponse> {
	
	public CreateUsersRequest() {
		super("CloudCallCenter", "2017-07-05", "CreateUsers", "CloudCallCenter", "innerAPI");
	}

	private List<Integer> skillLevels;

	private String instanceId;

	private String fileName;

	private String data;

	private List<String> roleIds;

	private List<String> skillGroupIds;

	private Boolean resetPassword;

	private String type;

	private String separator;

	private List<String> users;

	private String confirmEmail;

	public List<Integer> getSkillLevels() {
		return this.skillLevels;
	}

	public void setSkillLevels(List<Integer> skillLevels) {
		this.skillLevels = skillLevels;	
		if (skillLevels != null) {
			for (int i = 0; i < skillLevels.size(); i++) {
				putQueryParameter("SkillLevel." + (i + 1) , skillLevels.get(i));
			}
		}	
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
		if(fileName != null){
			putQueryParameter("FileName", fileName);
		}
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
		if(data != null){
			putQueryParameter("Data", data);
		}
	}

	public List<String> getRoleIds() {
		return this.roleIds;
	}

	public void setRoleIds(List<String> roleIds) {
		this.roleIds = roleIds;	
		if (roleIds != null) {
			for (int i = 0; i < roleIds.size(); i++) {
				putQueryParameter("RoleId." + (i + 1) , roleIds.get(i));
			}
		}	
	}

	public List<String> getSkillGroupIds() {
		return this.skillGroupIds;
	}

	public void setSkillGroupIds(List<String> skillGroupIds) {
		this.skillGroupIds = skillGroupIds;	
		if (skillGroupIds != null) {
			for (int i = 0; i < skillGroupIds.size(); i++) {
				putQueryParameter("SkillGroupId." + (i + 1) , skillGroupIds.get(i));
			}
		}	
	}

	public Boolean getResetPassword() {
		return this.resetPassword;
	}

	public void setResetPassword(Boolean resetPassword) {
		this.resetPassword = resetPassword;
		if(resetPassword != null){
			putQueryParameter("ResetPassword", resetPassword.toString());
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public String getSeparator() {
		return this.separator;
	}

	public void setSeparator(String separator) {
		this.separator = separator;
		if(separator != null){
			putQueryParameter("Separator", separator);
		}
	}

	public List<String> getUsers() {
		return this.users;
	}

	public void setUsers(List<String> users) {
		this.users = users;	
		if (users != null) {
			for (int i = 0; i < users.size(); i++) {
				putQueryParameter("User." + (i + 1) , users.get(i));
			}
		}	
	}

	public String getConfirmEmail() {
		return this.confirmEmail;
	}

	public void setConfirmEmail(String confirmEmail) {
		this.confirmEmail = confirmEmail;
		if(confirmEmail != null){
			putQueryParameter("ConfirmEmail", confirmEmail);
		}
	}

	@Override
	public Class<CreateUsersResponse> getResponseClass() {
		return CreateUsersResponse.class;
	}

}
