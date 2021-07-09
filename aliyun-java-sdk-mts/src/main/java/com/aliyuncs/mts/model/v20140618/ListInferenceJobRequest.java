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

package com.aliyuncs.mts.model.v20140618;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mts.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListInferenceJobRequest extends RpcAcsRequest<ListInferenceJobResponse> {
	   

	private Long maxPageSize;

	private Long pageNumber;

	private String serverName;
	public ListInferenceJobRequest() {
		super("Mts", "2014-06-18", "ListInferenceJob", "mts");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getMaxPageSize() {
		return this.maxPageSize;
	}

	public void setMaxPageSize(Long maxPageSize) {
		this.maxPageSize = maxPageSize;
		if(maxPageSize != null){
			putQueryParameter("MaxPageSize", maxPageSize.toString());
		}
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getServerName() {
		return this.serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
		if(serverName != null){
			putQueryParameter("ServerName", serverName);
		}
	}

	@Override
	public Class<ListInferenceJobResponse> getResponseClass() {
		return ListInferenceJobResponse.class;
	}

}
