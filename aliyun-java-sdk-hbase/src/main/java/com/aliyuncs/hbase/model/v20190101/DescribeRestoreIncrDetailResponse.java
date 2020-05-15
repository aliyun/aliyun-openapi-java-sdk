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

package com.aliyuncs.hbase.model.v20190101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.hbase.transform.v20190101.DescribeRestoreIncrDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRestoreIncrDetailResponse extends AcsResponse {

	private String requestId;

	private RestoreIncrDetail restoreIncrDetail;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public RestoreIncrDetail getRestoreIncrDetail() {
		return this.restoreIncrDetail;
	}

	public void setRestoreIncrDetail(RestoreIncrDetail restoreIncrDetail) {
		this.restoreIncrDetail = restoreIncrDetail;
	}

	public static class RestoreIncrDetail {

		private String state;

		private String startTime;

		private String endTime;

		private String restoreStartTs;

		private String restoredTs;

		private String restoreDelay;

		private String process;

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
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

		public String getRestoreStartTs() {
			return this.restoreStartTs;
		}

		public void setRestoreStartTs(String restoreStartTs) {
			this.restoreStartTs = restoreStartTs;
		}

		public String getRestoredTs() {
			return this.restoredTs;
		}

		public void setRestoredTs(String restoredTs) {
			this.restoredTs = restoredTs;
		}

		public String getRestoreDelay() {
			return this.restoreDelay;
		}

		public void setRestoreDelay(String restoreDelay) {
			this.restoreDelay = restoreDelay;
		}

		public String getProcess() {
			return this.process;
		}

		public void setProcess(String process) {
			this.process = process;
		}
	}

	@Override
	public DescribeRestoreIncrDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeRestoreIncrDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
