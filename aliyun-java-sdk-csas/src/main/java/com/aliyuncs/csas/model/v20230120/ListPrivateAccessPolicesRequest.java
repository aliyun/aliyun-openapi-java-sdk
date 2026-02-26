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
public class ListPrivateAccessPolicesRequest extends RpcAcsRequest<ListPrivateAccessPolicesResponse> {
	   

	private List<String> policyIds;

	private String tagName;

	private Integer pageSize;

	private String applicationId;

	private String tagId;

	private String userGroupId;

	private Integer currentPage;

	private String policyAction;

	private String applicationName;

	private String name;

	private String status;
	public ListPrivateAccessPolicesRequest() {
		super("csas", "2023-01-20", "ListPrivateAccessPolices");
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

	public String getTagName() {
		return this.tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
		if(tagName != null){
			putQueryParameter("TagName", tagName);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
		if(applicationId != null){
			putQueryParameter("ApplicationId", applicationId);
		}
	}

	public String getTagId() {
		return this.tagId;
	}

	public void setTagId(String tagId) {
		this.tagId = tagId;
		if(tagId != null){
			putQueryParameter("TagId", tagId);
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

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	public String getPolicyAction() {
		return this.policyAction;
	}

	public void setPolicyAction(String policyAction) {
		this.policyAction = policyAction;
		if(policyAction != null){
			putQueryParameter("PolicyAction", policyAction);
		}
	}

	public String getApplicationName() {
		return this.applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
		if(applicationName != null){
			putQueryParameter("ApplicationName", applicationName);
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
	public Class<ListPrivateAccessPolicesResponse> getResponseClass() {
		return ListPrivateAccessPolicesResponse.class;
	}

}
