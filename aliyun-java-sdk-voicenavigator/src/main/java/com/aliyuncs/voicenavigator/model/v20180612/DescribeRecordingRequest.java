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

package com.aliyuncs.voicenavigator.model.v20180612;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.voicenavigator.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeRecordingRequest extends RpcAcsRequest<DescribeRecordingResponse> {
	   

	private Boolean needVoiceSliceRecording;

	private String conversationId;

	private String instanceId;
	public DescribeRecordingRequest() {
		super("VoiceNavigator", "2018-06-12", "DescribeRecording", "voicebot");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getNeedVoiceSliceRecording() {
		return this.needVoiceSliceRecording;
	}

	public void setNeedVoiceSliceRecording(Boolean needVoiceSliceRecording) {
		this.needVoiceSliceRecording = needVoiceSliceRecording;
		if(needVoiceSliceRecording != null){
			putQueryParameter("NeedVoiceSliceRecording", needVoiceSliceRecording.toString());
		}
	}

	public String getConversationId() {
		return this.conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
		if(conversationId != null){
			putQueryParameter("ConversationId", conversationId);
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

	@Override
	public Class<DescribeRecordingResponse> getResponseClass() {
		return DescribeRecordingResponse.class;
	}

}
