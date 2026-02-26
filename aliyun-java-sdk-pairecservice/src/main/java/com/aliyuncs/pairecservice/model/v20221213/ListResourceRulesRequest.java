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

package com.aliyuncs.pairecservice.model.v20221213;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListResourceRulesRequest extends RoaAcsRequest<ListResourceRulesResponse> {
	   

	private Boolean all;

	private String resourceRuleName;

	private String resourceRuleId;

	private Long pageNumber;

	private String instanceId;

	private Long pageSize;

	private String sortBy;

	private String order;
	public ListResourceRulesRequest() {
		super("PaiRecService", "2022-12-13", "ListResourceRules");
		setUriPattern("/api/v1/resourcerules");
		setMethod(MethodType.GET);
	}

	public Boolean getAll() {
		return this.all;
	}

	public void setAll(Boolean all) {
		this.all = all;
		if(all != null){
			putQueryParameter("All", all.toString());
		}
	}

	public String getResourceRuleName() {
		return this.resourceRuleName;
	}

	public void setResourceRuleName(String resourceRuleName) {
		this.resourceRuleName = resourceRuleName;
		if(resourceRuleName != null){
			putQueryParameter("ResourceRuleName", resourceRuleName);
		}
	}

	public String getResourceRuleId() {
		return this.resourceRuleId;
	}

	public void setResourceRuleId(String resourceRuleId) {
		this.resourceRuleId = resourceRuleId;
		if(resourceRuleId != null){
			putQueryParameter("ResourceRuleId", resourceRuleId);
		}
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
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

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getSortBy() {
		return this.sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
		if(sortBy != null){
			putQueryParameter("SortBy", sortBy);
		}
	}

	public String getOrder() {
		return this.order;
	}

	public void setOrder(String order) {
		this.order = order;
		if(order != null){
			putQueryParameter("Order", order);
		}
	}

	@Override
	public Class<ListResourceRulesResponse> getResponseClass() {
		return ListResourceRulesResponse.class;
	}

}
