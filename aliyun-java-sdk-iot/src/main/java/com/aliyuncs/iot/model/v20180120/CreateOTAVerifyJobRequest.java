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
public class CreateOTAVerifyJobRequest extends RpcAcsRequest<CreateOTAVerifyJobResponse> {
	   

	private Integer timeoutInMinutes;

	private Boolean needConfirm;

	private Boolean needPush;

	private String iotInstanceId;

	private List<Tag> tags;

	private String firmwareId;

	private String productKey;

	private List<String> targetDeviceNames;
	public CreateOTAVerifyJobRequest() {
		super("Iot", "2018-01-20", "CreateOTAVerifyJob", "iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getTimeoutInMinutes() {
		return this.timeoutInMinutes;
	}

	public void setTimeoutInMinutes(Integer timeoutInMinutes) {
		this.timeoutInMinutes = timeoutInMinutes;
		if(timeoutInMinutes != null){
			putQueryParameter("TimeoutInMinutes", timeoutInMinutes.toString());
		}
	}

	public Boolean getNeedConfirm() {
		return this.needConfirm;
	}

	public void setNeedConfirm(Boolean needConfirm) {
		this.needConfirm = needConfirm;
		if(needConfirm != null){
			putQueryParameter("NeedConfirm", needConfirm.toString());
		}
	}

	public Boolean getNeedPush() {
		return this.needPush;
	}

	public void setNeedPush(Boolean needPush) {
		this.needPush = needPush;
		if(needPush != null){
			putQueryParameter("NeedPush", needPush.toString());
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

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
			}
		}	
	}

	public String getFirmwareId() {
		return this.firmwareId;
	}

	public void setFirmwareId(String firmwareId) {
		this.firmwareId = firmwareId;
		if(firmwareId != null){
			putQueryParameter("FirmwareId", firmwareId);
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

	public List<String> getTargetDeviceNames() {
		return this.targetDeviceNames;
	}

	public void setTargetDeviceNames(List<String> targetDeviceNames) {
		this.targetDeviceNames = targetDeviceNames;	
		if (targetDeviceNames != null) {
			for (int i = 0; i < targetDeviceNames.size(); i++) {
				putQueryParameter("TargetDeviceName." + (i + 1) , targetDeviceNames.get(i));
			}
		}	
	}

	public static class Tag {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<CreateOTAVerifyJobResponse> getResponseClass() {
		return CreateOTAVerifyJobResponse.class;
	}

}
