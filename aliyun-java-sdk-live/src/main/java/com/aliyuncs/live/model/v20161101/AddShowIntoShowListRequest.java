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
public class AddShowIntoShowListRequest extends RpcAcsRequest<AddShowIntoShowListResponse> {
	   

	private Integer liveInputType;

	private Long duration;

	private Integer repeatTimes;

	private String showName;

	private String resourceId;

	private String casterId;

	private Long ownerId;

	private String resourceType;

	private String resourceUrl;

	private Integer spot;
	public AddShowIntoShowListRequest() {
		super("live", "2016-11-01", "AddShowIntoShowList", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getLiveInputType() {
		return this.liveInputType;
	}

	public void setLiveInputType(Integer liveInputType) {
		this.liveInputType = liveInputType;
		if(liveInputType != null){
			putQueryParameter("LiveInputType", liveInputType.toString());
		}
	}

	public Long getDuration() {
		return this.duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
		if(duration != null){
			putQueryParameter("Duration", duration.toString());
		}
	}

	public Integer getRepeatTimes() {
		return this.repeatTimes;
	}

	public void setRepeatTimes(Integer repeatTimes) {
		this.repeatTimes = repeatTimes;
		if(repeatTimes != null){
			putQueryParameter("RepeatTimes", repeatTimes.toString());
		}
	}

	public String getShowName() {
		return this.showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
		if(showName != null){
			putQueryParameter("ShowName", showName);
		}
	}

	public String getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
		if(resourceId != null){
			putQueryParameter("ResourceId", resourceId);
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType);
		}
	}

	public String getResourceUrl() {
		return this.resourceUrl;
	}

	public void setResourceUrl(String resourceUrl) {
		this.resourceUrl = resourceUrl;
		if(resourceUrl != null){
			putQueryParameter("ResourceUrl", resourceUrl);
		}
	}

	public Integer getSpot() {
		return this.spot;
	}

	public void setSpot(Integer spot) {
		this.spot = spot;
		if(spot != null){
			putQueryParameter("Spot", spot.toString());
		}
	}

	@Override
	public Class<AddShowIntoShowListResponse> getResponseClass() {
		return AddShowIntoShowListResponse.class;
	}

}
