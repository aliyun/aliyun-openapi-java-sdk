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

package com.aliyuncs.aiworkspace.model.v20200814;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListAdminWorkspacesRequest extends RoaAcsRequest<ListAdminWorkspacesResponse> {
	   

	private Integer pageSize;

	private String workspaceName;

	private String orderSequence;

	private String userId;

	private Integer pageNumber;

	private String orderField;

	private String workspaceId;
	public ListAdminWorkspacesRequest() {
		super("AIWorkSpace", "2020-08-14", "ListAdminWorkspaces");
		setUriPattern("/api/admin/v1.0/workspaces");
		setMethod(MethodType.GET);
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

	public String getWorkspaceName() {
		return this.workspaceName;
	}

	public void setWorkspaceName(String workspaceName) {
		this.workspaceName = workspaceName;
		if(workspaceName != null){
			putQueryParameter("WorkspaceName", workspaceName);
		}
	}

	public String getOrderSequence() {
		return this.orderSequence;
	}

	public void setOrderSequence(String orderSequence) {
		this.orderSequence = orderSequence;
		if(orderSequence != null){
			putQueryParameter("OrderSequence", orderSequence);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
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

	public String getOrderField() {
		return this.orderField;
	}

	public void setOrderField(String orderField) {
		this.orderField = orderField;
		if(orderField != null){
			putQueryParameter("OrderField", orderField);
		}
	}

	public String getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
		this.workspaceId = workspaceId;
		if(workspaceId != null){
			putQueryParameter("WorkspaceId", workspaceId);
		}
	}

	@Override
	public Class<ListAdminWorkspacesResponse> getResponseClass() {
		return ListAdminWorkspacesResponse.class;
	}

}
