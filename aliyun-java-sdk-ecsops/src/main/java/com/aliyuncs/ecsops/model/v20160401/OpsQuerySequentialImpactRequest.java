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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsQuerySequentialImpactRequest extends RpcAcsRequest<OpsQuerySequentialImpactResponse> {
	   

	private String queryConditions;

	private String impactEvent;

	private Boolean defaultResultFormat;

	private String endTime;

	private String startTime;

	private String analyseConditions;

	private Integer interval;

	private String auditParamStr;
	public OpsQuerySequentialImpactRequest() {
		super("Ecsops", "2016-04-01", "OpsQuerySequentialImpact", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getQueryConditions() {
		return this.queryConditions;
	}

	public void setQueryConditions(String queryConditions) {
		this.queryConditions = queryConditions;
		if(queryConditions != null){
			putQueryParameter("QueryConditions", queryConditions);
		}
	}

	public String getImpactEvent() {
		return this.impactEvent;
	}

	public void setImpactEvent(String impactEvent) {
		this.impactEvent = impactEvent;
		if(impactEvent != null){
			putQueryParameter("ImpactEvent", impactEvent);
		}
	}

	public Boolean getDefaultResultFormat() {
		return this.defaultResultFormat;
	}

	public void setDefaultResultFormat(Boolean defaultResultFormat) {
		this.defaultResultFormat = defaultResultFormat;
		if(defaultResultFormat != null){
			putQueryParameter("DefaultResultFormat", defaultResultFormat.toString());
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

	public String getAnalyseConditions() {
		return this.analyseConditions;
	}

	public void setAnalyseConditions(String analyseConditions) {
		this.analyseConditions = analyseConditions;
		if(analyseConditions != null){
			putQueryParameter("AnalyseConditions", analyseConditions);
		}
	}

	public Integer getInterval() {
		return this.interval;
	}

	public void setInterval(Integer interval) {
		this.interval = interval;
		if(interval != null){
			putQueryParameter("Interval", interval.toString());
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
	public Class<OpsQuerySequentialImpactResponse> getResponseClass() {
		return OpsQuerySequentialImpactResponse.class;
	}

}
