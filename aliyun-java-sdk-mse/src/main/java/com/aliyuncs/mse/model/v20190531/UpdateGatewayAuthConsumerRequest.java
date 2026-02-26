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
public class UpdateGatewayAuthConsumerRequest extends RpcAcsRequest<UpdateGatewayAuthConsumerResponse> {
	   

	private String keyName;

	private Long id;

	private String tokenPrefix;

	private String gatewayUniqueId;

	private String jwks;

	private String description;

	private String tokenPosition;

	private String encodeType;

	private String keyValue;

	private Boolean tokenPass;

	private String acceptLanguage;

	private String tokenName;
	public UpdateGatewayAuthConsumerRequest() {
		super("mse", "2019-05-31", "UpdateGatewayAuthConsumer", "mse");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getKeyName() {
		return this.keyName;
	}

	public void setKeyName(String keyName) {
		this.keyName = keyName;
		if(keyName != null){
			putQueryParameter("KeyName", keyName);
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

	public String getTokenPrefix() {
		return this.tokenPrefix;
	}

	public void setTokenPrefix(String tokenPrefix) {
		this.tokenPrefix = tokenPrefix;
		if(tokenPrefix != null){
			putQueryParameter("TokenPrefix", tokenPrefix);
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

	public String getJwks() {
		return this.jwks;
	}

	public void setJwks(String jwks) {
		this.jwks = jwks;
		if(jwks != null){
			putQueryParameter("Jwks", jwks);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getTokenPosition() {
		return this.tokenPosition;
	}

	public void setTokenPosition(String tokenPosition) {
		this.tokenPosition = tokenPosition;
		if(tokenPosition != null){
			putQueryParameter("TokenPosition", tokenPosition);
		}
	}

	public String getEncodeType() {
		return this.encodeType;
	}

	public void setEncodeType(String encodeType) {
		this.encodeType = encodeType;
		if(encodeType != null){
			putQueryParameter("EncodeType", encodeType);
		}
	}

	public String getKeyValue() {
		return this.keyValue;
	}

	public void setKeyValue(String keyValue) {
		this.keyValue = keyValue;
		if(keyValue != null){
			putQueryParameter("KeyValue", keyValue);
		}
	}

	public Boolean getTokenPass() {
		return this.tokenPass;
	}

	public void setTokenPass(Boolean tokenPass) {
		this.tokenPass = tokenPass;
		if(tokenPass != null){
			putQueryParameter("TokenPass", tokenPass.toString());
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

	public String getTokenName() {
		return this.tokenName;
	}

	public void setTokenName(String tokenName) {
		this.tokenName = tokenName;
		if(tokenName != null){
			putQueryParameter("TokenName", tokenName);
		}
	}

	@Override
	public Class<UpdateGatewayAuthConsumerResponse> getResponseClass() {
		return UpdateGatewayAuthConsumerResponse.class;
	}

}
