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
import com.aliyuncs.waf_openapi.transform.v20190910.DescribeOutputDomainsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeOutputDomainsResponse extends AcsResponse {

	private String requestId;

	private String wafTaskId;

	private Integer taskStatus;

	private Integer total;

	private List<DomainListItem> domainList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getWafTaskId() {
		return this.wafTaskId;
	}

	public void setWafTaskId(String wafTaskId) {
		this.wafTaskId = wafTaskId;
	}

	public Integer getTaskStatus() {
		return this.taskStatus;
	}

	public void setTaskStatus(Integer taskStatus) {
		this.taskStatus = taskStatus;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<DomainListItem> getDomainList() {
		return this.domainList;
	}

	public void setDomainList(List<DomainListItem> domainList) {
		this.domainList = domainList;
	}

	public static class DomainListItem {

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
	public DescribeOutputDomainsResponse getInstance(UnmarshallerContext context) {
		return	DescribeOutputDomainsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
