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

package com.aliyuncs.ccc.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ListAgentSummaryReportsSinceMidnightRequest extends RpcAcsRequest<ListAgentSummaryReportsSinceMidnightResponse> {
	
	public ListAgentSummaryReportsSinceMidnightRequest() {
		super("CCC", "2017-07-05", "ListAgentSummaryReportsSinceMidnight");
	}

	private String agentIds;

	private String instanceId;

	private String skillGroupId;

	private Integer pageSize;

	private Integer pageNumber;

	public String getAgentIds() {
		return this.agentIds;
	}

	public void setAgentIds(String agentIds) {
		this.agentIds = agentIds;
		if(agentIds != null){
			putQueryParameter("AgentIds", agentIds);
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

	public String getSkillGroupId() {
		return this.skillGroupId;
	}

	public void setSkillGroupId(String skillGroupId) {
		this.skillGroupId = skillGroupId;
		if(skillGroupId != null){
			putQueryParameter("SkillGroupId", skillGroupId);
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	@Override
	public Class<ListAgentSummaryReportsSinceMidnightResponse> getResponseClass() {
		return ListAgentSummaryReportsSinceMidnightResponse.class;
	}

}
