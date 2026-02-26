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
public class StartPTDetectionRequest extends RpcAcsRequest<StartPTDetectionResponse> {
	   

	private String powerStationUid;

	private String data;

	private Integer powerPlantsNumber;

	private String iotInstanceId;

	private String algorithmInstanceUid;

	private String fileName;

	private Long dataCollectionTime;

	private Integer sensitivity;
	public StartPTDetectionRequest() {
		super("Iot", "2018-01-20", "StartPTDetection", "iot");
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

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
		if(data != null){
			putQueryParameter("Data", data);
		}
	}

	public Integer getPowerPlantsNumber() {
		return this.powerPlantsNumber;
	}

	public void setPowerPlantsNumber(Integer powerPlantsNumber) {
		this.powerPlantsNumber = powerPlantsNumber;
		if(powerPlantsNumber != null){
			putQueryParameter("PowerPlantsNumber", powerPlantsNumber.toString());
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

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
		if(fileName != null){
			putQueryParameter("FileName", fileName);
		}
	}

	public Long getDataCollectionTime() {
		return this.dataCollectionTime;
	}

	public void setDataCollectionTime(Long dataCollectionTime) {
		this.dataCollectionTime = dataCollectionTime;
		if(dataCollectionTime != null){
			putQueryParameter("DataCollectionTime", dataCollectionTime.toString());
		}
	}

	public Integer getSensitivity() {
		return this.sensitivity;
	}

	public void setSensitivity(Integer sensitivity) {
		this.sensitivity = sensitivity;
		if(sensitivity != null){
			putQueryParameter("Sensitivity", sensitivity.toString());
		}
	}

	@Override
	public Class<StartPTDetectionResponse> getResponseClass() {
		return StartPTDetectionResponse.class;
	}

}
