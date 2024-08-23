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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateStorageGatewayRequest extends RpcAcsRequest<CreateStorageGatewayResponse> {
	   

	@SerializedName("orderDetails")
	private List<OrderDetails> orderDetails;
	public CreateStorageGatewayRequest() {
		super("Ens", "2017-11-10", "CreateStorageGateway", "ens");
		setMethod(MethodType.POST);
	}

	public List<OrderDetails> getOrderDetails() {
		return this.orderDetails;
	}

	public void setOrderDetails(List<OrderDetails> orderDetails) {
		this.orderDetails = orderDetails;	
		if (orderDetails != null) {
			putQueryParameter("OrderDetails" , new Gson().toJson(orderDetails));
		}	
	}

	public static class OrderDetails {

		@SerializedName("GatewayType")
		private String gatewayType;

		@SerializedName("VpcId")
		private String vpcId;

		@SerializedName("GatewayName")
		private String gatewayName;

		@SerializedName("EnsRegionId")
		private String ensRegionId;

		@SerializedName("Description")
		private String description;

		public String getGatewayType() {
			return this.gatewayType;
		}

		public void setGatewayType(String gatewayType) {
			this.gatewayType = gatewayType;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getGatewayName() {
			return this.gatewayName;
		}

		public void setGatewayName(String gatewayName) {
			this.gatewayName = gatewayName;
		}

		public String getEnsRegionId() {
			return this.ensRegionId;
		}

		public void setEnsRegionId(String ensRegionId) {
			this.ensRegionId = ensRegionId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

	@Override
	public Class<CreateStorageGatewayResponse> getResponseClass() {
		return CreateStorageGatewayResponse.class;
	}

}
