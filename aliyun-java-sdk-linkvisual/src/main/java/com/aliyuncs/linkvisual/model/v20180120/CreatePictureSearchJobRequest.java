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

package com.aliyuncs.linkvisual.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkvisual.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreatePictureSearchJobRequest extends RpcAcsRequest<CreatePictureSearchJobResponse> {
	   

	private Float threshold;

	private String searchPicUrl;

	private Long startTime;

	private Integer pictureSearchType;

	private Float bodyThreshold;

	private Long endTime;

	private String appInstanceId;
	public CreatePictureSearchJobRequest() {
		super("Linkvisual", "2018-01-20", "CreatePictureSearchJob", "Linkvisual");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Float getThreshold() {
		return this.threshold;
	}

	public void setThreshold(Float threshold) {
		this.threshold = threshold;
		if(threshold != null){
			putQueryParameter("Threshold", threshold.toString());
		}
	}

	public String getSearchPicUrl() {
		return this.searchPicUrl;
	}

	public void setSearchPicUrl(String searchPicUrl) {
		this.searchPicUrl = searchPicUrl;
		if(searchPicUrl != null){
			putQueryParameter("SearchPicUrl", searchPicUrl);
		}
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime.toString());
		}
	}

	public Integer getPictureSearchType() {
		return this.pictureSearchType;
	}

	public void setPictureSearchType(Integer pictureSearchType) {
		this.pictureSearchType = pictureSearchType;
		if(pictureSearchType != null){
			putQueryParameter("PictureSearchType", pictureSearchType.toString());
		}
	}

	public Float getBodyThreshold() {
		return this.bodyThreshold;
	}

	public void setBodyThreshold(Float bodyThreshold) {
		this.bodyThreshold = bodyThreshold;
		if(bodyThreshold != null){
			putQueryParameter("BodyThreshold", bodyThreshold.toString());
		}
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime.toString());
		}
	}

	public String getAppInstanceId() {
		return this.appInstanceId;
	}

	public void setAppInstanceId(String appInstanceId) {
		this.appInstanceId = appInstanceId;
		if(appInstanceId != null){
			putQueryParameter("AppInstanceId", appInstanceId);
		}
	}

	@Override
	public Class<CreatePictureSearchJobResponse> getResponseClass() {
		return CreatePictureSearchJobResponse.class;
	}

}
