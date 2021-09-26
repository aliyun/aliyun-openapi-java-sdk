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

package com.aliyuncs.dataworks_public.model.v20200518;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.GetInstanceStatusCountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetInstanceStatusCountResponse extends AcsResponse {

	private String requestId;

	private StatusCount statusCount;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public StatusCount getStatusCount() {
		return this.statusCount;
	}

	public void setStatusCount(StatusCount statusCount) {
		this.statusCount = statusCount;
	}

	public static class StatusCount {

		private Integer totalCount;

		private Integer notRunCount;

		private Integer waitTimeCount;

		private Integer waitResCount;

		private Integer runningCount;

		private Integer failureCount;

		private Integer successCount;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getNotRunCount() {
			return this.notRunCount;
		}

		public void setNotRunCount(Integer notRunCount) {
			this.notRunCount = notRunCount;
		}

		public Integer getWaitTimeCount() {
			return this.waitTimeCount;
		}

		public void setWaitTimeCount(Integer waitTimeCount) {
			this.waitTimeCount = waitTimeCount;
		}

		public Integer getWaitResCount() {
			return this.waitResCount;
		}

		public void setWaitResCount(Integer waitResCount) {
			this.waitResCount = waitResCount;
		}

		public Integer getRunningCount() {
			return this.runningCount;
		}

		public void setRunningCount(Integer runningCount) {
			this.runningCount = runningCount;
		}

		public Integer getFailureCount() {
			return this.failureCount;
		}

		public void setFailureCount(Integer failureCount) {
			this.failureCount = failureCount;
		}

		public Integer getSuccessCount() {
			return this.successCount;
		}

		public void setSuccessCount(Integer successCount) {
			this.successCount = successCount;
		}
	}

	@Override
	public GetInstanceStatusCountResponse getInstance(UnmarshallerContext context) {
		return	GetInstanceStatusCountResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
