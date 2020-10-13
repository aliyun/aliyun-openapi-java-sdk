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
public class GetHotlineAgentDetailReportRequest extends RpcAcsRequest<GetHotlineAgentDetailReportResponse> {
	   

	private List<Long> depIdss;

	private Long endDate;

	private String instanceId;

	private List<Long> groupIdss;

	private Integer pageSize;

	private Integer currentPage;

	private Long startDate;
	public GetHotlineAgentDetailReportRequest() {
		super("aiccs", "2019-10-15", "GetHotlineAgentDetailReport", "aiccs-service");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Long> getDepIdss() {
		return this.depIdss;
	}

	public void setDepIdss(List<Long> depIdss) {
		this.depIdss = depIdss;	
		if (depIdss != null) {
			for (int i = 0; i < depIdss.size(); i++) {
				putQueryParameter("DepIds." + (i + 1) , depIdss.get(i));
			}
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

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public List<Long> getGroupIdss() {
		return this.groupIdss;
	}

	public void setGroupIdss(List<Long> groupIdss) {
		this.groupIdss = groupIdss;	
		if (groupIdss != null) {
			for (int i = 0; i < groupIdss.size(); i++) {
				putQueryParameter("GroupIds." + (i + 1) , groupIdss.get(i));
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

	@Override
	public Class<GetHotlineAgentDetailReportResponse> getResponseClass() {
		return GetHotlineAgentDetailReportResponse.class;
	}

}
