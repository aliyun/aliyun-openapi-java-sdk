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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryDWSMetadataTablesRequest extends RpcAcsRequest<QueryDWSMetadataTablesResponse> {
	   

	private Long pageSize;

	private String tableName;

	private String pageToken;

	private String logicTableArn;

	private String instanceId;

	private String dbType;
	public QueryDWSMetadataTablesRequest() {
		super("SOFA", "2019-08-15", "QueryDWSMetadataTables", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
		if(tableName != null){
			putBodyParameter("TableName", tableName);
		}
	}

	public String getPageToken() {
		return this.pageToken;
	}

	public void setPageToken(String pageToken) {
		this.pageToken = pageToken;
		if(pageToken != null){
			putBodyParameter("PageToken", pageToken);
		}
	}

	public String getLogicTableArn() {
		return this.logicTableArn;
	}

	public void setLogicTableArn(String logicTableArn) {
		this.logicTableArn = logicTableArn;
		if(logicTableArn != null){
			putBodyParameter("LogicTableArn", logicTableArn);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public String getDbType() {
		return this.dbType;
	}

	public void setDbType(String dbType) {
		this.dbType = dbType;
		if(dbType != null){
			putBodyParameter("DbType", dbType);
		}
	}

	@Override
	public Class<QueryDWSMetadataTablesResponse> getResponseClass() {
		return QueryDWSMetadataTablesResponse.class;
	}

}
