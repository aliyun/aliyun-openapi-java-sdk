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

package com.aliyuncs.trademark.model.v20180724;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class QueryTradeIntentionUserListRequest extends RpcAcsRequest<QueryTradeIntentionUserListResponse> {
	
	public QueryTradeIntentionUserListRequest() {
		super("Trademark", "2018-07-24", "QueryTradeIntentionUserList", "trademark");
	}

	private Long end;

	private Long begin;

	public Long getEnd() {
		return this.end;
	}

	public void setEnd(Long end) {
		this.end = end;
		if(end != null){
			putQueryParameter("End", end.toString());
		}
	}

	public Long getBegin() {
		return this.begin;
	}

	public void setBegin(Long begin) {
		this.begin = begin;
		if(begin != null){
			putQueryParameter("Begin", begin.toString());
		}
	}

	@Override
	public Class<QueryTradeIntentionUserListResponse> getResponseClass() {
		return QueryTradeIntentionUserListResponse.class;
	}

}
