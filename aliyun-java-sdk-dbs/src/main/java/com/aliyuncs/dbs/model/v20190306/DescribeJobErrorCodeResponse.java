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

package com.aliyuncs.dbs.model.v20190306;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dbs.transform.v20190306.DescribeJobErrorCodeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeJobErrorCodeResponse extends AcsResponse {

	private Boolean success;

	private String errCode;

	private String errMessage;

	private Integer httpStatusCode;

	private String requestId;

	private Item item;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrCode() {
		return this.errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getErrMessage() {
		return this.errMessage;
	}

	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public static class Item {

		private String jobId;

		private String language;

		private String errorCode;

		private String errorMessage;

		private String jobType;

		private String jobState;

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getLanguage() {
			return this.language;
		}

		public void setLanguage(String language) {
			this.language = language;
		}

		public String getErrorCode() {
			return this.errorCode;
		}

		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public String getJobType() {
			return this.jobType;
		}

		public void setJobType(String jobType) {
			this.jobType = jobType;
		}

		public String getJobState() {
			return this.jobState;
		}

		public void setJobState(String jobState) {
			this.jobState = jobState;
		}
	}

	@Override
	public DescribeJobErrorCodeResponse getInstance(UnmarshallerContext context) {
		return	DescribeJobErrorCodeResponseUnmarshaller.unmarshall(this, context);
	}
}
