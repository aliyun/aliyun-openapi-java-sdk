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
import com.aliyuncs.waf_openapi.transform.v20190910.DescribeDomainAdvanceConfigsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainAdvanceConfigsResponse extends AcsResponse {

	private String requestId;

	private List<DomainConfig> domainConfigs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DomainConfig> getDomainConfigs() {
		return this.domainConfigs;
	}

	public void setDomainConfigs(List<DomainConfig> domainConfigs) {
		this.domainConfigs = domainConfigs;
	}

	public static class DomainConfig {

		private String domain;

		private Profile profile;

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public Profile getProfile() {
			return this.profile;
		}

		public void setProfile(Profile profile) {
			this.profile = profile;
		}

		public static class Profile {

			private String cname;

			private Integer resolvedType;

			private Integer vipServiceStatus;

			private Integer certStatus;

			private Integer exclusiveVipStatus;

			private Integer ipv6Status;

			private String httpPort;

			private String httpsPort;

			private String http2Port;

			private String rs;

			private Integer clusterType;

			private String gSLBStatus;

			public String getCname() {
				return this.cname;
			}

			public void setCname(String cname) {
				this.cname = cname;
			}

			public Integer getResolvedType() {
				return this.resolvedType;
			}

			public void setResolvedType(Integer resolvedType) {
				this.resolvedType = resolvedType;
			}

			public Integer getVipServiceStatus() {
				return this.vipServiceStatus;
			}

			public void setVipServiceStatus(Integer vipServiceStatus) {
				this.vipServiceStatus = vipServiceStatus;
			}

			public Integer getCertStatus() {
				return this.certStatus;
			}

			public void setCertStatus(Integer certStatus) {
				this.certStatus = certStatus;
			}

			public Integer getExclusiveVipStatus() {
				return this.exclusiveVipStatus;
			}

			public void setExclusiveVipStatus(Integer exclusiveVipStatus) {
				this.exclusiveVipStatus = exclusiveVipStatus;
			}

			public Integer getIpv6Status() {
				return this.ipv6Status;
			}

			public void setIpv6Status(Integer ipv6Status) {
				this.ipv6Status = ipv6Status;
			}

			public String getHttpPort() {
				return this.httpPort;
			}

			public void setHttpPort(String httpPort) {
				this.httpPort = httpPort;
			}

			public String getHttpsPort() {
				return this.httpsPort;
			}

			public void setHttpsPort(String httpsPort) {
				this.httpsPort = httpsPort;
			}

			public String getHttp2Port() {
				return this.http2Port;
			}

			public void setHttp2Port(String http2Port) {
				this.http2Port = http2Port;
			}

			public String getRs() {
				return this.rs;
			}

			public void setRs(String rs) {
				this.rs = rs;
			}

			public Integer getClusterType() {
				return this.clusterType;
			}

			public void setClusterType(Integer clusterType) {
				this.clusterType = clusterType;
			}

			public String getGSLBStatus() {
				return this.gSLBStatus;
			}

			public void setGSLBStatus(String gSLBStatus) {
				this.gSLBStatus = gSLBStatus;
			}
		}
	}

	@Override
	public DescribeDomainAdvanceConfigsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainAdvanceConfigsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
