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

package com.aliyuncs.airec.model.v20201126;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.airec.transform.v20201126.ListFlowControlTaskReportsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFlowControlTaskReportsResponse extends AcsResponse {

	private String requestId;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private List<MetricsItem> metrics;

		private Total total;

		public List<MetricsItem> getMetrics() {
			return this.metrics;
		}

		public void setMetrics(List<MetricsItem> metrics) {
			this.metrics = metrics;
		}

		public Total getTotal() {
			return this.total;
		}

		public void setTotal(Total total) {
			this.total = total;
		}

		public static class MetricsItem {

			private String type;

			private List<DetailsItem> details;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public List<DetailsItem> getDetails() {
				return this.details;
			}

			public void setDetails(List<DetailsItem> details) {
				this.details = details;
			}

			public static class DetailsItem {

				private Long val;

				private Long endTime;

				private Long startTime;

				public Long getVal() {
					return this.val;
				}

				public void setVal(Long val) {
					this.val = val;
				}

				public Long getEndTime() {
					return this.endTime;
				}

				public void setEndTime(Long endTime) {
					this.endTime = endTime;
				}

				public Long getStartTime() {
					return this.startTime;
				}

				public void setStartTime(Long startTime) {
					this.startTime = startTime;
				}
			}
		}

		public static class Total {

			private Double accTaskCtr;

			private Long accTaskPv;

			private Double accTotalCtr;

			private Double invalidPercent;

			public Double getAccTaskCtr() {
				return this.accTaskCtr;
			}

			public void setAccTaskCtr(Double accTaskCtr) {
				this.accTaskCtr = accTaskCtr;
			}

			public Long getAccTaskPv() {
				return this.accTaskPv;
			}

			public void setAccTaskPv(Long accTaskPv) {
				this.accTaskPv = accTaskPv;
			}

			public Double getAccTotalCtr() {
				return this.accTotalCtr;
			}

			public void setAccTotalCtr(Double accTotalCtr) {
				this.accTotalCtr = accTotalCtr;
			}

			public Double getInvalidPercent() {
				return this.invalidPercent;
			}

			public void setInvalidPercent(Double invalidPercent) {
				this.invalidPercent = invalidPercent;
			}
		}
	}

	@Override
	public ListFlowControlTaskReportsResponse getInstance(UnmarshallerContext context) {
		return	ListFlowControlTaskReportsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
