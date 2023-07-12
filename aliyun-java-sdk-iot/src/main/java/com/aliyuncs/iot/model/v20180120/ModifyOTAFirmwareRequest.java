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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyOTAFirmwareRequest extends RpcAcsRequest<ModifyOTAFirmwareResponse> {
	   

	private String firmwareUdi;

	private String firmwareDesc;

	private String iotInstanceId;

	private String firmwareName;

	private String firmwareId;

	private String productKey;
	public ModifyOTAFirmwareRequest() {
		super("Iot", "2018-01-20", "ModifyOTAFirmware");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFirmwareUdi() {
		return this.firmwareUdi;
	}

	public void setFirmwareUdi(String firmwareUdi) {
		this.firmwareUdi = firmwareUdi;
		if(firmwareUdi != null){
			putQueryParameter("FirmwareUdi", firmwareUdi);
		}
	}

	public String getFirmwareDesc() {
		return this.firmwareDesc;
	}

	public void setFirmwareDesc(String firmwareDesc) {
		this.firmwareDesc = firmwareDesc;
		if(firmwareDesc != null){
			putQueryParameter("FirmwareDesc", firmwareDesc);
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

	public String getFirmwareName() {
		return this.firmwareName;
	}

	public void setFirmwareName(String firmwareName) {
		this.firmwareName = firmwareName;
		if(firmwareName != null){
			putQueryParameter("FirmwareName", firmwareName);
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

	@Override
	public Class<ModifyOTAFirmwareResponse> getResponseClass() {
		return ModifyOTAFirmwareResponse.class;
	}

}
