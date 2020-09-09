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

package com.aliyuncs.retailadvqa_public.model.v20200515;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ConsumeMediaResourcePackageRequest extends RpcAcsRequest<ConsumeMediaResourcePackageResponse> {
	   

	private String consumeType;

	private String productId;

	private String consumeInfos;

	private Long consumeTime;
	public ConsumeMediaResourcePackageRequest() {
		super("retailadvqa-public", "2020-05-15", "ConsumeMediaResourcePackage");
		setMethod(MethodType.POST);
	}

	public String getConsumeType() {
		return this.consumeType;
	}

	public void setConsumeType(String consumeType) {
		this.consumeType = consumeType;
		if(consumeType != null){
			putQueryParameter("ConsumeType", consumeType);
		}
	}

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
		if(productId != null){
			putQueryParameter("ProductId", productId);
		}
	}

	public String getConsumeInfos() {
		return this.consumeInfos;
	}

	public void setConsumeInfos(String consumeInfos) {
		this.consumeInfos = consumeInfos;
		if(consumeInfos != null){
			putQueryParameter("ConsumeInfos", consumeInfos);
		}
	}

	public Long getConsumeTime() {
		return this.consumeTime;
	}

	public void setConsumeTime(Long consumeTime) {
		this.consumeTime = consumeTime;
		if(consumeTime != null){
			putQueryParameter("ConsumeTime", consumeTime.toString());
		}
	}

	@Override
	public Class<ConsumeMediaResourcePackageResponse> getResponseClass() {
		return ConsumeMediaResourcePackageResponse.class;
	}

}
