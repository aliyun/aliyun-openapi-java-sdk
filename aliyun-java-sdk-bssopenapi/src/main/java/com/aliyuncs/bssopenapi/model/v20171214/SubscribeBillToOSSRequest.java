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

package com.aliyuncs.bssopenapi.model.v20171214;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.bssopenapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SubscribeBillToOSSRequest extends RpcAcsRequest<SubscribeBillToOSSResponse> {
	   

	private Long bucketOwnerId;

	private String subscribeType;

	private String subscribeBucket;

	private String beginBillingCycle;

	private String multAccountRelSubscribe;
	public SubscribeBillToOSSRequest() {
		super("BssOpenApi", "2017-12-14", "SubscribeBillToOSS");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getBucketOwnerId() {
		return this.bucketOwnerId;
	}

	public void setBucketOwnerId(Long bucketOwnerId) {
		this.bucketOwnerId = bucketOwnerId;
		if(bucketOwnerId != null){
			putQueryParameter("BucketOwnerId", bucketOwnerId.toString());
		}
	}

	public String getSubscribeType() {
		return this.subscribeType;
	}

	public void setSubscribeType(String subscribeType) {
		this.subscribeType = subscribeType;
		if(subscribeType != null){
			putQueryParameter("SubscribeType", subscribeType);
		}
	}

	public String getSubscribeBucket() {
		return this.subscribeBucket;
	}

	public void setSubscribeBucket(String subscribeBucket) {
		this.subscribeBucket = subscribeBucket;
		if(subscribeBucket != null){
			putQueryParameter("SubscribeBucket", subscribeBucket);
		}
	}

	public String getBeginBillingCycle() {
		return this.beginBillingCycle;
	}

	public void setBeginBillingCycle(String beginBillingCycle) {
		this.beginBillingCycle = beginBillingCycle;
		if(beginBillingCycle != null){
			putQueryParameter("BeginBillingCycle", beginBillingCycle);
		}
	}

	public String getMultAccountRelSubscribe() {
		return this.multAccountRelSubscribe;
	}

	public void setMultAccountRelSubscribe(String multAccountRelSubscribe) {
		this.multAccountRelSubscribe = multAccountRelSubscribe;
		if(multAccountRelSubscribe != null){
			putQueryParameter("MultAccountRelSubscribe", multAccountRelSubscribe);
		}
	}

	@Override
	public Class<SubscribeBillToOSSResponse> getResponseClass() {
		return SubscribeBillToOSSResponse.class;
	}

}
