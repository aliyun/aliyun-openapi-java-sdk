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

package com.aliyuncs.dts.model.v20200101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dts.transform.v20200101.SummaryJobDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SummaryJobDetailResponse extends AcsResponse {

	private String code;

	private Integer httpStatusCode;

	private String jobId;

	private String requestId;

	private Boolean success;

	private List<ProgressSummaryDetail> progressSummaryDetails;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
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

	public List<ProgressSummaryDetail> getProgressSummaryDetails() {
		return this.progressSummaryDetails;
	}

	public void setProgressSummaryDetails(List<ProgressSummaryDetail> progressSummaryDetails) {
		this.progressSummaryDetails = progressSummaryDetails;
	}

	public static class ProgressSummaryDetail {

		private String key;

		private Long totalCount;

		private Integer state;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getState() {
			return this.state;
		}

		public void setState(Integer state) {
			this.state = state;
		}
	}

	@Override
	public SummaryJobDetailResponse getInstance(UnmarshallerContext context) {
		return	SummaryJobDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
