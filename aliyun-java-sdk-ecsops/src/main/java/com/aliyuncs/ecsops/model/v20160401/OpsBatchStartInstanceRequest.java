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
import com.aliyuncs.ecsops.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OpsBatchStartInstanceRequest extends RpcAcsRequest<OpsBatchStartInstanceResponse> {
	   

	private String forceStartupMode;

	private String operator;

	private String mode;

	private String batchOptimization;

	private Boolean initLocalDisk;

	private Boolean dryRun;

	private String token;

	private String workOrderId;

	private List<String> instanceIds;

	private String auditParamStr;
	public OpsBatchStartInstanceRequest() {
		super("Ecsops", "2016-04-01", "OpsBatchStartInstance", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getForceStartupMode() {
		return this.forceStartupMode;
	}

	public void setForceStartupMode(String forceStartupMode) {
		this.forceStartupMode = forceStartupMode;
		if(forceStartupMode != null){
			putQueryParameter("ForceStartupMode", forceStartupMode);
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

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
		if(mode != null){
			putQueryParameter("Mode", mode);
		}
	}

	public String getBatchOptimization() {
		return this.batchOptimization;
	}

	public void setBatchOptimization(String batchOptimization) {
		this.batchOptimization = batchOptimization;
		if(batchOptimization != null){
			putQueryParameter("BatchOptimization", batchOptimization);
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

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
		}
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putQueryParameter("Token", token);
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

	public List<String> getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(List<String> instanceIds) {
		this.instanceIds = instanceIds;	
		if (instanceIds != null) {
			for (int i = 0; i < instanceIds.size(); i++) {
				putQueryParameter("InstanceId." + (i + 1) , instanceIds.get(i));
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
	public Class<OpsBatchStartInstanceResponse> getResponseClass() {
		return OpsBatchStartInstanceResponse.class;
	}

}
