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
import java.util.List;
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

	private Boolean enableTunnelsBgp;

	private String remoteSubnet;

	private Boolean effectImmediately;

	private Boolean dryRun;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String vpnGatewayId;

	private Long ownerId;

	private Boolean enableDpd;

	private List<Tags> tagss;

	private List<TunnelOptionsSpecification> tunnelOptionsSpecification;

	private String remoteCaCertificate;

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

	public Boolean getEnableTunnelsBgp() {
		return this.enableTunnelsBgp;
	}

	public void setEnableTunnelsBgp(Boolean enableTunnelsBgp) {
		this.enableTunnelsBgp = enableTunnelsBgp;
		if(enableTunnelsBgp != null){
			putQueryParameter("EnableTunnelsBgp", enableTunnelsBgp.toString());
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

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
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

	public List<Tags> getTagss() {
		return this.tagss;
	}

	public void setTagss(List<Tags> tagss) {
		this.tagss = tagss;	
		if (tagss != null) {
			for (int depth1 = 0; depth1 < tagss.size(); depth1++) {
				putQueryParameter("Tags." + (depth1 + 1) + ".Value" , tagss.get(depth1).getValue());
				putQueryParameter("Tags." + (depth1 + 1) + ".Key" , tagss.get(depth1).getKey());
			}
		}	
	}

	public List<TunnelOptionsSpecification> getTunnelOptionsSpecification() {
		return this.tunnelOptionsSpecification;
	}

	public void setTunnelOptionsSpecification(List<TunnelOptionsSpecification> tunnelOptionsSpecification) {
		this.tunnelOptionsSpecification = tunnelOptionsSpecification;	
		if (tunnelOptionsSpecification != null) {
			for (int depth1 = 0; depth1 < tunnelOptionsSpecification.size(); depth1++) {
				if (tunnelOptionsSpecification.get(depth1) != null) {
					
						if (tunnelOptionsSpecification.get(depth1).getTunnelIpsecConfig() != null) {
							
								putBodyParameter("TunnelOptionsSpecification." + (depth1 + 1) + ".TunnelIpsecConfig.IpsecPfs" , tunnelOptionsSpecification.get(depth1).getTunnelIpsecConfig().getIpsecPfs());
								putBodyParameter("TunnelOptionsSpecification." + (depth1 + 1) + ".TunnelIpsecConfig.IpsecLifetime" , tunnelOptionsSpecification.get(depth1).getTunnelIpsecConfig().getIpsecLifetime());
								putBodyParameter("TunnelOptionsSpecification." + (depth1 + 1) + ".TunnelIpsecConfig.IpsecAuthAlg" , tunnelOptionsSpecification.get(depth1).getTunnelIpsecConfig().getIpsecAuthAlg());
								putBodyParameter("TunnelOptionsSpecification." + (depth1 + 1) + ".TunnelIpsecConfig.IpsecEncAlg" , tunnelOptionsSpecification.get(depth1).getTunnelIpsecConfig().getIpsecEncAlg());
						}
						putBodyParameter("TunnelOptionsSpecification." + (depth1 + 1) + ".Role" , tunnelOptionsSpecification.get(depth1).getRole());
						if (tunnelOptionsSpecification.get(depth1).getTunnelBgpConfig() != null) {
							
								putBodyParameter("TunnelOptionsSpecification." + (depth1 + 1) + ".TunnelBgpConfig.LocalAsn" , tunnelOptionsSpecification.get(depth1).getTunnelBgpConfig().getLocalAsn());
								putBodyParameter("TunnelOptionsSpecification." + (depth1 + 1) + ".TunnelBgpConfig.TunnelCidr" , tunnelOptionsSpecification.get(depth1).getTunnelBgpConfig().getTunnelCidr());
								putBodyParameter("TunnelOptionsSpecification." + (depth1 + 1) + ".TunnelBgpConfig.LocalBgpIp" , tunnelOptionsSpecification.get(depth1).getTunnelBgpConfig().getLocalBgpIp());
						}
						putBodyParameter("TunnelOptionsSpecification." + (depth1 + 1) + ".RemoteCaCertificate" , tunnelOptionsSpecification.get(depth1).getRemoteCaCertificate());
						if (tunnelOptionsSpecification.get(depth1).getTunnelIkeConfig() != null) {
							
								putBodyParameter("TunnelOptionsSpecification." + (depth1 + 1) + ".TunnelIkeConfig.IkeVersion" , tunnelOptionsSpecification.get(depth1).getTunnelIkeConfig().getIkeVersion());
								putBodyParameter("TunnelOptionsSpecification." + (depth1 + 1) + ".TunnelIkeConfig.IkeMode" , tunnelOptionsSpecification.get(depth1).getTunnelIkeConfig().getIkeMode());
								putBodyParameter("TunnelOptionsSpecification." + (depth1 + 1) + ".TunnelIkeConfig.IkeAuthAlg" , tunnelOptionsSpecification.get(depth1).getTunnelIkeConfig().getIkeAuthAlg());
								putBodyParameter("TunnelOptionsSpecification." + (depth1 + 1) + ".TunnelIkeConfig.Psk" , tunnelOptionsSpecification.get(depth1).getTunnelIkeConfig().getPsk());
								putBodyParameter("TunnelOptionsSpecification." + (depth1 + 1) + ".TunnelIkeConfig.IkePfs" , tunnelOptionsSpecification.get(depth1).getTunnelIkeConfig().getIkePfs());
								putBodyParameter("TunnelOptionsSpecification." + (depth1 + 1) + ".TunnelIkeConfig.IkeLifetime" , tunnelOptionsSpecification.get(depth1).getTunnelIkeConfig().getIkeLifetime());
								putBodyParameter("TunnelOptionsSpecification." + (depth1 + 1) + ".TunnelIkeConfig.LocalId" , tunnelOptionsSpecification.get(depth1).getTunnelIkeConfig().getLocalId());
								putBodyParameter("TunnelOptionsSpecification." + (depth1 + 1) + ".TunnelIkeConfig.IkeEncAlg" , tunnelOptionsSpecification.get(depth1).getTunnelIkeConfig().getIkeEncAlg());
								putBodyParameter("TunnelOptionsSpecification." + (depth1 + 1) + ".TunnelIkeConfig.RemoteId" , tunnelOptionsSpecification.get(depth1).getTunnelIkeConfig().getRemoteId());
						}
						putBodyParameter("TunnelOptionsSpecification." + (depth1 + 1) + ".EnableNatTraversal" , tunnelOptionsSpecification.get(depth1).getEnableNatTraversal());
						putBodyParameter("TunnelOptionsSpecification." + (depth1 + 1) + ".EnableDpd" , tunnelOptionsSpecification.get(depth1).getEnableDpd());
						putBodyParameter("TunnelOptionsSpecification." + (depth1 + 1) + ".CustomerGatewayId" , tunnelOptionsSpecification.get(depth1).getCustomerGatewayId());
				}
			}
		}	
	}

	public String getRemoteCaCertificate() {
		return this.remoteCaCertificate;
	}

	public void setRemoteCaCertificate(String remoteCaCertificate) {
		this.remoteCaCertificate = remoteCaCertificate;
		if(remoteCaCertificate != null){
			putQueryParameter("RemoteCaCertificate", remoteCaCertificate);
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

	public static class Tags {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	public static class TunnelOptionsSpecification {

		private TunnelIpsecConfig tunnelIpsecConfig;

		private String role;

		private TunnelBgpConfig tunnelBgpConfig;

		private String remoteCaCertificate;

		private TunnelIkeConfig tunnelIkeConfig;

		private Boolean enableNatTraversal;

		private Boolean enableDpd;

		private String customerGatewayId;

		public TunnelIpsecConfig getTunnelIpsecConfig() {
			return this.tunnelIpsecConfig;
		}

		public void setTunnelIpsecConfig(TunnelIpsecConfig tunnelIpsecConfig) {
			this.tunnelIpsecConfig = tunnelIpsecConfig;
		}

		public String getRole() {
			return this.role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public TunnelBgpConfig getTunnelBgpConfig() {
			return this.tunnelBgpConfig;
		}

		public void setTunnelBgpConfig(TunnelBgpConfig tunnelBgpConfig) {
			this.tunnelBgpConfig = tunnelBgpConfig;
		}

		public String getRemoteCaCertificate() {
			return this.remoteCaCertificate;
		}

		public void setRemoteCaCertificate(String remoteCaCertificate) {
			this.remoteCaCertificate = remoteCaCertificate;
		}

		public TunnelIkeConfig getTunnelIkeConfig() {
			return this.tunnelIkeConfig;
		}

		public void setTunnelIkeConfig(TunnelIkeConfig tunnelIkeConfig) {
			this.tunnelIkeConfig = tunnelIkeConfig;
		}

		public Boolean getEnableNatTraversal() {
			return this.enableNatTraversal;
		}

		public void setEnableNatTraversal(Boolean enableNatTraversal) {
			this.enableNatTraversal = enableNatTraversal;
		}

		public Boolean getEnableDpd() {
			return this.enableDpd;
		}

		public void setEnableDpd(Boolean enableDpd) {
			this.enableDpd = enableDpd;
		}

		public String getCustomerGatewayId() {
			return this.customerGatewayId;
		}

		public void setCustomerGatewayId(String customerGatewayId) {
			this.customerGatewayId = customerGatewayId;
		}

		public static class TunnelIpsecConfig {

			private String ipsecPfs;

			private Long ipsecLifetime;

			private String ipsecAuthAlg;

			private String ipsecEncAlg;

			public String getIpsecPfs() {
				return this.ipsecPfs;
			}

			public void setIpsecPfs(String ipsecPfs) {
				this.ipsecPfs = ipsecPfs;
			}

			public Long getIpsecLifetime() {
				return this.ipsecLifetime;
			}

			public void setIpsecLifetime(Long ipsecLifetime) {
				this.ipsecLifetime = ipsecLifetime;
			}

			public String getIpsecAuthAlg() {
				return this.ipsecAuthAlg;
			}

			public void setIpsecAuthAlg(String ipsecAuthAlg) {
				this.ipsecAuthAlg = ipsecAuthAlg;
			}

			public String getIpsecEncAlg() {
				return this.ipsecEncAlg;
			}

			public void setIpsecEncAlg(String ipsecEncAlg) {
				this.ipsecEncAlg = ipsecEncAlg;
			}
		}

		public static class TunnelBgpConfig {

			private Long localAsn;

			private String tunnelCidr;

			private String localBgpIp;

			public Long getLocalAsn() {
				return this.localAsn;
			}

			public void setLocalAsn(Long localAsn) {
				this.localAsn = localAsn;
			}

			public String getTunnelCidr() {
				return this.tunnelCidr;
			}

			public void setTunnelCidr(String tunnelCidr) {
				this.tunnelCidr = tunnelCidr;
			}

			public String getLocalBgpIp() {
				return this.localBgpIp;
			}

			public void setLocalBgpIp(String localBgpIp) {
				this.localBgpIp = localBgpIp;
			}
		}

		public static class TunnelIkeConfig {

			private String ikeVersion;

			private String ikeMode;

			private String ikeAuthAlg;

			private String psk;

			private String ikePfs;

			private Long ikeLifetime;

			private String localId;

			private String ikeEncAlg;

			private String remoteId;

			public String getIkeVersion() {
				return this.ikeVersion;
			}

			public void setIkeVersion(String ikeVersion) {
				this.ikeVersion = ikeVersion;
			}

			public String getIkeMode() {
				return this.ikeMode;
			}

			public void setIkeMode(String ikeMode) {
				this.ikeMode = ikeMode;
			}

			public String getIkeAuthAlg() {
				return this.ikeAuthAlg;
			}

			public void setIkeAuthAlg(String ikeAuthAlg) {
				this.ikeAuthAlg = ikeAuthAlg;
			}

			public String getPsk() {
				return this.psk;
			}

			public void setPsk(String psk) {
				this.psk = psk;
			}

			public String getIkePfs() {
				return this.ikePfs;
			}

			public void setIkePfs(String ikePfs) {
				this.ikePfs = ikePfs;
			}

			public Long getIkeLifetime() {
				return this.ikeLifetime;
			}

			public void setIkeLifetime(Long ikeLifetime) {
				this.ikeLifetime = ikeLifetime;
			}

			public String getLocalId() {
				return this.localId;
			}

			public void setLocalId(String localId) {
				this.localId = localId;
			}

			public String getIkeEncAlg() {
				return this.ikeEncAlg;
			}

			public void setIkeEncAlg(String ikeEncAlg) {
				this.ikeEncAlg = ikeEncAlg;
			}

			public String getRemoteId() {
				return this.remoteId;
			}

			public void setRemoteId(String remoteId) {
				this.remoteId = remoteId;
			}
		}
	}

	@Override
	public Class<CreateVpnConnectionResponse> getResponseClass() {
		return CreateVpnConnectionResponse.class;
	}

}
