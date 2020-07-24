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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vcs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ReportDeviceCapacityRequest extends RpcAcsRequest<ReportDeviceCapacityResponse> {
	   

	private List<StreamCapacities> streamCapacitiess;

	private String latitude;

	private String presetNum;

	private String deviceSn;

	private String audioFormat;

	private String pTZCapacity;

	private String longitude;
	public ReportDeviceCapacityRequest() {
		super("Vcs", "2020-05-15", "ReportDeviceCapacity", "vcs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<StreamCapacities> getStreamCapacitiess() {
		return this.streamCapacitiess;
	}

	public void setStreamCapacitiess(List<StreamCapacities> streamCapacitiess) {
		this.streamCapacitiess = streamCapacitiess;	
		if (streamCapacitiess != null) {
			for (int depth1 = 0; depth1 < streamCapacitiess.size(); depth1++) {
				putBodyParameter("StreamCapacities." + (depth1 + 1) + ".BitrateRange" , streamCapacitiess.get(depth1).getBitrateRange());
				putBodyParameter("StreamCapacities." + (depth1 + 1) + ".MaxStream" , streamCapacitiess.get(depth1).getMaxStream());
				putBodyParameter("StreamCapacities." + (depth1 + 1) + ".EncodeFormat" , streamCapacitiess.get(depth1).getEncodeFormat());
				putBodyParameter("StreamCapacities." + (depth1 + 1) + ".MaxFrameRate" , streamCapacitiess.get(depth1).getMaxFrameRate());
				putBodyParameter("StreamCapacities." + (depth1 + 1) + ".Resolution" , streamCapacitiess.get(depth1).getResolution());
			}
		}	
	}

	public String getLatitude() {
		return this.latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
		if(latitude != null){
			putBodyParameter("Latitude", latitude);
		}
	}

	public String getPresetNum() {
		return this.presetNum;
	}

	public void setPresetNum(String presetNum) {
		this.presetNum = presetNum;
		if(presetNum != null){
			putBodyParameter("PresetNum", presetNum);
		}
	}

	public String getDeviceSn() {
		return this.deviceSn;
	}

	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
		if(deviceSn != null){
			putBodyParameter("DeviceSn", deviceSn);
		}
	}

	public String getAudioFormat() {
		return this.audioFormat;
	}

	public void setAudioFormat(String audioFormat) {
		this.audioFormat = audioFormat;
		if(audioFormat != null){
			putBodyParameter("AudioFormat", audioFormat);
		}
	}

	public String getPTZCapacity() {
		return this.pTZCapacity;
	}

	public void setPTZCapacity(String pTZCapacity) {
		this.pTZCapacity = pTZCapacity;
		if(pTZCapacity != null){
			putBodyParameter("PTZCapacity", pTZCapacity);
		}
	}

	public String getLongitude() {
		return this.longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
		if(longitude != null){
			putBodyParameter("Longitude", longitude);
		}
	}

	public static class StreamCapacities {

		private String bitrateRange;

		private String maxStream;

		private String encodeFormat;

		private String maxFrameRate;

		private String resolution;

		public String getBitrateRange() {
			return this.bitrateRange;
		}

		public void setBitrateRange(String bitrateRange) {
			this.bitrateRange = bitrateRange;
		}

		public String getMaxStream() {
			return this.maxStream;
		}

		public void setMaxStream(String maxStream) {
			this.maxStream = maxStream;
		}

		public String getEncodeFormat() {
			return this.encodeFormat;
		}

		public void setEncodeFormat(String encodeFormat) {
			this.encodeFormat = encodeFormat;
		}

		public String getMaxFrameRate() {
			return this.maxFrameRate;
		}

		public void setMaxFrameRate(String maxFrameRate) {
			this.maxFrameRate = maxFrameRate;
		}

		public String getResolution() {
			return this.resolution;
		}

		public void setResolution(String resolution) {
			this.resolution = resolution;
		}
	}

	@Override
	public Class<ReportDeviceCapacityResponse> getResponseClass() {
		return ReportDeviceCapacityResponse.class;
	}

}
