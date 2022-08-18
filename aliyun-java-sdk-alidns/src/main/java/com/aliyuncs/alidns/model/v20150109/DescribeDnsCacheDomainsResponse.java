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

package com.aliyuncs.alidns.model.v20150109;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.alidns.transform.v20150109.DescribeDnsCacheDomainsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDnsCacheDomainsResponse extends AcsResponse {

	private Long totalCount;

	private Long pageSize;

	private String requestId;

	private Long pageNumber;

	private List<Domain> domains;

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<Domain> getDomains() {
		return this.domains;
	}

	public void setDomains(List<Domain> domains) {
		this.domains = domains;
	}

	public static class Domain {

		private String sourceProtocol;

		private String updateTime;

		private String remark;

		private String expireTime;

		private String createTime;

		private String instanceId;

		private String sourceEdns;

		private String domainName;

		private String domainId;

		private Long updateTimestamp;

		private Long expireTimestamp;

		private Integer cacheTtlMax;

		private Integer cacheTtlMin;

		private String versionCode;

		private Long createTimestamp;

		private List<SourceDnsServer> sourceDnsServers;

		public String getSourceProtocol() {
			return this.sourceProtocol;
		}

		public void setSourceProtocol(String sourceProtocol) {
			this.sourceProtocol = sourceProtocol;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getSourceEdns() {
			return this.sourceEdns;
		}

		public void setSourceEdns(String sourceEdns) {
			this.sourceEdns = sourceEdns;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getDomainId() {
			return this.domainId;
		}

		public void setDomainId(String domainId) {
			this.domainId = domainId;
		}

		public Long getUpdateTimestamp() {
			return this.updateTimestamp;
		}

		public void setUpdateTimestamp(Long updateTimestamp) {
			this.updateTimestamp = updateTimestamp;
		}

		public Long getExpireTimestamp() {
			return this.expireTimestamp;
		}

		public void setExpireTimestamp(Long expireTimestamp) {
			this.expireTimestamp = expireTimestamp;
		}

		public Integer getCacheTtlMax() {
			return this.cacheTtlMax;
		}

		public void setCacheTtlMax(Integer cacheTtlMax) {
			this.cacheTtlMax = cacheTtlMax;
		}

		public Integer getCacheTtlMin() {
			return this.cacheTtlMin;
		}

		public void setCacheTtlMin(Integer cacheTtlMin) {
			this.cacheTtlMin = cacheTtlMin;
		}

		public String getVersionCode() {
			return this.versionCode;
		}

		public void setVersionCode(String versionCode) {
			this.versionCode = versionCode;
		}

		public Long getCreateTimestamp() {
			return this.createTimestamp;
		}

		public void setCreateTimestamp(Long createTimestamp) {
			this.createTimestamp = createTimestamp;
		}

		public List<SourceDnsServer> getSourceDnsServers() {
			return this.sourceDnsServers;
		}

		public void setSourceDnsServers(List<SourceDnsServer> sourceDnsServers) {
			this.sourceDnsServers = sourceDnsServers;
		}

		public static class SourceDnsServer {

			private String host;

			private String port;

			public String getHost() {
				return this.host;
			}

			public void setHost(String host) {
				this.host = host;
			}

			public String getPort() {
				return this.port;
			}

			public void setPort(String port) {
				this.port = port;
			}
		}
	}

	@Override
	public DescribeDnsCacheDomainsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDnsCacheDomainsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
