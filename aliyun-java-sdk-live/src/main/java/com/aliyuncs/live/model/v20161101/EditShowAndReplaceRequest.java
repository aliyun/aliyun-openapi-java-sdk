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

package com.aliyuncs.live.model.v20161101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class EditShowAndReplaceRequest extends RpcAcsRequest<EditShowAndReplaceResponse> {
	   

	private Float startTime;

	private String userData;

	private String storageInfo;

	private String casterId;

	private Float endTime;

	private Long ownerId;

	private String showId;
	public EditShowAndReplaceRequest() {
		super("live", "2016-11-01", "EditShowAndReplace", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Float getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Float startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime.toString());
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

	public String getStorageInfo() {
		return this.storageInfo;
	}

	public void setStorageInfo(String storageInfo) {
		this.storageInfo = storageInfo;
		if(storageInfo != null){
			putQueryParameter("StorageInfo", storageInfo);
		}
	}

	public String getCasterId() {
		return this.casterId;
	}

	public void setCasterId(String casterId) {
		this.casterId = casterId;
		if(casterId != null){
			putQueryParameter("CasterId", casterId);
		}
	}

	public Float getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Float endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime.toString());
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

	public String getShowId() {
		return this.showId;
	}

	public void setShowId(String showId) {
		this.showId = showId;
		if(showId != null){
			putQueryParameter("ShowId", showId);
		}
	}

	@Override
	public Class<EditShowAndReplaceResponse> getResponseClass() {
		return EditShowAndReplaceResponse.class;
	}

}
