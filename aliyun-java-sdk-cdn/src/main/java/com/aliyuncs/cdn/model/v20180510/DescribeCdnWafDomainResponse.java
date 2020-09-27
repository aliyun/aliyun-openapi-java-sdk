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

package com.aliyuncs.cdn.model.v20180510;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20180510.DescribeCdnWafDomainResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCdnWafDomainResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private List<OutPutDomain> outPutDomains;

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

	public List<OutPutDomain> getOutPutDomains() {
		return this.outPutDomains;
	}

	public void setOutPutDomains(List<OutPutDomain> outPutDomains) {
		this.outPutDomains = outPutDomains;
	}

	public static class OutPutDomain {

		private String status;

		private String domain;

		private String wafStatus;

		private String ccStatus;

		private String aclStatus;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public String getWafStatus() {
			return this.wafStatus;
		}

		public void setWafStatus(String wafStatus) {
			this.wafStatus = wafStatus;
		}

		public String getCcStatus() {
			return this.ccStatus;
		}

		public void setCcStatus(String ccStatus) {
			this.ccStatus = ccStatus;
		}

		public String getAclStatus() {
			return this.aclStatus;
		}

		public void setAclStatus(String aclStatus) {
			this.aclStatus = aclStatus;
		}
	}

	@Override
	public DescribeCdnWafDomainResponse getInstance(UnmarshallerContext context) {
		return	DescribeCdnWafDomainResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
