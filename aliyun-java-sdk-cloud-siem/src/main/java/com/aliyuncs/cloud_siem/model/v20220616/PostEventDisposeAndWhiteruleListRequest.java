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

package com.aliyuncs.cloud_siem.model.v20220616;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class PostEventDisposeAndWhiteruleListRequest extends RpcAcsRequest<PostEventDisposeAndWhiteruleListResponse> {
	   

	private String responseSource;

	private Long roleFor;

	private String remark;

	private String eventDispose;

	private String disposeStrategyIds;

	private String receiverInfo;

	private Integer roleType;

	private String owner;

	private String threatLevel;

	private String incidentUuid;

	private Integer status;
	public PostEventDisposeAndWhiteruleListRequest() {
		super("cloud-siem", "2022-06-16", "PostEventDisposeAndWhiteruleList", "cloud-siem");
		setMethod(MethodType.POST);
	}

	public String getResponseSource() {
		return this.responseSource;
	}

	public void setResponseSource(String responseSource) {
		this.responseSource = responseSource;
		if(responseSource != null){
			putBodyParameter("ResponseSource", responseSource);
		}
	}

	public Long getRoleFor() {
		return this.roleFor;
	}

	public void setRoleFor(Long roleFor) {
		this.roleFor = roleFor;
		if(roleFor != null){
			putBodyParameter("RoleFor", roleFor.toString());
		}
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		if(remark != null){
			putBodyParameter("Remark", remark);
		}
	}

	public String getEventDispose() {
		return this.eventDispose;
	}

	public void setEventDispose(String eventDispose) {
		this.eventDispose = eventDispose;
		if(eventDispose != null){
			putBodyParameter("EventDispose", eventDispose);
		}
	}

	public String getDisposeStrategyIds() {
		return this.disposeStrategyIds;
	}

	public void setDisposeStrategyIds(String disposeStrategyIds) {
		this.disposeStrategyIds = disposeStrategyIds;
		if(disposeStrategyIds != null){
			putBodyParameter("DisposeStrategyIds", disposeStrategyIds);
		}
	}

	public String getReceiverInfo() {
		return this.receiverInfo;
	}

	public void setReceiverInfo(String receiverInfo) {
		this.receiverInfo = receiverInfo;
		if(receiverInfo != null){
			putBodyParameter("ReceiverInfo", receiverInfo);
		}
	}

	public Integer getRoleType() {
		return this.roleType;
	}

	public void setRoleType(Integer roleType) {
		this.roleType = roleType;
		if(roleType != null){
			putBodyParameter("RoleType", roleType.toString());
		}
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
		if(owner != null){
			putBodyParameter("Owner", owner);
		}
	}

	public String getThreatLevel() {
		return this.threatLevel;
	}

	public void setThreatLevel(String threatLevel) {
		this.threatLevel = threatLevel;
		if(threatLevel != null){
			putBodyParameter("ThreatLevel", threatLevel);
		}
	}

	public String getIncidentUuid() {
		return this.incidentUuid;
	}

	public void setIncidentUuid(String incidentUuid) {
		this.incidentUuid = incidentUuid;
		if(incidentUuid != null){
			putBodyParameter("IncidentUuid", incidentUuid);
		}
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status.toString());
		}
	}

	@Override
	public Class<PostEventDisposeAndWhiteruleListResponse> getResponseClass() {
		return PostEventDisposeAndWhiteruleListResponse.class;
	}

}
