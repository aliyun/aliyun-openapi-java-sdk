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
public class CreateSoundCodeRequest extends RpcAcsRequest<CreateSoundCodeResponse> {
	   

	private Integer duration;

	private String iotInstanceId;

	private String soundCodeContent;

	private String name;

	private String openType;
	public CreateSoundCodeRequest() {
		super("Iot", "2018-01-20", "CreateSoundCode");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getOpenType() {
		return this.openType;
	}

	public void setOpenType(String openType) {
		this.openType = openType;
		if(openType != null){
			putBodyParameter("OpenType", openType);
		}
	}

	@Override
	public Class<CreateSoundCodeResponse> getResponseClass() {
		return CreateSoundCodeResponse.class;
	}

}
