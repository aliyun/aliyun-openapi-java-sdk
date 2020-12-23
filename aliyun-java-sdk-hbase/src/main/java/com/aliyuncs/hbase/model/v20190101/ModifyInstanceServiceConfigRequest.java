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

package com.aliyuncs.hbase.model.v20190101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hbase.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyInstanceServiceConfigRequest extends RpcAcsRequest<ModifyInstanceServiceConfigResponse> {
	   

	private String configureName;

	private Boolean restart;

	private String clusterId;

	private String configureValue;

	private String parameters;
	public ModifyInstanceServiceConfigRequest() {
		super("HBase", "2019-01-01", "ModifyInstanceServiceConfig", "hbase");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getConfigureName() {
		return this.configureName;
	}

	public void setConfigureName(String configureName) {
		this.configureName = configureName;
		if(configureName != null){
			putQueryParameter("ConfigureName", configureName);
		}
	}

	public Boolean getRestart() {
		return this.restart;
	}

	public void setRestart(Boolean restart) {
		this.restart = restart;
		if(restart != null){
			putQueryParameter("Restart", restart.toString());
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getConfigureValue() {
		return this.configureValue;
	}

	public void setConfigureValue(String configureValue) {
		this.configureValue = configureValue;
		if(configureValue != null){
			putQueryParameter("ConfigureValue", configureValue);
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

	@Override
	public Class<ModifyInstanceServiceConfigResponse> getResponseClass() {
		return ModifyInstanceServiceConfigResponse.class;
	}

}
