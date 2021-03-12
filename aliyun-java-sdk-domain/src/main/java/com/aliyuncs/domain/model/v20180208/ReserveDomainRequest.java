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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.domain.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ReserveDomainRequest extends RpcAcsRequest<ReserveDomainResponse> {
	   

	private List<String> channelss;

	private String domainName;
	public ReserveDomainRequest() {
		super("Domain", "2018-02-08", "ReserveDomain", "domain");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getChannelss() {
		return this.channelss;
	}

	public void setChannelss(List<String> channelss) {
		this.channelss = channelss;	
		if (channelss != null) {
			for (int i = 0; i < channelss.size(); i++) {
				putBodyParameter("Channels." + (i + 1) , channelss.get(i));
			}
		}	
	}

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
	public Class<ReserveDomainResponse> getResponseClass() {
		return ReserveDomainResponse.class;
	}

}
