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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.oceanbasepro.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeOasTopSQLListRequest extends RpcAcsRequest<DescribeOasTopSQLListResponse> {
	   

	private String startTime;

	private String searchRule;

	private Boolean mergeDynamicSql;

	private Boolean dynamicSql;

	private Long sqlTextLength;

	private String tenantId;

	private String searchValue;

	private String sqlId;

	private String filterCondition;

	private String searchParam;

	private String endTime;

	private String nodeIp;

	private String instanceId;

	private String dbName;

	private String searchKeyWord;

	private String acceptLanguage;
	public DescribeOasTopSQLListRequest() {
		super("OceanBasePro", "2019-09-01", "DescribeOasTopSQLList", "oceanbase");
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

	public String getSearchRule() {
		return this.searchRule;
	}

	public void setSearchRule(String searchRule) {
		this.searchRule = searchRule;
		if(searchRule != null){
			putBodyParameter("SearchRule", searchRule);
		}
	}

	public Boolean getMergeDynamicSql() {
		return this.mergeDynamicSql;
	}

	public void setMergeDynamicSql(Boolean mergeDynamicSql) {
		this.mergeDynamicSql = mergeDynamicSql;
		if(mergeDynamicSql != null){
			putBodyParameter("MergeDynamicSql", mergeDynamicSql.toString());
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

	public Long getSqlTextLength() {
		return this.sqlTextLength;
	}

	public void setSqlTextLength(Long sqlTextLength) {
		this.sqlTextLength = sqlTextLength;
		if(sqlTextLength != null){
			putBodyParameter("SqlTextLength", sqlTextLength.toString());
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

	public String getSearchValue() {
		return this.searchValue;
	}

	public void setSearchValue(String searchValue) {
		this.searchValue = searchValue;
		if(searchValue != null){
			putBodyParameter("SearchValue", searchValue);
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

	public String getFilterCondition() {
		return this.filterCondition;
	}

	public void setFilterCondition(String filterCondition) {
		this.filterCondition = filterCondition;
		if(filterCondition != null){
			putBodyParameter("FilterCondition", filterCondition);
		}
	}

	public String getSearchParam() {
		return this.searchParam;
	}

	public void setSearchParam(String searchParam) {
		this.searchParam = searchParam;
		if(searchParam != null){
			putBodyParameter("SearchParam", searchParam);
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

	public String getNodeIp() {
		return this.nodeIp;
	}

	public void setNodeIp(String nodeIp) {
		this.nodeIp = nodeIp;
		if(nodeIp != null){
			putBodyParameter("NodeIp", nodeIp);
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

	public String getDbName() {
		return this.dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
		if(dbName != null){
			putBodyParameter("DbName", dbName);
		}
	}

	public String getSearchKeyWord() {
		return this.searchKeyWord;
	}

	public void setSearchKeyWord(String searchKeyWord) {
		this.searchKeyWord = searchKeyWord;
		if(searchKeyWord != null){
			putBodyParameter("SearchKeyWord", searchKeyWord);
		}
	}

	public String getAcceptLanguage() {
		return this.acceptLanguage;
	}

	public void setAcceptLanguage(String acceptLanguage) {
		this.acceptLanguage = acceptLanguage;
		if(acceptLanguage != null){
			putBodyParameter("AcceptLanguage", acceptLanguage);
		}
	}

	@Override
	public Class<DescribeOasTopSQLListResponse> getResponseClass() {
		return DescribeOasTopSQLListResponse.class;
	}

}
