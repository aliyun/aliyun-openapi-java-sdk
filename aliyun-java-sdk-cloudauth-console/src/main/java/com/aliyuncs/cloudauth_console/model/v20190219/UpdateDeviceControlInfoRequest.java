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

package com.aliyuncs.cloudauth_console.model.v20190219;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudauth_console.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateDeviceControlInfoRequest extends RpcAcsRequest<UpdateDeviceControlInfoResponse> {
	   

	private Integer speedClock;

	private Long iotId;

	private Integer enableMeasureTempurature;

	private Integer controlDoorTime;

	private String projectId;

	private Integer multiPerson;
	public UpdateDeviceControlInfoRequest() {
		super("Cloudauth-console", "2019-02-19", "UpdateDeviceControlInfo");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getSpeedClock() {
		return this.speedClock;
	}

	public void setSpeedClock(Integer speedClock) {
		this.speedClock = speedClock;
		if(speedClock != null){
			putQueryParameter("SpeedClock", speedClock.toString());
		}
	}

	public Long getIotId() {
		return this.iotId;
	}

	public void setIotId(Long iotId) {
		this.iotId = iotId;
		if(iotId != null){
			putQueryParameter("IotId", iotId.toString());
		}
	}

	public Integer getEnableMeasureTempurature() {
		return this.enableMeasureTempurature;
	}

	public void setEnableMeasureTempurature(Integer enableMeasureTempurature) {
		this.enableMeasureTempurature = enableMeasureTempurature;
		if(enableMeasureTempurature != null){
			putQueryParameter("EnableMeasureTempurature", enableMeasureTempurature.toString());
		}
	}

	public Integer getControlDoorTime() {
		return this.controlDoorTime;
	}

	public void setControlDoorTime(Integer controlDoorTime) {
		this.controlDoorTime = controlDoorTime;
		if(controlDoorTime != null){
			putQueryParameter("ControlDoorTime", controlDoorTime.toString());
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

	public Integer getMultiPerson() {
		return this.multiPerson;
	}

	public void setMultiPerson(Integer multiPerson) {
		this.multiPerson = multiPerson;
		if(multiPerson != null){
			putQueryParameter("MultiPerson", multiPerson.toString());
		}
	}

	@Override
	public Class<UpdateDeviceControlInfoResponse> getResponseClass() {
		return UpdateDeviceControlInfoResponse.class;
	}

}
