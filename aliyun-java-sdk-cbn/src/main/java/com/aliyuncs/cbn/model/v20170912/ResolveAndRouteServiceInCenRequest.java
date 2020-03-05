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

package com.aliyuncs.cbn.model.v20170912;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cbn.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ResolveAndRouteServiceInCenRequest extends RpcAcsRequest<ResolveAndRouteServiceInCenResponse> {
	   

	private Long resourceOwnerId;

	private String clientToken;

	private String cenId;

	private String description;

	private String host;

	private String hostRegionId;

	private String hostVpcId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private List<String> accessRegionIdss;
	public ResolveAndRouteServiceInCenRequest() {
		super("Cbn", "2017-09-12", "ResolveAndRouteServiceInCen", "Cbn");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getCenId() {
		return this.cenId;
	}

	public void setCenId(String cenId) {
		this.cenId = cenId;
		if(cenId != null){
			putQueryParameter("CenId", cenId);
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

	public String getHost() {
		return this.host;
	}

	public void setHost(String host) {
		this.host = host;
		if(host != null){
			putQueryParameter("Host", host);
		}
	}

	public String getHostRegionId() {
		return this.hostRegionId;
	}

	public void setHostRegionId(String hostRegionId) {
		this.hostRegionId = hostRegionId;
		if(hostRegionId != null){
			putQueryParameter("HostRegionId", hostRegionId);
		}
	}

	public String getHostVpcId() {
		return this.hostVpcId;
	}

	public void setHostVpcId(String hostVpcId) {
		this.hostVpcId = hostVpcId;
		if(hostVpcId != null){
			putQueryParameter("HostVpcId", hostVpcId);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public List<String> getAccessRegionIdss() {
		return this.accessRegionIdss;
	}

	public void setAccessRegionIdss(List<String> accessRegionIdss) {
		this.accessRegionIdss = accessRegionIdss;	
		if (accessRegionIdss != null) {
			for (int i = 0; i < accessRegionIdss.size(); i++) {
				putQueryParameter("AccessRegionIds." + (i + 1) , accessRegionIdss.get(i));
			}
		}	
	}

	@Override
	public Class<ResolveAndRouteServiceInCenResponse> getResponseClass() {
		return ResolveAndRouteServiceInCenResponse.class;
	}

}
