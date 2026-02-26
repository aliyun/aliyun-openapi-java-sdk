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

package com.aliyuncs.grace.model.v20220606;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UploadFileByOSSRequest extends RoaAcsRequest<UploadFileByOSSResponse> {
	   

	private String objectName;

	private String type;

	private String endpoint;

	private String bucketName;

	private String displayName;
	public UploadFileByOSSRequest() {
		super("grace", "2022-06-06", "UploadFileByOSS", "grace");
		setUriPattern("/UploadFileByOSS");
		setMethod(MethodType.POST);
	}

	public String getObjectName() {
		return this.objectName;
	}

	public void setObjectName(String objectName) {
		this.objectName = objectName;
		if(objectName != null){
			putQueryParameter("objectName", objectName);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("type", type);
		}
	}

	public String getEndpoint() {
		return this.endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
		if(endpoint != null){
			putQueryParameter("endpoint", endpoint);
		}
	}

	public String getBucketName() {
		return this.bucketName;
	}

	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
		if(bucketName != null){
			putQueryParameter("bucketName", bucketName);
		}
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
		if(displayName != null){
			putQueryParameter("displayName", displayName);
		}
	}

	@Override
	public Class<UploadFileByOSSResponse> getResponseClass() {
		return UploadFileByOSSResponse.class;
	}

}
