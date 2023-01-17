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

package com.aliyuncs.cdn.model.v20180510;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cdn.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class PushObjectCacheRequest extends RpcAcsRequest<PushObjectCacheResponse> {
	   

	private String objectPath;

	private String securityToken;

	private Boolean l2Preload;

	private String area;

	private String withHeader;

	private Long ownerId;
	public PushObjectCacheRequest() {
		super("Cdn", "2018-05-10", "PushObjectCache");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getObjectPath() {
		return this.objectPath;
	}

	public void setObjectPath(String objectPath) {
		this.objectPath = objectPath;
		if(objectPath != null){
			putQueryParameter("ObjectPath", objectPath);
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public Boolean getL2Preload() {
		return this.l2Preload;
	}

	public void setL2Preload(Boolean l2Preload) {
		this.l2Preload = l2Preload;
		if(l2Preload != null){
			putQueryParameter("L2Preload", l2Preload.toString());
		}
	}

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
		if(area != null){
			putQueryParameter("Area", area);
		}
	}

	public String getWithHeader() {
		return this.withHeader;
	}

	public void setWithHeader(String withHeader) {
		this.withHeader = withHeader;
		if(withHeader != null){
			putQueryParameter("WithHeader", withHeader);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	@Override
	public Class<PushObjectCacheResponse> getResponseClass() {
		return PushObjectCacheResponse.class;
	}

}
