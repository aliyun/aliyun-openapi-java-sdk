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

package com.aliyuncs.quotas.model.v20200510;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.quotas.transform.v20200510.GetQuotaUtilizationOverviewResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetQuotaUtilizationOverviewResponse extends AcsResponse {

	private String status;

	private String message;

	private String requestId;

	private String generatedAt;

	private String errorMsg;

	private String errorCode;

	private Boolean success;

	private QuotaOverview quotaOverview;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getGeneratedAt() {
		return this.generatedAt;
	}

	public void setGeneratedAt(String generatedAt) {
		this.generatedAt = generatedAt;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public QuotaOverview getQuotaOverview() {
		return this.quotaOverview;
	}

	public void setQuotaOverview(QuotaOverview quotaOverview) {
		this.quotaOverview = quotaOverview;
	}

	public static class QuotaOverview {

		private Over80Percent over80Percent;

		private Over95Percent over95Percent;

		private InUse inUse;

		public Over80Percent getOver80Percent() {
			return this.over80Percent;
		}

		public void setOver80Percent(Over80Percent over80Percent) {
			this.over80Percent = over80Percent;
		}

		public Over95Percent getOver95Percent() {
			return this.over95Percent;
		}

		public void setOver95Percent(Over95Percent over95Percent) {
			this.over95Percent = over95Percent;
		}

		public InUse getInUse() {
			return this.inUse;
		}

		public void setInUse(InUse inUse) {
			this.inUse = inUse;
		}

		public static class Over80Percent {

			private Long total;

			private Double adjustableRatio;

			private Long adjustable;

			public Long getTotal() {
				return this.total;
			}

			public void setTotal(Long total) {
				this.total = total;
			}

			public Double getAdjustableRatio() {
				return this.adjustableRatio;
			}

			public void setAdjustableRatio(Double adjustableRatio) {
				this.adjustableRatio = adjustableRatio;
			}

			public Long getAdjustable() {
				return this.adjustable;
			}

			public void setAdjustable(Long adjustable) {
				this.adjustable = adjustable;
			}
		}

		public static class Over95Percent {

			private Long total;

			private Double adjustableRatio;

			private Long adjustable;

			public Long getTotal() {
				return this.total;
			}

			public void setTotal(Long total) {
				this.total = total;
			}

			public Double getAdjustableRatio() {
				return this.adjustableRatio;
			}

			public void setAdjustableRatio(Double adjustableRatio) {
				this.adjustableRatio = adjustableRatio;
			}

			public Long getAdjustable() {
				return this.adjustable;
			}

			public void setAdjustable(Long adjustable) {
				this.adjustable = adjustable;
			}
		}

		public static class InUse {

			private Long total;

			private Double adjustableRatio;

			private Long adjustable;

			public Long getTotal() {
				return this.total;
			}

			public void setTotal(Long total) {
				this.total = total;
			}

			public Double getAdjustableRatio() {
				return this.adjustableRatio;
			}

			public void setAdjustableRatio(Double adjustableRatio) {
				this.adjustableRatio = adjustableRatio;
			}

			public Long getAdjustable() {
				return this.adjustable;
			}

			public void setAdjustable(Long adjustable) {
				this.adjustable = adjustable;
			}
		}
	}

	@Override
	public GetQuotaUtilizationOverviewResponse getInstance(UnmarshallerContext context) {
		return	GetQuotaUtilizationOverviewResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
