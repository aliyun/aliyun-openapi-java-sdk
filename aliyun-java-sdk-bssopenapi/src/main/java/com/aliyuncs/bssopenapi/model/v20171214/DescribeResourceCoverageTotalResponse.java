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
import com.aliyuncs.bssopenapi.transform.v20171214.DescribeResourceCoverageTotalResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeResourceCoverageTotalResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<Item> periodCoverage;

		private TotalCoverage totalCoverage;

		public List<Item> getPeriodCoverage() {
			return this.periodCoverage;
		}

		public void setPeriodCoverage(List<Item> periodCoverage) {
			this.periodCoverage = periodCoverage;
		}

		public TotalCoverage getTotalCoverage() {
			return this.totalCoverage;
		}

		public void setTotalCoverage(TotalCoverage totalCoverage) {
			this.totalCoverage = totalCoverage;
		}

		public static class Item {

			private Float coveragePercentage;

			private String period;

			public Float getCoveragePercentage() {
				return this.coveragePercentage;
			}

			public void setCoveragePercentage(Float coveragePercentage) {
				this.coveragePercentage = coveragePercentage;
			}

			public String getPeriod() {
				return this.period;
			}

			public void setPeriod(String period) {
				this.period = period;
			}
		}

		public static class TotalCoverage {

			private String capacityUnit;

			private Float deductQuantity;

			private Float coveragePercentage;

			private Float totalQuantity;

			public String getCapacityUnit() {
				return this.capacityUnit;
			}

			public void setCapacityUnit(String capacityUnit) {
				this.capacityUnit = capacityUnit;
			}

			public Float getDeductQuantity() {
				return this.deductQuantity;
			}

			public void setDeductQuantity(Float deductQuantity) {
				this.deductQuantity = deductQuantity;
			}

			public Float getCoveragePercentage() {
				return this.coveragePercentage;
			}

			public void setCoveragePercentage(Float coveragePercentage) {
				this.coveragePercentage = coveragePercentage;
			}

			public Float getTotalQuantity() {
				return this.totalQuantity;
			}

			public void setTotalQuantity(Float totalQuantity) {
				this.totalQuantity = totalQuantity;
			}
		}
	}

	@Override
	public DescribeResourceCoverageTotalResponse getInstance(UnmarshallerContext context) {
		return	DescribeResourceCoverageTotalResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
