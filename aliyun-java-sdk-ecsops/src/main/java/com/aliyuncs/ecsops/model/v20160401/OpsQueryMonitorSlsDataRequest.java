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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryMonitorSlsDataRequest extends RpcAcsRequest<OpsQueryMonitorSlsDataResponse> {
	   

	private String startTime;

	private String logstoreName;

	private String query;

	private String endTime;

	private String monitorResultFile;

	private List<String> regions;

	private String auditParamStr;
	public OpsQueryMonitorSlsDataRequest() {
		super("Ecsops", "2016-04-01", "OpsQueryMonitorSlsData", "ecsops");
		setMethod(MethodType.POST);
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

	public String getLogstoreName() {
		return this.logstoreName;
	}

	public void setLogstoreName(String logstoreName) {
		this.logstoreName = logstoreName;
		if(logstoreName != null){
			putQueryParameter("LogstoreName", logstoreName);
		}
	}

	public String getQuery() {
		return this.query;
	}

	public void setQuery(String query) {
		this.query = query;
		if(query != null){
			putQueryParameter("Query", query);
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

	public String getMonitorResultFile() {
		return this.monitorResultFile;
	}

	public void setMonitorResultFile(String monitorResultFile) {
		this.monitorResultFile = monitorResultFile;
		if(monitorResultFile != null){
			putQueryParameter("MonitorResultFile", monitorResultFile);
		}
	}

	public List<String> getRegions() {
		return this.regions;
	}

	public void setRegions(List<String> regions) {
		this.regions = regions;	
		if (regions != null) {
			for (int i = 0; i < regions.size(); i++) {
				putQueryParameter("Region." + (i + 1) , regions.get(i));
			}
		}	
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsQueryMonitorSlsDataResponse> getResponseClass() {
		return OpsQueryMonitorSlsDataResponse.class;
	}

}
