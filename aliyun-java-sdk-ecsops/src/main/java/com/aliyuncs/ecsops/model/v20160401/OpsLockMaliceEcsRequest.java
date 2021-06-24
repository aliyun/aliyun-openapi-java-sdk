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
public class OpsLockMaliceEcsRequest extends RpcAcsRequest<OpsLockMaliceEcsResponse> {
	   

	private String reason;

	private String operator;

	private String businessOperator;

	private String proof;

	private String workOrderId;

	private String instanceId;

	private String lockType;

	private String auditParamStr;
	public OpsLockMaliceEcsRequest() {
		super("Ecsops", "2016-04-01", "OpsLockMaliceEcs", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
		if(reason != null){
			putQueryParameter("Reason", reason);
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

	public String getBusinessOperator() {
		return this.businessOperator;
	}

	public void setBusinessOperator(String businessOperator) {
		this.businessOperator = businessOperator;
		if(businessOperator != null){
			putQueryParameter("BusinessOperator", businessOperator);
		}
	}

	public String getProof() {
		return this.proof;
	}

	public void setProof(String proof) {
		this.proof = proof;
		if(proof != null){
			putQueryParameter("Proof", proof);
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

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getLockType() {
		return this.lockType;
	}

	public void setLockType(String lockType) {
		this.lockType = lockType;
		if(lockType != null){
			putQueryParameter("LockType", lockType);
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
	public Class<OpsLockMaliceEcsResponse> getResponseClass() {
		return OpsLockMaliceEcsResponse.class;
	}

}
