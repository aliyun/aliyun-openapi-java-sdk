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
public class UpdateAiotDeviceRequest extends RpcAcsRequest<UpdateAiotDeviceResponse> {
	   

	@SerializedName("aiotDevice")
	private AiotDevice aiotDevice;

	private String id;
	public UpdateAiotDeviceRequest() {
		super("Vcs", "2020-05-15", "UpdateAiotDevice");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public AiotDevice getAiotDevice() {
		return this.aiotDevice;
	}

	public void setAiotDevice(AiotDevice aiotDevice) {
		this.aiotDevice = aiotDevice;	
		if (aiotDevice != null) {
			putBodyParameter("AiotDevice" , new Gson().toJson(aiotDevice));
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

	public static class AiotDevice {

		@SerializedName("Port")
		private Long port;

		@SerializedName("Latitude")
		private Float latitude;

		@SerializedName("Name")
		private String name;

		@SerializedName("Place")
		private String place;

		@SerializedName("IPAddr")
		private String iPAddr;

		@SerializedName("Longitude")
		private Float longitude;

		public Long getPort() {
			return this.port;
		}

		public void setPort(Long port) {
			this.port = port;
		}

		public Float getLatitude() {
			return this.latitude;
		}

		public void setLatitude(Float latitude) {
			this.latitude = latitude;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPlace() {
			return this.place;
		}

		public void setPlace(String place) {
			this.place = place;
		}

		public String getIPAddr() {
			return this.iPAddr;
		}

		public void setIPAddr(String iPAddr) {
			this.iPAddr = iPAddr;
		}

		public Float getLongitude() {
			return this.longitude;
		}

		public void setLongitude(Float longitude) {
			this.longitude = longitude;
		}
	}

	@Override
	public Class<UpdateAiotDeviceResponse> getResponseClass() {
		return UpdateAiotDeviceResponse.class;
	}

}
