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
public class CreateOTAFirmwareRequest extends RpcAcsRequest<CreateOTAFirmwareResponse> {
	   

	private String signMethod;

	private Integer type;

	private String firmwareUrl;

	private String iotInstanceId;

	private String firmwareDesc;

	private String moduleName;

	private String firmwareSign;

	private Integer firmwareSize;

	private String firmwareName;

	private String productKey;

	private String srcVersion;

	private String destVersion;
	public CreateOTAFirmwareRequest() {
		super("Iot", "2018-01-20", "CreateOTAFirmware", "Iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSignMethod() {
		return this.signMethod;
	}

	public void setSignMethod(String signMethod) {
		this.signMethod = signMethod;
		if(signMethod != null){
			putQueryParameter("SignMethod", signMethod);
		}
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type.toString());
		}
	}

	public String getFirmwareUrl() {
		return this.firmwareUrl;
	}

	public void setFirmwareUrl(String firmwareUrl) {
		this.firmwareUrl = firmwareUrl;
		if(firmwareUrl != null){
			putQueryParameter("FirmwareUrl", firmwareUrl);
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

	public String getFirmwareDesc() {
		return this.firmwareDesc;
	}

	public void setFirmwareDesc(String firmwareDesc) {
		this.firmwareDesc = firmwareDesc;
		if(firmwareDesc != null){
			putQueryParameter("FirmwareDesc", firmwareDesc);
		}
	}

	public String getModuleName() {
		return this.moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
		if(moduleName != null){
			putQueryParameter("ModuleName", moduleName);
		}
	}

	public String getFirmwareSign() {
		return this.firmwareSign;
	}

	public void setFirmwareSign(String firmwareSign) {
		this.firmwareSign = firmwareSign;
		if(firmwareSign != null){
			putQueryParameter("FirmwareSign", firmwareSign);
		}
	}

	public Integer getFirmwareSize() {
		return this.firmwareSize;
	}

	public void setFirmwareSize(Integer firmwareSize) {
		this.firmwareSize = firmwareSize;
		if(firmwareSize != null){
			putQueryParameter("FirmwareSize", firmwareSize.toString());
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

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
		if(productKey != null){
			putQueryParameter("ProductKey", productKey);
		}
	}

	public String getSrcVersion() {
		return this.srcVersion;
	}

	public void setSrcVersion(String srcVersion) {
		this.srcVersion = srcVersion;
		if(srcVersion != null){
			putQueryParameter("SrcVersion", srcVersion);
		}
	}

	public String getDestVersion() {
		return this.destVersion;
	}

	public void setDestVersion(String destVersion) {
		this.destVersion = destVersion;
		if(destVersion != null){
			putQueryParameter("DestVersion", destVersion);
		}
	}

	@Override
	public Class<CreateOTAFirmwareResponse> getResponseClass() {
		return CreateOTAFirmwareResponse.class;
	}

}
