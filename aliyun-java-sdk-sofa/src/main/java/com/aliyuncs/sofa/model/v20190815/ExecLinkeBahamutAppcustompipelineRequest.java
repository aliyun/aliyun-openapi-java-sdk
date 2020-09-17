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
public class ExecLinkeBahamutAppcustompipelineRequest extends RpcAcsRequest<ExecLinkeBahamutAppcustompipelineResponse> {
	   

	private String fromTenant;

	private String targetApp;

	private String fromApp;

	private String targetTenant;

	private String withExclude;
	public ExecLinkeBahamutAppcustompipelineRequest() {
		super("SOFA", "2019-08-15", "ExecLinkeBahamutAppcustompipeline", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFromTenant() {
		return this.fromTenant;
	}

	public void setFromTenant(String fromTenant) {
		this.fromTenant = fromTenant;
		if(fromTenant != null){
			putBodyParameter("FromTenant", fromTenant);
		}
	}

	public String getTargetApp() {
		return this.targetApp;
	}

	public void setTargetApp(String targetApp) {
		this.targetApp = targetApp;
		if(targetApp != null){
			putBodyParameter("TargetApp", targetApp);
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

	public String getTargetTenant() {
		return this.targetTenant;
	}

	public void setTargetTenant(String targetTenant) {
		this.targetTenant = targetTenant;
		if(targetTenant != null){
			putBodyParameter("TargetTenant", targetTenant);
		}
	}

	public String getWithExclude() {
		return this.withExclude;
	}

	public void setWithExclude(String withExclude) {
		this.withExclude = withExclude;
		if(withExclude != null){
			putBodyParameter("WithExclude", withExclude);
		}
	}

	@Override
	public Class<ExecLinkeBahamutAppcustompipelineResponse> getResponseClass() {
		return ExecLinkeBahamutAppcustompipelineResponse.class;
	}

}
