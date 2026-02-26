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

package com.aliyuncs.alimt.model.v20181012;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.alimt.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class TranslateImageBatchRequest extends RpcAcsRequest<TranslateImageBatchResponse> {
	   

	private String ext;

	private String sourceLanguage;

	private String imageUrls;

	private String customTaskId;

	private String field;

	private String targetLanguage;
	public TranslateImageBatchRequest() {
		super("alimt", "2018-10-12", "TranslateImageBatch");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getExt() {
		return this.ext;
	}

	public void setExt(String ext) {
		this.ext = ext;
		if(ext != null){
			putBodyParameter("Ext", ext);
		}
	}

	public String getSourceLanguage() {
		return this.sourceLanguage;
	}

	public void setSourceLanguage(String sourceLanguage) {
		this.sourceLanguage = sourceLanguage;
		if(sourceLanguage != null){
			putBodyParameter("SourceLanguage", sourceLanguage);
		}
	}

	public String getImageUrls() {
		return this.imageUrls;
	}

	public void setImageUrls(String imageUrls) {
		this.imageUrls = imageUrls;
		if(imageUrls != null){
			putBodyParameter("ImageUrls", imageUrls);
		}
	}

	public String getCustomTaskId() {
		return this.customTaskId;
	}

	public void setCustomTaskId(String customTaskId) {
		this.customTaskId = customTaskId;
		if(customTaskId != null){
			putBodyParameter("CustomTaskId", customTaskId);
		}
	}

	public String getField() {
		return this.field;
	}

	public void setField(String field) {
		this.field = field;
		if(field != null){
			putBodyParameter("Field", field);
		}
	}

	public String getTargetLanguage() {
		return this.targetLanguage;
	}

	public void setTargetLanguage(String targetLanguage) {
		this.targetLanguage = targetLanguage;
		if(targetLanguage != null){
			putBodyParameter("TargetLanguage", targetLanguage);
		}
	}

	@Override
	public Class<TranslateImageBatchResponse> getResponseClass() {
		return TranslateImageBatchResponse.class;
	}

}
