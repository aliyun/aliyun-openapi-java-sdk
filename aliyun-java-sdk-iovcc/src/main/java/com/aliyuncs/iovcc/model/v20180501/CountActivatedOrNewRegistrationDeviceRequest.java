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
public class CountActivatedOrNewRegistrationDeviceRequest extends RpcAcsRequest<CountActivatedOrNewRegistrationDeviceResponse> {
	   

	private String deviceBrand;

	private String isQueryNewRegistrationDevice;

	private String startTime;

	private String deviceType;

	private String deviceModelId;

	private String isQueryYearlyActivate;

	private String projectId;

	private String deviceBrandId;

	private String deviceModel;

	private String endTime;

	private String deviceCountStatType;
	public CountActivatedOrNewRegistrationDeviceRequest() {
		super("iovcc", "2018-05-01", "CountActivatedOrNewRegistrationDevice", "iovcc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDeviceBrand() {
		return this.deviceBrand;
	}

	public void setDeviceBrand(String deviceBrand) {
		this.deviceBrand = deviceBrand;
		if(deviceBrand != null){
			putQueryParameter("DeviceBrand", deviceBrand);
		}
	}

	public String getIsQueryNewRegistrationDevice() {
		return this.isQueryNewRegistrationDevice;
	}

	public void setIsQueryNewRegistrationDevice(String isQueryNewRegistrationDevice) {
		this.isQueryNewRegistrationDevice = isQueryNewRegistrationDevice;
		if(isQueryNewRegistrationDevice != null){
			putQueryParameter("IsQueryNewRegistrationDevice", isQueryNewRegistrationDevice);
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
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

	public String getDeviceModelId() {
		return this.deviceModelId;
	}

	public void setDeviceModelId(String deviceModelId) {
		this.deviceModelId = deviceModelId;
		if(deviceModelId != null){
			putQueryParameter("DeviceModelId", deviceModelId);
		}
	}

	public String getIsQueryYearlyActivate() {
		return this.isQueryYearlyActivate;
	}

	public void setIsQueryYearlyActivate(String isQueryYearlyActivate) {
		this.isQueryYearlyActivate = isQueryYearlyActivate;
		if(isQueryYearlyActivate != null){
			putQueryParameter("IsQueryYearlyActivate", isQueryYearlyActivate);
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

	public String getDeviceBrandId() {
		return this.deviceBrandId;
	}

	public void setDeviceBrandId(String deviceBrandId) {
		this.deviceBrandId = deviceBrandId;
		if(deviceBrandId != null){
			putQueryParameter("DeviceBrandId", deviceBrandId);
		}
	}

	public String getDeviceModel() {
		return this.deviceModel;
	}

	public void setDeviceModel(String deviceModel) {
		this.deviceModel = deviceModel;
		if(deviceModel != null){
			putQueryParameter("DeviceModel", deviceModel);
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
		}
	}

	public String getDeviceCountStatType() {
		return this.deviceCountStatType;
	}

	public void setDeviceCountStatType(String deviceCountStatType) {
		this.deviceCountStatType = deviceCountStatType;
		if(deviceCountStatType != null){
			putQueryParameter("DeviceCountStatType", deviceCountStatType);
		}
	}

	@Override
	public Class<CountActivatedOrNewRegistrationDeviceResponse> getResponseClass() {
		return CountActivatedOrNewRegistrationDeviceResponse.class;
	}

}
