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

package com.aliyuncs.agency.model.v20180703;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.agency.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetCustomerListRequest extends RpcAcsRequest<GetCustomerListResponse> {
	   

	private Long ramUid;

	private String start;

	private Integer currentPage;

	private Integer customerStatus;

	private Long aliyunPk;

	private String customerGcLevel;

	private String customerAccount;

	private Integer pageSize;

	private String end;

	private String customerName;
	public GetCustomerListRequest() {
		super("Agency", "2018-07-03", "GetCustomerList", "openApi");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getRamUid() {
		return this.ramUid;
	}

	public void setRamUid(Long ramUid) {
		this.ramUid = ramUid;
		if(ramUid != null){
			putQueryParameter("RamUid", ramUid.toString());
		}
	}

	public String getStart() {
		return this.start;
	}

	public void setStart(String start) {
		this.start = start;
		if(start != null){
			putQueryParameter("Start", start);
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

	public Integer getCustomerStatus() {
		return this.customerStatus;
	}

	public void setCustomerStatus(Integer customerStatus) {
		this.customerStatus = customerStatus;
		if(customerStatus != null){
			putQueryParameter("CustomerStatus", customerStatus.toString());
		}
	}

	public Long getAliyunPk() {
		return this.aliyunPk;
	}

	public void setAliyunPk(Long aliyunPk) {
		this.aliyunPk = aliyunPk;
		if(aliyunPk != null){
			putQueryParameter("AliyunPk", aliyunPk.toString());
		}
	}

	public String getCustomerGcLevel() {
		return this.customerGcLevel;
	}

	public void setCustomerGcLevel(String customerGcLevel) {
		this.customerGcLevel = customerGcLevel;
		if(customerGcLevel != null){
			putQueryParameter("CustomerGcLevel", customerGcLevel);
		}
	}

	public String getCustomerAccount() {
		return this.customerAccount;
	}

	public void setCustomerAccount(String customerAccount) {
		this.customerAccount = customerAccount;
		if(customerAccount != null){
			putQueryParameter("CustomerAccount", customerAccount);
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

	public String getEnd() {
		return this.end;
	}

	public void setEnd(String end) {
		this.end = end;
		if(end != null){
			putQueryParameter("End", end);
		}
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
		if(customerName != null){
			putQueryParameter("CustomerName", customerName);
		}
	}

	@Override
	public Class<GetCustomerListResponse> getResponseClass() {
		return GetCustomerListResponse.class;
	}

}
