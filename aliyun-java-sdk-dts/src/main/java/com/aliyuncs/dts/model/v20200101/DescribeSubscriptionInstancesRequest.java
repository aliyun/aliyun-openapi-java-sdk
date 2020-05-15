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

package com.aliyuncs.dts.model.v20200101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeSubscriptionInstancesRequest extends RpcAcsRequest<DescribeSubscriptionInstancesResponse> {
	   

	private String clientToken;

	private Integer pageNum;

	private String ownerId;

	private String accountId;

	private Integer pageSize;

	private String subscriptionInstanceName;
	public DescribeSubscriptionInstancesRequest() {
		super("Dts", "2020-01-01", "DescribeSubscriptionInstances");
		setMethod(MethodType.POST);
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
		if(pageNum != null){
			putQueryParameter("PageNum", pageNum.toString());
		}
	}

	public String getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId);
		}
	}

	public String getAccountId() {
		return this.accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
		if(accountId != null){
			putQueryParameter("AccountId", accountId);
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

	public String getSubscriptionInstanceName() {
		return this.subscriptionInstanceName;
	}

	public void setSubscriptionInstanceName(String subscriptionInstanceName) {
		this.subscriptionInstanceName = subscriptionInstanceName;
		if(subscriptionInstanceName != null){
			putQueryParameter("SubscriptionInstanceName", subscriptionInstanceName);
		}
	}

	@Override
	public Class<DescribeSubscriptionInstancesResponse> getResponseClass() {
		return DescribeSubscriptionInstancesResponse.class;
	}

}
