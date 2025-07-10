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
import com.aliyuncs.vpc.transform.v20160428.DownloadVpnConnectionConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DownloadVpnConnectionConfigResponse extends AcsResponse {

	private String requestId;

	private VpnConnectionConfig vpnConnectionConfig;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public VpnConnectionConfig getVpnConnectionConfig() {
		return this.vpnConnectionConfig;
	}

	public void setVpnConnectionConfig(VpnConnectionConfig vpnConnectionConfig) {
		this.vpnConnectionConfig = vpnConnectionConfig;
	}

	public static class VpnConnectionConfig {

		private String remote;

		private String local;

		private String remoteSubnet;

		private String localSubnet;

		private List<TunnelConfig> tunnelsConfig;

		private List<BgpConfig> bgpConfigs;

		private IkeConfig ikeConfig;

		private IpsecConfig ipsecConfig;

		public String getRemote() {
			return this.remote;
		}

		public void setRemote(String remote) {
			this.remote = remote;
		}

		public String getLocal() {
			return this.local;
		}

		public void setLocal(String local) {
			this.local = local;
		}

		public String getRemoteSubnet() {
			return this.remoteSubnet;
		}

		public void setRemoteSubnet(String remoteSubnet) {
			this.remoteSubnet = remoteSubnet;
		}

		public String getLocalSubnet() {
			return this.localSubnet;
		}

		public void setLocalSubnet(String localSubnet) {
			this.localSubnet = localSubnet;
		}

		public List<TunnelConfig> getTunnelsConfig() {
			return this.tunnelsConfig;
		}

		public void setTunnelsConfig(List<TunnelConfig> tunnelsConfig) {
			this.tunnelsConfig = tunnelsConfig;
		}

		public List<BgpConfig> getBgpConfigs() {
			return this.bgpConfigs;
		}

		public void setBgpConfigs(List<BgpConfig> bgpConfigs) {
			this.bgpConfigs = bgpConfigs;
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

		public static class TunnelConfig {

			private String tunnelId;

			private String local;

			private String remote;

			private IkeConfig1 ikeConfig1;

			private IpsecConfig2 ipsecConfig2;

			public String getTunnelId() {
				return this.tunnelId;
			}

			public void setTunnelId(String tunnelId) {
				this.tunnelId = tunnelId;
			}

			public String getLocal() {
				return this.local;
			}

			public void setLocal(String local) {
				this.local = local;
			}

			public String getRemote() {
				return this.remote;
			}

			public void setRemote(String remote) {
				this.remote = remote;
			}

			public IkeConfig1 getIkeConfig1() {
				return this.ikeConfig1;
			}

			public void setIkeConfig1(IkeConfig1 ikeConfig1) {
				this.ikeConfig1 = ikeConfig1;
			}

			public IpsecConfig2 getIpsecConfig2() {
				return this.ipsecConfig2;
			}

			public void setIpsecConfig2(IpsecConfig2 ipsecConfig2) {
				this.ipsecConfig2 = ipsecConfig2;
			}

			public static class IkeConfig1 {

				private String psk;

				private String ikeVersion;

				private String ikeMode;

				private String ikeEncAlg;

				private String ikeAuthAlg;

				private String ikePfs;

				private Long ikeLifetime;

				private String localId;

				private String remoteId;

				public String getPsk() {
					return this.psk;
				}

				public void setPsk(String psk) {
					this.psk = psk;
				}

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

				public String getIkeEncAlg() {
					return this.ikeEncAlg;
				}

				public void setIkeEncAlg(String ikeEncAlg) {
					this.ikeEncAlg = ikeEncAlg;
				}

				public String getIkeAuthAlg() {
					return this.ikeAuthAlg;
				}

				public void setIkeAuthAlg(String ikeAuthAlg) {
					this.ikeAuthAlg = ikeAuthAlg;
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

				public String getRemoteId() {
					return this.remoteId;
				}

				public void setRemoteId(String remoteId) {
					this.remoteId = remoteId;
				}
			}

			public static class IpsecConfig2 {

				private String ipsecAuthAlg;

				private String ipsecEncAlg;

				private String ipsecPfs;

				private Long ipsecLifetime;

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
			}
		}

		public static class BgpConfig {

			private String localAsn;

			private String localBgpIp;

			private String peerAsn;

			private String peerBgpIp;

			private String tunnelCidr;

			private String tunnelId;

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

			public String getTunnelId() {
				return this.tunnelId;
			}

			public void setTunnelId(String tunnelId) {
				this.tunnelId = tunnelId;
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

			private String ipsecEncAlg;

			private Long ipsecLifetime;

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

			public Long getIpsecLifetime() {
				return this.ipsecLifetime;
			}

			public void setIpsecLifetime(Long ipsecLifetime) {
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

	@Override
	public DownloadVpnConnectionConfigResponse getInstance(UnmarshallerContext context) {
		return	DownloadVpnConnectionConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
