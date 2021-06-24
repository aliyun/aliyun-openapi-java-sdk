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
public class OpsMigrateEcsInstanceRequest extends RpcAcsRequest<OpsMigrateEcsInstanceResponse> {
	   

	private String operator;

	private String recoverPolicy;

	private String recoverMode;

	private Boolean initLocalDisk;

	private String destinationNcId;

	private String destinationRackId;

	private String startupMode;

	private String workOrderId;

	private String instanceId;

	private String auditParamStr;
	public OpsMigrateEcsInstanceRequest() {
		super("Ecsops", "2016-04-01", "OpsMigrateEcsInstance", "ecsops");
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

	public String getRecoverPolicy() {
		return this.recoverPolicy;
	}

	public void setRecoverPolicy(String recoverPolicy) {
		this.recoverPolicy = recoverPolicy;
		if(recoverPolicy != null){
			putQueryParameter("RecoverPolicy", recoverPolicy);
		}
	}

	public String getRecoverMode() {
		return this.recoverMode;
	}

	public void setRecoverMode(String recoverMode) {
		this.recoverMode = recoverMode;
		if(recoverMode != null){
			putQueryParameter("RecoverMode", recoverMode);
		}
	}

	public Boolean getInitLocalDisk() {
		return this.initLocalDisk;
	}

	public void setInitLocalDisk(Boolean initLocalDisk) {
		this.initLocalDisk = initLocalDisk;
		if(initLocalDisk != null){
			putQueryParameter("InitLocalDisk", initLocalDisk.toString());
		}
	}

	public String getDestinationNcId() {
		return this.destinationNcId;
	}

	public void setDestinationNcId(String destinationNcId) {
		this.destinationNcId = destinationNcId;
		if(destinationNcId != null){
			putQueryParameter("DestinationNcId", destinationNcId);
		}
	}

	public String getDestinationRackId() {
		return this.destinationRackId;
	}

	public void setDestinationRackId(String destinationRackId) {
		this.destinationRackId = destinationRackId;
		if(destinationRackId != null){
			putQueryParameter("DestinationRackId", destinationRackId);
		}
	}

	public String getStartupMode() {
		return this.startupMode;
	}

	public void setStartupMode(String startupMode) {
		this.startupMode = startupMode;
		if(startupMode != null){
			putQueryParameter("StartupMode", startupMode);
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
	public Class<OpsMigrateEcsInstanceResponse> getResponseClass() {
		return OpsMigrateEcsInstanceResponse.class;
	}

}
