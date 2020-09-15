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
public class UpdateSubscribeRelationRequest extends RpcAcsRequest<UpdateSubscribeRelationResponse> {
	   

	private Boolean otaEventFlag;

	private Boolean deviceTopoLifeCycleFlag;

	private String type;

	private Boolean deviceLifeCycleFlag;

	private String iotInstanceId;

	private Boolean deviceStatusChangeFlag;

	private Boolean otaVersionFlag;

	private Boolean deviceTagFlag;

	private List<String> consumerGroupIdss;

	private String productKey;

	private Boolean thingHistoryFlag;

	private Boolean foundDeviceListFlag;

	private Boolean otaJobFlag;

	private Boolean deviceDataFlag;

	private String mnsConfiguration;
	public UpdateSubscribeRelationRequest() {
		super("Iot", "2018-01-20", "UpdateSubscribeRelation", "iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getOtaEventFlag() {
		return this.otaEventFlag;
	}

	public void setOtaEventFlag(Boolean otaEventFlag) {
		this.otaEventFlag = otaEventFlag;
		if(otaEventFlag != null){
			putQueryParameter("OtaEventFlag", otaEventFlag.toString());
		}
	}

	public Boolean getDeviceTopoLifeCycleFlag() {
		return this.deviceTopoLifeCycleFlag;
	}

	public void setDeviceTopoLifeCycleFlag(Boolean deviceTopoLifeCycleFlag) {
		this.deviceTopoLifeCycleFlag = deviceTopoLifeCycleFlag;
		if(deviceTopoLifeCycleFlag != null){
			putQueryParameter("DeviceTopoLifeCycleFlag", deviceTopoLifeCycleFlag.toString());
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public Boolean getDeviceLifeCycleFlag() {
		return this.deviceLifeCycleFlag;
	}

	public void setDeviceLifeCycleFlag(Boolean deviceLifeCycleFlag) {
		this.deviceLifeCycleFlag = deviceLifeCycleFlag;
		if(deviceLifeCycleFlag != null){
			putQueryParameter("DeviceLifeCycleFlag", deviceLifeCycleFlag.toString());
		}
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

	public Boolean getDeviceStatusChangeFlag() {
		return this.deviceStatusChangeFlag;
	}

	public void setDeviceStatusChangeFlag(Boolean deviceStatusChangeFlag) {
		this.deviceStatusChangeFlag = deviceStatusChangeFlag;
		if(deviceStatusChangeFlag != null){
			putQueryParameter("DeviceStatusChangeFlag", deviceStatusChangeFlag.toString());
		}
	}

	public Boolean getOtaVersionFlag() {
		return this.otaVersionFlag;
	}

	public void setOtaVersionFlag(Boolean otaVersionFlag) {
		this.otaVersionFlag = otaVersionFlag;
		if(otaVersionFlag != null){
			putQueryParameter("OtaVersionFlag", otaVersionFlag.toString());
		}
	}

	public Boolean getDeviceTagFlag() {
		return this.deviceTagFlag;
	}

	public void setDeviceTagFlag(Boolean deviceTagFlag) {
		this.deviceTagFlag = deviceTagFlag;
		if(deviceTagFlag != null){
			putQueryParameter("DeviceTagFlag", deviceTagFlag.toString());
		}
	}

	public List<String> getConsumerGroupIdss() {
		return this.consumerGroupIdss;
	}

	public void setConsumerGroupIdss(List<String> consumerGroupIdss) {
		this.consumerGroupIdss = consumerGroupIdss;	
		if (consumerGroupIdss != null) {
			for (int i = 0; i < consumerGroupIdss.size(); i++) {
				putQueryParameter("ConsumerGroupIds." + (i + 1) , consumerGroupIdss.get(i));
			}
		}	
	}

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
		if(productKey != null){
			putQueryParameter("ProductKey", productKey);
		}
	}

	public Boolean getThingHistoryFlag() {
		return this.thingHistoryFlag;
	}

	public void setThingHistoryFlag(Boolean thingHistoryFlag) {
		this.thingHistoryFlag = thingHistoryFlag;
		if(thingHistoryFlag != null){
			putQueryParameter("ThingHistoryFlag", thingHistoryFlag.toString());
		}
	}

	public Boolean getFoundDeviceListFlag() {
		return this.foundDeviceListFlag;
	}

	public void setFoundDeviceListFlag(Boolean foundDeviceListFlag) {
		this.foundDeviceListFlag = foundDeviceListFlag;
		if(foundDeviceListFlag != null){
			putQueryParameter("FoundDeviceListFlag", foundDeviceListFlag.toString());
		}
	}

	public Boolean getOtaJobFlag() {
		return this.otaJobFlag;
	}

	public void setOtaJobFlag(Boolean otaJobFlag) {
		this.otaJobFlag = otaJobFlag;
		if(otaJobFlag != null){
			putQueryParameter("OtaJobFlag", otaJobFlag.toString());
		}
	}

	public Boolean getDeviceDataFlag() {
		return this.deviceDataFlag;
	}

	public void setDeviceDataFlag(Boolean deviceDataFlag) {
		this.deviceDataFlag = deviceDataFlag;
		if(deviceDataFlag != null){
			putQueryParameter("DeviceDataFlag", deviceDataFlag.toString());
		}
	}

	public String getMnsConfiguration() {
		return this.mnsConfiguration;
	}

	public void setMnsConfiguration(String mnsConfiguration) {
		this.mnsConfiguration = mnsConfiguration;
		if(mnsConfiguration != null){
			putQueryParameter("MnsConfiguration", mnsConfiguration);
		}
	}

	@Override
	public Class<UpdateSubscribeRelationResponse> getResponseClass() {
		return UpdateSubscribeRelationResponse.class;
	}

}
