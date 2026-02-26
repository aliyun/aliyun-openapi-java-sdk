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

package com.aliyuncs.privatelink.model.v20200415;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.privatelink.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class NotifyResourceAddressFamilyRequest extends RpcAcsRequest<NotifyResourceAddressFamilyResponse> {
	   

	private String resourceId;

	private String resourceType;

	private String addressFamily;

	private String ipv6Address;
	public NotifyResourceAddressFamilyRequest() {
		super("Privatelink", "2020-04-15", "NotifyResourceAddressFamily", "privatelink");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getAddressFamily() {
		return this.addressFamily;
	}

	public void setAddressFamily(String addressFamily) {
		this.addressFamily = addressFamily;
		if(addressFamily != null){
			putQueryParameter("AddressFamily", addressFamily);
		}
	}

	public String getIpv6Address() {
		return this.ipv6Address;
	}

	public void setIpv6Address(String ipv6Address) {
		this.ipv6Address = ipv6Address;
		if(ipv6Address != null){
			putQueryParameter("Ipv6Address", ipv6Address);
		}
	}

	@Override
	public Class<NotifyResourceAddressFamilyResponse> getResponseClass() {
		return NotifyResourceAddressFamilyResponse.class;
	}

}
