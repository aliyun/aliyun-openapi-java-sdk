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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.DescribeVpnConnectionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVpnConnectionsResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private Integer totalCount;

	private List<VpnConnection> vpnConnections;

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<VpnConnection> getVpnConnections() {
		return this.vpnConnections;
	}

	public void setVpnConnections(List<VpnConnection> vpnConnections) {
		this.vpnConnections = vpnConnections;
	}

	public static class VpnConnection {

		private String status;

		private Boolean enableNatTraversal;

		private String remoteCaCertificate;

		private Long createTime;

		private Boolean effectImmediately;

		private String vpnGatewayId;

		private String localSubnet;

		private String vpnConnectionId;

		private String remoteSubnet;

		private String customerGatewayId;

		private String name;

		private Boolean enableDpd;

		private String attachType;

		private String networkType;

		private String attachInstanceId;

		private String spec;

		private String state;

		private String transitRouterId;

		private String transitRouterName;

		private Boolean crossAccountAuthorized;

		private String internetIp;

		private Boolean enableTunnelsBgp;

		private String resourceGroupId;

		private String tunnelBandwidth;

		private List<TagItem> tag;

		private List<TunnelOptions> tunnelOptionsSpecification;

		private IkeConfig ikeConfig;

		private IpsecConfig ipsecConfig;

		private VcoHealthCheck vcoHealthCheck;

		private VpnBgpConfig vpnBgpConfig;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Boolean getEnableNatTraversal() {
			return this.enableNatTraversal;
		}

		public void setEnableNatTraversal(Boolean enableNatTraversal) {
			this.enableNatTraversal = enableNatTraversal;
		}

		public String getRemoteCaCertificate() {
			return this.remoteCaCertificate;
		}

		public void setRemoteCaCertificate(String remoteCaCertificate) {
			this.remoteCaCertificate = remoteCaCertificate;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Boolean getEffectImmediately() {
			return this.effectImmediately;
		}

		public void setEffectImmediately(Boolean effectImmediately) {
			this.effectImmediately = effectImmediately;
		}

		public String getVpnGatewayId() {
			return this.vpnGatewayId;
		}

		public void setVpnGatewayId(String vpnGatewayId) {
			this.vpnGatewayId = vpnGatewayId;
		}

		public String getLocalSubnet() {
			return this.localSubnet;
		}

		public void setLocalSubnet(String localSubnet) {
			this.localSubnet = localSubnet;
		}

		public String getVpnConnectionId() {
			return this.vpnConnectionId;
		}

		public void setVpnConnectionId(String vpnConnectionId) {
			this.vpnConnectionId = vpnConnectionId;
		}

		public String getRemoteSubnet() {
			return this.remoteSubnet;
		}

		public void setRemoteSubnet(String remoteSubnet) {
			this.remoteSubnet = remoteSubnet;
		}

		public String getCustomerGatewayId() {
			return this.customerGatewayId;
		}

		public void setCustomerGatewayId(String customerGatewayId) {
			this.customerGatewayId = customerGatewayId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Boolean getEnableDpd() {
			return this.enableDpd;
		}

		public void setEnableDpd(Boolean enableDpd) {
			this.enableDpd = enableDpd;
		}

		public String getAttachType() {
			return this.attachType;
		}

		public void setAttachType(String attachType) {
			this.attachType = attachType;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}

		public String getAttachInstanceId() {
			return this.attachInstanceId;
		}

		public void setAttachInstanceId(String attachInstanceId) {
			this.attachInstanceId = attachInstanceId;
		}

		public String getSpec() {
			return this.spec;
		}

		public void setSpec(String spec) {
			this.spec = spec;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getTransitRouterId() {
			return this.transitRouterId;
		}

		public void setTransitRouterId(String transitRouterId) {
			this.transitRouterId = transitRouterId;
		}

		public String getTransitRouterName() {
			return this.transitRouterName;
		}

		public void setTransitRouterName(String transitRouterName) {
			this.transitRouterName = transitRouterName;
		}

		public Boolean getCrossAccountAuthorized() {
			return this.crossAccountAuthorized;
		}

		public void setCrossAccountAuthorized(Boolean crossAccountAuthorized) {
			this.crossAccountAuthorized = crossAccountAuthorized;
		}

		public String getInternetIp() {
			return this.internetIp;
		}

		public void setInternetIp(String internetIp) {
			this.internetIp = internetIp;
		}

		public Boolean getEnableTunnelsBgp() {
			return this.enableTunnelsBgp;
		}

		public void setEnableTunnelsBgp(Boolean enableTunnelsBgp) {
			this.enableTunnelsBgp = enableTunnelsBgp;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getTunnelBandwidth() {
			return this.tunnelBandwidth;
		}

		public void setTunnelBandwidth(String tunnelBandwidth) {
			this.tunnelBandwidth = tunnelBandwidth;
		}

		public List<TagItem> getTag() {
			return this.tag;
		}

		public void setTag(List<TagItem> tag) {
			this.tag = tag;
		}

		public List<TunnelOptions> getTunnelOptionsSpecification() {
			return this.tunnelOptionsSpecification;
		}

		public void setTunnelOptionsSpecification(List<TunnelOptions> tunnelOptionsSpecification) {
			this.tunnelOptionsSpecification = tunnelOptionsSpecification;
		}

		public IkeConfig getIkeConfig() {
			return this.ikeConfig;
		}

		public void setIkeConfig(IkeConfig ikeConfig) {
			this.ikeConfig = ikeConfig;
		}

		public IpsecConfig getIpsecConfig() {
			return this.ipsecConfig;
		}

		public void setIpsecConfig(IpsecConfig ipsecConfig) {
			this.ipsecConfig = ipsecConfig;
		}

		public VcoHealthCheck getVcoHealthCheck() {
			return this.vcoHealthCheck;
		}

		public void setVcoHealthCheck(VcoHealthCheck vcoHealthCheck) {
			this.vcoHealthCheck = vcoHealthCheck;
		}

		public VpnBgpConfig getVpnBgpConfig() {
			return this.vpnBgpConfig;
		}

		public void setVpnBgpConfig(VpnBgpConfig vpnBgpConfig) {
			this.vpnBgpConfig = vpnBgpConfig;
		}

		public static class TagItem {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}

		public static class TunnelOptions {

			private String tunnelId;

			private String customerGatewayId;

			private String enableDpd;

			private String enableNatTraversal;

			private String internetIp;

			private String remoteCaCertificate;

			private String role;

			private Integer tunnelIndex;

			private String state;

			private String status;

			private String zoneNo;

			private TunnelBgpConfig tunnelBgpConfig;

			private TunnelIkeConfig tunnelIkeConfig;

			private TunnelIpsecConfig tunnelIpsecConfig;

			public String getTunnelId() {
				return this.tunnelId;
			}

			public void setTunnelId(String tunnelId) {
				this.tunnelId = tunnelId;
			}

			public String getCustomerGatewayId() {
				return this.customerGatewayId;
			}

			public void setCustomerGatewayId(String customerGatewayId) {
				this.customerGatewayId = customerGatewayId;
			}

			public String getEnableDpd() {
				return this.enableDpd;
			}

			public void setEnableDpd(String enableDpd) {
				this.enableDpd = enableDpd;
			}

			public String getEnableNatTraversal() {
				return this.enableNatTraversal;
			}

			public void setEnableNatTraversal(String enableNatTraversal) {
				this.enableNatTraversal = enableNatTraversal;
			}

			public String getInternetIp() {
				return this.internetIp;
			}

			public void setInternetIp(String internetIp) {
				this.internetIp = internetIp;
			}

			public String getRemoteCaCertificate() {
				return this.remoteCaCertificate;
			}

			public void setRemoteCaCertificate(String remoteCaCertificate) {
				this.remoteCaCertificate = remoteCaCertificate;
			}

			public String getRole() {
				return this.role;
			}

			public void setRole(String role) {
				this.role = role;
			}

			public Integer getTunnelIndex() {
				return this.tunnelIndex;
			}

			public void setTunnelIndex(Integer tunnelIndex) {
				this.tunnelIndex = tunnelIndex;
			}

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getZoneNo() {
				return this.zoneNo;
			}

			public void setZoneNo(String zoneNo) {
				this.zoneNo = zoneNo;
			}

			public TunnelBgpConfig getTunnelBgpConfig() {
				return this.tunnelBgpConfig;
			}

			public void setTunnelBgpConfig(TunnelBgpConfig tunnelBgpConfig) {
				this.tunnelBgpConfig = tunnelBgpConfig;
			}

			public TunnelIkeConfig getTunnelIkeConfig() {
				return this.tunnelIkeConfig;
			}

			public void setTunnelIkeConfig(TunnelIkeConfig tunnelIkeConfig) {
				this.tunnelIkeConfig = tunnelIkeConfig;
			}

			public TunnelIpsecConfig getTunnelIpsecConfig() {
				return this.tunnelIpsecConfig;
			}

			public void setTunnelIpsecConfig(TunnelIpsecConfig tunnelIpsecConfig) {
				this.tunnelIpsecConfig = tunnelIpsecConfig;
			}

			public static class TunnelBgpConfig {

				private String bgpStatus;

				private String localAsn;

				private String localBgpIp;

				private String peerAsn;

				private String peerBgpIp;

				private String tunnelCidr;

				public String getBgpStatus() {
					return this.bgpStatus;
				}

				public void setBgpStatus(String bgpStatus) {
					this.bgpStatus = bgpStatus;
				}

				public String getLocalAsn() {
					return this.localAsn;
				}

				public void setLocalAsn(String localAsn) {
					this.localAsn = localAsn;
				}

				public String getLocalBgpIp() {
					return this.localBgpIp;
				}

				public void setLocalBgpIp(String localBgpIp) {
					this.localBgpIp = localBgpIp;
				}

				public String getPeerAsn() {
					return this.peerAsn;
				}

				public void setPeerAsn(String peerAsn) {
					this.peerAsn = peerAsn;
				}

				public String getPeerBgpIp() {
					return this.peerBgpIp;
				}

				public void setPeerBgpIp(String peerBgpIp) {
					this.peerBgpIp = peerBgpIp;
				}

				public String getTunnelCidr() {
					return this.tunnelCidr;
				}

				public void setTunnelCidr(String tunnelCidr) {
					this.tunnelCidr = tunnelCidr;
				}
			}

			public static class TunnelIkeConfig {

				private String ikeAuthAlg;

				private String ikeEncAlg;

				private String ikeLifetime;

				private String ikeMode;

				private String ikePfs;

				private String ikeVersion;

				private String localId;

				private String psk;

				private String remoteId;

				public String getIkeAuthAlg() {
					return this.ikeAuthAlg;
				}

				public void setIkeAuthAlg(String ikeAuthAlg) {
					this.ikeAuthAlg = ikeAuthAlg;
				}

				public String getIkeEncAlg() {
					return this.ikeEncAlg;
				}

				public void setIkeEncAlg(String ikeEncAlg) {
					this.ikeEncAlg = ikeEncAlg;
				}

				public String getIkeLifetime() {
					return this.ikeLifetime;
				}

				public void setIkeLifetime(String ikeLifetime) {
					this.ikeLifetime = ikeLifetime;
				}

				public String getIkeMode() {
					return this.ikeMode;
				}

				public void setIkeMode(String ikeMode) {
					this.ikeMode = ikeMode;
				}

				public String getIkePfs() {
					return this.ikePfs;
				}

				public void setIkePfs(String ikePfs) {
					this.ikePfs = ikePfs;
				}

				public String getIkeVersion() {
					return this.ikeVersion;
				}

				public void setIkeVersion(String ikeVersion) {
					this.ikeVersion = ikeVersion;
				}

				public String getLocalId() {
					return this.localId;
				}

				public void setLocalId(String localId) {
					this.localId = localId;
				}

				public String getPsk() {
					return this.psk;
				}

				public void setPsk(String psk) {
					this.psk = psk;
				}

				public String getRemoteId() {
					return this.remoteId;
				}

				public void setRemoteId(String remoteId) {
					this.remoteId = remoteId;
				}
			}

			public static class TunnelIpsecConfig {

				private String ipsecAuthAlg;

				private String ipsecEncAlg;

				private String ipsecLifetime;

				private String ipsecPfs;

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

				public String getIpsecLifetime() {
					return this.ipsecLifetime;
				}

				public void setIpsecLifetime(String ipsecLifetime) {
					this.ipsecLifetime = ipsecLifetime;
				}

				public String getIpsecPfs() {
					return this.ipsecPfs;
				}

				public void setIpsecPfs(String ipsecPfs) {
					this.ipsecPfs = ipsecPfs;
				}
			}
		}

		public static class IkeConfig {

			private String remoteId;

			private Long ikeLifetime;

			private String ikeEncAlg;

			private String localId;

			private String ikeMode;

			private String ikeVersion;

			private String ikePfs;

			private String psk;

			private String ikeAuthAlg;

			public String getRemoteId() {
				return this.remoteId;
			}

			public void setRemoteId(String remoteId) {
				this.remoteId = remoteId;
			}

			public Long getIkeLifetime() {
				return this.ikeLifetime;
			}

			public void setIkeLifetime(Long ikeLifetime) {
				this.ikeLifetime = ikeLifetime;
			}

			public String getIkeEncAlg() {
				return this.ikeEncAlg;
			}

			public void setIkeEncAlg(String ikeEncAlg) {
				this.ikeEncAlg = ikeEncAlg;
			}

			public String getLocalId() {
				return this.localId;
			}

			public void setLocalId(String localId) {
				this.localId = localId;
			}

			public String getIkeMode() {
				return this.ikeMode;
			}

			public void setIkeMode(String ikeMode) {
				this.ikeMode = ikeMode;
			}

			public String getIkeVersion() {
				return this.ikeVersion;
			}

			public void setIkeVersion(String ikeVersion) {
				this.ikeVersion = ikeVersion;
			}

			public String getIkePfs() {
				return this.ikePfs;
			}

			public void setIkePfs(String ikePfs) {
				this.ikePfs = ikePfs;
			}

			public String getPsk() {
				return this.psk;
			}

			public void setPsk(String psk) {
				this.psk = psk;
			}

			public String getIkeAuthAlg() {
				return this.ikeAuthAlg;
			}

			public void setIkeAuthAlg(String ikeAuthAlg) {
				this.ikeAuthAlg = ikeAuthAlg;
			}
		}

		public static class IpsecConfig {

			private String ipsecAuthAlg;

			private Long ipsecLifetime;

			private String ipsecEncAlg;

			private String ipsecPfs;

			public String getIpsecAuthAlg() {
				return this.ipsecAuthAlg;
			}

			public void setIpsecAuthAlg(String ipsecAuthAlg) {
				this.ipsecAuthAlg = ipsecAuthAlg;
			}

			public Long getIpsecLifetime() {
				return this.ipsecLifetime;
			}

			public void setIpsecLifetime(Long ipsecLifetime) {
				this.ipsecLifetime = ipsecLifetime;
			}

			public String getIpsecEncAlg() {
				return this.ipsecEncAlg;
			}

			public void setIpsecEncAlg(String ipsecEncAlg) {
				this.ipsecEncAlg = ipsecEncAlg;
			}

			public String getIpsecPfs() {
				return this.ipsecPfs;
			}

			public void setIpsecPfs(String ipsecPfs) {
				this.ipsecPfs = ipsecPfs;
			}
		}

		public static class VcoHealthCheck {

			private String status;

			private String dip;

			private Integer interval;

			private Integer retry;

			private String sip;

			private String enable;

			private String policy;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getDip() {
				return this.dip;
			}

			public void setDip(String dip) {
				this.dip = dip;
			}

			public Integer getInterval() {
				return this.interval;
			}

			public void setInterval(Integer interval) {
				this.interval = interval;
			}

			public Integer getRetry() {
				return this.retry;
			}

			public void setRetry(Integer retry) {
				this.retry = retry;
			}

			public String getSip() {
				return this.sip;
			}

			public void setSip(String sip) {
				this.sip = sip;
			}

			public String getEnable() {
				return this.enable;
			}

			public void setEnable(String enable) {
				this.enable = enable;
			}

			public String getPolicy() {
				return this.policy;
			}

			public void setPolicy(String policy) {
				this.policy = policy;
			}
		}

		public static class VpnBgpConfig {

			private String status;

			private String peerBgpIp;

			private String tunnelCidr;

			private String localBgpIp;

			private Long peerAsn;

			private Long localAsn;

			private String authKey;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getPeerBgpIp() {
				return this.peerBgpIp;
			}

			public void setPeerBgpIp(String peerBgpIp) {
				this.peerBgpIp = peerBgpIp;
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

			public Long getPeerAsn() {
				return this.peerAsn;
			}

			public void setPeerAsn(Long peerAsn) {
				this.peerAsn = peerAsn;
			}

			public Long getLocalAsn() {
				return this.localAsn;
			}

			public void setLocalAsn(Long localAsn) {
				this.localAsn = localAsn;
			}

			public String getAuthKey() {
				return this.authKey;
			}

			public void setAuthKey(String authKey) {
				this.authKey = authKey;
			}
		}
	}

	@Override
	public DescribeVpnConnectionsResponse getInstance(UnmarshallerContext context) {
		return	DescribeVpnConnectionsResponseUnmarshaller.unmarshall(this, context);
	}
}
