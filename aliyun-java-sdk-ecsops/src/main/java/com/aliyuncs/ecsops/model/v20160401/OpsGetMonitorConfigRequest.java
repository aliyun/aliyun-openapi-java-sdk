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
public class OpsGetMonitorConfigRequest extends RpcAcsRequest<OpsGetMonitorConfigResponse> {
	   

	private String monitorType;

	private String needRelatedSlsUrl;

	private Integer returnOffset;

	private Integer returnNum;

	private String monitorName;

	private String auditParamStr;
	public OpsGetMonitorConfigRequest() {
		super("Ecsops", "2016-04-01", "OpsGetMonitorConfig", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMonitorType() {
		return this.monitorType;
	}

	public void setMonitorType(String monitorType) {
		this.monitorType = monitorType;
		if(monitorType != null){
			putQueryParameter("MonitorType", monitorType);
		}
	}

	public String getNeedRelatedSlsUrl() {
		return this.needRelatedSlsUrl;
	}

	public void setNeedRelatedSlsUrl(String needRelatedSlsUrl) {
		this.needRelatedSlsUrl = needRelatedSlsUrl;
		if(needRelatedSlsUrl != null){
			putQueryParameter("NeedRelatedSlsUrl", needRelatedSlsUrl);
		}
	}

	public Integer getReturnOffset() {
		return this.returnOffset;
	}

	public void setReturnOffset(Integer returnOffset) {
		this.returnOffset = returnOffset;
		if(returnOffset != null){
			putQueryParameter("ReturnOffset", returnOffset.toString());
		}
	}

	public Integer getReturnNum() {
		return this.returnNum;
	}

	public void setReturnNum(Integer returnNum) {
		this.returnNum = returnNum;
		if(returnNum != null){
			putQueryParameter("ReturnNum", returnNum.toString());
		}
	}

	public String getMonitorName() {
		return this.monitorName;
	}

	public void setMonitorName(String monitorName) {
		this.monitorName = monitorName;
		if(monitorName != null){
			putQueryParameter("MonitorName", monitorName);
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
	public Class<OpsGetMonitorConfigResponse> getResponseClass() {
		return OpsGetMonitorConfigResponse.class;
	}

}
