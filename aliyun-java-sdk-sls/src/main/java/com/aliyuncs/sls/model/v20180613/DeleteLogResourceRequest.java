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

package com.aliyuncs.sls.model.v20180613;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sls.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteLogResourceRequest extends RpcAcsRequest<DeleteLogResourceResponse> {
	   

	private String project;

	private String region;

	private String logstore;
	public DeleteLogResourceRequest() {
		super("Sls", "2018-06-13", "DeleteLogResource");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
		if(project != null){
			putQueryParameter("Project", project);
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
		}
	}

	public String getLogstore() {
		return this.logstore;
	}

	public void setLogstore(String logstore) {
		this.logstore = logstore;
		if(logstore != null){
			putQueryParameter("Logstore", logstore);
		}
	}

	@Override
	public Class<DeleteLogResourceResponse> getResponseClass() {
		return DeleteLogResourceResponse.class;
	}

}
