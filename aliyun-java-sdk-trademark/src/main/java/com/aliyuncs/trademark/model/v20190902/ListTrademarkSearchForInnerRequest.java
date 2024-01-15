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
public class ListTrademarkSearchForInnerRequest extends RpcAcsRequest<ListTrademarkSearchForInnerResponse> {
	   

	private String umid;

	private Boolean ifPrecision;

	private String userId;

	private Integer pageNumber;

	private String searchPreference;

	private String searchType;

	private Integer pageSize;

	private String keyword;

	private String product;

	private String applyBeginTime;

	private String classification;

	private String applyEndTime;

	private String status;
	public ListTrademarkSearchForInnerRequest() {
		super("Trademark", "2019-09-02", "ListTrademarkSearchForInner");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getUmid() {
		return this.umid;
	}

	public void setUmid(String umid) {
		this.umid = umid;
		if(umid != null){
			putQueryParameter("Umid", umid);
		}
	}

	public Boolean getIfPrecision() {
		return this.ifPrecision;
	}

	public void setIfPrecision(Boolean ifPrecision) {
		this.ifPrecision = ifPrecision;
		if(ifPrecision != null){
			putQueryParameter("IfPrecision", ifPrecision.toString());
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
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

	public String getSearchPreference() {
		return this.searchPreference;
	}

	public void setSearchPreference(String searchPreference) {
		this.searchPreference = searchPreference;
		if(searchPreference != null){
			putQueryParameter("SearchPreference", searchPreference);
		}
	}

	public String getSearchType() {
		return this.searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
		if(searchType != null){
			putQueryParameter("SearchType", searchType);
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

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
		if(keyword != null){
			putQueryParameter("Keyword", keyword);
		}
	}

	public String getProduct() {
		return this.product;
	}

	public void setProduct(String product) {
		this.product = product;
		if(product != null){
			putQueryParameter("Product", product);
		}
	}

	public String getApplyBeginTime() {
		return this.applyBeginTime;
	}

	public void setApplyBeginTime(String applyBeginTime) {
		this.applyBeginTime = applyBeginTime;
		if(applyBeginTime != null){
			putQueryParameter("ApplyBeginTime", applyBeginTime);
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

	public String getApplyEndTime() {
		return this.applyEndTime;
	}

	public void setApplyEndTime(String applyEndTime) {
		this.applyEndTime = applyEndTime;
		if(applyEndTime != null){
			putQueryParameter("ApplyEndTime", applyEndTime);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	@Override
	public Class<ListTrademarkSearchForInnerResponse> getResponseClass() {
		return ListTrademarkSearchForInnerResponse.class;
	}

}
