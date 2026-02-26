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

package com.aliyuncs.devops.model.v20210625;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListServiceAuthsRequest extends RoaAcsRequest<ListServiceAuthsResponse> {
	   

	private String organizationId;

	private String serviceAuthType;
	public ListServiceAuthsRequest() {
		super("devops", "2021-06-25", "ListServiceAuths");
		setUriPattern("/organization/[organizationId]/serviceAuths");
		setMethod(MethodType.GET);
	}

	public String getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
		if(organizationId != null){
			putPathParameter("organizationId", organizationId);
		}
	}

	public String getServiceAuthType() {
		return this.serviceAuthType;
	}

	public void setServiceAuthType(String serviceAuthType) {
		this.serviceAuthType = serviceAuthType;
		if(serviceAuthType != null){
			putQueryParameter("serviceAuthType", serviceAuthType);
		}
	}

	@Override
	public Class<ListServiceAuthsResponse> getResponseClass() {
		return ListServiceAuthsResponse.class;
	}

}
