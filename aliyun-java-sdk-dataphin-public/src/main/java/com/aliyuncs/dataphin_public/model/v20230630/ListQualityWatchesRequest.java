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
public class ListQualityWatchesRequest extends RpcAcsRequest<ListQualityWatchesResponse> {
	   

	private Long opTenantId;

	@SerializedName("listQuery")
	private ListQuery listQuery;
	public ListQualityWatchesRequest() {
		super("dataphin-public", "2023-06-30", "ListQualityWatches");
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

		@SerializedName("WatchTypeList")
		private List<String> watchTypeList;

		@SerializedName("DataSourceOwnerList")
		private List<String> dataSourceOwnerList;

		@SerializedName("StatusList")
		private List<String> statusList;

		@SerializedName("LatestWatchTaskStatusList")
		private List<String> latestWatchTaskStatusList;

		@SerializedName("ProjectNameList")
		private List<String> projectNameList;

		@SerializedName("DataSourceTypeList")
		private List<String> dataSourceTypeList;

		@SerializedName("CurrentUserOwned")
		private Boolean currentUserOwned;

		@SerializedName("TableOwnerList")
		private List<String> tableOwnerList;

		@SerializedName("DataSourceIdList")
		private List<Long> dataSourceIdList;

		@SerializedName("DataSourceScopeList")
		private List<String> dataSourceScopeList;

		@SerializedName("QualityOwnerList")
		private List<String> qualityOwnerList;

		@SerializedName("PageNo")
		private Integer pageNo;

		@SerializedName("TableTypeList")
		private List<String> tableTypeList;

		@SerializedName("IndexOwnerList")
		private List<String> indexOwnerList;

		@SerializedName("PageSize")
		private Integer pageSize;

		@SerializedName("IndexComputeTypeList")
		private List<String> indexComputeTypeList;

		@SerializedName("Keyword")
		private String keyword;

		@SerializedName("BizUnitNameList")
		private List<String> bizUnitNameList;

		public List<String> getWatchTypeList() {
			return this.watchTypeList;
		}

		public void setWatchTypeList(List<String> watchTypeList) {
			this.watchTypeList = watchTypeList;
		}

		public List<String> getDataSourceOwnerList() {
			return this.dataSourceOwnerList;
		}

		public void setDataSourceOwnerList(List<String> dataSourceOwnerList) {
			this.dataSourceOwnerList = dataSourceOwnerList;
		}

		public List<String> getStatusList() {
			return this.statusList;
		}

		public void setStatusList(List<String> statusList) {
			this.statusList = statusList;
		}

		public List<String> getLatestWatchTaskStatusList() {
			return this.latestWatchTaskStatusList;
		}

		public void setLatestWatchTaskStatusList(List<String> latestWatchTaskStatusList) {
			this.latestWatchTaskStatusList = latestWatchTaskStatusList;
		}

		public List<String> getProjectNameList() {
			return this.projectNameList;
		}

		public void setProjectNameList(List<String> projectNameList) {
			this.projectNameList = projectNameList;
		}

		public List<String> getDataSourceTypeList() {
			return this.dataSourceTypeList;
		}

		public void setDataSourceTypeList(List<String> dataSourceTypeList) {
			this.dataSourceTypeList = dataSourceTypeList;
		}

		public Boolean getCurrentUserOwned() {
			return this.currentUserOwned;
		}

		public void setCurrentUserOwned(Boolean currentUserOwned) {
			this.currentUserOwned = currentUserOwned;
		}

		public List<String> getTableOwnerList() {
			return this.tableOwnerList;
		}

		public void setTableOwnerList(List<String> tableOwnerList) {
			this.tableOwnerList = tableOwnerList;
		}

		public List<Long> getDataSourceIdList() {
			return this.dataSourceIdList;
		}

		public void setDataSourceIdList(List<Long> dataSourceIdList) {
			this.dataSourceIdList = dataSourceIdList;
		}

		public List<String> getDataSourceScopeList() {
			return this.dataSourceScopeList;
		}

		public void setDataSourceScopeList(List<String> dataSourceScopeList) {
			this.dataSourceScopeList = dataSourceScopeList;
		}

		public List<String> getQualityOwnerList() {
			return this.qualityOwnerList;
		}

		public void setQualityOwnerList(List<String> qualityOwnerList) {
			this.qualityOwnerList = qualityOwnerList;
		}

		public Integer getPageNo() {
			return this.pageNo;
		}

		public void setPageNo(Integer pageNo) {
			this.pageNo = pageNo;
		}

		public List<String> getTableTypeList() {
			return this.tableTypeList;
		}

		public void setTableTypeList(List<String> tableTypeList) {
			this.tableTypeList = tableTypeList;
		}

		public List<String> getIndexOwnerList() {
			return this.indexOwnerList;
		}

		public void setIndexOwnerList(List<String> indexOwnerList) {
			this.indexOwnerList = indexOwnerList;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public List<String> getIndexComputeTypeList() {
			return this.indexComputeTypeList;
		}

		public void setIndexComputeTypeList(List<String> indexComputeTypeList) {
			this.indexComputeTypeList = indexComputeTypeList;
		}

		public String getKeyword() {
			return this.keyword;
		}

		public void setKeyword(String keyword) {
			this.keyword = keyword;
		}

		public List<String> getBizUnitNameList() {
			return this.bizUnitNameList;
		}

		public void setBizUnitNameList(List<String> bizUnitNameList) {
			this.bizUnitNameList = bizUnitNameList;
		}
	}

	@Override
	public Class<ListQualityWatchesResponse> getResponseClass() {
		return ListQualityWatchesResponse.class;
	}

}
