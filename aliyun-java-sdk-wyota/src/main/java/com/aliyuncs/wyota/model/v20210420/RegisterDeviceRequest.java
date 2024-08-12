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
public class RegisterDeviceRequest extends RpcAcsRequest<RegisterDeviceResponse> {
	   

	private Integer clientType;

	private String clientId;

	private String memory;

	private String cpu;

	private String buildId;

	private String storage;

	private String customId;

	private String serialNo;

	private String token;

	private String etherMac;

	private String bluetooth;

	private String wlan;

	private String model;

	private String chipId;
	public RegisterDeviceRequest() {
		super("wyota", "2021-04-20", "RegisterDevice");
		setMethod(MethodType.POST);
	}

	public Integer getClientType() {
		return this.clientType;
	}

	public void setClientType(Integer clientType) {
		this.clientType = clientType;
		if(clientType != null){
			putBodyParameter("ClientType", clientType.toString());
		}
	}

	public String getClientId() {
		return this.clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
		if(clientId != null){
			putBodyParameter("ClientId", clientId);
		}
	}

	public String getMemory() {
		return this.memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
		if(memory != null){
			putBodyParameter("Memory", memory);
		}
	}

	public String getCpu() {
		return this.cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
		if(cpu != null){
			putBodyParameter("Cpu", cpu);
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

	public String getStorage() {
		return this.storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
		if(storage != null){
			putBodyParameter("Storage", storage);
		}
	}

	public String getCustomId() {
		return this.customId;
	}

	public void setCustomId(String customId) {
		this.customId = customId;
		if(customId != null){
			putBodyParameter("CustomId", customId);
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

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putBodyParameter("Token", token);
		}
	}

	public String getEtherMac() {
		return this.etherMac;
	}

	public void setEtherMac(String etherMac) {
		this.etherMac = etherMac;
		if(etherMac != null){
			putBodyParameter("EtherMac", etherMac);
		}
	}

	public String getBluetooth() {
		return this.bluetooth;
	}

	public void setBluetooth(String bluetooth) {
		this.bluetooth = bluetooth;
		if(bluetooth != null){
			putBodyParameter("Bluetooth", bluetooth);
		}
	}

	public String getWlan() {
		return this.wlan;
	}

	public void setWlan(String wlan) {
		this.wlan = wlan;
		if(wlan != null){
			putBodyParameter("Wlan", wlan);
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

	public String getChipId() {
		return this.chipId;
	}

	public void setChipId(String chipId) {
		this.chipId = chipId;
		if(chipId != null){
			putBodyParameter("ChipId", chipId);
		}
	}

	@Override
	public Class<RegisterDeviceResponse> getResponseClass() {
		return RegisterDeviceResponse.class;
	}

}
