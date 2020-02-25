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
public class QueryMovieSchedulesRequest extends RpcAcsRequest<QueryMovieSchedulesResponse> {
	   

	private Long cinemaId;

	private String extJson;

	private String bizId;
	public QueryMovieSchedulesRequest() {
		super("linkedmall", "2018-01-16", "QueryMovieSchedules");
		setMethod(MethodType.POST);
	}

	public Long getCinemaId() {
		return this.cinemaId;
	}

	public void setCinemaId(Long cinemaId) {
		this.cinemaId = cinemaId;
		if(cinemaId != null){
			putQueryParameter("CinemaId", cinemaId.toString());
		}
	}

	public String getExtJson() {
		return this.extJson;
	}

	public void setExtJson(String extJson) {
		this.extJson = extJson;
		if(extJson != null){
			putQueryParameter("ExtJson", extJson);
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

	@Override
	public Class<QueryMovieSchedulesResponse> getResponseClass() {
		return QueryMovieSchedulesResponse.class;
	}

}
