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

package com.aliyuncs.domain.model.v20180208;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class QueryBookingDomainInfoRequest extends RpcAcsRequest<QueryBookingDomainInfoResponse> {
	
	public QueryBookingDomainInfoRequest() {
		super("Domain", "2018-02-08", "QueryBookingDomainInfo");
	}

	private String domainName;

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putBodyParameter("DomainName", domainName);
		}
	}

	@Override
	public Class<QueryBookingDomainInfoResponse> getResponseClass() {
		return QueryBookingDomainInfoResponse.class;
	}

}
