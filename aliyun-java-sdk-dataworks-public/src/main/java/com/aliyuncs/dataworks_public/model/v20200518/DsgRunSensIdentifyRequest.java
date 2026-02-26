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

package com.aliyuncs.dataworks_public.model.v20200518;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DsgRunSensIdentifyRequest extends RpcAcsRequest<DsgRunSensIdentifyResponse> {
	   

	private String tenantId;

	@SerializedName("esMetaParams")
	private List<EsMetaParams> esMetaParams;
	public DsgRunSensIdentifyRequest() {
		super("dataworks-public", "2020-05-18", "DsgRunSensIdentify");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId);
		}
	}

	public List<EsMetaParams> getEsMetaParams() {
		return this.esMetaParams;
	}

	public void setEsMetaParams(List<EsMetaParams> esMetaParams) {
		this.esMetaParams = esMetaParams;	
		if (esMetaParams != null) {
			putBodyParameter("EsMetaParams" , new Gson().toJson(esMetaParams));
		}	
	}

	public static class EsMetaParams {

		@SerializedName("TableNameList")
		private List<String> tableNameList;

		@SerializedName("ProjectName")
		private String projectName;

		@SerializedName("SchemaName")
		private String schemaName;

		@SerializedName("InstanceId")
		private Long instanceId;

		@SerializedName("DbType")
		private String dbType;

		@SerializedName("ClusterId")
		private String clusterId;

		@SerializedName("TableName")
		private String tableName;

		@SerializedName("User")
		private String user;

		public List<String> getTableNameList() {
			return this.tableNameList;
		}

		public void setTableNameList(List<String> tableNameList) {
			this.tableNameList = tableNameList;
		}

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public String getSchemaName() {
			return this.schemaName;
		}

		public void setSchemaName(String schemaName) {
			this.schemaName = schemaName;
		}

		public Long getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(Long instanceId) {
			this.instanceId = instanceId;
		}

		public String getDbType() {
			return this.dbType;
		}

		public void setDbType(String dbType) {
			this.dbType = dbType;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public String getUser() {
			return this.user;
		}

		public void setUser(String user) {
			this.user = user;
		}
	}

	@Override
	public Class<DsgRunSensIdentifyResponse> getResponseClass() {
		return DsgRunSensIdentifyResponse.class;
	}

}
