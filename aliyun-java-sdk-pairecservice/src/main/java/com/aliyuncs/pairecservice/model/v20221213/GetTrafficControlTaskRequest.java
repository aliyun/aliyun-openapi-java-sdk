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

package com.aliyuncs.pairecservice.model.v20221213;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetTrafficControlTaskRequest extends RoaAcsRequest<GetTrafficControlTaskResponse> {
	   

	private String trafficControlTaskId;

	private String version;

	private String controlTargetFilter;

	private String environment;

	private String instanceId;
	public GetTrafficControlTaskRequest() {
		super("PaiRecService", "2022-12-13", "GetTrafficControlTask");
		setUriPattern("/api/v1/trafficcontroltasks/[TrafficControlTaskId]");
		setMethod(MethodType.GET);
	}

	public String getTrafficControlTaskId() {
		return this.trafficControlTaskId;
	}

	public void setTrafficControlTaskId(String trafficControlTaskId) {
		this.trafficControlTaskId = trafficControlTaskId;
		if(trafficControlTaskId != null){
			putPathParameter("TrafficControlTaskId", trafficControlTaskId);
		}
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
		if(version != null){
			putQueryParameter("Version", version);
		}
	}

	public String getControlTargetFilter() {
		return this.controlTargetFilter;
	}

	public void setControlTargetFilter(String controlTargetFilter) {
		this.controlTargetFilter = controlTargetFilter;
		if(controlTargetFilter != null){
			putQueryParameter("ControlTargetFilter", controlTargetFilter);
		}
	}

	public String getEnvironment() {
		return this.environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
		if(environment != null){
			putQueryParameter("Environment", environment);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	@Override
	public Class<GetTrafficControlTaskResponse> getResponseClass() {
		return GetTrafficControlTaskResponse.class;
	}

}
