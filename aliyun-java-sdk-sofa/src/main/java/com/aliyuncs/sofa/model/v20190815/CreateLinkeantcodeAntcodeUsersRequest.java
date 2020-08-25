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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateLinkeantcodeAntcodeUsersRequest extends RpcAcsRequest<CreateLinkeantcodeAntcodeUsersResponse> {
	   

	private String externUid;

	private String role;

	private String admin;

	private String bio;

	private String projectsLimit;

	private String password;

	private String provider;

	private String email;

	private String requestGitOperate;

	private String confirm;

	private String websiteUrl;

	private String canCreateGroup;

	private String name;

	private String location;

	private String username;
	public CreateLinkeantcodeAntcodeUsersRequest() {
		super("SOFA", "2019-08-15", "CreateLinkeantcodeAntcodeUsers", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getExternUid() {
		return this.externUid;
	}

	public void setExternUid(String externUid) {
		this.externUid = externUid;
		if(externUid != null){
			putBodyParameter("ExternUid", externUid);
		}
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
		if(role != null){
			putBodyParameter("Role", role);
		}
	}

	public String getAdmin() {
		return this.admin;
	}

	public void setAdmin(String admin) {
		this.admin = admin;
		if(admin != null){
			putBodyParameter("Admin", admin);
		}
	}

	public String getBio() {
		return this.bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
		if(bio != null){
			putBodyParameter("Bio", bio);
		}
	}

	public String getProjectsLimit() {
		return this.projectsLimit;
	}

	public void setProjectsLimit(String projectsLimit) {
		this.projectsLimit = projectsLimit;
		if(projectsLimit != null){
			putBodyParameter("ProjectsLimit", projectsLimit);
		}
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
		if(password != null){
			putBodyParameter("Password", password);
		}
	}

	public String getProvider() {
		return this.provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
		if(provider != null){
			putBodyParameter("Provider", provider);
		}
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
		if(email != null){
			putBodyParameter("Email", email);
		}
	}

	public String getRequestGitOperate() {
		return this.requestGitOperate;
	}

	public void setRequestGitOperate(String requestGitOperate) {
		this.requestGitOperate = requestGitOperate;
		if(requestGitOperate != null){
			putBodyParameter("RequestGitOperate", requestGitOperate);
		}
	}

	public String getConfirm() {
		return this.confirm;
	}

	public void setConfirm(String confirm) {
		this.confirm = confirm;
		if(confirm != null){
			putBodyParameter("Confirm", confirm);
		}
	}

	public String getWebsiteUrl() {
		return this.websiteUrl;
	}

	public void setWebsiteUrl(String websiteUrl) {
		this.websiteUrl = websiteUrl;
		if(websiteUrl != null){
			putBodyParameter("WebsiteUrl", websiteUrl);
		}
	}

	public String getCanCreateGroup() {
		return this.canCreateGroup;
	}

	public void setCanCreateGroup(String canCreateGroup) {
		this.canCreateGroup = canCreateGroup;
		if(canCreateGroup != null){
			putBodyParameter("CanCreateGroup", canCreateGroup);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
		if(location != null){
			putBodyParameter("Location", location);
		}
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
		if(username != null){
			putBodyParameter("Username", username);
		}
	}

	@Override
	public Class<CreateLinkeantcodeAntcodeUsersResponse> getResponseClass() {
		return CreateLinkeantcodeAntcodeUsersResponse.class;
	}

}
