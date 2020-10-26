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
import com.aliyuncs.iot.transform.v20180120.GetSpeechModelPushJobStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSpeechModelPushJobStatisticsResponse extends AcsResponse {

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

		private Integer totalNum;

		private Integer successNum;

		private Integer timeoutNum;

		private Integer cancelNum;

		private Integer runningNum;

		public Integer getTotalNum() {
			return this.totalNum;
		}

		public void setTotalNum(Integer totalNum) {
			this.totalNum = totalNum;
		}

		public Integer getSuccessNum() {
			return this.successNum;
		}

		public void setSuccessNum(Integer successNum) {
			this.successNum = successNum;
		}

		public Integer getTimeoutNum() {
			return this.timeoutNum;
		}

		public void setTimeoutNum(Integer timeoutNum) {
			this.timeoutNum = timeoutNum;
		}

		public Integer getCancelNum() {
			return this.cancelNum;
		}

		public void setCancelNum(Integer cancelNum) {
			this.cancelNum = cancelNum;
		}

		public Integer getRunningNum() {
			return this.runningNum;
		}

		public void setRunningNum(Integer runningNum) {
			this.runningNum = runningNum;
		}
	}

	@Override
	public GetSpeechModelPushJobStatisticsResponse getInstance(UnmarshallerContext context) {
		return	GetSpeechModelPushJobStatisticsResponseUnmarshaller.unmarshall(this, context);
	}
}
