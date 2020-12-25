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

package com.aliyuncs.imm.model.v20170906;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.imm.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class EncodeBlindWatermarkRequest extends RpcAcsRequest<EncodeBlindWatermarkResponse> {
	   

	private String imageQuality;

	private String watermarkUri;

	private String project;

	private String content;

	private String targetUri;

	private String model;

	private String targetImageType;

	private String imageUri;
	public EncodeBlindWatermarkRequest() {
		super("imm", "2017-09-06", "EncodeBlindWatermark");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getImageQuality() {
		return this.imageQuality;
	}

	public void setImageQuality(String imageQuality) {
		this.imageQuality = imageQuality;
		if(imageQuality != null){
			putQueryParameter("ImageQuality", imageQuality);
		}
	}

	public String getWatermarkUri() {
		return this.watermarkUri;
	}

	public void setWatermarkUri(String watermarkUri) {
		this.watermarkUri = watermarkUri;
		if(watermarkUri != null){
			putQueryParameter("WatermarkUri", watermarkUri);
		}
	}

	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
		if(project != null){
			putQueryParameter("Project", project);
		}
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
		if(content != null){
			putQueryParameter("Content", content);
		}
	}

	public String getTargetUri() {
		return this.targetUri;
	}

	public void setTargetUri(String targetUri) {
		this.targetUri = targetUri;
		if(targetUri != null){
			putQueryParameter("TargetUri", targetUri);
		}
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
		if(model != null){
			putQueryParameter("Model", model);
		}
	}

	public String getTargetImageType() {
		return this.targetImageType;
	}

	public void setTargetImageType(String targetImageType) {
		this.targetImageType = targetImageType;
		if(targetImageType != null){
			putQueryParameter("TargetImageType", targetImageType);
		}
	}

	public String getImageUri() {
		return this.imageUri;
	}

	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
		if(imageUri != null){
			putQueryParameter("ImageUri", imageUri);
		}
	}

	@Override
	public Class<EncodeBlindWatermarkResponse> getResponseClass() {
		return EncodeBlindWatermarkResponse.class;
	}

}
