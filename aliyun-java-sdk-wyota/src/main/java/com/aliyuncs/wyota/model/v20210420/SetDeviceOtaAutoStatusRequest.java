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
public class SetDeviceOtaAutoStatusRequest extends RpcAcsRequest<SetDeviceOtaAutoStatusResponse> {
	   

	private Integer clientType;

	private Integer autoUpdate;

	private String autoUpdateTimeSchedule;

	private Integer forceUpgrade;

	private String status;
	public SetDeviceOtaAutoStatusRequest() {
		super("wyota", "2021-04-20", "SetDeviceOtaAutoStatus");
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

	public Integer getAutoUpdate() {
		return this.autoUpdate;
	}

	public void setAutoUpdate(Integer autoUpdate) {
		this.autoUpdate = autoUpdate;
		if(autoUpdate != null){
			putBodyParameter("AutoUpdate", autoUpdate.toString());
		}
	}

	public String getAutoUpdateTimeSchedule() {
		return this.autoUpdateTimeSchedule;
	}

	public void setAutoUpdateTimeSchedule(String autoUpdateTimeSchedule) {
		this.autoUpdateTimeSchedule = autoUpdateTimeSchedule;
		if(autoUpdateTimeSchedule != null){
			putBodyParameter("AutoUpdateTimeSchedule", autoUpdateTimeSchedule);
		}
	}

	public Integer getForceUpgrade() {
		return this.forceUpgrade;
	}

	public void setForceUpgrade(Integer forceUpgrade) {
		this.forceUpgrade = forceUpgrade;
		if(forceUpgrade != null){
			putBodyParameter("ForceUpgrade", forceUpgrade.toString());
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status);
		}
	}

	@Override
	public Class<SetDeviceOtaAutoStatusResponse> getResponseClass() {
		return SetDeviceOtaAutoStatusResponse.class;
	}

}
