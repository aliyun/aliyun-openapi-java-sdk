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

package com.aliyuncs.ivision.model.v20190308;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateStreamPredictRequest extends RpcAcsRequest<CreateStreamPredictResponse> {
	
	public CreateStreamPredictRequest() {
		super("ivision", "2019-03-08", "CreateStreamPredict", "ivision");
	}

	private String autoStart;

	private String notify;

	private String output;

	private String userData;

	private String streamType;

	private String streamId;

	private Long ownerId;

	private String probabilityThresholds;

	private String modelIds;

	public String getAutoStart() {
		return this.autoStart;
	}

	public void setAutoStart(String autoStart) {
		this.autoStart = autoStart;
		if(autoStart != null){
			putQueryParameter("AutoStart", autoStart);
		}
	}

	public String getNotify() {
		return this.notify;
	}

	public void setNotify(String notify) {
		this.notify = notify;
		if(notify != null){
			putQueryParameter("Notify", notify);
		}
	}

	public String getOutput() {
		return this.output;
	}

	public void setOutput(String output) {
		this.output = output;
		if(output != null){
			putQueryParameter("Output", output);
		}
	}

	public String getUserData() {
		return this.userData;
	}

	public void setUserData(String userData) {
		this.userData = userData;
		if(userData != null){
			putQueryParameter("UserData", userData);
		}
	}

	public String getStreamType() {
		return this.streamType;
	}

	public void setStreamType(String streamType) {
		this.streamType = streamType;
		if(streamType != null){
			putQueryParameter("StreamType", streamType);
		}
	}

	public String getStreamId() {
		return this.streamId;
	}

	public void setStreamId(String streamId) {
		this.streamId = streamId;
		if(streamId != null){
			putQueryParameter("StreamId", streamId);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getProbabilityThresholds() {
		return this.probabilityThresholds;
	}

	public void setProbabilityThresholds(String probabilityThresholds) {
		this.probabilityThresholds = probabilityThresholds;
		if(probabilityThresholds != null){
			putQueryParameter("ProbabilityThresholds", probabilityThresholds);
		}
	}

	public String getModelIds() {
		return this.modelIds;
	}

	public void setModelIds(String modelIds) {
		this.modelIds = modelIds;
		if(modelIds != null){
			putQueryParameter("ModelIds", modelIds);
		}
	}

	@Override
	public Class<CreateStreamPredictResponse> getResponseClass() {
		return CreateStreamPredictResponse.class;
	}

}
