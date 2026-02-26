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

package com.aliyuncs.polardbx.model.v20200202;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.polardbx.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyActiveOperationMaintainConfRequest extends RpcAcsRequest<ModifyActiveOperationMaintainConfResponse> {
	   

	private String cycleTime;

	private String maintainStartTime;

	private String cycleType;

	private String maintainEndTime;

	private Integer status;
	public ModifyActiveOperationMaintainConfRequest() {
		super("polardbx", "2020-02-02", "ModifyActiveOperationMaintainConf", "polardbx");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCycleTime() {
		return this.cycleTime;
	}

	public void setCycleTime(String cycleTime) {
		this.cycleTime = cycleTime;
		if(cycleTime != null){
			putQueryParameter("CycleTime", cycleTime);
		}
	}

	public String getMaintainStartTime() {
		return this.maintainStartTime;
	}

	public void setMaintainStartTime(String maintainStartTime) {
		this.maintainStartTime = maintainStartTime;
		if(maintainStartTime != null){
			putQueryParameter("MaintainStartTime", maintainStartTime);
		}
	}

	public String getCycleType() {
		return this.cycleType;
	}

	public void setCycleType(String cycleType) {
		this.cycleType = cycleType;
		if(cycleType != null){
			putQueryParameter("CycleType", cycleType);
		}
	}

	public String getMaintainEndTime() {
		return this.maintainEndTime;
	}

	public void setMaintainEndTime(String maintainEndTime) {
		this.maintainEndTime = maintainEndTime;
		if(maintainEndTime != null){
			putQueryParameter("MaintainEndTime", maintainEndTime);
		}
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status.toString());
		}
	}

	@Override
	public Class<ModifyActiveOperationMaintainConfResponse> getResponseClass() {
		return ModifyActiveOperationMaintainConfResponse.class;
	}

}
