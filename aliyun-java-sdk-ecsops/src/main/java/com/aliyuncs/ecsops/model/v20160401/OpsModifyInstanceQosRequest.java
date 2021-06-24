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
public class OpsModifyInstanceQosRequest extends RpcAcsRequest<OpsModifyInstanceQosResponse> {
	   

	private String operator;

	private Long iops;

	private Long bps;

	private String instanceId;

	private String auditParamStr;
	public OpsModifyInstanceQosRequest() {
		super("Ecsops", "2016-04-01", "OpsModifyInstanceQos", "ecsops");
		setMethod(MethodType.POST);
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

	public Long getIops() {
		return this.iops;
	}

	public void setIops(Long iops) {
		this.iops = iops;
		if(iops != null){
			putQueryParameter("Iops", iops.toString());
		}
	}

	public Long getBps() {
		return this.bps;
	}

	public void setBps(Long bps) {
		this.bps = bps;
		if(bps != null){
			putQueryParameter("Bps", bps.toString());
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
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
	public Class<OpsModifyInstanceQosResponse> getResponseClass() {
		return OpsModifyInstanceQosResponse.class;
	}

}
