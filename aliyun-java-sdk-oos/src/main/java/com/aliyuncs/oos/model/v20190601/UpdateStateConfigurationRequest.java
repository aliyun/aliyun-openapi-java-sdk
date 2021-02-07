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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.oos.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateStateConfigurationRequest extends RpcAcsRequest<UpdateStateConfigurationResponse> {
	   

	private String scheduleType;

	private String clientToken;

	private String description;

	private String targets;

	private String scheduleExpression;

	private String configureMode;

	private String tags;

	private String parameters;

	private String stateConfigurationId;
	public UpdateStateConfigurationRequest() {
		super("oos", "2019-06-01", "UpdateStateConfiguration", "oos");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getScheduleType() {
		return this.scheduleType;
	}

	public void setScheduleType(String scheduleType) {
		this.scheduleType = scheduleType;
		if(scheduleType != null){
			putQueryParameter("ScheduleType", scheduleType);
		}
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getTargets() {
		return this.targets;
	}

	public void setTargets(String targets) {
		this.targets = targets;
		if(targets != null){
			putQueryParameter("Targets", targets);
		}
	}

	public String getScheduleExpression() {
		return this.scheduleExpression;
	}

	public void setScheduleExpression(String scheduleExpression) {
		this.scheduleExpression = scheduleExpression;
		if(scheduleExpression != null){
			putQueryParameter("ScheduleExpression", scheduleExpression);
		}
	}

	public String getConfigureMode() {
		return this.configureMode;
	}

	public void setConfigureMode(String configureMode) {
		this.configureMode = configureMode;
		if(configureMode != null){
			putQueryParameter("ConfigureMode", configureMode);
		}
	}

	public String getTags() {
		return this.tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
		if(tags != null){
			putQueryParameter("Tags", tags);
		}
	}

	public String getParameters() {
		return this.parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
		if(parameters != null){
			putQueryParameter("Parameters", parameters);
		}
	}

	public String getStateConfigurationId() {
		return this.stateConfigurationId;
	}

	public void setStateConfigurationId(String stateConfigurationId) {
		this.stateConfigurationId = stateConfigurationId;
		if(stateConfigurationId != null){
			putQueryParameter("StateConfigurationId", stateConfigurationId);
		}
	}

	@Override
	public Class<UpdateStateConfigurationResponse> getResponseClass() {
		return UpdateStateConfigurationResponse.class;
	}

}
