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

package com.aliyuncs.quickbi_public.model.v20220101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AddWorksAuthorizationRequest extends RpcAcsRequest<AddWorksAuthorizationResponse> {
	   

	private String authorizedId;

	private Integer authPoints;

	private Integer authorizeScope;

	private String resourceId;

	private String resourceType;

	private String expireDay;
	public AddWorksAuthorizationRequest() {
		super("quickbi-public", "2022-01-01", "AddWorksAuthorization", "2.2.0");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getAuthorizedId() {
		return this.authorizedId;
	}

	public void setAuthorizedId(String authorizedId) {
		this.authorizedId = authorizedId;
		if(authorizedId != null){
			putQueryParameter("AuthorizedId", authorizedId);
		}
	}

	public Integer getAuthPoints() {
		return this.authPoints;
	}

	public void setAuthPoints(Integer authPoints) {
		this.authPoints = authPoints;
		if(authPoints != null){
			putQueryParameter("AuthPoints", authPoints.toString());
		}
	}

	public Integer getAuthorizeScope() {
		return this.authorizeScope;
	}

	public void setAuthorizeScope(Integer authorizeScope) {
		this.authorizeScope = authorizeScope;
		if(authorizeScope != null){
			putQueryParameter("AuthorizeScope", authorizeScope.toString());
		}
	}

	public String getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
		if(resourceId != null){
			putQueryParameter("ResourceId", resourceId);
		}
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType);
		}
	}

	public String getExpireDay() {
		return this.expireDay;
	}

	public void setExpireDay(String expireDay) {
		this.expireDay = expireDay;
		if(expireDay != null){
			putQueryParameter("ExpireDay", expireDay);
		}
	}

	@Override
	public Class<AddWorksAuthorizationResponse> getResponseClass() {
		return AddWorksAuthorizationResponse.class;
	}

}
