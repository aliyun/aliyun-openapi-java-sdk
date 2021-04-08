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

package com.aliyuncs.aiccs.model.v20191015;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.aiccs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetSeatInformationRequest extends RpcAcsRequest<GetSeatInformationResponse> {
	   

	private List<Long> depIds;

	private String instanceId;

	private Long endDate;

	private Boolean existDepartmentGrouping;

	private Integer pageSize;

	private Integer currentPage;

	private Long startDate;
	public GetSeatInformationRequest() {
		super("aiccs", "2019-10-15", "GetSeatInformation");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Long> getDepIds() {
		return this.depIds;
	}

	public void setDepIds(List<Long> depIds) {
		this.depIds = depIds;	
		if (depIds != null) {
			for (int depth1 = 0; depth1 < depIds.size(); depth1++) {
				putQueryParameter("depIds." + (depth1 + 1) , depIds.get(depth1));
			}
		}	
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public Long getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Long endDate) {
		this.endDate = endDate;
		if(endDate != null){
			putQueryParameter("endDate", endDate.toString());
		}
	}

	public Boolean getExistDepartmentGrouping() {
		return this.existDepartmentGrouping;
	}

	public void setExistDepartmentGrouping(Boolean existDepartmentGrouping) {
		this.existDepartmentGrouping = existDepartmentGrouping;
		if(existDepartmentGrouping != null){
			putQueryParameter("existDepartmentGrouping", existDepartmentGrouping.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("pageSize", pageSize.toString());
		}
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("currentPage", currentPage.toString());
		}
	}

	public Long getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Long startDate) {
		this.startDate = startDate;
		if(startDate != null){
			putQueryParameter("startDate", startDate.toString());
		}
	}

	@Override
	public Class<GetSeatInformationResponse> getResponseClass() {
		return GetSeatInformationResponse.class;
	}

}
