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
public class UpdateAKSClusterLogRequest extends RpcAcsRequest<UpdateAKSClusterLogResponse> {
	   

	private String workspace;

	private String alsProjectName;

	private String alsProjectHowCreate;
	public UpdateAKSClusterLogRequest() {
		super("SOFA", "2019-08-15", "UpdateAKSClusterLog", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getWorkspace() {
		return this.workspace;
	}

	public void setWorkspace(String workspace) {
		this.workspace = workspace;
		if(workspace != null){
			putBodyParameter("Workspace", workspace);
		}
	}

	public String getAlsProjectName() {
		return this.alsProjectName;
	}

	public void setAlsProjectName(String alsProjectName) {
		this.alsProjectName = alsProjectName;
		if(alsProjectName != null){
			putBodyParameter("AlsProjectName", alsProjectName);
		}
	}

	public String getAlsProjectHowCreate() {
		return this.alsProjectHowCreate;
	}

	public void setAlsProjectHowCreate(String alsProjectHowCreate) {
		this.alsProjectHowCreate = alsProjectHowCreate;
		if(alsProjectHowCreate != null){
			putBodyParameter("AlsProjectHowCreate", alsProjectHowCreate);
		}
	}

	@Override
	public Class<UpdateAKSClusterLogResponse> getResponseClass() {
		return UpdateAKSClusterLogResponse.class;
	}

}
