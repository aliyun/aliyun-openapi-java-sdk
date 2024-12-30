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
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListAlertEventsRequest extends RpcAcsRequest<ListAlertEventsResponse> {
	   

	private Long opTenantId;

	@SerializedName("listQuery")
	private ListQuery listQuery;
	public ListAlertEventsRequest() {
		super("dataphin-public", "2023-06-30", "ListAlertEvents");
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

	public static class ListQuery {

		@SerializedName("StatusList")
		private List<String> statusList;

		@SerializedName("AlertEndTime")
		private String alertEndTime;

		@SerializedName("ProjectNameList")
		private List<String> projectNameList;

		@SerializedName("UserIdList")
		private List<String> userIdList;

		@SerializedName("AlertObjectTypeList")
		private List<String> alertObjectTypeList;

		@SerializedName("SourceSystem")
		private String sourceSystem;

		@SerializedName("BizNameList")
		private List<String> bizNameList;

		@SerializedName("PageSize")
		private Integer pageSize;

		@SerializedName("AlertStartTime")
		private String alertStartTime;

		@SerializedName("Page")
		private Integer page;

		@SerializedName("MonitoredItemIdList")
		private List<String> monitoredItemIdList;

		@SerializedName("Keyword")
		private String keyword;

		@SerializedName("AlertReasonList")
		private List<String> alertReasonList;

		public List<String> getStatusList() {
			return this.statusList;
		}

		public void setStatusList(List<String> statusList) {
			this.statusList = statusList;
		}

		public String getAlertEndTime() {
			return this.alertEndTime;
		}

		public void setAlertEndTime(String alertEndTime) {
			this.alertEndTime = alertEndTime;
		}

		public List<String> getProjectNameList() {
			return this.projectNameList;
		}

		public void setProjectNameList(List<String> projectNameList) {
			this.projectNameList = projectNameList;
		}

		public List<String> getUserIdList() {
			return this.userIdList;
		}

		public void setUserIdList(List<String> userIdList) {
			this.userIdList = userIdList;
		}

		public List<String> getAlertObjectTypeList() {
			return this.alertObjectTypeList;
		}

		public void setAlertObjectTypeList(List<String> alertObjectTypeList) {
			this.alertObjectTypeList = alertObjectTypeList;
		}

		public String getSourceSystem() {
			return this.sourceSystem;
		}

		public void setSourceSystem(String sourceSystem) {
			this.sourceSystem = sourceSystem;
		}

		public List<String> getBizNameList() {
			return this.bizNameList;
		}

		public void setBizNameList(List<String> bizNameList) {
			this.bizNameList = bizNameList;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public String getAlertStartTime() {
			return this.alertStartTime;
		}

		public void setAlertStartTime(String alertStartTime) {
			this.alertStartTime = alertStartTime;
		}

		public Integer getPage() {
			return this.page;
		}

		public void setPage(Integer page) {
			this.page = page;
		}

		public List<String> getMonitoredItemIdList() {
			return this.monitoredItemIdList;
		}

		public void setMonitoredItemIdList(List<String> monitoredItemIdList) {
			this.monitoredItemIdList = monitoredItemIdList;
		}

		public String getKeyword() {
			return this.keyword;
		}

		public void setKeyword(String keyword) {
			this.keyword = keyword;
		}

		public List<String> getAlertReasonList() {
			return this.alertReasonList;
		}

		public void setAlertReasonList(List<String> alertReasonList) {
			this.alertReasonList = alertReasonList;
		}
	}

	@Override
	public Class<ListAlertEventsResponse> getResponseClass() {
		return ListAlertEventsResponse.class;
	}

}
