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

package com.aliyuncs.resellertrade.model.v20191227;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.resellertrade.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DiscardCouponListRequest extends RpcAcsRequest<DiscardCouponListResponse> {
	   

	private List<Long> couponLists;
	public DiscardCouponListRequest() {
		super("ResellerTrade", "2019-12-27", "DiscardCouponList");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Long> getCouponLists() {
		return this.couponLists;
	}

	public void setCouponLists(List<Long> couponLists) {
		this.couponLists = couponLists;	
		if (couponLists != null) {
			for (int i = 0; i < couponLists.size(); i++) {
				putBodyParameter("CouponList." + (i + 1) , couponLists.get(i));
			}
		}	
	}

	@Override
	public Class<DiscardCouponListResponse> getResponseClass() {
		return DiscardCouponListResponse.class;
	}

}
