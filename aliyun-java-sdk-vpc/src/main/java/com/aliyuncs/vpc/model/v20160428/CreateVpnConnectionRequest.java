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

package com.aliyuncs.vpc.model.v20160428;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateVpnConnectionRequest extends RpcAcsRequest<CreateVpnConnectionResponse> {
	   

	private String ikeConfig;

	private Long resourceOwnerId;

	private Boolean autoConfigRoute;

	private String clientToken;

	private String ipsecConfig;

	private String bgpConfig;

	private String healthCheckConfig;

	private String customerGatewayId;

	private String localSubnet;

	private String remoteSubnet;

	private Boolean effectImmediately;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String vpnGatewayId;

	private Long ownerId;

	private Boolean enableDpd;

	private String name;

	private Boolean enableNatTraversal;
	public CreateVpnConnectionRequest() {
		super("Vpc", "2016-04-28", "CreateVpnConnection", "vpc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIkeConfig() {
		return this.ikeConfig;
	}

	public void setIkeConfig(String ikeConfig) {
		this.ikeConfig = ikeConfig;
		if(ikeConfig != null){
			putQueryParameter("IkeConfig", ikeConfig);
		}
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

	public Boolean getAutoConfigRoute() {
		return this.autoConfigRoute;
	}

	public void setAutoConfigRoute(Boolean autoConfigRoute) {
		this.autoConfigRoute = autoConfigRoute;
		if(autoConfigRoute != null){
			putQueryParameter("AutoConfigRoute", autoConfigRoute.toString());
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

	public String getIpsecConfig() {
		return this.ipsecConfig;
	}

	public void setIpsecConfig(String ipsecConfig) {
		this.ipsecConfig = ipsecConfig;
		if(ipsecConfig != null){
			putQueryParameter("IpsecConfig", ipsecConfig);
		}
	}

	public String getBgpConfig() {
		return this.bgpConfig;
	}

	public void setBgpConfig(String bgpConfig) {
		this.bgpConfig = bgpConfig;
		if(bgpConfig != null){
			putQueryParameter("BgpConfig", bgpConfig);
		}
	}

	public String getHealthCheckConfig() {
		return this.healthCheckConfig;
	}

	public void setHealthCheckConfig(String healthCheckConfig) {
		this.healthCheckConfig = healthCheckConfig;
		if(healthCheckConfig != null){
			putQueryParameter("HealthCheckConfig", healthCheckConfig);
		}
	}

	public String getCustomerGatewayId() {
		return this.customerGatewayId;
	}

	public void setCustomerGatewayId(String customerGatewayId) {
		this.customerGatewayId = customerGatewayId;
		if(customerGatewayId != null){
			putQueryParameter("CustomerGatewayId", customerGatewayId);
		}
	}

	public String getLocalSubnet() {
		return this.localSubnet;
	}

	public void setLocalSubnet(String localSubnet) {
		this.localSubnet = localSubnet;
		if(localSubnet != null){
			putQueryParameter("LocalSubnet", localSubnet);
		}
	}

	public String getRemoteSubnet() {
		return this.remoteSubnet;
	}

	public void setRemoteSubnet(String remoteSubnet) {
		this.remoteSubnet = remoteSubnet;
		if(remoteSubnet != null){
			putQueryParameter("RemoteSubnet", remoteSubnet);
		}
	}

	public Boolean getEffectImmediately() {
		return this.effectImmediately;
	}

	public void setEffectImmediately(Boolean effectImmediately) {
		this.effectImmediately = effectImmediately;
		if(effectImmediately != null){
			putQueryParameter("EffectImmediately", effectImmediately.toString());
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

	public String getVpnGatewayId() {
		return this.vpnGatewayId;
	}

	public void setVpnGatewayId(String vpnGatewayId) {
		this.vpnGatewayId = vpnGatewayId;
		if(vpnGatewayId != null){
			putQueryParameter("VpnGatewayId", vpnGatewayId);
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

	public Boolean getEnableDpd() {
		return this.enableDpd;
	}

	public void setEnableDpd(Boolean enableDpd) {
		this.enableDpd = enableDpd;
		if(enableDpd != null){
			putQueryParameter("EnableDpd", enableDpd.toString());
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

	public Boolean getEnableNatTraversal() {
		return this.enableNatTraversal;
	}

	public void setEnableNatTraversal(Boolean enableNatTraversal) {
		this.enableNatTraversal = enableNatTraversal;
		if(enableNatTraversal != null){
			putQueryParameter("EnableNatTraversal", enableNatTraversal.toString());
		}
	}

	@Override
	public Class<CreateVpnConnectionResponse> getResponseClass() {
		return CreateVpnConnectionResponse.class;
	}

}
