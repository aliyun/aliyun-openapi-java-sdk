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

package com.aliyuncs.elasticsearch.model.v20170613;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.elasticsearch.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateApmRequest extends RoaAcsRequest<UpdateApmResponse> {
	   

	private String outputES;

	private String outputESPassword;

	private String instanceId;

	private String yml;

	private String outputESUserName;

	private String token;
	public UpdateApmRequest() {
		super("elasticsearch", "2017-06-13", "UpdateApm", "elasticsearch");
		setUriPattern("/openapi/apm/[instanceId]");
		setMethod(MethodType.PUT);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOutputES() {
		return this.outputES;
	}

	public void setOutputES(String outputES) {
		this.outputES = outputES;
		if(outputES != null){
			putQueryParameter("outputES", outputES);
		}
	}

	public String getOutputESPassword() {
		return this.outputESPassword;
	}

	public void setOutputESPassword(String outputESPassword) {
		this.outputESPassword = outputESPassword;
		if(outputESPassword != null){
			putQueryParameter("outputESPassword", outputESPassword);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putPathParameter("instanceId", instanceId);
		}
	}

	public String getYml() {
		return this.yml;
	}

	public void setYml(String yml) {
		this.yml = yml;
		if(yml != null){
			putQueryParameter("yml", yml);
		}
	}

	public String getOutputESUserName() {
		return this.outputESUserName;
	}

	public void setOutputESUserName(String outputESUserName) {
		this.outputESUserName = outputESUserName;
		if(outputESUserName != null){
			putQueryParameter("outputESUserName", outputESUserName);
		}
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putQueryParameter("token", token);
		}
	}

	@Override
	public Class<UpdateApmResponse> getResponseClass() {
		return UpdateApmResponse.class;
	}

}
