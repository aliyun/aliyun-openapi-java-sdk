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

package com.aliyuncs.vs.model.v20181212;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateDeviceSnapshotRequest extends RpcAcsRequest<CreateDeviceSnapshotResponse> {
	   

	private String snapshotConfig;

	private String mode;

	private String streamId;

	private Long ownerId;

	private String deviceId;
	public CreateDeviceSnapshotRequest() {
		super("vs", "2018-12-12", "CreateDeviceSnapshot", "vs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSnapshotConfig() {
		return this.snapshotConfig;
	}

	public void setSnapshotConfig(String snapshotConfig) {
		this.snapshotConfig = snapshotConfig;
		if(snapshotConfig != null){
			putQueryParameter("SnapshotConfig", snapshotConfig);
		}
	}

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
		if(mode != null){
			putQueryParameter("Mode", mode);
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

	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
		if(deviceId != null){
			putQueryParameter("DeviceId", deviceId);
		}
	}

	@Override
	public Class<CreateDeviceSnapshotResponse> getResponseClass() {
		return CreateDeviceSnapshotResponse.class;
	}

}
