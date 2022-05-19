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

package com.aliyuncs.cr.model.v20181201;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateChartNamespaceRequest extends RpcAcsRequest<UpdateChartNamespaceResponse> {
	   

	private String namespaceName;

	private Boolean autoCreateRepo;

	private String defaultRepoType;

	private String instanceId;
	public UpdateChartNamespaceRequest() {
		super("cr", "2018-12-01", "UpdateChartNamespace", "acr");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getNamespaceName() {
		return this.namespaceName;
	}

	public void setNamespaceName(String namespaceName) {
		this.namespaceName = namespaceName;
		if(namespaceName != null){
			putQueryParameter("NamespaceName", namespaceName);
		}
	}

	public Boolean getAutoCreateRepo() {
		return this.autoCreateRepo;
	}

	public void setAutoCreateRepo(Boolean autoCreateRepo) {
		this.autoCreateRepo = autoCreateRepo;
		if(autoCreateRepo != null){
			putQueryParameter("AutoCreateRepo", autoCreateRepo.toString());
		}
	}

	public String getDefaultRepoType() {
		return this.defaultRepoType;
	}

	public void setDefaultRepoType(String defaultRepoType) {
		this.defaultRepoType = defaultRepoType;
		if(defaultRepoType != null){
			putQueryParameter("DefaultRepoType", defaultRepoType);
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
	public Class<UpdateChartNamespaceResponse> getResponseClass() {
		return UpdateChartNamespaceResponse.class;
	}

}
