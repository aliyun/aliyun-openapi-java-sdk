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

package com.aliyuncs.mse.model.v20190531;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mse.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CloneNacosConfigRequest extends RpcAcsRequest<CloneNacosConfigResponse> {
	   

	private String targetNamespaceId;

	private String instanceId;

	private String ids;

	private String originNamespaceId;

	private String policy;
	public CloneNacosConfigRequest() {
		super("mse", "2019-05-31", "CloneNacosConfig");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTargetNamespaceId() {
		return this.targetNamespaceId;
	}

	public void setTargetNamespaceId(String targetNamespaceId) {
		this.targetNamespaceId = targetNamespaceId;
		if(targetNamespaceId != null){
			putQueryParameter("TargetNamespaceId", targetNamespaceId);
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

	public String getIds() {
		return this.ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
		if(ids != null){
			putQueryParameter("Ids", ids);
		}
	}

	public String getOriginNamespaceId() {
		return this.originNamespaceId;
	}

	public void setOriginNamespaceId(String originNamespaceId) {
		this.originNamespaceId = originNamespaceId;
		if(originNamespaceId != null){
			putQueryParameter("OriginNamespaceId", originNamespaceId);
		}
	}

	public String getPolicy() {
		return this.policy;
	}

	public void setPolicy(String policy) {
		this.policy = policy;
		if(policy != null){
			putQueryParameter("Policy", policy);
		}
	}

	@Override
	public Class<CloneNacosConfigResponse> getResponseClass() {
		return CloneNacosConfigResponse.class;
	}

}
