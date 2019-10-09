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

package com.aliyuncs.green.model.v20170823;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.green.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateOssStockStatusRequest extends RpcAcsRequest<UpdateOssStockStatusResponse> {
	   

	private String resourceTypeList;

	private Integer videoFrameInterval;

	private String startDate;

	private String sourceIp;

	private String videoAutoFreezeSceneList;

	private String lang;

	private String imageAutoFreeze;

	private Integer videoMaxSize;

	private String autoFreezeType;

	private String endDate;

	private String bucketConfigList;

	private String sceneList;

	private Integer videoMaxFrames;

	private String operation;
	public UpdateOssStockStatusRequest() {
		super("Green", "2017-08-23", "UpdateOssStockStatus", "green");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getResourceTypeList() {
		return this.resourceTypeList;
	}

	public void setResourceTypeList(String resourceTypeList) {
		this.resourceTypeList = resourceTypeList;
		if(resourceTypeList != null){
			putQueryParameter("ResourceTypeList", resourceTypeList);
		}
	}

	public Integer getVideoFrameInterval() {
		return this.videoFrameInterval;
	}

	public void setVideoFrameInterval(Integer videoFrameInterval) {
		this.videoFrameInterval = videoFrameInterval;
		if(videoFrameInterval != null){
			putQueryParameter("VideoFrameInterval", videoFrameInterval.toString());
		}
	}

	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
		if(startDate != null){
			putQueryParameter("StartDate", startDate);
		}
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public String getVideoAutoFreezeSceneList() {
		return this.videoAutoFreezeSceneList;
	}

	public void setVideoAutoFreezeSceneList(String videoAutoFreezeSceneList) {
		this.videoAutoFreezeSceneList = videoAutoFreezeSceneList;
		if(videoAutoFreezeSceneList != null){
			putQueryParameter("VideoAutoFreezeSceneList", videoAutoFreezeSceneList);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public String getImageAutoFreeze() {
		return this.imageAutoFreeze;
	}

	public void setImageAutoFreeze(String imageAutoFreeze) {
		this.imageAutoFreeze = imageAutoFreeze;
		if(imageAutoFreeze != null){
			putQueryParameter("ImageAutoFreeze", imageAutoFreeze);
		}
	}

	public Integer getVideoMaxSize() {
		return this.videoMaxSize;
	}

	public void setVideoMaxSize(Integer videoMaxSize) {
		this.videoMaxSize = videoMaxSize;
		if(videoMaxSize != null){
			putQueryParameter("VideoMaxSize", videoMaxSize.toString());
		}
	}

	public String getAutoFreezeType() {
		return this.autoFreezeType;
	}

	public void setAutoFreezeType(String autoFreezeType) {
		this.autoFreezeType = autoFreezeType;
		if(autoFreezeType != null){
			putQueryParameter("AutoFreezeType", autoFreezeType);
		}
	}

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
		if(endDate != null){
			putQueryParameter("EndDate", endDate);
		}
	}

	public String getBucketConfigList() {
		return this.bucketConfigList;
	}

	public void setBucketConfigList(String bucketConfigList) {
		this.bucketConfigList = bucketConfigList;
		if(bucketConfigList != null){
			putQueryParameter("BucketConfigList", bucketConfigList);
		}
	}

	public String getSceneList() {
		return this.sceneList;
	}

	public void setSceneList(String sceneList) {
		this.sceneList = sceneList;
		if(sceneList != null){
			putQueryParameter("SceneList", sceneList);
		}
	}

	public Integer getVideoMaxFrames() {
		return this.videoMaxFrames;
	}

	public void setVideoMaxFrames(Integer videoMaxFrames) {
		this.videoMaxFrames = videoMaxFrames;
		if(videoMaxFrames != null){
			putQueryParameter("VideoMaxFrames", videoMaxFrames.toString());
		}
	}

	public String getOperation() {
		return this.operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
		if(operation != null){
			putQueryParameter("Operation", operation);
		}
	}

	@Override
	public Class<UpdateOssStockStatusResponse> getResponseClass() {
		return UpdateOssStockStatusResponse.class;
	}

}
