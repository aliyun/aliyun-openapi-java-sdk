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

package com.aliyuncs.finmall.model.v20180723;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GetCreditRepayListRequest extends RpcAcsRequest<GetCreditRepayListResponse> {
	
	public GetCreditRepayListRequest() {
		super("finmall", "2018-07-23", "GetCreditRepayList", "finmall");
	}

	private String queryExpression;

	private Integer pageSize;

	private String userId;

	private Integer pageNumber;

	public String getQueryExpression() {
		return this.queryExpression;
	}

	public void setQueryExpression(String queryExpression) {
		this.queryExpression = queryExpression;
		if(queryExpression != null){
			putQueryParameter("QueryExpression", queryExpression);
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

	@Override
	public Class<GetCreditRepayListResponse> getResponseClass() {
		return GetCreditRepayListResponse.class;
	}

}
