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

package com.aliyuncs.retailcloud.model.v20180313;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.retailcloud.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateAppMonitorsRequest extends RpcAcsRequest<CreateAppMonitorsResponse> {
	   

	private List<Long> appIdss;

	private Long mainUserId;

	private Integer envType;

	private Long alarmTemplateId;

	private String silenceTime;
	public CreateAppMonitorsRequest() {
		super("retailcloud", "2018-03-13", "CreateAppMonitors");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Long> getAppIdss() {
		return this.appIdss;
	}

	public void setAppIdss(List<Long> appIdss) {
		this.appIdss = appIdss;	
		if (appIdss != null) {
			for (int i = 0; i < appIdss.size(); i++) {
				putBodyParameter("AppIds." + (i + 1) , appIdss.get(i));
			}
		}	
	}

	public Long getMainUserId() {
		return this.mainUserId;
	}

	public void setMainUserId(Long mainUserId) {
		this.mainUserId = mainUserId;
		if(mainUserId != null){
			putQueryParameter("MainUserId", mainUserId.toString());
		}
	}

	public Integer getEnvType() {
		return this.envType;
	}

	public void setEnvType(Integer envType) {
		this.envType = envType;
		if(envType != null){
			putQueryParameter("EnvType", envType.toString());
		}
	}

	public Long getAlarmTemplateId() {
		return this.alarmTemplateId;
	}

	public void setAlarmTemplateId(Long alarmTemplateId) {
		this.alarmTemplateId = alarmTemplateId;
		if(alarmTemplateId != null){
			putQueryParameter("AlarmTemplateId", alarmTemplateId.toString());
		}
	}

	public String getSilenceTime() {
		return this.silenceTime;
	}

	public void setSilenceTime(String silenceTime) {
		this.silenceTime = silenceTime;
		if(silenceTime != null){
			putQueryParameter("SilenceTime", silenceTime);
		}
	}

	@Override
	public Class<CreateAppMonitorsResponse> getResponseClass() {
		return CreateAppMonitorsResponse.class;
	}

}
