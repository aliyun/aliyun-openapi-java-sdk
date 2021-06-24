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
public class OpsMarkRecyclingInstancesRequest extends RpcAcsRequest<OpsMarkRecyclingInstancesResponse> {
	   

	private Boolean ignoreNotifyConfig;

	private String operator;

	private Boolean ignoreRetainTime;

	private String houyiZoneNo;

	private String workOrderId;

	private String instanceIds;

	private String auditParamStr;
	public OpsMarkRecyclingInstancesRequest() {
		super("Ecsops", "2016-04-01", "OpsMarkRecyclingInstances", "ecsops");
		setMethod(MethodType.POST);
	}

	public Boolean getIgnoreNotifyConfig() {
		return this.ignoreNotifyConfig;
	}

	public void setIgnoreNotifyConfig(Boolean ignoreNotifyConfig) {
		this.ignoreNotifyConfig = ignoreNotifyConfig;
		if(ignoreNotifyConfig != null){
			putQueryParameter("IgnoreNotifyConfig", ignoreNotifyConfig.toString());
		}
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putQueryParameter("Operator", operator);
		}
	}

	public Boolean getIgnoreRetainTime() {
		return this.ignoreRetainTime;
	}

	public void setIgnoreRetainTime(Boolean ignoreRetainTime) {
		this.ignoreRetainTime = ignoreRetainTime;
		if(ignoreRetainTime != null){
			putQueryParameter("IgnoreRetainTime", ignoreRetainTime.toString());
		}
	}

	public String getHouyiZoneNo() {
		return this.houyiZoneNo;
	}

	public void setHouyiZoneNo(String houyiZoneNo) {
		this.houyiZoneNo = houyiZoneNo;
		if(houyiZoneNo != null){
			putQueryParameter("HouyiZoneNo", houyiZoneNo);
		}
	}

	public String getWorkOrderId() {
		return this.workOrderId;
	}

	public void setWorkOrderId(String workOrderId) {
		this.workOrderId = workOrderId;
		if(workOrderId != null){
			putQueryParameter("WorkOrderId", workOrderId);
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
	public Class<OpsMarkRecyclingInstancesResponse> getResponseClass() {
		return OpsMarkRecyclingInstancesResponse.class;
	}

}
