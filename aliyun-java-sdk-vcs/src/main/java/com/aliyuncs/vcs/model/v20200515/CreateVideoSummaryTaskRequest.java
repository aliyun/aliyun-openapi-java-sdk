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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vcs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateVideoSummaryTaskRequest extends RpcAcsRequest<CreateVideoSummaryTaskResponse> {
	   

	private String corpId;

	private String liveVideoSummary;

	private Long startTimeStamp;

	private String deviceId;

	private Long endTimeStamp;

	private String optionList;
	public CreateVideoSummaryTaskRequest() {
		super("Vcs", "2020-05-15", "CreateVideoSummaryTask", "vcs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCorpId() {
		return this.corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
		if(corpId != null){
			putBodyParameter("CorpId", corpId);
		}
	}

	public String getLiveVideoSummary() {
		return this.liveVideoSummary;
	}

	public void setLiveVideoSummary(String liveVideoSummary) {
		this.liveVideoSummary = liveVideoSummary;
		if(liveVideoSummary != null){
			putBodyParameter("LiveVideoSummary", liveVideoSummary);
		}
	}

	public Long getStartTimeStamp() {
		return this.startTimeStamp;
	}

	public void setStartTimeStamp(Long startTimeStamp) {
		this.startTimeStamp = startTimeStamp;
		if(startTimeStamp != null){
			putBodyParameter("StartTimeStamp", startTimeStamp.toString());
		}
	}

	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
		if(deviceId != null){
			putBodyParameter("DeviceId", deviceId);
		}
	}

	public Long getEndTimeStamp() {
		return this.endTimeStamp;
	}

	public void setEndTimeStamp(Long endTimeStamp) {
		this.endTimeStamp = endTimeStamp;
		if(endTimeStamp != null){
			putBodyParameter("EndTimeStamp", endTimeStamp.toString());
		}
	}

	public String getOptionList() {
		return this.optionList;
	}

	public void setOptionList(String optionList) {
		this.optionList = optionList;
		if(optionList != null){
			putBodyParameter("OptionList", optionList);
		}
	}

	@Override
	public Class<CreateVideoSummaryTaskResponse> getResponseClass() {
		return CreateVideoSummaryTaskResponse.class;
	}

}
