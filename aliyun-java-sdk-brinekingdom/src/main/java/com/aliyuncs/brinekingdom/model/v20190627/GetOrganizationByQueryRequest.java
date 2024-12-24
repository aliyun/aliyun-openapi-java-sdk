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

package com.aliyuncs.brinekingdom.model.v20190627;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetOrganizationByQueryRequest extends RpcAcsRequest<GetOrganizationByQueryResponse> {
	   

	private String division;

	private String requireType;

	private String orgName;

	private Integer offset;

	private String product2;

	private Integer pageSize;

	private String product1;

	private Integer currentPage;

	private Long id;

	private String businessType;

	private String order;
	public GetOrganizationByQueryRequest() {
		super("brinekingdom", "2019-06-27", "GetOrganizationByQuery");
		setMethod(MethodType.POST);
	}

	public String getDivision() {
		return this.division;
	}

	public void setDivision(String division) {
		this.division = division;
		if(division != null){
			putQueryParameter("Division", division);
		}
	}

	public String getRequireType() {
		return this.requireType;
	}

	public void setRequireType(String requireType) {
		this.requireType = requireType;
		if(requireType != null){
			putQueryParameter("RequireType", requireType);
		}
	}

	public String getOrgName() {
		return this.orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
		if(orgName != null){
			putQueryParameter("OrgName", orgName);
		}
	}

	public Integer getOffset() {
		return this.offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
		if(offset != null){
			putQueryParameter("Offset", offset.toString());
		}
	}

	public String getProduct2() {
		return this.product2;
	}

	public void setProduct2(String product2) {
		this.product2 = product2;
		if(product2 != null){
			putQueryParameter("Product2", product2);
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

	public String getProduct1() {
		return this.product1;
	}

	public void setProduct1(String product1) {
		this.product1 = product1;
		if(product1 != null){
			putQueryParameter("Product1", product1);
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

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
		}
	}

	public String getBusinessType() {
		return this.businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
		if(businessType != null){
			putQueryParameter("BusinessType", businessType);
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
	public Class<GetOrganizationByQueryResponse> getResponseClass() {
		return GetOrganizationByQueryResponse.class;
	}

}
