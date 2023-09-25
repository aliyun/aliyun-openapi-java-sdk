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

package com.aliyuncs.dataworks_public.model.v20200518;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateDIAlarmRuleRequest extends RpcAcsRequest<CreateDIAlarmRuleResponse> {
	   

	private String metricType;

	private String triggerConditions;

	private String description;

	private String notificationSettings;

	private Boolean enabled;

	private Long dIJobId;
	public CreateDIAlarmRuleRequest() {
		super("dataworks-public", "2020-05-18", "CreateDIAlarmRule");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMetricType() {
		return this.metricType;
	}

	public void setMetricType(String metricType) {
		this.metricType = metricType;
		if(metricType != null){
			putBodyParameter("MetricType", metricType);
		}
	}

	public String getTriggerConditions() {
		return this.triggerConditions;
	}

	public void setTriggerConditions(String triggerConditions) {
		this.triggerConditions = triggerConditions;
		if(triggerConditions != null){
			putBodyParameter("TriggerConditions", triggerConditions);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public String getNotificationSettings() {
		return this.notificationSettings;
	}

	public void setNotificationSettings(String notificationSettings) {
		this.notificationSettings = notificationSettings;
		if(notificationSettings != null){
			putBodyParameter("NotificationSettings", notificationSettings);
		}
	}

	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		if(enabled != null){
			putBodyParameter("Enabled", enabled.toString());
		}
	}

	public Long getDIJobId() {
		return this.dIJobId;
	}

	public void setDIJobId(Long dIJobId) {
		this.dIJobId = dIJobId;
		if(dIJobId != null){
			putBodyParameter("DIJobId", dIJobId.toString());
		}
	}

	@Override
	public Class<CreateDIAlarmRuleResponse> getResponseClass() {
		return CreateDIAlarmRuleResponse.class;
	}

}
