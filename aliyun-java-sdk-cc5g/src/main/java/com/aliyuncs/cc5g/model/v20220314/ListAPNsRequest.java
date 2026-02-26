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

package com.aliyuncs.cc5g.model.v20220314;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListAPNsRequest extends RpcAcsRequest<ListAPNsResponse> {
	   

	private String iSP;

	private String nextToken;

	private Long maxResults;

	private String aPN;
	public ListAPNsRequest() {
		super("CC5G", "2022-03-14", "ListAPNs", "fivegcc");
		setMethod(MethodType.GET);
	}

	public String getISP() {
		return this.iSP;
	}

	public void setISP(String iSP) {
		this.iSP = iSP;
		if(iSP != null){
			putQueryParameter("ISP", iSP);
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public Long getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Long maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	public String getAPN() {
		return this.aPN;
	}

	public void setAPN(String aPN) {
		this.aPN = aPN;
		if(aPN != null){
			putQueryParameter("APN", aPN);
		}
	}

	@Override
	public Class<ListAPNsResponse> getResponseClass() {
		return ListAPNsResponse.class;
	}

}
