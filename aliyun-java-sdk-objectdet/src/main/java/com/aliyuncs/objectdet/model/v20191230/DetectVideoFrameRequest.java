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

package com.aliyuncs.objectdet.model.v20191230;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.objectdet.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DetectVideoFrameRequest extends RpcAcsRequest<DetectVideoFrameResponse> {
	   

	@SerializedName("features")
	private List<String> features;

	private Long height;

	private Long createTime;

	private String featureConfig;

	private Long ownerId;

	private String streamArn;

	private String imageURL;

	private Long width;
	public DetectVideoFrameRequest() {
		super("objectdet", "2019-12-30", "DetectVideoFrame");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getFeatures() {
		return this.features;
	}

	public void setFeatures(List<String> features) {
		this.features = features;	
		if (features != null) {
			putBodyParameter("Features" , new Gson().toJson(features));
		}	
	}

	public Long getHeight() {
		return this.height;
	}

	public void setHeight(Long height) {
		this.height = height;
		if(height != null){
			putBodyParameter("Height", height.toString());
		}
	}

	public Long getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
		if(createTime != null){
			putBodyParameter("CreateTime", createTime.toString());
		}
	}

	public String getFeatureConfig() {
		return this.featureConfig;
	}

	public void setFeatureConfig(String featureConfig) {
		this.featureConfig = featureConfig;
		if(featureConfig != null){
			putBodyParameter("FeatureConfig", featureConfig);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putBodyParameter("OwnerId", ownerId.toString());
		}
	}

	public String getStreamArn() {
		return this.streamArn;
	}

	public void setStreamArn(String streamArn) {
		this.streamArn = streamArn;
		if(streamArn != null){
			putBodyParameter("StreamArn", streamArn);
		}
	}

	public String getImageURL() {
		return this.imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
		if(imageURL != null){
			putBodyParameter("ImageURL", imageURL);
		}
	}

	public Long getWidth() {
		return this.width;
	}

	public void setWidth(Long width) {
		this.width = width;
		if(width != null){
			putBodyParameter("Width", width.toString());
		}
	}

	@Override
	public Class<DetectVideoFrameResponse> getResponseClass() {
		return DetectVideoFrameResponse.class;
	}

}
