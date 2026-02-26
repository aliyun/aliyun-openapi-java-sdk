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
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.brain_industrial.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateEssOptJobRequest extends RpcAcsRequest<CreateEssOptJobResponse> {
	   

	@SerializedName("systemData")
	private List<SystemData> systemData;

	private String timeZone;

	@SerializedName("elecPrice")
	private List<ElecPrice> elecPrice;

	private String freq;

	private Integer duration;

	private String runDate;

	private String topoType;

	@SerializedName("genPrice")
	private List<GenPrice> genPrice;

	@SerializedName("location")
	private Location location;

	private String modelVersion;
	public CreateEssOptJobRequest() {
		super("brain-industrial", "2020-09-20", "CreateEssOptJob", "aistudio");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<SystemData> getSystemData() {
		return this.systemData;
	}

	public void setSystemData(List<SystemData> systemData) {
		this.systemData = systemData;	
		if (systemData != null) {
			putBodyParameter("SystemData" , new Gson().toJson(systemData));
		}	
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

	public List<ElecPrice> getElecPrice() {
		return this.elecPrice;
	}

	public void setElecPrice(List<ElecPrice> elecPrice) {
		this.elecPrice = elecPrice;	
		if (elecPrice != null) {
			putBodyParameter("ElecPrice" , new Gson().toJson(elecPrice));
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

	public String getTopoType() {
		return this.topoType;
	}

	public void setTopoType(String topoType) {
		this.topoType = topoType;
		if(topoType != null){
			putBodyParameter("TopoType", topoType);
		}
	}

	public List<GenPrice> getGenPrice() {
		return this.genPrice;
	}

	public void setGenPrice(List<GenPrice> genPrice) {
		this.genPrice = genPrice;	
		if (genPrice != null) {
			putBodyParameter("GenPrice" , new Gson().toJson(genPrice));
		}	
	}

	public Location getLocation() {
		return this.location;
	}

	public void setLocation(Location location) {
		this.location = location;	
		if (location != null) {
			putBodyParameter("Location" , new Gson().toJson(location));
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

	public static class SystemData {

		@SerializedName("SystemId")
		private String systemId;

		@SerializedName("SystemType")
		private String systemType;

		@SerializedName("SystemParams")
		private Map<String,String> systemParams;

		@SerializedName("HistoryData")
		private List<Map<String,String>> historyData;

		public String getSystemId() {
			return this.systemId;
		}

		public void setSystemId(String systemId) {
			this.systemId = systemId;
		}

		public String getSystemType() {
			return this.systemType;
		}

		public void setSystemType(String systemType) {
			this.systemType = systemType;
		}

		public Map<String,String> getSystemParams() {
			return this.systemParams;
		}

		public void setSystemParams(Map<String,String> systemParams) {
			this.systemParams = systemParams;
		}

		public List<Map<String,String>> getHistoryData() {
			return this.historyData;
		}

		public void setHistoryData(List<Map<String,String>> historyData) {
			this.historyData = historyData;
		}
	}

	public static class ElecPrice {

		@SerializedName("DataTime")
		private String dataTime;

		@SerializedName("Price")
		private String price;

		public String getDataTime() {
			return this.dataTime;
		}

		public void setDataTime(String dataTime) {
			this.dataTime = dataTime;
		}

		public String getPrice() {
			return this.price;
		}

		public void setPrice(String price) {
			this.price = price;
		}
	}

	public static class GenPrice {

		@SerializedName("DataTime")
		private String dataTime;

		@SerializedName("Price")
		private String price;

		public String getDataTime() {
			return this.dataTime;
		}

		public void setDataTime(String dataTime) {
			this.dataTime = dataTime;
		}

		public String getPrice() {
			return this.price;
		}

		public void setPrice(String price) {
			this.price = price;
		}
	}

	public static class Location {

		@SerializedName("Altitude")
		private Double altitude;

		@SerializedName("Latitude")
		private Double latitude;

		@SerializedName("Longitude")
		private Double longitude;

		public Double getAltitude() {
			return this.altitude;
		}

		public void setAltitude(Double altitude) {
			this.altitude = altitude;
		}

		public Double getLatitude() {
			return this.latitude;
		}

		public void setLatitude(Double latitude) {
			this.latitude = latitude;
		}

		public Double getLongitude() {
			return this.longitude;
		}

		public void setLongitude(Double longitude) {
			this.longitude = longitude;
		}
	}

	@Override
	public Class<CreateEssOptJobResponse> getResponseClass() {
		return CreateEssOptJobResponse.class;
	}

}
