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

package com.aliyuncs.bss.model.v20140714;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SubscriptionCreateOrderApiRequest extends RpcAcsRequest<SubscriptionCreateOrderApiResponse> {
	
	public SubscriptionCreateOrderApiRequest() {
		super("Bss", "2014-07-14", "SubscriptionCreateOrderApi", "bss");
	}

	private String productCode;

	private String ownerId;

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
		if(productCode != null){
			putQueryParameter("productCode", productCode);
		}
	}

	public String getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("ownerId", ownerId);
		}
	}

	@Override
	public Class<SubscriptionCreateOrderApiResponse> getResponseClass() {
		return SubscriptionCreateOrderApiResponse.class;
	}

}
