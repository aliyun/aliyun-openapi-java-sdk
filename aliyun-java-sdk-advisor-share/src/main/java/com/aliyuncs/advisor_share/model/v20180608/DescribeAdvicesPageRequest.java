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

package com.aliyuncs.advisor_share.model.v20180608;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeAdvicesPageRequest extends RpcAcsRequest<DescribeAdvicesPageResponse> {
	   

	private Long adviceId;

	private String excludeAdviceId;

	private String filterValue;

	private String language;

	private String filterType;

	private Integer pageNumber;

	private Integer pageSize;

	private String checkId;

	private String resourceId;

	private String product;

	private Long associateUid;

	private Long clientUid;

	private String token;

	private String region;
	public DescribeAdvicesPageRequest() {
		super("Advisor-Share", "2018-06-08", "DescribeAdvicesPage", "advisor");
		setMethod(MethodType.POST);
	}

	public Long getAdviceId() {
		return this.adviceId;
	}

	public void setAdviceId(Long adviceId) {
		this.adviceId = adviceId;
		if(adviceId != null){
			putQueryParameter("AdviceId", adviceId.toString());
		}
	}

	public String getExcludeAdviceId() {
		return this.excludeAdviceId;
	}

	public void setExcludeAdviceId(String excludeAdviceId) {
		this.excludeAdviceId = excludeAdviceId;
		if(excludeAdviceId != null){
			putQueryParameter("ExcludeAdviceId", excludeAdviceId);
		}
	}

	public String getFilterValue() {
		return this.filterValue;
	}

	public void setFilterValue(String filterValue) {
		this.filterValue = filterValue;
		if(filterValue != null){
			putQueryParameter("FilterValue", filterValue);
		}
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
		if(language != null){
			putQueryParameter("Language", language);
		}
	}

	public String getFilterType() {
		return this.filterType;
	}

	public void setFilterType(String filterType) {
		this.filterType = filterType;
		if(filterType != null){
			putQueryParameter("FilterType", filterType);
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getCheckId() {
		return this.checkId;
	}

	public void setCheckId(String checkId) {
		this.checkId = checkId;
		if(checkId != null){
			putQueryParameter("CheckId", checkId);
		}
	}

	public String getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
		if(resourceId != null){
			putQueryParameter("ResourceId", resourceId);
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

	public Long getAssociateUid() {
		return this.associateUid;
	}

	public void setAssociateUid(Long associateUid) {
		this.associateUid = associateUid;
		if(associateUid != null){
			putQueryParameter("AssociateUid", associateUid.toString());
		}
	}

	public Long getClientUid() {
		return this.clientUid;
	}

	public void setClientUid(Long clientUid) {
		this.clientUid = clientUid;
		if(clientUid != null){
			putQueryParameter("ClientUid", clientUid.toString());
		}
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putQueryParameter("Token", token);
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
		}
	}

	@Override
	public Class<DescribeAdvicesPageResponse> getResponseClass() {
		return DescribeAdvicesPageResponse.class;
	}

}
