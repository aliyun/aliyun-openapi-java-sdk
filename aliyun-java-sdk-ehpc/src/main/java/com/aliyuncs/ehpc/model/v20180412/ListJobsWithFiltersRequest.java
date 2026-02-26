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
public class ListJobsWithFiltersRequest extends RpcAcsRequest<ListJobsWithFiltersResponse> {
	   

	private String jobStatus;

	private Long pageNumber;

	private Long pageSize;

	private String executeOrder;

	private String jobName;

	private String submitOrder;

	private String pendOrder;

	private String clusterId;

	private List<String> users;

	private String createTimeEnd;

	private Boolean async;

	private List<String> nodes;

	private List<String> queues;

	private String createTimeStart;
	public ListJobsWithFiltersRequest() {
		super("EHPC", "2018-04-12", "ListJobsWithFilters", "ehs");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getJobStatus() {
		return this.jobStatus;
	}

	public void setJobStatus(String jobStatus) {
		this.jobStatus = jobStatus;
		if(jobStatus != null){
			putQueryParameter("JobStatus", jobStatus);
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

	public String getExecuteOrder() {
		return this.executeOrder;
	}

	public void setExecuteOrder(String executeOrder) {
		this.executeOrder = executeOrder;
		if(executeOrder != null){
			putQueryParameter("ExecuteOrder", executeOrder);
		}
	}

	public String getJobName() {
		return this.jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
		if(jobName != null){
			putQueryParameter("JobName", jobName);
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

	public String getPendOrder() {
		return this.pendOrder;
	}

	public void setPendOrder(String pendOrder) {
		this.pendOrder = pendOrder;
		if(pendOrder != null){
			putQueryParameter("PendOrder", pendOrder);
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

	public String getCreateTimeEnd() {
		return this.createTimeEnd;
	}

	public void setCreateTimeEnd(String createTimeEnd) {
		this.createTimeEnd = createTimeEnd;
		if(createTimeEnd != null){
			putQueryParameter("CreateTimeEnd", createTimeEnd);
		}
	}

	public Boolean getAsync() {
		return this.async;
	}

	public void setAsync(Boolean async) {
		this.async = async;
		if(async != null){
			putQueryParameter("Async", async.toString());
		}
	}

	public List<String> getNodes() {
		return this.nodes;
	}

	public void setNodes(List<String> nodes) {
		this.nodes = nodes;	
		if (nodes != null) {
			for (int depth1 = 0; depth1 < nodes.size(); depth1++) {
				putQueryParameter("Nodes." + (depth1 + 1) , nodes.get(depth1));
			}
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

	public String getCreateTimeStart() {
		return this.createTimeStart;
	}

	public void setCreateTimeStart(String createTimeStart) {
		this.createTimeStart = createTimeStart;
		if(createTimeStart != null){
			putQueryParameter("CreateTimeStart", createTimeStart);
		}
	}

	@Override
	public Class<ListJobsWithFiltersResponse> getResponseClass() {
		return ListJobsWithFiltersResponse.class;
	}

}
