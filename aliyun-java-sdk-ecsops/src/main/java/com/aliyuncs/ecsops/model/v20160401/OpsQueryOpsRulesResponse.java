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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryOpsRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryOpsRulesResponse extends AcsResponse {

	private String requestId;

	private List<OpsRuleConfig> opsRuleConfigs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<OpsRuleConfig> getOpsRuleConfigs() {
		return this.opsRuleConfigs;
	}

	public void setOpsRuleConfigs(List<OpsRuleConfig> opsRuleConfigs) {
		this.opsRuleConfigs = opsRuleConfigs;
	}

	public static class OpsRuleConfig {

		private String opsReason;

		private Integer silent;

		private String desc;

		private Integer maxTimes;

		private String opsType;

		private Integer delayExec;

		private String name;

		private String level;

		private Boolean enable;

		private String opsTargetType;

		private List<LinkedMonitor> linkedMonitors;

		private List<LinkedFeature> linkedFeatures;

		private List<String> actions;

		private List<String> exclusions;

		private List<String> conditions;

		public String getOpsReason() {
			return this.opsReason;
		}

		public void setOpsReason(String opsReason) {
			this.opsReason = opsReason;
		}

		public Integer getSilent() {
			return this.silent;
		}

		public void setSilent(Integer silent) {
			this.silent = silent;
		}

		public String getDesc() {
			return this.desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public Integer getMaxTimes() {
			return this.maxTimes;
		}

		public void setMaxTimes(Integer maxTimes) {
			this.maxTimes = maxTimes;
		}

		public String getOpsType() {
			return this.opsType;
		}

		public void setOpsType(String opsType) {
			this.opsType = opsType;
		}

		public Integer getDelayExec() {
			return this.delayExec;
		}

		public void setDelayExec(Integer delayExec) {
			this.delayExec = delayExec;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public Boolean getEnable() {
			return this.enable;
		}

		public void setEnable(Boolean enable) {
			this.enable = enable;
		}

		public String getOpsTargetType() {
			return this.opsTargetType;
		}

		public void setOpsTargetType(String opsTargetType) {
			this.opsTargetType = opsTargetType;
		}

		public List<LinkedMonitor> getLinkedMonitors() {
			return this.linkedMonitors;
		}

		public void setLinkedMonitors(List<LinkedMonitor> linkedMonitors) {
			this.linkedMonitors = linkedMonitors;
		}

		public List<LinkedFeature> getLinkedFeatures() {
			return this.linkedFeatures;
		}

		public void setLinkedFeatures(List<LinkedFeature> linkedFeatures) {
			this.linkedFeatures = linkedFeatures;
		}

		public List<String> getActions() {
			return this.actions;
		}

		public void setActions(List<String> actions) {
			this.actions = actions;
		}

		public List<String> getExclusions() {
			return this.exclusions;
		}

		public void setExclusions(List<String> exclusions) {
			this.exclusions = exclusions;
		}

		public List<String> getConditions() {
			return this.conditions;
		}

		public void setConditions(List<String> conditions) {
			this.conditions = conditions;
		}

		public static class LinkedMonitor {

			private String slsConfigName;

			private Integer interval;

			private Integer timeRange;

			private String logstore;

			private String monitorName;

			private String defaultProject;

			public String getSlsConfigName() {
				return this.slsConfigName;
			}

			public void setSlsConfigName(String slsConfigName) {
				this.slsConfigName = slsConfigName;
			}

			public Integer getInterval() {
				return this.interval;
			}

			public void setInterval(Integer interval) {
				this.interval = interval;
			}

			public Integer getTimeRange() {
				return this.timeRange;
			}

			public void setTimeRange(Integer timeRange) {
				this.timeRange = timeRange;
			}

			public String getLogstore() {
				return this.logstore;
			}

			public void setLogstore(String logstore) {
				this.logstore = logstore;
			}

			public String getMonitorName() {
				return this.monitorName;
			}

			public void setMonitorName(String monitorName) {
				this.monitorName = monitorName;
			}

			public String getDefaultProject() {
				return this.defaultProject;
			}

			public void setDefaultProject(String defaultProject) {
				this.defaultProject = defaultProject;
			}
		}

		public static class LinkedFeature {

			private String type;

			private Boolean exception;

			private Integer validTimeRange;

			private String name;

			private String desc;

			private List<String> conditions1;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Boolean getException() {
				return this.exception;
			}

			public void setException(Boolean exception) {
				this.exception = exception;
			}

			public Integer getValidTimeRange() {
				return this.validTimeRange;
			}

			public void setValidTimeRange(Integer validTimeRange) {
				this.validTimeRange = validTimeRange;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getDesc() {
				return this.desc;
			}

			public void setDesc(String desc) {
				this.desc = desc;
			}

			public List<String> getConditions1() {
				return this.conditions1;
			}

			public void setConditions1(List<String> conditions1) {
				this.conditions1 = conditions1;
			}
		}
	}

	@Override
	public OpsQueryOpsRulesResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryOpsRulesResponseUnmarshaller.unmarshall(this, context);
	}
}
