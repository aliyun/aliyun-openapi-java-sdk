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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ListAgentSummaryReportsRequest extends RpcAcsRequest<ListAgentSummaryReportsResponse> {
	
	public ListAgentSummaryReportsRequest() {
		super("CloudCallCenter", "2017-07-05", "ListAgentSummaryReports", "CloudCallCenter", "innerAPI");
	}

	private String orderByOutboundTotalTalkTime;

	private String agentIds;

	private String orderByInboundTotalTalkTime;

	private String endTime;

	private String startTime;

	private String displayNameLike;

	private String orderByInboundTotalCalls;

	private Integer pageNumber;

	private String orderByTotalTalkTime;

	private String instanceId;

	private String orderByOutboundTotalCalls;

	private String skillGroupId;

	private Integer pageSize;

	private String orderByOccupancyRate;

	private String orderByTotalCalls;

	public String getOrderByOutboundTotalTalkTime() {
		return this.orderByOutboundTotalTalkTime;
	}

	public void setOrderByOutboundTotalTalkTime(String orderByOutboundTotalTalkTime) {
		this.orderByOutboundTotalTalkTime = orderByOutboundTotalTalkTime;
		if(orderByOutboundTotalTalkTime != null){
			putQueryParameter("OrderByOutboundTotalTalkTime", orderByOutboundTotalTalkTime);
		}
	}

	public String getAgentIds() {
		return this.agentIds;
	}

	public void setAgentIds(String agentIds) {
		this.agentIds = agentIds;
		if(agentIds != null){
			putQueryParameter("AgentIds", agentIds);
		}
	}

	public String getOrderByInboundTotalTalkTime() {
		return this.orderByInboundTotalTalkTime;
	}

	public void setOrderByInboundTotalTalkTime(String orderByInboundTotalTalkTime) {
		this.orderByInboundTotalTalkTime = orderByInboundTotalTalkTime;
		if(orderByInboundTotalTalkTime != null){
			putQueryParameter("OrderByInboundTotalTalkTime", orderByInboundTotalTalkTime);
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
		}
	}

	public String getDisplayNameLike() {
		return this.displayNameLike;
	}

	public void setDisplayNameLike(String displayNameLike) {
		this.displayNameLike = displayNameLike;
		if(displayNameLike != null){
			putQueryParameter("DisplayNameLike", displayNameLike);
		}
	}

	public String getOrderByInboundTotalCalls() {
		return this.orderByInboundTotalCalls;
	}

	public void setOrderByInboundTotalCalls(String orderByInboundTotalCalls) {
		this.orderByInboundTotalCalls = orderByInboundTotalCalls;
		if(orderByInboundTotalCalls != null){
			putQueryParameter("OrderByInboundTotalCalls", orderByInboundTotalCalls);
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

	public String getOrderByTotalTalkTime() {
		return this.orderByTotalTalkTime;
	}

	public void setOrderByTotalTalkTime(String orderByTotalTalkTime) {
		this.orderByTotalTalkTime = orderByTotalTalkTime;
		if(orderByTotalTalkTime != null){
			putQueryParameter("OrderByTotalTalkTime", orderByTotalTalkTime);
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

	public String getOrderByOutboundTotalCalls() {
		return this.orderByOutboundTotalCalls;
	}

	public void setOrderByOutboundTotalCalls(String orderByOutboundTotalCalls) {
		this.orderByOutboundTotalCalls = orderByOutboundTotalCalls;
		if(orderByOutboundTotalCalls != null){
			putQueryParameter("OrderByOutboundTotalCalls", orderByOutboundTotalCalls);
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

	public String getOrderByOccupancyRate() {
		return this.orderByOccupancyRate;
	}

	public void setOrderByOccupancyRate(String orderByOccupancyRate) {
		this.orderByOccupancyRate = orderByOccupancyRate;
		if(orderByOccupancyRate != null){
			putQueryParameter("OrderByOccupancyRate", orderByOccupancyRate);
		}
	}

	public String getOrderByTotalCalls() {
		return this.orderByTotalCalls;
	}

	public void setOrderByTotalCalls(String orderByTotalCalls) {
		this.orderByTotalCalls = orderByTotalCalls;
		if(orderByTotalCalls != null){
			putQueryParameter("OrderByTotalCalls", orderByTotalCalls);
		}
	}

	@Override
	public Class<ListAgentSummaryReportsResponse> getResponseClass() {
		return ListAgentSummaryReportsResponse.class;
	}

}
