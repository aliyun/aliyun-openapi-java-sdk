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
public class UpdateLinkeLinktModuleRequest extends RpcAcsRequest<UpdateLinkeLinktModuleResponse> {
	   

	private String owners;

	private String name;

	private Long moduleId;
	public UpdateLinkeLinktModuleRequest() {
		super("SOFA", "2019-08-15", "UpdateLinkeLinktModule", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOwners() {
		return this.owners;
	}

	public void setOwners(String owners) {
		this.owners = owners;
		if(owners != null){
			putBodyParameter("Owners", owners);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public Long getModuleId() {
		return this.moduleId;
	}

	public void setModuleId(Long moduleId) {
		this.moduleId = moduleId;
		if(moduleId != null){
			putBodyParameter("ModuleId", moduleId.toString());
		}
	}

	@Override
	public Class<UpdateLinkeLinktModuleResponse> getResponseClass() {
		return UpdateLinkeLinktModuleResponse.class;
	}

}
