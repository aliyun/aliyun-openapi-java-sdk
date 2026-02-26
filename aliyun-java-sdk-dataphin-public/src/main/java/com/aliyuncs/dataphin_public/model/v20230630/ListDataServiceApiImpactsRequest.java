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

package com.aliyuncs.dataphin_public.model.v20230630;

import com.aliyuncs.RpcAcsRequest;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListDataServiceApiImpactsRequest extends RpcAcsRequest<ListDataServiceApiImpactsResponse> {
	   

	private Long opTenantId;

	@SerializedName("listQuery")
	private ListQuery listQuery;

	private Integer projectId;
	public ListDataServiceApiImpactsRequest() {
		super("dataphin-public", "2023-06-30", "ListDataServiceApiImpacts");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Long getOpTenantId() {
		return this.opTenantId;
	}

	public void setOpTenantId(Long opTenantId) {
		this.opTenantId = opTenantId;
		if(opTenantId != null){
			putQueryParameter("OpTenantId", opTenantId.toString());
		}
	}

	public ListQuery getListQuery() {
		return this.listQuery;
	}

	public void setListQuery(ListQuery listQuery) {
		this.listQuery = listQuery;	
		if (listQuery != null) {
			putBodyParameter("ListQuery" , new Gson().toJson(listQuery));
		}	
	}

	public Integer getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putQueryParameter("ProjectId", projectId.toString());
		}
	}

	public static class ListQuery {

		@SerializedName("OrderColumn")
		private String orderColumn;

		@SerializedName("AppName")
		private String appName;

		@SerializedName("PageNo")
		private Integer pageNo;

		@SerializedName("PageSize")
		private Integer pageSize;

		@SerializedName("EndTime")
		private String endTime;

		@SerializedName("StartTime")
		private String startTime;

		@SerializedName("ApiId")
		private Long apiId;

		@SerializedName("OrderType")
		private Integer orderType;

		public String getOrderColumn() {
			return this.orderColumn;
		}

		public void setOrderColumn(String orderColumn) {
			this.orderColumn = orderColumn;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public Integer getPageNo() {
			return this.pageNo;
		}

		public void setPageNo(Integer pageNo) {
			this.pageNo = pageNo;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public Long getApiId() {
			return this.apiId;
		}

		public void setApiId(Long apiId) {
			this.apiId = apiId;
		}

		public Integer getOrderType() {
			return this.orderType;
		}

		public void setOrderType(Integer orderType) {
			this.orderType = orderType;
		}
	}

	@Override
	public Class<ListDataServiceApiImpactsResponse> getResponseClass() {
		return ListDataServiceApiImpactsResponse.class;
	}

}
