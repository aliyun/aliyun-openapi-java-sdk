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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.gpdb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeSQLLogsV2Request extends RpcAcsRequest<DescribeSQLLogsV2Response> {
	   

	private String startTime;

	private String queryKeywords;

	private String pageNumber;

	private String resourceGroupId;

	private String database;

	private String sourceIP;

	private String minExecuteCost;

	private String pageSize;

	private String dBInstanceId;

	private String maxExecuteCost;

	private String executeCost;

	private String executeState;

	private String endTime;

	private String operationType;

	private String operationClass;

	private String user;
	public DescribeSQLLogsV2Request() {
		super("gpdb", "2016-05-03", "DescribeSQLLogsV2", "gpdb");
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
			putQueryParameter("StartTime", startTime);
		}
	}

	public String getQueryKeywords() {
		return this.queryKeywords;
	}

	public void setQueryKeywords(String queryKeywords) {
		this.queryKeywords = queryKeywords;
		if(queryKeywords != null){
			putQueryParameter("QueryKeywords", queryKeywords);
		}
	}

	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber);
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
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

	public String getSourceIP() {
		return this.sourceIP;
	}

	public void setSourceIP(String sourceIP) {
		this.sourceIP = sourceIP;
		if(sourceIP != null){
			putQueryParameter("SourceIP", sourceIP);
		}
	}

	public String getMinExecuteCost() {
		return this.minExecuteCost;
	}

	public void setMinExecuteCost(String minExecuteCost) {
		this.minExecuteCost = minExecuteCost;
		if(minExecuteCost != null){
			putQueryParameter("MinExecuteCost", minExecuteCost);
		}
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize);
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

	public String getMaxExecuteCost() {
		return this.maxExecuteCost;
	}

	public void setMaxExecuteCost(String maxExecuteCost) {
		this.maxExecuteCost = maxExecuteCost;
		if(maxExecuteCost != null){
			putQueryParameter("MaxExecuteCost", maxExecuteCost);
		}
	}

	public String getExecuteCost() {
		return this.executeCost;
	}

	public void setExecuteCost(String executeCost) {
		this.executeCost = executeCost;
		if(executeCost != null){
			putQueryParameter("ExecuteCost", executeCost);
		}
	}

	public String getExecuteState() {
		return this.executeState;
	}

	public void setExecuteState(String executeState) {
		this.executeState = executeState;
		if(executeState != null){
			putQueryParameter("ExecuteState", executeState);
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

	public String getOperationType() {
		return this.operationType;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
		if(operationType != null){
			putQueryParameter("OperationType", operationType);
		}
	}

	public String getOperationClass() {
		return this.operationClass;
	}

	public void setOperationClass(String operationClass) {
		this.operationClass = operationClass;
		if(operationClass != null){
			putQueryParameter("OperationClass", operationClass);
		}
	}

	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
		if(user != null){
			putQueryParameter("User", user);
		}
	}

	@Override
	public Class<DescribeSQLLogsV2Response> getResponseClass() {
		return DescribeSQLLogsV2Response.class;
	}

}
