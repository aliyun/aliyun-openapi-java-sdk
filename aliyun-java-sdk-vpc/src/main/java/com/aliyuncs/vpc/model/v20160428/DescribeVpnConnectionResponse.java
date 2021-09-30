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
import com.aliyuncs.vpc.transform.v20160428.DescribeVpnConnectionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVpnConnectionResponse extends AcsResponse {

	private String status;

	private String remoteCaCertificate;

	private Boolean enableNatTraversal;

	private Long createTime;

	private Boolean effectImmediately;

	private String vpnGatewayId;

	private String localSubnet;

	private String requestId;

	private String vpnConnectionId;

	private String remoteSubnet;

	private String customerGatewayId;

	private String name;

	private Boolean enableDpd;

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

	public String getRemoteCaCertificate() {
		return this.remoteCaCertificate;
	}

	public void setRemoteCaCertificate(String remoteCaCertificate) {
		this.remoteCaCertificate = remoteCaCertificate;
	}

	public Boolean getEnableNatTraversal() {
		return this.enableNatTraversal;
	}

	public void setEnableNatTraversal(Boolean enableNatTraversal) {
		this.enableNatTraversal = enableNatTraversal;
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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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
	}

	public static class VpnBgpConfig {

		private String status;

		private String peerBgpIp;

		private String tunnelCidr;

		private String enableBgp;

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

		public String getEnableBgp() {
			return this.enableBgp;
		}

		public void setEnableBgp(String enableBgp) {
			this.enableBgp = enableBgp;
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

	@Override
	public DescribeVpnConnectionResponse getInstance(UnmarshallerContext context) {
		return	DescribeVpnConnectionResponseUnmarshaller.unmarshall(this, context);
	}
}
