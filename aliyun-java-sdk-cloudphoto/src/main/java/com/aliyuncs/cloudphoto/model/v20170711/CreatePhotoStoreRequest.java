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

package com.aliyuncs.cloudphoto.model.v20170711;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class CreatePhotoStoreRequest extends RpcAcsRequest<CreatePhotoStoreResponse> {
	
	public CreatePhotoStoreRequest() {
		super("CloudPhoto", "2017-07-11", "CreatePhotoStore", "cloudphoto");
		setProtocol(ProtocolType.HTTPS);
	}

	private String bucketName;

	private String storeName;

	private String remark;

	private Long defaultQuota;

	public String getBucketName() {
		return this.bucketName;
	}

	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
		if(bucketName != null){
			putQueryParameter("BucketName", bucketName);
		}
	}

	public String getStoreName() {
		return this.storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
		if(storeName != null){
			putQueryParameter("StoreName", storeName);
		}
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		if(remark != null){
			putQueryParameter("Remark", remark);
		}
	}

	public Long getDefaultQuota() {
		return this.defaultQuota;
	}

	public void setDefaultQuota(Long defaultQuota) {
		this.defaultQuota = defaultQuota;
		if(defaultQuota != null){
			putQueryParameter("DefaultQuota", defaultQuota.toString());
		}
	}

	@Override
	public Class<CreatePhotoStoreResponse> getResponseClass() {
		return CreatePhotoStoreResponse.class;
	}

}
