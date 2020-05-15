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

package com.aliyuncs.iovcc.model.v20180501;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iovcc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateDeviceModelRequest extends RpcAcsRequest<CreateDeviceModelResponse> {
	   

	private String canCreateDeviceId;

	private String osPlatform;

	private String modelName;

	private String description;

	private String brandName;

	private String deviceType;

	private String initUsageType;

	private String hardwareType;

	private String projectId;

	private String objectKey;

	private String deviceName;

	private String securityChip;
	public CreateDeviceModelRequest() {
		super("iovcc", "2018-05-01", "CreateDeviceModel", "iovcc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCanCreateDeviceId() {
		return this.canCreateDeviceId;
	}

	public void setCanCreateDeviceId(String canCreateDeviceId) {
		this.canCreateDeviceId = canCreateDeviceId;
		if(canCreateDeviceId != null){
			putQueryParameter("CanCreateDeviceId", canCreateDeviceId);
		}
	}

	public String getOsPlatform() {
		return this.osPlatform;
	}

	public void setOsPlatform(String osPlatform) {
		this.osPlatform = osPlatform;
		if(osPlatform != null){
			putQueryParameter("OsPlatform", osPlatform);
		}
	}

	public String getModelName() {
		return this.modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
		if(modelName != null){
			putQueryParameter("ModelName", modelName);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getBrandName() {
		return this.brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
		if(brandName != null){
			putQueryParameter("BrandName", brandName);
		}
	}

	public String getDeviceType() {
		return this.deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
		if(deviceType != null){
			putQueryParameter("DeviceType", deviceType);
		}
	}

	public String getInitUsageType() {
		return this.initUsageType;
	}

	public void setInitUsageType(String initUsageType) {
		this.initUsageType = initUsageType;
		if(initUsageType != null){
			putQueryParameter("InitUsageType", initUsageType);
		}
	}

	public String getHardwareType() {
		return this.hardwareType;
	}

	public void setHardwareType(String hardwareType) {
		this.hardwareType = hardwareType;
		if(hardwareType != null){
			putQueryParameter("HardwareType", hardwareType);
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putQueryParameter("ProjectId", projectId);
		}
	}

	public String getObjectKey() {
		return this.objectKey;
	}

	public void setObjectKey(String objectKey) {
		this.objectKey = objectKey;
		if(objectKey != null){
			putQueryParameter("ObjectKey", objectKey);
		}
	}

	public String getDeviceName() {
		return this.deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
		if(deviceName != null){
			putQueryParameter("DeviceName", deviceName);
		}
	}

	public String getSecurityChip() {
		return this.securityChip;
	}

	public void setSecurityChip(String securityChip) {
		this.securityChip = securityChip;
		if(securityChip != null){
			putQueryParameter("SecurityChip", securityChip);
		}
	}

	@Override
	public Class<CreateDeviceModelResponse> getResponseClass() {
		return CreateDeviceModelResponse.class;
	}

}
