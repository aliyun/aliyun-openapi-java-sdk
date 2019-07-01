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

package com.aliyuncs.green.model.v20170823;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateCdiBagRequest extends RpcAcsRequest<CreateCdiBagResponse> {
	
	public CreateCdiBagRequest() {
		super("Green", "2017-08-23", "CreateCdiBag", "green");
	}

	private String clientToken;

	private Integer orderNum;

	private String commodityCode;

	private Long ownerId;

	private Integer flowOutSpec;

	private String orderType;

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public Integer getOrderNum() {
		return this.orderNum;
	}

	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
		if(orderNum != null){
			putQueryParameter("OrderNum", orderNum.toString());
		}
	}

	public String getCommodityCode() {
		return this.commodityCode;
	}

	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
		if(commodityCode != null){
			putQueryParameter("CommodityCode", commodityCode);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public Integer getFlowOutSpec() {
		return this.flowOutSpec;
	}

	public void setFlowOutSpec(Integer flowOutSpec) {
		this.flowOutSpec = flowOutSpec;
		if(flowOutSpec != null){
			putQueryParameter("FlowOutSpec", flowOutSpec.toString());
		}
	}

	public String getOrderType() {
		return this.orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
		if(orderType != null){
			putQueryParameter("OrderType", orderType);
		}
	}

	@Override
	public Class<CreateCdiBagResponse> getResponseClass() {
		return CreateCdiBagResponse.class;
	}

}
