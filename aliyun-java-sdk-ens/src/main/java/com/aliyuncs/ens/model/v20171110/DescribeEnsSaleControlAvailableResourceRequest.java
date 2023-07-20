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
public class DescribeEnsSaleControlAvailableResourceRequest extends RpcAcsRequest<DescribeEnsSaleControlAvailableResourceResponse> {
	   

	private String customAccount;

	private String commodityCode;

	private String orderType;
	public DescribeEnsSaleControlAvailableResourceRequest() {
		super("Ens", "2017-11-10", "DescribeEnsSaleControlAvailableResource", "ens");
		setMethod(MethodType.POST);
	}

	public String getCustomAccount() {
		return this.customAccount;
	}

	public void setCustomAccount(String customAccount) {
		this.customAccount = customAccount;
		if(customAccount != null){
			putQueryParameter("CustomAccount", customAccount);
		}
	}

	public String getCommodityCode() {
		return this.commodityCode;
	}

	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
		if(commodityCode != null){
			putQueryParameter("CommodityCode", commodityCode);
		}
	}

	public String getOrderType() {
		return this.orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
		if(orderType != null){
			putQueryParameter("OrderType", orderType);
		}
	}

	@Override
	public Class<DescribeEnsSaleControlAvailableResourceResponse> getResponseClass() {
		return DescribeEnsSaleControlAvailableResourceResponse.class;
	}

}
