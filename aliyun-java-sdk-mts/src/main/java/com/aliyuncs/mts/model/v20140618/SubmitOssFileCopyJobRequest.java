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
public class SubmitOssFileCopyJobRequest extends RpcAcsRequest<SubmitOssFileCopyJobResponse> {
	   

	@SerializedName("targetStorage")
	private TargetStorage targetStorage;

	private String notify;

	private String userData;

	@SerializedName("sourceStorage")
	private SourceStorage sourceStorage;

	private String region;
	public SubmitOssFileCopyJobRequest() {
		super("Mts", "2014-06-18", "SubmitOssFileCopyJob", "mts");
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

	public SourceStorage getSourceStorage() {
		return this.sourceStorage;
	}

	public void setSourceStorage(SourceStorage sourceStorage) {
		this.sourceStorage = sourceStorage;	
		if (sourceStorage != null) {
			putQueryParameter("SourceStorage" , new Gson().toJson(sourceStorage));
		}	
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
		}
	}

	public static class TargetStorage {

		@SerializedName("Bucket")
		private String bucket;

		@SerializedName("BucketOwnerId")
		private Long bucketOwnerId;

		@SerializedName("S3Provider")
		private String s3Provider;

		@SerializedName("S3Endpoint")
		private String s3Endpoint;

		@SerializedName("ObjectPrefix")
		private String objectPrefix;

		@SerializedName("S3AccessKey")
		private String s3AccessKey;

		@SerializedName("S3SecretKey")
		private String s3SecretKey;

		@SerializedName("S3SessionToken")
		private String s3SessionToken;

		@SerializedName("ObjectRoleName")
		private String objectRoleName;

		public String getBucket() {
			return this.bucket;
		}

		public void setBucket(String bucket) {
			this.bucket = bucket;
		}

		public Long getBucketOwnerId() {
			return this.bucketOwnerId;
		}

		public void setBucketOwnerId(Long bucketOwnerId) {
			this.bucketOwnerId = bucketOwnerId;
		}

		public String getS3Provider() {
			return this.s3Provider;
		}

		public void setS3Provider(String s3Provider) {
			this.s3Provider = s3Provider;
		}

		public String getS3Endpoint() {
			return this.s3Endpoint;
		}

		public void setS3Endpoint(String s3Endpoint) {
			this.s3Endpoint = s3Endpoint;
		}

		public String getObjectPrefix() {
			return this.objectPrefix;
		}

		public void setObjectPrefix(String objectPrefix) {
			this.objectPrefix = objectPrefix;
		}

		public String getS3AccessKey() {
			return this.s3AccessKey;
		}

		public void setS3AccessKey(String s3AccessKey) {
			this.s3AccessKey = s3AccessKey;
		}

		public String getS3SecretKey() {
			return this.s3SecretKey;
		}

		public void setS3SecretKey(String s3SecretKey) {
			this.s3SecretKey = s3SecretKey;
		}

		public String getS3SessionToken() {
			return this.s3SessionToken;
		}

		public void setS3SessionToken(String s3SessionToken) {
			this.s3SessionToken = s3SessionToken;
		}

		public String getObjectRoleName() {
			return this.objectRoleName;
		}

		public void setObjectRoleName(String objectRoleName) {
			this.objectRoleName = objectRoleName;
		}
	}

	public static class SourceStorage {

		@SerializedName("Bucket")
		private String bucket;

		@SerializedName("BucketOwnerId")
		private Long bucketOwnerId;

		@SerializedName("S3Provider")
		private String s3Provider;

		@SerializedName("S3Endpoint")
		private String s3Endpoint;

		@SerializedName("ObjectPrefix")
		private String objectPrefix;

		@SerializedName("S3AccessKey")
		private String s3AccessKey;

		@SerializedName("S3SecretKey")
		private String s3SecretKey;

		@SerializedName("FileNames")
		private String fileNames;

		@SerializedName("S3SessionToken")
		private String s3SessionToken;

		@SerializedName("ObjectRoleName")
		private String objectRoleName;

		public String getBucket() {
			return this.bucket;
		}

		public void setBucket(String bucket) {
			this.bucket = bucket;
		}

		public Long getBucketOwnerId() {
			return this.bucketOwnerId;
		}

		public void setBucketOwnerId(Long bucketOwnerId) {
			this.bucketOwnerId = bucketOwnerId;
		}

		public String getS3Provider() {
			return this.s3Provider;
		}

		public void setS3Provider(String s3Provider) {
			this.s3Provider = s3Provider;
		}

		public String getS3Endpoint() {
			return this.s3Endpoint;
		}

		public void setS3Endpoint(String s3Endpoint) {
			this.s3Endpoint = s3Endpoint;
		}

		public String getObjectPrefix() {
			return this.objectPrefix;
		}

		public void setObjectPrefix(String objectPrefix) {
			this.objectPrefix = objectPrefix;
		}

		public String getS3AccessKey() {
			return this.s3AccessKey;
		}

		public void setS3AccessKey(String s3AccessKey) {
			this.s3AccessKey = s3AccessKey;
		}

		public String getS3SecretKey() {
			return this.s3SecretKey;
		}

		public void setS3SecretKey(String s3SecretKey) {
			this.s3SecretKey = s3SecretKey;
		}

		public String getFileNames() {
			return this.fileNames;
		}

		public void setFileNames(String fileNames) {
			this.fileNames = fileNames;
		}

		public String getS3SessionToken() {
			return this.s3SessionToken;
		}

		public void setS3SessionToken(String s3SessionToken) {
			this.s3SessionToken = s3SessionToken;
		}

		public String getObjectRoleName() {
			return this.objectRoleName;
		}

		public void setObjectRoleName(String objectRoleName) {
			this.objectRoleName = objectRoleName;
		}
	}

	@Override
	public Class<SubmitOssFileCopyJobResponse> getResponseClass() {
		return SubmitOssFileCopyJobResponse.class;
	}

}
