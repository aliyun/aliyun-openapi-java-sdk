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

package com.aliyuncs.domain.model.v20180129;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.domain.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryDomainRealTimePriceRequest extends RpcAcsRequest<QueryDomainRealTimePriceResponse> {
	   

	@SerializedName("domainItem")
	private List<DomainItem> domainItem;

	private String currency;
	public QueryDomainRealTimePriceRequest() {
		super("Domain", "2018-01-29", "QueryDomainRealTimePrice", "domain");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<DomainItem> getDomainItem() {
		return this.domainItem;
	}

	public void setDomainItem(List<DomainItem> domainItem) {
		this.domainItem = domainItem;	
		if (domainItem != null) {
			putQueryParameter("DomainItem" , new Gson().toJson(domainItem));
		}	
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
		if(currency != null){
			putQueryParameter("Currency", currency);
		}
	}

	public static class DomainItem {

		@SerializedName("Period")
		private Integer period;

		@SerializedName("DomainName")
		private String domainName;

		@SerializedName("Action")
		private String action;

		@SerializedName("Suffix")
		private String suffix;

		public Integer getPeriod() {
			return this.period;
		}

		public void setPeriod(Integer period) {
			this.period = period;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getAction() {
			return this.action;
		}

		public void setAction(String action) {
			this.action = action;
		}

		public String getSuffix() {
			return this.suffix;
		}

		public void setSuffix(String suffix) {
			this.suffix = suffix;
		}
	}

	@Override
	public Class<QueryDomainRealTimePriceResponse> getResponseClass() {
		return QueryDomainRealTimePriceResponse.class;
	}

}
