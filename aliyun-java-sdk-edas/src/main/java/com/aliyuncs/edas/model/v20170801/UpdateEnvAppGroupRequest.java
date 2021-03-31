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

package com.aliyuncs.edas.model.v20170801;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.edas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateEnvAppGroupRequest extends RoaAcsRequest<UpdateEnvAppGroupResponse> {
	   

	private String pointcutName;

	private String scopes;
	public UpdateEnvAppGroupRequest() {
		super("Edas", "2017-08-01", "UpdateEnvAppGroup", "Edas");
		setUriPattern("/pop/v5/gray/env_app_groups");
		setMethod(MethodType.PUT);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPointcutName() {
		return this.pointcutName;
	}

	public void setPointcutName(String pointcutName) {
		this.pointcutName = pointcutName;
		if(pointcutName != null){
			putBodyParameter("PointcutName", pointcutName);
		}
	}

	public String getScopes() {
		return this.scopes;
	}

	public void setScopes(String scopes) {
		this.scopes = scopes;
		if(scopes != null){
			putBodyParameter("Scopes", scopes);
		}
	}

	@Override
	public Class<UpdateEnvAppGroupResponse> getResponseClass() {
		return UpdateEnvAppGroupResponse.class;
	}

}
