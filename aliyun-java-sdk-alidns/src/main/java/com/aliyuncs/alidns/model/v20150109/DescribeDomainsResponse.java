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
import com.aliyuncs.alidns.transform.v20150109.DescribeDomainsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainsResponse extends AcsResponse {

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

		private String remark;

		private String createTime;

		private Long recordCount;

		private String instanceId;

		private String domainName;

		private String domainId;

		private Boolean aliDomain;

		private String groupId;

		private String groupName;

		private String resourceGroupId;

		private String instanceEndTime;

		private Boolean instanceExpired;

		private String versionName;

		private String versionCode;

		private String punyCode;

		private String registrantEmail;

		private Long createTimestamp;

		private Boolean starmark;

		private List<Tag> tags;

		private List<String> dnsServers;

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Long getRecordCount() {
			return this.recordCount;
		}

		public void setRecordCount(Long recordCount) {
			this.recordCount = recordCount;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
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

		public Boolean getAliDomain() {
			return this.aliDomain;
		}

		public void setAliDomain(Boolean aliDomain) {
			this.aliDomain = aliDomain;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getInstanceEndTime() {
			return this.instanceEndTime;
		}

		public void setInstanceEndTime(String instanceEndTime) {
			this.instanceEndTime = instanceEndTime;
		}

		public Boolean getInstanceExpired() {
			return this.instanceExpired;
		}

		public void setInstanceExpired(Boolean instanceExpired) {
			this.instanceExpired = instanceExpired;
		}

		public String getVersionName() {
			return this.versionName;
		}

		public void setVersionName(String versionName) {
			this.versionName = versionName;
		}

		public String getVersionCode() {
			return this.versionCode;
		}

		public void setVersionCode(String versionCode) {
			this.versionCode = versionCode;
		}

		public String getPunyCode() {
			return this.punyCode;
		}

		public void setPunyCode(String punyCode) {
			this.punyCode = punyCode;
		}

		public String getRegistrantEmail() {
			return this.registrantEmail;
		}

		public void setRegistrantEmail(String registrantEmail) {
			this.registrantEmail = registrantEmail;
		}

		public Long getCreateTimestamp() {
			return this.createTimestamp;
		}

		public void setCreateTimestamp(Long createTimestamp) {
			this.createTimestamp = createTimestamp;
		}

		public Boolean getStarmark() {
			return this.starmark;
		}

		public void setStarmark(Boolean starmark) {
			this.starmark = starmark;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<String> getDnsServers() {
			return this.dnsServers;
		}

		public void setDnsServers(List<String> dnsServers) {
			this.dnsServers = dnsServers;
		}

		public static class Tag {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public DescribeDomainsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainsResponseUnmarshaller.unmarshall(this, context);
	}
}
