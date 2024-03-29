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
import com.aliyuncs.waf_openapi.transform.v20190910.DescribeDomainBasicConfigsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainBasicConfigsResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private List<DomainConfig> domainConfigs;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

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

		private Integer status;

		private String domain;

		private String owner;

		private Integer ccMode;

		private Integer ccStatus;

		private String accessType;

		private Long version;

		private Integer aclStatus;

		private Integer wafStatus;

		private Integer wafMode;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public Integer getCcMode() {
			return this.ccMode;
		}

		public void setCcMode(Integer ccMode) {
			this.ccMode = ccMode;
		}

		public Integer getCcStatus() {
			return this.ccStatus;
		}

		public void setCcStatus(Integer ccStatus) {
			this.ccStatus = ccStatus;
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

		public Integer getAclStatus() {
			return this.aclStatus;
		}

		public void setAclStatus(Integer aclStatus) {
			this.aclStatus = aclStatus;
		}

		public Integer getWafStatus() {
			return this.wafStatus;
		}

		public void setWafStatus(Integer wafStatus) {
			this.wafStatus = wafStatus;
		}

		public Integer getWafMode() {
			return this.wafMode;
		}

		public void setWafMode(Integer wafMode) {
			this.wafMode = wafMode;
		}
	}

	@Override
	public DescribeDomainBasicConfigsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainBasicConfigsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
