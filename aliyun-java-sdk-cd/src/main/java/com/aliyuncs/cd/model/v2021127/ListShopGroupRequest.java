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

package com.aliyuncs.cd.model.v2021127;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListShopGroupRequest extends RoaAcsRequest<ListShopGroupResponse> {
	   

	private String country;

	private Integer pageNumber;

	private Integer pageSize;

	private String shopGroupId;

	private String shopGroupName;
	public ListShopGroupRequest() {
		super("cd", "2021-12-7", "ListShopGroup");
		setUriPattern("/ListShopGroup");
		setMethod(MethodType.POST);
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
		if(country != null){
			putBodyParameter("Country", country);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getShopGroupId() {
		return this.shopGroupId;
	}

	public void setShopGroupId(String shopGroupId) {
		this.shopGroupId = shopGroupId;
		if(shopGroupId != null){
			putBodyParameter("ShopGroupId", shopGroupId);
		}
	}

	public String getShopGroupName() {
		return this.shopGroupName;
	}

	public void setShopGroupName(String shopGroupName) {
		this.shopGroupName = shopGroupName;
		if(shopGroupName != null){
			putBodyParameter("ShopGroupName", shopGroupName);
		}
	}

	@Override
	public Class<ListShopGroupResponse> getResponseClass() {
		return ListShopGroupResponse.class;
	}

}
