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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeletePowerStationRequest extends RpcAcsRequest<DeletePowerStationResponse> {
	   

	private String powerStationUid;

	private String iotInstanceId;

	private String algorithmInstanceUid;
	public DeletePowerStationRequest() {
		super("Iot", "2018-01-20", "DeletePowerStation", "iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPowerStationUid() {
		return this.powerStationUid;
	}

	public void setPowerStationUid(String powerStationUid) {
		this.powerStationUid = powerStationUid;
		if(powerStationUid != null){
			putQueryParameter("PowerStationUid", powerStationUid);
		}
	}

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putQueryParameter("IotInstanceId", iotInstanceId);
		}
	}

	public String getAlgorithmInstanceUid() {
		return this.algorithmInstanceUid;
	}

	public void setAlgorithmInstanceUid(String algorithmInstanceUid) {
		this.algorithmInstanceUid = algorithmInstanceUid;
		if(algorithmInstanceUid != null){
			putQueryParameter("AlgorithmInstanceUid", algorithmInstanceUid);
		}
	}

	@Override
	public Class<DeletePowerStationResponse> getResponseClass() {
		return DeletePowerStationResponse.class;
	}

}
