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
public class ListRealtimeAgentStatesRequest extends RpcAcsRequest<ListRealtimeAgentStatesResponse> {
	   

	private String callTypeList;

	private Boolean outboundScenario;

	private Integer pageNumber;

	private String agentIdList;

	private Integer pageSize;

	private String stateList;

	private String query;

	private String instanceId;

	private String workModeList;

	private String skillGroupId;

	private String agentName;

	private String mediaType;
	public ListRealtimeAgentStatesRequest() {
		super("CCC", "2020-07-01", "ListRealtimeAgentStates", "CCC");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCallTypeList() {
		return this.callTypeList;
	}

	public void setCallTypeList(String callTypeList) {
		this.callTypeList = callTypeList;
		if(callTypeList != null){
			putQueryParameter("CallTypeList", callTypeList);
		}
	}

	public Boolean getOutboundScenario() {
		return this.outboundScenario;
	}

	public void setOutboundScenario(Boolean outboundScenario) {
		this.outboundScenario = outboundScenario;
		if(outboundScenario != null){
			putQueryParameter("OutboundScenario", outboundScenario.toString());
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

	public String getAgentIdList() {
		return this.agentIdList;
	}

	public void setAgentIdList(String agentIdList) {
		this.agentIdList = agentIdList;
		if(agentIdList != null){
			putBodyParameter("AgentIdList", agentIdList);
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

	public String getStateList() {
		return this.stateList;
	}

	public void setStateList(String stateList) {
		this.stateList = stateList;
		if(stateList != null){
			putBodyParameter("StateList", stateList);
		}
	}

	public String getQuery() {
		return this.query;
	}

	public void setQuery(String query) {
		this.query = query;
		if(query != null){
			putQueryParameter("Query", query);
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

	public String getWorkModeList() {
		return this.workModeList;
	}

	public void setWorkModeList(String workModeList) {
		this.workModeList = workModeList;
		if(workModeList != null){
			putQueryParameter("WorkModeList", workModeList);
		}
	}

	public String getSkillGroupId() {
		return this.skillGroupId;
	}

	public void setSkillGroupId(String skillGroupId) {
		this.skillGroupId = skillGroupId;
		if(skillGroupId != null){
			putQueryParameter("SkillGroupId", skillGroupId);
		}
	}

	public String getAgentName() {
		return this.agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
		if(agentName != null){
			putQueryParameter("AgentName", agentName);
		}
	}

	public String getMediaType() {
		return this.mediaType;
	}

	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
		if(mediaType != null){
			putQueryParameter("MediaType", mediaType);
		}
	}

	@Override
	public Class<ListRealtimeAgentStatesResponse> getResponseClass() {
		return ListRealtimeAgentStatesResponse.class;
	}

}
