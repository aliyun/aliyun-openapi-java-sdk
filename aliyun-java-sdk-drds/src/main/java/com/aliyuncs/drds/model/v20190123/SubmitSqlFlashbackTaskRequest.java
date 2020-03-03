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

package com.aliyuncs.drds.model.v20190123;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.drds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SubmitSqlFlashbackTaskRequest extends RpcAcsRequest<SubmitSqlFlashbackTaskResponse> {
	   

	private String traceId;

	private String sqlPk;

	private String startTime;

	private Integer recallRestoreType;

	private String tableName;

	private String sqlType;

	private String endTime;

	private String drdsInstanceId;

	private Integer recallType;

	private String dbName;
	public SubmitSqlFlashbackTaskRequest() {
		super("Drds", "2019-01-23", "SubmitSqlFlashbackTask", "Drds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTraceId() {
		return this.traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
		if(traceId != null){
			putQueryParameter("TraceId", traceId);
		}
	}

	public String getSqlPk() {
		return this.sqlPk;
	}

	public void setSqlPk(String sqlPk) {
		this.sqlPk = sqlPk;
		if(sqlPk != null){
			putQueryParameter("SqlPk", sqlPk);
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
		}
	}

	public Integer getRecallRestoreType() {
		return this.recallRestoreType;
	}

	public void setRecallRestoreType(Integer recallRestoreType) {
		this.recallRestoreType = recallRestoreType;
		if(recallRestoreType != null){
			putQueryParameter("RecallRestoreType", recallRestoreType.toString());
		}
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
		if(tableName != null){
			putQueryParameter("TableName", tableName);
		}
	}

	public String getSqlType() {
		return this.sqlType;
	}

	public void setSqlType(String sqlType) {
		this.sqlType = sqlType;
		if(sqlType != null){
			putQueryParameter("SqlType", sqlType);
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
		}
	}

	public String getDrdsInstanceId() {
		return this.drdsInstanceId;
	}

	public void setDrdsInstanceId(String drdsInstanceId) {
		this.drdsInstanceId = drdsInstanceId;
		if(drdsInstanceId != null){
			putQueryParameter("DrdsInstanceId", drdsInstanceId);
		}
	}

	public Integer getRecallType() {
		return this.recallType;
	}

	public void setRecallType(Integer recallType) {
		this.recallType = recallType;
		if(recallType != null){
			putQueryParameter("RecallType", recallType.toString());
		}
	}

	public String getDbName() {
		return this.dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
		if(dbName != null){
			putQueryParameter("DbName", dbName);
		}
	}

	@Override
	public Class<SubmitSqlFlashbackTaskResponse> getResponseClass() {
		return SubmitSqlFlashbackTaskResponse.class;
	}

}
