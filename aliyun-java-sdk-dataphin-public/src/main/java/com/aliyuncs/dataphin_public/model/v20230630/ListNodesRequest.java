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
public class ListNodesRequest extends RpcAcsRequest<ListNodesResponse> {
	   

	private Long opTenantId;

	@SerializedName("listQuery")
	private ListQuery listQuery;

	private String env;
	public ListNodesRequest() {
		super("dataphin-public", "2023-06-30", "ListNodes");
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

		@SerializedName("ScheduleType")
		private String scheduleType;

		@SerializedName("DryRun")
		private Boolean dryRun;

		@SerializedName("SchedulePeriodList")
		private List<String> schedulePeriodList;

		@SerializedName("NodeBizType")
		private String nodeBizType;

		@SerializedName("NodeSubBizTypeList")
		private List<String> nodeSubBizTypeList;

		@SerializedName("PageSize")
		private Integer pageSize;

		@SerializedName("OwnerList")
		private List<String> ownerList;

		@SerializedName("Page")
		private Integer page;

		@SerializedName("ProjectId")
		private Long projectId;

		@SerializedName("PriorityList")
		private List<String> priorityList;

		@SerializedName("SchedulePaused")
		private Boolean schedulePaused;

		public String getSearchText() {
			return this.searchText;
		}

		public void setSearchText(String searchText) {
			this.searchText = searchText;
		}

		public String getScheduleType() {
			return this.scheduleType;
		}

		public void setScheduleType(String scheduleType) {
			this.scheduleType = scheduleType;
		}

		public Boolean getDryRun() {
			return this.dryRun;
		}

		public void setDryRun(Boolean dryRun) {
			this.dryRun = dryRun;
		}

		public List<String> getSchedulePeriodList() {
			return this.schedulePeriodList;
		}

		public void setSchedulePeriodList(List<String> schedulePeriodList) {
			this.schedulePeriodList = schedulePeriodList;
		}

		public String getNodeBizType() {
			return this.nodeBizType;
		}

		public void setNodeBizType(String nodeBizType) {
			this.nodeBizType = nodeBizType;
		}

		public List<String> getNodeSubBizTypeList() {
			return this.nodeSubBizTypeList;
		}

		public void setNodeSubBizTypeList(List<String> nodeSubBizTypeList) {
			this.nodeSubBizTypeList = nodeSubBizTypeList;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public List<String> getOwnerList() {
			return this.ownerList;
		}

		public void setOwnerList(List<String> ownerList) {
			this.ownerList = ownerList;
		}

		public Integer getPage() {
			return this.page;
		}

		public void setPage(Integer page) {
			this.page = page;
		}

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}

		public List<String> getPriorityList() {
			return this.priorityList;
		}

		public void setPriorityList(List<String> priorityList) {
			this.priorityList = priorityList;
		}

		public Boolean getSchedulePaused() {
			return this.schedulePaused;
		}

		public void setSchedulePaused(Boolean schedulePaused) {
			this.schedulePaused = schedulePaused;
		}
	}

	@Override
	public Class<ListNodesResponse> getResponseClass() {
		return ListNodesResponse.class;
	}

}
