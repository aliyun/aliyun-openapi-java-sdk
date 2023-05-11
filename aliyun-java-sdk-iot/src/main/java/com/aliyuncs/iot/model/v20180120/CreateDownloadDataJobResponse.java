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
import com.aliyuncs.iot.transform.v20180120.CreateDownloadDataJobResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateDownloadDataJobResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String errorMessage;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String csvUrl;

		private String longJobId;

		private Integer status;

		private Boolean asyncExecute;

		private String csvFileName;

		public String getCsvUrl() {
			return this.csvUrl;
		}

		public void setCsvUrl(String csvUrl) {
			this.csvUrl = csvUrl;
		}

		public String getLongJobId() {
			return this.longJobId;
		}

		public void setLongJobId(String longJobId) {
			this.longJobId = longJobId;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Boolean getAsyncExecute() {
			return this.asyncExecute;
		}

		public void setAsyncExecute(Boolean asyncExecute) {
			this.asyncExecute = asyncExecute;
		}

		public String getCsvFileName() {
			return this.csvFileName;
		}

		public void setCsvFileName(String csvFileName) {
			this.csvFileName = csvFileName;
		}
	}

	@Override
	public CreateDownloadDataJobResponse getInstance(UnmarshallerContext context) {
		return	CreateDownloadDataJobResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
