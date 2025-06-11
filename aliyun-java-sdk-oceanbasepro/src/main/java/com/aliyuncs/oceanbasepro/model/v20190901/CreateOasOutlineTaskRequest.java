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

package com.aliyuncs.oceanbasepro.model.v20190901;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.oceanbasepro.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateOasOutlineTaskRequest extends RpcAcsRequest<CreateOasOutlineTaskResponse> {
	   

	private String startTime;

	private String uId;

	private Boolean dynamicSql;

	private String sqlText;

	private Boolean bySqlId;

	private Integer maxConcurrent;

	private String tenantId;

	private String statementId;

	private String tableName;

	private String sqlId;

	private String endTime;

	private String instanceId;

	private String planData;

	private String indexName;

	private String databaseName;

	private Boolean isConcurrentLimit;
	public CreateOasOutlineTaskRequest() {
		super("OceanBasePro", "2019-09-01", "CreateOasOutlineTask", "oceanbase");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putBodyParameter("StartTime", startTime);
		}
	}

	public String getUId() {
		return this.uId;
	}

	public void setUId(String uId) {
		this.uId = uId;
		if(uId != null){
			putBodyParameter("UId", uId);
		}
	}

	public Boolean getDynamicSql() {
		return this.dynamicSql;
	}

	public void setDynamicSql(Boolean dynamicSql) {
		this.dynamicSql = dynamicSql;
		if(dynamicSql != null){
			putBodyParameter("DynamicSql", dynamicSql.toString());
		}
	}

	public String getSqlText() {
		return this.sqlText;
	}

	public void setSqlText(String sqlText) {
		this.sqlText = sqlText;
		if(sqlText != null){
			putBodyParameter("SqlText", sqlText);
		}
	}

	public Boolean getBySqlId() {
		return this.bySqlId;
	}

	public void setBySqlId(Boolean bySqlId) {
		this.bySqlId = bySqlId;
		if(bySqlId != null){
			putBodyParameter("BySqlId", bySqlId.toString());
		}
	}

	public Integer getMaxConcurrent() {
		return this.maxConcurrent;
	}

	public void setMaxConcurrent(Integer maxConcurrent) {
		this.maxConcurrent = maxConcurrent;
		if(maxConcurrent != null){
			putBodyParameter("MaxConcurrent", maxConcurrent.toString());
		}
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

	public String getStatementId() {
		return this.statementId;
	}

	public void setStatementId(String statementId) {
		this.statementId = statementId;
		if(statementId != null){
			putBodyParameter("StatementId", statementId);
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

	public String getSqlId() {
		return this.sqlId;
	}

	public void setSqlId(String sqlId) {
		this.sqlId = sqlId;
		if(sqlId != null){
			putBodyParameter("SqlId", sqlId);
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putBodyParameter("EndTime", endTime);
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

	public String getPlanData() {
		return this.planData;
	}

	public void setPlanData(String planData) {
		this.planData = planData;
		if(planData != null){
			putBodyParameter("PlanData", planData);
		}
	}

	public String getIndexName() {
		return this.indexName;
	}

	public void setIndexName(String indexName) {
		this.indexName = indexName;
		if(indexName != null){
			putBodyParameter("IndexName", indexName);
		}
	}

	public String getDatabaseName() {
		return this.databaseName;
	}

	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
		if(databaseName != null){
			putBodyParameter("DatabaseName", databaseName);
		}
	}

	public Boolean getIsConcurrentLimit() {
		return this.isConcurrentLimit;
	}

	public void setIsConcurrentLimit(Boolean isConcurrentLimit) {
		this.isConcurrentLimit = isConcurrentLimit;
		if(isConcurrentLimit != null){
			putBodyParameter("IsConcurrentLimit", isConcurrentLimit.toString());
		}
	}

	@Override
	public Class<CreateOasOutlineTaskResponse> getResponseClass() {
		return CreateOasOutlineTaskResponse.class;
	}

}
