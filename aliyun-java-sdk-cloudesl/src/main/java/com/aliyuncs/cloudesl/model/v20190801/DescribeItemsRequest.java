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

package com.aliyuncs.cloudesl.model.v20190801;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudesl.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeItemsRequest extends RpcAcsRequest<DescribeItemsResponse> {
	   

	private String storeId;

	private Integer pageNumber;

	private Long itemId;

	private Integer pageSize;

	private String itemBarCode;

	private Boolean bePromotion;

	private String itemTitle;

	private String skuId;
	public DescribeItemsRequest() {
		super("cloudesl", "2019-08-01", "DescribeItems", "cloudesl");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getStoreId() {
		return this.storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
		if(storeId != null){
			putBodyParameter("StoreId", storeId);
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

	public Long getItemId() {
		return this.itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
		if(itemId != null){
			putBodyParameter("ItemId", itemId.toString());
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

	public String getItemBarCode() {
		return this.itemBarCode;
	}

	public void setItemBarCode(String itemBarCode) {
		this.itemBarCode = itemBarCode;
		if(itemBarCode != null){
			putBodyParameter("ItemBarCode", itemBarCode);
		}
	}

	public Boolean getBePromotion() {
		return this.bePromotion;
	}

	public void setBePromotion(Boolean bePromotion) {
		this.bePromotion = bePromotion;
		if(bePromotion != null){
			putBodyParameter("BePromotion", bePromotion.toString());
		}
	}

	public String getItemTitle() {
		return this.itemTitle;
	}

	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
		if(itemTitle != null){
			putBodyParameter("ItemTitle", itemTitle);
		}
	}

	public String getSkuId() {
		return this.skuId;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
		if(skuId != null){
			putBodyParameter("SkuId", skuId);
		}
	}

	@Override
	public Class<DescribeItemsResponse> getResponseClass() {
		return DescribeItemsResponse.class;
	}

}
