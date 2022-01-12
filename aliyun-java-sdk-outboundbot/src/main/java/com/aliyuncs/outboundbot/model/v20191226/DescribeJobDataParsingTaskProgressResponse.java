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

package com.aliyuncs.outboundbot.model.v20191226;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.outboundbot.transform.v20191226.DescribeJobDataParsingTaskProgressResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeJobDataParsingTaskProgressResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private Progress progress;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

	public Progress getProgress() {
		return this.progress;
	}

	public void setProgress(Progress progress) {
		this.progress = progress;
	}

	public static class Progress {

		private String failErrorCode;

		private String status;

		private Integer handledJobCount;

		private Integer totalJobCount;

		private String failReason;

		private String feedbackUrl;

		public String getFailErrorCode() {
			return this.failErrorCode;
		}

		public void setFailErrorCode(String failErrorCode) {
			this.failErrorCode = failErrorCode;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Integer getHandledJobCount() {
			return this.handledJobCount;
		}

		public void setHandledJobCount(Integer handledJobCount) {
			this.handledJobCount = handledJobCount;
		}

		public Integer getTotalJobCount() {
			return this.totalJobCount;
		}

		public void setTotalJobCount(Integer totalJobCount) {
			this.totalJobCount = totalJobCount;
		}

		public String getFailReason() {
			return this.failReason;
		}

		public void setFailReason(String failReason) {
			this.failReason = failReason;
		}

		public String getFeedbackUrl() {
			return this.feedbackUrl;
		}

		public void setFeedbackUrl(String feedbackUrl) {
			this.feedbackUrl = feedbackUrl;
		}
	}

	@Override
	public DescribeJobDataParsingTaskProgressResponse getInstance(UnmarshallerContext context) {
		return	DescribeJobDataParsingTaskProgressResponseUnmarshaller.unmarshall(this, context);
	}
}
