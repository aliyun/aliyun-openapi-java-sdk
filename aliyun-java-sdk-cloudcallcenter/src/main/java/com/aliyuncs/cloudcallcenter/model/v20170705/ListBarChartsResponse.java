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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudcallcenter.transform.v20170705.ListBarChartsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListBarChartsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private List<TrendChart> trendCharts;

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

	public List<TrendChart> getTrendCharts() {
		return this.trendCharts;
	}

	public void setTrendCharts(List<TrendChart> trendCharts) {
		this.trendCharts = trendCharts;
	}

	public static class TrendChart {

		private String indicator;

		private List<BarData> barDataList;

		public String getIndicator() {
			return this.indicator;
		}

		public void setIndicator(String indicator) {
			this.indicator = indicator;
		}

		public List<BarData> getBarDataList() {
			return this.barDataList;
		}

		public void setBarDataList(List<BarData> barDataList) {
			this.barDataList = barDataList;
		}

		public static class BarData {

			private Long timestamp;

			private Long width;

			private Long height;

			public Long getTimestamp() {
				return this.timestamp;
			}

			public void setTimestamp(Long timestamp) {
				this.timestamp = timestamp;
			}

			public Long getWidth() {
				return this.width;
			}

			public void setWidth(Long width) {
				this.width = width;
			}

			public Long getHeight() {
				return this.height;
			}

			public void setHeight(Long height) {
				this.height = height;
			}
		}
	}

	@Override
	public ListBarChartsResponse getInstance(UnmarshallerContext context) {
		return	ListBarChartsResponseUnmarshaller.unmarshall(this, context);
	}
}
