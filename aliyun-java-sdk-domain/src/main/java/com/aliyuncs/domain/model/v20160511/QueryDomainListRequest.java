/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.domain.model.v20160511;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class QueryDomainListRequest extends RpcAcsRequest<QueryDomainListResponse> {
	
	public QueryDomainListRequest() {
		super("Domain", "2016-05-11", "QueryDomainList");
	}

	private String productDomainType;

	private Long regStartDate;

	private String orderKeyType;

	private String groupId;

	private Long deadEndDate;

	private String domainName;

	private String startDate;

	private Integer pageNum;

	private String orderByType;

	private Long regEndDate;

	private String endDate;

	private String domainType;

	private Long deadStartDate;

	private String userClientIp;

	private Integer pageSize;

	private String lang;

	private String queryType;

	public String getProductDomainType() {
		return this.productDomainType;
	}

	public void setProductDomainType(String productDomainType) {
		this.productDomainType = productDomainType;
		if(productDomainType != null){
			putQueryParameter("ProductDomainType", productDomainType);
		}
	}

	public Long getRegStartDate() {
		return this.regStartDate;
	}

	public void setRegStartDate(Long regStartDate) {
		this.regStartDate = regStartDate;
		if(regStartDate != null){
			putQueryParameter("RegStartDate", regStartDate.toString());
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

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId);
		}
	}

	public Long getDeadEndDate() {
		return this.deadEndDate;
	}

	public void setDeadEndDate(Long deadEndDate) {
		this.deadEndDate = deadEndDate;
		if(deadEndDate != null){
			putQueryParameter("DeadEndDate", deadEndDate.toString());
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

	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
		if(startDate != null){
			putQueryParameter("StartDate", startDate);
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

	public Long getRegEndDate() {
		return this.regEndDate;
	}

	public void setRegEndDate(Long regEndDate) {
		this.regEndDate = regEndDate;
		if(regEndDate != null){
			putQueryParameter("RegEndDate", regEndDate.toString());
		}
	}

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
		if(endDate != null){
			putQueryParameter("EndDate", endDate);
		}
	}

	public String getDomainType() {
		return this.domainType;
	}

	public void setDomainType(String domainType) {
		this.domainType = domainType;
		if(domainType != null){
			putQueryParameter("DomainType", domainType);
		}
	}

	public Long getDeadStartDate() {
		return this.deadStartDate;
	}

	public void setDeadStartDate(Long deadStartDate) {
		this.deadStartDate = deadStartDate;
		if(deadStartDate != null){
			putQueryParameter("DeadStartDate", deadStartDate.toString());
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

	@Override
	public Class<QueryDomainListResponse> getResponseClass() {
		return QueryDomainListResponse.class;
	}

}
