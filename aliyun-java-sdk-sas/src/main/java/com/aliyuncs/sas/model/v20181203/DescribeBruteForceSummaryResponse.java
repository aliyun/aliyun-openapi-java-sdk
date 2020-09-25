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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeBruteForceSummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBruteForceSummaryResponse extends AcsResponse {

	private String requestId;

	private BruteForceSummary bruteForceSummary;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public BruteForceSummary getBruteForceSummary() {
		return this.bruteForceSummary;
	}

	public void setBruteForceSummary(BruteForceSummary bruteForceSummary) {
		this.bruteForceSummary = bruteForceSummary;
	}

	public static class BruteForceSummary {

		private Integer allStrategyCount;

		private Integer effectiveCount;

		public Integer getAllStrategyCount() {
			return this.allStrategyCount;
		}

		public void setAllStrategyCount(Integer allStrategyCount) {
			this.allStrategyCount = allStrategyCount;
		}

		public Integer getEffectiveCount() {
			return this.effectiveCount;
		}

		public void setEffectiveCount(Integer effectiveCount) {
			this.effectiveCount = effectiveCount;
		}
	}

	@Override
	public DescribeBruteForceSummaryResponse getInstance(UnmarshallerContext context) {
		return	DescribeBruteForceSummaryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
