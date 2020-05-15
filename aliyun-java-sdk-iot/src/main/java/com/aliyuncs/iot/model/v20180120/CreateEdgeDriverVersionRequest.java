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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateEdgeDriverVersionRequest extends RpcAcsRequest<CreateEdgeDriverVersionResponse> {
	   

	private String configCheckRule;

	private String edgeVersion;

	private String description;

	private String driverId;

	private String iotInstanceId;

	private String containerConfig;

	private String driverVersion;

	private String driverConfig;

	private String sourceConfig;
	public CreateEdgeDriverVersionRequest() {
		super("Iot", "2018-01-20", "CreateEdgeDriverVersion", "Iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getConfigCheckRule() {
		return this.configCheckRule;
	}

	public void setConfigCheckRule(String configCheckRule) {
		this.configCheckRule = configCheckRule;
		if(configCheckRule != null){
			putQueryParameter("ConfigCheckRule", configCheckRule);
		}
	}

	public String getEdgeVersion() {
		return this.edgeVersion;
	}

	public void setEdgeVersion(String edgeVersion) {
		this.edgeVersion = edgeVersion;
		if(edgeVersion != null){
			putQueryParameter("EdgeVersion", edgeVersion);
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

	public String getDriverId() {
		return this.driverId;
	}

	public void setDriverId(String driverId) {
		this.driverId = driverId;
		if(driverId != null){
			putQueryParameter("DriverId", driverId);
		}
	}

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putQueryParameter("IotInstanceId", iotInstanceId);
		}
	}

	public String getContainerConfig() {
		return this.containerConfig;
	}

	public void setContainerConfig(String containerConfig) {
		this.containerConfig = containerConfig;
		if(containerConfig != null){
			putQueryParameter("ContainerConfig", containerConfig);
		}
	}

	public String getDriverVersion() {
		return this.driverVersion;
	}

	public void setDriverVersion(String driverVersion) {
		this.driverVersion = driverVersion;
		if(driverVersion != null){
			putQueryParameter("DriverVersion", driverVersion);
		}
	}

	public String getDriverConfig() {
		return this.driverConfig;
	}

	public void setDriverConfig(String driverConfig) {
		this.driverConfig = driverConfig;
		if(driverConfig != null){
			putQueryParameter("DriverConfig", driverConfig);
		}
	}

	public String getSourceConfig() {
		return this.sourceConfig;
	}

	public void setSourceConfig(String sourceConfig) {
		this.sourceConfig = sourceConfig;
		if(sourceConfig != null){
			putQueryParameter("SourceConfig", sourceConfig);
		}
	}

	@Override
	public Class<CreateEdgeDriverVersionResponse> getResponseClass() {
		return CreateEdgeDriverVersionResponse.class;
	}

}
