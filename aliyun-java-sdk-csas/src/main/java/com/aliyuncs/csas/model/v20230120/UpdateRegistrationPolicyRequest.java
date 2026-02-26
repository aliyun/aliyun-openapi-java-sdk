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
public class UpdateRegistrationPolicyRequest extends RpcAcsRequest<UpdateRegistrationPolicyResponse> {
	   

	private String description;

	private String matchMode;

	private String policyId;

	@SerializedName("companyLimitCount")
	private CompanyLimitCount companyLimitCount;

	@SerializedName("personalLimitCount")
	private PersonalLimitCount personalLimitCount;

	private List<String> userGroupIds;

	private List<String> whitelist;

	private Long priority;

	private String personalLimitType;

	private String name;

	private String companyLimitType;

	private String status;
	public UpdateRegistrationPolicyRequest() {
		super("csas", "2023-01-20", "UpdateRegistrationPolicy");
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

	public String getMatchMode() {
		return this.matchMode;
	}

	public void setMatchMode(String matchMode) {
		this.matchMode = matchMode;
		if(matchMode != null){
			putBodyParameter("MatchMode", matchMode);
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

	public CompanyLimitCount getCompanyLimitCount() {
		return this.companyLimitCount;
	}

	public void setCompanyLimitCount(CompanyLimitCount companyLimitCount) {
		this.companyLimitCount = companyLimitCount;	
		if (companyLimitCount != null) {
			putBodyParameter("CompanyLimitCount" , new Gson().toJson(companyLimitCount));
		}	
	}

	public PersonalLimitCount getPersonalLimitCount() {
		return this.personalLimitCount;
	}

	public void setPersonalLimitCount(PersonalLimitCount personalLimitCount) {
		this.personalLimitCount = personalLimitCount;	
		if (personalLimitCount != null) {
			putBodyParameter("PersonalLimitCount" , new Gson().toJson(personalLimitCount));
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

	public List<String> getWhitelist() {
		return this.whitelist;
	}

	public void setWhitelist(List<String> whitelist) {
		this.whitelist = whitelist;	
		if (whitelist != null) {
			for (int depth1 = 0; depth1 < whitelist.size(); depth1++) {
				putBodyParameter("Whitelist." + (depth1 + 1) , whitelist.get(depth1));
			}
		}	
	}

	public Long getPriority() {
		return this.priority;
	}

	public void setPriority(Long priority) {
		this.priority = priority;
		if(priority != null){
			putBodyParameter("Priority", priority.toString());
		}
	}

	public String getPersonalLimitType() {
		return this.personalLimitType;
	}

	public void setPersonalLimitType(String personalLimitType) {
		this.personalLimitType = personalLimitType;
		if(personalLimitType != null){
			putBodyParameter("PersonalLimitType", personalLimitType);
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

	public String getCompanyLimitType() {
		return this.companyLimitType;
	}

	public void setCompanyLimitType(String companyLimitType) {
		this.companyLimitType = companyLimitType;
		if(companyLimitType != null){
			putBodyParameter("CompanyLimitType", companyLimitType);
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

	public static class CompanyLimitCount {

		@SerializedName("All")
		private Integer all;

		@SerializedName("PC")
		private Integer pC;

		@SerializedName("Mobile")
		private Integer mobile;

		public Integer getAll() {
			return this.all;
		}

		public void setAll(Integer all) {
			this.all = all;
		}

		public Integer getPC() {
			return this.pC;
		}

		public void setPC(Integer pC) {
			this.pC = pC;
		}

		public Integer getMobile() {
			return this.mobile;
		}

		public void setMobile(Integer mobile) {
			this.mobile = mobile;
		}
	}

	public static class PersonalLimitCount {

		@SerializedName("All")
		private Integer all;

		@SerializedName("PC")
		private Integer pC;

		@SerializedName("Mobile")
		private Integer mobile;

		public Integer getAll() {
			return this.all;
		}

		public void setAll(Integer all) {
			this.all = all;
		}

		public Integer getPC() {
			return this.pC;
		}

		public void setPC(Integer pC) {
			this.pC = pC;
		}

		public Integer getMobile() {
			return this.mobile;
		}

		public void setMobile(Integer mobile) {
			this.mobile = mobile;
		}
	}

	@Override
	public Class<UpdateRegistrationPolicyResponse> getResponseClass() {
		return UpdateRegistrationPolicyResponse.class;
	}

}
