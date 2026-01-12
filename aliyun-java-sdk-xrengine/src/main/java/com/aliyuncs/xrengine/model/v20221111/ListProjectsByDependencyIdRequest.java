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

package com.aliyuncs.xrengine.model.v20221111;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.xrengine.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListProjectsByDependencyIdRequest extends RpcAcsRequest<ListProjectsByDependencyIdResponse> {
	   

	private Boolean withDataset;

	private Boolean withSource;

	private Long dependencyProjectId;

	private String jwtToken;

	private String mapUuid;
	public ListProjectsByDependencyIdRequest() {
		super("xrEngine", "2022-11-11", "ListProjectsByDependencyId");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getWithDataset() {
		return this.withDataset;
	}

	public void setWithDataset(Boolean withDataset) {
		this.withDataset = withDataset;
		if(withDataset != null){
			putBodyParameter("WithDataset", withDataset.toString());
		}
	}

	public Boolean getWithSource() {
		return this.withSource;
	}

	public void setWithSource(Boolean withSource) {
		this.withSource = withSource;
		if(withSource != null){
			putBodyParameter("WithSource", withSource.toString());
		}
	}

	public Long getDependencyProjectId() {
		return this.dependencyProjectId;
	}

	public void setDependencyProjectId(Long dependencyProjectId) {
		this.dependencyProjectId = dependencyProjectId;
		if(dependencyProjectId != null){
			putBodyParameter("DependencyProjectId", dependencyProjectId.toString());
		}
	}

	public String getJwtToken() {
		return this.jwtToken;
	}

	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
		if(jwtToken != null){
			putBodyParameter("JwtToken", jwtToken);
		}
	}

	public String getMapUuid() {
		return this.mapUuid;
	}

	public void setMapUuid(String mapUuid) {
		this.mapUuid = mapUuid;
		if(mapUuid != null){
			putBodyParameter("MapUuid", mapUuid);
		}
	}

	@Override
	public Class<ListProjectsByDependencyIdResponse> getResponseClass() {
		return ListProjectsByDependencyIdResponse.class;
	}

}
