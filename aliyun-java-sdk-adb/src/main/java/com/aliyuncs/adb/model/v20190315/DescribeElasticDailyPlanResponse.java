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
import com.aliyuncs.adb.transform.v20190315.DescribeElasticDailyPlanResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeElasticDailyPlanResponse extends AcsResponse {

	private String requestId;

	private List<ElasticDailyPlanInfo> elasticDailyPlanList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ElasticDailyPlanInfo> getElasticDailyPlanList() {
		return this.elasticDailyPlanList;
	}

	public void setElasticDailyPlanList(List<ElasticDailyPlanInfo> elasticDailyPlanList) {
		this.elasticDailyPlanList = elasticDailyPlanList;
	}

	public static class ElasticDailyPlanInfo {

		private String planName;

		private String resourcePoolName;

		private Integer elasticNodeNum;

		private String planStartTs;

		private String planEndTs;

		private String startTs;

		private String endTs;

		private String day;

		private Integer status;

		public String getPlanName() {
			return this.planName;
		}

		public void setPlanName(String planName) {
			this.planName = planName;
		}

		public String getResourcePoolName() {
			return this.resourcePoolName;
		}

		public void setResourcePoolName(String resourcePoolName) {
			this.resourcePoolName = resourcePoolName;
		}

		public Integer getElasticNodeNum() {
			return this.elasticNodeNum;
		}

		public void setElasticNodeNum(Integer elasticNodeNum) {
			this.elasticNodeNum = elasticNodeNum;
		}

		public String getPlanStartTs() {
			return this.planStartTs;
		}

		public void setPlanStartTs(String planStartTs) {
			this.planStartTs = planStartTs;
		}

		public String getPlanEndTs() {
			return this.planEndTs;
		}

		public void setPlanEndTs(String planEndTs) {
			this.planEndTs = planEndTs;
		}

		public String getStartTs() {
			return this.startTs;
		}

		public void setStartTs(String startTs) {
			this.startTs = startTs;
		}

		public String getEndTs() {
			return this.endTs;
		}

		public void setEndTs(String endTs) {
			this.endTs = endTs;
		}

		public String getDay() {
			return this.day;
		}

		public void setDay(String day) {
			this.day = day;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}
	}

	@Override
	public DescribeElasticDailyPlanResponse getInstance(UnmarshallerContext context) {
		return	DescribeElasticDailyPlanResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
