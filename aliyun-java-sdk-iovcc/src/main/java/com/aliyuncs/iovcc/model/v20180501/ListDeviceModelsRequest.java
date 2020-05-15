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
public class ListDeviceModelsRequest extends RpcAcsRequest<ListDeviceModelsResponse> {
	   

	private String deviceBrand;

	private Integer deviceModelId;

	private String projectId;

	private Long deviceBrandId;

	private String deviceModel;

	private String length;

	private String start;
	public ListDeviceModelsRequest() {
		super("iovcc", "2018-05-01", "ListDeviceModels", "iovcc");
		setMethod(MethodType.GET);
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

	public Integer getDeviceModelId() {
		return this.deviceModelId;
	}

	public void setDeviceModelId(Integer deviceModelId) {
		this.deviceModelId = deviceModelId;
		if(deviceModelId != null){
			putQueryParameter("DeviceModelId", deviceModelId.toString());
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

	public Long getDeviceBrandId() {
		return this.deviceBrandId;
	}

	public void setDeviceBrandId(Long deviceBrandId) {
		this.deviceBrandId = deviceBrandId;
		if(deviceBrandId != null){
			putQueryParameter("DeviceBrandId", deviceBrandId.toString());
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

	public String getLength() {
		return this.length;
	}

	public void setLength(String length) {
		this.length = length;
		if(length != null){
			putQueryParameter("Length", length);
		}
	}

	public String getStart() {
		return this.start;
	}

	public void setStart(String start) {
		this.start = start;
		if(start != null){
			putQueryParameter("Start", start);
		}
	}

	@Override
	public Class<ListDeviceModelsResponse> getResponseClass() {
		return ListDeviceModelsResponse.class;
	}

}
