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

package com.aliyuncs.das.model.v20200116;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.das.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QuerySqlAnalysisDataRequest extends RpcAcsRequest<QuerySqlAnalysisDataResponse> {
	   

	private String consoleContext;

	private String taskId;

	private String sqlIdList;

	private String type;

	private String sqlTextFeature;

	private String sqlType;

	private Integer pageNo;

	private Integer pageSize;
	public QuerySqlAnalysisDataRequest() {
		super("DAS", "2020-01-16", "QuerySqlAnalysisData");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getConsoleContext() {
		return this.consoleContext;
	}

	public void setConsoleContext(String consoleContext) {
		this.consoleContext = consoleContext;
		if(consoleContext != null){
			putQueryParameter("ConsoleContext", consoleContext);
		}
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putBodyParameter("TaskId", taskId);
		}
	}

	public String getSqlIdList() {
		return this.sqlIdList;
	}

	public void setSqlIdList(String sqlIdList) {
		this.sqlIdList = sqlIdList;
		if(sqlIdList != null){
			putBodyParameter("SqlIdList", sqlIdList);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type);
		}
	}

	public String getSqlTextFeature() {
		return this.sqlTextFeature;
	}

	public void setSqlTextFeature(String sqlTextFeature) {
		this.sqlTextFeature = sqlTextFeature;
		if(sqlTextFeature != null){
			putBodyParameter("SqlTextFeature", sqlTextFeature);
		}
	}

	public String getSqlType() {
		return this.sqlType;
	}

	public void setSqlType(String sqlType) {
		this.sqlType = sqlType;
		if(sqlType != null){
			putBodyParameter("SqlType", sqlType);
		}
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
		if(pageNo != null){
			putBodyParameter("PageNo", pageNo.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	@Override
	public Class<QuerySqlAnalysisDataResponse> getResponseClass() {
		return QuerySqlAnalysisDataResponse.class;
	}

}
