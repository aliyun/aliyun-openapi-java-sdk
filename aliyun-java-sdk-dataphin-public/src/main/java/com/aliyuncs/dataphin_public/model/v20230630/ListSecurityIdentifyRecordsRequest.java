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
public class ListSecurityIdentifyRecordsRequest extends RpcAcsRequest<ListSecurityIdentifyRecordsResponse> {
	   

	private Long opTenantId;

	@SerializedName("listQuery")
	private ListQuery listQuery;
	public ListSecurityIdentifyRecordsRequest() {
		super("dataphin-public", "2023-06-30", "ListSecurityIdentifyRecords");
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

		@SerializedName("FieldName")
		private String fieldName;

		@SerializedName("TableCatalog")
		private String tableCatalog;

		@SerializedName("PageNo")
		private Integer pageNo;

		@SerializedName("PageSize")
		private Integer pageSize;

		@SerializedName("DatasourceName")
		private String datasourceName;

		@SerializedName("IsDatasourceTable")
		private Boolean isDatasourceTable;

		@SerializedName("TableName")
		private String tableName;

		@SerializedName("Keyword")
		private String keyword;

		@SerializedName("DatasourceEnv")
		private String datasourceEnv;

		public String getFieldName() {
			return this.fieldName;
		}

		public void setFieldName(String fieldName) {
			this.fieldName = fieldName;
		}

		public String getTableCatalog() {
			return this.tableCatalog;
		}

		public void setTableCatalog(String tableCatalog) {
			this.tableCatalog = tableCatalog;
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

		public String getDatasourceName() {
			return this.datasourceName;
		}

		public void setDatasourceName(String datasourceName) {
			this.datasourceName = datasourceName;
		}

		public Boolean getIsDatasourceTable() {
			return this.isDatasourceTable;
		}

		public void setIsDatasourceTable(Boolean isDatasourceTable) {
			this.isDatasourceTable = isDatasourceTable;
		}

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public String getKeyword() {
			return this.keyword;
		}

		public void setKeyword(String keyword) {
			this.keyword = keyword;
		}

		public String getDatasourceEnv() {
			return this.datasourceEnv;
		}

		public void setDatasourceEnv(String datasourceEnv) {
			this.datasourceEnv = datasourceEnv;
		}
	}

	@Override
	public Class<ListSecurityIdentifyRecordsResponse> getResponseClass() {
		return ListSecurityIdentifyRecordsResponse.class;
	}

}
