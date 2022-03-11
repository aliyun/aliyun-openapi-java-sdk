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
public class DownloadDiagnosisRecordsRequest extends RpcAcsRequest<DownloadDiagnosisRecordsResponse> {
	   

	private Long maxScanSize;

	private String resourceGroup;

	private String dBClusterId;

	private String queryCondition;

	private String endTime;

	private String startTime;

	private Long minPeakMemory;

	private Long minScanSize;

	private String database;

	private String clientIp;

	private Long maxPeakMemory;

	private String keyword;

	private String lang;

	private String userName;
	public DownloadDiagnosisRecordsRequest() {
		super("adb", "2019-03-15", "DownloadDiagnosisRecords", "ads");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getQueryCondition() {
		return this.queryCondition;
	}

	public void setQueryCondition(String queryCondition) {
		this.queryCondition = queryCondition;
		if(queryCondition != null){
			putQueryParameter("QueryCondition", queryCondition);
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

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
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

	public Long getMaxPeakMemory() {
		return this.maxPeakMemory;
	}

	public void setMaxPeakMemory(Long maxPeakMemory) {
		this.maxPeakMemory = maxPeakMemory;
		if(maxPeakMemory != null){
			putQueryParameter("MaxPeakMemory", maxPeakMemory.toString());
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
	public Class<DownloadDiagnosisRecordsResponse> getResponseClass() {
		return DownloadDiagnosisRecordsResponse.class;
	}

}
