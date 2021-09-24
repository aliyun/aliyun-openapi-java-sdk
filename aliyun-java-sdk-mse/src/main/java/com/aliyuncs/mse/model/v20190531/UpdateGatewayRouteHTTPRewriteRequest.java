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
public class UpdateGatewayRouteHTTPRewriteRequest extends RpcAcsRequest<UpdateGatewayRouteHTTPRewriteResponse> {
	   

	private String httpRewriteJSON;

	private Long id;

	private Long gatewayId;
	public UpdateGatewayRouteHTTPRewriteRequest() {
		super("mse", "2019-05-31", "UpdateGatewayRouteHTTPRewrite");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getHttpRewriteJSON() {
		return this.httpRewriteJSON;
	}

	public void setHttpRewriteJSON(String httpRewriteJSON) {
		this.httpRewriteJSON = httpRewriteJSON;
		if(httpRewriteJSON != null){
			putQueryParameter("HttpRewriteJSON", httpRewriteJSON);
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

	@Override
	public Class<UpdateGatewayRouteHTTPRewriteResponse> getResponseClass() {
		return UpdateGatewayRouteHTTPRewriteResponse.class;
	}

}
