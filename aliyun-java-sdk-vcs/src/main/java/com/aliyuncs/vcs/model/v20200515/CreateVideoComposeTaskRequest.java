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

package com.aliyuncs.vcs.model.v20200515;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vcs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateVideoComposeTaskRequest extends RpcAcsRequest<CreateVideoComposeTaskResponse> {
	   

	private String corpId;

	private String domainName;

	private Integer videoFrameRate;

	private String imageFileNames;

	private String audioFileName;

	private String bucketName;

	private String imageParameters;

	private String videoFormat;
	public CreateVideoComposeTaskRequest() {
		super("Vcs", "2020-05-15", "CreateVideoComposeTask", "vcs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCorpId() {
		return this.corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
		if(corpId != null){
			putBodyParameter("CorpId", corpId);
		}
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putBodyParameter("DomainName", domainName);
		}
	}

	public Integer getVideoFrameRate() {
		return this.videoFrameRate;
	}

	public void setVideoFrameRate(Integer videoFrameRate) {
		this.videoFrameRate = videoFrameRate;
		if(videoFrameRate != null){
			putBodyParameter("VideoFrameRate", videoFrameRate.toString());
		}
	}

	public String getImageFileNames() {
		return this.imageFileNames;
	}

	public void setImageFileNames(String imageFileNames) {
		this.imageFileNames = imageFileNames;
		if(imageFileNames != null){
			putBodyParameter("ImageFileNames", imageFileNames);
		}
	}

	public String getAudioFileName() {
		return this.audioFileName;
	}

	public void setAudioFileName(String audioFileName) {
		this.audioFileName = audioFileName;
		if(audioFileName != null){
			putBodyParameter("AudioFileName", audioFileName);
		}
	}

	public String getBucketName() {
		return this.bucketName;
	}

	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
		if(bucketName != null){
			putBodyParameter("BucketName", bucketName);
		}
	}

	public String getImageParameters() {
		return this.imageParameters;
	}

	public void setImageParameters(String imageParameters) {
		this.imageParameters = imageParameters;
		if(imageParameters != null){
			putBodyParameter("ImageParameters", imageParameters);
		}
	}

	public String getVideoFormat() {
		return this.videoFormat;
	}

	public void setVideoFormat(String videoFormat) {
		this.videoFormat = videoFormat;
		if(videoFormat != null){
			putBodyParameter("VideoFormat", videoFormat);
		}
	}

	@Override
	public Class<CreateVideoComposeTaskResponse> getResponseClass() {
		return CreateVideoComposeTaskResponse.class;
	}

}
