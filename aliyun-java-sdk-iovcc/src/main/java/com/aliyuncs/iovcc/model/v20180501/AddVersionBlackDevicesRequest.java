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
public class AddVersionBlackDevicesRequest extends RpcAcsRequest<AddVersionBlackDevicesResponse> {
	   

	private String deviceIds;

	private String deviceIdType;

	private String versionId;

	private String versionType;

	private String projectId;
	public AddVersionBlackDevicesRequest() {
		super("iovcc", "2018-05-01", "AddVersionBlackDevices", "iovcc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDeviceIds() {
		return this.deviceIds;
	}

	public void setDeviceIds(String deviceIds) {
		this.deviceIds = deviceIds;
		if(deviceIds != null){
			putQueryParameter("DeviceIds", deviceIds);
		}
	}

	public String getDeviceIdType() {
		return this.deviceIdType;
	}

	public void setDeviceIdType(String deviceIdType) {
		this.deviceIdType = deviceIdType;
		if(deviceIdType != null){
			putQueryParameter("DeviceIdType", deviceIdType);
		}
	}

	public String getVersionId() {
		return this.versionId;
	}

	public void setVersionId(String versionId) {
		this.versionId = versionId;
		if(versionId != null){
			putQueryParameter("VersionId", versionId);
		}
	}

	public String getVersionType() {
		return this.versionType;
	}

	public void setVersionType(String versionType) {
		this.versionType = versionType;
		if(versionType != null){
			putQueryParameter("VersionType", versionType);
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

	@Override
	public Class<AddVersionBlackDevicesResponse> getResponseClass() {
		return AddVersionBlackDevicesResponse.class;
	}

}
