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

package com.aliyuncs.vod.model.v20170321;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.DescribeCdnDomainLogsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCdnDomainLogsResponse extends AcsResponse {

	private String requestId;

	private Long pageNo;

	private Long pageSize;

	private Long total;

	private DomainLogModel domainLogModel;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
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

	public DomainLogModel getDomainLogModel() {
		return this.domainLogModel;
	}

	public void setDomainLogModel(DomainLogModel domainLogModel) {
		this.domainLogModel = domainLogModel;
	}

	public static class DomainLogModel {

		private String domainName;

		private List<DomainLogDetail> domainLogDetails;

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public List<DomainLogDetail> getDomainLogDetails() {
			return this.domainLogDetails;
		}

		public void setDomainLogDetails(List<DomainLogDetail> domainLogDetails) {
			this.domainLogDetails = domainLogDetails;
		}

		public static class DomainLogDetail {

			private String logPath;

			private String startTime;

			private String endTime;

			private Long logSize;

			private String logName;

			public String getLogPath() {
				return this.logPath;
			}

			public void setLogPath(String logPath) {
				this.logPath = logPath;
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

			public Long getLogSize() {
				return this.logSize;
			}

			public void setLogSize(Long logSize) {
				this.logSize = logSize;
			}

			public String getLogName() {
				return this.logName;
			}

			public void setLogName(String logName) {
				this.logName = logName;
			}
		}
	}

	@Override
	public DescribeCdnDomainLogsResponse getInstance(UnmarshallerContext context) {
		return	DescribeCdnDomainLogsResponseUnmarshaller.unmarshall(this, context);
	}
}
