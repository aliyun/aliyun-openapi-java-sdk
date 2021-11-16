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

package com.aliyuncs.vod.model.v20170321;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vod.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteImageRequest extends RpcAcsRequest<DeleteImageResponse> {
	   

	private String imageURLs;

	private String imageType;

	private String videoId;

	private String deleteImageType;

	private String imageIds;
	public DeleteImageRequest() {
		super("vod", "2017-03-21", "DeleteImage", "vod");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getImageURLs() {
		return this.imageURLs;
	}

	public void setImageURLs(String imageURLs) {
		this.imageURLs = imageURLs;
		if(imageURLs != null){
			putQueryParameter("ImageURLs", imageURLs);
		}
	}

	public String getImageType() {
		return this.imageType;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
		if(imageType != null){
			putQueryParameter("ImageType", imageType);
		}
	}

	public String getVideoId() {
		return this.videoId;
	}

	public void setVideoId(String videoId) {
		this.videoId = videoId;
		if(videoId != null){
			putQueryParameter("VideoId", videoId);
		}
	}

	public String getDeleteImageType() {
		return this.deleteImageType;
	}

	public void setDeleteImageType(String deleteImageType) {
		this.deleteImageType = deleteImageType;
		if(deleteImageType != null){
			putQueryParameter("DeleteImageType", deleteImageType);
		}
	}

	public String getImageIds() {
		return this.imageIds;
	}

	public void setImageIds(String imageIds) {
		this.imageIds = imageIds;
		if(imageIds != null){
			putQueryParameter("ImageIds", imageIds);
		}
	}

	@Override
	public Class<DeleteImageResponse> getResponseClass() {
		return DeleteImageResponse.class;
	}

}
