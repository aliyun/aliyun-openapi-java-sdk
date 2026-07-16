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

package com.aliyuncs.ess.model.v20140828;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ess.transform.v20140828.DescribeInstanceRefreshesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceRefreshesResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private String nextToken;

	private Integer maxResults;

	private List<InstanceRefreshTask> instanceRefreshTasks;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<InstanceRefreshTask> getInstanceRefreshTasks() {
		return this.instanceRefreshTasks;
	}

	public void setInstanceRefreshTasks(List<InstanceRefreshTask> instanceRefreshTasks) {
		this.instanceRefreshTasks = instanceRefreshTasks;
	}

	public static class InstanceRefreshTask {

		private String instanceRefreshTaskId;

		private String status;

		private String endTime;

		private Integer totalNeedUpdateCapacity;

		private String scalingGroupId;

		private String startTime;

		private Integer minHealthyPercentage;

		private Boolean skipMatching;

		private Integer finishedUpdateCapacity;

		private String strategy;

		private Integer checkpointPauseTime;

		private String regionId;

		private Integer maxHealthyPercentage;

		private String detail;

		private List<Checkpoint> checkpoints;

		private DesiredConfiguration desiredConfiguration;

		public String getInstanceRefreshTaskId() {
			return this.instanceRefreshTaskId;
		}

		public void setInstanceRefreshTaskId(String instanceRefreshTaskId) {
			this.instanceRefreshTaskId = instanceRefreshTaskId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public Integer getTotalNeedUpdateCapacity() {
			return this.totalNeedUpdateCapacity;
		}

		public void setTotalNeedUpdateCapacity(Integer totalNeedUpdateCapacity) {
			this.totalNeedUpdateCapacity = totalNeedUpdateCapacity;
		}

		public String getScalingGroupId() {
			return this.scalingGroupId;
		}

		public void setScalingGroupId(String scalingGroupId) {
			this.scalingGroupId = scalingGroupId;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public Integer getMinHealthyPercentage() {
			return this.minHealthyPercentage;
		}

		public void setMinHealthyPercentage(Integer minHealthyPercentage) {
			this.minHealthyPercentage = minHealthyPercentage;
		}

		public Boolean getSkipMatching() {
			return this.skipMatching;
		}

		public void setSkipMatching(Boolean skipMatching) {
			this.skipMatching = skipMatching;
		}

		public Integer getFinishedUpdateCapacity() {
			return this.finishedUpdateCapacity;
		}

		public void setFinishedUpdateCapacity(Integer finishedUpdateCapacity) {
			this.finishedUpdateCapacity = finishedUpdateCapacity;
		}

		public String getStrategy() {
			return this.strategy;
		}

		public void setStrategy(String strategy) {
			this.strategy = strategy;
		}

		public Integer getCheckpointPauseTime() {
			return this.checkpointPauseTime;
		}

		public void setCheckpointPauseTime(Integer checkpointPauseTime) {
			this.checkpointPauseTime = checkpointPauseTime;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Integer getMaxHealthyPercentage() {
			return this.maxHealthyPercentage;
		}

		public void setMaxHealthyPercentage(Integer maxHealthyPercentage) {
			this.maxHealthyPercentage = maxHealthyPercentage;
		}

		public String getDetail() {
			return this.detail;
		}

		public void setDetail(String detail) {
			this.detail = detail;
		}

		public List<Checkpoint> getCheckpoints() {
			return this.checkpoints;
		}

		public void setCheckpoints(List<Checkpoint> checkpoints) {
			this.checkpoints = checkpoints;
		}

		public DesiredConfiguration getDesiredConfiguration() {
			return this.desiredConfiguration;
		}

		public void setDesiredConfiguration(DesiredConfiguration desiredConfiguration) {
			this.desiredConfiguration = desiredConfiguration;
		}

		public static class Checkpoint {

			private Integer percentage;

			public Integer getPercentage() {
				return this.percentage;
			}

			public void setPercentage(Integer percentage) {
				this.percentage = percentage;
			}
		}

		public static class DesiredConfiguration {

			private String imageId;

			private String launchTemplateVersion;

			private String launchTemplateId;

			private String scalingConfigurationId;

			private List<LaunchTemplateOverride> launchTemplateOverrides;

			private List<Container> containers;

			public String getImageId() {
				return this.imageId;
			}

			public void setImageId(String imageId) {
				this.imageId = imageId;
			}

			public String getLaunchTemplateVersion() {
				return this.launchTemplateVersion;
			}

			public void setLaunchTemplateVersion(String launchTemplateVersion) {
				this.launchTemplateVersion = launchTemplateVersion;
			}

			public String getLaunchTemplateId() {
				return this.launchTemplateId;
			}

			public void setLaunchTemplateId(String launchTemplateId) {
				this.launchTemplateId = launchTemplateId;
			}

			public String getScalingConfigurationId() {
				return this.scalingConfigurationId;
			}

			public void setScalingConfigurationId(String scalingConfigurationId) {
				this.scalingConfigurationId = scalingConfigurationId;
			}

			public List<LaunchTemplateOverride> getLaunchTemplateOverrides() {
				return this.launchTemplateOverrides;
			}

			public void setLaunchTemplateOverrides(List<LaunchTemplateOverride> launchTemplateOverrides) {
				this.launchTemplateOverrides = launchTemplateOverrides;
			}

			public List<Container> getContainers() {
				return this.containers;
			}

			public void setContainers(List<Container> containers) {
				this.containers = containers;
			}

			public static class LaunchTemplateOverride {

				private String instanceType;

				public String getInstanceType() {
					return this.instanceType;
				}

				public void setInstanceType(String instanceType) {
					this.instanceType = instanceType;
				}
			}

			public static class Container {

				private String image;

				private String name;

				private List<EnvironmentVar> environmentVars;

				private List<String> args;

				private List<String> commands;

				public String getImage() {
					return this.image;
				}

				public void setImage(String image) {
					this.image = image;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public List<EnvironmentVar> getEnvironmentVars() {
					return this.environmentVars;
				}

				public void setEnvironmentVars(List<EnvironmentVar> environmentVars) {
					this.environmentVars = environmentVars;
				}

				public List<String> getArgs() {
					return this.args;
				}

				public void setArgs(List<String> args) {
					this.args = args;
				}

				public List<String> getCommands() {
					return this.commands;
				}

				public void setCommands(List<String> commands) {
					this.commands = commands;
				}

				public static class EnvironmentVar {

					private String fieldRefFieldPath;

					private String value;

					private String key;

					public String getFieldRefFieldPath() {
						return this.fieldRefFieldPath;
					}

					public void setFieldRefFieldPath(String fieldRefFieldPath) {
						this.fieldRefFieldPath = fieldRefFieldPath;
					}

					public String getValue() {
						return this.value;
					}

					public void setValue(String value) {
						this.value = value;
					}

					public String getKey() {
						return this.key;
					}

					public void setKey(String key) {
						this.key = key;
					}
				}
			}
		}
	}

	@Override
	public DescribeInstanceRefreshesResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceRefreshesResponseUnmarshaller.unmarshall(this, context);
	}
}
