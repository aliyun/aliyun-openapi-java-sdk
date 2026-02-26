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

package com.aliyuncs.eds_user.model.v20210308;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.eds_user.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeUsersRequest extends RpcAcsRequest<DescribeUsersResponse> {
	   

	private Boolean isQueryAllSubOrgs;

	private List<String> endUserIdss;

	private List<String> excludeEndUserIdss;

	private String nextToken;

	private String solutionId;

	@SerializedName("filterWithAssignedResources")
	private Map<String,Boolean> filterWithAssignedResources;

	private String groupId;

	private String orgId;

	@SerializedName("filterWithAssignedResource")
	private Map<String,String> filterWithAssignedResource;

	private String filter;

	private String bizType;

	private Long maxResults;

	@SerializedName("showExtras")
	private Map<String,Object> showExtras;

	private Integer status;
	public DescribeUsersRequest() {
		super("eds-user", "2021-03-08", "DescribeUsers", "eds-user");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getIsQueryAllSubOrgs() {
		return this.isQueryAllSubOrgs;
	}

	public void setIsQueryAllSubOrgs(Boolean isQueryAllSubOrgs) {
		this.isQueryAllSubOrgs = isQueryAllSubOrgs;
		if(isQueryAllSubOrgs != null){
			putBodyParameter("IsQueryAllSubOrgs", isQueryAllSubOrgs.toString());
		}
	}

	public List<String> getEndUserIdss() {
		return this.endUserIdss;
	}

	public void setEndUserIdss(List<String> endUserIdss) {
		this.endUserIdss = endUserIdss;	
		if (endUserIdss != null) {
			for (int i = 0; i < endUserIdss.size(); i++) {
				putBodyParameter("EndUserIds." + (i + 1) , endUserIdss.get(i));
			}
		}	
	}

	public List<String> getExcludeEndUserIdss() {
		return this.excludeEndUserIdss;
	}

	public void setExcludeEndUserIdss(List<String> excludeEndUserIdss) {
		this.excludeEndUserIdss = excludeEndUserIdss;	
		if (excludeEndUserIdss != null) {
			for (int i = 0; i < excludeEndUserIdss.size(); i++) {
				putBodyParameter("ExcludeEndUserIds." + (i + 1) , excludeEndUserIdss.get(i));
			}
		}	
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public String getSolutionId() {
		return this.solutionId;
	}

	public void setSolutionId(String solutionId) {
		this.solutionId = solutionId;
		if(solutionId != null){
			putBodyParameter("SolutionId", solutionId);
		}
	}

	public Map<String,Boolean> getFilterWithAssignedResources() {
		return this.filterWithAssignedResources;
	}

	public void setFilterWithAssignedResources(Map<String,Boolean> filterWithAssignedResources) {
		this.filterWithAssignedResources = filterWithAssignedResources;	
		if (filterWithAssignedResources != null) {
			putBodyParameter("FilterWithAssignedResources" , new Gson().toJson(filterWithAssignedResources));
		}	
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putBodyParameter("GroupId", groupId);
		}
	}

	public String getOrgId() {
		return this.orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
		if(orgId != null){
			putBodyParameter("OrgId", orgId);
		}
	}

	public Map<String,String> getFilterWithAssignedResource() {
		return this.filterWithAssignedResource;
	}

	public void setFilterWithAssignedResource(Map<String,String> filterWithAssignedResource) {
		this.filterWithAssignedResource = filterWithAssignedResource;	
		if (filterWithAssignedResource != null) {
			putQueryParameter("FilterWithAssignedResource" , new Gson().toJson(filterWithAssignedResource));
		}	
	}

	public String getFilter() {
		return this.filter;
	}

	public void setFilter(String filter) {
		this.filter = filter;
		if(filter != null){
			putQueryParameter("Filter", filter);
		}
	}

	public String getBizType() {
		return this.bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
		if(bizType != null){
			putBodyParameter("BizType", bizType);
		}
	}

	public Long getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Long maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	public Map<String,Object> getShowExtras() {
		return this.showExtras;
	}

	public void setShowExtras(Map<String,Object> showExtras) {
		this.showExtras = showExtras;	
		if (showExtras != null) {
			putBodyParameter("ShowExtras" , new Gson().toJson(showExtras));
		}	
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status.toString());
		}
	}

	@Override
	public Class<DescribeUsersResponse> getResponseClass() {
		return DescribeUsersResponse.class;
	}

}
