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

package com.aliyuncs.trademark.model.v20180724;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.trademark.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SearchTmOnsalesRequest extends RpcAcsRequest<SearchTmOnsalesResponse> {
	   

	private String tmName;

	private String productCode;

	private String topSearch;

	private Integer regLeft;

	private String classification;

	private Integer pageNum;

	private Long orderPriceLeft;

	private Boolean queryAll;

	private String sortName;

	private Long orderPriceRight;

	private Integer pageSize;

	private String sortOrder;

	private String tag;

	private String keyword;

	private String registerNumber;

	private Integer regRight;
	public SearchTmOnsalesRequest() {
		super("Trademark", "2018-07-24", "SearchTmOnsales");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTmName() {
		return this.tmName;
	}

	public void setTmName(String tmName) {
		this.tmName = tmName;
		if(tmName != null){
			putQueryParameter("TmName", tmName);
		}
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
		if(productCode != null){
			putQueryParameter("ProductCode", productCode);
		}
	}

	public String getTopSearch() {
		return this.topSearch;
	}

	public void setTopSearch(String topSearch) {
		this.topSearch = topSearch;
		if(topSearch != null){
			putQueryParameter("TopSearch", topSearch);
		}
	}

	public Integer getRegLeft() {
		return this.regLeft;
	}

	public void setRegLeft(Integer regLeft) {
		this.regLeft = regLeft;
		if(regLeft != null){
			putQueryParameter("RegLeft", regLeft.toString());
		}
	}

	public String getClassification() {
		return this.classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
		if(classification != null){
			putQueryParameter("Classification", classification);
		}
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
		if(pageNum != null){
			putQueryParameter("PageNum", pageNum.toString());
		}
	}

	public Long getOrderPriceLeft() {
		return this.orderPriceLeft;
	}

	public void setOrderPriceLeft(Long orderPriceLeft) {
		this.orderPriceLeft = orderPriceLeft;
		if(orderPriceLeft != null){
			putQueryParameter("OrderPriceLeft", orderPriceLeft.toString());
		}
	}

	public Boolean getQueryAll() {
		return this.queryAll;
	}

	public void setQueryAll(Boolean queryAll) {
		this.queryAll = queryAll;
		if(queryAll != null){
			putQueryParameter("QueryAll", queryAll.toString());
		}
	}

	public String getSortName() {
		return this.sortName;
	}

	public void setSortName(String sortName) {
		this.sortName = sortName;
		if(sortName != null){
			putQueryParameter("SortName", sortName);
		}
	}

	public Long getOrderPriceRight() {
		return this.orderPriceRight;
	}

	public void setOrderPriceRight(Long orderPriceRight) {
		this.orderPriceRight = orderPriceRight;
		if(orderPriceRight != null){
			putQueryParameter("OrderPriceRight", orderPriceRight.toString());
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

	public String getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
		if(sortOrder != null){
			putQueryParameter("SortOrder", sortOrder);
		}
	}

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
		if(tag != null){
			putQueryParameter("Tag", tag);
		}
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
		if(keyword != null){
			putQueryParameter("Keyword", keyword);
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

	public Integer getRegRight() {
		return this.regRight;
	}

	public void setRegRight(Integer regRight) {
		this.regRight = regRight;
		if(regRight != null){
			putQueryParameter("RegRight", regRight.toString());
		}
	}

	@Override
	public Class<SearchTmOnsalesResponse> getResponseClass() {
		return SearchTmOnsalesResponse.class;
	}

}
