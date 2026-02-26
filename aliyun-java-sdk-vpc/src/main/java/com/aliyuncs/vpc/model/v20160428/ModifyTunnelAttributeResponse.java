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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.ModifyTunnelAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ModifyTunnelAttributeResponse extends AcsResponse {

	private String tunnelId;

	private String requestId;

	private Boolean enableNatTraversal;

	private Boolean enableDpd;

	private String remoteCaCertificate;

	private String customerGatewayId;

	private String role;

	private String zoneNo;

	private String internetIp;

	private String state;

	private TunnelIkeConfig tunnelIkeConfig;

	private TunnelIpsecConfig tunnelIpsecConfig;

	private TunnelBgpConfig tunnelBgpConfig;

	public String getTunnelId() {
		return this.tunnelId;
	}

	public void setTunnelId(String tunnelId) {
		this.tunnelId = tunnelId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public String getRemoteCaCertificate() {
		return this.remoteCaCertificate;
	}

	public void setRemoteCaCertificate(String remoteCaCertificate) {
		this.remoteCaCertificate = remoteCaCertificate;
	}

	public String getCustomerGatewayId() {
		return this.customerGatewayId;
	}

	public void setCustomerGatewayId(String customerGatewayId) {
		this.customerGatewayId = customerGatewayId;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getZoneNo() {
		return this.zoneNo;
	}

	public void setZoneNo(String zoneNo) {
		this.zoneNo = zoneNo;
	}

	public String getInternetIp() {
		return this.internetIp;
	}

	public void setInternetIp(String internetIp) {
		this.internetIp = internetIp;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
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

	public TunnelBgpConfig getTunnelBgpConfig() {
		return this.tunnelBgpConfig;
	}

	public void setTunnelBgpConfig(TunnelBgpConfig tunnelBgpConfig) {
		this.tunnelBgpConfig = tunnelBgpConfig;
	}

	public static class TunnelIkeConfig {

		private String ikeAuthAlg;

		private String ikeEncAlg;

		private Long ikeLifetime;

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

		public Long getIkeLifetime() {
			return this.ikeLifetime;
		}

		public void setIkeLifetime(Long ikeLifetime) {
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

	public static class TunnelBgpConfig {

		private Boolean enableBgp;

		private Long localAsn;

		private String localBgpIp;

		private Long peerAsn;

		private String peerBgpIp;

		private String tunnelCidr;

		public Boolean getEnableBgp() {
			return this.enableBgp;
		}

		public void setEnableBgp(Boolean enableBgp) {
			this.enableBgp = enableBgp;
		}

		public Long getLocalAsn() {
			return this.localAsn;
		}

		public void setLocalAsn(Long localAsn) {
			this.localAsn = localAsn;
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

	@Override
	public ModifyTunnelAttributeResponse getInstance(UnmarshallerContext context) {
		return	ModifyTunnelAttributeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
