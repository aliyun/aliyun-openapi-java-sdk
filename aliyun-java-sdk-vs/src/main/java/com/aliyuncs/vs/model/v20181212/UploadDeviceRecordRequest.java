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
public class UploadDeviceRecordRequest extends RpcAcsRequest<UploadDeviceRecordResponse> {
	   

	private String searchCriteria;

	private String uploadParams;

	private String streamId;

	private String uploadId;

	private String uploadType;

	private String uploadMode;

	private Long ownerId;

	private String deviceId;
	public UploadDeviceRecordRequest() {
		super("vs", "2018-12-12", "UploadDeviceRecord");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSearchCriteria() {
		return this.searchCriteria;
	}

	public void setSearchCriteria(String searchCriteria) {
		this.searchCriteria = searchCriteria;
		if(searchCriteria != null){
			putQueryParameter("SearchCriteria", searchCriteria);
		}
	}

	public String getUploadParams() {
		return this.uploadParams;
	}

	public void setUploadParams(String uploadParams) {
		this.uploadParams = uploadParams;
		if(uploadParams != null){
			putQueryParameter("UploadParams", uploadParams);
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

	public String getUploadId() {
		return this.uploadId;
	}

	public void setUploadId(String uploadId) {
		this.uploadId = uploadId;
		if(uploadId != null){
			putQueryParameter("UploadId", uploadId);
		}
	}

	public String getUploadType() {
		return this.uploadType;
	}

	public void setUploadType(String uploadType) {
		this.uploadType = uploadType;
		if(uploadType != null){
			putQueryParameter("UploadType", uploadType);
		}
	}

	public String getUploadMode() {
		return this.uploadMode;
	}

	public void setUploadMode(String uploadMode) {
		this.uploadMode = uploadMode;
		if(uploadMode != null){
			putQueryParameter("UploadMode", uploadMode);
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
	public Class<UploadDeviceRecordResponse> getResponseClass() {
		return UploadDeviceRecordResponse.class;
	}

}
