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
public class ListRegistrationPoliciesRequest extends RpcAcsRequest<ListRegistrationPoliciesResponse> {
	   

	private List<String> policyIds;

	private String matchMode;

	private Long pageSize;

	private String userGroupId;

	private Long currentPage;

	private String personalLimitType;

	private String name;

	private String companyLimitType;

	private String status;
	public ListRegistrationPoliciesRequest() {
		super("csas", "2023-01-20", "ListRegistrationPolicies");
		setMethod(MethodType.GET);
	}

	public List<String> getPolicyIds() {
		return this.policyIds;
	}

	public void setPolicyIds(List<String> policyIds) {
		this.policyIds = policyIds;	
		if (policyIds != null) {
			for (int depth1 = 0; depth1 < policyIds.size(); depth1++) {
				putQueryParameter("PolicyIds." + (depth1 + 1) , policyIds.get(depth1));
			}
		}	
	}

	public String getMatchMode() {
		return this.matchMode;
	}

	public void setMatchMode(String matchMode) {
		this.matchMode = matchMode;
		if(matchMode != null){
			putQueryParameter("MatchMode", matchMode);
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getUserGroupId() {
		return this.userGroupId;
	}

	public void setUserGroupId(String userGroupId) {
		this.userGroupId = userGroupId;
		if(userGroupId != null){
			putQueryParameter("UserGroupId", userGroupId);
		}
	}

	public Long getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	public String getPersonalLimitType() {
		return this.personalLimitType;
	}

	public void setPersonalLimitType(String personalLimitType) {
		this.personalLimitType = personalLimitType;
		if(personalLimitType != null){
			putQueryParameter("PersonalLimitType", personalLimitType);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getCompanyLimitType() {
		return this.companyLimitType;
	}

	public void setCompanyLimitType(String companyLimitType) {
		this.companyLimitType = companyLimitType;
		if(companyLimitType != null){
			putQueryParameter("CompanyLimitType", companyLimitType);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	@Override
	public Class<ListRegistrationPoliciesResponse> getResponseClass() {
		return ListRegistrationPoliciesResponse.class;
	}

}
