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

package com.aliyuncs.dms_dg.model.v20230914;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class StopGatewayRequest extends RpcAcsRequest<StopGatewayResponse> {
	   

	private String gatewayInstanceId;

	private String gatewayId;
	public StopGatewayRequest() {
		super("dms-dg", "2023-09-14", "StopGateway");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getGatewayInstanceId() {
		return this.gatewayInstanceId;
	}

	public void setGatewayInstanceId(String gatewayInstanceId) {
		this.gatewayInstanceId = gatewayInstanceId;
		if(gatewayInstanceId != null){
			putBodyParameter("GatewayInstanceId", gatewayInstanceId);
		}
	}

	public String getGatewayId() {
		return this.gatewayId;
	}

	public void setGatewayId(String gatewayId) {
		this.gatewayId = gatewayId;
		if(gatewayId != null){
			putBodyParameter("GatewayId", gatewayId);
		}
	}

	@Override
	public Class<StopGatewayResponse> getResponseClass() {
		return StopGatewayResponse.class;
	}

}
