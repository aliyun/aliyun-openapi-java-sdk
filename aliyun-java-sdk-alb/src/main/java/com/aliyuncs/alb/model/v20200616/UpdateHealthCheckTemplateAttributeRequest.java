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

package com.aliyuncs.alb.model.v20200616;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.alb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateHealthCheckTemplateAttributeRequest extends RpcAcsRequest<UpdateHealthCheckTemplateAttributeResponse> {
	   

	private Integer healthCheckTimeout;

	private String clientToken;

	private String healthCheckProtocol;

	private Integer unhealthyThreshold;

	private Integer healthyThreshold;

	private String healthCheckPath;

	private List<String> healthCheckCodes;

	private Boolean dryRun;

	private String healthCheckMethod;

	private String healthCheckHost;

	private Integer healthCheckInterval;

	private String healthCheckTemplateName;

	private String healthCheckTemplateId;

	private String healthCheckHttpVersion;

	private Integer healthCheckConnectPort;
	public UpdateHealthCheckTemplateAttributeRequest() {
		super("Alb", "2020-06-16", "UpdateHealthCheckTemplateAttribute", "alb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getHealthCheckTimeout() {
		return this.healthCheckTimeout;
	}

	public void setHealthCheckTimeout(Integer healthCheckTimeout) {
		this.healthCheckTimeout = healthCheckTimeout;
		if(healthCheckTimeout != null){
			putQueryParameter("HealthCheckTimeout", healthCheckTimeout.toString());
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

	public String getHealthCheckProtocol() {
		return this.healthCheckProtocol;
	}

	public void setHealthCheckProtocol(String healthCheckProtocol) {
		this.healthCheckProtocol = healthCheckProtocol;
		if(healthCheckProtocol != null){
			putQueryParameter("HealthCheckProtocol", healthCheckProtocol);
		}
	}

	public Integer getUnhealthyThreshold() {
		return this.unhealthyThreshold;
	}

	public void setUnhealthyThreshold(Integer unhealthyThreshold) {
		this.unhealthyThreshold = unhealthyThreshold;
		if(unhealthyThreshold != null){
			putQueryParameter("UnhealthyThreshold", unhealthyThreshold.toString());
		}
	}

	public Integer getHealthyThreshold() {
		return this.healthyThreshold;
	}

	public void setHealthyThreshold(Integer healthyThreshold) {
		this.healthyThreshold = healthyThreshold;
		if(healthyThreshold != null){
			putQueryParameter("HealthyThreshold", healthyThreshold.toString());
		}
	}

	public String getHealthCheckPath() {
		return this.healthCheckPath;
	}

	public void setHealthCheckPath(String healthCheckPath) {
		this.healthCheckPath = healthCheckPath;
		if(healthCheckPath != null){
			putQueryParameter("HealthCheckPath", healthCheckPath);
		}
	}

	public List<String> getHealthCheckCodes() {
		return this.healthCheckCodes;
	}

	public void setHealthCheckCodes(List<String> healthCheckCodes) {
		this.healthCheckCodes = healthCheckCodes;	
		if (healthCheckCodes != null) {
			for (int depth1 = 0; depth1 < healthCheckCodes.size(); depth1++) {
				putQueryParameter("HealthCheckCodes." + (depth1 + 1) , healthCheckCodes.get(depth1));
			}
		}	
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
		}
	}

	public String getHealthCheckMethod() {
		return this.healthCheckMethod;
	}

	public void setHealthCheckMethod(String healthCheckMethod) {
		this.healthCheckMethod = healthCheckMethod;
		if(healthCheckMethod != null){
			putQueryParameter("HealthCheckMethod", healthCheckMethod);
		}
	}

	public String getHealthCheckHost() {
		return this.healthCheckHost;
	}

	public void setHealthCheckHost(String healthCheckHost) {
		this.healthCheckHost = healthCheckHost;
		if(healthCheckHost != null){
			putQueryParameter("HealthCheckHost", healthCheckHost);
		}
	}

	public Integer getHealthCheckInterval() {
		return this.healthCheckInterval;
	}

	public void setHealthCheckInterval(Integer healthCheckInterval) {
		this.healthCheckInterval = healthCheckInterval;
		if(healthCheckInterval != null){
			putQueryParameter("HealthCheckInterval", healthCheckInterval.toString());
		}
	}

	public String getHealthCheckTemplateName() {
		return this.healthCheckTemplateName;
	}

	public void setHealthCheckTemplateName(String healthCheckTemplateName) {
		this.healthCheckTemplateName = healthCheckTemplateName;
		if(healthCheckTemplateName != null){
			putQueryParameter("HealthCheckTemplateName", healthCheckTemplateName);
		}
	}

	public String getHealthCheckTemplateId() {
		return this.healthCheckTemplateId;
	}

	public void setHealthCheckTemplateId(String healthCheckTemplateId) {
		this.healthCheckTemplateId = healthCheckTemplateId;
		if(healthCheckTemplateId != null){
			putQueryParameter("HealthCheckTemplateId", healthCheckTemplateId);
		}
	}

	public String getHealthCheckHttpVersion() {
		return this.healthCheckHttpVersion;
	}

	public void setHealthCheckHttpVersion(String healthCheckHttpVersion) {
		this.healthCheckHttpVersion = healthCheckHttpVersion;
		if(healthCheckHttpVersion != null){
			putQueryParameter("HealthCheckHttpVersion", healthCheckHttpVersion);
		}
	}

	public Integer getHealthCheckConnectPort() {
		return this.healthCheckConnectPort;
	}

	public void setHealthCheckConnectPort(Integer healthCheckConnectPort) {
		this.healthCheckConnectPort = healthCheckConnectPort;
		if(healthCheckConnectPort != null){
			putQueryParameter("HealthCheckConnectPort", healthCheckConnectPort.toString());
		}
	}

	@Override
	public Class<UpdateHealthCheckTemplateAttributeResponse> getResponseClass() {
		return UpdateHealthCheckTemplateAttributeResponse.class;
	}

}
