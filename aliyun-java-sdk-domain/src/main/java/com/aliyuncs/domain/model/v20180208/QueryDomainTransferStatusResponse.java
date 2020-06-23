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

package com.aliyuncs.domain.model.v20180208;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.domain.transform.v20180208.QueryDomainTransferStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryDomainTransferStatusResponse extends AcsResponse {

	private String requestId;

	private List<DomainTransferStatusItem> domainTransferStatus;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DomainTransferStatusItem> getDomainTransferStatus() {
		return this.domainTransferStatus;
	}

	public void setDomainTransferStatus(List<DomainTransferStatusItem> domainTransferStatus) {
		this.domainTransferStatus = domainTransferStatus;
	}

	public static class DomainTransferStatusItem {

		private String domainStatusDescription;

		private String domainName;

		public String getDomainStatusDescription() {
			return this.domainStatusDescription;
		}

		public void setDomainStatusDescription(String domainStatusDescription) {
			this.domainStatusDescription = domainStatusDescription;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}
	}

	@Override
	public QueryDomainTransferStatusResponse getInstance(UnmarshallerContext context) {
		return	QueryDomainTransferStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
