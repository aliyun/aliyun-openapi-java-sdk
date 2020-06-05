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

package com.aliyuncs.sgw.model.v20180511;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sgw.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateGatewayRequest extends RpcAcsRequest<CreateGatewayResponse> {
	   

	private String gatewayClass;

	private Boolean postPaid;

	private String description;

	private String type;

	private Boolean releaseAfterExpiration;

	private String securityToken;

	private String storageBundleId;

	private String vSwitchId;

	private String name;

	private String location;

	private Integer publicNetworkBandwidth;
	public CreateGatewayRequest() {
		super("sgw", "2018-05-11", "CreateGateway", "hcs_sgw");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getGatewayClass() {
		return this.gatewayClass;
	}

	public void setGatewayClass(String gatewayClass) {
		this.gatewayClass = gatewayClass;
		if(gatewayClass != null){
			putQueryParameter("GatewayClass", gatewayClass);
		}
	}

	public Boolean getPostPaid() {
		return this.postPaid;
	}

	public void setPostPaid(Boolean postPaid) {
		this.postPaid = postPaid;
		if(postPaid != null){
			putQueryParameter("PostPaid", postPaid.toString());
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public Boolean getReleaseAfterExpiration() {
		return this.releaseAfterExpiration;
	}

	public void setReleaseAfterExpiration(Boolean releaseAfterExpiration) {
		this.releaseAfterExpiration = releaseAfterExpiration;
		if(releaseAfterExpiration != null){
			putQueryParameter("ReleaseAfterExpiration", releaseAfterExpiration.toString());
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public String getStorageBundleId() {
		return this.storageBundleId;
	}

	public void setStorageBundleId(String storageBundleId) {
		this.storageBundleId = storageBundleId;
		if(storageBundleId != null){
			putQueryParameter("StorageBundleId", storageBundleId);
		}
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putQueryParameter("VSwitchId", vSwitchId);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
		if(location != null){
			putQueryParameter("Location", location);
		}
	}

	public Integer getPublicNetworkBandwidth() {
		return this.publicNetworkBandwidth;
	}

	public void setPublicNetworkBandwidth(Integer publicNetworkBandwidth) {
		this.publicNetworkBandwidth = publicNetworkBandwidth;
		if(publicNetworkBandwidth != null){
			putQueryParameter("PublicNetworkBandwidth", publicNetworkBandwidth.toString());
		}
	}

	@Override
	public Class<CreateGatewayResponse> getResponseClass() {
		return CreateGatewayResponse.class;
	}

}
