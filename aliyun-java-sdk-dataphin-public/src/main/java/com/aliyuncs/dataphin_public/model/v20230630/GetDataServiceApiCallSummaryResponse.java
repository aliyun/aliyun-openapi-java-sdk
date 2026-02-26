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

package com.aliyuncs.dataphin_public.model.v20230630;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.GetDataServiceApiCallSummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDataServiceApiCallSummaryResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long callCount;

		private Long errorCount;

		private Double errorRate;

		private Double offlineRate;

		private Long errorApiCount;

		private Long errorAppCount;

		public Long getCallCount() {
			return this.callCount;
		}

		public void setCallCount(Long callCount) {
			this.callCount = callCount;
		}

		public Long getErrorCount() {
			return this.errorCount;
		}

		public void setErrorCount(Long errorCount) {
			this.errorCount = errorCount;
		}

		public Double getErrorRate() {
			return this.errorRate;
		}

		public void setErrorRate(Double errorRate) {
			this.errorRate = errorRate;
		}

		public Double getOfflineRate() {
			return this.offlineRate;
		}

		public void setOfflineRate(Double offlineRate) {
			this.offlineRate = offlineRate;
		}

		public Long getErrorApiCount() {
			return this.errorApiCount;
		}

		public void setErrorApiCount(Long errorApiCount) {
			this.errorApiCount = errorApiCount;
		}

		public Long getErrorAppCount() {
			return this.errorAppCount;
		}

		public void setErrorAppCount(Long errorAppCount) {
			this.errorAppCount = errorAppCount;
		}
	}

	@Override
	public GetDataServiceApiCallSummaryResponse getInstance(UnmarshallerContext context) {
		return	GetDataServiceApiCallSummaryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
