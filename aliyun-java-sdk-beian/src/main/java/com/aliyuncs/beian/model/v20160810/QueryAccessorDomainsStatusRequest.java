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

package com.aliyuncs.beian.model.v20160810;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QueryAccessorDomainsStatusRequest extends RpcAcsRequest<QueryAccessorDomainsStatusResponse> {
	   

	private List<String> domainss;

	private String caller;
	public QueryAccessorDomainsStatusRequest() {
		super("Beian", "2016-08-10", "QueryAccessorDomainsStatus");
		setMethod(MethodType.POST);
	}

	public List<String> getDomainss() {
		return this.domainss;
	}

	public void setDomainss(List<String> domainss) {
		this.domainss = domainss;	
		if (domainss != null) {
			for (int i = 0; i < domainss.size(); i++) {
				putQueryParameter("Domains." + (i + 1) , domainss.get(i));
			}
		}	
	}

	public String getCaller() {
		return this.caller;
	}

	public void setCaller(String caller) {
		this.caller = caller;
		if(caller != null){
			putQueryParameter("Caller", caller);
		}
	}

	@Override
	public Class<QueryAccessorDomainsStatusResponse> getResponseClass() {
		return QueryAccessorDomainsStatusResponse.class;
	}

}
