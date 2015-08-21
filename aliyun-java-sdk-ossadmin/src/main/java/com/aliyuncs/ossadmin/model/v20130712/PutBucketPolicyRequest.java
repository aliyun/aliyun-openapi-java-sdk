/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.ossadmin.model.v20130712;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class PutBucketPolicyRequest extends RpcAcsRequest<PutBucketPolicyResponse> {
	
	public PutBucketPolicyRequest() {
		super("OssAdmin", "2013-07-12", "PutBucketPolicy");
	}

	private String uid;

	private String bid;

	private String bucketName;

	private String iamPolicy;

	private Boolean disallowEmptyRefer;

	private Boolean enableDualCluster;

	private String errorFile;

	private String indexFile;

	private String location;

	private String logBucket;

	private String logPrefix;

	private String whiteReferList;

	private String ownerAccount;

	public String getuid() {
		return this.uid;
	}

	public void setuid(String uid) {
		this.uid = uid;
		putQueryParameter("uid", uid);
	}

	public String getbid() {
		return this.bid;
	}

	public void setbid(String bid) {
		this.bid = bid;
		putQueryParameter("bid", bid);
	}

	public String getBucketName() {
		return this.bucketName;
	}

	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
		putQueryParameter("BucketName", bucketName);
	}

	public String getIamPolicy() {
		return this.iamPolicy;
	}

	public void setIamPolicy(String iamPolicy) {
		this.iamPolicy = iamPolicy;
		putQueryParameter("IamPolicy", iamPolicy);
	}

	public Boolean getDisallowEmptyRefer() {
		return this.disallowEmptyRefer;
	}

	public void setDisallowEmptyRefer(Boolean disallowEmptyRefer) {
		this.disallowEmptyRefer = disallowEmptyRefer;
		putQueryParameter("DisallowEmptyRefer", String.valueOf(disallowEmptyRefer));
	}

	public Boolean getEnableDualCluster() {
		return this.enableDualCluster;
	}

	public void setEnableDualCluster(Boolean enableDualCluster) {
		this.enableDualCluster = enableDualCluster;
		putQueryParameter("EnableDualCluster", String.valueOf(enableDualCluster));
	}

	public String getErrorFile() {
		return this.errorFile;
	}

	public void setErrorFile(String errorFile) {
		this.errorFile = errorFile;
		putQueryParameter("ErrorFile", errorFile);
	}

	public String getIndexFile() {
		return this.indexFile;
	}

	public void setIndexFile(String indexFile) {
		this.indexFile = indexFile;
		putQueryParameter("IndexFile", indexFile);
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
		putQueryParameter("Location", location);
	}

	public String getLogBucket() {
		return this.logBucket;
	}

	public void setLogBucket(String logBucket) {
		this.logBucket = logBucket;
		putQueryParameter("LogBucket", logBucket);
	}

	public String getLogPrefix() {
		return this.logPrefix;
	}

	public void setLogPrefix(String logPrefix) {
		this.logPrefix = logPrefix;
		putQueryParameter("LogPrefix", logPrefix);
	}

	public String getWhiteReferList() {
		return this.whiteReferList;
	}

	public void setWhiteReferList(String whiteReferList) {
		this.whiteReferList = whiteReferList;
		putQueryParameter("WhiteReferList", whiteReferList);
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		putQueryParameter("OwnerAccount", ownerAccount);
	}

	@Override
	public Class<PutBucketPolicyResponse> getResponseClass() {
		return PutBucketPolicyResponse.class;
	}

}
