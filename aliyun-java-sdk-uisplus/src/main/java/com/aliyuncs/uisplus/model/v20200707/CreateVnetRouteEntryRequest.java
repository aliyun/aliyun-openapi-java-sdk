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

package com.aliyuncs.uisplus.model.v20200707;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.uisplus.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateVnetRouteEntryRequest extends RpcAcsRequest<CreateVnetRouteEntryResponse> {
	   

	private String clientToken;

	private String destination;

	private String nexthop;

	private String uisId;

	private String vnetId;

	private String nexthopType;
	public CreateVnetRouteEntryRequest() {
		super("Uisplus", "2020-07-07", "CreateVnetRouteEntry", "uisplus");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getDestination() {
		return this.destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
		if(destination != null){
			putQueryParameter("Destination", destination);
		}
	}

	public String getNexthop() {
		return this.nexthop;
	}

	public void setNexthop(String nexthop) {
		this.nexthop = nexthop;
		if(nexthop != null){
			putQueryParameter("Nexthop", nexthop);
		}
	}

	public String getUisId() {
		return this.uisId;
	}

	public void setUisId(String uisId) {
		this.uisId = uisId;
		if(uisId != null){
			putQueryParameter("UisId", uisId);
		}
	}

	public String getVnetId() {
		return this.vnetId;
	}

	public void setVnetId(String vnetId) {
		this.vnetId = vnetId;
		if(vnetId != null){
			putQueryParameter("VnetId", vnetId);
		}
	}

	public String getNexthopType() {
		return this.nexthopType;
	}

	public void setNexthopType(String nexthopType) {
		this.nexthopType = nexthopType;
		if(nexthopType != null){
			putQueryParameter("NexthopType", nexthopType);
		}
	}

	@Override
	public Class<CreateVnetRouteEntryResponse> getResponseClass() {
		return CreateVnetRouteEntryResponse.class;
	}

}
