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

package com.aliyuncs.aigen.model.v20240111;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GenerateCosplayImageRequest extends RpcAcsRequest<GenerateCosplayImageResponse> {
	   

	private String templateImageUrl;

	private String faceImageUrl;

	private Long style;
	public GenerateCosplayImageRequest() {
		super("aigen", "2024-01-11", "GenerateCosplayImage");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getTemplateImageUrl() {
		return this.templateImageUrl;
	}

	public void setTemplateImageUrl(String templateImageUrl) {
		this.templateImageUrl = templateImageUrl;
		if(templateImageUrl != null){
			putBodyParameter("TemplateImageUrl", templateImageUrl);
		}
	}

	public String getFaceImageUrl() {
		return this.faceImageUrl;
	}

	public void setFaceImageUrl(String faceImageUrl) {
		this.faceImageUrl = faceImageUrl;
		if(faceImageUrl != null){
			putBodyParameter("FaceImageUrl", faceImageUrl);
		}
	}

	public Long getStyle() {
		return this.style;
	}

	public void setStyle(Long style) {
		this.style = style;
		if(style != null){
			putBodyParameter("Style", style.toString());
		}
	}

	@Override
	public Class<GenerateCosplayImageResponse> getResponseClass() {
		return GenerateCosplayImageResponse.class;
	}

}
