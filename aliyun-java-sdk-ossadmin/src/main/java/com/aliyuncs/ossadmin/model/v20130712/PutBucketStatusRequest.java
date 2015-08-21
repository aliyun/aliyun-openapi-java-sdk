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
public class PutBucketStatusRequest extends RpcAcsRequest<PutBucketStatusResponse> {
	
	public PutBucketStatusRequest() {
		super("OssAdmin", "2013-07-12", "PutBucketStatus");
	}

	private String uid;

	private String bid;

	private String bucket;

	private String status;

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

	public String getBucket() {
		return this.bucket;
	}

	public void setBucket(String bucket) {
		this.bucket = bucket;
		putQueryParameter("Bucket", bucket);
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		putQueryParameter("Status", status);
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		putQueryParameter("OwnerAccount", ownerAccount);
	}

	@Override
	public Class<PutBucketStatusResponse> getResponseClass() {
		return PutBucketStatusResponse.class;
	}

}
