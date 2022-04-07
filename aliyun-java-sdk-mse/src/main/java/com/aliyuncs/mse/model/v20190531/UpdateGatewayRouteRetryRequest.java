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
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mse.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateGatewayRouteRetryRequest extends RpcAcsRequest<UpdateGatewayRouteRetryResponse> {
	   

	private String gatewayUniqueId;

	@SerializedName("retryJSON")
	private RetryJSON retryJSON;

	private String acceptLanguage;

	private Long id;

	private Long gatewayId;
	public UpdateGatewayRouteRetryRequest() {
		super("mse", "2019-05-31", "UpdateGatewayRouteRetry", "mse");
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

	public RetryJSON getRetryJSON() {
		return this.retryJSON;
	}

	public void setRetryJSON(RetryJSON retryJSON) {
		this.retryJSON = retryJSON;	
		if (retryJSON != null) {
			putQueryParameter("RetryJSON" , new Gson().toJson(retryJSON));
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

	public static class RetryJSON {

		@SerializedName("HttpCodes")
		private List<String> httpCodes;

		@SerializedName("Attempts")
		private Integer attempts;

		@SerializedName("RetryOn")
		private List<String> retryOn;

		@SerializedName("Status")
		private String status;

		public List<String> getHttpCodes() {
			return this.httpCodes;
		}

		public void setHttpCodes(List<String> httpCodes) {
			this.httpCodes = httpCodes;
		}

		public Integer getAttempts() {
			return this.attempts;
		}

		public void setAttempts(Integer attempts) {
			this.attempts = attempts;
		}

		public List<String> getRetryOn() {
			return this.retryOn;
		}

		public void setRetryOn(List<String> retryOn) {
			this.retryOn = retryOn;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public Class<UpdateGatewayRouteRetryResponse> getResponseClass() {
		return UpdateGatewayRouteRetryResponse.class;
	}

}
