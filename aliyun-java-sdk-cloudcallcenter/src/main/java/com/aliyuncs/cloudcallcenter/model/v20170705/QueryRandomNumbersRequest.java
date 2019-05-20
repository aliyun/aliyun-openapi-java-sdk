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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class QueryRandomNumbersRequest extends RpcAcsRequest<QueryRandomNumbersResponse> {
	
	public QueryRandomNumbersRequest() {
		super("CloudCallCenter", "2017-07-05", "QueryRandomNumbers", "CloudCallCenter", "innerAPI");
	}

	private Long specId;

	private Integer remainCount;

	private String province;

	private String city;

	private Long orderId;

	private Integer monthlyPrice;

	public Long getSpecId() {
		return this.specId;
	}

	public void setSpecId(Long specId) {
		this.specId = specId;
		if(specId != null){
			putQueryParameter("SpecId", specId.toString());
		}
	}

	public Integer getRemainCount() {
		return this.remainCount;
	}

	public void setRemainCount(Integer remainCount) {
		this.remainCount = remainCount;
		if(remainCount != null){
			putQueryParameter("RemainCount", remainCount.toString());
		}
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
		if(province != null){
			putQueryParameter("Province", province);
		}
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
		if(city != null){
			putQueryParameter("City", city);
		}
	}

	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
		if(orderId != null){
			putQueryParameter("OrderId", orderId.toString());
		}
	}

	public Integer getMonthlyPrice() {
		return this.monthlyPrice;
	}

	public void setMonthlyPrice(Integer monthlyPrice) {
		this.monthlyPrice = monthlyPrice;
		if(monthlyPrice != null){
			putQueryParameter("MonthlyPrice", monthlyPrice.toString());
		}
	}

	@Override
	public Class<QueryRandomNumbersResponse> getResponseClass() {
		return QueryRandomNumbersResponse.class;
	}

}
