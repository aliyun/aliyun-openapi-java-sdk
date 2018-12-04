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

package com.aliyuncs.baas.model.v20180731;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeOrganizationUserCertsRequest extends RpcAcsRequest<DescribeOrganizationUserCertsResponse> {
	
	public DescribeOrganizationUserCertsRequest() {
		super("Baas", "2018-07-31", "DescribeOrganizationUserCerts");
	}

	private String organizationId;

	private String username;

	public String getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
		if(organizationId != null){
			putBodyParameter("OrganizationId", organizationId);
		}
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
		if(username != null){
			putBodyParameter("Username", username);
		}
	}

	@Override
	public Class<DescribeOrganizationUserCertsResponse> getResponseClass() {
		return DescribeOrganizationUserCertsResponse.class;
	}

}
