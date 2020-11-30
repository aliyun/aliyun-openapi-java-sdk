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

package com.aliyuncs.dcdn.model.v20180115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dcdn.transform.v20180115.DescribeDcdnWafDomainResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDcdnWafDomainResponse extends AcsResponse {

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

		private Integer status;

		private String domain;

		private Integer wafStatus;

		private Integer ccStatus;

		private Integer aclStatus;

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

		public Integer getWafStatus() {
			return this.wafStatus;
		}

		public void setWafStatus(Integer wafStatus) {
			this.wafStatus = wafStatus;
		}

		public Integer getCcStatus() {
			return this.ccStatus;
		}

		public void setCcStatus(Integer ccStatus) {
			this.ccStatus = ccStatus;
		}

		public Integer getAclStatus() {
			return this.aclStatus;
		}

		public void setAclStatus(Integer aclStatus) {
			this.aclStatus = aclStatus;
		}
	}

	@Override
	public DescribeDcdnWafDomainResponse getInstance(UnmarshallerContext context) {
		return	DescribeDcdnWafDomainResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
