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
import com.aliyuncs.sas.transform.v20181203.DescribeSecurityCheckScheduleConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSecurityCheckScheduleConfigResponse extends AcsResponse {

	private String requestId;

	private RiskCheckJobConfig riskCheckJobConfig;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public RiskCheckJobConfig getRiskCheckJobConfig() {
		return this.riskCheckJobConfig;
	}

	public void setRiskCheckJobConfig(RiskCheckJobConfig riskCheckJobConfig) {
		this.riskCheckJobConfig = riskCheckJobConfig;
	}

	public static class RiskCheckJobConfig {

		private Integer startTime;

		private Integer endTime;

		private String daysOfWeek;

		public Integer getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Integer startTime) {
			this.startTime = startTime;
		}

		public Integer getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Integer endTime) {
			this.endTime = endTime;
		}

		public String getDaysOfWeek() {
			return this.daysOfWeek;
		}

		public void setDaysOfWeek(String daysOfWeek) {
			this.daysOfWeek = daysOfWeek;
		}
	}

	@Override
	public DescribeSecurityCheckScheduleConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeSecurityCheckScheduleConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
