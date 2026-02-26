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

package com.aliyuncs.eiam.model.v20211201;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateApplicationInfoRequest extends RpcAcsRequest<UpdateApplicationInfoResponse> {
	   

	private String clientToken;

	private String logoUrl;

	private String applicationId;

	private String applicationName;

	private List<String> applicationVisibility;

	private String instanceId;
	public UpdateApplicationInfoRequest() {
		super("Eiam", "2021-12-01", "UpdateApplicationInfo", "eiam");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
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

	public String getLogoUrl() {
		return this.logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
		if(logoUrl != null){
			putQueryParameter("LogoUrl", logoUrl);
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

	public String getApplicationName() {
		return this.applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
		if(applicationName != null){
			putQueryParameter("ApplicationName", applicationName);
		}
	}

	public List<String> getApplicationVisibility() {
		return this.applicationVisibility;
	}

	public void setApplicationVisibility(List<String> applicationVisibility) {
		this.applicationVisibility = applicationVisibility;	
		if (applicationVisibility != null) {
			for (int depth1 = 0; depth1 < applicationVisibility.size(); depth1++) {
				putQueryParameter("ApplicationVisibility." + (depth1 + 1) , applicationVisibility.get(depth1));
			}
		}	
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	@Override
	public Class<UpdateApplicationInfoResponse> getResponseClass() {
		return UpdateApplicationInfoResponse.class;
	}

}
