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
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListShopRequest extends RoaAcsRequest<ListShopResponse> {
	   

	private String country;

	private Integer pageNumber;

	private Integer pageSize;

	private String shopId;

	@SerializedName("shopGroupIds")
	private List<String> shopGroupIds;

	private String shopName;
	public ListShopRequest() {
		super("cd", "2021-12-7", "ListShop");
		setUriPattern("/ListShop");
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

	public String getShopId() {
		return this.shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
		if(shopId != null){
			putBodyParameter("ShopId", shopId);
		}
	}

	public List<String> getShopGroupIds() {
		return this.shopGroupIds;
	}

	public void setShopGroupIds(List<String> shopGroupIds) {
		this.shopGroupIds = shopGroupIds;	
		if (shopGroupIds != null) {
			putBodyParameter("ShopGroupIds" , new Gson().toJson(shopGroupIds));
		}	
	}

	public String getShopName() {
		return this.shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
		if(shopName != null){
			putBodyParameter("ShopName", shopName);
		}
	}

	@Override
	public Class<ListShopResponse> getResponseClass() {
		return ListShopResponse.class;
	}

}
