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
public class ModifyTunnelAttributeRequest extends RpcAcsRequest<ModifyTunnelAttributeResponse> {
	   

	private Long resourceOwnerId;

	private String clientToken;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private TunnelOptionsSpecification tunnelOptionsSpecification;

	private String vpnConnectionId;

	private String tunnelId;
	public ModifyTunnelAttributeRequest() {
		super("Vpc", "2016-04-28", "ModifyTunnelAttribute", "vpc");
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

	public TunnelOptionsSpecification getTunnelOptionsSpecification() {
		return this.tunnelOptionsSpecification;
	}

	public void setTunnelOptionsSpecification(TunnelOptionsSpecification tunnelOptionsSpecification) {
		this.tunnelOptionsSpecification = tunnelOptionsSpecification;	
		if (tunnelOptionsSpecification != null) {
			
				if (tunnelOptionsSpecification.getTunnelIpsecConfig() != null) {
					
						putQueryParameter("TunnelOptionsSpecification.TunnelIpsecConfig.IpsecPfs" , tunnelOptionsSpecification.getTunnelIpsecConfig().getIpsecPfs());
						putQueryParameter("TunnelOptionsSpecification.TunnelIpsecConfig.IpsecLifetime" , tunnelOptionsSpecification.getTunnelIpsecConfig().getIpsecLifetime());
						putQueryParameter("TunnelOptionsSpecification.TunnelIpsecConfig.IpsecAuthAlg" , tunnelOptionsSpecification.getTunnelIpsecConfig().getIpsecAuthAlg());
						putQueryParameter("TunnelOptionsSpecification.TunnelIpsecConfig.IpsecEncAlg" , tunnelOptionsSpecification.getTunnelIpsecConfig().getIpsecEncAlg());
				}
				if (tunnelOptionsSpecification.getTunnelBgpConfig() != null) {
					
						putQueryParameter("TunnelOptionsSpecification.TunnelBgpConfig.LocalAsn" , tunnelOptionsSpecification.getTunnelBgpConfig().getLocalAsn());
						putQueryParameter("TunnelOptionsSpecification.TunnelBgpConfig.TunnelCidr" , tunnelOptionsSpecification.getTunnelBgpConfig().getTunnelCidr());
						putQueryParameter("TunnelOptionsSpecification.TunnelBgpConfig.LocalBgpIp" , tunnelOptionsSpecification.getTunnelBgpConfig().getLocalBgpIp());
				}
				putQueryParameter("TunnelOptionsSpecification.RemoteCaCertificate" , tunnelOptionsSpecification.getRemoteCaCertificate());
				if (tunnelOptionsSpecification.getTunnelIkeConfig() != null) {
					
						putQueryParameter("TunnelOptionsSpecification.TunnelIkeConfig.IkeVersion" , tunnelOptionsSpecification.getTunnelIkeConfig().getIkeVersion());
						putQueryParameter("TunnelOptionsSpecification.TunnelIkeConfig.IkeMode" , tunnelOptionsSpecification.getTunnelIkeConfig().getIkeMode());
						putQueryParameter("TunnelOptionsSpecification.TunnelIkeConfig.IkeAuthAlg" , tunnelOptionsSpecification.getTunnelIkeConfig().getIkeAuthAlg());
						putQueryParameter("TunnelOptionsSpecification.TunnelIkeConfig.Psk" , tunnelOptionsSpecification.getTunnelIkeConfig().getPsk());
						putQueryParameter("TunnelOptionsSpecification.TunnelIkeConfig.IkePfs" , tunnelOptionsSpecification.getTunnelIkeConfig().getIkePfs());
						putQueryParameter("TunnelOptionsSpecification.TunnelIkeConfig.IkeLifetime" , tunnelOptionsSpecification.getTunnelIkeConfig().getIkeLifetime());
						putQueryParameter("TunnelOptionsSpecification.TunnelIkeConfig.LocalId" , tunnelOptionsSpecification.getTunnelIkeConfig().getLocalId());
						putQueryParameter("TunnelOptionsSpecification.TunnelIkeConfig.IkeEncAlg" , tunnelOptionsSpecification.getTunnelIkeConfig().getIkeEncAlg());
						putQueryParameter("TunnelOptionsSpecification.TunnelIkeConfig.RemoteId" , tunnelOptionsSpecification.getTunnelIkeConfig().getRemoteId());
				}
				putQueryParameter("TunnelOptionsSpecification.EnableNatTraversal" , tunnelOptionsSpecification.getEnableNatTraversal());
				putQueryParameter("TunnelOptionsSpecification.EnableDpd" , tunnelOptionsSpecification.getEnableDpd());
				putQueryParameter("TunnelOptionsSpecification.CustomerGatewayId" , tunnelOptionsSpecification.getCustomerGatewayId());
		}	
	}

	public String getVpnConnectionId() {
		return this.vpnConnectionId;
	}

	public void setVpnConnectionId(String vpnConnectionId) {
		this.vpnConnectionId = vpnConnectionId;
		if(vpnConnectionId != null){
			putQueryParameter("VpnConnectionId", vpnConnectionId);
		}
	}

	public String getTunnelId() {
		return this.tunnelId;
	}

	public void setTunnelId(String tunnelId) {
		this.tunnelId = tunnelId;
		if(tunnelId != null){
			putQueryParameter("TunnelId", tunnelId);
		}
	}

	public static class TunnelOptionsSpecification {

		private TunnelIpsecConfig tunnelIpsecConfig;

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
	public Class<ModifyTunnelAttributeResponse> getResponseClass() {
		return ModifyTunnelAttributeResponse.class;
	}

}
