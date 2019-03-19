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

package com.aliyuncs.cloudwf.model.v20170328;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GetSidsAndGids4BidRequest extends RpcAcsRequest<GetSidsAndGids4BidResponse> {
	
	public GetSidsAndGids4BidRequest() {
		super("cloudwf", "2017-03-28", "GetSidsAndGids4Bid", "cloudwf");
	}

	private Integer queryType;

	private Long queryId;

	public Integer getQueryType() {
		return this.queryType;
	}

	public void setQueryType(Integer queryType) {
		this.queryType = queryType;
		if(queryType != null){
			putQueryParameter("QueryType", queryType.toString());
		}
	}

	public Long getQueryId() {
		return this.queryId;
	}

	public void setQueryId(Long queryId) {
		this.queryId = queryId;
		if(queryId != null){
			putQueryParameter("QueryId", queryId.toString());
		}
	}

	@Override
	public Class<GetSidsAndGids4BidResponse> getResponseClass() {
		return GetSidsAndGids4BidResponse.class;
	}

}
