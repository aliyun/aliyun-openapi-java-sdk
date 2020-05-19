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

package com.aliyuncs.linkwan.model.v20190301;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkwan.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateOwnedLocalJoinPermissionRequest extends RpcAcsRequest<UpdateOwnedLocalJoinPermissionResponse> {
	   

	private String rxDelay;

	private String joinPermissionId;

	private String classMode;

	private Long freqBandPlanGroupId;

	private String joinPermissionName;

	private String dataRate;
	public UpdateOwnedLocalJoinPermissionRequest() {
		super("LinkWAN", "2019-03-01", "UpdateOwnedLocalJoinPermission", "linkwan");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRxDelay() {
		return this.rxDelay;
	}

	public void setRxDelay(String rxDelay) {
		this.rxDelay = rxDelay;
		if(rxDelay != null){
			putQueryParameter("RxDelay", rxDelay);
		}
	}

	public String getJoinPermissionId() {
		return this.joinPermissionId;
	}

	public void setJoinPermissionId(String joinPermissionId) {
		this.joinPermissionId = joinPermissionId;
		if(joinPermissionId != null){
			putQueryParameter("JoinPermissionId", joinPermissionId);
		}
	}

	public String getClassMode() {
		return this.classMode;
	}

	public void setClassMode(String classMode) {
		this.classMode = classMode;
		if(classMode != null){
			putQueryParameter("ClassMode", classMode);
		}
	}

	public Long getFreqBandPlanGroupId() {
		return this.freqBandPlanGroupId;
	}

	public void setFreqBandPlanGroupId(Long freqBandPlanGroupId) {
		this.freqBandPlanGroupId = freqBandPlanGroupId;
		if(freqBandPlanGroupId != null){
			putQueryParameter("FreqBandPlanGroupId", freqBandPlanGroupId.toString());
		}
	}

	public String getJoinPermissionName() {
		return this.joinPermissionName;
	}

	public void setJoinPermissionName(String joinPermissionName) {
		this.joinPermissionName = joinPermissionName;
		if(joinPermissionName != null){
			putQueryParameter("JoinPermissionName", joinPermissionName);
		}
	}

	public String getDataRate() {
		return this.dataRate;
	}

	public void setDataRate(String dataRate) {
		this.dataRate = dataRate;
		if(dataRate != null){
			putQueryParameter("DataRate", dataRate);
		}
	}

	@Override
	public Class<UpdateOwnedLocalJoinPermissionResponse> getResponseClass() {
		return UpdateOwnedLocalJoinPermissionResponse.class;
	}

}
