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
import com.aliyuncs.vod.transform.v20170321.SubmitTranscodeJobsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SubmitTranscodeJobsResponse extends AcsResponse {

	private String requestId;

	private String transcodeTaskId;

	private List<TranscodeJob> transcodeJobs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTranscodeTaskId() {
		return this.transcodeTaskId;
	}

	public void setTranscodeTaskId(String transcodeTaskId) {
		this.transcodeTaskId = transcodeTaskId;
	}

	public List<TranscodeJob> getTranscodeJobs() {
		return this.transcodeJobs;
	}

	public void setTranscodeJobs(List<TranscodeJob> transcodeJobs) {
		this.transcodeJobs = transcodeJobs;
	}

	public static class TranscodeJob {

		private String jobId;

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}
	}

	@Override
	public SubmitTranscodeJobsResponse getInstance(UnmarshallerContext context) {
		return	SubmitTranscodeJobsResponseUnmarshaller.unmarshall(this, context);
	}
}
