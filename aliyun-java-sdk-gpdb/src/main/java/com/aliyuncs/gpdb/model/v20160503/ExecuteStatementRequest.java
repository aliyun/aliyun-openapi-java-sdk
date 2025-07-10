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

package com.aliyuncs.gpdb.model.v20160503;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.gpdb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ExecuteStatementRequest extends RpcAcsRequest<ExecuteStatementResponse> {
	   

	private String secretArn;

	@SerializedName("ragWorkspaceCollection")
	private RagWorkspaceCollection ragWorkspaceCollection;

	private String sql;

	@SerializedName("sqls")
	private List<String> sqls;

	private String database;

	private String dBInstanceId;

	private Long ownerId;

	private String statementName;

	private String runType;

	@SerializedName("parameters")
	private List<Object> parameters;

	private String workspaceId;
	public ExecuteStatementRequest() {
		super("gpdb", "2016-05-03", "ExecuteStatement", "gpdb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSecretArn() {
		return this.secretArn;
	}

	public void setSecretArn(String secretArn) {
		this.secretArn = secretArn;
		if(secretArn != null){
			putQueryParameter("SecretArn", secretArn);
		}
	}

	public RagWorkspaceCollection getRagWorkspaceCollection() {
		return this.ragWorkspaceCollection;
	}

	public void setRagWorkspaceCollection(RagWorkspaceCollection ragWorkspaceCollection) {
		this.ragWorkspaceCollection = ragWorkspaceCollection;	
		if (ragWorkspaceCollection != null) {
			putQueryParameter("RagWorkspaceCollection" , new Gson().toJson(ragWorkspaceCollection));
		}	
	}

	public String getSql() {
		return this.sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
		if(sql != null){
			putBodyParameter("Sql", sql);
		}
	}

	public List<String> getSqls() {
		return this.sqls;
	}

	public void setSqls(List<String> sqls) {
		this.sqls = sqls;	
		if (sqls != null) {
			putBodyParameter("Sqls" , new Gson().toJson(sqls));
		}	
	}

	public String getDatabase() {
		return this.database;
	}

	public void setDatabase(String database) {
		this.database = database;
		if(database != null){
			putQueryParameter("Database", database);
		}
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getStatementName() {
		return this.statementName;
	}

	public void setStatementName(String statementName) {
		this.statementName = statementName;
		if(statementName != null){
			putQueryParameter("StatementName", statementName);
		}
	}

	public String getRunType() {
		return this.runType;
	}

	public void setRunType(String runType) {
		this.runType = runType;
		if(runType != null){
			putQueryParameter("RunType", runType);
		}
	}

	public List<Object> getParameters() {
		return this.parameters;
	}

	public void setParameters(List<Object> parameters) {
		this.parameters = parameters;	
		if (parameters != null) {
			putBodyParameter("Parameters" , new Gson().toJson(parameters));
		}	
	}

	public String getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
		this.workspaceId = workspaceId;
		if(workspaceId != null){
			putQueryParameter("WorkspaceId", workspaceId);
		}
	}

	public static class RagWorkspaceCollection {

		@SerializedName("Namespace")
		private String namespace;

		@SerializedName("Collection")
		private String collection;

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getCollection() {
			return this.collection;
		}

		public void setCollection(String collection) {
			this.collection = collection;
		}
	}

	@Override
	public Class<ExecuteStatementResponse> getResponseClass() {
		return ExecuteStatementResponse.class;
	}

}
