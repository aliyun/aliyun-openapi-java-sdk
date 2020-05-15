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
public class DescribeAppServiceEnvParamWithDiffRequest extends RpcAcsRequest<DescribeAppServiceEnvParamWithDiffResponse> {
	   

	private String appServiceId;

	private String buildpackId;
	public DescribeAppServiceEnvParamWithDiffRequest() {
		super("SOFA", "2019-08-15", "DescribeAppServiceEnvParamWithDiff", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAppServiceId() {
		return this.appServiceId;
	}

	public void setAppServiceId(String appServiceId) {
		this.appServiceId = appServiceId;
		if(appServiceId != null){
			putBodyParameter("AppServiceId", appServiceId);
		}
	}

	public String getBuildpackId() {
		return this.buildpackId;
	}

	public void setBuildpackId(String buildpackId) {
		this.buildpackId = buildpackId;
		if(buildpackId != null){
			putBodyParameter("BuildpackId", buildpackId);
		}
	}

	@Override
	public Class<DescribeAppServiceEnvParamWithDiffResponse> getResponseClass() {
		return DescribeAppServiceEnvParamWithDiffResponse.class;
	}

}
