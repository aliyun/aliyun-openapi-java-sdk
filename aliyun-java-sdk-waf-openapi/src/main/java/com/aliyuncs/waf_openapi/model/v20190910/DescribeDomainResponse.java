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

package com.aliyuncs.waf_openapi.model.v20190910;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.waf_openapi.transform.v20190910.DescribeDomainResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainResponse extends AcsResponse {

	private String requestId;

	private Domain domain;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Domain getDomain() {
		return this.domain;
	}

	public void setDomain(Domain domain) {
		this.domain = domain;
	}

	public static class Domain {

		private Integer httpToUserIp;

		private Integer sniStatus;

		private Integer isAccessProduct;

		private Integer accessHeaderMode;

		private Integer httpsRedirect;

		private Integer ipFollowStatus;

		private Integer loadBalancing;

		private String accessType;

		private Long version;

		private Integer clusterType;

		private Integer readTime;

		private Integer writeTime;

		private String sniHost;

		private String resourceGroupId;

		private String cname;

		private Integer connectionTime;

		private Boolean retry;

		private Boolean keepalive;

		private Integer keepaliveRequests;

		private Integer keepaliveTimeout;

		private List<LogHeader> logHeaders;

		private List<CloudNativeInstancesItem> cloudNativeInstances;

		private List<String> httpPort;

		private List<String> http2Port;

		private List<String> sourceIps;

		private List<String> httpsPort;

		private List<String> accessHeaders;

		public Integer getHttpToUserIp() {
			return this.httpToUserIp;
		}

		public void setHttpToUserIp(Integer httpToUserIp) {
			this.httpToUserIp = httpToUserIp;
		}

		public Integer getSniStatus() {
			return this.sniStatus;
		}

		public void setSniStatus(Integer sniStatus) {
			this.sniStatus = sniStatus;
		}

		public Integer getIsAccessProduct() {
			return this.isAccessProduct;
		}

		public void setIsAccessProduct(Integer isAccessProduct) {
			this.isAccessProduct = isAccessProduct;
		}

		public Integer getAccessHeaderMode() {
			return this.accessHeaderMode;
		}

		public void setAccessHeaderMode(Integer accessHeaderMode) {
			this.accessHeaderMode = accessHeaderMode;
		}

		public Integer getHttpsRedirect() {
			return this.httpsRedirect;
		}

		public void setHttpsRedirect(Integer httpsRedirect) {
			this.httpsRedirect = httpsRedirect;
		}

		public Integer getIpFollowStatus() {
			return this.ipFollowStatus;
		}

		public void setIpFollowStatus(Integer ipFollowStatus) {
			this.ipFollowStatus = ipFollowStatus;
		}

		public Integer getLoadBalancing() {
			return this.loadBalancing;
		}

		public void setLoadBalancing(Integer loadBalancing) {
			this.loadBalancing = loadBalancing;
		}

		public String getAccessType() {
			return this.accessType;
		}

		public void setAccessType(String accessType) {
			this.accessType = accessType;
		}

		public Long getVersion() {
			return this.version;
		}

		public void setVersion(Long version) {
			this.version = version;
		}

		public Integer getClusterType() {
			return this.clusterType;
		}

		public void setClusterType(Integer clusterType) {
			this.clusterType = clusterType;
		}

		public Integer getReadTime() {
			return this.readTime;
		}

		public void setReadTime(Integer readTime) {
			this.readTime = readTime;
		}

		public Integer getWriteTime() {
			return this.writeTime;
		}

		public void setWriteTime(Integer writeTime) {
			this.writeTime = writeTime;
		}

		public String getSniHost() {
			return this.sniHost;
		}

		public void setSniHost(String sniHost) {
			this.sniHost = sniHost;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getCname() {
			return this.cname;
		}

		public void setCname(String cname) {
			this.cname = cname;
		}

		public Integer getConnectionTime() {
			return this.connectionTime;
		}

		public void setConnectionTime(Integer connectionTime) {
			this.connectionTime = connectionTime;
		}

		public Boolean getRetry() {
			return this.retry;
		}

		public void setRetry(Boolean retry) {
			this.retry = retry;
		}

		public Boolean getKeepalive() {
			return this.keepalive;
		}

		public void setKeepalive(Boolean keepalive) {
			this.keepalive = keepalive;
		}

		public Integer getKeepaliveRequests() {
			return this.keepaliveRequests;
		}

		public void setKeepaliveRequests(Integer keepaliveRequests) {
			this.keepaliveRequests = keepaliveRequests;
		}

		public Integer getKeepaliveTimeout() {
			return this.keepaliveTimeout;
		}

		public void setKeepaliveTimeout(Integer keepaliveTimeout) {
			this.keepaliveTimeout = keepaliveTimeout;
		}

		public List<LogHeader> getLogHeaders() {
			return this.logHeaders;
		}

		public void setLogHeaders(List<LogHeader> logHeaders) {
			this.logHeaders = logHeaders;
		}

		public List<CloudNativeInstancesItem> getCloudNativeInstances() {
			return this.cloudNativeInstances;
		}

		public void setCloudNativeInstances(List<CloudNativeInstancesItem> cloudNativeInstances) {
			this.cloudNativeInstances = cloudNativeInstances;
		}

		public List<String> getHttpPort() {
			return this.httpPort;
		}

		public void setHttpPort(List<String> httpPort) {
			this.httpPort = httpPort;
		}

		public List<String> getHttp2Port() {
			return this.http2Port;
		}

		public void setHttp2Port(List<String> http2Port) {
			this.http2Port = http2Port;
		}

		public List<String> getSourceIps() {
			return this.sourceIps;
		}

		public void setSourceIps(List<String> sourceIps) {
			this.sourceIps = sourceIps;
		}

		public List<String> getHttpsPort() {
			return this.httpsPort;
		}

		public void setHttpsPort(List<String> httpsPort) {
			this.httpsPort = httpsPort;
		}

		public List<String> getAccessHeaders() {
			return this.accessHeaders;
		}

		public void setAccessHeaders(List<String> accessHeaders) {
			this.accessHeaders = accessHeaders;
		}

		public static class LogHeader {

			private String k;

			private String v;

			public String getK() {
				return this.k;
			}

			public void setK(String k) {
				this.k = k;
			}

			public String getV() {
				return this.v;
			}

			public void setV(String v) {
				this.v = v;
			}
		}

		public static class CloudNativeInstancesItem {

			private String redirectionTypeName;

			private String cloudNativeProductName;

			private String instanceId;

			private List<ProtocolPortConfigsItem> protocolPortConfigs;

			private List<String> iPAddressList;

			public String getRedirectionTypeName() {
				return this.redirectionTypeName;
			}

			public void setRedirectionTypeName(String redirectionTypeName) {
				this.redirectionTypeName = redirectionTypeName;
			}

			public String getCloudNativeProductName() {
				return this.cloudNativeProductName;
			}

			public void setCloudNativeProductName(String cloudNativeProductName) {
				this.cloudNativeProductName = cloudNativeProductName;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public List<ProtocolPortConfigsItem> getProtocolPortConfigs() {
				return this.protocolPortConfigs;
			}

			public void setProtocolPortConfigs(List<ProtocolPortConfigsItem> protocolPortConfigs) {
				this.protocolPortConfigs = protocolPortConfigs;
			}

			public List<String> getIPAddressList() {
				return this.iPAddressList;
			}

			public void setIPAddressList(List<String> iPAddressList) {
				this.iPAddressList = iPAddressList;
			}

			public static class ProtocolPortConfigsItem {

				private String protocol;

				private List<Integer> ports;

				public String getBizProtocol() {
					return this.protocol;
				}

				public void setBizProtocol(String protocol) {
					this.protocol = protocol;
				}

				public List<Integer> getPorts() {
					return this.ports;
				}

				public void setPorts(List<Integer> ports) {
					this.ports = ports;
				}
			}
		}
	}

	@Override
	public DescribeDomainResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
