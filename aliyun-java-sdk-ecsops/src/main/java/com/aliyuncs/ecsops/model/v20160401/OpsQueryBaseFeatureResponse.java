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
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryBaseFeatureResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryBaseFeatureResponse extends AcsResponse {

	private String requestId;

	private List<BaseFeature> baseFeatures;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<BaseFeature> getBaseFeatures() {
		return this.baseFeatures;
	}

	public void setBaseFeatures(List<BaseFeature> baseFeatures) {
		this.baseFeatures = baseFeatures;
	}

	public static class BaseFeature {

		private String name;

		private String featureType;

		private String type;

		private Integer validTimeRange;

		private String desc;

		private String exceptionTarget;

		private Boolean execOpsRuleNow;

		private String reason;

		private List<LinkedMonitor> linkedMonitors;

		private List<String> conditions;

		private List<String> restrictions;

		private List<String> supportTeams;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getFeatureType() {
			return this.featureType;
		}

		public void setFeatureType(String featureType) {
			this.featureType = featureType;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Integer getValidTimeRange() {
			return this.validTimeRange;
		}

		public void setValidTimeRange(Integer validTimeRange) {
			this.validTimeRange = validTimeRange;
		}

		public String getDesc() {
			return this.desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public String getExceptionTarget() {
			return this.exceptionTarget;
		}

		public void setExceptionTarget(String exceptionTarget) {
			this.exceptionTarget = exceptionTarget;
		}

		public Boolean getExecOpsRuleNow() {
			return this.execOpsRuleNow;
		}

		public void setExecOpsRuleNow(Boolean execOpsRuleNow) {
			this.execOpsRuleNow = execOpsRuleNow;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public List<LinkedMonitor> getLinkedMonitors() {
			return this.linkedMonitors;
		}

		public void setLinkedMonitors(List<LinkedMonitor> linkedMonitors) {
			this.linkedMonitors = linkedMonitors;
		}

		public List<String> getConditions() {
			return this.conditions;
		}

		public void setConditions(List<String> conditions) {
			this.conditions = conditions;
		}

		public List<String> getRestrictions() {
			return this.restrictions;
		}

		public void setRestrictions(List<String> restrictions) {
			this.restrictions = restrictions;
		}

		public List<String> getSupportTeams() {
			return this.supportTeams;
		}

		public void setSupportTeams(List<String> supportTeams) {
			this.supportTeams = supportTeams;
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
	public OpsQueryBaseFeatureResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryBaseFeatureResponseUnmarshaller.unmarshall(this, context);
	}
}
