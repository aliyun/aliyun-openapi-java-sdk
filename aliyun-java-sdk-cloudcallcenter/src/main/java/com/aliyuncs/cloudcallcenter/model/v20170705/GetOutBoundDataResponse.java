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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudcallcenter.transform.v20170705.GetOutBoundDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOutBoundDataResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String successNumber;

		private String successRate;

		private String lossNumber;

		private String lossRate;

		private String occupancyRate;

		private String averageReadyTime;

		public String getSuccessNumber() {
			return this.successNumber;
		}

		public void setSuccessNumber(String successNumber) {
			this.successNumber = successNumber;
		}

		public String getSuccessRate() {
			return this.successRate;
		}

		public void setSuccessRate(String successRate) {
			this.successRate = successRate;
		}

		public String getLossNumber() {
			return this.lossNumber;
		}

		public void setLossNumber(String lossNumber) {
			this.lossNumber = lossNumber;
		}

		public String getLossRate() {
			return this.lossRate;
		}

		public void setLossRate(String lossRate) {
			this.lossRate = lossRate;
		}

		public String getOccupancyRate() {
			return this.occupancyRate;
		}

		public void setOccupancyRate(String occupancyRate) {
			this.occupancyRate = occupancyRate;
		}

		public String getAverageReadyTime() {
			return this.averageReadyTime;
		}

		public void setAverageReadyTime(String averageReadyTime) {
			this.averageReadyTime = averageReadyTime;
		}
	}

	@Override
	public GetOutBoundDataResponse getInstance(UnmarshallerContext context) {
		return	GetOutBoundDataResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
