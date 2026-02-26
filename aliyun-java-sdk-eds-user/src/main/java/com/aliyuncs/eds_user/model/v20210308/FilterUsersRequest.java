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
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.eds_user.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class FilterUsersRequest extends RpcAcsRequest<FilterUsersResponse> {
	   

	private Boolean isQueryAllSubOrgs;

	@SerializedName("orderParam")
	private OrderParam orderParam;

	private List<String> excludeEndUserIdss;

	private String nextToken;

	private Boolean includeDesktopCount;

	private Boolean includeSupportIdps;

	private List<PropertyFilterParam> propertyFilterParams;

	private Boolean includeOrgInfo;

	private Boolean includeDesktopGroupCount;

	private String orgId;

	private String filter;

	private List<PropertyKeyValueFilterParam> propertyKeyValueFilterParams;

	private String ownerType;

	private Long maxResults;

	private Integer status;
	public FilterUsersRequest() {
		super("eds-user", "2021-03-08", "FilterUsers", "eds-user");
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
			putQueryParameter("IsQueryAllSubOrgs", isQueryAllSubOrgs.toString());
		}
	}

	public OrderParam getOrderParam() {
		return this.orderParam;
	}

	public void setOrderParam(OrderParam orderParam) {
		this.orderParam = orderParam;	
		if (orderParam != null) {
			putQueryParameter("OrderParam" , new Gson().toJson(orderParam));
		}	
	}

	public List<String> getExcludeEndUserIdss() {
		return this.excludeEndUserIdss;
	}

	public void setExcludeEndUserIdss(List<String> excludeEndUserIdss) {
		this.excludeEndUserIdss = excludeEndUserIdss;	
		if (excludeEndUserIdss != null) {
			for (int i = 0; i < excludeEndUserIdss.size(); i++) {
				putQueryParameter("ExcludeEndUserIds." + (i + 1) , excludeEndUserIdss.get(i));
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

	public Boolean getIncludeDesktopCount() {
		return this.includeDesktopCount;
	}

	public void setIncludeDesktopCount(Boolean includeDesktopCount) {
		this.includeDesktopCount = includeDesktopCount;
		if(includeDesktopCount != null){
			putQueryParameter("IncludeDesktopCount", includeDesktopCount.toString());
		}
	}

	public Boolean getIncludeSupportIdps() {
		return this.includeSupportIdps;
	}

	public void setIncludeSupportIdps(Boolean includeSupportIdps) {
		this.includeSupportIdps = includeSupportIdps;
		if(includeSupportIdps != null){
			putQueryParameter("IncludeSupportIdps", includeSupportIdps.toString());
		}
	}

	public List<PropertyFilterParam> getPropertyFilterParams() {
		return this.propertyFilterParams;
	}

	public void setPropertyFilterParams(List<PropertyFilterParam> propertyFilterParams) {
		this.propertyFilterParams = propertyFilterParams;	
		if (propertyFilterParams != null) {
			for (int depth1 = 0; depth1 < propertyFilterParams.size(); depth1++) {
				putQueryParameter("PropertyFilterParam." + (depth1 + 1) + ".PropertyId" , propertyFilterParams.get(depth1).getPropertyId());
				putQueryParameter("PropertyFilterParam." + (depth1 + 1) + ".PropertyValueIds" , propertyFilterParams.get(depth1).getPropertyValueIds());
			}
		}	
	}

	public Boolean getIncludeOrgInfo() {
		return this.includeOrgInfo;
	}

	public void setIncludeOrgInfo(Boolean includeOrgInfo) {
		this.includeOrgInfo = includeOrgInfo;
		if(includeOrgInfo != null){
			putQueryParameter("IncludeOrgInfo", includeOrgInfo.toString());
		}
	}

	public Boolean getIncludeDesktopGroupCount() {
		return this.includeDesktopGroupCount;
	}

	public void setIncludeDesktopGroupCount(Boolean includeDesktopGroupCount) {
		this.includeDesktopGroupCount = includeDesktopGroupCount;
		if(includeDesktopGroupCount != null){
			putQueryParameter("IncludeDesktopGroupCount", includeDesktopGroupCount.toString());
		}
	}

	public String getOrgId() {
		return this.orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
		if(orgId != null){
			putQueryParameter("OrgId", orgId);
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

	public List<PropertyKeyValueFilterParam> getPropertyKeyValueFilterParams() {
		return this.propertyKeyValueFilterParams;
	}

	public void setPropertyKeyValueFilterParams(List<PropertyKeyValueFilterParam> propertyKeyValueFilterParams) {
		this.propertyKeyValueFilterParams = propertyKeyValueFilterParams;	
		if (propertyKeyValueFilterParams != null) {
			for (int depth1 = 0; depth1 < propertyKeyValueFilterParams.size(); depth1++) {
				putQueryParameter("PropertyKeyValueFilterParam." + (depth1 + 1) + ".PropertyKey" , propertyKeyValueFilterParams.get(depth1).getPropertyKey());
				putQueryParameter("PropertyKeyValueFilterParam." + (depth1 + 1) + ".PropertyValues" , propertyKeyValueFilterParams.get(depth1).getPropertyValues());
			}
		}	
	}

	public String getOwnerType() {
		return this.ownerType;
	}

	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
		if(ownerType != null){
			putQueryParameter("OwnerType", ownerType);
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

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status.toString());
		}
	}

	public static class OrderParam {

		@SerializedName("OrderField")
		private String orderField;

		@SerializedName("OrderType")
		private String orderType;

		public String getOrderField() {
			return this.orderField;
		}

		public void setOrderField(String orderField) {
			this.orderField = orderField;
		}

		public String getOrderType() {
			return this.orderType;
		}

		public void setOrderType(String orderType) {
			this.orderType = orderType;
		}
	}

	public static class PropertyFilterParam {

		private Long propertyId;

		private String propertyValueIds;

		public Long getPropertyId() {
			return this.propertyId;
		}

		public void setPropertyId(Long propertyId) {
			this.propertyId = propertyId;
		}

		public String getPropertyValueIds() {
			return this.propertyValueIds;
		}

		public void setPropertyValueIds(String propertyValueIds) {
			this.propertyValueIds = propertyValueIds;
		}
	}

	public static class PropertyKeyValueFilterParam {

		private String propertyKey;

		private String propertyValues;

		public String getPropertyKey() {
			return this.propertyKey;
		}

		public void setPropertyKey(String propertyKey) {
			this.propertyKey = propertyKey;
		}

		public String getPropertyValues() {
			return this.propertyValues;
		}

		public void setPropertyValues(String propertyValues) {
			this.propertyValues = propertyValues;
		}
	}

	@Override
	public Class<FilterUsersResponse> getResponseClass() {
		return FilterUsersResponse.class;
	}

}
