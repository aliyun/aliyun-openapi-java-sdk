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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeStrategyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeStrategyResponse extends AcsResponse {

	private String requestId;

	private List<Strategy> strategies;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Strategy> getStrategies() {
		return this.strategies;
	}

	public void setStrategies(List<Strategy> strategies) {
		this.strategies = strategies;
	}

	public static class Strategy {

		private Integer type;

		private Integer execStatus;

		private Integer passRate;

		private String authVersionList;

		private Integer cycleStartTime;

		private String customType;

		private Integer ecsCount;

		private Integer processRate;

		private Integer cycleDays;

		private Integer riskCount;

		private String name;

		private Integer id;

		private List<ConfigTarget> configTargets;

		public Integer getType() {
			return this.type;
		}

		public void setType(Integer type) {
			this.type = type;
		}

		public Integer getExecStatus() {
			return this.execStatus;
		}

		public void setExecStatus(Integer execStatus) {
			this.execStatus = execStatus;
		}

		public Integer getPassRate() {
			return this.passRate;
		}

		public void setPassRate(Integer passRate) {
			this.passRate = passRate;
		}

		public String getAuthVersionList() {
			return this.authVersionList;
		}

		public void setAuthVersionList(String authVersionList) {
			this.authVersionList = authVersionList;
		}

		public Integer getCycleStartTime() {
			return this.cycleStartTime;
		}

		public void setCycleStartTime(Integer cycleStartTime) {
			this.cycleStartTime = cycleStartTime;
		}

		public String getCustomType() {
			return this.customType;
		}

		public void setCustomType(String customType) {
			this.customType = customType;
		}

		public Integer getEcsCount() {
			return this.ecsCount;
		}

		public void setEcsCount(Integer ecsCount) {
			this.ecsCount = ecsCount;
		}

		public Integer getProcessRate() {
			return this.processRate;
		}

		public void setProcessRate(Integer processRate) {
			this.processRate = processRate;
		}

		public Integer getCycleDays() {
			return this.cycleDays;
		}

		public void setCycleDays(Integer cycleDays) {
			this.cycleDays = cycleDays;
		}

		public Integer getRiskCount() {
			return this.riskCount;
		}

		public void setRiskCount(Integer riskCount) {
			this.riskCount = riskCount;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public List<ConfigTarget> getConfigTargets() {
			return this.configTargets;
		}

		public void setConfigTargets(List<ConfigTarget> configTargets) {
			this.configTargets = configTargets;
		}

		public static class ConfigTarget {

			private String flag;

			private String target;

			private String targetType;

			public String getFlag() {
				return this.flag;
			}

			public void setFlag(String flag) {
				this.flag = flag;
			}

			public String getTarget() {
				return this.target;
			}

			public void setTarget(String target) {
				this.target = target;
			}

			public String getTargetType() {
				return this.targetType;
			}

			public void setTargetType(String targetType) {
				this.targetType = targetType;
			}
		}
	}

	@Override
	public DescribeStrategyResponse getInstance(UnmarshallerContext context) {
		return	DescribeStrategyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
