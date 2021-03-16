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
import com.aliyuncs.ecsops.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryEventEndRequest extends RpcAcsRequest<OpsQueryEventEndResponse> {
	   

	private String aliUids;

	private String eventStartTimes;

	private String exceptionName;

	private String queryEndTime;

	private String instanceIds;

	private String queryStartTime;

	private String eventStatus;

	private String clusters;

	private String auditParamStr;
	public OpsQueryEventEndRequest() {
		super("Ecsops", "2016-04-01", "OpsQueryEventEnd", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAliUids() {
		return this.aliUids;
	}

	public void setAliUids(String aliUids) {
		this.aliUids = aliUids;
		if(aliUids != null){
			putQueryParameter("AliUids", aliUids);
		}
	}

	public String getEventStartTimes() {
		return this.eventStartTimes;
	}

	public void setEventStartTimes(String eventStartTimes) {
		this.eventStartTimes = eventStartTimes;
		if(eventStartTimes != null){
			putQueryParameter("EventStartTimes", eventStartTimes);
		}
	}

	public String getExceptionName() {
		return this.exceptionName;
	}

	public void setExceptionName(String exceptionName) {
		this.exceptionName = exceptionName;
		if(exceptionName != null){
			putQueryParameter("ExceptionName", exceptionName);
		}
	}

	public String getQueryEndTime() {
		return this.queryEndTime;
	}

	public void setQueryEndTime(String queryEndTime) {
		this.queryEndTime = queryEndTime;
		if(queryEndTime != null){
			putQueryParameter("QueryEndTime", queryEndTime);
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

	public String getQueryStartTime() {
		return this.queryStartTime;
	}

	public void setQueryStartTime(String queryStartTime) {
		this.queryStartTime = queryStartTime;
		if(queryStartTime != null){
			putQueryParameter("QueryStartTime", queryStartTime);
		}
	}

	public String getEventStatus() {
		return this.eventStatus;
	}

	public void setEventStatus(String eventStatus) {
		this.eventStatus = eventStatus;
		if(eventStatus != null){
			putQueryParameter("EventStatus", eventStatus);
		}
	}

	public String getClusters() {
		return this.clusters;
	}

	public void setClusters(String clusters) {
		this.clusters = clusters;
		if(clusters != null){
			putQueryParameter("Clusters", clusters);
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
	public Class<OpsQueryEventEndResponse> getResponseClass() {
		return OpsQueryEventEndResponse.class;
	}

}
