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

package com.aliyuncs.vcs.model.v20200515;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vcs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateComputeInstanceRequest extends RpcAcsRequest<CreateComputeInstanceResponse> {
	   

	private String datasourceType;

	@SerializedName("algorithms")
	private List<Algorithms> algorithms;

	private String scheduleType;

	private Long acuUsed;

	private String storageUsed;

	private String computePictureValue;

	private String computePictureType;

	private String picType;

	private Boolean isPolling;

	private String pollingConfigs;

	private String isFrameExtraction;

	private String scheduleDay;

	private String picTopic;

	private String projectId;

	private String algorithmType;

	@SerializedName("devices")
	private List<Devices> devices;

	private String scheduleTimes;

	private String overallExecutionTime;

	private String scheduleDaySize;

	private String instanceName;

	private String sliceExecutionTime;

	private String scheduleCycleDate;
	public CreateComputeInstanceRequest() {
		super("Vcs", "2020-05-15", "CreateComputeInstance");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDatasourceType() {
		return this.datasourceType;
	}

	public void setDatasourceType(String datasourceType) {
		this.datasourceType = datasourceType;
		if(datasourceType != null){
			putBodyParameter("DatasourceType", datasourceType);
		}
	}

	public List<Algorithms> getAlgorithms() {
		return this.algorithms;
	}

	public void setAlgorithms(List<Algorithms> algorithms) {
		this.algorithms = algorithms;	
		if (algorithms != null) {
			putBodyParameter("Algorithms" , new Gson().toJson(algorithms));
		}	
	}

	public String getScheduleType() {
		return this.scheduleType;
	}

	public void setScheduleType(String scheduleType) {
		this.scheduleType = scheduleType;
		if(scheduleType != null){
			putBodyParameter("ScheduleType", scheduleType);
		}
	}

	public Long getAcuUsed() {
		return this.acuUsed;
	}

	public void setAcuUsed(Long acuUsed) {
		this.acuUsed = acuUsed;
		if(acuUsed != null){
			putBodyParameter("AcuUsed", acuUsed.toString());
		}
	}

	public String getStorageUsed() {
		return this.storageUsed;
	}

	public void setStorageUsed(String storageUsed) {
		this.storageUsed = storageUsed;
		if(storageUsed != null){
			putBodyParameter("StorageUsed", storageUsed);
		}
	}

	public String getComputePictureValue() {
		return this.computePictureValue;
	}

	public void setComputePictureValue(String computePictureValue) {
		this.computePictureValue = computePictureValue;
		if(computePictureValue != null){
			putBodyParameter("ComputePictureValue", computePictureValue);
		}
	}

	public String getComputePictureType() {
		return this.computePictureType;
	}

	public void setComputePictureType(String computePictureType) {
		this.computePictureType = computePictureType;
		if(computePictureType != null){
			putBodyParameter("ComputePictureType", computePictureType);
		}
	}

	public String getPicType() {
		return this.picType;
	}

	public void setPicType(String picType) {
		this.picType = picType;
		if(picType != null){
			putBodyParameter("PicType", picType);
		}
	}

	public Boolean getIsPolling() {
		return this.isPolling;
	}

	public void setIsPolling(Boolean isPolling) {
		this.isPolling = isPolling;
		if(isPolling != null){
			putBodyParameter("IsPolling", isPolling.toString());
		}
	}

	public String getPollingConfigs() {
		return this.pollingConfigs;
	}

	public void setPollingConfigs(String pollingConfigs) {
		this.pollingConfigs = pollingConfigs;
		if(pollingConfigs != null){
			putBodyParameter("PollingConfigs", pollingConfigs);
		}
	}

	public String getIsFrameExtraction() {
		return this.isFrameExtraction;
	}

	public void setIsFrameExtraction(String isFrameExtraction) {
		this.isFrameExtraction = isFrameExtraction;
		if(isFrameExtraction != null){
			putBodyParameter("IsFrameExtraction", isFrameExtraction);
		}
	}

	public String getScheduleDay() {
		return this.scheduleDay;
	}

	public void setScheduleDay(String scheduleDay) {
		this.scheduleDay = scheduleDay;
		if(scheduleDay != null){
			putBodyParameter("ScheduleDay", scheduleDay);
		}
	}

	public String getPicTopic() {
		return this.picTopic;
	}

	public void setPicTopic(String picTopic) {
		this.picTopic = picTopic;
		if(picTopic != null){
			putBodyParameter("PicTopic", picTopic);
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putBodyParameter("ProjectId", projectId);
		}
	}

	public String getAlgorithmType() {
		return this.algorithmType;
	}

	public void setAlgorithmType(String algorithmType) {
		this.algorithmType = algorithmType;
		if(algorithmType != null){
			putBodyParameter("AlgorithmType", algorithmType);
		}
	}

	public List<Devices> getDevices() {
		return this.devices;
	}

	public void setDevices(List<Devices> devices) {
		this.devices = devices;	
		if (devices != null) {
			putBodyParameter("Devices" , new Gson().toJson(devices));
		}	
	}

	public String getScheduleTimes() {
		return this.scheduleTimes;
	}

	public void setScheduleTimes(String scheduleTimes) {
		this.scheduleTimes = scheduleTimes;
		if(scheduleTimes != null){
			putBodyParameter("ScheduleTimes", scheduleTimes);
		}
	}

	public String getOverallExecutionTime() {
		return this.overallExecutionTime;
	}

	public void setOverallExecutionTime(String overallExecutionTime) {
		this.overallExecutionTime = overallExecutionTime;
		if(overallExecutionTime != null){
			putBodyParameter("OverallExecutionTime", overallExecutionTime);
		}
	}

	public String getScheduleDaySize() {
		return this.scheduleDaySize;
	}

	public void setScheduleDaySize(String scheduleDaySize) {
		this.scheduleDaySize = scheduleDaySize;
		if(scheduleDaySize != null){
			putBodyParameter("ScheduleDaySize", scheduleDaySize);
		}
	}

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
		if(instanceName != null){
			putBodyParameter("InstanceName", instanceName);
		}
	}

	public String getSliceExecutionTime() {
		return this.sliceExecutionTime;
	}

	public void setSliceExecutionTime(String sliceExecutionTime) {
		this.sliceExecutionTime = sliceExecutionTime;
		if(sliceExecutionTime != null){
			putBodyParameter("SliceExecutionTime", sliceExecutionTime);
		}
	}

	public String getScheduleCycleDate() {
		return this.scheduleCycleDate;
	}

	public void setScheduleCycleDate(String scheduleCycleDate) {
		this.scheduleCycleDate = scheduleCycleDate;
		if(scheduleCycleDate != null){
			putBodyParameter("ScheduleCycleDate", scheduleCycleDate);
		}
	}

	public static class Algorithms {

		@SerializedName("AlgorithmName")
		private String algorithmName;

		@SerializedName("AlgorithmId")
		private String algorithmId;

		public String getAlgorithmName() {
			return this.algorithmName;
		}

		public void setAlgorithmName(String algorithmName) {
			this.algorithmName = algorithmName;
		}

		public String getAlgorithmId() {
			return this.algorithmId;
		}

		public void setAlgorithmId(String algorithmId) {
			this.algorithmId = algorithmId;
		}
	}

	public static class Devices {

		@SerializedName("CodingFormat")
		private String codingFormat;

		@SerializedName("ResolvingPower")
		private String resolvingPower;

		@SerializedName("RegionId")
		private String regionId;

		@SerializedName("BitRate")
		private String bitRate;

		@SerializedName("DeviceId")
		private String deviceId;

		@SerializedName("StartStream")
		private Boolean startStream;

		public String getCodingFormat() {
			return this.codingFormat;
		}

		public void setCodingFormat(String codingFormat) {
			this.codingFormat = codingFormat;
		}

		public String getResolvingPower() {
			return this.resolvingPower;
		}

		public void setResolvingPower(String resolvingPower) {
			this.resolvingPower = resolvingPower;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getBitRate() {
			return this.bitRate;
		}

		public void setBitRate(String bitRate) {
			this.bitRate = bitRate;
		}

		public String getDeviceId() {
			return this.deviceId;
		}

		public void setDeviceId(String deviceId) {
			this.deviceId = deviceId;
		}

		public Boolean getStartStream() {
			return this.startStream;
		}

		public void setStartStream(Boolean startStream) {
			this.startStream = startStream;
		}
	}

	@Override
	public Class<CreateComputeInstanceResponse> getResponseClass() {
		return CreateComputeInstanceResponse.class;
	}

}
