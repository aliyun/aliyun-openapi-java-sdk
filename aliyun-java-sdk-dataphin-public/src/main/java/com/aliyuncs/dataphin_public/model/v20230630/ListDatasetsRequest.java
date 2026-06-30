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
public class ListDatasetsRequest extends RpcAcsRequest<ListDatasetsResponse> {
	   

	private Long opTenantId;

	@SerializedName("datasetQuery")
	private DatasetQuery datasetQuery;
	public ListDatasetsRequest() {
		super("dataphin-public", "2023-06-30", "ListDatasets");
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

	public DatasetQuery getDatasetQuery() {
		return this.datasetQuery;
	}

	public void setDatasetQuery(DatasetQuery datasetQuery) {
		this.datasetQuery = datasetQuery;	
		if (datasetQuery != null) {
			putBodyParameter("DatasetQuery" , new Gson().toJson(datasetQuery));
		}	
	}

	public static class DatasetQuery {

		@SerializedName("Owner")
		private String owner;

		@SerializedName("IncludeVersionList")
		private Boolean includeVersionList;

		@SerializedName("TypeList")
		private List<String> typeList;

		@SerializedName("Scenario")
		private String scenario;

		@SerializedName("TenantId")
		private Long tenantId;

		@SerializedName("PageSize")
		private Integer pageSize;

		@SerializedName("Page")
		private Integer page;

		@SerializedName("Keyword")
		private String keyword;

		@SerializedName("ProjectId")
		private Long projectId;

		@SerializedName("StorageType")
		private String storageType;

		@SerializedName("ContentType")
		private String contentType;

		@SerializedName("DataUnit")
		private String dataUnit;

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public Boolean getIncludeVersionList() {
			return this.includeVersionList;
		}

		public void setIncludeVersionList(Boolean includeVersionList) {
			this.includeVersionList = includeVersionList;
		}

		public List<String> getTypeList() {
			return this.typeList;
		}

		public void setTypeList(List<String> typeList) {
			this.typeList = typeList;
		}

		public String getScenario() {
			return this.scenario;
		}

		public void setScenario(String scenario) {
			this.scenario = scenario;
		}

		public Long getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(Long tenantId) {
			this.tenantId = tenantId;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getPage() {
			return this.page;
		}

		public void setPage(Integer page) {
			this.page = page;
		}

		public String getKeyword() {
			return this.keyword;
		}

		public void setKeyword(String keyword) {
			this.keyword = keyword;
		}

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}

		public String getStorageType() {
			return this.storageType;
		}

		public void setStorageType(String storageType) {
			this.storageType = storageType;
		}

		public String getContentType() {
			return this.contentType;
		}

		public void setContentType(String contentType) {
			this.contentType = contentType;
		}

		public String getDataUnit() {
			return this.dataUnit;
		}

		public void setDataUnit(String dataUnit) {
			this.dataUnit = dataUnit;
		}
	}

	@Override
	public Class<ListDatasetsResponse> getResponseClass() {
		return ListDatasetsResponse.class;
	}

}
