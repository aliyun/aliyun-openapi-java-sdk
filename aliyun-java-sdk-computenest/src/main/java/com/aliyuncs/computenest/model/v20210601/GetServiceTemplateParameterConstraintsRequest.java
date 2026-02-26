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

package com.aliyuncs.computenest.model.v20210601;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.computenest.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetServiceTemplateParameterConstraintsRequest extends RpcAcsRequest<GetServiceTemplateParameterConstraintsResponse> {
	   

	private String clientToken;

	private Boolean enablePrivateVpcConnection;

	private String templateName;

	private String serviceInstanceId;

	private String deployRegionId;

	private String specificationName;

	private String trialType;

	private String serviceVersion;

	private String serviceId;

	private List<Parameters> parameterss;
	public GetServiceTemplateParameterConstraintsRequest() {
		super("ComputeNest", "2021-06-01", "GetServiceTemplateParameterConstraints", "computenest");
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

	public Boolean getEnablePrivateVpcConnection() {
		return this.enablePrivateVpcConnection;
	}

	public void setEnablePrivateVpcConnection(Boolean enablePrivateVpcConnection) {
		this.enablePrivateVpcConnection = enablePrivateVpcConnection;
		if(enablePrivateVpcConnection != null){
			putQueryParameter("EnablePrivateVpcConnection", enablePrivateVpcConnection.toString());
		}
	}

	public String getTemplateName() {
		return this.templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
		if(templateName != null){
			putQueryParameter("TemplateName", templateName);
		}
	}

	public String getServiceInstanceId() {
		return this.serviceInstanceId;
	}

	public void setServiceInstanceId(String serviceInstanceId) {
		this.serviceInstanceId = serviceInstanceId;
		if(serviceInstanceId != null){
			putQueryParameter("ServiceInstanceId", serviceInstanceId);
		}
	}

	public String getDeployRegionId() {
		return this.deployRegionId;
	}

	public void setDeployRegionId(String deployRegionId) {
		this.deployRegionId = deployRegionId;
		if(deployRegionId != null){
			putQueryParameter("DeployRegionId", deployRegionId);
		}
	}

	public String getSpecificationName() {
		return this.specificationName;
	}

	public void setSpecificationName(String specificationName) {
		this.specificationName = specificationName;
		if(specificationName != null){
			putQueryParameter("SpecificationName", specificationName);
		}
	}

	public String getTrialType() {
		return this.trialType;
	}

	public void setTrialType(String trialType) {
		this.trialType = trialType;
		if(trialType != null){
			putQueryParameter("TrialType", trialType);
		}
	}

	public String getServiceVersion() {
		return this.serviceVersion;
	}

	public void setServiceVersion(String serviceVersion) {
		this.serviceVersion = serviceVersion;
		if(serviceVersion != null){
			putQueryParameter("ServiceVersion", serviceVersion);
		}
	}

	public String getServiceId() {
		return this.serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
		if(serviceId != null){
			putQueryParameter("ServiceId", serviceId);
		}
	}

	public List<Parameters> getParameterss() {
		return this.parameterss;
	}

	public void setParameterss(List<Parameters> parameterss) {
		this.parameterss = parameterss;	
		if (parameterss != null) {
			for (int depth1 = 0; depth1 < parameterss.size(); depth1++) {
				putQueryParameter("Parameters." + (depth1 + 1) + ".ParameterValue" , parameterss.get(depth1).getParameterValue());
				putQueryParameter("Parameters." + (depth1 + 1) + ".ParameterKey" , parameterss.get(depth1).getParameterKey());
			}
		}	
	}

	public static class Parameters {

		private String parameterValue;

		private String parameterKey;

		public String getParameterValue() {
			return this.parameterValue;
		}

		public void setParameterValue(String parameterValue) {
			this.parameterValue = parameterValue;
		}

		public String getParameterKey() {
			return this.parameterKey;
		}

		public void setParameterKey(String parameterKey) {
			this.parameterKey = parameterKey;
		}
	}

	@Override
	public Class<GetServiceTemplateParameterConstraintsResponse> getResponseClass() {
		return GetServiceTemplateParameterConstraintsResponse.class;
	}

}
