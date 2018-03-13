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
package com.aliyuncs.sas_api.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GetCrackListRequest extends RpcAcsRequest<GetCrackListResponse> {
	
	public GetCrackListRequest() {
		super("Sas-api", "2017-07-05", "GetCrackList");
	}

	private Integer start;

	private Integer limit;

	public Integer getStart() {
		return this.start;
	}

	public void setStart(Integer start) {
		this.start = start;
		if(start != null){
			putQueryParameter("Start", start.toString());
		}
	}

	public Integer getLimit() {
		return this.limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
		if(limit != null){
			putQueryParameter("Limit", limit.toString());
		}
	}

	@Override
	public Class<GetCrackListResponse> getResponseClass() {
		return GetCrackListResponse.class;
	}

}
