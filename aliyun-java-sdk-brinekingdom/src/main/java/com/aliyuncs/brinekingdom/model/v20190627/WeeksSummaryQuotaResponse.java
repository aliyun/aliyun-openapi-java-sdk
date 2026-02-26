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

package com.aliyuncs.brinekingdom.model.v20190627;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.brinekingdom.transform.v20190627.WeeksSummaryQuotaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class WeeksSummaryQuotaResponse extends AcsResponse {

	private String message;

	private Boolean success;

	private Result result;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Long expectDate;

		private Long forecastTotal;

		private String model;

		private String nic;

		private String orgName;

		private Long plannedAvailable;

		private Long replenishable;

		private Long supplyCnt;

		public Long getExpectDate() {
			return this.expectDate;
		}

		public void setExpectDate(Long expectDate) {
			this.expectDate = expectDate;
		}

		public Long getForecastTotal() {
			return this.forecastTotal;
		}

		public void setForecastTotal(Long forecastTotal) {
			this.forecastTotal = forecastTotal;
		}

		public String getModel() {
			return this.model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public String getNic() {
			return this.nic;
		}

		public void setNic(String nic) {
			this.nic = nic;
		}

		public String getOrgName() {
			return this.orgName;
		}

		public void setOrgName(String orgName) {
			this.orgName = orgName;
		}

		public Long getPlannedAvailable() {
			return this.plannedAvailable;
		}

		public void setPlannedAvailable(Long plannedAvailable) {
			this.plannedAvailable = plannedAvailable;
		}

		public Long getReplenishable() {
			return this.replenishable;
		}

		public void setReplenishable(Long replenishable) {
			this.replenishable = replenishable;
		}

		public Long getSupplyCnt() {
			return this.supplyCnt;
		}

		public void setSupplyCnt(Long supplyCnt) {
			this.supplyCnt = supplyCnt;
		}
	}

	@Override
	public WeeksSummaryQuotaResponse getInstance(UnmarshallerContext context) {
		return	WeeksSummaryQuotaResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
