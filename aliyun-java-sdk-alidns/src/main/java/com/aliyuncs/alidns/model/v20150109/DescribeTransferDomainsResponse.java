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
import com.aliyuncs.alidns.transform.v20150109.DescribeTransferDomainsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTransferDomainsResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private Long pageNumber;

	private Long pageSize;

	private List<DomainTransfer> domainTransfers;

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

	public List<DomainTransfer> getDomainTransfers() {
		return this.domainTransfers;
	}

	public void setDomainTransfers(List<DomainTransfer> domainTransfers) {
		this.domainTransfers = domainTransfers;
	}

	public static class DomainTransfer {

		private String domainName;

		private String createTime;

		private Long createTimestamp;

		private Long fromUserId;

		private Long targetUserId;

		private Long id;

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
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

		public Long getFromUserId() {
			return this.fromUserId;
		}

		public void setFromUserId(Long fromUserId) {
			this.fromUserId = fromUserId;
		}

		public Long getTargetUserId() {
			return this.targetUserId;
		}

		public void setTargetUserId(Long targetUserId) {
			this.targetUserId = targetUserId;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}
	}

	@Override
	public DescribeTransferDomainsResponse getInstance(UnmarshallerContext context) {
		return	DescribeTransferDomainsResponseUnmarshaller.unmarshall(this, context);
	}
}
