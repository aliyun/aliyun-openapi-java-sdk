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

package com.aliyuncs.adb.model.v20190315;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.adb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeDiagnosisRecordsRequest extends RpcAcsRequest<DescribeDiagnosisRecordsResponse> {
	   

	private String queryCondition;

	private String startTime;

	private Integer pageNumber;

	private String database;

	private String clientIp;

	private Integer pageSize;

	private String keyword;

	private String lang;

	private String order;

	private Long maxScanSize;

	private String resourceGroup;

	private String dBClusterId;

	private Long patternId;

	private String endTime;

	private Long minPeakMemory;

	private Long minScanSize;

	private Long maxPeakMemory;

	private String userName;
	public DescribeDiagnosisRecordsRequest() {
		super("adb", "2019-03-15", "DescribeDiagnosisRecords", "ads");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getQueryCondition() {
		return this.queryCondition;
	}

	public void setQueryCondition(String queryCondition) {
		this.queryCondition = queryCondition;
		if(queryCondition != null){
			putQueryParameter("QueryCondition", queryCondition);
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
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

	public String getClientIp() {
		return this.clientIp;
	}

	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
		if(clientIp != null){
			putQueryParameter("ClientIp", clientIp);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
		if(keyword != null){
			putQueryParameter("Keyword", keyword);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public String getOrder() {
		return this.order;
	}

	public void setOrder(String order) {
		this.order = order;
		if(order != null){
			putQueryParameter("Order", order);
		}
	}

	public Long getMaxScanSize() {
		return this.maxScanSize;
	}

	public void setMaxScanSize(Long maxScanSize) {
		this.maxScanSize = maxScanSize;
		if(maxScanSize != null){
			putQueryParameter("MaxScanSize", maxScanSize.toString());
		}
	}

	public String getResourceGroup() {
		return this.resourceGroup;
	}

	public void setResourceGroup(String resourceGroup) {
		this.resourceGroup = resourceGroup;
		if(resourceGroup != null){
			putQueryParameter("ResourceGroup", resourceGroup);
		}
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
		if(dBClusterId != null){
			putQueryParameter("DBClusterId", dBClusterId);
		}
	}

	public Long getPatternId() {
		return this.patternId;
	}

	public void setPatternId(Long patternId) {
		this.patternId = patternId;
		if(patternId != null){
			putQueryParameter("PatternId", patternId.toString());
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

	public Long getMinPeakMemory() {
		return this.minPeakMemory;
	}

	public void setMinPeakMemory(Long minPeakMemory) {
		this.minPeakMemory = minPeakMemory;
		if(minPeakMemory != null){
			putQueryParameter("MinPeakMemory", minPeakMemory.toString());
		}
	}

	public Long getMinScanSize() {
		return this.minScanSize;
	}

	public void setMinScanSize(Long minScanSize) {
		this.minScanSize = minScanSize;
		if(minScanSize != null){
			putQueryParameter("MinScanSize", minScanSize.toString());
		}
	}

	public Long getMaxPeakMemory() {
		return this.maxPeakMemory;
	}

	public void setMaxPeakMemory(Long maxPeakMemory) {
		this.maxPeakMemory = maxPeakMemory;
		if(maxPeakMemory != null){
			putQueryParameter("MaxPeakMemory", maxPeakMemory.toString());
		}
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		if(userName != null){
			putQueryParameter("UserName", userName);
		}
	}

	@Override
	public Class<DescribeDiagnosisRecordsResponse> getResponseClass() {
		return DescribeDiagnosisRecordsResponse.class;
	}

}
