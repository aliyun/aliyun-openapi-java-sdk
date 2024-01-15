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

package com.aliyuncs.trademark.model.v20190902;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.trademark.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SearchItemsRequest extends RpcAcsRequest<SearchItemsResponse> {
	   

	private String keywords;

	private Integer sortType;

	private String umId;

	private String priceLeft;

	private String products;

	private String excludedUids;

	private Integer pageSize;

	private Integer pageIndex;

	private String excludedTags;

	private String registerNumber;

	private String priceRight;

	private String intCls;

	private String sort;

	private Boolean feedsType;

	private String tags;

	private String trademarkNameType;

	private Integer trademarkNameLength;

	private Boolean mock;
	public SearchItemsRequest() {
		super("Trademark", "2019-09-02", "SearchItems");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getKeywords() {
		return this.keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
		if(keywords != null){
			putQueryParameter("Keywords", keywords);
		}
	}

	public Integer getSortType() {
		return this.sortType;
	}

	public void setSortType(Integer sortType) {
		this.sortType = sortType;
		if(sortType != null){
			putQueryParameter("SortType", sortType.toString());
		}
	}

	public String getUmId() {
		return this.umId;
	}

	public void setUmId(String umId) {
		this.umId = umId;
		if(umId != null){
			putQueryParameter("UmId", umId);
		}
	}

	public String getPriceLeft() {
		return this.priceLeft;
	}

	public void setPriceLeft(String priceLeft) {
		this.priceLeft = priceLeft;
		if(priceLeft != null){
			putQueryParameter("PriceLeft", priceLeft);
		}
	}

	public String getProducts() {
		return this.products;
	}

	public void setProducts(String products) {
		this.products = products;
		if(products != null){
			putQueryParameter("Products", products);
		}
	}

	public String getExcludedUids() {
		return this.excludedUids;
	}

	public void setExcludedUids(String excludedUids) {
		this.excludedUids = excludedUids;
		if(excludedUids != null){
			putQueryParameter("ExcludedUids", excludedUids);
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

	public Integer getPageIndex() {
		return this.pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
		if(pageIndex != null){
			putQueryParameter("PageIndex", pageIndex.toString());
		}
	}

	public String getExcludedTags() {
		return this.excludedTags;
	}

	public void setExcludedTags(String excludedTags) {
		this.excludedTags = excludedTags;
		if(excludedTags != null){
			putQueryParameter("ExcludedTags", excludedTags);
		}
	}

	public String getRegisterNumber() {
		return this.registerNumber;
	}

	public void setRegisterNumber(String registerNumber) {
		this.registerNumber = registerNumber;
		if(registerNumber != null){
			putQueryParameter("RegisterNumber", registerNumber);
		}
	}

	public String getPriceRight() {
		return this.priceRight;
	}

	public void setPriceRight(String priceRight) {
		this.priceRight = priceRight;
		if(priceRight != null){
			putQueryParameter("PriceRight", priceRight);
		}
	}

	public String getIntCls() {
		return this.intCls;
	}

	public void setIntCls(String intCls) {
		this.intCls = intCls;
		if(intCls != null){
			putQueryParameter("IntCls", intCls);
		}
	}

	public String getSort() {
		return this.sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
		if(sort != null){
			putQueryParameter("Sort", sort);
		}
	}

	public Boolean getFeedsType() {
		return this.feedsType;
	}

	public void setFeedsType(Boolean feedsType) {
		this.feedsType = feedsType;
		if(feedsType != null){
			putQueryParameter("FeedsType", feedsType.toString());
		}
	}

	public String getTags() {
		return this.tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
		if(tags != null){
			putQueryParameter("Tags", tags);
		}
	}

	public String getTrademarkNameType() {
		return this.trademarkNameType;
	}

	public void setTrademarkNameType(String trademarkNameType) {
		this.trademarkNameType = trademarkNameType;
		if(trademarkNameType != null){
			putQueryParameter("TrademarkNameType", trademarkNameType);
		}
	}

	public Integer getTrademarkNameLength() {
		return this.trademarkNameLength;
	}

	public void setTrademarkNameLength(Integer trademarkNameLength) {
		this.trademarkNameLength = trademarkNameLength;
		if(trademarkNameLength != null){
			putQueryParameter("TrademarkNameLength", trademarkNameLength.toString());
		}
	}

	public Boolean getMock() {
		return this.mock;
	}

	public void setMock(Boolean mock) {
		this.mock = mock;
		if(mock != null){
			putQueryParameter("Mock", mock.toString());
		}
	}

	@Override
	public Class<SearchItemsResponse> getResponseClass() {
		return SearchItemsResponse.class;
	}

}
