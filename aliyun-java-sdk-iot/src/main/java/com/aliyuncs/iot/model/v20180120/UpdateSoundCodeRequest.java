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
public class UpdateSoundCodeRequest extends RpcAcsRequest<UpdateSoundCodeResponse> {
	   

	private String soundCode;

	private Integer duration;

	private String iotInstanceId;

	private String soundCodeContent;

	private String name;
	public UpdateSoundCodeRequest() {
		super("Iot", "2018-01-20", "UpdateSoundCode");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSoundCode() {
		return this.soundCode;
	}

	public void setSoundCode(String soundCode) {
		this.soundCode = soundCode;
		if(soundCode != null){
			putBodyParameter("SoundCode", soundCode);
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

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putBodyParameter("IotInstanceId", iotInstanceId);
		}
	}

	public String getSoundCodeContent() {
		return this.soundCodeContent;
	}

	public void setSoundCodeContent(String soundCodeContent) {
		this.soundCodeContent = soundCodeContent;
		if(soundCodeContent != null){
			putBodyParameter("SoundCodeContent", soundCodeContent);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	@Override
	public Class<UpdateSoundCodeResponse> getResponseClass() {
		return UpdateSoundCodeResponse.class;
	}

}
