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

package com.aliyuncs.edas.model.v20170801;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.edas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetSpringCloudTestMethodRequest extends RoaAcsRequest<GetSpringCloudTestMethodResponse> {
	   

	private String appId;

	private String namespace;

	private String httpMethod;

	private String methodSignature;

	private String serviceName;

	private String region;

	private String requiredPath;

	private String methodController;
	public GetSpringCloudTestMethodRequest() {
		super("Edas", "2017-08-01", "GetSpringCloudTestMethod", "Edas");
		setUriPattern("/pop/sp/api/mse/test/springcloud/method");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("appId", appId);
		}
	}

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putQueryParameter("namespace", namespace);
		}
	}

	public String getHttpMethod() {
		return this.httpMethod;
	}

	public void setHttpMethod(String httpMethod) {
		this.httpMethod = httpMethod;
		if(httpMethod != null){
			putQueryParameter("httpMethod", httpMethod);
		}
	}

	public String getMethodSignature() {
		return this.methodSignature;
	}

	public void setMethodSignature(String methodSignature) {
		this.methodSignature = methodSignature;
		if(methodSignature != null){
			putQueryParameter("methodSignature", methodSignature);
		}
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
		if(serviceName != null){
			putQueryParameter("serviceName", serviceName);
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("region", region);
		}
	}

	public String getRequiredPath() {
		return this.requiredPath;
	}

	public void setRequiredPath(String requiredPath) {
		this.requiredPath = requiredPath;
		if(requiredPath != null){
			putQueryParameter("requiredPath", requiredPath);
		}
	}

	public String getMethodController() {
		return this.methodController;
	}

	public void setMethodController(String methodController) {
		this.methodController = methodController;
		if(methodController != null){
			putQueryParameter("methodController", methodController);
		}
	}

	@Override
	public Class<GetSpringCloudTestMethodResponse> getResponseClass() {
		return GetSpringCloudTestMethodResponse.class;
	}

}
