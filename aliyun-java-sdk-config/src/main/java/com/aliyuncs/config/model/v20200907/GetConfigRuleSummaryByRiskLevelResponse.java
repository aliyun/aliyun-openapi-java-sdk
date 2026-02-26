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

package com.aliyuncs.config.model.v20200907;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.config.transform.v20200907.GetConfigRuleSummaryByRiskLevelResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetConfigRuleSummaryByRiskLevelResponse extends AcsResponse {

	private String requestId;

	private List<Data> configRuleSummaries;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Data> getConfigRuleSummaries() {
		return this.configRuleSummaries;
	}

	public void setConfigRuleSummaries(List<Data> configRuleSummaries) {
		this.configRuleSummaries = configRuleSummaries;
	}

	public static class Data {

		private Integer compliantCount;

		private Integer nonCompliantCount;

		private Integer riskLevel;

		public Integer getCompliantCount() {
			return this.compliantCount;
		}

		public void setCompliantCount(Integer compliantCount) {
			this.compliantCount = compliantCount;
		}

		public Integer getNonCompliantCount() {
			return this.nonCompliantCount;
		}

		public void setNonCompliantCount(Integer nonCompliantCount) {
			this.nonCompliantCount = nonCompliantCount;
		}

		public Integer getRiskLevel() {
			return this.riskLevel;
		}

		public void setRiskLevel(Integer riskLevel) {
			this.riskLevel = riskLevel;
		}
	}

	@Override
	public GetConfigRuleSummaryByRiskLevelResponse getInstance(UnmarshallerContext context) {
		return	GetConfigRuleSummaryByRiskLevelResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
