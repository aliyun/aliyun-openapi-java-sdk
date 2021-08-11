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

package com.aliyuncs.devops_rdc.model.v20200303;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListDevopsProjectsRequest extends RpcAcsRequest<ListDevopsProjectsResponse> {
	   

	private String selectBy;

	private Integer pageSize;

	private String orderBy;

	private String orgId;

	private String pageToken;
	public ListDevopsProjectsRequest() {
		super("devops-rdc", "2020-03-03", "ListDevopsProjects");
		setMethod(MethodType.POST);
	}

	public String getSelectBy() {
		return this.selectBy;
	}

	public void setSelectBy(String selectBy) {
		this.selectBy = selectBy;
		if(selectBy != null){
			putBodyParameter("SelectBy", selectBy);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getOrderBy() {
		return this.orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
		if(orderBy != null){
			putBodyParameter("OrderBy", orderBy);
		}
	}

	public String getOrgId() {
		return this.orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
		if(orgId != null){
			putBodyParameter("OrgId", orgId);
		}
	}

	public String getPageToken() {
		return this.pageToken;
	}

	public void setPageToken(String pageToken) {
		this.pageToken = pageToken;
		if(pageToken != null){
			putBodyParameter("PageToken", pageToken);
		}
	}

	@Override
	public Class<ListDevopsProjectsResponse> getResponseClass() {
		return ListDevopsProjectsResponse.class;
	}

}
