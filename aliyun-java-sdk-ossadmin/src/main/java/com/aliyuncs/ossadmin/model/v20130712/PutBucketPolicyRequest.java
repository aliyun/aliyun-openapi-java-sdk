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

package com.aliyuncs.ossadmin.model.v20130712;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class PutBucketPolicyRequest extends RpcAcsRequest<PutBucketPolicyResponse> {
	
	public PutBucketPolicyRequest() {
		super("OssAdmin", "2013-07-12", "PutBucketPolicy", "ossadmin");
	}

	private String logPrefix;

	private String ownerAccount;

	private String errorFile;

	private String indexFile;

	private Boolean disallowEmptyRefer;

	private String uid;

	private String logBucket;

	private String bucketName;

	private String location;

	private String bid;

	private Boolean enableDualCluster;

	private String whiteReferList;

	private String iamPolicy;

	public String getLogPrefix() {
		return this.logPrefix;
	}

	public void setLogPrefix(String logPrefix) {
		this.logPrefix = logPrefix;
		if(logPrefix != null){
			putQueryParameter("LogPrefix", logPrefix);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getErrorFile() {
		return this.errorFile;
	}

	public void setErrorFile(String errorFile) {
		this.errorFile = errorFile;
		if(errorFile != null){
			putQueryParameter("ErrorFile", errorFile);
		}
	}

	public String getIndexFile() {
		return this.indexFile;
	}

	public void setIndexFile(String indexFile) {
		this.indexFile = indexFile;
		if(indexFile != null){
			putQueryParameter("IndexFile", indexFile);
		}
	}

	public Boolean getDisallowEmptyRefer() {
		return this.disallowEmptyRefer;
	}

	public void setDisallowEmptyRefer(Boolean disallowEmptyRefer) {
		this.disallowEmptyRefer = disallowEmptyRefer;
		if(disallowEmptyRefer != null){
			putQueryParameter("DisallowEmptyRefer", disallowEmptyRefer.toString());
		}
	}

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
		if(uid != null){
			putQueryParameter("uid", uid);
		}
	}

	public String getLogBucket() {
		return this.logBucket;
	}

	public void setLogBucket(String logBucket) {
		this.logBucket = logBucket;
		if(logBucket != null){
			putQueryParameter("LogBucket", logBucket);
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

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
		if(location != null){
			putQueryParameter("Location", location);
		}
	}

	public String getBid() {
		return this.bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
		if(bid != null){
			putQueryParameter("bid", bid);
		}
	}

	public Boolean getEnableDualCluster() {
		return this.enableDualCluster;
	}

	public void setEnableDualCluster(Boolean enableDualCluster) {
		this.enableDualCluster = enableDualCluster;
		if(enableDualCluster != null){
			putQueryParameter("EnableDualCluster", enableDualCluster.toString());
		}
	}

	public String getWhiteReferList() {
		return this.whiteReferList;
	}

	public void setWhiteReferList(String whiteReferList) {
		this.whiteReferList = whiteReferList;
		if(whiteReferList != null){
			putQueryParameter("WhiteReferList", whiteReferList);
		}
	}

	public String getIamPolicy() {
		return this.iamPolicy;
	}

	public void setIamPolicy(String iamPolicy) {
		this.iamPolicy = iamPolicy;
		if(iamPolicy != null){
			putQueryParameter("IamPolicy", iamPolicy);
		}
	}

	@Override
	public Class<PutBucketPolicyResponse> getResponseClass() {
		return PutBucketPolicyResponse.class;
	}

}
