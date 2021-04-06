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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreatePermissionApplyOrderRequest extends RpcAcsRequest<CreatePermissionApplyOrderResponse> {
	   

	private String applyReason;

	private String maxComputeProjectName;

	private List<ApplyObject> applyObjects;

	private String applyUserIds;

	private Long deadline;

	private Integer workspaceId;

	private Integer orderType;

	private String engineType;
	public CreatePermissionApplyOrderRequest() {
		super("dataworks-public", "2020-05-18", "CreatePermissionApplyOrder");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getApplyReason() {
		return this.applyReason;
	}

	public void setApplyReason(String applyReason) {
		this.applyReason = applyReason;
		if(applyReason != null){
			putQueryParameter("ApplyReason", applyReason);
		}
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

	public List<ApplyObject> getApplyObjects() {
		return this.applyObjects;
	}

	public void setApplyObjects(List<ApplyObject> applyObjects) {
		this.applyObjects = applyObjects;	
		if (applyObjects != null) {
			for (int depth1 = 0; depth1 < applyObjects.size(); depth1++) {
				if (applyObjects.get(depth1).getColumnMetaLists() != null) {
					for (int depth2 = 0; depth2 < applyObjects.get(depth1).getColumnMetaLists().size(); depth2++) {
						putQueryParameter("ApplyObject." + (depth1 + 1) + ".ColumnMetaList." + (depth2 + 1) + ".Name" , applyObjects.get(depth1).getColumnMetaLists().get(depth2).getName());
					}
				}
				putQueryParameter("ApplyObject." + (depth1 + 1) + ".Name" , applyObjects.get(depth1).getName());
				putQueryParameter("ApplyObject." + (depth1 + 1) + ".Actions" , applyObjects.get(depth1).getActions());
			}
		}	
	}

	public String getApplyUserIds() {
		return this.applyUserIds;
	}

	public void setApplyUserIds(String applyUserIds) {
		this.applyUserIds = applyUserIds;
		if(applyUserIds != null){
			putQueryParameter("ApplyUserIds", applyUserIds);
		}
	}

	public Long getDeadline() {
		return this.deadline;
	}

	public void setDeadline(Long deadline) {
		this.deadline = deadline;
		if(deadline != null){
			putQueryParameter("Deadline", deadline.toString());
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

	public static class ApplyObject {

		private List<ColumnMetaList> columnMetaLists;

		private String name;

		private String actions;

		public List<ColumnMetaList> getColumnMetaLists() {
			return this.columnMetaLists;
		}

		public void setColumnMetaLists(List<ColumnMetaList> columnMetaLists) {
			this.columnMetaLists = columnMetaLists;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getActions() {
			return this.actions;
		}

		public void setActions(String actions) {
			this.actions = actions;
		}

		public static class ColumnMetaList {

			private String name;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}
	}

	@Override
	public Class<CreatePermissionApplyOrderResponse> getResponseClass() {
		return CreatePermissionApplyOrderResponse.class;
	}

}
