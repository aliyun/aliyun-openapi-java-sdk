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
import java.util.List;
import com.google.gson.Gson;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.trademark.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SearchSimilarityListRequest extends RpcAcsRequest<SearchSimilarityListResponse> {
	   

	private String umid;

	private Integer pageNumber;

	private List<Object> similarGroups;

	private Integer pageSize;

	private String orderId;

	private String successSearchType;

	private String uri;

	private List<Object> classifications;

	private String name;

	private Integer status;
	public SearchSimilarityListRequest() {
		super("Trademark", "2019-09-02", "SearchSimilarityList");
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public List<Object> getSimilarGroups() {
		return this.similarGroups;
	}

	public void setSimilarGroups(List<Object> similarGroups) {
		this.similarGroups = similarGroups;
		if(similarGroups != null){
			putQueryParameter("SimilarGroups", new Gson().toJson(similarGroups));
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

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
		if(orderId != null){
			putQueryParameter("OrderId", orderId);
		}
	}

	public String getSuccessSearchType() {
		return this.successSearchType;
	}

	public void setSuccessSearchType(String successSearchType) {
		this.successSearchType = successSearchType;
		if(successSearchType != null){
			putQueryParameter("SuccessSearchType", successSearchType);
		}
	}

	public String getUri() {
		return this.uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
		if(uri != null){
			putQueryParameter("Uri", uri);
		}
	}

	public List<Object> getClassifications() {
		return this.classifications;
	}

	public void setClassifications(List<Object> classifications) {
		this.classifications = classifications;
		if(classifications != null){
			putQueryParameter("Classifications", new Gson().toJson(classifications));
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status.toString());
		}
	}

	@Override
	public Class<SearchSimilarityListResponse> getResponseClass() {
		return SearchSimilarityListResponse.class;
	}

}
