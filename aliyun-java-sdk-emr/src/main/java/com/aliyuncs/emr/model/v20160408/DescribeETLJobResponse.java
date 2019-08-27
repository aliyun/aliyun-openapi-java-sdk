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
import com.aliyuncs.emr.transform.v20160408.DescribeETLJobResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeETLJobResponse extends AcsResponse {

	private String requestId;

	private String id;

	private String name;

	private String description;

	private String categoryId;

	private String graph;

	private List<TriggerRule> triggerRuleList;

	private List<Stage> stageList;

	private List<StageConnection> stageConnectionList;

	private ClusterConfig clusterConfig;

	private AlertConfig alertConfig;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getGraph() {
		return this.graph;
	}

	public void setGraph(String graph) {
		this.graph = graph;
	}

	public List<TriggerRule> getTriggerRuleList() {
		return this.triggerRuleList;
	}

	public void setTriggerRuleList(List<TriggerRule> triggerRuleList) {
		this.triggerRuleList = triggerRuleList;
	}

	public List<Stage> getStageList() {
		return this.stageList;
	}

	public void setStageList(List<Stage> stageList) {
		this.stageList = stageList;
	}

	public List<StageConnection> getStageConnectionList() {
		return this.stageConnectionList;
	}

	public void setStageConnectionList(List<StageConnection> stageConnectionList) {
		this.stageConnectionList = stageConnectionList;
	}

	public ClusterConfig getClusterConfig() {
		return this.clusterConfig;
	}

	public void setClusterConfig(ClusterConfig clusterConfig) {
		this.clusterConfig = clusterConfig;
	}

	public AlertConfig getAlertConfig() {
		return this.alertConfig;
	}

	public void setAlertConfig(AlertConfig alertConfig) {
		this.alertConfig = alertConfig;
	}

	public static class TriggerRule {

		private Boolean enabled;

		private Long startTime;

		private Long endTime;

		private String cronExpr;

		public Boolean getEnabled() {
			return this.enabled;
		}

		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public String getCronExpr() {
			return this.cronExpr;
		}

		public void setCronExpr(String cronExpr) {
			this.cronExpr = cronExpr;
		}
	}

	public static class Stage {

		private String stageName;

		private String stageType;

		private String stagePlugin;

		private String stageConf;

		public String getStageName() {
			return this.stageName;
		}

		public void setStageName(String stageName) {
			this.stageName = stageName;
		}

		public String getStageType() {
			return this.stageType;
		}

		public void setStageType(String stageType) {
			this.stageType = stageType;
		}

		public String getStagePlugin() {
			return this.stagePlugin;
		}

		public void setStagePlugin(String stagePlugin) {
			this.stagePlugin = stagePlugin;
		}

		public String getStageConf() {
			return this.stageConf;
		}

		public void setStageConf(String stageConf) {
			this.stageConf = stageConf;
		}
	}

	public static class StageConnection {

		private String from;

		private String to;

		private String port;

		public String getFrom() {
			return this.from;
		}

		public void setFrom(String from) {
			this.from = from;
		}

		public String getTo() {
			return this.to;
		}

		public void setTo(String to) {
			this.to = to;
		}

		public String getPort() {
			return this.port;
		}

		public void setPort(String port) {
			this.port = port;
		}
	}

	public static class ClusterConfig {

		private Boolean isOnDemand;

		private String clusterId;

		private String queue;

		private String userName;

		private Long recordRate;

		private Long sizeRate;

		private DriverResource driverResource;

		private ExecutorResource executorResource;

		public Boolean getIsOnDemand() {
			return this.isOnDemand;
		}

		public void setIsOnDemand(Boolean isOnDemand) {
			this.isOnDemand = isOnDemand;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getQueue() {
			return this.queue;
		}

		public void setQueue(String queue) {
			this.queue = queue;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public Long getRecordRate() {
			return this.recordRate;
		}

		public void setRecordRate(Long recordRate) {
			this.recordRate = recordRate;
		}

		public Long getSizeRate() {
			return this.sizeRate;
		}

		public void setSizeRate(Long sizeRate) {
			this.sizeRate = sizeRate;
		}

		public DriverResource getDriverResource() {
			return this.driverResource;
		}

		public void setDriverResource(DriverResource driverResource) {
			this.driverResource = driverResource;
		}

		public ExecutorResource getExecutorResource() {
			return this.executorResource;
		}

		public void setExecutorResource(ExecutorResource executorResource) {
			this.executorResource = executorResource;
		}

		public static class DriverResource {

			private Integer vcores;

			private Integer memSize;

			public Integer getVcores() {
				return this.vcores;
			}

			public void setVcores(Integer vcores) {
				this.vcores = vcores;
			}

			public Integer getMemSize() {
				return this.memSize;
			}

			public void setMemSize(Integer memSize) {
				this.memSize = memSize;
			}
		}

		public static class ExecutorResource {

			private Integer vcores;

			private Integer memSize;

			public Integer getVcores() {
				return this.vcores;
			}

			public void setVcores(Integer vcores) {
				this.vcores = vcores;
			}

			public Integer getMemSize() {
				return this.memSize;
			}

			public void setMemSize(Integer memSize) {
				this.memSize = memSize;
			}
		}
	}

	public static class AlertConfig {

		private List<Item> items;

		public List<Item> getItems() {
			return this.items;
		}

		public void setItems(List<Item> items) {
			this.items = items;
		}

		public static class Item {

			private Boolean enable;

			private String eventId;

			private List<String> alertUserGroupIdList;

			private List<String> alertDingDingGroupList;

			public Boolean getEnable() {
				return this.enable;
			}

			public void setEnable(Boolean enable) {
				this.enable = enable;
			}

			public String getEventId() {
				return this.eventId;
			}

			public void setEventId(String eventId) {
				this.eventId = eventId;
			}

			public List<String> getAlertUserGroupIdList() {
				return this.alertUserGroupIdList;
			}

			public void setAlertUserGroupIdList(List<String> alertUserGroupIdList) {
				this.alertUserGroupIdList = alertUserGroupIdList;
			}

			public List<String> getAlertDingDingGroupList() {
				return this.alertDingDingGroupList;
			}

			public void setAlertDingDingGroupList(List<String> alertDingDingGroupList) {
				this.alertDingDingGroupList = alertDingDingGroupList;
			}
		}
	}

	@Override
	public DescribeETLJobResponse getInstance(UnmarshallerContext context) {
		return	DescribeETLJobResponseUnmarshaller.unmarshall(this, context);
	}
}
