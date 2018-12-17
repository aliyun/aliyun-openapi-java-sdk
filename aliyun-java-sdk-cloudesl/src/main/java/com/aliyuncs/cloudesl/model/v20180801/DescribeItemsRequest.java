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

package com.aliyuncs.cloudesl.model.v20180801;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeItemsRequest extends RpcAcsRequest<DescribeItemsResponse> {
	
	public DescribeItemsRequest() {
		super("cloudesl", "2018-08-01", "DescribeItems");
	}

	private Long itemId;

	private Boolean bePromotion;

	private String itemTitle;

	private Integer pageSize;

	private String storeId;

	private String skuId;

	private Integer pageNumber;

	private String itemBarCode;

	public Long getItemId() {
		return this.itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
		if(itemId != null){
			putQueryParameter("ItemId", itemId.toString());
		}
	}

	public Boolean getBePromotion() {
		return this.bePromotion;
	}

	public void setBePromotion(Boolean bePromotion) {
		this.bePromotion = bePromotion;
		if(bePromotion != null){
			putQueryParameter("BePromotion", bePromotion.toString());
		}
	}

	public String getItemTitle() {
		return this.itemTitle;
	}

	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
		if(itemTitle != null){
			putQueryParameter("ItemTitle", itemTitle);
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

	public String getStoreId() {
		return this.storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
		if(storeId != null){
			putQueryParameter("StoreId", storeId);
		}
	}

	public String getSkuId() {
		return this.skuId;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
		if(skuId != null){
			putQueryParameter("SkuId", skuId);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getItemBarCode() {
		return this.itemBarCode;
	}

	public void setItemBarCode(String itemBarCode) {
		this.itemBarCode = itemBarCode;
		if(itemBarCode != null){
			putQueryParameter("ItemBarCode", itemBarCode);
		}
	}

	@Override
	public Class<DescribeItemsResponse> getResponseClass() {
		return DescribeItemsResponse.class;
	}

}
