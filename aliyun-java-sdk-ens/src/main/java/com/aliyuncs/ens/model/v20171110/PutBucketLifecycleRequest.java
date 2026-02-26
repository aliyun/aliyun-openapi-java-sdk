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
public class PutBucketLifecycleRequest extends RpcAcsRequest<PutBucketLifecycleResponse> {
	   

	private String prefix;

	private String allowSameActionOverlap;

	private Long expirationDays;

	private String ruleId;

	private String status;

	private String bucketName;

	private String createdBeforeDate;
	public PutBucketLifecycleRequest() {
		super("Ens", "2017-11-10", "PutBucketLifecycle", "ens");
		setMethod(MethodType.POST);
	}

	public String getPrefix() {
		return this.prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
		if(prefix != null){
			putQueryParameter("Prefix", prefix);
		}
	}

	public String getAllowSameActionOverlap() {
		return this.allowSameActionOverlap;
	}

	public void setAllowSameActionOverlap(String allowSameActionOverlap) {
		this.allowSameActionOverlap = allowSameActionOverlap;
		if(allowSameActionOverlap != null){
			putQueryParameter("AllowSameActionOverlap", allowSameActionOverlap);
		}
	}

	public Long getExpirationDays() {
		return this.expirationDays;
	}

	public void setExpirationDays(Long expirationDays) {
		this.expirationDays = expirationDays;
		if(expirationDays != null){
			putQueryParameter("ExpirationDays", expirationDays.toString());
		}
	}

	public String getRuleId() {
		return this.ruleId;
	}

	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
		if(ruleId != null){
			putQueryParameter("RuleId", ruleId);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
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

	public String getCreatedBeforeDate() {
		return this.createdBeforeDate;
	}

	public void setCreatedBeforeDate(String createdBeforeDate) {
		this.createdBeforeDate = createdBeforeDate;
		if(createdBeforeDate != null){
			putQueryParameter("CreatedBeforeDate", createdBeforeDate);
		}
	}

	@Override
	public Class<PutBucketLifecycleResponse> getResponseClass() {
		return PutBucketLifecycleResponse.class;
	}

}
