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

	private String requestId;

	private Long totalCount;

	private Long pageNumber;

	private Long pageSize;

	private List<Domain> domains;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public List<Domain> getDomains() {
		return this.domains;
	}

	public void setDomains(List<Domain> domains) {
		this.domains = domains;
	}

	public static class Domain {

		private String domainId;

		private String domainName;

		private String punyCode;

		private Boolean aliDomain;

		private Long recordCount;

		private String registrantEmail;

		private String remark;

		private String groupId;

		private String groupName;

		private String instanceId;

		private String versionCode;

		private String versionName;

		private String instanceEndTime;

		private Boolean instanceExpired;

		private Boolean starmark;

		private String createTime;

		private Long createTimestamp;

		private List<String> dnsServers;

		public String getDomainId() {
			return this.domainId;
		}

		public void setDomainId(String domainId) {
			this.domainId = domainId;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getPunyCode() {
			return this.punyCode;
		}

		public void setPunyCode(String punyCode) {
			this.punyCode = punyCode;
		}

		public Boolean getAliDomain() {
			return this.aliDomain;
		}

		public void setAliDomain(Boolean aliDomain) {
			this.aliDomain = aliDomain;
		}

		public Long getRecordCount() {
			return this.recordCount;
		}

		public void setRecordCount(Long recordCount) {
			this.recordCount = recordCount;
		}

		public String getRegistrantEmail() {
			return this.registrantEmail;
		}

		public void setRegistrantEmail(String registrantEmail) {
			this.registrantEmail = registrantEmail;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
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

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getVersionCode() {
			return this.versionCode;
		}

		public void setVersionCode(String versionCode) {
			this.versionCode = versionCode;
		}

		public String getVersionName() {
			return this.versionName;
		}

		public void setVersionName(String versionName) {
			this.versionName = versionName;
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

		public Boolean getStarmark() {
			return this.starmark;
		}

		public void setStarmark(Boolean starmark) {
			this.starmark = starmark;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Long getCreateTimestamp() {
			return this.createTimestamp;
		}

		public void setCreateTimestamp(Long createTimestamp) {
			this.createTimestamp = createTimestamp;
		}

		public List<String> getDnsServers() {
			return this.dnsServers;
		}

		public void setDnsServers(List<String> dnsServers) {
			this.dnsServers = dnsServers;
		}
	}

	@Override
	public DescribeDomainsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainsResponseUnmarshaller.unmarshall(this, context);
	}
}
