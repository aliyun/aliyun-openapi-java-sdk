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
import com.aliyuncs.alidns.transform.v20150109.DescribeDomainLogsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainLogsResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private Long pageNumber;

	private Long pageSize;

	private List<DomainLog> domainLogs;

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

	public List<DomainLog> getDomainLogs() {
		return this.domainLogs;
	}

	public void setDomainLogs(List<DomainLog> domainLogs) {
		this.domainLogs = domainLogs;
	}

	public static class DomainLog {

		private String actionTime;

		private Long actionTimestamp;

		private String domainName;

		private String action;

		private String message;

		private String clientIp;

		private String zoneId;

		public String getActionTime() {
			return this.actionTime;
		}

		public void setActionTime(String actionTime) {
			this.actionTime = actionTime;
		}

		public Long getActionTimestamp() {
			return this.actionTimestamp;
		}

		public void setActionTimestamp(Long actionTimestamp) {
			this.actionTimestamp = actionTimestamp;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getAction() {
			return this.action;
		}

		public void setAction(String action) {
			this.action = action;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getClientIp() {
			return this.clientIp;
		}

		public void setClientIp(String clientIp) {
			this.clientIp = clientIp;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}
	}

	@Override
	public DescribeDomainLogsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainLogsResponseUnmarshaller.unmarshall(this, context);
	}
}
