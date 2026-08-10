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
public class ExecuteDDLRequest extends RpcAcsRequest<ExecuteDDLResponse> {
	   

	private Long opTenantId;

	@SerializedName("dDLCommand")
	private DDLCommand dDLCommand;

	@SerializedName("context")
	private Context context;
	public ExecuteDDLRequest() {
		super("dataphin-public", "2023-06-30", "ExecuteDDL");
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

	public DDLCommand getDDLCommand() {
		return this.dDLCommand;
	}

	public void setDDLCommand(DDLCommand dDLCommand) {
		this.dDLCommand = dDLCommand;	
		if (dDLCommand != null) {
			putBodyParameter("DDLCommand" , new Gson().toJson(dDLCommand));
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

	public static class DDLCommand {

		@SerializedName("DatasourceId")
		private DatasourceId datasourceId;

		@SerializedName("DropTable")
		private Boolean dropTable;

		@SerializedName("Ddl")
		private String ddl;

		public DatasourceId getDatasourceId() {
			return this.datasourceId;
		}

		public void setDatasourceId(DatasourceId datasourceId) {
			this.datasourceId = datasourceId;
		}

		public Boolean getDropTable() {
			return this.dropTable;
		}

		public void setDropTable(Boolean dropTable) {
			this.dropTable = dropTable;
		}

		public String getDdl() {
			return this.ddl;
		}

		public void setDdl(String ddl) {
			this.ddl = ddl;
		}

		public static class DatasourceId {

			@SerializedName("DsId")
			private String dsId;

			@SerializedName("Catalog")
			private String catalog;

			@SerializedName("Env")
			private String env;

			@SerializedName("DsCategory")
			private String dsCategory;

			@SerializedName("Version")
			private String version;

			@SerializedName("ProjectId")
			private Long projectId;

			@SerializedName("OneCatalogType")
			private String oneCatalogType;

			public String getDsId() {
				return this.dsId;
			}

			public void setDsId(String dsId) {
				this.dsId = dsId;
			}

			public String getCatalog() {
				return this.catalog;
			}

			public void setCatalog(String catalog) {
				this.catalog = catalog;
			}

			public String getEnv() {
				return this.env;
			}

			public void setEnv(String env) {
				this.env = env;
			}

			public String getDsCategory() {
				return this.dsCategory;
			}

			public void setDsCategory(String dsCategory) {
				this.dsCategory = dsCategory;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}

			public Long getProjectId() {
				return this.projectId;
			}

			public void setProjectId(Long projectId) {
				this.projectId = projectId;
			}

			public String getOneCatalogType() {
				return this.oneCatalogType;
			}

			public void setOneCatalogType(String oneCatalogType) {
				this.oneCatalogType = oneCatalogType;
			}
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
	public Class<ExecuteDDLResponse> getResponseClass() {
		return ExecuteDDLResponse.class;
	}

}
