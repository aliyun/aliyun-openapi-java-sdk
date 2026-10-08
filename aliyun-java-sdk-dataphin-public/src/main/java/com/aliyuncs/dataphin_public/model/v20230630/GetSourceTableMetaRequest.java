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
public class GetSourceTableMetaRequest extends RpcAcsRequest<GetSourceTableMetaResponse> {
	   

	private Long opTenantId;

	private String opUserId;

	@SerializedName("query")
	private Query query;

	@SerializedName("context")
	private Context context;
	public GetSourceTableMetaRequest() {
		super("dataphin-public", "2023-06-30", "GetSourceTableMeta", "1111");
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

	public String getOpUserId() {
		return this.opUserId;
	}

	public void setOpUserId(String opUserId) {
		this.opUserId = opUserId;
		if(opUserId != null){
			putQueryParameter("OpUserId", opUserId);
		}
	}

	public Query getQuery() {
		return this.query;
	}

	public void setQuery(Query query) {
		this.query = query;	
		if (query != null) {
			putBodyParameter("Query" , new Gson().toJson(query));
		}	
	}

	public Context getContext() {
		return this.context;
	}

	public void setContext(Context context) {
		this.context = context;	
		if (context != null) {
			putBodyParameter("Context" , new Gson().toJson(context));
		}	
	}

	public static class Query {

		@SerializedName("SchemaName")
		private String schemaName;

		@SerializedName("QueryMode")
		private String queryMode;

		@SerializedName("Catalog")
		private String catalog;

		@SerializedName("Id")
		private String id;

		@SerializedName("TableName")
		private String tableName;

		public String getSchemaName() {
			return this.schemaName;
		}

		public void setSchemaName(String schemaName) {
			this.schemaName = schemaName;
		}

		public String getQueryMode() {
			return this.queryMode;
		}

		public void setQueryMode(String queryMode) {
			this.queryMode = queryMode;
		}

		public String getCatalog() {
			return this.catalog;
		}

		public void setCatalog(String catalog) {
			this.catalog = catalog;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}
	}

	public static class Context {

		@SerializedName("Env")
		private String env;

		@SerializedName("ProjectId")
		private Long projectId;

		public String getEnv() {
			return this.env;
		}

		public void setEnv(String env) {
			this.env = env;
		}

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}
	}

	@Override
	public Class<GetSourceTableMetaResponse> getResponseClass() {
		return GetSourceTableMetaResponse.class;
	}

}
