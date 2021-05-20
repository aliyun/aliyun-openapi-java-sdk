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
import com.aliyuncs.bssopenapi.transform.v20171214.DescribeResourceUsageTotalResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeResourceUsageTotalResponse extends AcsResponse {

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

			private Float usagePercentage;

			public String getPeriod() {
				return this.period;
			}

			public void setPeriod(String period) {
				this.period = period;
			}

			public Float getUsagePercentage() {
				return this.usagePercentage;
			}

			public void setUsagePercentage(Float usagePercentage) {
				this.usagePercentage = usagePercentage;
			}
		}

		public static class TotalUsage {

			private Float usagePercentage;

			private Float postpaidCost;

			private Float reservationCost;

			private Float savedCost;

			private Float potentialSavedCost;

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

			public Float getReservationCost() {
				return this.reservationCost;
			}

			public void setReservationCost(Float reservationCost) {
				this.reservationCost = reservationCost;
			}

			public Float getSavedCost() {
				return this.savedCost;
			}

			public void setSavedCost(Float savedCost) {
				this.savedCost = savedCost;
			}

			public Float getPotentialSavedCost() {
				return this.potentialSavedCost;
			}

			public void setPotentialSavedCost(Float potentialSavedCost) {
				this.potentialSavedCost = potentialSavedCost;
			}
		}
	}

	@Override
	public DescribeResourceUsageTotalResponse getInstance(UnmarshallerContext context) {
		return	DescribeResourceUsageTotalResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
