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
public class CreateFileSystemRequest extends RpcAcsRequest<CreateFileSystemResponse> {
	   

	@SerializedName("orderDetails")
	private List<OrderDetails> orderDetails;
	public CreateFileSystemRequest() {
		super("Ens", "2017-11-10", "CreateFileSystem", "ens");
		setMethod(MethodType.GET);
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

		@SerializedName("FileSystemName")
		private String fileSystemName;

		@SerializedName("EnsRegionId")
		private String ensRegionId;

		@SerializedName("MountTargetDomain")
		private String mountTargetDomain;

		@SerializedName("ProtocolType")
		private String protocolType;

		@SerializedName("NetworkId")
		private String networkId;

		@SerializedName("ChargeType")
		private String chargeType;

		@SerializedName("StorgeType")
		private String storgeType;

		@SerializedName("OrderType")
		private String orderType;

		public String getFileSystemName() {
			return this.fileSystemName;
		}

		public void setFileSystemName(String fileSystemName) {
			this.fileSystemName = fileSystemName;
		}

		public String getEnsRegionId() {
			return this.ensRegionId;
		}

		public void setEnsRegionId(String ensRegionId) {
			this.ensRegionId = ensRegionId;
		}

		public String getMountTargetDomain() {
			return this.mountTargetDomain;
		}

		public void setMountTargetDomain(String mountTargetDomain) {
			this.mountTargetDomain = mountTargetDomain;
		}

		public String getProtocolType() {
			return this.protocolType;
		}

		public void setProtocolType(String protocolType) {
			this.protocolType = protocolType;
		}

		public String getNetworkId() {
			return this.networkId;
		}

		public void setNetworkId(String networkId) {
			this.networkId = networkId;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getStorgeType() {
			return this.storgeType;
		}

		public void setStorgeType(String storgeType) {
			this.storgeType = storgeType;
		}

		public String getOrderType() {
			return this.orderType;
		}

		public void setOrderType(String orderType) {
			this.orderType = orderType;
		}
	}

	@Override
	public Class<CreateFileSystemResponse> getResponseClass() {
		return CreateFileSystemResponse.class;
	}

}
