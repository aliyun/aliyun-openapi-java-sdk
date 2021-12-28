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

package com.aliyuncs.mse.model.v20190531;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mse.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddServiceSourceRequest extends RpcAcsRequest<AddServiceSourceResponse> {
	   

	private String gatewayUniqueId;

	private String source;

	private String type;

	private Long gatewayId;

	private String address;

	private String info1;

	private String name;

	private String info2;
	public AddServiceSourceRequest() {
		super("mse", "2019-05-31", "AddServiceSource", "mse");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getGatewayUniqueId() {
		return this.gatewayUniqueId;
	}

	public void setGatewayUniqueId(String gatewayUniqueId) {
		this.gatewayUniqueId = gatewayUniqueId;
		if(gatewayUniqueId != null){
			putQueryParameter("GatewayUniqueId", gatewayUniqueId);
		}
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
		if(source != null){
			putQueryParameter("Source", source);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public Long getGatewayId() {
		return this.gatewayId;
	}

	public void setGatewayId(Long gatewayId) {
		this.gatewayId = gatewayId;
		if(gatewayId != null){
			putQueryParameter("GatewayId", gatewayId.toString());
		}
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
		if(address != null){
			putQueryParameter("Address", address);
		}
	}

	public String getInfo1() {
		return this.info1;
	}

	public void setInfo1(String info1) {
		this.info1 = info1;
		if(info1 != null){
			putQueryParameter("Info1", info1);
		}
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

	public String getInfo2() {
		return this.info2;
	}

	public void setInfo2(String info2) {
		this.info2 = info2;
		if(info2 != null){
			putQueryParameter("Info2", info2);
		}
	}

	@Override
	public Class<AddServiceSourceResponse> getResponseClass() {
		return AddServiceSourceResponse.class;
	}

}
