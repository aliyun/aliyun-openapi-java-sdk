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

package com.aliyuncs.ccc.model.v20200701;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ccc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListCampaignsRequest extends RpcAcsRequest<ListCampaignsResponse> {
	   

	private String actualStartTimeTo;

	private String queueId;

	private String actualStartTimeFrom;

	private Long pageNumber;

	private String planedStartTimeFrom;

	private String instanceId;

	private String name;

	private Long pageSize;

	private String planedStartTimeTo;

	private String state;
	public ListCampaignsRequest() {
		super("CCC", "2020-07-01", "ListCampaigns", "CCC");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getActualStartTimeTo() {
		return this.actualStartTimeTo;
	}

	public void setActualStartTimeTo(String actualStartTimeTo) {
		this.actualStartTimeTo = actualStartTimeTo;
		if(actualStartTimeTo != null){
			putQueryParameter("ActualStartTimeTo", actualStartTimeTo);
		}
	}

	public String getQueueId() {
		return this.queueId;
	}

	public void setQueueId(String queueId) {
		this.queueId = queueId;
		if(queueId != null){
			putQueryParameter("QueueId", queueId);
		}
	}

	public String getActualStartTimeFrom() {
		return this.actualStartTimeFrom;
	}

	public void setActualStartTimeFrom(String actualStartTimeFrom) {
		this.actualStartTimeFrom = actualStartTimeFrom;
		if(actualStartTimeFrom != null){
			putQueryParameter("ActualStartTimeFrom", actualStartTimeFrom);
		}
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getPlanedStartTimeFrom() {
		return this.planedStartTimeFrom;
	}

	public void setPlanedStartTimeFrom(String planedStartTimeFrom) {
		this.planedStartTimeFrom = planedStartTimeFrom;
		if(planedStartTimeFrom != null){
			putQueryParameter("PlanedStartTimeFrom", planedStartTimeFrom);
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getPlanedStartTimeTo() {
		return this.planedStartTimeTo;
	}

	public void setPlanedStartTimeTo(String planedStartTimeTo) {
		this.planedStartTimeTo = planedStartTimeTo;
		if(planedStartTimeTo != null){
			putQueryParameter("PlanedStartTimeTo", planedStartTimeTo);
		}
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
		if(state != null){
			putQueryParameter("State", state);
		}
	}

	@Override
	public Class<ListCampaignsResponse> getResponseClass() {
		return ListCampaignsResponse.class;
	}

}
