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

package com.aliyuncs.cs.model.v20151215;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyClusterRequest extends RoaAcsRequest<ModifyClusterResponse> {
	   

	private Boolean api_server_eip;

	private String resource_group_id;

	private String ingress_domain_rebinding;

	private Boolean deletion_protection;

	private String ingress_loadbalancer_id;

	private String clusterId;

	private String api_server_eip_id;
	public ModifyClusterRequest() {
		super("CS", "2015-12-15", "ModifyCluster");
		setUriPattern("/api/v2/clusters/[ClusterId]");
		setMethod(MethodType.PUT);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getApi_server_eip() {
		return this.api_server_eip;
	}

	public void setApi_server_eip(Boolean api_server_eip) {
		this.api_server_eip = api_server_eip;
		if(api_server_eip != null){
			putBodyParameter("api_server_eip", api_server_eip.toString());
		}
	}

	public String getResource_group_id() {
		return this.resource_group_id;
	}

	public void setResource_group_id(String resource_group_id) {
		this.resource_group_id = resource_group_id;
		if(resource_group_id != null){
			putBodyParameter("resource_group_id", resource_group_id);
		}
	}

	public String getIngress_domain_rebinding() {
		return this.ingress_domain_rebinding;
	}

	public void setIngress_domain_rebinding(String ingress_domain_rebinding) {
		this.ingress_domain_rebinding = ingress_domain_rebinding;
		if(ingress_domain_rebinding != null){
			putBodyParameter("ingress_domain_rebinding", ingress_domain_rebinding);
		}
	}

	public Boolean getDeletion_protection() {
		return this.deletion_protection;
	}

	public void setDeletion_protection(Boolean deletion_protection) {
		this.deletion_protection = deletion_protection;
		if(deletion_protection != null){
			putBodyParameter("deletion_protection", deletion_protection.toString());
		}
	}

	public String getIngress_loadbalancer_id() {
		return this.ingress_loadbalancer_id;
	}

	public void setIngress_loadbalancer_id(String ingress_loadbalancer_id) {
		this.ingress_loadbalancer_id = ingress_loadbalancer_id;
		if(ingress_loadbalancer_id != null){
			putBodyParameter("ingress_loadbalancer_id", ingress_loadbalancer_id);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putPathParameter("ClusterId", clusterId);
		}
	}

	public String getApi_server_eip_id() {
		return this.api_server_eip_id;
	}

	public void setApi_server_eip_id(String api_server_eip_id) {
		this.api_server_eip_id = api_server_eip_id;
		if(api_server_eip_id != null){
			putBodyParameter("api_server_eip_id", api_server_eip_id);
		}
	}

	@Override
	public Class<ModifyClusterResponse> getResponseClass() {
		return ModifyClusterResponse.class;
	}

}
