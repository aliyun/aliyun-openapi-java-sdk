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

package com.aliyuncs.brain_industrial.model.v20200920;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.brain_industrial.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateLoadForecastJobRequest extends RpcAcsRequest<CreateLoadForecastJobResponse> {
	   

	private String timeZone;

	private String freq;

	private String systemType;

	private String deviceType;

	private Integer duration;

	private String runDate;

	@SerializedName("historyData")
	private List<HistoryData> historyData;

	private String modelVersion;
	public CreateLoadForecastJobRequest() {
		super("brain-industrial", "2020-09-20", "CreateLoadForecastJob", "aistudio");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTimeZone() {
		return this.timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
		if(timeZone != null){
			putBodyParameter("TimeZone", timeZone);
		}
	}

	public String getFreq() {
		return this.freq;
	}

	public void setFreq(String freq) {
		this.freq = freq;
		if(freq != null){
			putBodyParameter("Freq", freq);
		}
	}

	public String getSystemType() {
		return this.systemType;
	}

	public void setSystemType(String systemType) {
		this.systemType = systemType;
		if(systemType != null){
			putBodyParameter("SystemType", systemType);
		}
	}

	public String getDeviceType() {
		return this.deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
		if(deviceType != null){
			putBodyParameter("DeviceType", deviceType);
		}
	}

	public Integer getDuration() {
		return this.duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
		if(duration != null){
			putBodyParameter("Duration", duration.toString());
		}
	}

	public String getRunDate() {
		return this.runDate;
	}

	public void setRunDate(String runDate) {
		this.runDate = runDate;
		if(runDate != null){
			putBodyParameter("RunDate", runDate);
		}
	}

	public List<HistoryData> getHistoryData() {
		return this.historyData;
	}

	public void setHistoryData(List<HistoryData> historyData) {
		this.historyData = historyData;	
		if (historyData != null) {
			putBodyParameter("HistoryData" , new Gson().toJson(historyData));
		}	
	}

	public String getModelVersion() {
		return this.modelVersion;
	}

	public void setModelVersion(String modelVersion) {
		this.modelVersion = modelVersion;
		if(modelVersion != null){
			putBodyParameter("ModelVersion", modelVersion);
		}
	}

	public static class HistoryData {

		@SerializedName("RunTime")
		private String runTime;

		@SerializedName("Value")
		private Double value;

		public String getRunTime() {
			return this.runTime;
		}

		public void setRunTime(String runTime) {
			this.runTime = runTime;
		}

		public Double getValue() {
			return this.value;
		}

		public void setValue(Double value) {
			this.value = value;
		}
	}

	@Override
	public Class<CreateLoadForecastJobResponse> getResponseClass() {
		return CreateLoadForecastJobResponse.class;
	}

}
