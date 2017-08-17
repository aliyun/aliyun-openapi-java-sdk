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
package com.aliyuncs.cloudwf.model.v20170328;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DeviceCreateRequest extends RpcAcsRequest<DeviceCreateResponse> {
	
	public DeviceCreateRequest() {
		super("cloudwf", "2017-03-28", "DeviceCreate");
	}

	private String deviceNum;

	private String devicePosition;

	private String deviceName;

	private Integer deviceType;

	private Long sid;

	public String getDeviceNum() {
		return this.deviceNum;
	}

	public void setDeviceNum(String deviceNum) {
		this.deviceNum = deviceNum;
		if(deviceNum != null){
			putQueryParameter("DeviceNum", deviceNum);
		}
	}

	public String getDevicePosition() {
		return this.devicePosition;
	}

	public void setDevicePosition(String devicePosition) {
		this.devicePosition = devicePosition;
		if(devicePosition != null){
			putQueryParameter("DevicePosition", devicePosition);
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

	public Integer getDeviceType() {
		return this.deviceType;
	}

	public void setDeviceType(Integer deviceType) {
		this.deviceType = deviceType;
		if(deviceType != null){
			putQueryParameter("DeviceType", deviceType.toString());
		}
	}

	public Long getSid() {
		return this.sid;
	}

	public void setSid(Long sid) {
		this.sid = sid;
		if(sid != null){
			putQueryParameter("Sid", sid.toString());
		}
	}

	@Override
	public Class<DeviceCreateResponse> getResponseClass() {
		return DeviceCreateResponse.class;
	}

}
