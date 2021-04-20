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
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vcs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteDeviceForInstanceRequest extends RpcAcsRequest<DeleteDeviceForInstanceResponse> {
	   

	private Boolean deleteInstanceFlag;

	private String instanceId;

	@SerializedName("devices")
	private List<Devices> devices;

	private String deviceCount;

	private String projectId;

	private String algorithmId;
	public DeleteDeviceForInstanceRequest() {
		super("Vcs", "2020-05-15", "DeleteDeviceForInstance");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getDeleteInstanceFlag() {
		return this.deleteInstanceFlag;
	}

	public void setDeleteInstanceFlag(Boolean deleteInstanceFlag) {
		this.deleteInstanceFlag = deleteInstanceFlag;
		if(deleteInstanceFlag != null){
			putBodyParameter("DeleteInstanceFlag", deleteInstanceFlag.toString());
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public List<Devices> getDevices() {
		return this.devices;
	}

	public void setDevices(List<Devices> devices) {
		this.devices = devices;	
		if (devices != null) {
			putBodyParameter("Devices" , new Gson().toJson(devices));
		}	
	}

	public String getDeviceCount() {
		return this.deviceCount;
	}

	public void setDeviceCount(String deviceCount) {
		this.deviceCount = deviceCount;
		if(deviceCount != null){
			putBodyParameter("DeviceCount", deviceCount);
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putBodyParameter("ProjectId", projectId);
		}
	}

	public String getAlgorithmId() {
		return this.algorithmId;
	}

	public void setAlgorithmId(String algorithmId) {
		this.algorithmId = algorithmId;
		if(algorithmId != null){
			putBodyParameter("AlgorithmId", algorithmId);
		}
	}

	public static class Devices {

		@SerializedName("RegionId")
		private String regionId;

		@SerializedName("DeviceId")
		private String deviceId;

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getDeviceId() {
			return this.deviceId;
		}

		public void setDeviceId(String deviceId) {
			this.deviceId = deviceId;
		}
	}

	@Override
	public Class<DeleteDeviceForInstanceResponse> getResponseClass() {
		return DeleteDeviceForInstanceResponse.class;
	}

}
