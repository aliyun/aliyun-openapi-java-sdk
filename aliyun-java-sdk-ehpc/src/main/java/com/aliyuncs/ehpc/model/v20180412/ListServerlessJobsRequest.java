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

package com.aliyuncs.ehpc.model.v20180412;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ehpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListServerlessJobsRequest extends RpcAcsRequest<ListServerlessJobsResponse> {
	   

	private String submitTimeStart;

	private Long pageNumber;

	private Long pageSize;

	private String state;

	private String submitOrder;

	private String clusterId;

	private List<String> jobNames;

	private List<String> users;

	private String startOrder;

	private String submitTimeEnd;

	private List<String> queues;

	private List<String> jobIds;
	public ListServerlessJobsRequest() {
		super("EHPC", "2018-04-12", "ListServerlessJobs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSubmitTimeStart() {
		return this.submitTimeStart;
	}

	public void setSubmitTimeStart(String submitTimeStart) {
		this.submitTimeStart = submitTimeStart;
		if(submitTimeStart != null){
			putQueryParameter("SubmitTimeStart", submitTimeStart);
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

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
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

	public String getSubmitOrder() {
		return this.submitOrder;
	}

	public void setSubmitOrder(String submitOrder) {
		this.submitOrder = submitOrder;
		if(submitOrder != null){
			putQueryParameter("SubmitOrder", submitOrder);
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

	public List<String> getJobNames() {
		return this.jobNames;
	}

	public void setJobNames(List<String> jobNames) {
		this.jobNames = jobNames;	
		if (jobNames != null) {
			for (int depth1 = 0; depth1 < jobNames.size(); depth1++) {
				putQueryParameter("JobNames." + (depth1 + 1) , jobNames.get(depth1));
			}
		}	
	}

	public List<String> getUsers() {
		return this.users;
	}

	public void setUsers(List<String> users) {
		this.users = users;	
		if (users != null) {
			for (int depth1 = 0; depth1 < users.size(); depth1++) {
				putQueryParameter("Users." + (depth1 + 1) , users.get(depth1));
			}
		}	
	}

	public String getStartOrder() {
		return this.startOrder;
	}

	public void setStartOrder(String startOrder) {
		this.startOrder = startOrder;
		if(startOrder != null){
			putQueryParameter("StartOrder", startOrder);
		}
	}

	public String getSubmitTimeEnd() {
		return this.submitTimeEnd;
	}

	public void setSubmitTimeEnd(String submitTimeEnd) {
		this.submitTimeEnd = submitTimeEnd;
		if(submitTimeEnd != null){
			putQueryParameter("SubmitTimeEnd", submitTimeEnd);
		}
	}

	public List<String> getQueues() {
		return this.queues;
	}

	public void setQueues(List<String> queues) {
		this.queues = queues;	
		if (queues != null) {
			for (int depth1 = 0; depth1 < queues.size(); depth1++) {
				putQueryParameter("Queues." + (depth1 + 1) , queues.get(depth1));
			}
		}	
	}

	public List<String> getJobIds() {
		return this.jobIds;
	}

	public void setJobIds(List<String> jobIds) {
		this.jobIds = jobIds;	
		if (jobIds != null) {
			for (int depth1 = 0; depth1 < jobIds.size(); depth1++) {
				putQueryParameter("JobIds." + (depth1 + 1) , jobIds.get(depth1));
			}
		}	
	}

	@Override
	public Class<ListServerlessJobsResponse> getResponseClass() {
		return ListServerlessJobsResponse.class;
	}

}
