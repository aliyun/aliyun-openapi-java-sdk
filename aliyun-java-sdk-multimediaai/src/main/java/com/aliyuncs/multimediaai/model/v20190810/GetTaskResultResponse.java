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

package com.aliyuncs.multimediaai.model.v20190810;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.multimediaai.transform.v20190810.GetTaskResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTaskResultResponse extends AcsResponse {

	private String requestId;

	private Integer status;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String applicationId;

		private String videoName;

		private String processResultUrl;

		private Long analysisUseTime;

		public String getApplicationId() {
			return this.applicationId;
		}

		public void setApplicationId(String applicationId) {
			this.applicationId = applicationId;
		}

		public String getVideoName() {
			return this.videoName;
		}

		public void setVideoName(String videoName) {
			this.videoName = videoName;
		}

		public String getProcessResultUrl() {
			return this.processResultUrl;
		}

		public void setProcessResultUrl(String processResultUrl) {
			this.processResultUrl = processResultUrl;
		}

		public Long getAnalysisUseTime() {
			return this.analysisUseTime;
		}

		public void setAnalysisUseTime(Long analysisUseTime) {
			this.analysisUseTime = analysisUseTime;
		}
	}

	@Override
	public GetTaskResultResponse getInstance(UnmarshallerContext context) {
		return	GetTaskResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
