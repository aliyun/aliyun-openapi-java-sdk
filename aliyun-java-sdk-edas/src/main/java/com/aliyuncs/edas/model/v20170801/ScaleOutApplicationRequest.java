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
public class ScaleOutApplicationRequest extends RoaAcsRequest<ScaleOutApplicationResponse> {
	
	public ScaleOutApplicationRequest() {
		super("Edas", "2017-08-01", "ScaleOutApplication", "edas");
		setUriPattern("/pop/v5/changeorder/co_scale_out");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String ecuInfo;

	private String deployGroup;

	private String appId;

	public String getEcuInfo() {
		return this.ecuInfo;
	}

	public void setEcuInfo(String ecuInfo) {
		this.ecuInfo = ecuInfo;
		if(ecuInfo != null){
			putQueryParameter("EcuInfo", ecuInfo);
		}
	}

	public String getDeployGroup() {
		return this.deployGroup;
	}

	public void setDeployGroup(String deployGroup) {
		this.deployGroup = deployGroup;
		if(deployGroup != null){
			putQueryParameter("DeployGroup", deployGroup);
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	@Override
	public Class<ScaleOutApplicationResponse> getResponseClass() {
		return ScaleOutApplicationResponse.class;
	}

}
