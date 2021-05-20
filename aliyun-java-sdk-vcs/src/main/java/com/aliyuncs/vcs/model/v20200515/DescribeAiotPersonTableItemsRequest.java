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

package com.aliyuncs.vcs.model.v20200515;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vcs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeAiotPersonTableItemsRequest extends RpcAcsRequest<DescribeAiotPersonTableItemsResponse> {
	   

	private String personTableId;

	private Long pageNum;

	private String personTableItemId;

	private Long pageSize;

	private String id;
	public DescribeAiotPersonTableItemsRequest() {
		super("Vcs", "2020-05-15", "DescribeAiotPersonTableItems");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPersonTableId() {
		return this.personTableId;
	}

	public void setPersonTableId(String personTableId) {
		this.personTableId = personTableId;
		if(personTableId != null){
			putBodyParameter("PersonTableId", personTableId);
		}
	}

	public Long getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
		if(pageNum != null){
			putBodyParameter("PageNum", pageNum.toString());
		}
	}

	public String getPersonTableItemId() {
		return this.personTableItemId;
	}

	public void setPersonTableItemId(String personTableItemId) {
		this.personTableItemId = personTableItemId;
		if(personTableItemId != null){
			putBodyParameter("PersonTableItemId", personTableItemId);
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id);
		}
	}

	@Override
	public Class<DescribeAiotPersonTableItemsResponse> getResponseClass() {
		return DescribeAiotPersonTableItemsResponse.class;
	}

}
