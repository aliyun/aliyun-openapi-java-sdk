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
import com.aliyuncs.cdn.transform.v20180510.DescribeCdnDomainLogsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCdnDomainLogsResponse extends AcsResponse {

	private String requestId;

	private List<DomainLogDetail> domainLogDetails;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DomainLogDetail> getDomainLogDetails() {
		return this.domainLogDetails;
	}

	public void setDomainLogDetails(List<DomainLogDetail> domainLogDetails) {
		this.domainLogDetails = domainLogDetails;
	}

	public static class DomainLogDetail {

		private String domainName;

		private Long logCount;

		private List<PageInfoDetail> pageInfos;

		private List<LogInfoDetail> logInfos;

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public Long getLogCount() {
			return this.logCount;
		}

		public void setLogCount(Long logCount) {
			this.logCount = logCount;
		}

		public List<PageInfoDetail> getPageInfos() {
			return this.pageInfos;
		}

		public void setPageInfos(List<PageInfoDetail> pageInfos) {
			this.pageInfos = pageInfos;
		}

		public List<LogInfoDetail> getLogInfos() {
			return this.logInfos;
		}

		public void setLogInfos(List<LogInfoDetail> logInfos) {
			this.logInfos = logInfos;
		}

		public static class PageInfoDetail {

			private Long pageIndex;

			private Long pageSize;

			private Long total;

			public Long getPageIndex() {
				return this.pageIndex;
			}

			public void setPageIndex(Long pageIndex) {
				this.pageIndex = pageIndex;
			}

			public Long getPageSize() {
				return this.pageSize;
			}

			public void setPageSize(Long pageSize) {
				this.pageSize = pageSize;
			}

			public Long getTotal() {
				return this.total;
			}

			public void setTotal(Long total) {
				this.total = total;
			}
		}

		public static class LogInfoDetail {

			private String logName;

			private String logPath;

			private Long logSize;

			private String startTime;

			private String endTime;

			public String getLogName() {
				return this.logName;
			}

			public void setLogName(String logName) {
				this.logName = logName;
			}

			public String getLogPath() {
				return this.logPath;
			}

			public void setLogPath(String logPath) {
				this.logPath = logPath;
			}

			public Long getLogSize() {
				return this.logSize;
			}

			public void setLogSize(Long logSize) {
				this.logSize = logSize;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}
		}
	}

	@Override
	public DescribeCdnDomainLogsResponse getInstance(UnmarshallerContext context) {
		return	DescribeCdnDomainLogsResponseUnmarshaller.unmarshall(this, context);
	}
}
