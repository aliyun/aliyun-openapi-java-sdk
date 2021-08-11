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
public class DeleteHealthCheckTemplatesRequest extends RpcAcsRequest<DeleteHealthCheckTemplatesResponse> {
	   

	private String clientToken;

	private Boolean dryRun;

	private List<String> healthCheckTemplateIds;
	public DeleteHealthCheckTemplatesRequest() {
		super("Alb", "2020-06-16", "DeleteHealthCheckTemplates", "alb");
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

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
		}
	}

	public List<String> getHealthCheckTemplateIds() {
		return this.healthCheckTemplateIds;
	}

	public void setHealthCheckTemplateIds(List<String> healthCheckTemplateIds) {
		this.healthCheckTemplateIds = healthCheckTemplateIds;	
		if (healthCheckTemplateIds != null) {
			for (int depth1 = 0; depth1 < healthCheckTemplateIds.size(); depth1++) {
				putQueryParameter("HealthCheckTemplateIds." + (depth1 + 1) , healthCheckTemplateIds.get(depth1));
			}
		}	
	}

	@Override
	public Class<DeleteHealthCheckTemplatesResponse> getResponseClass() {
		return DeleteHealthCheckTemplatesResponse.class;
	}

}
