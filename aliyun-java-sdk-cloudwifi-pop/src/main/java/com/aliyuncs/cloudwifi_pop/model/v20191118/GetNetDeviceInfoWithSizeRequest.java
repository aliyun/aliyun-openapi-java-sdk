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

package com.aliyuncs.cloudwifi_pop.model.v20191118;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudwifi_pop.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetNetDeviceInfoWithSizeRequest extends RpcAcsRequest<GetNetDeviceInfoWithSizeResponse> {
	   

	private Long cursor;

	private String role;

	private String idc;

	private String mgnIp;

	private String manufacturer;

	private String password;

	private String netPod;

	private String hostName;

	private String appName;

	private String requestId;

	private String serviceTag;

	private Integer pageSize;

	private String appCode;

	private String model;

	private Long id;

	private String logicNetPod;

	private String username;
	public GetNetDeviceInfoWithSizeRequest() {
		super("cloudwifi-pop", "2019-11-18", "GetNetDeviceInfoWithSize", "cloudap");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getCursor() {
		return this.cursor;
	}

	public void setCursor(Long cursor) {
		this.cursor = cursor;
		if(cursor != null){
			putQueryParameter("Cursor", cursor.toString());
		}
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
		if(role != null){
			putQueryParameter("Role", role);
		}
	}

	public String getIdc() {
		return this.idc;
	}

	public void setIdc(String idc) {
		this.idc = idc;
		if(idc != null){
			putQueryParameter("Idc", idc);
		}
	}

	public String getMgnIp() {
		return this.mgnIp;
	}

	public void setMgnIp(String mgnIp) {
		this.mgnIp = mgnIp;
		if(mgnIp != null){
			putQueryParameter("MgnIp", mgnIp);
		}
	}

	public String getManufacturer() {
		return this.manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
		if(manufacturer != null){
			putQueryParameter("Manufacturer", manufacturer);
		}
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
		if(password != null){
			putQueryParameter("Password", password);
		}
	}

	public String getNetPod() {
		return this.netPod;
	}

	public void setNetPod(String netPod) {
		this.netPod = netPod;
		if(netPod != null){
			putQueryParameter("NetPod", netPod);
		}
	}

	public String getHostName() {
		return this.hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
		if(hostName != null){
			putQueryParameter("HostName", hostName);
		}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putQueryParameter("AppName", appName);
		}
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
		if(requestId != null){
			putQueryParameter("RequestId", requestId);
		}
	}

	public String getServiceTag() {
		return this.serviceTag;
	}

	public void setServiceTag(String serviceTag) {
		this.serviceTag = serviceTag;
		if(serviceTag != null){
			putQueryParameter("ServiceTag", serviceTag);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getAppCode() {
		return this.appCode;
	}

	public void setAppCode(String appCode) {
		this.appCode = appCode;
		if(appCode != null){
			putQueryParameter("AppCode", appCode);
		}
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
		if(model != null){
			putQueryParameter("Model", model);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
		}
	}

	public String getLogicNetPod() {
		return this.logicNetPod;
	}

	public void setLogicNetPod(String logicNetPod) {
		this.logicNetPod = logicNetPod;
		if(logicNetPod != null){
			putQueryParameter("LogicNetPod", logicNetPod);
		}
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
		if(username != null){
			putQueryParameter("Username", username);
		}
	}

	@Override
	public Class<GetNetDeviceInfoWithSizeResponse> getResponseClass() {
		return GetNetDeviceInfoWithSizeResponse.class;
	}

}
