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

package com.aliyuncs.brinekingdom.model.v20190627;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QueryCityRequest extends RpcAcsRequest<QueryCityResponse> {
	   

	private String cityEnName;

	private String cityCnName;

	private Integer offset;

	private String cityCode;

	private Integer pageSize;

	private Integer currentPage;

	private String order;
	public QueryCityRequest() {
		super("brinekingdom", "2019-06-27", "QueryCity");
		setMethod(MethodType.POST);
	}

	public String getCityEnName() {
		return this.cityEnName;
	}

	public void setCityEnName(String cityEnName) {
		this.cityEnName = cityEnName;
		if(cityEnName != null){
			putQueryParameter("CityEnName", cityEnName);
		}
	}

	public String getCityCnName() {
		return this.cityCnName;
	}

	public void setCityCnName(String cityCnName) {
		this.cityCnName = cityCnName;
		if(cityCnName != null){
			putQueryParameter("CityCnName", cityCnName);
		}
	}

	public Integer getOffset() {
		return this.offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
		if(offset != null){
			putQueryParameter("Offset", offset.toString());
		}
	}

	public String getCityCode() {
		return this.cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
		if(cityCode != null){
			putQueryParameter("CityCode", cityCode);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	public String getOrder() {
		return this.order;
	}

	public void setOrder(String order) {
		this.order = order;
		if(order != null){
			putQueryParameter("Order", order);
		}
	}

	@Override
	public Class<QueryCityResponse> getResponseClass() {
		return QueryCityResponse.class;
	}

}
