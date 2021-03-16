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
public class OpsModifyInstanceInternetFlowLimitRequest extends RpcAcsRequest<OpsModifyInstanceInternetFlowLimitResponse> {
	   

	private Long publicRxPps;

	private String operator;

	private Long publicTxBps;

	private String privateIp;

	private Long publicTxPps;

	private String workOrderId;

	private String instanceId;

	private Long publicRxBps;

	private String auditParamStr;
	public OpsModifyInstanceInternetFlowLimitRequest() {
		super("Ecsops", "2016-04-01", "OpsModifyInstanceInternetFlowLimit", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getPrivateIp() {
		return this.privateIp;
	}

	public void setPrivateIp(String privateIp) {
		this.privateIp = privateIp;
		if(privateIp != null){
			putQueryParameter("PrivateIp", privateIp);
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
	public Class<OpsModifyInstanceInternetFlowLimitResponse> getResponseClass() {
		return OpsModifyInstanceInternetFlowLimitResponse.class;
	}

}
