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
public class PutBucketLimitRequest extends RpcAcsRequest<PutBucketLimitResponse> {
	
	public PutBucketLimitRequest() {
		super("OssAdmin", "2013-07-12", "PutBucketLimit", "ossadmin");
	}

	private String uid;

	private String ownerAccount;

	private String bid;

	private Integer bucketLimit;

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
		if(uid != null){
			putQueryParameter("uid", uid);
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

	public String getBid() {
		return this.bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
		if(bid != null){
			putQueryParameter("bid", bid);
		}
	}

	public Integer getBucketLimit() {
		return this.bucketLimit;
	}

	public void setBucketLimit(Integer bucketLimit) {
		this.bucketLimit = bucketLimit;
		if(bucketLimit != null){
			putQueryParameter("BucketLimit", bucketLimit.toString());
		}
	}

	@Override
	public Class<PutBucketLimitResponse> getResponseClass() {
		return PutBucketLimitResponse.class;
	}

}
