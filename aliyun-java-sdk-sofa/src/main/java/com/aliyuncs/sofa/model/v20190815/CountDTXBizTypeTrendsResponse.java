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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.CountDTXBizTypeTrendsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CountDTXBizTypeTrendsResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
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

		private List<ActionTrendItem> actionTrend;

		private List<ActivityTrendItem> activityTrend;

		private List<ExceptionTrendItem> exceptionTrend;

		public List<ActionTrendItem> getActionTrend() {
			return this.actionTrend;
		}

		public void setActionTrend(List<ActionTrendItem> actionTrend) {
			this.actionTrend = actionTrend;
		}

		public List<ActivityTrendItem> getActivityTrend() {
			return this.activityTrend;
		}

		public void setActivityTrend(List<ActivityTrendItem> activityTrend) {
			this.activityTrend = activityTrend;
		}

		public List<ExceptionTrendItem> getExceptionTrend() {
			return this.exceptionTrend;
		}

		public void setExceptionTrend(List<ExceptionTrendItem> exceptionTrend) {
			this.exceptionTrend = exceptionTrend;
		}

		public static class ActionTrendItem {

			private Long rollback;

			private Long success;

			private Long time;

			private Long total;

			public Long getRollback() {
				return this.rollback;
			}

			public void setRollback(Long rollback) {
				this.rollback = rollback;
			}

			public Long getSuccess() {
				return this.success;
			}

			public void setSuccess(Long success) {
				this.success = success;
			}

			public Long getTime() {
				return this.time;
			}

			public void setTime(Long time) {
				this.time = time;
			}

			public Long getTotal() {
				return this.total;
			}

			public void setTotal(Long total) {
				this.total = total;
			}
		}

		public static class ActivityTrendItem {

			private Long rollback;

			private Long success;

			private Long time;

			private Long total;

			public Long getRollback() {
				return this.rollback;
			}

			public void setRollback(Long rollback) {
				this.rollback = rollback;
			}

			public Long getSuccess() {
				return this.success;
			}

			public void setSuccess(Long success) {
				this.success = success;
			}

			public Long getTime() {
				return this.time;
			}

			public void setTime(Long time) {
				this.time = time;
			}

			public Long getTotal() {
				return this.total;
			}

			public void setTotal(Long total) {
				this.total = total;
			}
		}

		public static class ExceptionTrendItem {

			private Long time;

			private Long total;

			public Long getTime() {
				return this.time;
			}

			public void setTime(Long time) {
				this.time = time;
			}

			public Long getTotal() {
				return this.total;
			}

			public void setTotal(Long total) {
				this.total = total;
			}
		}
	}

	@Override
	public CountDTXBizTypeTrendsResponse getInstance(UnmarshallerContext context) {
		return	CountDTXBizTypeTrendsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
