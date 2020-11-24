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

package com.aliyuncs.ddoscoo.model.v20200101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ddoscoo.transform.v20200101.DescribeDefenseCountStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDefenseCountStatisticsResponse extends AcsResponse {

	private String requestId;

	private DefenseCountStatistics defenseCountStatistics;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public DefenseCountStatistics getDefenseCountStatistics() {
		return this.defenseCountStatistics;
	}

	public void setDefenseCountStatistics(DefenseCountStatistics defenseCountStatistics) {
		this.defenseCountStatistics = defenseCountStatistics;
	}

	public static class DefenseCountStatistics {

		private Integer defenseCountTotalUsageOfCurrentMonth;

		private Integer flowPackCountRemain;

		private Integer maxUsableDefenseCountCurrentMonth;

		public Integer getDefenseCountTotalUsageOfCurrentMonth() {
			return this.defenseCountTotalUsageOfCurrentMonth;
		}

		public void setDefenseCountTotalUsageOfCurrentMonth(Integer defenseCountTotalUsageOfCurrentMonth) {
			this.defenseCountTotalUsageOfCurrentMonth = defenseCountTotalUsageOfCurrentMonth;
		}

		public Integer getFlowPackCountRemain() {
			return this.flowPackCountRemain;
		}

		public void setFlowPackCountRemain(Integer flowPackCountRemain) {
			this.flowPackCountRemain = flowPackCountRemain;
		}

		public Integer getMaxUsableDefenseCountCurrentMonth() {
			return this.maxUsableDefenseCountCurrentMonth;
		}

		public void setMaxUsableDefenseCountCurrentMonth(Integer maxUsableDefenseCountCurrentMonth) {
			this.maxUsableDefenseCountCurrentMonth = maxUsableDefenseCountCurrentMonth;
		}
	}

	@Override
	public DescribeDefenseCountStatisticsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDefenseCountStatisticsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
