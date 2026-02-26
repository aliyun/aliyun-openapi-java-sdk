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

package com.aliyuncs.expressconnectrouter.model.v20230901;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.expressconnectrouter.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GrantInstanceToExpressConnectRouterRequest extends RpcAcsRequest<GrantInstanceToExpressConnectRouterResponse> {
	   

	private String clientToken;

	private String ecrId;

	private Long ecrOwnerAliUid;

	private String instanceRegionId;

	private String instanceType;

	private Boolean dryRun;

	private String instanceId;
	public GrantInstanceToExpressConnectRouterRequest() {
		super("ExpressConnectRouter", "2023-09-01", "GrantInstanceToExpressConnectRouter", "ecr");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putBodyParameter("ClientToken", clientToken);
		}
	}

	public String getEcrId() {
		return this.ecrId;
	}

	public void setEcrId(String ecrId) {
		this.ecrId = ecrId;
		if(ecrId != null){
			putBodyParameter("EcrId", ecrId);
		}
	}

	public Long getEcrOwnerAliUid() {
		return this.ecrOwnerAliUid;
	}

	public void setEcrOwnerAliUid(Long ecrOwnerAliUid) {
		this.ecrOwnerAliUid = ecrOwnerAliUid;
		if(ecrOwnerAliUid != null){
			putBodyParameter("EcrOwnerAliUid", ecrOwnerAliUid.toString());
		}
	}

	public String getInstanceRegionId() {
		return this.instanceRegionId;
	}

	public void setInstanceRegionId(String instanceRegionId) {
		this.instanceRegionId = instanceRegionId;
		if(instanceRegionId != null){
			putBodyParameter("InstanceRegionId", instanceRegionId);
		}
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putBodyParameter("InstanceType", instanceType);
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putBodyParameter("DryRun", dryRun.toString());
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	@Override
	public Class<GrantInstanceToExpressConnectRouterResponse> getResponseClass() {
		return GrantInstanceToExpressConnectRouterResponse.class;
	}

}
