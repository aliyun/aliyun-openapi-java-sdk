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

package com.aliyuncs.mts.model.v20140618;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.mts.transform.v20140618.SubmitSubtitleJobResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SubmitSubtitleJobResponse extends AcsResponse {

	private String requestId;

	private SubtitleJob subtitleJob;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public SubtitleJob getSubtitleJob() {
		return this.subtitleJob;
	}

	public void setSubtitleJob(SubtitleJob subtitleJob) {
		this.subtitleJob = subtitleJob;
	}

	public static class SubtitleJob {

		private String outputConfig;

		private String state;

		private String jobId;

		private String userData;

		private String inputConfig;

		public String getOutputConfig() {
			return this.outputConfig;
		}

		public void setOutputConfig(String outputConfig) {
			this.outputConfig = outputConfig;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getUserData() {
			return this.userData;
		}

		public void setUserData(String userData) {
			this.userData = userData;
		}

		public String getInputConfig() {
			return this.inputConfig;
		}

		public void setInputConfig(String inputConfig) {
			this.inputConfig = inputConfig;
		}
	}

	@Override
	public SubmitSubtitleJobResponse getInstance(UnmarshallerContext context) {
		return	SubmitSubtitleJobResponseUnmarshaller.unmarshall(this, context);
	}
}
