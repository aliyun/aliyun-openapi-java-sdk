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
public class DeviceShowListRequest extends RpcAcsRequest<DeviceShowListResponse> {
	
	public DeviceShowListRequest() {
		super("cloudwf", "2017-03-28", "DeviceShowList");
	}

	private String dirc;

	private Integer page;

	private Integer per;

	private Integer deviceType;

	private Long sid;

	public String getDirc() {
		return this.dirc;
	}

	public void setDirc(String dirc) {
		this.dirc = dirc;
		if(dirc != null){
			putQueryParameter("Dirc", dirc);
		}
	}

	public Integer getPage() {
		return this.page;
	}

	public void setPage(Integer page) {
		this.page = page;
		if(page != null){
			putQueryParameter("Page", page.toString());
		}
	}

	public Integer getPer() {
		return this.per;
	}

	public void setPer(Integer per) {
		this.per = per;
		if(per != null){
			putQueryParameter("Per", per.toString());
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
	public Class<DeviceShowListResponse> getResponseClass() {
		return DeviceShowListResponse.class;
	}

}
