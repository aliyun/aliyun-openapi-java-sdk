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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteDeviceSpeechRequest extends RpcAcsRequest<DeleteDeviceSpeechResponse> {
	   

	private String iotId;

	private String iotInstanceId;

	private List<DeviceSpeechList> deviceSpeechLists;
	public DeleteDeviceSpeechRequest() {
		super("Iot", "2018-01-20", "DeleteDeviceSpeech", "iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIotId() {
		return this.iotId;
	}

	public void setIotId(String iotId) {
		this.iotId = iotId;
		if(iotId != null){
			putBodyParameter("IotId", iotId);
		}
	}

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putBodyParameter("IotInstanceId", iotInstanceId);
		}
	}

	public List<DeviceSpeechList> getDeviceSpeechLists() {
		return this.deviceSpeechLists;
	}

	public void setDeviceSpeechLists(List<DeviceSpeechList> deviceSpeechLists) {
		this.deviceSpeechLists = deviceSpeechLists;	
		if (deviceSpeechLists != null) {
			for (int depth1 = 0; depth1 < deviceSpeechLists.size(); depth1++) {
				putBodyParameter("DeviceSpeechList." + (depth1 + 1) + ".BizCode" , deviceSpeechLists.get(depth1).getBizCode());
				putBodyParameter("DeviceSpeechList." + (depth1 + 1) + ".AudioFormat" , deviceSpeechLists.get(depth1).getAudioFormat());
			}
		}	
	}

	public static class DeviceSpeechList {

		private String bizCode;

		private String audioFormat;

		public String getBizCode() {
			return this.bizCode;
		}

		public void setBizCode(String bizCode) {
			this.bizCode = bizCode;
		}

		public String getAudioFormat() {
			return this.audioFormat;
		}

		public void setAudioFormat(String audioFormat) {
			this.audioFormat = audioFormat;
		}
	}

	@Override
	public Class<DeleteDeviceSpeechResponse> getResponseClass() {
		return DeleteDeviceSpeechResponse.class;
	}

}
