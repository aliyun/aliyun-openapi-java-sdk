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

package com.aliyuncs.cms.model.v20190101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeMetricRuleBlackListRequest extends RpcAcsRequest<DescribeMetricRuleBlackListResponse> {
	   

	private Integer pageNumber;

	private String namespace;

	private Integer pageSize;

	private List<String> idss;

	private String category;

	private Integer order;
	public DescribeMetricRuleBlackListRequest() {
		super("Cms", "2019-01-01", "DescribeMetricRuleBlackList", "cms");
		setMethod(MethodType.POST);
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

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putQueryParameter("Namespace", namespace);
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

	public List<String> getIdss() {
		return this.idss;
	}

	public void setIdss(List<String> idss) {
		this.idss = idss;	
		if (idss != null) {
			for (int i = 0; i < idss.size(); i++) {
				putQueryParameter("Ids." + (i + 1) , idss.get(i));
			}
		}	
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
		if(category != null){
			putQueryParameter("Category", category);
		}
	}

	public Integer getOrder() {
		return this.order;
	}

	public void setOrder(Integer order) {
		this.order = order;
		if(order != null){
			putQueryParameter("Order", order.toString());
		}
	}

	@Override
	public Class<DescribeMetricRuleBlackListResponse> getResponseClass() {
		return DescribeMetricRuleBlackListResponse.class;
	}

}
