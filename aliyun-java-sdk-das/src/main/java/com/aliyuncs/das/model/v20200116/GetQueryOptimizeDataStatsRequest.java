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
public class GetQueryOptimizeDataStatsRequest extends RpcAcsRequest<GetQueryOptimizeDataStatsResponse> {
	   

	private String sqlIds;

	private String keywords;

	private String rules;

	private String engine;

	private String pageSize;

	private String onlyOptimizedSql;

	private String orderBy;

	private String tagNames;

	private String dbNames;

	private String logicalOperator;

	private String asc;

	private String instanceIds;

	private String pageNo;

	private String time;
	public GetQueryOptimizeDataStatsRequest() {
		super("DAS", "2020-01-16", "GetQueryOptimizeDataStats");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSqlIds() {
		return this.sqlIds;
	}

	public void setSqlIds(String sqlIds) {
		this.sqlIds = sqlIds;
		if(sqlIds != null){
			putQueryParameter("SqlIds", sqlIds);
		}
	}

	public String getKeywords() {
		return this.keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
		if(keywords != null){
			putQueryParameter("Keywords", keywords);
		}
	}

	public String getRules() {
		return this.rules;
	}

	public void setRules(String rules) {
		this.rules = rules;
		if(rules != null){
			putQueryParameter("Rules", rules);
		}
	}

	public String getEngine() {
		return this.engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
		if(engine != null){
			putQueryParameter("Engine", engine);
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

	public String getOnlyOptimizedSql() {
		return this.onlyOptimizedSql;
	}

	public void setOnlyOptimizedSql(String onlyOptimizedSql) {
		this.onlyOptimizedSql = onlyOptimizedSql;
		if(onlyOptimizedSql != null){
			putQueryParameter("OnlyOptimizedSql", onlyOptimizedSql);
		}
	}

	public String getOrderBy() {
		return this.orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
		if(orderBy != null){
			putQueryParameter("OrderBy", orderBy);
		}
	}

	public String getTagNames() {
		return this.tagNames;
	}

	public void setTagNames(String tagNames) {
		this.tagNames = tagNames;
		if(tagNames != null){
			putQueryParameter("TagNames", tagNames);
		}
	}

	public String getDbNames() {
		return this.dbNames;
	}

	public void setDbNames(String dbNames) {
		this.dbNames = dbNames;
		if(dbNames != null){
			putQueryParameter("DbNames", dbNames);
		}
	}

	public String getLogicalOperator() {
		return this.logicalOperator;
	}

	public void setLogicalOperator(String logicalOperator) {
		this.logicalOperator = logicalOperator;
		if(logicalOperator != null){
			putQueryParameter("LogicalOperator", logicalOperator);
		}
	}

	public String getAsc() {
		return this.asc;
	}

	public void setAsc(String asc) {
		this.asc = asc;
		if(asc != null){
			putQueryParameter("Asc", asc);
		}
	}

	public String getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(String instanceIds) {
		this.instanceIds = instanceIds;
		if(instanceIds != null){
			putQueryParameter("InstanceIds", instanceIds);
		}
	}

	public String getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
		if(pageNo != null){
			putQueryParameter("PageNo", pageNo);
		}
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
		if(time != null){
			putQueryParameter("Time", time);
		}
	}

	@Override
	public Class<GetQueryOptimizeDataStatsResponse> getResponseClass() {
		return GetQueryOptimizeDataStatsResponse.class;
	}

}
