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

package com.aliyuncs.iovcc.model.v20180501;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iovcc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateProjectAppRequest extends RpcAcsRequest<CreateProjectAppResponse> {
	   

	private String appPkgName;

	private Integer osType;

	private String appName;

	private String projectId;
	public CreateProjectAppRequest() {
		super("iovcc", "2018-05-01", "CreateProjectApp", "iovcc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAppPkgName() {
		return this.appPkgName;
	}

	public void setAppPkgName(String appPkgName) {
		this.appPkgName = appPkgName;
		if(appPkgName != null){
			putQueryParameter("AppPkgName", appPkgName);
		}
	}

	public Integer getOsType() {
		return this.osType;
	}

	public void setOsType(Integer osType) {
		this.osType = osType;
		if(osType != null){
			putQueryParameter("OsType", osType.toString());
		}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putQueryParameter("AppName", appName);
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putQueryParameter("ProjectId", projectId);
		}
	}

	@Override
	public Class<CreateProjectAppResponse> getResponseClass() {
		return CreateProjectAppResponse.class;
	}

}
