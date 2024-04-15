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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdatePrivateAccessPolicyRequest extends RpcAcsRequest<UpdatePrivateAccessPolicyResponse> {
	   

	private String description;

	private String policyId;

	private List<CustomUserAttributes> customUserAttributes;

	private List<String> tagIds;

	private String deviceAttributeId;

	private List<String> userGroupIds;

	private String policyAction;

	private Integer priority;

	private List<String> applicationIds;

	private String userGroupMode;

	private String modifyType;

	private String applicationType;

	private String status;
	public UpdatePrivateAccessPolicyRequest() {
		super("csas", "2023-01-20", "UpdatePrivateAccessPolicy");
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

	public String getPolicyId() {
		return this.policyId;
	}

	public void setPolicyId(String policyId) {
		this.policyId = policyId;
		if(policyId != null){
			putBodyParameter("PolicyId", policyId);
		}
	}

	public List<CustomUserAttributes> getCustomUserAttributes() {
		return this.customUserAttributes;
	}

	public void setCustomUserAttributes(List<CustomUserAttributes> customUserAttributes) {
		this.customUserAttributes = customUserAttributes;	
		if (customUserAttributes != null) {
			for (int depth1 = 0; depth1 < customUserAttributes.size(); depth1++) {
				if (customUserAttributes.get(depth1) != null) {
					
						putBodyParameter("CustomUserAttributes." + (depth1 + 1) + ".UserGroupType" , customUserAttributes.get(depth1).getUserGroupType());
						putBodyParameter("CustomUserAttributes." + (depth1 + 1) + ".IdpId" , customUserAttributes.get(depth1).getIdpId());
						putBodyParameter("CustomUserAttributes." + (depth1 + 1) + ".Value" , customUserAttributes.get(depth1).getValue());
						putBodyParameter("CustomUserAttributes." + (depth1 + 1) + ".Relation" , customUserAttributes.get(depth1).getRelation());
				}
			}
		}	
	}

	public List<String> getTagIds() {
		return this.tagIds;
	}

	public void setTagIds(List<String> tagIds) {
		this.tagIds = tagIds;	
		if (tagIds != null) {
			for (int depth1 = 0; depth1 < tagIds.size(); depth1++) {
				putBodyParameter("TagIds." + (depth1 + 1) , tagIds.get(depth1));
			}
		}	
	}

	public String getDeviceAttributeId() {
		return this.deviceAttributeId;
	}

	public void setDeviceAttributeId(String deviceAttributeId) {
		this.deviceAttributeId = deviceAttributeId;
		if(deviceAttributeId != null){
			putBodyParameter("DeviceAttributeId", deviceAttributeId);
		}
	}

	public List<String> getUserGroupIds() {
		return this.userGroupIds;
	}

	public void setUserGroupIds(List<String> userGroupIds) {
		this.userGroupIds = userGroupIds;	
		if (userGroupIds != null) {
			for (int depth1 = 0; depth1 < userGroupIds.size(); depth1++) {
				putBodyParameter("UserGroupIds." + (depth1 + 1) , userGroupIds.get(depth1));
			}
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
			for (int depth1 = 0; depth1 < applicationIds.size(); depth1++) {
				putBodyParameter("ApplicationIds." + (depth1 + 1) , applicationIds.get(depth1));
			}
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

	public String getModifyType() {
		return this.modifyType;
	}

	public void setModifyType(String modifyType) {
		this.modifyType = modifyType;
		if(modifyType != null){
			putBodyParameter("ModifyType", modifyType);
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

		private String userGroupType;

		private Integer idpId;

		private String value;

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
	public Class<UpdatePrivateAccessPolicyResponse> getResponseClass() {
		return UpdatePrivateAccessPolicyResponse.class;
	}

}
