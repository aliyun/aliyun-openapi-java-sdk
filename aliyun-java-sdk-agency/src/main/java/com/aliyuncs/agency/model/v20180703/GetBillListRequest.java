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
public class GetBillListRequest extends RpcAcsRequest<GetBillListResponse> {
	   

	private Long ramUid;

	private Integer isStronger;

	private Integer currentPage;

	private String startDate;

	private Long aliyunPk;

	private String instId;

	private String endDate;

	private Long payStatus;

	private Integer pageSize;
	public GetBillListRequest() {
		super("Agency", "2018-07-03", "GetBillList", "openApi");
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

	public Integer getIsStronger() {
		return this.isStronger;
	}

	public void setIsStronger(Integer isStronger) {
		this.isStronger = isStronger;
		if(isStronger != null){
			putQueryParameter("IsStronger", isStronger.toString());
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

	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
		if(startDate != null){
			putQueryParameter("StartDate", startDate);
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

	public String getInstId() {
		return this.instId;
	}

	public void setInstId(String instId) {
		this.instId = instId;
		if(instId != null){
			putQueryParameter("InstId", instId);
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

	public Long getPayStatus() {
		return this.payStatus;
	}

	public void setPayStatus(Long payStatus) {
		this.payStatus = payStatus;
		if(payStatus != null){
			putQueryParameter("PayStatus", payStatus.toString());
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

	@Override
	public Class<GetBillListResponse> getResponseClass() {
		return GetBillListResponse.class;
	}

}
