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

package com.aliyuncs.eiam.model.v20211201;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.eiam.transform.v20211201.GetDomainResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDomainResponse extends AcsResponse {

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

		private String instanceId;

		private String domainId;

		private String domain;

		private String domainType;

		private String lockMode;

		private Boolean defaultDomain;

		private Long createTime;

		private Long updateTime;

		private String brandId;

		private Filing filing;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getDomainId() {
			return this.domainId;
		}

		public void setDomainId(String domainId) {
			this.domainId = domainId;
		}

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public String getDomainType() {
			return this.domainType;
		}

		public void setDomainType(String domainType) {
			this.domainType = domainType;
		}

		public String getLockMode() {
			return this.lockMode;
		}

		public void setLockMode(String lockMode) {
			this.lockMode = lockMode;
		}

		public Boolean getDefaultDomain() {
			return this.defaultDomain;
		}

		public void setDefaultDomain(Boolean defaultDomain) {
			this.defaultDomain = defaultDomain;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public String getBrandId() {
			return this.brandId;
		}

		public void setBrandId(String brandId) {
			this.brandId = brandId;
		}

		public Filing getFiling() {
			return this.filing;
		}

		public void setFiling(Filing filing) {
			this.filing = filing;
		}

		public static class Filing {

			private String icpNumber;

			public String getIcpNumber() {
				return this.icpNumber;
			}

			public void setIcpNumber(String icpNumber) {
				this.icpNumber = icpNumber;
			}
		}
	}

	@Override
	public GetDomainResponse getInstance(UnmarshallerContext context) {
		return	GetDomainResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
