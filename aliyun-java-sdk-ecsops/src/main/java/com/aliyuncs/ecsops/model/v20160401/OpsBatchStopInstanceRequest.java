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

/**
 * @author auto create
 * @version 
 */
public class OpsBatchStopInstanceRequest extends RpcAcsRequest<OpsBatchStopInstanceResponse> {
	   

	private Boolean ignoreStatus;

	private String stoppedMode;

	private Boolean hibernate;

	private String operator;

	private String batchOptimization;

	private Boolean dryRun;

	private Boolean kill;

	private String token;

	private String workOrderId;

	private List<String> instanceIds;

	private String auditParamStr;
	public OpsBatchStopInstanceRequest() {
		super("Ecsops", "2016-04-01", "OpsBatchStopInstance", "ecsops");
		setMethod(MethodType.POST);
	}

	public Boolean getIgnoreStatus() {
		return this.ignoreStatus;
	}

	public void setIgnoreStatus(Boolean ignoreStatus) {
		this.ignoreStatus = ignoreStatus;
		if(ignoreStatus != null){
			putQueryParameter("IgnoreStatus", ignoreStatus.toString());
		}
	}

	public String getStoppedMode() {
		return this.stoppedMode;
	}

	public void setStoppedMode(String stoppedMode) {
		this.stoppedMode = stoppedMode;
		if(stoppedMode != null){
			putQueryParameter("StoppedMode", stoppedMode);
		}
	}

	public Boolean getHibernate() {
		return this.hibernate;
	}

	public void setHibernate(Boolean hibernate) {
		this.hibernate = hibernate;
		if(hibernate != null){
			putQueryParameter("Hibernate", hibernate.toString());
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

	public String getBatchOptimization() {
		return this.batchOptimization;
	}

	public void setBatchOptimization(String batchOptimization) {
		this.batchOptimization = batchOptimization;
		if(batchOptimization != null){
			putQueryParameter("BatchOptimization", batchOptimization);
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

	public Boolean getKill() {
		return this.kill;
	}

	public void setKill(Boolean kill) {
		this.kill = kill;
		if(kill != null){
			putQueryParameter("Kill", kill.toString());
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
	public Class<OpsBatchStopInstanceResponse> getResponseClass() {
		return OpsBatchStopInstanceResponse.class;
	}

}
