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

package com.aliyuncs.trademark.model.v20180724;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.trademark.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class InsertRenewInfoRequest extends RpcAcsRequest<InsertRenewInfoResponse> {
	   

	private String engName;

	private String address;

	private Long registerTime;

	private String engAddress;

	private String name;
	public InsertRenewInfoRequest() {
		super("Trademark", "2018-07-24", "InsertRenewInfo");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getEngName() {
		return this.engName;
	}

	public void setEngName(String engName) {
		this.engName = engName;
		if(engName != null){
			putQueryParameter("EngName", engName);
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

	public Long getRegisterTime() {
		return this.registerTime;
	}

	public void setRegisterTime(Long registerTime) {
		this.registerTime = registerTime;
		if(registerTime != null){
			putQueryParameter("RegisterTime", registerTime.toString());
		}
	}

	public String getEngAddress() {
		return this.engAddress;
	}

	public void setEngAddress(String engAddress) {
		this.engAddress = engAddress;
		if(engAddress != null){
			putQueryParameter("EngAddress", engAddress);
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

	@Override
	public Class<InsertRenewInfoResponse> getResponseClass() {
		return InsertRenewInfoResponse.class;
	}

}
