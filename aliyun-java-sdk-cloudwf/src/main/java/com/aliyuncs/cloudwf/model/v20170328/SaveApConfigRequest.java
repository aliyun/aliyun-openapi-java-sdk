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
public class SaveApConfigRequest extends RpcAcsRequest<SaveApConfigResponse> {
	
	public SaveApConfigRequest() {
		super("cloudwf", "2017-03-28", "SaveApConfig");
	}

	private String country;

	private Long apAssetId;

	private Integer logLevel;

	private String name;

	private Integer echoInt;

	private Integer scan;

	private String description;

	private Long id;

	private String dai;

	private String logIp;

	private String mac;

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
		if(country != null){
			putQueryParameter("Country", country);
		}
	}

	public Long getApAssetId() {
		return this.apAssetId;
	}

	public void setApAssetId(Long apAssetId) {
		this.apAssetId = apAssetId;
		if(apAssetId != null){
			putQueryParameter("ApAssetId", apAssetId.toString());
		}
	}

	public Integer getLogLevel() {
		return this.logLevel;
	}

	public void setLogLevel(Integer logLevel) {
		this.logLevel = logLevel;
		if(logLevel != null){
			putQueryParameter("LogLevel", logLevel.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public Integer getEchoInt() {
		return this.echoInt;
	}

	public void setEchoInt(Integer echoInt) {
		this.echoInt = echoInt;
		if(echoInt != null){
			putQueryParameter("EchoInt", echoInt.toString());
		}
	}

	public Integer getScan() {
		return this.scan;
	}

	public void setScan(Integer scan) {
		this.scan = scan;
		if(scan != null){
			putQueryParameter("Scan", scan.toString());
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

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
		}
	}

	public String getDai() {
		return this.dai;
	}

	public void setDai(String dai) {
		this.dai = dai;
		if(dai != null){
			putQueryParameter("Dai", dai);
		}
	}

	public String getLogIp() {
		return this.logIp;
	}

	public void setLogIp(String logIp) {
		this.logIp = logIp;
		if(logIp != null){
			putQueryParameter("LogIp", logIp);
		}
	}

	public String getMac() {
		return this.mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
		if(mac != null){
			putQueryParameter("Mac", mac);
		}
	}

	@Override
	public Class<SaveApConfigResponse> getResponseClass() {
		return SaveApConfigResponse.class;
	}

}
