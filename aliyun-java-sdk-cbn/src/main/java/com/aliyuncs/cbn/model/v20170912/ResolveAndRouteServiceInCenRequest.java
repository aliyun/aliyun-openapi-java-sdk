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
import com.aliyuncs.cbn.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ResolveAndRouteServiceInCenRequest extends RpcAcsRequest<ResolveAndRouteServiceInCenResponse> {
	
	public ResolveAndRouteServiceInCenRequest() {
		super("Cbn", "2017-09-12", "ResolveAndRouteServiceInCen", "cbn");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Long resourceOwnerId;

	private List<String> accessRegionIdss;

	private String resourceOwnerAccount;

	private String clientToken;

	private String cenId;

	private String ownerAccount;

	private String host;

	private String hostRegionId;

	private Long ownerId;

	private Long updateInterval;

	private String hostVpcId;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
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

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
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

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public Long getUpdateInterval() {
		return this.updateInterval;
	}

	public void setUpdateInterval(Long updateInterval) {
		this.updateInterval = updateInterval;
		if(updateInterval != null){
			putQueryParameter("UpdateInterval", updateInterval.toString());
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

	@Override
	public Class<ResolveAndRouteServiceInCenResponse> getResponseClass() {
		return ResolveAndRouteServiceInCenResponse.class;
	}

}
