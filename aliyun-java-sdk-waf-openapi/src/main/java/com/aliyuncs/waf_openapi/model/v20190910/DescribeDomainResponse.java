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

		private Integer httpsRedirect;

		private Integer loadBalancing;

		private String cname;

		private Integer isAccessProduct;

		private Long version;

		private Integer clusterType;

		private Integer connectionTime;

		private Integer readTime;

		private Integer writeTime;

		private String resourceGroupId;

		private List<LogHeader> logHeaders;

		private List<String> sourceIps;

		private List<String> http2Port;

		private List<String> httpPort;

		private List<String> httpsPort;

		public Integer getHttpToUserIp() {
			return this.httpToUserIp;
		}

		public void setHttpToUserIp(Integer httpToUserIp) {
			this.httpToUserIp = httpToUserIp;
		}

		public Integer getHttpsRedirect() {
			return this.httpsRedirect;
		}

		public void setHttpsRedirect(Integer httpsRedirect) {
			this.httpsRedirect = httpsRedirect;
		}

		public Integer getLoadBalancing() {
			return this.loadBalancing;
		}

		public void setLoadBalancing(Integer loadBalancing) {
			this.loadBalancing = loadBalancing;
		}

		public String getCname() {
			return this.cname;
		}

		public void setCname(String cname) {
			this.cname = cname;
		}

		public Integer getIsAccessProduct() {
			return this.isAccessProduct;
		}

		public void setIsAccessProduct(Integer isAccessProduct) {
			this.isAccessProduct = isAccessProduct;
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

		public Integer getConnectionTime() {
			return this.connectionTime;
		}

		public void setConnectionTime(Integer connectionTime) {
			this.connectionTime = connectionTime;
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

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public List<LogHeader> getLogHeaders() {
			return this.logHeaders;
		}

		public void setLogHeaders(List<LogHeader> logHeaders) {
			this.logHeaders = logHeaders;
		}

		public List<String> getSourceIps() {
			return this.sourceIps;
		}

		public void setSourceIps(List<String> sourceIps) {
			this.sourceIps = sourceIps;
		}

		public List<String> getHttp2Port() {
			return this.http2Port;
		}

		public void setHttp2Port(List<String> http2Port) {
			this.http2Port = http2Port;
		}

		public List<String> getHttpPort() {
			return this.httpPort;
		}

		public void setHttpPort(List<String> httpPort) {
			this.httpPort = httpPort;
		}

		public List<String> getHttpsPort() {
			return this.httpsPort;
		}

		public void setHttpsPort(List<String> httpsPort) {
			this.httpsPort = httpsPort;
		}

		public static class LogHeader {

			private String v;

			private String k;

			public String getV() {
				return this.v;
			}

			public void setV(String v) {
				this.v = v;
			}

			public String getK() {
				return this.k;
			}

			public void setK(String k) {
				this.k = k;
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
