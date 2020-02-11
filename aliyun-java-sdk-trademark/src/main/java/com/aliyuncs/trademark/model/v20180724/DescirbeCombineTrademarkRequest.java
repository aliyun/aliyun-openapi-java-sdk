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
public class DescirbeCombineTrademarkRequest extends RpcAcsRequest<DescirbeCombineTrademarkResponse> {
	   

	private String ownerName;

	private String classification;

	private String registrationNumber;

	private Boolean accurateMatch;

	private Integer pageNumber;

	private String products;

	private String similarGroups;

	private String name;

	private Integer pageSize;
	public DescirbeCombineTrademarkRequest() {
		super("Trademark", "2018-07-24", "DescirbeCombineTrademark");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOwnerName() {
		return this.ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
		if(ownerName != null){
			putQueryParameter("OwnerName", ownerName);
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

	public String getRegistrationNumber() {
		return this.registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
		if(registrationNumber != null){
			putQueryParameter("RegistrationNumber", registrationNumber);
		}
	}

	public Boolean getAccurateMatch() {
		return this.accurateMatch;
	}

	public void setAccurateMatch(Boolean accurateMatch) {
		this.accurateMatch = accurateMatch;
		if(accurateMatch != null){
			putQueryParameter("AccurateMatch", accurateMatch.toString());
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

	public String getProducts() {
		return this.products;
	}

	public void setProducts(String products) {
		this.products = products;
		if(products != null){
			putQueryParameter("Products", products);
		}
	}

	public String getSimilarGroups() {
		return this.similarGroups;
	}

	public void setSimilarGroups(String similarGroups) {
		this.similarGroups = similarGroups;
		if(similarGroups != null){
			putQueryParameter("SimilarGroups", similarGroups);
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	@Override
	public Class<DescirbeCombineTrademarkResponse> getResponseClass() {
		return DescirbeCombineTrademarkResponse.class;
	}

}
