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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.domain.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryExchangeRateRequest extends RpcAcsRequest<QueryExchangeRateResponse> {
	   

	private String toCurrency;

	private String fromCurrency;
	public QueryExchangeRateRequest() {
		super("Domain", "2018-02-08", "QueryExchangeRate", "domain");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getToCurrency() {
		return this.toCurrency;
	}

	public void setToCurrency(String toCurrency) {
		this.toCurrency = toCurrency;
		if(toCurrency != null){
			putQueryParameter("ToCurrency", toCurrency);
		}
	}

	public String getFromCurrency() {
		return this.fromCurrency;
	}

	public void setFromCurrency(String fromCurrency) {
		this.fromCurrency = fromCurrency;
		if(fromCurrency != null){
			putQueryParameter("FromCurrency", fromCurrency);
		}
	}

	@Override
	public Class<QueryExchangeRateResponse> getResponseClass() {
		return QueryExchangeRateResponse.class;
	}

}
