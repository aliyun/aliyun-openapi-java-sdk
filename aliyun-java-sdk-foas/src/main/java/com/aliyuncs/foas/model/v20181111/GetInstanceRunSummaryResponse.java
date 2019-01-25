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

package com.aliyuncs.foas.model.v20181111;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.foas.transform.v20181111.GetInstanceRunSummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetInstanceRunSummaryResponse extends AcsResponse {

	private String requestId;

	private RunSummary runSummary;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public RunSummary getRunSummary() {
		return this.runSummary;
	}

	public void setRunSummary(RunSummary runSummary) {
		this.runSummary = runSummary;
	}

	public static class RunSummary {

		private Long id;

		private String actualState;

		private String expectState;

		private Long lastErrorTime;

		private String lastErrorMessage;

		private String engineJobHandler;

		private Long inputDelay;

		private String jobName;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getActualState() {
			return this.actualState;
		}

		public void setActualState(String actualState) {
			this.actualState = actualState;
		}

		public String getExpectState() {
			return this.expectState;
		}

		public void setExpectState(String expectState) {
			this.expectState = expectState;
		}

		public Long getLastErrorTime() {
			return this.lastErrorTime;
		}

		public void setLastErrorTime(Long lastErrorTime) {
			this.lastErrorTime = lastErrorTime;
		}

		public String getLastErrorMessage() {
			return this.lastErrorMessage;
		}

		public void setLastErrorMessage(String lastErrorMessage) {
			this.lastErrorMessage = lastErrorMessage;
		}

		public String getEngineJobHandler() {
			return this.engineJobHandler;
		}

		public void setEngineJobHandler(String engineJobHandler) {
			this.engineJobHandler = engineJobHandler;
		}

		public Long getInputDelay() {
			return this.inputDelay;
		}

		public void setInputDelay(Long inputDelay) {
			this.inputDelay = inputDelay;
		}

		public String getJobName() {
			return this.jobName;
		}

		public void setJobName(String jobName) {
			this.jobName = jobName;
		}
	}

	@Override
	public GetInstanceRunSummaryResponse getInstance(UnmarshallerContext context) {
		return	GetInstanceRunSummaryResponseUnmarshaller.unmarshall(this, context);
	}
}
