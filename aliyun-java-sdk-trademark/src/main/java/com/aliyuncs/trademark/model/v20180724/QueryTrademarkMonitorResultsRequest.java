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

package com.aliyuncs.trademark.model.v20180724;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.trademark.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryTrademarkMonitorResultsRequest extends RpcAcsRequest<QueryTrademarkMonitorResultsResponse> {
	   

	private Integer actionType;

	private String tmName;

	private String classification;

	private Integer pageNum;

	private String registrationNumber;

	private String applyYear;

	private Integer pageSize;

	private Integer procedureStatus;

	private Long ruleId;
	public QueryTrademarkMonitorResultsRequest() {
		super("Trademark", "2018-07-24", "QueryTrademarkMonitorResults");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getActionType() {
		return this.actionType;
	}

	public void setActionType(Integer actionType) {
		this.actionType = actionType;
		if(actionType != null){
			putQueryParameter("ActionType", actionType.toString());
		}
	}

	public String getTmName() {
		return this.tmName;
	}

	public void setTmName(String tmName) {
		this.tmName = tmName;
		if(tmName != null){
			putQueryParameter("TmName", tmName);
		}
	}

	public String getClassification() {
		return this.classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
		if(classification != null){
			putQueryParameter("Classification", classification);
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

	public String getRegistrationNumber() {
		return this.registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
		if(registrationNumber != null){
			putQueryParameter("RegistrationNumber", registrationNumber);
		}
	}

	public String getApplyYear() {
		return this.applyYear;
	}

	public void setApplyYear(String applyYear) {
		this.applyYear = applyYear;
		if(applyYear != null){
			putQueryParameter("ApplyYear", applyYear);
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

	public Integer getProcedureStatus() {
		return this.procedureStatus;
	}

	public void setProcedureStatus(Integer procedureStatus) {
		this.procedureStatus = procedureStatus;
		if(procedureStatus != null){
			putQueryParameter("ProcedureStatus", procedureStatus.toString());
		}
	}

	public Long getRuleId() {
		return this.ruleId;
	}

	public void setRuleId(Long ruleId) {
		this.ruleId = ruleId;
		if(ruleId != null){
			putQueryParameter("RuleId", ruleId.toString());
		}
	}

	@Override
	public Class<QueryTrademarkMonitorResultsResponse> getResponseClass() {
		return QueryTrademarkMonitorResultsResponse.class;
	}

}
