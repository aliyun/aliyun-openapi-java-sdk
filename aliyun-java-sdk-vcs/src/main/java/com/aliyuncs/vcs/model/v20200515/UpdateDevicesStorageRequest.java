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
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vcs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateDevicesStorageRequest extends RpcAcsRequest<UpdateDevicesStorageResponse> {
	   

	@SerializedName("updateStorageRequests")
	private List<UpdateStorageRequests> updateStorageRequests;
	public UpdateDevicesStorageRequest() {
		super("Vcs", "2020-05-15", "UpdateDevicesStorage");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<UpdateStorageRequests> getUpdateStorageRequests() {
		return this.updateStorageRequests;
	}

	public void setUpdateStorageRequests(List<UpdateStorageRequests> updateStorageRequests) {
		this.updateStorageRequests = updateStorageRequests;	
		if (updateStorageRequests != null) {
			putBodyParameter("UpdateStorageRequests" , new Gson().toJson(updateStorageRequests));
		}	
	}

	public static class UpdateStorageRequests {

		@SerializedName("StorageDays")
		private List<StorageDaysItem> storageDays;

		@SerializedName("DeviceIds")
		private String deviceIds;

		public List<StorageDaysItem> getStorageDays() {
			return this.storageDays;
		}

		public void setStorageDays(List<StorageDaysItem> storageDays) {
			this.storageDays = storageDays;
		}

		public String getDeviceIds() {
			return this.deviceIds;
		}

		public void setDeviceIds(String deviceIds) {
			this.deviceIds = deviceIds;
		}

		public static class StorageDaysItem {

			@SerializedName("StorageDays")
			private Long storageDays;

			@SerializedName("StorageType")
			private String storageType;

			public Long getStorageDays() {
				return this.storageDays;
			}

			public void setStorageDays(Long storageDays) {
				this.storageDays = storageDays;
			}

			public String getStorageType() {
				return this.storageType;
			}

			public void setStorageType(String storageType) {
				this.storageType = storageType;
			}
		}
	}

	@Override
	public Class<UpdateDevicesStorageResponse> getResponseClass() {
		return UpdateDevicesStorageResponse.class;
	}

}
