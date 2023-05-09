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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20180120.AddShareTaskDeviceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AddShareTaskDeviceResponse extends AcsResponse {

	private String code;

	private String errorMessage;

	private String requestId;

	private Boolean success;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String progressId;

		private Integer successSum;

		private Integer progress;

		private String failedResultCsvFile;

		private Integer failSum;

		public String getProgressId() {
			return this.progressId;
		}

		public void setProgressId(String progressId) {
			this.progressId = progressId;
		}

		public Integer getSuccessSum() {
			return this.successSum;
		}

		public void setSuccessSum(Integer successSum) {
			this.successSum = successSum;
		}

		public Integer getProgress() {
			return this.progress;
		}

		public void setProgress(Integer progress) {
			this.progress = progress;
		}

		public String getFailedResultCsvFile() {
			return this.failedResultCsvFile;
		}

		public void setFailedResultCsvFile(String failedResultCsvFile) {
			this.failedResultCsvFile = failedResultCsvFile;
		}

		public Integer getFailSum() {
			return this.failSum;
		}

		public void setFailSum(Integer failSum) {
			this.failSum = failSum;
		}
	}

	@Override
	public AddShareTaskDeviceResponse getInstance(UnmarshallerContext context) {
		return	AddShareTaskDeviceResponseUnmarshaller.unmarshall(this, context);
	}
}
