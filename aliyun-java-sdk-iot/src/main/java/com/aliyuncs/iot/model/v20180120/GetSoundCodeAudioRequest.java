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
public class GetSoundCodeAudioRequest extends RpcAcsRequest<GetSoundCodeAudioResponse> {
	   

	private String iotInstanceId;

	private List<String> soundCodeLists;
	public GetSoundCodeAudioRequest() {
		super("Iot", "2018-01-20", "GetSoundCodeAudio");
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

	public List<String> getSoundCodeLists() {
		return this.soundCodeLists;
	}

	public void setSoundCodeLists(List<String> soundCodeLists) {
		this.soundCodeLists = soundCodeLists;	
		if (soundCodeLists != null) {
			for (int i = 0; i < soundCodeLists.size(); i++) {
				putBodyParameter("SoundCodeList." + (i + 1) , soundCodeLists.get(i));
			}
		}	
	}

	@Override
	public Class<GetSoundCodeAudioResponse> getResponseClass() {
		return GetSoundCodeAudioResponse.class;
	}

}
