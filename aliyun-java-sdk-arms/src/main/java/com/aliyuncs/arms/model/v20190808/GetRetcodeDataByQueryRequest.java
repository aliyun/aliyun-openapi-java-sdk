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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetRetcodeDataByQueryRequest extends RpcAcsRequest<GetRetcodeDataByQueryResponse> {
	   

	private String query;

	private String pid;

	private Long from;

	private Long to;
	public GetRetcodeDataByQueryRequest() {
		super("ARMS", "2019-08-08", "GetRetcodeDataByQuery", "arms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getQuery() {
		return this.query;
	}

	public void setQuery(String query) {
		this.query = query;
		if(query != null){
			putQueryParameter("Query", query);
		}
	}

	public String getPid() {
		return this.pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
		if(pid != null){
			putQueryParameter("Pid", pid);
		}
	}

	public Long getFrom() {
		return this.from;
	}

	public void setFrom(Long from) {
		this.from = from;
		if(from != null){
			putQueryParameter("From", from.toString());
		}
	}

	public Long getTo() {
		return this.to;
	}

	public void setTo(Long to) {
		this.to = to;
		if(to != null){
			putQueryParameter("To", to.toString());
		}
	}

	@Override
	public Class<GetRetcodeDataByQueryResponse> getResponseClass() {
		return GetRetcodeDataByQueryResponse.class;
	}

}
