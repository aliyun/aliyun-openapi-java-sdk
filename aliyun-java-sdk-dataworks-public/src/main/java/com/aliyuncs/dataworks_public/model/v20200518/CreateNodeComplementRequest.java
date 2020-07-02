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

package com.aliyuncs.dataworks_public.model.v20200518;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateNodeComplementRequest extends RpcAcsRequest<CreateNodeComplementResponse> {
	   

	private String projectEnv;

	private String startBizDate;

	private Boolean parallelism;

	private String bizBeginTime;

	private String endBizDate;

	private String includeNodeIds;

	private String bizEndTime;

	private String name;

	private String excludeNodeIds;

	private Long nodeId;

	private Long nodeProjectId;
	public CreateNodeComplementRequest() {
		super("dataworks-public", "2020-05-18", "CreateNodeComplement");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProjectEnv() {
		return this.projectEnv;
	}

	public void setProjectEnv(String projectEnv) {
		this.projectEnv = projectEnv;
		if(projectEnv != null){
			putBodyParameter("ProjectEnv", projectEnv);
		}
	}

	public String getStartBizDate() {
		return this.startBizDate;
	}

	public void setStartBizDate(String startBizDate) {
		this.startBizDate = startBizDate;
		if(startBizDate != null){
			putBodyParameter("StartBizDate", startBizDate);
		}
	}

	public Boolean getParallelism() {
		return this.parallelism;
	}

	public void setParallelism(Boolean parallelism) {
		this.parallelism = parallelism;
		if(parallelism != null){
			putBodyParameter("Parallelism", parallelism.toString());
		}
	}

	public String getBizBeginTime() {
		return this.bizBeginTime;
	}

	public void setBizBeginTime(String bizBeginTime) {
		this.bizBeginTime = bizBeginTime;
		if(bizBeginTime != null){
			putBodyParameter("BizBeginTime", bizBeginTime);
		}
	}

	public String getEndBizDate() {
		return this.endBizDate;
	}

	public void setEndBizDate(String endBizDate) {
		this.endBizDate = endBizDate;
		if(endBizDate != null){
			putBodyParameter("EndBizDate", endBizDate);
		}
	}

	public String getIncludeNodeIds() {
		return this.includeNodeIds;
	}

	public void setIncludeNodeIds(String includeNodeIds) {
		this.includeNodeIds = includeNodeIds;
		if(includeNodeIds != null){
			putBodyParameter("IncludeNodeIds", includeNodeIds);
		}
	}

	public String getBizEndTime() {
		return this.bizEndTime;
	}

	public void setBizEndTime(String bizEndTime) {
		this.bizEndTime = bizEndTime;
		if(bizEndTime != null){
			putBodyParameter("BizEndTime", bizEndTime);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public String getExcludeNodeIds() {
		return this.excludeNodeIds;
	}

	public void setExcludeNodeIds(String excludeNodeIds) {
		this.excludeNodeIds = excludeNodeIds;
		if(excludeNodeIds != null){
			putBodyParameter("ExcludeNodeIds", excludeNodeIds);
		}
	}

	public Long getNodeId() {
		return this.nodeId;
	}

	public void setNodeId(Long nodeId) {
		this.nodeId = nodeId;
		if(nodeId != null){
			putBodyParameter("NodeId", nodeId.toString());
		}
	}

	public Long getNodeProjectId() {
		return this.nodeProjectId;
	}

	public void setNodeProjectId(Long nodeProjectId) {
		this.nodeProjectId = nodeProjectId;
		if(nodeProjectId != null){
			putBodyParameter("NodeProjectId", nodeProjectId.toString());
		}
	}

	@Override
	public Class<CreateNodeComplementResponse> getResponseClass() {
		return CreateNodeComplementResponse.class;
	}

}
