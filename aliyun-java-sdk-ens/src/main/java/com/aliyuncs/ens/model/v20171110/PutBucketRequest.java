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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class PutBucketRequest extends RpcAcsRequest<PutBucketResponse> {
	   

	private String ensRegionId;

	private String logicalBucketType;

	private String bucketName;

	private String bucketAcl;

	private String comment;
	public PutBucketRequest() {
		super("Ens", "2017-11-10", "PutBucket", "ens");
		setMethod(MethodType.POST);
	}

	public String getEnsRegionId() {
		return this.ensRegionId;
	}

	public void setEnsRegionId(String ensRegionId) {
		this.ensRegionId = ensRegionId;
		if(ensRegionId != null){
			putBodyParameter("EnsRegionId", ensRegionId);
		}
	}

	public String getLogicalBucketType() {
		return this.logicalBucketType;
	}

	public void setLogicalBucketType(String logicalBucketType) {
		this.logicalBucketType = logicalBucketType;
		if(logicalBucketType != null){
			putBodyParameter("LogicalBucketType", logicalBucketType);
		}
	}

	public String getBucketName() {
		return this.bucketName;
	}

	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
		if(bucketName != null){
			putBodyParameter("BucketName", bucketName);
		}
	}

	public String getBucketAcl() {
		return this.bucketAcl;
	}

	public void setBucketAcl(String bucketAcl) {
		this.bucketAcl = bucketAcl;
		if(bucketAcl != null){
			putBodyParameter("BucketAcl", bucketAcl);
		}
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
		if(comment != null){
			putBodyParameter("Comment", comment);
		}
	}

	@Override
	public Class<PutBucketResponse> getResponseClass() {
		return PutBucketResponse.class;
	}

}
