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

package com.aliyuncs.wyota.model.v20210420;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListDevicesRequest extends RpcAcsRequest<ListDevicesResponse> {
	   

	private Integer clientType;

	private String buildId;

	private String uuid;

	private Integer pageNumber;

	private String serialNo;

	private Integer pageSize;

	private String alias;

	private String endUserId;

	private String model;

	private String deviceGroupId;

	private String deviceIpV4;

	private String deviceOS;

	private String labelContent;

	private String userType;

	private String devicePlatform;

	private String locationInfo;

	private String labelId;

	private String deviceName;
	public ListDevicesRequest() {
		super("wyota", "2021-04-20", "ListDevices");
		setMethod(MethodType.POST);
	}

	public Integer getClientType() {
		return this.clientType;
	}

	public void setClientType(Integer clientType) {
		this.clientType = clientType;
		if(clientType != null){
			putQueryParameter("ClientType", clientType.toString());
		}
	}

	public String getBuildId() {
		return this.buildId;
	}

	public void setBuildId(String buildId) {
		this.buildId = buildId;
		if(buildId != null){
			putBodyParameter("BuildId", buildId);
		}
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
		if(uuid != null){
			putBodyParameter("Uuid", uuid);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getSerialNo() {
		return this.serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
		if(serialNo != null){
			putBodyParameter("SerialNo", serialNo);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getAlias() {
		return this.alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
		if(alias != null){
			putBodyParameter("Alias", alias);
		}
	}

	public String getEndUserId() {
		return this.endUserId;
	}

	public void setEndUserId(String endUserId) {
		this.endUserId = endUserId;
		if(endUserId != null){
			putBodyParameter("EndUserId", endUserId);
		}
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
		if(model != null){
			putBodyParameter("Model", model);
		}
	}

	public String getDeviceGroupId() {
		return this.deviceGroupId;
	}

	public void setDeviceGroupId(String deviceGroupId) {
		this.deviceGroupId = deviceGroupId;
		if(deviceGroupId != null){
			putBodyParameter("DeviceGroupId", deviceGroupId);
		}
	}

	public String getDeviceIpV4() {
		return this.deviceIpV4;
	}

	public void setDeviceIpV4(String deviceIpV4) {
		this.deviceIpV4 = deviceIpV4;
		if(deviceIpV4 != null){
			putQueryParameter("DeviceIpV4", deviceIpV4);
		}
	}

	public String getDeviceOS() {
		return this.deviceOS;
	}

	public void setDeviceOS(String deviceOS) {
		this.deviceOS = deviceOS;
		if(deviceOS != null){
			putQueryParameter("DeviceOS", deviceOS);
		}
	}

	public String getLabelContent() {
		return this.labelContent;
	}

	public void setLabelContent(String labelContent) {
		this.labelContent = labelContent;
		if(labelContent != null){
			putBodyParameter("LabelContent", labelContent);
		}
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
		if(userType != null){
			putQueryParameter("UserType", userType);
		}
	}

	public String getDevicePlatform() {
		return this.devicePlatform;
	}

	public void setDevicePlatform(String devicePlatform) {
		this.devicePlatform = devicePlatform;
		if(devicePlatform != null){
			putQueryParameter("DevicePlatform", devicePlatform);
		}
	}

	public String getLocationInfo() {
		return this.locationInfo;
	}

	public void setLocationInfo(String locationInfo) {
		this.locationInfo = locationInfo;
		if(locationInfo != null){
			putQueryParameter("LocationInfo", locationInfo);
		}
	}

	public String getLabelId() {
		return this.labelId;
	}

	public void setLabelId(String labelId) {
		this.labelId = labelId;
		if(labelId != null){
			putBodyParameter("LabelId", labelId);
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

	@Override
	public Class<ListDevicesResponse> getResponseClass() {
		return ListDevicesResponse.class;
	}

}
