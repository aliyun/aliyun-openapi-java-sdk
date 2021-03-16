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

		private String name;

		private Boolean enable;

		private Integer silent;

		private String level;

		private String desc;

		private String opsType;

		private String opsTargetType;

		private String opsReason;

		private Integer maxTimes;

		private Integer delayExec;

		private List<LinkedFeature> linkedFeatures;

		private List<LinkedMonitor> linkedMonitors;

		private List<String> exclusions;

		private List<String> conditions;

		private List<String> actions;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Boolean getEnable() {
			return this.enable;
		}

		public void setEnable(Boolean enable) {
			this.enable = enable;
		}

		public Integer getSilent() {
			return this.silent;
		}

		public void setSilent(Integer silent) {
			this.silent = silent;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public String getDesc() {
			return this.desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public String getOpsType() {
			return this.opsType;
		}

		public void setOpsType(String opsType) {
			this.opsType = opsType;
		}

		public String getOpsTargetType() {
			return this.opsTargetType;
		}

		public void setOpsTargetType(String opsTargetType) {
			this.opsTargetType = opsTargetType;
		}

		public String getOpsReason() {
			return this.opsReason;
		}

		public void setOpsReason(String opsReason) {
			this.opsReason = opsReason;
		}

		public Integer getMaxTimes() {
			return this.maxTimes;
		}

		public void setMaxTimes(Integer maxTimes) {
			this.maxTimes = maxTimes;
		}

		public Integer getDelayExec() {
			return this.delayExec;
		}

		public void setDelayExec(Integer delayExec) {
			this.delayExec = delayExec;
		}

		public List<LinkedFeature> getLinkedFeatures() {
			return this.linkedFeatures;
		}

		public void setLinkedFeatures(List<LinkedFeature> linkedFeatures) {
			this.linkedFeatures = linkedFeatures;
		}

		public List<LinkedMonitor> getLinkedMonitors() {
			return this.linkedMonitors;
		}

		public void setLinkedMonitors(List<LinkedMonitor> linkedMonitors) {
			this.linkedMonitors = linkedMonitors;
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

		public List<String> getActions() {
			return this.actions;
		}

		public void setActions(List<String> actions) {
			this.actions = actions;
		}

		public static class LinkedFeature {

			private String name;

			private Boolean exception;

			private Integer validTimeRange;

			private String type;

			private String desc;

			private List<String> conditions1;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
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

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
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

		public static class LinkedMonitor {

			private String logstore;

			private Integer timeRange;

			private String monitorName;

			private Integer interval;

			private String slsConfigName;

			private String defaultProject;

			public String getLogstore() {
				return this.logstore;
			}

			public void setLogstore(String logstore) {
				this.logstore = logstore;
			}

			public Integer getTimeRange() {
				return this.timeRange;
			}

			public void setTimeRange(Integer timeRange) {
				this.timeRange = timeRange;
			}

			public String getMonitorName() {
				return this.monitorName;
			}

			public void setMonitorName(String monitorName) {
				this.monitorName = monitorName;
			}

			public Integer getInterval() {
				return this.interval;
			}

			public void setInterval(Integer interval) {
				this.interval = interval;
			}

			public String getSlsConfigName() {
				return this.slsConfigName;
			}

			public void setSlsConfigName(String slsConfigName) {
				this.slsConfigName = slsConfigName;
			}

			public String getDefaultProject() {
				return this.defaultProject;
			}

			public void setDefaultProject(String defaultProject) {
				this.defaultProject = defaultProject;
			}
		}
	}

	@Override
	public OpsQueryOpsRulesResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryOpsRulesResponseUnmarshaller.unmarshall(this, context);
	}
}
