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

package com.aliyuncs.dms_enterprise.model.v20181101;

import com.aliyuncs.RpcAcsRequest;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dms_enterprise.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateUploadOSSFileJobRequest extends RpcAcsRequest<CreateUploadOSSFileJobResponse> {
	   

	private String fileSource;

	private Long tid;

	private String fileName;

	@SerializedName("uploadTarget")
	private UploadTarget uploadTarget;
	public CreateUploadOSSFileJobRequest() {
		super("dms-enterprise", "2018-11-01", "CreateUploadOSSFileJob", "dms-enterprise");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFileSource() {
		return this.fileSource;
	}

	public void setFileSource(String fileSource) {
		this.fileSource = fileSource;
		if(fileSource != null){
			putQueryParameter("FileSource", fileSource);
		}
	}

	public Long getTid() {
		return this.tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
		if(tid != null){
			putQueryParameter("Tid", tid.toString());
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

	public UploadTarget getUploadTarget() {
		return this.uploadTarget;
	}

	public void setUploadTarget(UploadTarget uploadTarget) {
		this.uploadTarget = uploadTarget;	
		if (uploadTarget != null) {
			putQueryParameter("UploadTarget" , new Gson().toJson(uploadTarget));
		}	
	}

	public static class UploadTarget {

		@SerializedName("Endpoint")
		private String endpoint;

		@SerializedName("BucketName")
		private String bucketName;

		@SerializedName("ObjectName")
		private String objectName;

		public String getEndpoint() {
			return this.endpoint;
		}

		public void setEndpoint(String endpoint) {
			this.endpoint = endpoint;
		}

		public String getBucketName() {
			return this.bucketName;
		}

		public void setBucketName(String bucketName) {
			this.bucketName = bucketName;
		}

		public String getObjectName() {
			return this.objectName;
		}

		public void setObjectName(String objectName) {
			this.objectName = objectName;
		}
	}

	@Override
	public Class<CreateUploadOSSFileJobResponse> getResponseClass() {
		return CreateUploadOSSFileJobResponse.class;
	}

}
