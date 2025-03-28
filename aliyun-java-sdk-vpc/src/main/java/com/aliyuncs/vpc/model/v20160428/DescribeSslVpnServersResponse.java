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
import com.aliyuncs.vpc.transform.v20160428.DescribeSslVpnServersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSslVpnServersResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private Integer totalCount;

	private List<SslVpnServer> sslVpnServers;

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

	public List<SslVpnServer> getSslVpnServers() {
		return this.sslVpnServers;
	}

	public void setSslVpnServers(List<SslVpnServer> sslVpnServers) {
		this.sslVpnServers = sslVpnServers;
	}

	public static class SslVpnServer {

		private String internetIp;

		private String iDaaSInstanceId;

		private Long createTime;

		private String vpnGatewayId;

		private String iDaaSRegionId;

		private Boolean compress;

		private Integer port;

		private String localSubnet;

		private String regionId;

		private String cipher;

		private Integer connections;

		private String sslVpnServerId;

		private Integer maxConnections;

		private String name;

		private Boolean enableMultiFactorAuth;

		private String clientIpPool;

		private String proto;

		private String resourceGroupId;

		private String iDaaSApplicationId;

		private String iDaaSInstanceVersion;

		public String getInternetIp() {
			return this.internetIp;
		}

		public void setInternetIp(String internetIp) {
			this.internetIp = internetIp;
		}

		public String getIDaaSInstanceId() {
			return this.iDaaSInstanceId;
		}

		public void setIDaaSInstanceId(String iDaaSInstanceId) {
			this.iDaaSInstanceId = iDaaSInstanceId;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getVpnGatewayId() {
			return this.vpnGatewayId;
		}

		public void setVpnGatewayId(String vpnGatewayId) {
			this.vpnGatewayId = vpnGatewayId;
		}

		public String getIDaaSRegionId() {
			return this.iDaaSRegionId;
		}

		public void setIDaaSRegionId(String iDaaSRegionId) {
			this.iDaaSRegionId = iDaaSRegionId;
		}

		public Boolean getCompress() {
			return this.compress;
		}

		public void setCompress(Boolean compress) {
			this.compress = compress;
		}

		public Integer getPort() {
			return this.port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}

		public String getLocalSubnet() {
			return this.localSubnet;
		}

		public void setLocalSubnet(String localSubnet) {
			this.localSubnet = localSubnet;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getCipher() {
			return this.cipher;
		}

		public void setCipher(String cipher) {
			this.cipher = cipher;
		}

		public Integer getConnections() {
			return this.connections;
		}

		public void setConnections(Integer connections) {
			this.connections = connections;
		}

		public String getSslVpnServerId() {
			return this.sslVpnServerId;
		}

		public void setSslVpnServerId(String sslVpnServerId) {
			this.sslVpnServerId = sslVpnServerId;
		}

		public Integer getMaxConnections() {
			return this.maxConnections;
		}

		public void setMaxConnections(Integer maxConnections) {
			this.maxConnections = maxConnections;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Boolean getEnableMultiFactorAuth() {
			return this.enableMultiFactorAuth;
		}

		public void setEnableMultiFactorAuth(Boolean enableMultiFactorAuth) {
			this.enableMultiFactorAuth = enableMultiFactorAuth;
		}

		public String getClientIpPool() {
			return this.clientIpPool;
		}

		public void setClientIpPool(String clientIpPool) {
			this.clientIpPool = clientIpPool;
		}

		public String getProto() {
			return this.proto;
		}

		public void setProto(String proto) {
			this.proto = proto;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getIDaaSApplicationId() {
			return this.iDaaSApplicationId;
		}

		public void setIDaaSApplicationId(String iDaaSApplicationId) {
			this.iDaaSApplicationId = iDaaSApplicationId;
		}

		public String getIDaaSInstanceVersion() {
			return this.iDaaSInstanceVersion;
		}

		public void setIDaaSInstanceVersion(String iDaaSInstanceVersion) {
			this.iDaaSInstanceVersion = iDaaSInstanceVersion;
		}
	}

	@Override
	public DescribeSslVpnServersResponse getInstance(UnmarshallerContext context) {
		return	DescribeSslVpnServersResponseUnmarshaller.unmarshall(this, context);
	}
}
