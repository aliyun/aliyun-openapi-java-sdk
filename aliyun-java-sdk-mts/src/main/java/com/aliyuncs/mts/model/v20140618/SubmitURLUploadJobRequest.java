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

package com.aliyuncs.mts.model.v20140618;

import com.aliyuncs.RpcAcsRequest;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mts.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SubmitURLUploadJobRequest extends RpcAcsRequest<SubmitURLUploadJobResponse> {
	   

	@SerializedName("targetStorage")
	private TargetStorage targetStorage;

	private String sourceFileURL;

	private String notify;

	private String userData;
	public SubmitURLUploadJobRequest() {
		super("Mts", "2014-06-18", "SubmitURLUploadJob", "mts");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public TargetStorage getTargetStorage() {
		return this.targetStorage;
	}

	public void setTargetStorage(TargetStorage targetStorage) {
		this.targetStorage = targetStorage;	
		if (targetStorage != null) {
			putQueryParameter("TargetStorage" , new Gson().toJson(targetStorage));
		}	
	}

	public String getSourceFileURL() {
		return this.sourceFileURL;
	}

	public void setSourceFileURL(String sourceFileURL) {
		this.sourceFileURL = sourceFileURL;
		if(sourceFileURL != null){
			putQueryParameter("SourceFileURL", sourceFileURL);
		}
	}

	public String getNotify() {
		return this.notify;
	}

	public void setNotify(String notify) {
		this.notify = notify;
		if(notify != null){
			putQueryParameter("Notify", notify);
		}
	}

	public String getUserData() {
		return this.userData;
	}

	public void setUserData(String userData) {
		this.userData = userData;
		if(userData != null){
			putQueryParameter("UserData", userData);
		}
	}

	public static class TargetStorage {

		@SerializedName("Bucket")
		private String bucket;

		@SerializedName("BucketOwnerId")
		private String bucketOwnerId;

		@SerializedName("ObjectKey")
		private String objectKey;

		@SerializedName("ObjectRoleName")
		private String objectRoleName;

		public String getBucket() {
			return this.bucket;
		}

		public void setBucket(String bucket) {
			this.bucket = bucket;
		}

		public String getBucketOwnerId() {
			return this.bucketOwnerId;
		}

		public void setBucketOwnerId(String bucketOwnerId) {
			this.bucketOwnerId = bucketOwnerId;
		}

		public String getObjectKey() {
			return this.objectKey;
		}

		public void setObjectKey(String objectKey) {
			this.objectKey = objectKey;
		}

		public String getObjectRoleName() {
			return this.objectRoleName;
		}

		public void setObjectRoleName(String objectRoleName) {
			this.objectRoleName = objectRoleName;
		}
	}

	@Override
	public Class<SubmitURLUploadJobResponse> getResponseClass() {
		return SubmitURLUploadJobResponse.class;
	}

}
