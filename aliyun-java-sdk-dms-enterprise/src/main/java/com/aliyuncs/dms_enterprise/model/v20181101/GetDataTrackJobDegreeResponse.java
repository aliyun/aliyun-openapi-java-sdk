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

package com.aliyuncs.dms_enterprise.model.v20181101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.GetDataTrackJobDegreeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDataTrackJobDegreeResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private String errorCode;

	private JobDegree jobDegree;

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

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public JobDegree getJobDegree() {
		return this.jobDegree;
	}

	public void setJobDegree(JobDegree jobDegree) {
		this.jobDegree = jobDegree;
	}

	public static class JobDegree {

		private Double listCompletionDegree;

		private Double downloadCompletionDegree;

		private Double filterCompletionDegree;

		private String jobStatus;

		private String statusDesc;

		public Double getListCompletionDegree() {
			return this.listCompletionDegree;
		}

		public void setListCompletionDegree(Double listCompletionDegree) {
			this.listCompletionDegree = listCompletionDegree;
		}

		public Double getDownloadCompletionDegree() {
			return this.downloadCompletionDegree;
		}

		public void setDownloadCompletionDegree(Double downloadCompletionDegree) {
			this.downloadCompletionDegree = downloadCompletionDegree;
		}

		public Double getFilterCompletionDegree() {
			return this.filterCompletionDegree;
		}

		public void setFilterCompletionDegree(Double filterCompletionDegree) {
			this.filterCompletionDegree = filterCompletionDegree;
		}

		public String getJobStatus() {
			return this.jobStatus;
		}

		public void setJobStatus(String jobStatus) {
			this.jobStatus = jobStatus;
		}

		public String getStatusDesc() {
			return this.statusDesc;
		}

		public void setStatusDesc(String statusDesc) {
			this.statusDesc = statusDesc;
		}
	}

	@Override
	public GetDataTrackJobDegreeResponse getInstance(UnmarshallerContext context) {
		return	GetDataTrackJobDegreeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
