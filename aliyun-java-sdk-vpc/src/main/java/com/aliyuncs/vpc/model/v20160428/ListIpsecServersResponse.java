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
import com.aliyuncs.vpc.transform.v20160428.ListIpsecServersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListIpsecServersResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private Integer totalCount;

	private Integer maxResults;

	private List<IpsecServer> ipsecServers;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

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

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<IpsecServer> getIpsecServers() {
		return this.ipsecServers;
	}

	public void setIpsecServers(List<IpsecServer> ipsecServers) {
		this.ipsecServers = ipsecServers;
	}

	public static class IpsecServer {

		private String creationTime;

		private Integer onlineClientCount;

		private String internetIp;

		private String ipsecServerName;

		private String iDaaSInstanceId;

		private Boolean effectImmediately;

		private String vpnGatewayId;

		private String localSubnet;

		private String psk;

		private String regionId;

		private Boolean pskEnabled;

		private String ipsecServerId;

		private Boolean multiFactorAuthEnabled;

		private Integer maxConnections;

		private String clientIpPool;

		private String resourceGroupId;

		private IkeConfig ikeConfig;

		private IpsecConfig ipsecConfig;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public Integer getOnlineClientCount() {
			return this.onlineClientCount;
		}

		public void setOnlineClientCount(Integer onlineClientCount) {
			this.onlineClientCount = onlineClientCount;
		}

		public String getInternetIp() {
			return this.internetIp;
		}

		public void setInternetIp(String internetIp) {
			this.internetIp = internetIp;
		}

		public String getIpsecServerName() {
			return this.ipsecServerName;
		}

		public void setIpsecServerName(String ipsecServerName) {
			this.ipsecServerName = ipsecServerName;
		}

		public String getIDaaSInstanceId() {
			return this.iDaaSInstanceId;
		}

		public void setIDaaSInstanceId(String iDaaSInstanceId) {
			this.iDaaSInstanceId = iDaaSInstanceId;
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

		public String getPsk() {
			return this.psk;
		}

		public void setPsk(String psk) {
			this.psk = psk;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Boolean getPskEnabled() {
			return this.pskEnabled;
		}

		public void setPskEnabled(Boolean pskEnabled) {
			this.pskEnabled = pskEnabled;
		}

		public String getIpsecServerId() {
			return this.ipsecServerId;
		}

		public void setIpsecServerId(String ipsecServerId) {
			this.ipsecServerId = ipsecServerId;
		}

		public Boolean getMultiFactorAuthEnabled() {
			return this.multiFactorAuthEnabled;
		}

		public void setMultiFactorAuthEnabled(Boolean multiFactorAuthEnabled) {
			this.multiFactorAuthEnabled = multiFactorAuthEnabled;
		}

		public Integer getMaxConnections() {
			return this.maxConnections;
		}

		public void setMaxConnections(Integer maxConnections) {
			this.maxConnections = maxConnections;
		}

		public String getClientIpPool() {
			return this.clientIpPool;
		}

		public void setClientIpPool(String clientIpPool) {
			this.clientIpPool = clientIpPool;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
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

		public static class IkeConfig {

			private String remoteId;

			private Long ikeLifetime;

			private String ikeEncAlg;

			private String localId;

			private String ikeMode;

			private String ikeVersion;

			private String ikePfs;

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
	}

	@Override
	public ListIpsecServersResponse getInstance(UnmarshallerContext context) {
		return	ListIpsecServersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
