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

package com.aliyuncs.opensearch.model.v20171225;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.opensearch.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListStatisticLogsRequest extends RoaAcsRequest<ListStatisticLogsResponse> {
	   

	private String columns;

	private String query;

	private Integer pageSize;

	private String moduleName;

	private Boolean distinct;

	private String sortBy;

	private Integer startTime;

	private Integer stopTime;

	private String appGroupIdentity;

	private Integer pageNumber;
	public ListStatisticLogsRequest() {
		super("OpenSearch", "2017-12-25", "ListStatisticLogs", "opensearch");
		setUriPattern("/v4/openapi/app-groups/[appGroupIdentity]/statistic-logs/[moduleName]");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getColumns() {
		return this.columns;
	}

	public void setColumns(String columns) {
		this.columns = columns;
		if(columns != null){
			putQueryParameter("columns", columns);
		}
	}

	public String getQuery() {
		return this.query;
	}

	public void setQuery(String query) {
		this.query = query;
		if(query != null){
			putQueryParameter("query", query);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("pageSize", pageSize.toString());
		}
	}

	public String getModuleName() {
		return this.moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
		if(moduleName != null){
			putPathParameter("moduleName", moduleName);
		}
	}

	public Boolean getDistinct() {
		return this.distinct;
	}

	public void setDistinct(Boolean distinct) {
		this.distinct = distinct;
		if(distinct != null){
			putQueryParameter("distinct", distinct.toString());
		}
	}

	public String getSortBy() {
		return this.sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
		if(sortBy != null){
			putQueryParameter("sortBy", sortBy);
		}
	}

	public Integer getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Integer startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("startTime", startTime.toString());
		}
	}

	public Integer getStopTime() {
		return this.stopTime;
	}

	public void setStopTime(Integer stopTime) {
		this.stopTime = stopTime;
		if(stopTime != null){
			putQueryParameter("stopTime", stopTime.toString());
		}
	}

	public String getAppGroupIdentity() {
		return this.appGroupIdentity;
	}

	public void setAppGroupIdentity(String appGroupIdentity) {
		this.appGroupIdentity = appGroupIdentity;
		if(appGroupIdentity != null){
			putPathParameter("appGroupIdentity", appGroupIdentity);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("pageNumber", pageNumber.toString());
		}
	}

	@Override
	public Class<ListStatisticLogsResponse> getResponseClass() {
		return ListStatisticLogsResponse.class;
	}

}
