/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.sas_api.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GetIpProfileRequest extends RpcAcsRequest<GetIpProfileResponse> {
	
	public GetIpProfileRequest() {
		super("Sas-api", "2017-07-05", "GetIpProfile");
	}

	private String deviceIdMd5;

	private Integer carrier;

	private String os;

	private String requestUrl;

	private String ip;

	private String userAgent;

	private Integer connectionType;

	private Integer sensType;

	private Integer deviceType;

	private Integer businessType;

	public String getDeviceIdMd5() {
		return this.deviceIdMd5;
	}

	public void setDeviceIdMd5(String deviceIdMd5) {
		this.deviceIdMd5 = deviceIdMd5;
		if(deviceIdMd5 != null){
			putQueryParameter("DeviceIdMd5", deviceIdMd5);
		}
	}

	public Integer getCarrier() {
		return this.carrier;
	}

	public void setCarrier(Integer carrier) {
		this.carrier = carrier;
		if(carrier != null){
			putQueryParameter("Carrier", carrier.toString());
		}
	}

	public String getOs() {
		return this.os;
	}

	public void setOs(String os) {
		this.os = os;
		if(os != null){
			putQueryParameter("Os", os);
		}
	}

	public String getRequestUrl() {
		return this.requestUrl;
	}

	public void setRequestUrl(String requestUrl) {
		this.requestUrl = requestUrl;
		if(requestUrl != null){
			putQueryParameter("RequestUrl", requestUrl);
		}
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
		if(ip != null){
			putQueryParameter("Ip", ip);
		}
	}

	public String getUserAgent() {
		return this.userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
		if(userAgent != null){
			putQueryParameter("UserAgent", userAgent);
		}
	}

	public Integer getConnectionType() {
		return this.connectionType;
	}

	public void setConnectionType(Integer connectionType) {
		this.connectionType = connectionType;
		if(connectionType != null){
			putQueryParameter("ConnectionType", connectionType.toString());
		}
	}

	public Integer getSensType() {
		return this.sensType;
	}

	public void setSensType(Integer sensType) {
		this.sensType = sensType;
		if(sensType != null){
			putQueryParameter("SensType", sensType.toString());
		}
	}

	public Integer getDeviceType() {
		return this.deviceType;
	}

	public void setDeviceType(Integer deviceType) {
		this.deviceType = deviceType;
		if(deviceType != null){
			putQueryParameter("DeviceType", deviceType.toString());
		}
	}

	public Integer getBusinessType() {
		return this.businessType;
	}

	public void setBusinessType(Integer businessType) {
		this.businessType = businessType;
		if(businessType != null){
			putQueryParameter("BusinessType", businessType.toString());
		}
	}

	@Override
	public Class<GetIpProfileResponse> getResponseClass() {
		return GetIpProfileResponse.class;
	}

}
