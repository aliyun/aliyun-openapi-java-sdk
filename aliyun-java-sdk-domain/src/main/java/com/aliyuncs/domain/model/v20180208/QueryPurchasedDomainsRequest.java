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

package com.aliyuncs.domain.model.v20180208;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.domain.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryPurchasedDomainsRequest extends RpcAcsRequest<QueryPurchasedDomainsResponse> {
	   

	private Boolean updateTimeOrder;

	private String domainName;

	private Integer currentPage;

	private Integer productType;

	private Integer operationStatus;

	private String startOperationTime;

	private Integer pageSize;

	private String endOperationTime;

	private Boolean opTimeOrder;
	public QueryPurchasedDomainsRequest() {
		super("Domain", "2018-02-08", "QueryPurchasedDomains", "domain");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getUpdateTimeOrder() {
		return this.updateTimeOrder;
	}

	public void setUpdateTimeOrder(Boolean updateTimeOrder) {
		this.updateTimeOrder = updateTimeOrder;
		if(updateTimeOrder != null){
			putBodyParameter("UpdateTimeOrder", updateTimeOrder.toString());
		}
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putBodyParameter("DomainName", domainName);
		}
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putBodyParameter("CurrentPage", currentPage.toString());
		}
	}

	public Integer getProductType() {
		return this.productType;
	}

	public void setProductType(Integer productType) {
		this.productType = productType;
		if(productType != null){
			putBodyParameter("ProductType", productType.toString());
		}
	}

	public Integer getOperationStatus() {
		return this.operationStatus;
	}

	public void setOperationStatus(Integer operationStatus) {
		this.operationStatus = operationStatus;
		if(operationStatus != null){
			putBodyParameter("OperationStatus", operationStatus.toString());
		}
	}

	public String getStartOperationTime() {
		return this.startOperationTime;
	}

	public void setStartOperationTime(String startOperationTime) {
		this.startOperationTime = startOperationTime;
		if(startOperationTime != null){
			putBodyParameter("StartOperationTime", startOperationTime);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getEndOperationTime() {
		return this.endOperationTime;
	}

	public void setEndOperationTime(String endOperationTime) {
		this.endOperationTime = endOperationTime;
		if(endOperationTime != null){
			putBodyParameter("EndOperationTime", endOperationTime);
		}
	}

	public Boolean getOpTimeOrder() {
		return this.opTimeOrder;
	}

	public void setOpTimeOrder(Boolean opTimeOrder) {
		this.opTimeOrder = opTimeOrder;
		if(opTimeOrder != null){
			putBodyParameter("OpTimeOrder", opTimeOrder.toString());
		}
	}

	@Override
	public Class<QueryPurchasedDomainsResponse> getResponseClass() {
		return QueryPurchasedDomainsResponse.class;
	}

}
