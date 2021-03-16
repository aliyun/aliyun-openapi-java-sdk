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
public class OpsModifyInstanceFlowLimitRequest extends RpcAcsRequest<OpsModifyInstanceFlowLimitResponse> {
	   

	private String reason;

	private Long publicRxPps;

	private Long privateRxBps;

	private String operator;

	private Long publicTxBps;

	private Long privateTxPps;

	private Long privateTxBps;

	private Long publicTxPps;

	private String workOrderId;

	private String instanceId;

	private Long publicRxBps;

	private Long privateRxPps;

	private String auditParamStr;
	public OpsModifyInstanceFlowLimitRequest() {
		super("Ecsops", "2016-04-01", "OpsModifyInstanceFlowLimit", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Long getPublicRxPps() {
		return this.publicRxPps;
	}

	public void setPublicRxPps(Long publicRxPps) {
		this.publicRxPps = publicRxPps;
		if(publicRxPps != null){
			putQueryParameter("PublicRxPps", publicRxPps.toString());
		}
	}

	public Long getPrivateRxBps() {
		return this.privateRxBps;
	}

	public void setPrivateRxBps(Long privateRxBps) {
		this.privateRxBps = privateRxBps;
		if(privateRxBps != null){
			putQueryParameter("PrivateRxBps", privateRxBps.toString());
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

	public Long getPublicTxBps() {
		return this.publicTxBps;
	}

	public void setPublicTxBps(Long publicTxBps) {
		this.publicTxBps = publicTxBps;
		if(publicTxBps != null){
			putQueryParameter("PublicTxBps", publicTxBps.toString());
		}
	}

	public Long getPrivateTxPps() {
		return this.privateTxPps;
	}

	public void setPrivateTxPps(Long privateTxPps) {
		this.privateTxPps = privateTxPps;
		if(privateTxPps != null){
			putQueryParameter("PrivateTxPps", privateTxPps.toString());
		}
	}

	public Long getPrivateTxBps() {
		return this.privateTxBps;
	}

	public void setPrivateTxBps(Long privateTxBps) {
		this.privateTxBps = privateTxBps;
		if(privateTxBps != null){
			putQueryParameter("PrivateTxBps", privateTxBps.toString());
		}
	}

	public Long getPublicTxPps() {
		return this.publicTxPps;
	}

	public void setPublicTxPps(Long publicTxPps) {
		this.publicTxPps = publicTxPps;
		if(publicTxPps != null){
			putQueryParameter("PublicTxPps", publicTxPps.toString());
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

	public Long getPublicRxBps() {
		return this.publicRxBps;
	}

	public void setPublicRxBps(Long publicRxBps) {
		this.publicRxBps = publicRxBps;
		if(publicRxBps != null){
			putQueryParameter("PublicRxBps", publicRxBps.toString());
		}
	}

	public Long getPrivateRxPps() {
		return this.privateRxPps;
	}

	public void setPrivateRxPps(Long privateRxPps) {
		this.privateRxPps = privateRxPps;
		if(privateRxPps != null){
			putQueryParameter("PrivateRxPps", privateRxPps.toString());
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
	public Class<OpsModifyInstanceFlowLimitResponse> getResponseClass() {
		return OpsModifyInstanceFlowLimitResponse.class;
	}

}
