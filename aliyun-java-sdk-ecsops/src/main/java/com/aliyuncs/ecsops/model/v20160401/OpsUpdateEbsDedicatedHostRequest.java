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
public class OpsUpdateEbsDedicatedHostRequest extends RpcAcsRequest<OpsUpdateEbsDedicatedHostResponse> {
	   

	private String hostId;

	private String hostJson;

	private Integer mode;

	private String actionOnMaintenance;

	private Long aliUid;

	private Integer bizType;

	private Long izId;

	private Integer status;

	private String auditParamStr;
	public OpsUpdateEbsDedicatedHostRequest() {
		super("Ecsops", "2016-04-01", "OpsUpdateEbsDedicatedHost", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getHostId() {
		return this.hostId;
	}

	public void setHostId(String hostId) {
		this.hostId = hostId;
		if(hostId != null){
			putQueryParameter("HostId", hostId);
		}
	}

	public String getHostJson() {
		return this.hostJson;
	}

	public void setHostJson(String hostJson) {
		this.hostJson = hostJson;
		if(hostJson != null){
			putQueryParameter("HostJson", hostJson);
		}
	}

	public Integer getMode() {
		return this.mode;
	}

	public void setMode(Integer mode) {
		this.mode = mode;
		if(mode != null){
			putQueryParameter("Mode", mode.toString());
		}
	}

	public String getActionOnMaintenance() {
		return this.actionOnMaintenance;
	}

	public void setActionOnMaintenance(String actionOnMaintenance) {
		this.actionOnMaintenance = actionOnMaintenance;
		if(actionOnMaintenance != null){
			putQueryParameter("ActionOnMaintenance", actionOnMaintenance);
		}
	}

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
		if(aliUid != null){
			putQueryParameter("AliUid", aliUid.toString());
		}
	}

	public Integer getBizType() {
		return this.bizType;
	}

	public void setBizType(Integer bizType) {
		this.bizType = bizType;
		if(bizType != null){
			putQueryParameter("BizType", bizType.toString());
		}
	}

	public Long getIzId() {
		return this.izId;
	}

	public void setIzId(Long izId) {
		this.izId = izId;
		if(izId != null){
			putQueryParameter("IzId", izId.toString());
		}
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status.toString());
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
	public Class<OpsUpdateEbsDedicatedHostResponse> getResponseClass() {
		return OpsUpdateEbsDedicatedHostResponse.class;
	}

}
