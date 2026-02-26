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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateNetworkAclRequest extends RpcAcsRequest<CreateNetworkAclResponse> {
	   

	private String description;

	private String networkAclName;
	public CreateNetworkAclRequest() {
		super("Ens", "2017-11-10", "CreateNetworkAcl", "ens");
		setMethod(MethodType.POST);
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getNetworkAclName() {
		return this.networkAclName;
	}

	public void setNetworkAclName(String networkAclName) {
		this.networkAclName = networkAclName;
		if(networkAclName != null){
			putQueryParameter("NetworkAclName", networkAclName);
		}
	}

	@Override
	public Class<CreateNetworkAclResponse> getResponseClass() {
		return CreateNetworkAclResponse.class;
	}

}
