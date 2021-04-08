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
public class GetSkillGroupLatitudeStateRequest extends RpcAcsRequest<GetSkillGroupLatitudeStateResponse> {
	   

	private List<Long> depIds;

	private Integer currentPage;

	private Long startDate;

	private String instanceId;

	private Long endDate;

	private Boolean existDepartmentGrouping;

	private List<Long> groupIds;

	private Integer pageSize;

	private Boolean existSkillGroupGrouping;
	public GetSkillGroupLatitudeStateRequest() {
		super("aiccs", "2019-10-15", "GetSkillGroupLatitudeState");
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
				putQueryParameter("DepIds." + (depth1 + 1) , depIds.get(depth1));
			}
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

	public Long getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Long startDate) {
		this.startDate = startDate;
		if(startDate != null){
			putQueryParameter("StartDate", startDate.toString());
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
			putQueryParameter("EndDate", endDate.toString());
		}
	}

	public Boolean getExistDepartmentGrouping() {
		return this.existDepartmentGrouping;
	}

	public void setExistDepartmentGrouping(Boolean existDepartmentGrouping) {
		this.existDepartmentGrouping = existDepartmentGrouping;
		if(existDepartmentGrouping != null){
			putQueryParameter("ExistDepartmentGrouping", existDepartmentGrouping.toString());
		}
	}

	public List<Long> getGroupIds() {
		return this.groupIds;
	}

	public void setGroupIds(List<Long> groupIds) {
		this.groupIds = groupIds;	
		if (groupIds != null) {
			for (int depth1 = 0; depth1 < groupIds.size(); depth1++) {
				putQueryParameter("GroupIds." + (depth1 + 1) , groupIds.get(depth1));
			}
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

	public Boolean getExistSkillGroupGrouping() {
		return this.existSkillGroupGrouping;
	}

	public void setExistSkillGroupGrouping(Boolean existSkillGroupGrouping) {
		this.existSkillGroupGrouping = existSkillGroupGrouping;
		if(existSkillGroupGrouping != null){
			putQueryParameter("ExistSkillGroupGrouping", existSkillGroupGrouping.toString());
		}
	}

	@Override
	public Class<GetSkillGroupLatitudeStateResponse> getResponseClass() {
		return GetSkillGroupLatitudeStateResponse.class;
	}

}
