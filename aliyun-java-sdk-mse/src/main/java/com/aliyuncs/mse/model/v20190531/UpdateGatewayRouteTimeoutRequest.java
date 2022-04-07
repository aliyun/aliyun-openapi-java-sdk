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
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mse.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateGatewayRouteTimeoutRequest extends RpcAcsRequest<UpdateGatewayRouteTimeoutResponse> {
	   

	@SerializedName("timeoutJSON")
	private TimeoutJSON timeoutJSON;

	private String gatewayUniqueId;

	private String acceptLanguage;

	private Long id;

	private Long gatewayId;
	public UpdateGatewayRouteTimeoutRequest() {
		super("mse", "2019-05-31", "UpdateGatewayRouteTimeout", "mse");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public TimeoutJSON getTimeoutJSON() {
		return this.timeoutJSON;
	}

	public void setTimeoutJSON(TimeoutJSON timeoutJSON) {
		this.timeoutJSON = timeoutJSON;	
		if (timeoutJSON != null) {
			putQueryParameter("TimeoutJSON" , new Gson().toJson(timeoutJSON));
		}	
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

	public String getAcceptLanguage() {
		return this.acceptLanguage;
	}

	public void setAcceptLanguage(String acceptLanguage) {
		this.acceptLanguage = acceptLanguage;
		if(acceptLanguage != null){
			putQueryParameter("AcceptLanguage", acceptLanguage);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
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

	public static class TimeoutJSON {

		@SerializedName("TimeUnit")
		private String timeUnit;

		@SerializedName("UnitNum")
		private Integer unitNum;

		@SerializedName("Status")
		private String status;

		public String getTimeUnit() {
			return this.timeUnit;
		}

		public void setTimeUnit(String timeUnit) {
			this.timeUnit = timeUnit;
		}

		public Integer getUnitNum() {
			return this.unitNum;
		}

		public void setUnitNum(Integer unitNum) {
			this.unitNum = unitNum;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public Class<UpdateGatewayRouteTimeoutResponse> getResponseClass() {
		return UpdateGatewayRouteTimeoutResponse.class;
	}

}
