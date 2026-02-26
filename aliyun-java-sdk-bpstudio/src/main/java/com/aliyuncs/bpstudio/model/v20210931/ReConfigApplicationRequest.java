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

package com.aliyuncs.bpstudio.model.v20210931;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ReConfigApplicationRequest extends RpcAcsRequest<ReConfigApplicationResponse> {
	   

	private String variables;

	private String appId;
	public ReConfigApplicationRequest() {
		super("BPStudio", "2021-09-31", "ReConfigApplication", "bpstudio");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getVariables() {
		return this.variables;
	}

	public void setVariables(String variables) {
		this.variables = variables;
		if(variables != null){
			putBodyParameter("Variables", variables);
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putBodyParameter("AppId", appId);
		}
	}

	@Override
	public Class<ReConfigApplicationResponse> getResponseClass() {
		return ReConfigApplicationResponse.class;
	}

}
