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

package com.aliyuncs.drds.model.v20190123;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.drds.transform.v20190123.DescribeInstDbLogInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstDbLogInfoResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private LogTimeRange logTimeRange;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public LogTimeRange getLogTimeRange() {
		return this.logTimeRange;
	}

	public void setLogTimeRange(LogTimeRange logTimeRange) {
		this.logTimeRange = logTimeRange;
	}

	public static class LogTimeRange {

		private Long supportOldestTime;

		private Long supportLatestTime;

		public Long getSupportOldestTime() {
			return this.supportOldestTime;
		}

		public void setSupportOldestTime(Long supportOldestTime) {
			this.supportOldestTime = supportOldestTime;
		}

		public Long getSupportLatestTime() {
			return this.supportLatestTime;
		}

		public void setSupportLatestTime(Long supportLatestTime) {
			this.supportLatestTime = supportLatestTime;
		}
	}

	@Override
	public DescribeInstDbLogInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstDbLogInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
