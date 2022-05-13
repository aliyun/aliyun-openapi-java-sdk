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
public class AddSeataServerRequest extends RpcAcsRequest<AddSeataServerResponse> {
	   

	private Integer replica;

	private String primaryUser;

	private String vpc;

	private String vswitch;

	private String name;

	private String acceptLanguage;

	private String zoneId;

	private String region;
	public AddSeataServerRequest() {
		super("mse", "2019-05-31", "AddSeataServer", "mse");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getReplica() {
		return this.replica;
	}

	public void setReplica(Integer replica) {
		this.replica = replica;
		if(replica != null){
			putQueryParameter("Replica", replica.toString());
		}
	}

	public String getPrimaryUser() {
		return this.primaryUser;
	}

	public void setPrimaryUser(String primaryUser) {
		this.primaryUser = primaryUser;
		if(primaryUser != null){
			putQueryParameter("PrimaryUser", primaryUser);
		}
	}

	public String getVpc() {
		return this.vpc;
	}

	public void setVpc(String vpc) {
		this.vpc = vpc;
		if(vpc != null){
			putQueryParameter("Vpc", vpc);
		}
	}

	public String getVswitch() {
		return this.vswitch;
	}

	public void setVswitch(String vswitch) {
		this.vswitch = vswitch;
		if(vswitch != null){
			putQueryParameter("Vswitch", vswitch);
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

	public String getAcceptLanguage() {
		return this.acceptLanguage;
	}

	public void setAcceptLanguage(String acceptLanguage) {
		this.acceptLanguage = acceptLanguage;
		if(acceptLanguage != null){
			putQueryParameter("AcceptLanguage", acceptLanguage);
		}
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
		}
	}

	@Override
	public Class<AddSeataServerResponse> getResponseClass() {
		return AddSeataServerResponse.class;
	}

}
