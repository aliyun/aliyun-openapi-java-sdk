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

package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyPlanMaintenanceWindowRequest extends RpcAcsRequest<ModifyPlanMaintenanceWindowResponse> {
	   

	private String planWindowId;

	private Integer minMaintenanceInterval;

	private Boolean enable;

	private String planWindowName;

	@SerializedName("targetResource")
	private TargetResource targetResource;

	private String supportMaintenanceAction;

	@SerializedName("timePeriod")
	private TimePeriod timePeriod;
	public ModifyPlanMaintenanceWindowRequest() {
		super("Ecs", "2014-05-26", "ModifyPlanMaintenanceWindow", "ecs");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPlanWindowId() {
		return this.planWindowId;
	}

	public void setPlanWindowId(String planWindowId) {
		this.planWindowId = planWindowId;
		if(planWindowId != null){
			putQueryParameter("PlanWindowId", planWindowId);
		}
	}

	public Integer getMinMaintenanceInterval() {
		return this.minMaintenanceInterval;
	}

	public void setMinMaintenanceInterval(Integer minMaintenanceInterval) {
		this.minMaintenanceInterval = minMaintenanceInterval;
		if(minMaintenanceInterval != null){
			putQueryParameter("MinMaintenanceInterval", minMaintenanceInterval.toString());
		}
	}

	public Boolean getEnable() {
		return this.enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
		if(enable != null){
			putQueryParameter("Enable", enable.toString());
		}
	}

	public String getPlanWindowName() {
		return this.planWindowName;
	}

	public void setPlanWindowName(String planWindowName) {
		this.planWindowName = planWindowName;
		if(planWindowName != null){
			putQueryParameter("PlanWindowName", planWindowName);
		}
	}

	public TargetResource getTargetResource() {
		return this.targetResource;
	}

	public void setTargetResource(TargetResource targetResource) {
		this.targetResource = targetResource;	
		if (targetResource != null) {
			putQueryParameter("TargetResource" , new Gson().toJson(targetResource));
		}	
	}

	public String getSupportMaintenanceAction() {
		return this.supportMaintenanceAction;
	}

	public void setSupportMaintenanceAction(String supportMaintenanceAction) {
		this.supportMaintenanceAction = supportMaintenanceAction;
		if(supportMaintenanceAction != null){
			putQueryParameter("SupportMaintenanceAction", supportMaintenanceAction);
		}
	}

	public TimePeriod getTimePeriod() {
		return this.timePeriod;
	}

	public void setTimePeriod(TimePeriod timePeriod) {
		this.timePeriod = timePeriod;	
		if (timePeriod != null) {
			putQueryParameter("TimePeriod" , new Gson().toJson(timePeriod));
		}	
	}

	public static class TargetResource {

		@SerializedName("Scope")
		private String scope;

		@SerializedName("ResourceGroupId")
		private String resourceGroupId;

		@SerializedName("Tags")
		private List<TagsItem> tags;

		public String getScope() {
			return this.scope;
		}

		public void setScope(String scope) {
			this.scope = scope;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public List<TagsItem> getTags() {
			return this.tags;
		}

		public void setTags(List<TagsItem> tags) {
			this.tags = tags;
		}

		public static class TagsItem {

			@SerializedName("Key")
			private String key;

			@SerializedName("Value")
			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	public static class TimePeriod {

		@SerializedName("PeriodUnit")
		private String periodUnit;

		@SerializedName("RangeList")
		private List<RangeListItem> rangeList;

		public String getPeriodUnit() {
			return this.periodUnit;
		}

		public void setPeriodUnit(String periodUnit) {
			this.periodUnit = periodUnit;
		}

		public List<RangeListItem> getRangeList() {
			return this.rangeList;
		}

		public void setRangeList(List<RangeListItem> rangeList) {
			this.rangeList = rangeList;
		}

		public static class RangeListItem {

			@SerializedName("StartTime")
			private String startTime;

			@SerializedName("EndTime")
			private String endTime;

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}
		}
	}

	@Override
	public Class<ModifyPlanMaintenanceWindowResponse> getResponseClass() {
		return ModifyPlanMaintenanceWindowResponse.class;
	}

}
