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
public class PushSpeechModelToDeviceRequest extends RpcAcsRequest<PushSpeechModelToDeviceResponse> {
	   

	private String projectCode;

	private String iotId;

	private String pushMode;

	private List<String> speechModelCodeLists;
	public PushSpeechModelToDeviceRequest() {
		super("Iot", "2018-01-20", "PushSpeechModelToDevice", "iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProjectCode() {
		return this.projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
		if(projectCode != null){
			putBodyParameter("ProjectCode", projectCode);
		}
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

	public String getPushMode() {
		return this.pushMode;
	}

	public void setPushMode(String pushMode) {
		this.pushMode = pushMode;
		if(pushMode != null){
			putBodyParameter("PushMode", pushMode);
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
	public Class<PushSpeechModelToDeviceResponse> getResponseClass() {
		return PushSpeechModelToDeviceResponse.class;
	}

}
