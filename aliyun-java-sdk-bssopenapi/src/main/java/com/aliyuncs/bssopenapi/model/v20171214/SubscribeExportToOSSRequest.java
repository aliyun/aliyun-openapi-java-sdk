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
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class SubscribeExportToOSSRequest extends RpcAcsRequest<SubscribeExportToOSSResponse> {
	
	public SubscribeExportToOSSRequest() {
		super("BssOpenApi", "2017-12-14", "SubscribeExportToOSS");
	}

	private Long bucketOwnerId;

	private List<String> subscribeTypes;

	private String subscribeBucket;

	public Long getBucketOwnerId() {
		return this.bucketOwnerId;
	}

	public void setBucketOwnerId(Long bucketOwnerId) {
		this.bucketOwnerId = bucketOwnerId;
		if(bucketOwnerId != null){
			putQueryParameter("BucketOwnerId", bucketOwnerId.toString());
		}
	}

	public List<String> getSubscribeTypes() {
		return this.subscribeTypes;
	}

	public void setSubscribeTypes(List<String> subscribeTypes) {
		this.subscribeTypes = subscribeTypes;	
		if (subscribeTypes != null) {
			for (int i = 0; i < subscribeTypes.size(); i++) {
				putQueryParameter("SubscribeType." + (i + 1) , subscribeTypes.get(i));
			}
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

	@Override
	public Class<SubscribeExportToOSSResponse> getResponseClass() {
		return SubscribeExportToOSSResponse.class;
	}

}
