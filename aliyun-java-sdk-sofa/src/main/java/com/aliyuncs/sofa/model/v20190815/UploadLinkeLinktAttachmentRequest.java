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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UploadLinkeLinktAttachmentRequest extends RpcAcsRequest<UploadLinkeLinktAttachmentResponse> {
	   

	private String targetType;

	private String storedFilename;

	private String url;

	private String filename;

	private String targetResource;
	public UploadLinkeLinktAttachmentRequest() {
		super("SOFA", "2019-08-15", "UploadLinkeLinktAttachment", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTargetType() {
		return this.targetType;
	}

	public void setTargetType(String targetType) {
		this.targetType = targetType;
		if(targetType != null){
			putBodyParameter("TargetType", targetType);
		}
	}

	public String getStoredFilename() {
		return this.storedFilename;
	}

	public void setStoredFilename(String storedFilename) {
		this.storedFilename = storedFilename;
		if(storedFilename != null){
			putBodyParameter("StoredFilename", storedFilename);
		}
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
		if(url != null){
			putBodyParameter("Url", url);
		}
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
		if(filename != null){
			putBodyParameter("Filename", filename);
		}
	}

	public String getTargetResource() {
		return this.targetResource;
	}

	public void setTargetResource(String targetResource) {
		this.targetResource = targetResource;
		if(targetResource != null){
			putBodyParameter("TargetResource", targetResource);
		}
	}

	@Override
	public Class<UploadLinkeLinktAttachmentResponse> getResponseClass() {
		return UploadLinkeLinktAttachmentResponse.class;
	}

}
