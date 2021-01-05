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

package com.aliyuncs.scsp.model.v20200702;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.scsp.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryRingDetailListRequest extends RpcAcsRequest<QueryRingDetailListResponse> {
	   

	private String fromPhoneNumList;

	private String callOutStatus;

	private Long startDate;

	private Long endDate;

	private String instanceId;

	private Integer pageNo;

	private String extra;

	private Integer pageSize;

	private String toPhoneNumList;
	public QueryRingDetailListRequest() {
		super("scsp", "2020-07-02", "QueryRingDetailList", "scsp");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFromPhoneNumList() {
		return this.fromPhoneNumList;
	}

	public void setFromPhoneNumList(String fromPhoneNumList) {
		this.fromPhoneNumList = fromPhoneNumList;
		if(fromPhoneNumList != null){
			putBodyParameter("FromPhoneNumList", fromPhoneNumList);
		}
	}

	public String getCallOutStatus() {
		return this.callOutStatus;
	}

	public void setCallOutStatus(String callOutStatus) {
		this.callOutStatus = callOutStatus;
		if(callOutStatus != null){
			putBodyParameter("CallOutStatus", callOutStatus);
		}
	}

	public Long getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Long startDate) {
		this.startDate = startDate;
		if(startDate != null){
			putBodyParameter("StartDate", startDate.toString());
		}
	}

	public Long getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Long endDate) {
		this.endDate = endDate;
		if(endDate != null){
			putBodyParameter("EndDate", endDate.toString());
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
		if(pageNo != null){
			putBodyParameter("PageNo", pageNo.toString());
		}
	}

	public String getExtra() {
		return this.extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
		if(extra != null){
			putBodyParameter("Extra", extra);
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

	public String getToPhoneNumList() {
		return this.toPhoneNumList;
	}

	public void setToPhoneNumList(String toPhoneNumList) {
		this.toPhoneNumList = toPhoneNumList;
		if(toPhoneNumList != null){
			putBodyParameter("ToPhoneNumList", toPhoneNumList);
		}
	}

	@Override
	public Class<QueryRingDetailListResponse> getResponseClass() {
		return QueryRingDetailListResponse.class;
	}

}
