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

package com.aliyuncs.vcs.model.v20200515;

import com.aliyuncs.RpcAcsRequest;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vcs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateAiotVehicleTableItemRequest extends RpcAcsRequest<UpdateAiotVehicleTableItemResponse> {
	   

	private String vehicleTableId;

	@SerializedName("vehicleTableItem")
	private VehicleTableItem vehicleTableItem;

	private String id;
	public UpdateAiotVehicleTableItemRequest() {
		super("Vcs", "2020-05-15", "UpdateAiotVehicleTableItem");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getVehicleTableId() {
		return this.vehicleTableId;
	}

	public void setVehicleTableId(String vehicleTableId) {
		this.vehicleTableId = vehicleTableId;
		if(vehicleTableId != null){
			putBodyParameter("VehicleTableId", vehicleTableId);
		}
	}

	public VehicleTableItem getVehicleTableItem() {
		return this.vehicleTableItem;
	}

	public void setVehicleTableItem(VehicleTableItem vehicleTableItem) {
		this.vehicleTableItem = vehicleTableItem;	
		if (vehicleTableItem != null) {
			putBodyParameter("VehicleTableItem" , new Gson().toJson(vehicleTableItem));
		}	
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id);
		}
	}

	public static class VehicleTableItem {

		@SerializedName("VehicleTableItemId")
		private String vehicleTableItemId;

		@SerializedName("PlateNo")
		private String plateNo;

		@SerializedName("OwnerName")
		private String ownerName;

		@SerializedName("EndTime")
		private String endTime;

		@SerializedName("BeginTime")
		private String beginTime;

		@SerializedName("PhoneNo")
		private String phoneNo;

		@SerializedName("Remarks")
		private String remarks;

		public String getVehicleTableItemId() {
			return this.vehicleTableItemId;
		}

		public void setVehicleTableItemId(String vehicleTableItemId) {
			this.vehicleTableItemId = vehicleTableItemId;
		}

		public String getPlateNo() {
			return this.plateNo;
		}

		public void setPlateNo(String plateNo) {
			this.plateNo = plateNo;
		}

		public String getOwnerName() {
			return this.ownerName;
		}

		public void setOwnerName(String ownerName) {
			this.ownerName = ownerName;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getBeginTime() {
			return this.beginTime;
		}

		public void setBeginTime(String beginTime) {
			this.beginTime = beginTime;
		}

		public String getPhoneNo() {
			return this.phoneNo;
		}

		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}

		public String getRemarks() {
			return this.remarks;
		}

		public void setRemarks(String remarks) {
			this.remarks = remarks;
		}
	}

	@Override
	public Class<UpdateAiotVehicleTableItemResponse> getResponseClass() {
		return UpdateAiotVehicleTableItemResponse.class;
	}

}
