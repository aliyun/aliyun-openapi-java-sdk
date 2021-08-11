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

package com.aliyuncs.sgw.model.v20180511;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sgw.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteGatewayRequest extends RpcAcsRequest<DeleteGatewayResponse> {
	   

	private String reasonDetail;

	private String securityToken;

	private String gatewayId;

	private String reasonType;
	public DeleteGatewayRequest() {
		super("sgw", "2018-05-11", "DeleteGateway", "hcs_sgw");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getReasonDetail() {
		return this.reasonDetail;
	}

	public void setReasonDetail(String reasonDetail) {
		this.reasonDetail = reasonDetail;
		if(reasonDetail != null){
			putQueryParameter("ReasonDetail", reasonDetail);
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

	public String getGatewayId() {
		return this.gatewayId;
	}

	public void setGatewayId(String gatewayId) {
		this.gatewayId = gatewayId;
		if(gatewayId != null){
			putQueryParameter("GatewayId", gatewayId);
		}
	}

	public String getReasonType() {
		return this.reasonType;
	}

	public void setReasonType(String reasonType) {
		this.reasonType = reasonType;
		if(reasonType != null){
			putQueryParameter("ReasonType", reasonType);
		}
	}

	@Override
	public Class<DeleteGatewayResponse> getResponseClass() {
		return DeleteGatewayResponse.class;
	}

}
