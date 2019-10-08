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

/**
 * @author auto create
 * @version 
 */
public class DecodeBlindWatermarkRequest extends RpcAcsRequest<DecodeBlindWatermarkResponse> {
	   

	private Integer imageQuality;

	private String project;

	private String targetUri;

	private String imageUri;

	private String originalImageUri;
	public DecodeBlindWatermarkRequest() {
		super("imm", "2017-09-06", "DecodeBlindWatermark", "imm");
		setMethod(MethodType.POST);
	}

	public Integer getImageQuality() {
		return this.imageQuality;
	}

	public void setImageQuality(Integer imageQuality) {
		this.imageQuality = imageQuality;
		if(imageQuality != null){
			putQueryParameter("ImageQuality", imageQuality.toString());
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

	public String getTargetUri() {
		return this.targetUri;
	}

	public void setTargetUri(String targetUri) {
		this.targetUri = targetUri;
		if(targetUri != null){
			putQueryParameter("TargetUri", targetUri);
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

	public String getOriginalImageUri() {
		return this.originalImageUri;
	}

	public void setOriginalImageUri(String originalImageUri) {
		this.originalImageUri = originalImageUri;
		if(originalImageUri != null){
			putQueryParameter("OriginalImageUri", originalImageUri);
		}
	}

	@Override
	public Class<DecodeBlindWatermarkResponse> getResponseClass() {
		return DecodeBlindWatermarkResponse.class;
	}

}
