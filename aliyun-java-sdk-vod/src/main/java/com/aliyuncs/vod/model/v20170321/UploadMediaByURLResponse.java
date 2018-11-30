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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.UploadMediaByURLResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UploadMediaByURLResponse extends AcsResponse {

	private String requestId;

	private List<UploadJob> uploadJobs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<UploadJob> getUploadJobs() {
		return this.uploadJobs;
	}

	public void setUploadJobs(List<UploadJob> uploadJobs) {
		this.uploadJobs = uploadJobs;
	}

	public static class UploadJob {

		private String jobId;

		private String sourceURL;

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getSourceURL() {
			return this.sourceURL;
		}

		public void setSourceURL(String sourceURL) {
			this.sourceURL = sourceURL;
		}
	}

	@Override
	public UploadMediaByURLResponse getInstance(UnmarshallerContext context) {
		return	UploadMediaByURLResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
