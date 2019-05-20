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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class UploadMediaRequest extends RpcAcsRequest<UploadMediaResponse> {
	
	public UploadMediaRequest() {
		super("CloudCallCenter", "2017-07-05", "UploadMedia", "CloudCallCenter", "innerAPI");
	}

	private String instance;

	private String fileName;

	private String callbackHost;

	private Long media;

	private String callbackUrl;

	public String getInstance() {
		return this.instance;
	}

	public void setInstance(String instance) {
		this.instance = instance;
		if(instance != null){
			putQueryParameter("Instance", instance);
		}
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
		if(fileName != null){
			putQueryParameter("FileName", fileName);
		}
	}

	public String getCallbackHost() {
		return this.callbackHost;
	}

	public void setCallbackHost(String callbackHost) {
		this.callbackHost = callbackHost;
		if(callbackHost != null){
			putQueryParameter("CallbackHost", callbackHost);
		}
	}

	public Long getMedia() {
		return this.media;
	}

	public void setMedia(Long media) {
		this.media = media;
		if(media != null){
			putQueryParameter("Media", media.toString());
		}
	}

	public String getCallbackUrl() {
		return this.callbackUrl;
	}

	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
		if(callbackUrl != null){
			putQueryParameter("CallbackUrl", callbackUrl);
		}
	}

	@Override
	public Class<UploadMediaResponse> getResponseClass() {
		return UploadMediaResponse.class;
	}

}
