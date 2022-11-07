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

package com.aliyuncs.oceanbasepro.model.v20190901;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.oceanbasepro.transform.v20190901.SearchOmsOpenAPIMonitorMetricResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SearchOmsOpenAPIMonitorMetricResponse extends AcsResponse {

	private Boolean success;

	private String code;

	private String message;

	private String advice;

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Long totalCount;

	private String cost;

	private List<DataItem> data;

	private ErrorDetail errorDetail;

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

	public String getAdvice() {
		return this.advice;
	}

	public void setAdvice(String advice) {
		this.advice = advice;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getCost() {
		return this.cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public ErrorDetail getErrorDetail() {
		return this.errorDetail;
	}

	public void setErrorDetail(ErrorDetail errorDetail) {
		this.errorDetail = errorDetail;
	}

	public static class DataItem {

		private String metric;

		private Map<Object,Object> tags;

		private List<DataPoint> dataPoints;

		public String getMetric() {
			return this.metric;
		}

		public void setMetric(String metric) {
			this.metric = metric;
		}

		public Map<Object,Object> getTags() {
			return this.tags;
		}

		public void setTags(Map<Object,Object> tags) {
			this.tags = tags;
		}

		public List<DataPoint> getDataPoints() {
			return this.dataPoints;
		}

		public void setDataPoints(List<DataPoint> dataPoints) {
			this.dataPoints = dataPoints;
		}

		public static class DataPoint {

			private Long timestamp;

			private Double value;

			public Long getTimestamp() {
				return this.timestamp;
			}

			public void setTimestamp(Long timestamp) {
				this.timestamp = timestamp;
			}

			public Double getValue() {
				return this.value;
			}

			public void setValue(Double value) {
				this.value = value;
			}
		}
	}

	public static class ErrorDetail {

		private String code;

		private String level;

		private String message;

		private String proposal;

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getProposal() {
			return this.proposal;
		}

		public void setProposal(String proposal) {
			this.proposal = proposal;
		}
	}

	@Override
	public SearchOmsOpenAPIMonitorMetricResponse getInstance(UnmarshallerContext context) {
		return	SearchOmsOpenAPIMonitorMetricResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
