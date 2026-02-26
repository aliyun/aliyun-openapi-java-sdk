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
public class AddDeviceToSharePromotionRequest extends RpcAcsRequest<AddDeviceToSharePromotionResponse> {
	   

	private String sharePromotionActivityId;

	private List<DeviceSimpleInfoList> deviceSimpleInfoLists;

	private String iotInstanceId;

	private String shareTaskCode;
	public AddDeviceToSharePromotionRequest() {
		super("Iot", "2018-01-20", "AddDeviceToSharePromotion", "iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSharePromotionActivityId() {
		return this.sharePromotionActivityId;
	}

	public void setSharePromotionActivityId(String sharePromotionActivityId) {
		this.sharePromotionActivityId = sharePromotionActivityId;
		if(sharePromotionActivityId != null){
			putBodyParameter("SharePromotionActivityId", sharePromotionActivityId);
		}
	}

	public List<DeviceSimpleInfoList> getDeviceSimpleInfoLists() {
		return this.deviceSimpleInfoLists;
	}

	public void setDeviceSimpleInfoLists(List<DeviceSimpleInfoList> deviceSimpleInfoLists) {
		this.deviceSimpleInfoLists = deviceSimpleInfoLists;	
		if (deviceSimpleInfoLists != null) {
			for (int depth1 = 0; depth1 < deviceSimpleInfoLists.size(); depth1++) {
				putBodyParameter("DeviceSimpleInfoList." + (depth1 + 1) + ".DeviceName" , deviceSimpleInfoLists.get(depth1).getDeviceName());
				putBodyParameter("DeviceSimpleInfoList." + (depth1 + 1) + ".ProductKey" , deviceSimpleInfoLists.get(depth1).getProductKey());
			}
		}	
	}

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putBodyParameter("IotInstanceId", iotInstanceId);
		}
	}

	public String getShareTaskCode() {
		return this.shareTaskCode;
	}

	public void setShareTaskCode(String shareTaskCode) {
		this.shareTaskCode = shareTaskCode;
		if(shareTaskCode != null){
			putBodyParameter("ShareTaskCode", shareTaskCode);
		}
	}

	public static class DeviceSimpleInfoList {

		private String deviceName;

		private String productKey;

		public String getDeviceName() {
			return this.deviceName;
		}

		public void setDeviceName(String deviceName) {
			this.deviceName = deviceName;
		}

		public String getProductKey() {
			return this.productKey;
		}

		public void setProductKey(String productKey) {
			this.productKey = productKey;
		}
	}

	@Override
	public Class<AddDeviceToSharePromotionResponse> getResponseClass() {
		return AddDeviceToSharePromotionResponse.class;
	}

}
