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

package com.aliyuncs.domain.model.v20180129;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.domain.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryDomainListRequest extends RpcAcsRequest<QueryDomainListResponse> {
	   

	private String productDomainType;

	private String orderKeyType;

	private Integer pageNum;

	private String orderByType;

	private Integer pageSize;

	private String lang;

	private String queryType;

	private Long endExpirationDate;

	private String domainName;

	private Long startExpirationDate;

	private String domainGroupId;

	private Long endRegistrationDate;

	private String userClientIp;

	private Long startRegistrationDate;
	public QueryDomainListRequest() {
		super("Domain", "2018-01-29", "QueryDomainList", "domain");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProductDomainType() {
		return this.productDomainType;
	}

	public void setProductDomainType(String productDomainType) {
		this.productDomainType = productDomainType;
		if(productDomainType != null){
			putQueryParameter("ProductDomainType", productDomainType);
		}
	}

	public String getOrderKeyType() {
		return this.orderKeyType;
	}

	public void setOrderKeyType(String orderKeyType) {
		this.orderKeyType = orderKeyType;
		if(orderKeyType != null){
			putQueryParameter("OrderKeyType", orderKeyType);
		}
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
		if(pageNum != null){
			putQueryParameter("PageNum", pageNum.toString());
		}
	}

	public String getOrderByType() {
		return this.orderByType;
	}

	public void setOrderByType(String orderByType) {
		this.orderByType = orderByType;
		if(orderByType != null){
			putQueryParameter("OrderByType", orderByType);
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

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public String getQueryType() {
		return this.queryType;
	}

	public void setQueryType(String queryType) {
		this.queryType = queryType;
		if(queryType != null){
			putQueryParameter("QueryType", queryType);
		}
	}

	public Long getEndExpirationDate() {
		return this.endExpirationDate;
	}

	public void setEndExpirationDate(Long endExpirationDate) {
		this.endExpirationDate = endExpirationDate;
		if(endExpirationDate != null){
			putQueryParameter("EndExpirationDate", endExpirationDate.toString());
		}
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putQueryParameter("DomainName", domainName);
		}
	}

	public Long getStartExpirationDate() {
		return this.startExpirationDate;
	}

	public void setStartExpirationDate(Long startExpirationDate) {
		this.startExpirationDate = startExpirationDate;
		if(startExpirationDate != null){
			putQueryParameter("StartExpirationDate", startExpirationDate.toString());
		}
	}

	public String getDomainGroupId() {
		return this.domainGroupId;
	}

	public void setDomainGroupId(String domainGroupId) {
		this.domainGroupId = domainGroupId;
		if(domainGroupId != null){
			putQueryParameter("DomainGroupId", domainGroupId);
		}
	}

	public Long getEndRegistrationDate() {
		return this.endRegistrationDate;
	}

	public void setEndRegistrationDate(Long endRegistrationDate) {
		this.endRegistrationDate = endRegistrationDate;
		if(endRegistrationDate != null){
			putQueryParameter("EndRegistrationDate", endRegistrationDate.toString());
		}
	}

	public String getUserClientIp() {
		return this.userClientIp;
	}

	public void setUserClientIp(String userClientIp) {
		this.userClientIp = userClientIp;
		if(userClientIp != null){
			putQueryParameter("UserClientIp", userClientIp);
		}
	}

	public Long getStartRegistrationDate() {
		return this.startRegistrationDate;
	}

	public void setStartRegistrationDate(Long startRegistrationDate) {
		this.startRegistrationDate = startRegistrationDate;
		if(startRegistrationDate != null){
			putQueryParameter("StartRegistrationDate", startRegistrationDate.toString());
		}
	}

	@Override
	public Class<QueryDomainListResponse> getResponseClass() {
		return QueryDomainListResponse.class;
	}

}
