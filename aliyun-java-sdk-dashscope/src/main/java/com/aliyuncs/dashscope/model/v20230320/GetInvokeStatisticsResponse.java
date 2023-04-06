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

package com.aliyuncs.dashscope.model.v20230320;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dashscope.transform.v20230320.GetInvokeStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetInvokeStatisticsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String httpCode;

	private String errorCode;

	private String errorMessage;

	private String accessDeniedDetail;

	private List<DataItem> data;

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

	public String getHttpCode() {
		return this.httpCode;
	}

	public void setHttpCode(String httpCode) {
		this.httpCode = httpCode;
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

	public String getAccessDeniedDetail() {
		return this.accessDeniedDetail;
	}

	public void setAccessDeniedDetail(String accessDeniedDetail) {
		this.accessDeniedDetail = accessDeniedDetail;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String region;

		private String apiKey;

		private String modelName;

		private String timeUnit;

		private String statisticsUnit;

		private List<MetricsItem> metrics;

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getApiKey() {
			return this.apiKey;
		}

		public void setApiKey(String apiKey) {
			this.apiKey = apiKey;
		}

		public String getModelName() {
			return this.modelName;
		}

		public void setModelName(String modelName) {
			this.modelName = modelName;
		}

		public String getTimeUnit() {
			return this.timeUnit;
		}

		public void setTimeUnit(String timeUnit) {
			this.timeUnit = timeUnit;
		}

		public String getStatisticsUnit() {
			return this.statisticsUnit;
		}

		public void setStatisticsUnit(String statisticsUnit) {
			this.statisticsUnit = statisticsUnit;
		}

		public List<MetricsItem> getMetrics() {
			return this.metrics;
		}

		public void setMetrics(List<MetricsItem> metrics) {
			this.metrics = metrics;
		}

		public static class MetricsItem {

			private String day;

			private String hour;

			private Long count;

			public String getDay() {
				return this.day;
			}

			public void setDay(String day) {
				this.day = day;
			}

			public String getHour() {
				return this.hour;
			}

			public void setHour(String hour) {
				this.hour = hour;
			}

			public Long getCount() {
				return this.count;
			}

			public void setCount(Long count) {
				this.count = count;
			}
		}
	}

	@Override
	public GetInvokeStatisticsResponse getInstance(UnmarshallerContext context) {
		return	GetInvokeStatisticsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
