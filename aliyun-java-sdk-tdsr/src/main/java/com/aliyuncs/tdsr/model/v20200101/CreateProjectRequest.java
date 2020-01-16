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

package com.aliyuncs.tdsr.model.v20200101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateProjectRequest extends RpcAcsRequest<CreateProjectResponse> {
	   

	private String name;

	private String businessId;
	public CreateProjectRequest() {
		super("tdsr", "2020-01-01", "CreateProject");
		setMethod(MethodType.POST);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getBusinessId() {
		return this.businessId;
	}

	public void setBusinessId(String businessId) {
		this.businessId = businessId;
		if(businessId != null){
			putQueryParameter("BusinessId", businessId);
		}
	}

	@Override
	public Class<CreateProjectResponse> getResponseClass() {
		return CreateProjectResponse.class;
	}

}
