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

package com.aliyuncs.agency.model.v20180328;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.agency.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryFxCustomerRelationListRequest extends RpcAcsRequest<QueryFxCustomerRelationListResponse> {
	   

	private Long uid;

	private String gmtCreateMax;

	private String gmtCreateMin;

	private Integer level;

	private Integer isDistribution;

	private Integer customerRebateType;

	private Integer pageSize;

	private Long parentId1;

	private Integer currentPage;

	private Long parentId2;

	private Integer isRebateAgent;

	private Long parentId;
	public QueryFxCustomerRelationListRequest() {
		super("Agency", "2018-03-28", "QueryFxCustomerRelationList", "openApi");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getUid() {
		return this.uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
		if(uid != null){
			putQueryParameter("Uid", uid.toString());
		}
	}

	public String getGmtCreateMax() {
		return this.gmtCreateMax;
	}

	public void setGmtCreateMax(String gmtCreateMax) {
		this.gmtCreateMax = gmtCreateMax;
		if(gmtCreateMax != null){
			putQueryParameter("GmtCreateMax", gmtCreateMax);
		}
	}

	public String getGmtCreateMin() {
		return this.gmtCreateMin;
	}

	public void setGmtCreateMin(String gmtCreateMin) {
		this.gmtCreateMin = gmtCreateMin;
		if(gmtCreateMin != null){
			putQueryParameter("GmtCreateMin", gmtCreateMin);
		}
	}

	public Integer getLevel() {
		return this.level;
	}

	public void setLevel(Integer level) {
		this.level = level;
		if(level != null){
			putQueryParameter("Level", level.toString());
		}
	}

	public Integer getIsDistribution() {
		return this.isDistribution;
	}

	public void setIsDistribution(Integer isDistribution) {
		this.isDistribution = isDistribution;
		if(isDistribution != null){
			putQueryParameter("IsDistribution", isDistribution.toString());
		}
	}

	public Integer getCustomerRebateType() {
		return this.customerRebateType;
	}

	public void setCustomerRebateType(Integer customerRebateType) {
		this.customerRebateType = customerRebateType;
		if(customerRebateType != null){
			putQueryParameter("CustomerRebateType", customerRebateType.toString());
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

	public Long getParentId1() {
		return this.parentId1;
	}

	public void setParentId1(Long parentId1) {
		this.parentId1 = parentId1;
		if(parentId1 != null){
			putQueryParameter("ParentId1", parentId1.toString());
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

	public Long getParentId2() {
		return this.parentId2;
	}

	public void setParentId2(Long parentId2) {
		this.parentId2 = parentId2;
		if(parentId2 != null){
			putQueryParameter("ParentId2", parentId2.toString());
		}
	}

	public Integer getIsRebateAgent() {
		return this.isRebateAgent;
	}

	public void setIsRebateAgent(Integer isRebateAgent) {
		this.isRebateAgent = isRebateAgent;
		if(isRebateAgent != null){
			putQueryParameter("IsRebateAgent", isRebateAgent.toString());
		}
	}

	public Long getParentId() {
		return this.parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
		if(parentId != null){
			putQueryParameter("ParentId", parentId.toString());
		}
	}

	@Override
	public Class<QueryFxCustomerRelationListResponse> getResponseClass() {
		return QueryFxCustomerRelationListResponse.class;
	}

}
