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

package com.aliyuncs.adb.model.v20190315;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.adb.transform.v20190315.DescribeElasticPlanResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeElasticPlanResponse extends AcsResponse {

	private String requestId;

	private List<ElasticPlanInfo> elasticPlanList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ElasticPlanInfo> getElasticPlanList() {
		return this.elasticPlanList;
	}

	public void setElasticPlanList(List<ElasticPlanInfo> elasticPlanList) {
		this.elasticPlanList = elasticPlanList;
	}

	public static class ElasticPlanInfo {

		private String endTime;

		private String weeklyRepeat;

		private String monthlyRepeat;

		private String startTime;

		private String resourcePoolName;

		private String startDay;

		private Integer elasticNodeNum;

		private Boolean enable;

		private String endDay;

		private String planName;

		private String elasticPlanType;

		private String elasticPlanWorkerSpec;

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getWeeklyRepeat() {
			return this.weeklyRepeat;
		}

		public void setWeeklyRepeat(String weeklyRepeat) {
			this.weeklyRepeat = weeklyRepeat;
		}

		public String getMonthlyRepeat() {
			return this.monthlyRepeat;
		}

		public void setMonthlyRepeat(String monthlyRepeat) {
			this.monthlyRepeat = monthlyRepeat;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getResourcePoolName() {
			return this.resourcePoolName;
		}

		public void setResourcePoolName(String resourcePoolName) {
			this.resourcePoolName = resourcePoolName;
		}

		public String getStartDay() {
			return this.startDay;
		}

		public void setStartDay(String startDay) {
			this.startDay = startDay;
		}

		public Integer getElasticNodeNum() {
			return this.elasticNodeNum;
		}

		public void setElasticNodeNum(Integer elasticNodeNum) {
			this.elasticNodeNum = elasticNodeNum;
		}

		public Boolean getEnable() {
			return this.enable;
		}

		public void setEnable(Boolean enable) {
			this.enable = enable;
		}

		public String getEndDay() {
			return this.endDay;
		}

		public void setEndDay(String endDay) {
			this.endDay = endDay;
		}

		public String getPlanName() {
			return this.planName;
		}

		public void setPlanName(String planName) {
			this.planName = planName;
		}

		public String getElasticPlanType() {
			return this.elasticPlanType;
		}

		public void setElasticPlanType(String elasticPlanType) {
			this.elasticPlanType = elasticPlanType;
		}

		public String getElasticPlanWorkerSpec() {
			return this.elasticPlanWorkerSpec;
		}

		public void setElasticPlanWorkerSpec(String elasticPlanWorkerSpec) {
			this.elasticPlanWorkerSpec = elasticPlanWorkerSpec;
		}
	}

	@Override
	public DescribeElasticPlanResponse getInstance(UnmarshallerContext context) {
		return	DescribeElasticPlanResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
