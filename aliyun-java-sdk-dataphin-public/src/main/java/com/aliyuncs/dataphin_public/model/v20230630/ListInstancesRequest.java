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
public class ListInstancesRequest extends RpcAcsRequest<ListInstancesResponse> {
	   

	private Long opTenantId;

	@SerializedName("listQuery")
	private ListQuery listQuery;

	private String env;
	public ListInstancesRequest() {
		super("dataphin-public", "2023-06-30", "ListInstances");
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

	public String getEnv() {
		return this.env;
	}

	public void setEnv(String env) {
		this.env = env;
		if(env != null){
			putQueryParameter("Env", env);
		}
	}

	public static class ListQuery {

		@SerializedName("SearchText")
		private String searchText;

		@SerializedName("MinBizDate")
		private String minBizDate;

		@SerializedName("ScheduleType")
		private String scheduleType;

		@SerializedName("SubBizTypeList")
		private List<String> subBizTypeList;

		@SerializedName("MinRunDate")
		private String minRunDate;

		@SerializedName("SchedulePeriodList")
		private List<String> schedulePeriodList;

		@SerializedName("MaxBizDate")
		private String maxBizDate;

		@SerializedName("OwnerList")
		private List<String> ownerList;

		@SerializedName("SchedulePaused")
		private Boolean schedulePaused;

		@SerializedName("BizType")
		private String bizType;

		@SerializedName("PageSize")
		private Integer pageSize;

		@SerializedName("RunStatusList")
		private List<String> runStatusList;

		@SerializedName("Page")
		private Integer page;

		@SerializedName("NodeId")
		private String nodeId;

		@SerializedName("ProjectId")
		private Long projectId;

		@SerializedName("BizUnitId")
		private Long bizUnitId;

		@SerializedName("PriorityList")
		private List<String> priorityList;

		@SerializedName("MaxRunDate")
		private String maxRunDate;

		public String getSearchText() {
			return this.searchText;
		}

		public void setSearchText(String searchText) {
			this.searchText = searchText;
		}

		public String getMinBizDate() {
			return this.minBizDate;
		}

		public void setMinBizDate(String minBizDate) {
			this.minBizDate = minBizDate;
		}

		public String getScheduleType() {
			return this.scheduleType;
		}

		public void setScheduleType(String scheduleType) {
			this.scheduleType = scheduleType;
		}

		public List<String> getSubBizTypeList() {
			return this.subBizTypeList;
		}

		public void setSubBizTypeList(List<String> subBizTypeList) {
			this.subBizTypeList = subBizTypeList;
		}

		public String getMinRunDate() {
			return this.minRunDate;
		}

		public void setMinRunDate(String minRunDate) {
			this.minRunDate = minRunDate;
		}

		public List<String> getSchedulePeriodList() {
			return this.schedulePeriodList;
		}

		public void setSchedulePeriodList(List<String> schedulePeriodList) {
			this.schedulePeriodList = schedulePeriodList;
		}

		public String getMaxBizDate() {
			return this.maxBizDate;
		}

		public void setMaxBizDate(String maxBizDate) {
			this.maxBizDate = maxBizDate;
		}

		public List<String> getOwnerList() {
			return this.ownerList;
		}

		public void setOwnerList(List<String> ownerList) {
			this.ownerList = ownerList;
		}

		public Boolean getSchedulePaused() {
			return this.schedulePaused;
		}

		public void setSchedulePaused(Boolean schedulePaused) {
			this.schedulePaused = schedulePaused;
		}

		public String getBizType() {
			return this.bizType;
		}

		public void setBizType(String bizType) {
			this.bizType = bizType;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public List<String> getRunStatusList() {
			return this.runStatusList;
		}

		public void setRunStatusList(List<String> runStatusList) {
			this.runStatusList = runStatusList;
		}

		public Integer getPage() {
			return this.page;
		}

		public void setPage(Integer page) {
			this.page = page;
		}

		public String getNodeId() {
			return this.nodeId;
		}

		public void setNodeId(String nodeId) {
			this.nodeId = nodeId;
		}

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}

		public Long getBizUnitId() {
			return this.bizUnitId;
		}

		public void setBizUnitId(Long bizUnitId) {
			this.bizUnitId = bizUnitId;
		}

		public List<String> getPriorityList() {
			return this.priorityList;
		}

		public void setPriorityList(List<String> priorityList) {
			this.priorityList = priorityList;
		}

		public String getMaxRunDate() {
			return this.maxRunDate;
		}

		public void setMaxRunDate(String maxRunDate) {
			this.maxRunDate = maxRunDate;
		}
	}

	@Override
	public Class<ListInstancesResponse> getResponseClass() {
		return ListInstancesResponse.class;
	}

}
