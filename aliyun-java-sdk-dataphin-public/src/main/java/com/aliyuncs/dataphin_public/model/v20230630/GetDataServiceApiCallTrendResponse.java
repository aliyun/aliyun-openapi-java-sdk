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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.GetDataServiceApiCallTrendResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDataServiceApiCallTrendResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Integer httpStatusCode;

	private String code;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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

		private List<CallErrorImpactTrend> callErrorImpactTrendList;

		private List<CallErrorTrend> callErrorTrendList;

		public List<CallErrorImpactTrend> getCallErrorImpactTrendList() {
			return this.callErrorImpactTrendList;
		}

		public void setCallErrorImpactTrendList(List<CallErrorImpactTrend> callErrorImpactTrendList) {
			this.callErrorImpactTrendList = callErrorImpactTrendList;
		}

		public List<CallErrorTrend> getCallErrorTrendList() {
			return this.callErrorTrendList;
		}

		public void setCallErrorTrendList(List<CallErrorTrend> callErrorTrendList) {
			this.callErrorTrendList = callErrorTrendList;
		}

		public static class CallErrorImpactTrend {

			private Integer errorApiCount;

			private String minute;

			private Integer errorAppCount;

			private List<Long> apiIdList;

			public Integer getErrorApiCount() {
				return this.errorApiCount;
			}

			public void setErrorApiCount(Integer errorApiCount) {
				this.errorApiCount = errorApiCount;
			}

			public String getMinute() {
				return this.minute;
			}

			public void setMinute(String minute) {
				this.minute = minute;
			}

			public Integer getErrorAppCount() {
				return this.errorAppCount;
			}

			public void setErrorAppCount(Integer errorAppCount) {
				this.errorAppCount = errorAppCount;
			}

			public List<Long> getApiIdList() {
				return this.apiIdList;
			}

			public void setApiIdList(List<Long> apiIdList) {
				this.apiIdList = apiIdList;
			}
		}

		public static class CallErrorTrend {

			private String minute;

			private Long callCount;

			private Long errorCount;

			public String getMinute() {
				return this.minute;
			}

			public void setMinute(String minute) {
				this.minute = minute;
			}

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
		}
	}

	@Override
	public GetDataServiceApiCallTrendResponse getInstance(UnmarshallerContext context) {
		return	GetDataServiceApiCallTrendResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
