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

package com.aliyuncs.resourcesharing.model.v20200110;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.resourcesharing.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateResourceShareRequest extends RpcAcsRequest<UpdateResourceShareResponse> {
	   

	private String resourceShareName;

	private String resourceShareId;

	private Boolean allowExternalTargets;
	public UpdateResourceShareRequest() {
		super("ResourceSharing", "2020-01-10", "UpdateResourceShare", "ressharing");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getResourceShareName() {
		return this.resourceShareName;
	}

	public void setResourceShareName(String resourceShareName) {
		this.resourceShareName = resourceShareName;
		if(resourceShareName != null){
			putQueryParameter("ResourceShareName", resourceShareName);
		}
	}

	public String getResourceShareId() {
		return this.resourceShareId;
	}

	public void setResourceShareId(String resourceShareId) {
		this.resourceShareId = resourceShareId;
		if(resourceShareId != null){
			putQueryParameter("ResourceShareId", resourceShareId);
		}
	}

	public Boolean getAllowExternalTargets() {
		return this.allowExternalTargets;
	}

	public void setAllowExternalTargets(Boolean allowExternalTargets) {
		this.allowExternalTargets = allowExternalTargets;
		if(allowExternalTargets != null){
			putQueryParameter("AllowExternalTargets", allowExternalTargets.toString());
		}
	}

	@Override
	public Class<UpdateResourceShareResponse> getResponseClass() {
		return UpdateResourceShareResponse.class;
	}

}
