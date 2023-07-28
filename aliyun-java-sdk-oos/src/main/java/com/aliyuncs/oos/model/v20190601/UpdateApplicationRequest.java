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

package com.aliyuncs.oos.model.v20190601;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.oos.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateApplicationRequest extends RpcAcsRequest<UpdateApplicationResponse> {
	   

	private String description;

	@SerializedName("alarmConfig")
	private AlarmConfig alarmConfig;

	private Boolean deleteAlarmRulesBeforeUpdate;

	@SerializedName("tags")
	private Map<String,String> tags;

	private String name;
	public UpdateApplicationRequest() {
		super("oos", "2019-06-01", "UpdateApplication", "oos");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public AlarmConfig getAlarmConfig() {
		return this.alarmConfig;
	}

	public void setAlarmConfig(AlarmConfig alarmConfig) {
		this.alarmConfig = alarmConfig;	
		if (alarmConfig != null) {
			putQueryParameter("AlarmConfig" , new Gson().toJson(alarmConfig));
		}	
	}

	public Boolean getDeleteAlarmRulesBeforeUpdate() {
		return this.deleteAlarmRulesBeforeUpdate;
	}

	public void setDeleteAlarmRulesBeforeUpdate(Boolean deleteAlarmRulesBeforeUpdate) {
		this.deleteAlarmRulesBeforeUpdate = deleteAlarmRulesBeforeUpdate;
		if(deleteAlarmRulesBeforeUpdate != null){
			putQueryParameter("DeleteAlarmRulesBeforeUpdate", deleteAlarmRulesBeforeUpdate.toString());
		}
	}

	public Map<String,String> getTags() {
		return this.tags;
	}

	public void setTags(Map<String,String> tags) {
		this.tags = tags;	
		if (tags != null) {
			putQueryParameter("Tags" , new Gson().toJson(tags));
		}	
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public static class AlarmConfig {

		@SerializedName("TemplateIds")
		private List<String> templateIds;

		@SerializedName("ContactGroups")
		private List<String> contactGroups;

		@SerializedName("HealthCheckUrl")
		private String healthCheckUrl;

		public List<String> getTemplateIds() {
			return this.templateIds;
		}

		public void setTemplateIds(List<String> templateIds) {
			this.templateIds = templateIds;
		}

		public List<String> getContactGroups() {
			return this.contactGroups;
		}

		public void setContactGroups(List<String> contactGroups) {
			this.contactGroups = contactGroups;
		}

		public String getHealthCheckUrl() {
			return this.healthCheckUrl;
		}

		public void setHealthCheckUrl(String healthCheckUrl) {
			this.healthCheckUrl = healthCheckUrl;
		}
	}

	@Override
	public Class<UpdateApplicationResponse> getResponseClass() {
		return UpdateApplicationResponse.class;
	}

}
