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
public class DescribeAdvisorResourcesRequest extends RpcAcsRequest<DescribeAdvisorResourcesResponse> {
	   

	private String resourceId;

	private String product;

	private Long associateUid;

	private String language;

	private Integer pageNumber;

	private Integer pageSize;

	private String keyword;
	public DescribeAdvisorResourcesRequest() {
		super("Advisor-Share", "2018-06-08", "DescribeAdvisorResources", "advisor");
		setMethod(MethodType.POST);
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

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
		if(language != null){
			putQueryParameter("Language", language);
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

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
		if(keyword != null){
			putQueryParameter("Keyword", keyword);
		}
	}

	@Override
	public Class<DescribeAdvisorResourcesResponse> getResponseClass() {
		return DescribeAdvisorResourcesResponse.class;
	}

}
