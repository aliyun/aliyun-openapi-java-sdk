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

package com.aliyuncs.linkedmall.model.v20180116;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QueryActivityItemsRequest extends RpcAcsRequest<QueryActivityItemsResponse> {
	   

	private Long lmActivityId;

	private String bizId;

	private Integer pageSize;

	private Integer pageNumber;
	public QueryActivityItemsRequest() {
		super("linkedmall", "2018-01-16", "QueryActivityItems");
		setMethod(MethodType.POST);
	}

	public Long getLmActivityId() {
		return this.lmActivityId;
	}

	public void setLmActivityId(Long lmActivityId) {
		this.lmActivityId = lmActivityId;
		if(lmActivityId != null){
			putQueryParameter("LmActivityId", lmActivityId.toString());
		}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("BizId", bizId);
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
	public Class<QueryActivityItemsResponse> getResponseClass() {
		return QueryActivityItemsResponse.class;
	}

}
