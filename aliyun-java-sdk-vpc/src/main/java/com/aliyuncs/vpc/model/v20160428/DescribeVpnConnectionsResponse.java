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

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<VpnConnection> vpnConnections;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<VpnConnection> getVpnConnections() {
		return this.vpnConnections;
	}

	public void setVpnConnections(List<VpnConnection> vpnConnections) {
		this.vpnConnections = vpnConnections;
	}

	public static class VpnConnection {

		private String vpnConnectionId;

		private String customerGatewayId;

		private String vpnGatewayId;

		private String name;

		private String localSubnet;

		private String remoteSubnet;

		private Long createTime;

		private Boolean effectImmediately;

		private String status;

		private Boolean enableDpd;

		private Boolean enableNatTraversal;

		private IkeConfig ikeConfig;

		private IpsecConfig ipsecConfig;

		private VcoHealthCheck vcoHealthCheck;

		public String getVpnConnectionId() {
			return this.vpnConnectionId;
		}

		public void setVpnConnectionId(String vpnConnectionId) {
			this.vpnConnectionId = vpnConnectionId;
		}

		public String getCustomerGatewayId() {
			return this.customerGatewayId;
		}

		public void setCustomerGatewayId(String customerGatewayId) {
			this.customerGatewayId = customerGatewayId;
		}

		public String getVpnGatewayId() {
			return this.vpnGatewayId;
		}

		public void setVpnGatewayId(String vpnGatewayId) {
			this.vpnGatewayId = vpnGatewayId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getLocalSubnet() {
			return this.localSubnet;
		}

		public void setLocalSubnet(String localSubnet) {
			this.localSubnet = localSubnet;
		}

		public String getRemoteSubnet() {
			return this.remoteSubnet;
		}

		public void setRemoteSubnet(String remoteSubnet) {
			this.remoteSubnet = remoteSubnet;
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

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Boolean getEnableDpd() {
			return this.enableDpd;
		}

		public void setEnableDpd(Boolean enableDpd) {
			this.enableDpd = enableDpd;
		}

		public Boolean getEnableNatTraversal() {
			return this.enableNatTraversal;
		}

		public void setEnableNatTraversal(Boolean enableNatTraversal) {
			this.enableNatTraversal = enableNatTraversal;
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

		public static class IkeConfig {

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

		public static class IpsecConfig {

			private String ipsecEncAlg;

			private String ipsecAuthAlg;

			private String ipsecPfs;

			private Long ipsecLifetime;

			public String getIpsecEncAlg() {
				return this.ipsecEncAlg;
			}

			public void setIpsecEncAlg(String ipsecEncAlg) {
				this.ipsecEncAlg = ipsecEncAlg;
			}

			public String getIpsecAuthAlg() {
				return this.ipsecAuthAlg;
			}

			public void setIpsecAuthAlg(String ipsecAuthAlg) {
				this.ipsecAuthAlg = ipsecAuthAlg;
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

		public static class VcoHealthCheck {

			private String enable;

			private String sip;

			private String dip;

			private Integer interval;

			private Integer retry;

			private String status;

			public String getEnable() {
				return this.enable;
			}

			public void setEnable(String enable) {
				this.enable = enable;
			}

			public String getSip() {
				return this.sip;
			}

			public void setSip(String sip) {
				this.sip = sip;
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

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}
	}

	@Override
	public DescribeVpnConnectionsResponse getInstance(UnmarshallerContext context) {
		return	DescribeVpnConnectionsResponseUnmarshaller.unmarshall(this, context);
	}
}
