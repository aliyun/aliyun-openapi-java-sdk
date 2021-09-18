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
import com.aliyuncs.vod.transform.v20170321.GetAICaptionExtractionJobsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAICaptionExtractionJobsResponse extends AcsResponse {

	private String requestId;

	private List<AICaptionExtractionJob> aICaptionExtractionJobList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<AICaptionExtractionJob> getAICaptionExtractionJobList() {
		return this.aICaptionExtractionJobList;
	}

	public void setAICaptionExtractionJobList(List<AICaptionExtractionJob> aICaptionExtractionJobList) {
		this.aICaptionExtractionJobList = aICaptionExtractionJobList;
	}

	public static class AICaptionExtractionJob {

		private String creationTime;

		private String jobId;

		private String videoId;

		private String aICaptionExtractionResult;

		private String userData;

		private String code;

		private String message;

		private String status;

		private String templateConfig;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getVideoId() {
			return this.videoId;
		}

		public void setVideoId(String videoId) {
			this.videoId = videoId;
		}

		public String getAICaptionExtractionResult() {
			return this.aICaptionExtractionResult;
		}

		public void setAICaptionExtractionResult(String aICaptionExtractionResult) {
			this.aICaptionExtractionResult = aICaptionExtractionResult;
		}

		public String getUserData() {
			return this.userData;
		}

		public void setUserData(String userData) {
			this.userData = userData;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTemplateConfig() {
			return this.templateConfig;
		}

		public void setTemplateConfig(String templateConfig) {
			this.templateConfig = templateConfig;
		}
	}

	@Override
	public GetAICaptionExtractionJobsResponse getInstance(UnmarshallerContext context) {
		return	GetAICaptionExtractionJobsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
