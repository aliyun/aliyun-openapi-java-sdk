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

package com.aliyuncs.linkedmall.model.v20180116;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkedmall.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryStatementsRequest extends RpcAcsRequest<QueryStatementsResponse> {
	   

	private String extInfo;

	private String payeeIds;

	private String endTime;

	private String startTime;

	private Integer pageNumber;

	private String settleStatus;

	private String settleType;

	private String tenantId;

	private Integer pageSize;

	private String settleNoes;
	public QueryStatementsRequest() {
		super("linkedmall", "2018-01-16", "QueryStatements", "linkedmall");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getExtInfo() {
		return this.extInfo;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
		if(extInfo != null){
			putQueryParameter("ExtInfo", extInfo);
		}
	}

	public String getPayeeIds() {
		return this.payeeIds;
	}

	public void setPayeeIds(String payeeIds) {
		this.payeeIds = payeeIds;
		if(payeeIds != null){
			putQueryParameter("PayeeIds", payeeIds);
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getSettleStatus() {
		return this.settleStatus;
	}

	public void setSettleStatus(String settleStatus) {
		this.settleStatus = settleStatus;
		if(settleStatus != null){
			putQueryParameter("SettleStatus", settleStatus);
		}
	}

	public String getSettleType() {
		return this.settleType;
	}

	public void setSettleType(String settleType) {
		this.settleType = settleType;
		if(settleType != null){
			putQueryParameter("SettleType", settleType);
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putQueryParameter("TenantId", tenantId);
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

	public String getSettleNoes() {
		return this.settleNoes;
	}

	public void setSettleNoes(String settleNoes) {
		this.settleNoes = settleNoes;
		if(settleNoes != null){
			putQueryParameter("SettleNoes", settleNoes);
		}
	}

	@Override
	public Class<QueryStatementsResponse> getResponseClass() {
		return QueryStatementsResponse.class;
	}

}
