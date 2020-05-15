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

package com.aliyuncs.videosearch.model.v20200225;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AddSearchVideoTaskRequest extends RpcAcsRequest<AddSearchVideoTaskResponse> {
	   

	private String clientToken;

	private Integer storageType;

	private String videoTags;

	private Integer returnVideoNumber;

	private String videoId;

	private Float replaceStorageThreshold;

	private String instanceId;

	private String videoUrl;

	private String queryTags;

	private String callbackUrl;
	public AddSearchVideoTaskRequest() {
		super("videosearch", "2020-02-25", "AddSearchVideoTask");
		setMethod(MethodType.POST);
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public Integer getStorageType() {
		return this.storageType;
	}

	public void setStorageType(Integer storageType) {
		this.storageType = storageType;
		if(storageType != null){
			putBodyParameter("StorageType", storageType.toString());
		}
	}

	public String getVideoTags() {
		return this.videoTags;
	}

	public void setVideoTags(String videoTags) {
		this.videoTags = videoTags;
		if(videoTags != null){
			putBodyParameter("VideoTags", videoTags);
		}
	}

	public Integer getReturnVideoNumber() {
		return this.returnVideoNumber;
	}

	public void setReturnVideoNumber(Integer returnVideoNumber) {
		this.returnVideoNumber = returnVideoNumber;
		if(returnVideoNumber != null){
			putBodyParameter("ReturnVideoNumber", returnVideoNumber.toString());
		}
	}

	public String getVideoId() {
		return this.videoId;
	}

	public void setVideoId(String videoId) {
		this.videoId = videoId;
		if(videoId != null){
			putBodyParameter("VideoId", videoId);
		}
	}

	public Float getReplaceStorageThreshold() {
		return this.replaceStorageThreshold;
	}

	public void setReplaceStorageThreshold(Float replaceStorageThreshold) {
		this.replaceStorageThreshold = replaceStorageThreshold;
		if(replaceStorageThreshold != null){
			putBodyParameter("ReplaceStorageThreshold", replaceStorageThreshold.toString());
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public String getVideoUrl() {
		return this.videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
		if(videoUrl != null){
			putBodyParameter("VideoUrl", videoUrl);
		}
	}

	public String getQueryTags() {
		return this.queryTags;
	}

	public void setQueryTags(String queryTags) {
		this.queryTags = queryTags;
		if(queryTags != null){
			putBodyParameter("QueryTags", queryTags);
		}
	}

	public String getCallbackUrl() {
		return this.callbackUrl;
	}

	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
		if(callbackUrl != null){
			putBodyParameter("CallbackUrl", callbackUrl);
		}
	}

	@Override
	public Class<AddSearchVideoTaskResponse> getResponseClass() {
		return AddSearchVideoTaskResponse.class;
	}

}
