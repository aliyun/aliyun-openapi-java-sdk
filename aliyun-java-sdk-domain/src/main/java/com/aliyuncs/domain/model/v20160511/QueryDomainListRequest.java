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

	private String userClientIp;

	private String lang;

	private String groupId;

	private String startDate;

	private String endDate;

	private String domainName;

	private String orderByType;

	private String orderKeyType;

	private String domainType;

	private Integer pageNum;

	private Integer pageSize;

	public String getUserClientIp() {
		return this.userClientIp;
	}

	public void setUserClientIp(String userClientIp) {
		this.userClientIp = userClientIp;
		putQueryParameter("UserClientIp", userClientIp);
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		putQueryParameter("Lang", lang);
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		putQueryParameter("GroupId", groupId);
	}

	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
		putQueryParameter("StartDate", startDate);
	}

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
		putQueryParameter("EndDate", endDate);
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		putQueryParameter("DomainName", domainName);
	}

	public String getOrderByType() {
		return this.orderByType;
	}

	public void setOrderByType(String orderByType) {
		this.orderByType = orderByType;
		putQueryParameter("OrderByType", orderByType);
	}

	public String getOrderKeyType() {
		return this.orderKeyType;
	}

	public void setOrderKeyType(String orderKeyType) {
		this.orderKeyType = orderKeyType;
		putQueryParameter("OrderKeyType", orderKeyType);
	}

	public String getDomainType() {
		return this.domainType;
	}

	public void setDomainType(String domainType) {
		this.domainType = domainType;
		putQueryParameter("DomainType", domainType);
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
		putQueryParameter("PageNum", pageNum);
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		putQueryParameter("PageSize", pageSize);
	}

	@Override
	public Class<QueryDomainListResponse> getResponseClass() {
		return QueryDomainListResponse.class;
	}

}
