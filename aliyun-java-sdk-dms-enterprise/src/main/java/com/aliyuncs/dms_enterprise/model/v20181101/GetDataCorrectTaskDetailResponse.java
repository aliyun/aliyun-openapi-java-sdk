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
import com.aliyuncs.dms_enterprise.transform.v20181101.GetDataCorrectTaskDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDataCorrectTaskDetailResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private String errorCode;

	private DataCorrectTaskDetail dataCorrectTaskDetail;

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

	public DataCorrectTaskDetail getDataCorrectTaskDetail() {
		return this.dataCorrectTaskDetail;
	}

	public void setDataCorrectTaskDetail(DataCorrectTaskDetail dataCorrectTaskDetail) {
		this.dataCorrectTaskDetail = dataCorrectTaskDetail;
	}

	public static class DataCorrectTaskDetail {

		private Long dBTaskGroupId;

		private String jobStatus;

		private Long actualAffectRows;

		private String createTime;

		public Long getDBTaskGroupId() {
			return this.dBTaskGroupId;
		}

		public void setDBTaskGroupId(Long dBTaskGroupId) {
			this.dBTaskGroupId = dBTaskGroupId;
		}

		public String getJobStatus() {
			return this.jobStatus;
		}

		public void setJobStatus(String jobStatus) {
			this.jobStatus = jobStatus;
		}

		public Long getActualAffectRows() {
			return this.actualAffectRows;
		}

		public void setActualAffectRows(Long actualAffectRows) {
			this.actualAffectRows = actualAffectRows;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}
	}

	@Override
	public GetDataCorrectTaskDetailResponse getInstance(UnmarshallerContext context) {
		return	GetDataCorrectTaskDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
