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
public class ListPermissionApplyOrdersRequest extends RpcAcsRequest<ListPermissionApplyOrdersResponse> {
	   

	private String maxComputeProjectName;

	private Long endTime;

	private Long startTime;

	private Integer pageNum;

	private Integer flowStatus;

	private Integer pageSize;

	private String tableName;

	private Integer queryType;

	private Integer workspaceId;

	private Integer orderType;

	private String engineType;
	public ListPermissionApplyOrdersRequest() {
		super("dataworks-public", "2020-05-18", "ListPermissionApplyOrders");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMaxComputeProjectName() {
		return this.maxComputeProjectName;
	}

	public void setMaxComputeProjectName(String maxComputeProjectName) {
		this.maxComputeProjectName = maxComputeProjectName;
		if(maxComputeProjectName != null){
			putQueryParameter("MaxComputeProjectName", maxComputeProjectName);
		}
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime.toString());
		}
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime.toString());
		}
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
		if(pageNum != null){
			putQueryParameter("PageNum", pageNum.toString());
		}
	}

	public Integer getFlowStatus() {
		return this.flowStatus;
	}

	public void setFlowStatus(Integer flowStatus) {
		this.flowStatus = flowStatus;
		if(flowStatus != null){
			putQueryParameter("FlowStatus", flowStatus.toString());
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

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
		if(tableName != null){
			putQueryParameter("TableName", tableName);
		}
	}

	public Integer getQueryType() {
		return this.queryType;
	}

	public void setQueryType(Integer queryType) {
		this.queryType = queryType;
		if(queryType != null){
			putQueryParameter("QueryType", queryType.toString());
		}
	}

	public Integer getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(Integer workspaceId) {
		this.workspaceId = workspaceId;
		if(workspaceId != null){
			putQueryParameter("WorkspaceId", workspaceId.toString());
		}
	}

	public Integer getOrderType() {
		return this.orderType;
	}

	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
		if(orderType != null){
			putQueryParameter("OrderType", orderType.toString());
		}
	}

	public String getEngineType() {
		return this.engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
		if(engineType != null){
			putQueryParameter("EngineType", engineType);
		}
	}

	@Override
	public Class<ListPermissionApplyOrdersResponse> getResponseClass() {
		return ListPermissionApplyOrdersResponse.class;
	}

}
