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
import com.aliyuncs.alidns.transform.v20150109.DescribePdnsThreatLogsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePdnsThreatLogsResponse extends AcsResponse {

	private Long totalCount;

	private String requestId;

	private Long pageSize;

	private Long pageNumber;

	private List<Log> logs;

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<Log> getLogs() {
		return this.logs;
	}

	public void setLogs(List<Log> logs) {
		this.logs = logs;
	}

	public static class Log {

		private String subDomain;

		private String sourceIp;

		private String threatLevel;

		private String threatTime;

		private String threatType;

		public String getSubDomain() {
			return this.subDomain;
		}

		public void setSubDomain(String subDomain) {
			this.subDomain = subDomain;
		}

		public String getSourceIp() {
			return this.sourceIp;
		}

		public void setSourceIp(String sourceIp) {
			this.sourceIp = sourceIp;
		}

		public String getThreatLevel() {
			return this.threatLevel;
		}

		public void setThreatLevel(String threatLevel) {
			this.threatLevel = threatLevel;
		}

		public String getThreatTime() {
			return this.threatTime;
		}

		public void setThreatTime(String threatTime) {
			this.threatTime = threatTime;
		}

		public String getThreatType() {
			return this.threatType;
		}

		public void setThreatType(String threatType) {
			this.threatType = threatType;
		}
	}

	@Override
	public DescribePdnsThreatLogsResponse getInstance(UnmarshallerContext context) {
		return	DescribePdnsThreatLogsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
