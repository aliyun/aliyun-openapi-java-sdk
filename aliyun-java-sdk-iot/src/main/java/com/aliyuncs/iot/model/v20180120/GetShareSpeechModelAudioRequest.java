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
public class GetShareSpeechModelAudioRequest extends RpcAcsRequest<GetShareSpeechModelAudioResponse> {
	   

	private String iotInstanceId;

	private String shareTaskId;

	private List<String> speechModelCodeLists;
	public GetShareSpeechModelAudioRequest() {
		super("Iot", "2018-01-20", "GetShareSpeechModelAudio", "iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getShareTaskId() {
		return this.shareTaskId;
	}

	public void setShareTaskId(String shareTaskId) {
		this.shareTaskId = shareTaskId;
		if(shareTaskId != null){
			putBodyParameter("ShareTaskId", shareTaskId);
		}
	}

	public List<String> getSpeechModelCodeLists() {
		return this.speechModelCodeLists;
	}

	public void setSpeechModelCodeLists(List<String> speechModelCodeLists) {
		this.speechModelCodeLists = speechModelCodeLists;	
		if (speechModelCodeLists != null) {
			for (int i = 0; i < speechModelCodeLists.size(); i++) {
				putBodyParameter("SpeechModelCodeList." + (i + 1) , speechModelCodeLists.get(i));
			}
		}	
	}

	@Override
	public Class<GetShareSpeechModelAudioResponse> getResponseClass() {
		return GetShareSpeechModelAudioResponse.class;
	}

}
