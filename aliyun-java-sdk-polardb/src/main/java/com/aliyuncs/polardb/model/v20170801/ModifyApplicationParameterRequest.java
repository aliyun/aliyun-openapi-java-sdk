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

package com.aliyuncs.polardb.model.v20170801;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.polardb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyApplicationParameterRequest extends RpcAcsRequest<ModifyApplicationParameterResponse> {
	   

	private String parameterName;

	private String applicationId;

	private String parameterValue;

	@SerializedName("parameters")
	private List<Parameters> parameters;
	public ModifyApplicationParameterRequest() {
		super("polardb", "2017-08-01", "ModifyApplicationParameter", "polardb");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getParameterName() {
		return this.parameterName;
	}

	public void setParameterName(String parameterName) {
		this.parameterName = parameterName;
		if(parameterName != null){
			putQueryParameter("ParameterName", parameterName);
		}
	}

	public String getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
		if(applicationId != null){
			putQueryParameter("ApplicationId", applicationId);
		}
	}

	public String getParameterValue() {
		return this.parameterValue;
	}

	public void setParameterValue(String parameterValue) {
		this.parameterValue = parameterValue;
		if(parameterValue != null){
			putQueryParameter("ParameterValue", parameterValue);
		}
	}

	public List<Parameters> getParameters() {
		return this.parameters;
	}

	public void setParameters(List<Parameters> parameters) {
		this.parameters = parameters;	
		if (parameters != null) {
			putQueryParameter("Parameters" , new Gson().toJson(parameters));
		}	
	}

	public static class Parameters {

		@SerializedName("ParameterValue")
		private String parameterValue;

		@SerializedName("ParameterName")
		private String parameterName;

		public String getParameterValue() {
			return this.parameterValue;
		}

		public void setParameterValue(String parameterValue) {
			this.parameterValue = parameterValue;
		}

		public String getParameterName() {
			return this.parameterName;
		}

		public void setParameterName(String parameterName) {
			this.parameterName = parameterName;
		}
	}

	@Override
	public Class<ModifyApplicationParameterResponse> getResponseClass() {
		return ModifyApplicationParameterResponse.class;
	}

}
