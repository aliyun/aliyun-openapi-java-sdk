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
public class DescribeSlowSQLListRequest extends RpcAcsRequest<DescribeSlowSQLListResponse> {
	   

	private String startTime;

	private Integer pageNumber;

	private String searchRule;

	private String tenantId;

	private Integer pageSize;

	private String searchParameter;

	private String sortOrder;

	private String searchValue;

	private String sQLId;

	private String filterCondition;

	private String endTime;

	private String nodeIp;

	private String dbName;

	private String searchKeyWord;

	private String sortColumn;
	public DescribeSlowSQLListRequest() {
		super("OceanBasePro", "2019-09-01", "DescribeSlowSQLList", "oceanbase");
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber.toString());
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

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId);
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

	public String getSearchParameter() {
		return this.searchParameter;
	}

	public void setSearchParameter(String searchParameter) {
		this.searchParameter = searchParameter;
		if(searchParameter != null){
			putBodyParameter("SearchParameter", searchParameter);
		}
	}

	public String getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
		if(sortOrder != null){
			putBodyParameter("SortOrder", sortOrder);
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

	public String getSQLId() {
		return this.sQLId;
	}

	public void setSQLId(String sQLId) {
		this.sQLId = sQLId;
		if(sQLId != null){
			putBodyParameter("SQLId", sQLId);
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

	public String getSortColumn() {
		return this.sortColumn;
	}

	public void setSortColumn(String sortColumn) {
		this.sortColumn = sortColumn;
		if(sortColumn != null){
			putBodyParameter("SortColumn", sortColumn);
		}
	}

	@Override
	public Class<DescribeSlowSQLListResponse> getResponseClass() {
		return DescribeSlowSQLListResponse.class;
	}

}
