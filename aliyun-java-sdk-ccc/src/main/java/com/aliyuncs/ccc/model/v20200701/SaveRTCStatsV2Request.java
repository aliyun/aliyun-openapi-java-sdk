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

package com.aliyuncs.ccc.model.v20200701;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ccc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SaveRTCStatsV2Request extends RpcAcsRequest<SaveRTCStatsV2Response> {
	   

	private String callId;

	private String senderReport;

	private String instanceId;

	private String receiverReport;

	private String googAddress;

	private String generalInfo;
	public SaveRTCStatsV2Request() {
		super("CCC", "2020-07-01", "SaveRTCStatsV2", "CCC");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCallId() {
		return this.callId;
	}

	public void setCallId(String callId) {
		this.callId = callId;
		if(callId != null){
			putQueryParameter("CallId", callId);
		}
	}

	public String getSenderReport() {
		return this.senderReport;
	}

	public void setSenderReport(String senderReport) {
		this.senderReport = senderReport;
		if(senderReport != null){
			putQueryParameter("SenderReport", senderReport);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getReceiverReport() {
		return this.receiverReport;
	}

	public void setReceiverReport(String receiverReport) {
		this.receiverReport = receiverReport;
		if(receiverReport != null){
			putQueryParameter("ReceiverReport", receiverReport);
		}
	}

	public String getGoogAddress() {
		return this.googAddress;
	}

	public void setGoogAddress(String googAddress) {
		this.googAddress = googAddress;
		if(googAddress != null){
			putQueryParameter("GoogAddress", googAddress);
		}
	}

	public String getGeneralInfo() {
		return this.generalInfo;
	}

	public void setGeneralInfo(String generalInfo) {
		this.generalInfo = generalInfo;
		if(generalInfo != null){
			putQueryParameter("GeneralInfo", generalInfo);
		}
	}

	@Override
	public Class<SaveRTCStatsV2Response> getResponseClass() {
		return SaveRTCStatsV2Response.class;
	}

}
