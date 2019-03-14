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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.ListClusterServiceComponentHealthInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListClusterServiceComponentHealthInfoResponse extends AcsResponse {

	private String requestId;

	private String clusterId;

	private List<HealthInfo> healthInfoList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}

	public List<HealthInfo> getHealthInfoList() {
		return this.healthInfoList;
	}

	public void setHealthInfoList(List<HealthInfo> healthInfoList) {
		this.healthInfoList = healthInfoList;
	}

	public static class HealthInfo {

		private String serviceName;

		private String componentName;

		private String healthLevel;

		private Integer stoppedNum;

		private Integer manualStoppedNum;

		private Integer normalNum;

		private Integer totalNum;

		private Integer agentHeartBeatLostNum;

		private List<HealthDetail> healthDetailList;

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}

		public String getComponentName() {
			return this.componentName;
		}

		public void setComponentName(String componentName) {
			this.componentName = componentName;
		}

		public String getHealthLevel() {
			return this.healthLevel;
		}

		public void setHealthLevel(String healthLevel) {
			this.healthLevel = healthLevel;
		}

		public Integer getStoppedNum() {
			return this.stoppedNum;
		}

		public void setStoppedNum(Integer stoppedNum) {
			this.stoppedNum = stoppedNum;
		}

		public Integer getManualStoppedNum() {
			return this.manualStoppedNum;
		}

		public void setManualStoppedNum(Integer manualStoppedNum) {
			this.manualStoppedNum = manualStoppedNum;
		}

		public Integer getNormalNum() {
			return this.normalNum;
		}

		public void setNormalNum(Integer normalNum) {
			this.normalNum = normalNum;
		}

		public Integer getTotalNum() {
			return this.totalNum;
		}

		public void setTotalNum(Integer totalNum) {
			this.totalNum = totalNum;
		}

		public Integer getAgentHeartBeatLostNum() {
			return this.agentHeartBeatLostNum;
		}

		public void setAgentHeartBeatLostNum(Integer agentHeartBeatLostNum) {
			this.agentHeartBeatLostNum = agentHeartBeatLostNum;
		}

		public List<HealthDetail> getHealthDetailList() {
			return this.healthDetailList;
		}

		public void setHealthDetailList(List<HealthDetail> healthDetailList) {
			this.healthDetailList = healthDetailList;
		}

		public static class HealthDetail {

			private String code;

			private HealthRuleParam healthRuleParam;

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}

			public HealthRuleParam getHealthRuleParam() {
				return this.healthRuleParam;
			}

			public void setHealthRuleParam(HealthRuleParam healthRuleParam) {
				this.healthRuleParam = healthRuleParam;
			}

			public static class HealthRuleParam {

				private String service;

				private String component;

				private String ruleTitle;

				private String pass;

				private String ruleId;

				private String ruleDescription;

				private String hostNames;

				public String getService() {
					return this.service;
				}

				public void setService(String service) {
					this.service = service;
				}

				public String getComponent() {
					return this.component;
				}

				public void setComponent(String component) {
					this.component = component;
				}

				public String getRuleTitle() {
					return this.ruleTitle;
				}

				public void setRuleTitle(String ruleTitle) {
					this.ruleTitle = ruleTitle;
				}

				public String getPass() {
					return this.pass;
				}

				public void setPass(String pass) {
					this.pass = pass;
				}

				public String getRuleId() {
					return this.ruleId;
				}

				public void setRuleId(String ruleId) {
					this.ruleId = ruleId;
				}

				public String getRuleDescription() {
					return this.ruleDescription;
				}

				public void setRuleDescription(String ruleDescription) {
					this.ruleDescription = ruleDescription;
				}

				public String getHostNames() {
					return this.hostNames;
				}

				public void setHostNames(String hostNames) {
					this.hostNames = hostNames;
				}
			}
		}
	}

	@Override
	public ListClusterServiceComponentHealthInfoResponse getInstance(UnmarshallerContext context) {
		return	ListClusterServiceComponentHealthInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
