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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RollbackLinkedeploycoreDeploycoreAppserviceRequest extends RpcAcsRequest<RollbackLinkedeploycoreDeploycoreAppserviceResponse> {
	   

	private String operator;

	private Long appServiceId;

	private String fromApp;

	private Long configId;
	public RollbackLinkedeploycoreDeploycoreAppserviceRequest() {
		super("SOFA", "2019-08-15", "RollbackLinkedeploycoreDeploycoreAppservice", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putBodyParameter("Operator", operator);
		}
	}

	public Long getAppServiceId() {
		return this.appServiceId;
	}

	public void setAppServiceId(Long appServiceId) {
		this.appServiceId = appServiceId;
		if(appServiceId != null){
			putBodyParameter("AppServiceId", appServiceId.toString());
		}
	}

	public String getFromApp() {
		return this.fromApp;
	}

	public void setFromApp(String fromApp) {
		this.fromApp = fromApp;
		if(fromApp != null){
			putBodyParameter("FromApp", fromApp);
		}
	}

	public Long getConfigId() {
		return this.configId;
	}

	public void setConfigId(Long configId) {
		this.configId = configId;
		if(configId != null){
			putBodyParameter("ConfigId", configId.toString());
		}
	}

	@Override
	public Class<RollbackLinkedeploycoreDeploycoreAppserviceResponse> getResponseClass() {
		return RollbackLinkedeploycoreDeploycoreAppserviceResponse.class;
	}

}
