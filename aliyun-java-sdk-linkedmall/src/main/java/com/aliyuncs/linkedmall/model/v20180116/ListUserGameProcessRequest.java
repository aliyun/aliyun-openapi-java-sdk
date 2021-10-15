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
import com.aliyuncs.linkedmall.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListUserGameProcessRequest extends RpcAcsRequest<ListUserGameProcessResponse> {
	   

	private String gameId;

	private String accountType;

	private String type;

	private Integer pageNumber;

	private String activityId;

	private String thirdPartyUserId;

	private String bizId;

	private Integer pageSize;

	private String status;
	public ListUserGameProcessRequest() {
		super("linkedmall", "2018-01-16", "ListUserGameProcess", "linkedmall");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getGameId() {
		return this.gameId;
	}

	public void setGameId(String gameId) {
		this.gameId = gameId;
		if(gameId != null){
			putQueryParameter("GameId", gameId);
		}
	}

	public String getAccountType() {
		return this.accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
		if(accountType != null){
			putQueryParameter("AccountType", accountType);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
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

	public String getActivityId() {
		return this.activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
		if(activityId != null){
			putQueryParameter("ActivityId", activityId);
		}
	}

	public String getThirdPartyUserId() {
		return this.thirdPartyUserId;
	}

	public void setThirdPartyUserId(String thirdPartyUserId) {
		this.thirdPartyUserId = thirdPartyUserId;
		if(thirdPartyUserId != null){
			putQueryParameter("ThirdPartyUserId", thirdPartyUserId);
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

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	@Override
	public Class<ListUserGameProcessResponse> getResponseClass() {
		return ListUserGameProcessResponse.class;
	}

}
