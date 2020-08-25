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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateLinkeBahamutReleasedependencyRequest extends RpcAcsRequest<UpdateLinkeBahamutReleasedependencyResponse> {
	   

	private String appName;

	private List<String> dependencyRepeatLists;

	private String releaseExternalId;
	public UpdateLinkeBahamutReleasedependencyRequest() {
		super("SOFA", "2019-08-15", "UpdateLinkeBahamutReleasedependency", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putBodyParameter("AppName", appName);
		}
	}

	public List<String> getDependencyRepeatLists() {
		return this.dependencyRepeatLists;
	}

	public void setDependencyRepeatLists(List<String> dependencyRepeatLists) {
		this.dependencyRepeatLists = dependencyRepeatLists;	
		if (dependencyRepeatLists != null) {
			for (int i = 0; i < dependencyRepeatLists.size(); i++) {
				putBodyParameter("DependencyRepeatList." + (i + 1) , dependencyRepeatLists.get(i));
			}
		}	
	}

	public String getReleaseExternalId() {
		return this.releaseExternalId;
	}

	public void setReleaseExternalId(String releaseExternalId) {
		this.releaseExternalId = releaseExternalId;
		if(releaseExternalId != null){
			putBodyParameter("ReleaseExternalId", releaseExternalId);
		}
	}

	@Override
	public Class<UpdateLinkeBahamutReleasedependencyResponse> getResponseClass() {
		return UpdateLinkeBahamutReleasedependencyResponse.class;
	}

}
