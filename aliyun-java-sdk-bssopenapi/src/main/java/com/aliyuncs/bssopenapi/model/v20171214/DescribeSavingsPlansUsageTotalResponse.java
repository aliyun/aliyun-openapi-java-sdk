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

package com.aliyuncs.bssopenapi.model.v20171214;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.bssopenapi.transform.v20171214.DescribeSavingsPlansUsageTotalResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSavingsPlansUsageTotalResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

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

		private List<Item> periodCoverage;

		private TotalUsage totalUsage;

		public List<Item> getPeriodCoverage() {
			return this.periodCoverage;
		}

		public void setPeriodCoverage(List<Item> periodCoverage) {
			this.periodCoverage = periodCoverage;
		}

		public TotalUsage getTotalUsage() {
			return this.totalUsage;
		}

		public void setTotalUsage(TotalUsage totalUsage) {
			this.totalUsage = totalUsage;
		}

		public static class Item {

			private String period;

			private Float percentage;

			public String getPeriod() {
				return this.period;
			}

			public void setPeriod(String period) {
				this.period = period;
			}

			public Float getPercentage() {
				return this.percentage;
			}

			public void setPercentage(Float percentage) {
				this.percentage = percentage;
			}
		}

		public static class TotalUsage {

			private Float usagePercentage;

			private Float postpaidCost;

			private Float poolValue;

			private Float savedCost;

			public Float getUsagePercentage() {
				return this.usagePercentage;
			}

			public void setUsagePercentage(Float usagePercentage) {
				this.usagePercentage = usagePercentage;
			}

			public Float getPostpaidCost() {
				return this.postpaidCost;
			}

			public void setPostpaidCost(Float postpaidCost) {
				this.postpaidCost = postpaidCost;
			}

			public Float getPoolValue() {
				return this.poolValue;
			}

			public void setPoolValue(Float poolValue) {
				this.poolValue = poolValue;
			}

			public Float getSavedCost() {
				return this.savedCost;
			}

			public void setSavedCost(Float savedCost) {
				this.savedCost = savedCost;
			}
		}
	}

	@Override
	public DescribeSavingsPlansUsageTotalResponse getInstance(UnmarshallerContext context) {
		return	DescribeSavingsPlansUsageTotalResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
