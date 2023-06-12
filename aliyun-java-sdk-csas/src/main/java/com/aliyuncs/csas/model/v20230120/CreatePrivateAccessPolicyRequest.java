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

package com.aliyuncs.csas.model.v20230120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreatePrivateAccessPolicyRequest extends RpcAcsRequest<CreatePrivateAccessPolicyResponse> {
	   

	private String description;

	@SerializedName("customUserAttributes")
	private List<CustomUserAttributes> customUserAttributes;

	@SerializedName("tagIds")
	private List<String> tagIds;

	@SerializedName("userGroupIds")
	private List<String> userGroupIds;

	private String policyAction;

	private Integer priority;

	@SerializedName("applicationIds")
	private List<String> applicationIds;

	private String userGroupMode;

	private String name;

	private String applicationType;

	private String status;
	public CreatePrivateAccessPolicyRequest() {
		super("csas", "2023-01-20", "CreatePrivateAccessPolicy");
		setMethod(MethodType.POST);
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

	public List<CustomUserAttributes> getCustomUserAttributes() {
		return this.customUserAttributes;
	}

	public void setCustomUserAttributes(List<CustomUserAttributes> customUserAttributes) {
		this.customUserAttributes = customUserAttributes;	
		if (customUserAttributes != null) {
			putBodyParameter("CustomUserAttributes" , new Gson().toJson(customUserAttributes));
		}	
	}

	public List<String> getTagIds() {
		return this.tagIds;
	}

	public void setTagIds(List<String> tagIds) {
		this.tagIds = tagIds;	
		if (tagIds != null) {
			putBodyParameter("TagIds" , new Gson().toJson(tagIds));
		}	
	}

	public List<String> getUserGroupIds() {
		return this.userGroupIds;
	}

	public void setUserGroupIds(List<String> userGroupIds) {
		this.userGroupIds = userGroupIds;	
		if (userGroupIds != null) {
			putBodyParameter("UserGroupIds" , new Gson().toJson(userGroupIds));
		}	
	}

	public String getPolicyAction() {
		return this.policyAction;
	}

	public void setPolicyAction(String policyAction) {
		this.policyAction = policyAction;
		if(policyAction != null){
			putBodyParameter("PolicyAction", policyAction);
		}
	}

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
		if(priority != null){
			putBodyParameter("Priority", priority.toString());
		}
	}

	public List<String> getApplicationIds() {
		return this.applicationIds;
	}

	public void setApplicationIds(List<String> applicationIds) {
		this.applicationIds = applicationIds;	
		if (applicationIds != null) {
			putBodyParameter("ApplicationIds" , new Gson().toJson(applicationIds));
		}	
	}

	public String getUserGroupMode() {
		return this.userGroupMode;
	}

	public void setUserGroupMode(String userGroupMode) {
		this.userGroupMode = userGroupMode;
		if(userGroupMode != null){
			putBodyParameter("UserGroupMode", userGroupMode);
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

	public String getApplicationType() {
		return this.applicationType;
	}

	public void setApplicationType(String applicationType) {
		this.applicationType = applicationType;
		if(applicationType != null){
			putBodyParameter("ApplicationType", applicationType);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status);
		}
	}

	public static class CustomUserAttributes {

		@SerializedName("UserGroupType")
		private String userGroupType;

		@SerializedName("IdpId")
		private Integer idpId;

		@SerializedName("Value")
		private String value;

		@SerializedName("Relation")
		private String relation;

		public String getUserGroupType() {
			return this.userGroupType;
		}

		public void setUserGroupType(String userGroupType) {
			this.userGroupType = userGroupType;
		}

		public Integer getIdpId() {
			return this.idpId;
		}

		public void setIdpId(Integer idpId) {
			this.idpId = idpId;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getRelation() {
			return this.relation;
		}

		public void setRelation(String relation) {
			this.relation = relation;
		}
	}

	@Override
	public Class<CreatePrivateAccessPolicyResponse> getResponseClass() {
		return CreatePrivateAccessPolicyResponse.class;
	}

}
