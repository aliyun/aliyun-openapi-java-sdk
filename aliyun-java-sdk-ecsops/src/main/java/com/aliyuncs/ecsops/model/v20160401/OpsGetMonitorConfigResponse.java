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
import com.aliyuncs.ecsops.transform.v20160401.OpsGetMonitorConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsGetMonitorConfigResponse extends AcsResponse {

	private String requestId;

	private List<MonitorConfig> monitorConfigs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<MonitorConfig> getMonitorConfigs() {
		return this.monitorConfigs;
	}

	public void setMonitorConfigs(List<MonitorConfig> monitorConfigs) {
		this.monitorConfigs = monitorConfigs;
	}

	public static class MonitorConfig {

		private String type;

		private String doc;

		private String analyse;

		private Integer opsTimeout;

		private Integer retentionTime;

		private Integer timeRange;

		private String logstore;

		private String name;

		private String slsConfigName;

		private String monitorType;

		private Integer silent;

		private String detailMetric;

		private String query;

		private Integer interval;

		private Boolean enable;

		private List<Level> levels;

		private List<String> linkedDimensions;

		private List<String> notifyTokens;

		private List<String> linkedQuerys;

		private List<String> excludeKeys;

		private List<String> regions;

		private List<String> slsRegionProjectList;

		private List<String> slsUrlList;

		private EventCenter eventCenter;

		private Exclusion exclusion;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getDoc() {
			return this.doc;
		}

		public void setDoc(String doc) {
			this.doc = doc;
		}

		public String getAnalyse() {
			return this.analyse;
		}

		public void setAnalyse(String analyse) {
			this.analyse = analyse;
		}

		public Integer getOpsTimeout() {
			return this.opsTimeout;
		}

		public void setOpsTimeout(Integer opsTimeout) {
			this.opsTimeout = opsTimeout;
		}

		public Integer getRetentionTime() {
			return this.retentionTime;
		}

		public void setRetentionTime(Integer retentionTime) {
			this.retentionTime = retentionTime;
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

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSlsConfigName() {
			return this.slsConfigName;
		}

		public void setSlsConfigName(String slsConfigName) {
			this.slsConfigName = slsConfigName;
		}

		public String getMonitorType() {
			return this.monitorType;
		}

		public void setMonitorType(String monitorType) {
			this.monitorType = monitorType;
		}

		public Integer getSilent() {
			return this.silent;
		}

		public void setSilent(Integer silent) {
			this.silent = silent;
		}

		public String getDetailMetric() {
			return this.detailMetric;
		}

		public void setDetailMetric(String detailMetric) {
			this.detailMetric = detailMetric;
		}

		public String getQuery() {
			return this.query;
		}

		public void setQuery(String query) {
			this.query = query;
		}

		public Integer getInterval() {
			return this.interval;
		}

		public void setInterval(Integer interval) {
			this.interval = interval;
		}

		public Boolean getEnable() {
			return this.enable;
		}

		public void setEnable(Boolean enable) {
			this.enable = enable;
		}

		public List<Level> getLevels() {
			return this.levels;
		}

		public void setLevels(List<Level> levels) {
			this.levels = levels;
		}

		public List<String> getLinkedDimensions() {
			return this.linkedDimensions;
		}

		public void setLinkedDimensions(List<String> linkedDimensions) {
			this.linkedDimensions = linkedDimensions;
		}

		public List<String> getNotifyTokens() {
			return this.notifyTokens;
		}

		public void setNotifyTokens(List<String> notifyTokens) {
			this.notifyTokens = notifyTokens;
		}

		public List<String> getLinkedQuerys() {
			return this.linkedQuerys;
		}

		public void setLinkedQuerys(List<String> linkedQuerys) {
			this.linkedQuerys = linkedQuerys;
		}

		public List<String> getExcludeKeys() {
			return this.excludeKeys;
		}

		public void setExcludeKeys(List<String> excludeKeys) {
			this.excludeKeys = excludeKeys;
		}

		public List<String> getRegions() {
			return this.regions;
		}

		public void setRegions(List<String> regions) {
			this.regions = regions;
		}

		public List<String> getSlsRegionProjectList() {
			return this.slsRegionProjectList;
		}

		public void setSlsRegionProjectList(List<String> slsRegionProjectList) {
			this.slsRegionProjectList = slsRegionProjectList;
		}

		public List<String> getSlsUrlList() {
			return this.slsUrlList;
		}

		public void setSlsUrlList(List<String> slsUrlList) {
			this.slsUrlList = slsUrlList;
		}

		public EventCenter getEventCenter() {
			return this.eventCenter;
		}

		public void setEventCenter(EventCenter eventCenter) {
			this.eventCenter = eventCenter;
		}

		public Exclusion getExclusion() {
			return this.exclusion;
		}

		public void setExclusion(Exclusion exclusion) {
			this.exclusion = exclusion;
		}

		public static class Level {

			private Boolean phoneCall;

			private Boolean persistent;

			private Boolean hasVmThenAlert;

			private String expression;

			private Integer alertOnCall;

			private String name;

			private List<String> actions;

			private List<String> notifys;

			private List<String> filterChains;

			private List<String> atDutys;

			private List<String> notifyTokenUrlList;

			private List<String> levelNotifyTokens;

			public Boolean getPhoneCall() {
				return this.phoneCall;
			}

			public void setPhoneCall(Boolean phoneCall) {
				this.phoneCall = phoneCall;
			}

			public Boolean getPersistent() {
				return this.persistent;
			}

			public void setPersistent(Boolean persistent) {
				this.persistent = persistent;
			}

			public Boolean getHasVmThenAlert() {
				return this.hasVmThenAlert;
			}

			public void setHasVmThenAlert(Boolean hasVmThenAlert) {
				this.hasVmThenAlert = hasVmThenAlert;
			}

			public String getExpression() {
				return this.expression;
			}

			public void setExpression(String expression) {
				this.expression = expression;
			}

			public Integer getAlertOnCall() {
				return this.alertOnCall;
			}

			public void setAlertOnCall(Integer alertOnCall) {
				this.alertOnCall = alertOnCall;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public List<String> getActions() {
				return this.actions;
			}

			public void setActions(List<String> actions) {
				this.actions = actions;
			}

			public List<String> getNotifys() {
				return this.notifys;
			}

			public void setNotifys(List<String> notifys) {
				this.notifys = notifys;
			}

			public List<String> getFilterChains() {
				return this.filterChains;
			}

			public void setFilterChains(List<String> filterChains) {
				this.filterChains = filterChains;
			}

			public List<String> getAtDutys() {
				return this.atDutys;
			}

			public void setAtDutys(List<String> atDutys) {
				this.atDutys = atDutys;
			}

			public List<String> getNotifyTokenUrlList() {
				return this.notifyTokenUrlList;
			}

			public void setNotifyTokenUrlList(List<String> notifyTokenUrlList) {
				this.notifyTokenUrlList = notifyTokenUrlList;
			}

			public List<String> getLevelNotifyTokens() {
				return this.levelNotifyTokens;
			}

			public void setLevelNotifyTokens(List<String> levelNotifyTokens) {
				this.levelNotifyTokens = levelNotifyTokens;
			}
		}

		public static class EventCenter {

			private Boolean push;

			private String impact;

			private String closureFlag;

			private String closureEvent;

			private String category;

			private String eventSilent;

			private String opsCode;

			private String resourceStatus;

			public Boolean getPush() {
				return this.push;
			}

			public void setPush(Boolean push) {
				this.push = push;
			}

			public String getImpact() {
				return this.impact;
			}

			public void setImpact(String impact) {
				this.impact = impact;
			}

			public String getClosureFlag() {
				return this.closureFlag;
			}

			public void setClosureFlag(String closureFlag) {
				this.closureFlag = closureFlag;
			}

			public String getClosureEvent() {
				return this.closureEvent;
			}

			public void setClosureEvent(String closureEvent) {
				this.closureEvent = closureEvent;
			}

			public String getCategory() {
				return this.category;
			}

			public void setCategory(String category) {
				this.category = category;
			}

			public String getEventSilent() {
				return this.eventSilent;
			}

			public void setEventSilent(String eventSilent) {
				this.eventSilent = eventSilent;
			}

			public String getOpsCode() {
				return this.opsCode;
			}

			public void setOpsCode(String opsCode) {
				this.opsCode = opsCode;
			}

			public String getResourceStatus() {
				return this.resourceStatus;
			}

			public void setResourceStatus(String resourceStatus) {
				this.resourceStatus = resourceStatus;
			}
		}

		public static class Exclusion {

			private String extension;

			private List<String> excludedAZones;

			private List<String> excludedClusters;

			private List<String> excludedVms;

			private List<String> excludedNcs;

			private List<String> excludedRegions;

			public String getExtension() {
				return this.extension;
			}

			public void setExtension(String extension) {
				this.extension = extension;
			}

			public List<String> getExcludedAZones() {
				return this.excludedAZones;
			}

			public void setExcludedAZones(List<String> excludedAZones) {
				this.excludedAZones = excludedAZones;
			}

			public List<String> getExcludedClusters() {
				return this.excludedClusters;
			}

			public void setExcludedClusters(List<String> excludedClusters) {
				this.excludedClusters = excludedClusters;
			}

			public List<String> getExcludedVms() {
				return this.excludedVms;
			}

			public void setExcludedVms(List<String> excludedVms) {
				this.excludedVms = excludedVms;
			}

			public List<String> getExcludedNcs() {
				return this.excludedNcs;
			}

			public void setExcludedNcs(List<String> excludedNcs) {
				this.excludedNcs = excludedNcs;
			}

			public List<String> getExcludedRegions() {
				return this.excludedRegions;
			}

			public void setExcludedRegions(List<String> excludedRegions) {
				this.excludedRegions = excludedRegions;
			}
		}
	}

	@Override
	public OpsGetMonitorConfigResponse getInstance(UnmarshallerContext context) {
		return	OpsGetMonitorConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
