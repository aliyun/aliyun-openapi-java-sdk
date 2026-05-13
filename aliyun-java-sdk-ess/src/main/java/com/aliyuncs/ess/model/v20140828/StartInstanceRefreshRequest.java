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

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ess.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class StartInstanceRefreshRequest extends RpcAcsRequest<StartInstanceRefreshResponse> {
	   

	private String clientToken;

	private String scalingGroupId;

	private Integer minHealthyPercentage;

	private Boolean skipMatching;

	private DesiredConfiguration desiredConfiguration;

	private Integer maxHealthyPercentage;

	private String resourceOwnerAccount;

	private List<Checkpoints> checkpointss;

	private Long ownerId;

	private Integer checkpointPauseTime;
	public StartInstanceRefreshRequest() {
		super("Ess", "2014-08-28", "StartInstanceRefresh", "ess");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getScalingGroupId() {
		return this.scalingGroupId;
	}

	public void setScalingGroupId(String scalingGroupId) {
		this.scalingGroupId = scalingGroupId;
		if(scalingGroupId != null){
			putQueryParameter("ScalingGroupId", scalingGroupId);
		}
	}

	public Integer getMinHealthyPercentage() {
		return this.minHealthyPercentage;
	}

	public void setMinHealthyPercentage(Integer minHealthyPercentage) {
		this.minHealthyPercentage = minHealthyPercentage;
		if(minHealthyPercentage != null){
			putQueryParameter("MinHealthyPercentage", minHealthyPercentage.toString());
		}
	}

	public Boolean getSkipMatching() {
		return this.skipMatching;
	}

	public void setSkipMatching(Boolean skipMatching) {
		this.skipMatching = skipMatching;
		if(skipMatching != null){
			putQueryParameter("SkipMatching", skipMatching.toString());
		}
	}

	public DesiredConfiguration getDesiredConfiguration() {
		return this.desiredConfiguration;
	}

	public void setDesiredConfiguration(DesiredConfiguration desiredConfiguration) {
		this.desiredConfiguration = desiredConfiguration;	
		if (desiredConfiguration != null) {
			
				putQueryParameter("DesiredConfiguration.ScalingConfigurationId" , desiredConfiguration.getScalingConfigurationId());
				putQueryParameter("DesiredConfiguration.ImageId" , desiredConfiguration.getImageId());
				if (desiredConfiguration.getLaunchTemplateOverrides() != null) {
					for (int depth1 = 0; depth1 < desiredConfiguration.getLaunchTemplateOverrides().size(); depth1++) {
						if (desiredConfiguration.getLaunchTemplateOverrides().get(depth1) != null) {
							
								putQueryParameter("DesiredConfiguration.LaunchTemplateOverrides." + (depth1 + 1) + ".InstanceType" , desiredConfiguration.getLaunchTemplateOverrides().get(depth1).getInstanceType());
						}
					}
				}
				putQueryParameter("DesiredConfiguration.LaunchTemplateId" , desiredConfiguration.getLaunchTemplateId());
				if (desiredConfiguration.getContainers() != null) {
					for (int depth1 = 0; depth1 < desiredConfiguration.getContainers().size(); depth1++) {
						if (desiredConfiguration.getContainers().get(depth1) != null) {
							
								if (desiredConfiguration.getContainers().get(depth1).getArgs() != null) {
									for (int depth2 = 0; depth2 < desiredConfiguration.getContainers().get(depth1).getArgs().size(); depth2++) {
										putQueryParameter("DesiredConfiguration.Containers." + (depth1 + 1) + ".Args." + (depth2 + 1) , desiredConfiguration.getContainers().get(depth1).getArgs().get(depth2));
									}
								}
								putQueryParameter("DesiredConfiguration.Containers." + (depth1 + 1) + ".Image" , desiredConfiguration.getContainers().get(depth1).getImage());
								if (desiredConfiguration.getContainers().get(depth1).getEnvironmentVars() != null) {
									for (int depth2 = 0; depth2 < desiredConfiguration.getContainers().get(depth1).getEnvironmentVars().size(); depth2++) {
										if (desiredConfiguration.getContainers().get(depth1).getEnvironmentVars().get(depth2) != null) {
											
												putQueryParameter("DesiredConfiguration.Containers." + (depth1 + 1) + ".EnvironmentVars." + (depth2 + 1) + ".FieldRefFieldPath" , desiredConfiguration.getContainers().get(depth1).getEnvironmentVars().get(depth2).getFieldRefFieldPath());
												putQueryParameter("DesiredConfiguration.Containers." + (depth1 + 1) + ".EnvironmentVars." + (depth2 + 1) + ".Value" , desiredConfiguration.getContainers().get(depth1).getEnvironmentVars().get(depth2).getValue());
												putQueryParameter("DesiredConfiguration.Containers." + (depth1 + 1) + ".EnvironmentVars." + (depth2 + 1) + ".Key" , desiredConfiguration.getContainers().get(depth1).getEnvironmentVars().get(depth2).getKey());
										}
									}
								}
								putQueryParameter("DesiredConfiguration.Containers." + (depth1 + 1) + ".Name" , desiredConfiguration.getContainers().get(depth1).getName());
								if (desiredConfiguration.getContainers().get(depth1).getCommands() != null) {
									for (int depth2 = 0; depth2 < desiredConfiguration.getContainers().get(depth1).getCommands().size(); depth2++) {
										putQueryParameter("DesiredConfiguration.Containers." + (depth1 + 1) + ".Commands." + (depth2 + 1) , desiredConfiguration.getContainers().get(depth1).getCommands().get(depth2));
									}
								}
						}
					}
				}
				putQueryParameter("DesiredConfiguration.LaunchTemplateVersion" , desiredConfiguration.getLaunchTemplateVersion());
		}	
	}

	public Integer getMaxHealthyPercentage() {
		return this.maxHealthyPercentage;
	}

	public void setMaxHealthyPercentage(Integer maxHealthyPercentage) {
		this.maxHealthyPercentage = maxHealthyPercentage;
		if(maxHealthyPercentage != null){
			putQueryParameter("MaxHealthyPercentage", maxHealthyPercentage.toString());
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public List<Checkpoints> getCheckpointss() {
		return this.checkpointss;
	}

	public void setCheckpointss(List<Checkpoints> checkpointss) {
		this.checkpointss = checkpointss;	
		if (checkpointss != null) {
			for (int depth1 = 0; depth1 < checkpointss.size(); depth1++) {
				putQueryParameter("Checkpoints." + (depth1 + 1) + ".Percentage" , checkpointss.get(depth1).getPercentage());
			}
		}	
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public Integer getCheckpointPauseTime() {
		return this.checkpointPauseTime;
	}

	public void setCheckpointPauseTime(Integer checkpointPauseTime) {
		this.checkpointPauseTime = checkpointPauseTime;
		if(checkpointPauseTime != null){
			putQueryParameter("CheckpointPauseTime", checkpointPauseTime.toString());
		}
	}

	public static class DesiredConfiguration {

		private String scalingConfigurationId;

		private String imageId;

		private List<LaunchTemplateOverridesItem> launchTemplateOverrides;

		private String launchTemplateId;

		private List<ContainersItem> containers;

		private String launchTemplateVersion;

		public String getScalingConfigurationId() {
			return this.scalingConfigurationId;
		}

		public void setScalingConfigurationId(String scalingConfigurationId) {
			this.scalingConfigurationId = scalingConfigurationId;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public List<LaunchTemplateOverridesItem> getLaunchTemplateOverrides() {
			return this.launchTemplateOverrides;
		}

		public void setLaunchTemplateOverrides(List<LaunchTemplateOverridesItem> launchTemplateOverrides) {
			this.launchTemplateOverrides = launchTemplateOverrides;
		}

		public String getLaunchTemplateId() {
			return this.launchTemplateId;
		}

		public void setLaunchTemplateId(String launchTemplateId) {
			this.launchTemplateId = launchTemplateId;
		}

		public List<ContainersItem> getContainers() {
			return this.containers;
		}

		public void setContainers(List<ContainersItem> containers) {
			this.containers = containers;
		}

		public String getLaunchTemplateVersion() {
			return this.launchTemplateVersion;
		}

		public void setLaunchTemplateVersion(String launchTemplateVersion) {
			this.launchTemplateVersion = launchTemplateVersion;
		}

		public static class LaunchTemplateOverridesItem {

			private String instanceType;

			public String getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(String instanceType) {
				this.instanceType = instanceType;
			}
		}

		public static class ContainersItem {

			private List<String> args;

			private String image;

			private List<EnvironmentVarsItem> environmentVars;

			private String name;

			private List<String> commands;

			public List<String> getArgs() {
				return this.args;
			}

			public void setArgs(List<String> args) {
				this.args = args;
			}

			public String getImage() {
				return this.image;
			}

			public void setImage(String image) {
				this.image = image;
			}

			public List<EnvironmentVarsItem> getEnvironmentVars() {
				return this.environmentVars;
			}

			public void setEnvironmentVars(List<EnvironmentVarsItem> environmentVars) {
				this.environmentVars = environmentVars;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public List<String> getCommands() {
				return this.commands;
			}

			public void setCommands(List<String> commands) {
				this.commands = commands;
			}

			public static class EnvironmentVarsItem {

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

	public static class Checkpoints {

		private Integer percentage;

		public Integer getPercentage() {
			return this.percentage;
		}

		public void setPercentage(Integer percentage) {
			this.percentage = percentage;
		}
	}

	@Override
	public Class<StartInstanceRefreshResponse> getResponseClass() {
		return StartInstanceRefreshResponse.class;
	}

}
