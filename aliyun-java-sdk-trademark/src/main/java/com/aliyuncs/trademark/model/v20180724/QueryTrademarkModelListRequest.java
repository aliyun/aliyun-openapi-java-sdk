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
public class QueryTrademarkModelListRequest extends RpcAcsRequest<QueryTrademarkModelListResponse> {
	   

	private String submitTime;

	private String submitStatus;

	private Integer pageNum;

	private String env;

	private String principalKey;

	private Integer pageSize;

	private String produceTypesStr;

	private String principalName;

	private String orderIdsStr;

	private String status;
	public QueryTrademarkModelListRequest() {
		super("Trademark", "2018-07-24", "QueryTrademarkModelList");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSubmitTime() {
		return this.submitTime;
	}

	public void setSubmitTime(String submitTime) {
		this.submitTime = submitTime;
		if(submitTime != null){
			putQueryParameter("SubmitTime", submitTime);
		}
	}

	public String getSubmitStatus() {
		return this.submitStatus;
	}

	public void setSubmitStatus(String submitStatus) {
		this.submitStatus = submitStatus;
		if(submitStatus != null){
			putQueryParameter("SubmitStatus", submitStatus);
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

	public String getEnv() {
		return this.env;
	}

	public void setEnv(String env) {
		this.env = env;
		if(env != null){
			putQueryParameter("Env", env);
		}
	}

	public String getPrincipalKey() {
		return this.principalKey;
	}

	public void setPrincipalKey(String principalKey) {
		this.principalKey = principalKey;
		if(principalKey != null){
			putQueryParameter("PrincipalKey", principalKey);
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

	public String getProduceTypesStr() {
		return this.produceTypesStr;
	}

	public void setProduceTypesStr(String produceTypesStr) {
		this.produceTypesStr = produceTypesStr;
		if(produceTypesStr != null){
			putQueryParameter("ProduceTypesStr", produceTypesStr);
		}
	}

	public String getPrincipalName() {
		return this.principalName;
	}

	public void setPrincipalName(String principalName) {
		this.principalName = principalName;
		if(principalName != null){
			putQueryParameter("PrincipalName", principalName);
		}
	}

	public String getOrderIdsStr() {
		return this.orderIdsStr;
	}

	public void setOrderIdsStr(String orderIdsStr) {
		this.orderIdsStr = orderIdsStr;
		if(orderIdsStr != null){
			putQueryParameter("OrderIdsStr", orderIdsStr);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	@Override
	public Class<QueryTrademarkModelListResponse> getResponseClass() {
		return QueryTrademarkModelListResponse.class;
	}

}
