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
package com.aliyuncs.cloudwf.model.v20170328;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ListApStatusRequest extends RpcAcsRequest<ListApStatusResponse> {
	
	public ListApStatusRequest() {
		super("cloudwf", "2017-03-28", "ListApStatus");
	}

	private String orderCol;

	private String searchName;

	private String searchGroupName;

	private Integer searchStatus;

	private String searchWanIp;

	private String searchApModelName;

	private Integer length;

	private String orderDir;

	private Integer searchBssEquals;

	private Long searchSwVersion;

	private String searchCompanyName;

	private String searchMac;

	private Integer pageIndex;

	public String getOrderCol() {
		return this.orderCol;
	}

	public void setOrderCol(String orderCol) {
		this.orderCol = orderCol;
		if(orderCol != null){
			putQueryParameter("OrderCol", orderCol);
		}
	}

	public String getSearchName() {
		return this.searchName;
	}

	public void setSearchName(String searchName) {
		this.searchName = searchName;
		if(searchName != null){
			putQueryParameter("SearchName", searchName);
		}
	}

	public String getSearchGroupName() {
		return this.searchGroupName;
	}

	public void setSearchGroupName(String searchGroupName) {
		this.searchGroupName = searchGroupName;
		if(searchGroupName != null){
			putQueryParameter("SearchGroupName", searchGroupName);
		}
	}

	public Integer getSearchStatus() {
		return this.searchStatus;
	}

	public void setSearchStatus(Integer searchStatus) {
		this.searchStatus = searchStatus;
		if(searchStatus != null){
			putQueryParameter("SearchStatus", searchStatus.toString());
		}
	}

	public String getSearchWanIp() {
		return this.searchWanIp;
	}

	public void setSearchWanIp(String searchWanIp) {
		this.searchWanIp = searchWanIp;
		if(searchWanIp != null){
			putQueryParameter("SearchWanIp", searchWanIp);
		}
	}

	public String getSearchApModelName() {
		return this.searchApModelName;
	}

	public void setSearchApModelName(String searchApModelName) {
		this.searchApModelName = searchApModelName;
		if(searchApModelName != null){
			putQueryParameter("SearchApModelName", searchApModelName);
		}
	}

	public Integer getLength() {
		return this.length;
	}

	public void setLength(Integer length) {
		this.length = length;
		if(length != null){
			putQueryParameter("Length", length.toString());
		}
	}

	public String getOrderDir() {
		return this.orderDir;
	}

	public void setOrderDir(String orderDir) {
		this.orderDir = orderDir;
		if(orderDir != null){
			putQueryParameter("OrderDir", orderDir);
		}
	}

	public Integer getSearchBssEquals() {
		return this.searchBssEquals;
	}

	public void setSearchBssEquals(Integer searchBssEquals) {
		this.searchBssEquals = searchBssEquals;
		if(searchBssEquals != null){
			putQueryParameter("SearchBssEquals", searchBssEquals.toString());
		}
	}

	public Long getSearchSwVersion() {
		return this.searchSwVersion;
	}

	public void setSearchSwVersion(Long searchSwVersion) {
		this.searchSwVersion = searchSwVersion;
		if(searchSwVersion != null){
			putQueryParameter("SearchSwVersion", searchSwVersion.toString());
		}
	}

	public String getSearchCompanyName() {
		return this.searchCompanyName;
	}

	public void setSearchCompanyName(String searchCompanyName) {
		this.searchCompanyName = searchCompanyName;
		if(searchCompanyName != null){
			putQueryParameter("SearchCompanyName", searchCompanyName);
		}
	}

	public String getSearchMac() {
		return this.searchMac;
	}

	public void setSearchMac(String searchMac) {
		this.searchMac = searchMac;
		if(searchMac != null){
			putQueryParameter("SearchMac", searchMac);
		}
	}

	public Integer getPageIndex() {
		return this.pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
		if(pageIndex != null){
			putQueryParameter("PageIndex", pageIndex.toString());
		}
	}

	@Override
	public Class<ListApStatusResponse> getResponseClass() {
		return ListApStatusResponse.class;
	}

}
