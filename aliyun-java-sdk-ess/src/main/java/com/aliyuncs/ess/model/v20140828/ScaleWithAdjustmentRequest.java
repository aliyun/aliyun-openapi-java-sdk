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
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ess.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ScaleWithAdjustmentRequest extends RpcAcsRequest<ScaleWithAdjustmentResponse> {
	   

	private String clientToken;

	private String scalingGroupId;

	@SerializedName("lifecycleHookContext")
	private LifecycleHookContext lifecycleHookContext;

	private Boolean syncActivity;

	private Integer adjustmentValue;

	private String resourceOwnerAccount;

	private String activityMetadata;

	private String adjustmentType;

	@SerializedName("overrides")
	private Overrides overrides;

	private Long ownerId;

	private Integer minAdjustmentMagnitude;
	public ScaleWithAdjustmentRequest() {
		super("Ess", "2014-08-28", "ScaleWithAdjustment", "ess");
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

	public LifecycleHookContext getLifecycleHookContext() {
		return this.lifecycleHookContext;
	}

	public void setLifecycleHookContext(LifecycleHookContext lifecycleHookContext) {
		this.lifecycleHookContext = lifecycleHookContext;	
		if (lifecycleHookContext != null) {
			putQueryParameter("LifecycleHookContext" , new Gson().toJson(lifecycleHookContext));
		}	
	}

	public Boolean getSyncActivity() {
		return this.syncActivity;
	}

	public void setSyncActivity(Boolean syncActivity) {
		this.syncActivity = syncActivity;
		if(syncActivity != null){
			putQueryParameter("SyncActivity", syncActivity.toString());
		}
	}

	public Integer getAdjustmentValue() {
		return this.adjustmentValue;
	}

	public void setAdjustmentValue(Integer adjustmentValue) {
		this.adjustmentValue = adjustmentValue;
		if(adjustmentValue != null){
			putQueryParameter("AdjustmentValue", adjustmentValue.toString());
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

	public String getActivityMetadata() {
		return this.activityMetadata;
	}

	public void setActivityMetadata(String activityMetadata) {
		this.activityMetadata = activityMetadata;
		if(activityMetadata != null){
			putQueryParameter("ActivityMetadata", activityMetadata);
		}
	}

	public String getAdjustmentType() {
		return this.adjustmentType;
	}

	public void setAdjustmentType(String adjustmentType) {
		this.adjustmentType = adjustmentType;
		if(adjustmentType != null){
			putQueryParameter("AdjustmentType", adjustmentType);
		}
	}

	public Overrides getOverrides() {
		return this.overrides;
	}

	public void setOverrides(Overrides overrides) {
		this.overrides = overrides;	
		if (overrides != null) {
			putQueryParameter("Overrides" , new Gson().toJson(overrides));
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

	public Integer getMinAdjustmentMagnitude() {
		return this.minAdjustmentMagnitude;
	}

	public void setMinAdjustmentMagnitude(Integer minAdjustmentMagnitude) {
		this.minAdjustmentMagnitude = minAdjustmentMagnitude;
		if(minAdjustmentMagnitude != null){
			putQueryParameter("MinAdjustmentMagnitude", minAdjustmentMagnitude.toString());
		}
	}

	public static class LifecycleHookContext {

		@SerializedName("DisableLifecycleHook")
		private Boolean disableLifecycleHook;

		@SerializedName("IgnoredLifecycleHookIds")
		private List<String> ignoredLifecycleHookIds;

		public Boolean getDisableLifecycleHook() {
			return this.disableLifecycleHook;
		}

		public void setDisableLifecycleHook(Boolean disableLifecycleHook) {
			this.disableLifecycleHook = disableLifecycleHook;
		}

		public List<String> getIgnoredLifecycleHookIds() {
			return this.ignoredLifecycleHookIds;
		}

		public void setIgnoredLifecycleHookIds(List<String> ignoredLifecycleHookIds) {
			this.ignoredLifecycleHookIds = ignoredLifecycleHookIds;
		}
	}

	public static class Overrides {

		@SerializedName("Memory")
		private Float memory;

		@SerializedName("ContainerOverride")
		private List<ContainerOverrideItem> containerOverride;

		@SerializedName("Cpu")
		private Float cpu;

		public Float getMemory() {
			return this.memory;
		}

		public void setMemory(Float memory) {
			this.memory = memory;
		}

		public List<ContainerOverrideItem> getContainerOverride() {
			return this.containerOverride;
		}

		public void setContainerOverride(List<ContainerOverrideItem> containerOverride) {
			this.containerOverride = containerOverride;
		}

		public Float getCpu() {
			return this.cpu;
		}

		public void setCpu(Float cpu) {
			this.cpu = cpu;
		}

		public static class ContainerOverrideItem {

			@SerializedName("Memory")
			private Float memory;

			@SerializedName("Arg")
			private List<String> arg;

			@SerializedName("EnvironmentVar")
			private List<EnvironmentVarItem> environmentVar;

			@SerializedName("Name")
			private String name;

			@SerializedName("Cpu")
			private Float cpu;

			@SerializedName("Command")
			private List<String> command;

			public Float getMemory() {
				return this.memory;
			}

			public void setMemory(Float memory) {
				this.memory = memory;
			}

			public List<String> getArg() {
				return this.arg;
			}

			public void setArg(List<String> arg) {
				this.arg = arg;
			}

			public List<EnvironmentVarItem> getEnvironmentVar() {
				return this.environmentVar;
			}

			public void setEnvironmentVar(List<EnvironmentVarItem> environmentVar) {
				this.environmentVar = environmentVar;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Float getCpu() {
				return this.cpu;
			}

			public void setCpu(Float cpu) {
				this.cpu = cpu;
			}

			public List<String> getCommand() {
				return this.command;
			}

			public void setCommand(List<String> command) {
				this.command = command;
			}

			public static class EnvironmentVarItem {

				@SerializedName("Value")
				private String value;

				@SerializedName("Key")
				private String key;

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

	@Override
	public Class<ScaleWithAdjustmentResponse> getResponseClass() {
		return ScaleWithAdjustmentResponse.class;
	}

}
