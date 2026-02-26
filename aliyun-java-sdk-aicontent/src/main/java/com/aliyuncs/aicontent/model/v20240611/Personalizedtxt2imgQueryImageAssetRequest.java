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

package com.aliyuncs.aicontent.model.v20240611;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class Personalizedtxt2imgQueryImageAssetRequest extends RoaAcsRequest<Personalizedtxt2imgQueryImageAssetResponse> {
	   

	private String imageId;

	private String modelId;

	private String encodeFormat;

	private String promptId;
	public Personalizedtxt2imgQueryImageAssetRequest() {
		super("AiContent", "20240611", "Personalizedtxt2imgQueryImageAsset");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/api/v1/personalizedtxt2img/queryImageAsset");
		setMethod(MethodType.GET);
	}

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
		if(imageId != null){
			putQueryParameter("imageId", imageId);
		}
	}

	public String getModelId() {
		return this.modelId;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
		if(modelId != null){
			putQueryParameter("modelId", modelId);
		}
	}

	public String getEncodeFormat() {
		return this.encodeFormat;
	}

	public void setEncodeFormat(String encodeFormat) {
		this.encodeFormat = encodeFormat;
		if(encodeFormat != null){
			putQueryParameter("encodeFormat", encodeFormat);
		}
	}

	public String getPromptId() {
		return this.promptId;
	}

	public void setPromptId(String promptId) {
		this.promptId = promptId;
		if(promptId != null){
			putQueryParameter("promptId", promptId);
		}
	}

	@Override
	public Class<Personalizedtxt2imgQueryImageAssetResponse> getResponseClass() {
		return Personalizedtxt2imgQueryImageAssetResponse.class;
	}

}
