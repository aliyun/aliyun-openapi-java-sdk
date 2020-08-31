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

package com.aliyuncs.config.model.v20190108;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetDiscoveredResourceCountsRequest extends RpcAcsRequest<GetDiscoveredResourceCountsResponse> {
	   

	private Boolean multiAccount;

	private String groupByKey;

	private Long memberId;
	public GetDiscoveredResourceCountsRequest() {
		super("Config", "2019-01-08", "GetDiscoveredResourceCounts", "config");
		setMethod(MethodType.GET);
	}

	public Boolean getMultiAccount() {
		return this.multiAccount;
	}

	public void setMultiAccount(Boolean multiAccount) {
		this.multiAccount = multiAccount;
		if(multiAccount != null){
			putQueryParameter("MultiAccount", multiAccount.toString());
		}
	}

	public String getGroupByKey() {
		return this.groupByKey;
	}

	public void setGroupByKey(String groupByKey) {
		this.groupByKey = groupByKey;
		if(groupByKey != null){
			putQueryParameter("GroupByKey", groupByKey);
		}
	}

	public Long getMemberId() {
		return this.memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
		if(memberId != null){
			putQueryParameter("MemberId", memberId.toString());
		}
	}

	@Override
	public Class<GetDiscoveredResourceCountsResponse> getResponseClass() {
		return GetDiscoveredResourceCountsResponse.class;
	}

}
