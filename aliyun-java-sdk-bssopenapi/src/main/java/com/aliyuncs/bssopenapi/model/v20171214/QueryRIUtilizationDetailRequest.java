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

package com.aliyuncs.bssopenapi.model.v20171214;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.bssopenapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryRIUtilizationDetailRequest extends RpcAcsRequest<QueryRIUtilizationDetailResponse> {
	   

	private String deductedInstanceId;

	private String instanceSpec;

	private String endTime;

	private String rIInstanceId;

	private String startTime;

	private Integer pageNum;

	private Integer pageSize;

	private String rICommodityCode;
	public QueryRIUtilizationDetailRequest() {
		super("BssOpenApi", "2017-12-14", "QueryRIUtilizationDetail");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDeductedInstanceId() {
		return this.deductedInstanceId;
	}

	public void setDeductedInstanceId(String deductedInstanceId) {
		this.deductedInstanceId = deductedInstanceId;
		if(deductedInstanceId != null){
			putQueryParameter("DeductedInstanceId", deductedInstanceId);
		}
	}

	public String getInstanceSpec() {
		return this.instanceSpec;
	}

	public void setInstanceSpec(String instanceSpec) {
		this.instanceSpec = instanceSpec;
		if(instanceSpec != null){
			putQueryParameter("InstanceSpec", instanceSpec);
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

	public String getRIInstanceId() {
		return this.rIInstanceId;
	}

	public void setRIInstanceId(String rIInstanceId) {
		this.rIInstanceId = rIInstanceId;
		if(rIInstanceId != null){
			putQueryParameter("RIInstanceId", rIInstanceId);
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

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
		if(pageNum != null){
			putQueryParameter("PageNum", pageNum.toString());
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

	public String getRICommodityCode() {
		return this.rICommodityCode;
	}

	public void setRICommodityCode(String rICommodityCode) {
		this.rICommodityCode = rICommodityCode;
		if(rICommodityCode != null){
			putQueryParameter("RICommodityCode", rICommodityCode);
		}
	}

	@Override
	public Class<QueryRIUtilizationDetailResponse> getResponseClass() {
		return QueryRIUtilizationDetailResponse.class;
	}

}
