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

package com.aliyuncs.digitalstore.model.v20200107;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.digitalstore.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateInboundOrderRequest extends RpcAcsRequest<CreateInboundOrderResponse> {
	   

	private String clientToken;

	private String description;

	private String toWarehouseId;

	private String orderCode;

	private String fromBusinessUnitId;

	private String fromWarehouseId;
	public CreateInboundOrderRequest() {
		super("digitalstore", "2020-01-07", "CreateInboundOrder", "digitalstore");
		setMethod(MethodType.POST);
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
			putBodyParameter("ClientToken", clientToken);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public String getToWarehouseId() {
		return this.toWarehouseId;
	}

	public void setToWarehouseId(String toWarehouseId) {
		this.toWarehouseId = toWarehouseId;
		if(toWarehouseId != null){
			putBodyParameter("ToWarehouseId", toWarehouseId);
		}
	}

	public String getOrderCode() {
		return this.orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
		if(orderCode != null){
			putBodyParameter("OrderCode", orderCode);
		}
	}

	public String getFromBusinessUnitId() {
		return this.fromBusinessUnitId;
	}

	public void setFromBusinessUnitId(String fromBusinessUnitId) {
		this.fromBusinessUnitId = fromBusinessUnitId;
		if(fromBusinessUnitId != null){
			putBodyParameter("FromBusinessUnitId", fromBusinessUnitId);
		}
	}

	public String getFromWarehouseId() {
		return this.fromWarehouseId;
	}

	public void setFromWarehouseId(String fromWarehouseId) {
		this.fromWarehouseId = fromWarehouseId;
		if(fromWarehouseId != null){
			putBodyParameter("FromWarehouseId", fromWarehouseId);
		}
	}

	@Override
	public Class<CreateInboundOrderResponse> getResponseClass() {
		return CreateInboundOrderResponse.class;
	}

}
