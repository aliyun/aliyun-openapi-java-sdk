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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GisQueryDeviceLocationRequest extends RpcAcsRequest<GisQueryDeviceLocationResponse> {
	   

	private String iotInstanceId;

	private List<ThingList> thingLists;
	public GisQueryDeviceLocationRequest() {
		super("Iot", "2018-01-20", "GisQueryDeviceLocation");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putQueryParameter("IotInstanceId", iotInstanceId);
		}
	}

	public List<ThingList> getThingLists() {
		return this.thingLists;
	}

	public void setThingLists(List<ThingList> thingLists) {
		this.thingLists = thingLists;	
		if (thingLists != null) {
			for (int depth1 = 0; depth1 < thingLists.size(); depth1++) {
				putQueryParameter("ThingList." + (depth1 + 1) + ".ProductKey" , thingLists.get(depth1).getProductKey());
				putQueryParameter("ThingList." + (depth1 + 1) + ".DeviceName" , thingLists.get(depth1).getDeviceName());
			}
		}	
	}

	public static class ThingList {

		private String productKey;

		private String deviceName;

		public String getProductKey() {
			return this.productKey;
		}

		public void setProductKey(String productKey) {
			this.productKey = productKey;
		}

		public String getDeviceName() {
			return this.deviceName;
		}

		public void setDeviceName(String deviceName) {
			this.deviceName = deviceName;
		}
	}

	@Override
	public Class<GisQueryDeviceLocationResponse> getResponseClass() {
		return GisQueryDeviceLocationResponse.class;
	}

}
