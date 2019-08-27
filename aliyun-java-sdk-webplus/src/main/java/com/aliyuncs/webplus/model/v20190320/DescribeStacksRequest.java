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

package com.aliyuncs.webplus.model.v20190320;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.webplus.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeStacksRequest extends RoaAcsRequest<DescribeStacksResponse> {
	
	public DescribeStacksRequest() {
		super("WebPlus", "2019-03-20", "DescribeStacks", "webx");
		setUriPattern("/pop/v1/wam/stack");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Integer pageSize;

	private String categoryName;

	private Boolean recommendedOnly;

	private Integer pageNumber;

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
		if(categoryName != null){
			putQueryParameter("CategoryName", categoryName);
		}
	}

	public Boolean getRecommendedOnly() {
		return this.recommendedOnly;
	}

	public void setRecommendedOnly(Boolean recommendedOnly) {
		this.recommendedOnly = recommendedOnly;
		if(recommendedOnly != null){
			putQueryParameter("RecommendedOnly", recommendedOnly.toString());
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

	@Override
	public Class<DescribeStacksResponse> getResponseClass() {
		return DescribeStacksResponse.class;
	}

}
