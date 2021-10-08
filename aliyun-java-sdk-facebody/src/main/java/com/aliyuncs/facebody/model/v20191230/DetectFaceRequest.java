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

package com.aliyuncs.facebody.model.v20191230;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.facebody.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DetectFaceRequest extends RpcAcsRequest<DetectFaceResponse> {
	   

	private Long maxFaceNumber;

	private Boolean landmark;

	private Boolean pose;

	private Boolean quality;

	private String imageURL;
	public DetectFaceRequest() {
		super("facebody", "2019-12-30", "DetectFace");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getMaxFaceNumber() {
		return this.maxFaceNumber;
	}

	public void setMaxFaceNumber(Long maxFaceNumber) {
		this.maxFaceNumber = maxFaceNumber;
		if(maxFaceNumber != null){
			putBodyParameter("MaxFaceNumber", maxFaceNumber.toString());
		}
	}

	public Boolean getLandmark() {
		return this.landmark;
	}

	public void setLandmark(Boolean landmark) {
		this.landmark = landmark;
		if(landmark != null){
			putBodyParameter("Landmark", landmark.toString());
		}
	}

	public Boolean getPose() {
		return this.pose;
	}

	public void setPose(Boolean pose) {
		this.pose = pose;
		if(pose != null){
			putBodyParameter("Pose", pose.toString());
		}
	}

	public Boolean getQuality() {
		return this.quality;
	}

	public void setQuality(Boolean quality) {
		this.quality = quality;
		if(quality != null){
			putBodyParameter("Quality", quality.toString());
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

	@Override
	public Class<DetectFaceResponse> getResponseClass() {
		return DetectFaceResponse.class;
	}

}
