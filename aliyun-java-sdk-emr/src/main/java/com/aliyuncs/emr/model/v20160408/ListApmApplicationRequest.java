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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.emr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListApmApplicationRequest extends RpcAcsRequest<ListApmApplicationResponse> {
	
	public ListApmApplicationRequest() {
		super("Emr", "2016-04-08", "ListApmApplication", "emr");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Long resourceOwnerId;

	private String diagnoseResult;

	private Long endTimeFrom;

	private String orderBy;

	private String clusterId;

	private String jobType;

	private Integer pageNumber;

	private String finalStatus;

	private Long startTimeFrom;

	private String appId;

	private String name;

	private Integer pageSize;

	private String state;

	private Long startTimeTo;

	private String user;

	private Long endTimeTo;

	private String queue;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getDiagnoseResult() {
		return this.diagnoseResult;
	}

	public void setDiagnoseResult(String diagnoseResult) {
		this.diagnoseResult = diagnoseResult;
		if(diagnoseResult != null){
			putQueryParameter("DiagnoseResult", diagnoseResult);
		}
	}

	public Long getEndTimeFrom() {
		return this.endTimeFrom;
	}

	public void setEndTimeFrom(Long endTimeFrom) {
		this.endTimeFrom = endTimeFrom;
		if(endTimeFrom != null){
			putQueryParameter("EndTimeFrom", endTimeFrom.toString());
		}
	}

	public String getOrderBy() {
		return this.orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
		if(orderBy != null){
			putQueryParameter("OrderBy", orderBy);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getJobType() {
		return this.jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
		if(jobType != null){
			putQueryParameter("JobType", jobType);
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

	public String getFinalStatus() {
		return this.finalStatus;
	}

	public void setFinalStatus(String finalStatus) {
		this.finalStatus = finalStatus;
		if(finalStatus != null){
			putQueryParameter("FinalStatus", finalStatus);
		}
	}

	public Long getStartTimeFrom() {
		return this.startTimeFrom;
	}

	public void setStartTimeFrom(Long startTimeFrom) {
		this.startTimeFrom = startTimeFrom;
		if(startTimeFrom != null){
			putQueryParameter("StartTimeFrom", startTimeFrom.toString());
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
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

	public Long getStartTimeTo() {
		return this.startTimeTo;
	}

	public void setStartTimeTo(Long startTimeTo) {
		this.startTimeTo = startTimeTo;
		if(startTimeTo != null){
			putQueryParameter("StartTimeTo", startTimeTo.toString());
		}
	}

	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
		if(user != null){
			putQueryParameter("User", user);
		}
	}

	public Long getEndTimeTo() {
		return this.endTimeTo;
	}

	public void setEndTimeTo(Long endTimeTo) {
		this.endTimeTo = endTimeTo;
		if(endTimeTo != null){
			putQueryParameter("EndTimeTo", endTimeTo.toString());
		}
	}

	public String getQueue() {
		return this.queue;
	}

	public void setQueue(String queue) {
		this.queue = queue;
		if(queue != null){
			putQueryParameter("Queue", queue);
		}
	}

	@Override
	public Class<ListApmApplicationResponse> getResponseClass() {
		return ListApmApplicationResponse.class;
	}

}
