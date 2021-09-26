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

package com.aliyuncs.vs.model.v20181212;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class PutBucketRequest extends RpcAcsRequest<PutBucketResponse> {
	   

	private String dataRedundancyType;

	private String endpoint;

	private String bucketName;

	private String bucketAcl;

	private String dispatcherType;

	private Long ownerId;

	private String resourceType;

	private String storageClass;

	private String comment;
	public PutBucketRequest() {
		super("vs", "2018-12-12", "PutBucket", "vs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDataRedundancyType() {
		return this.dataRedundancyType;
	}

	public void setDataRedundancyType(String dataRedundancyType) {
		this.dataRedundancyType = dataRedundancyType;
		if(dataRedundancyType != null){
			putQueryParameter("DataRedundancyType", dataRedundancyType);
		}
	}

	public String getEndpoint() {
		return this.endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
		if(endpoint != null){
			putQueryParameter("Endpoint", endpoint);
		}
	}

	public String getBucketName() {
		return this.bucketName;
	}

	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
		if(bucketName != null){
			putQueryParameter("BucketName", bucketName);
		}
	}

	public String getBucketAcl() {
		return this.bucketAcl;
	}

	public void setBucketAcl(String bucketAcl) {
		this.bucketAcl = bucketAcl;
		if(bucketAcl != null){
			putQueryParameter("BucketAcl", bucketAcl);
		}
	}

	public String getDispatcherType() {
		return this.dispatcherType;
	}

	public void setDispatcherType(String dispatcherType) {
		this.dispatcherType = dispatcherType;
		if(dispatcherType != null){
			putQueryParameter("DispatcherType", dispatcherType);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType);
		}
	}

	public String getStorageClass() {
		return this.storageClass;
	}

	public void setStorageClass(String storageClass) {
		this.storageClass = storageClass;
		if(storageClass != null){
			putQueryParameter("StorageClass", storageClass);
		}
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
		if(comment != null){
			putQueryParameter("Comment", comment);
		}
	}

	@Override
	public Class<PutBucketResponse> getResponseClass() {
		return PutBucketResponse.class;
	}

}
