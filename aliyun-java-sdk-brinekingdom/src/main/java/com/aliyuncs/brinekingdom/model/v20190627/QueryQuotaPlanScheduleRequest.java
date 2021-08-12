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

package com.aliyuncs.brinekingdom.model.v20190627;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.brinekingdom.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryQuotaPlanScheduleRequest extends RpcAcsRequest<QueryQuotaPlanScheduleResponse> {
	   

	private List<Long> quotaPlanIdss;
	public QueryQuotaPlanScheduleRequest() {
		super("brinekingdom", "2019-06-27", "QueryQuotaPlanSchedule");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Long> getQuotaPlanIdss() {
		return this.quotaPlanIdss;
	}

	public void setQuotaPlanIdss(List<Long> quotaPlanIdss) {
		this.quotaPlanIdss = quotaPlanIdss;	
		if (quotaPlanIdss != null) {
			for (int i = 0; i < quotaPlanIdss.size(); i++) {
				putQueryParameter("QuotaPlanIds." + (i + 1) , quotaPlanIdss.get(i));
			}
		}	
	}

	@Override
	public Class<QueryQuotaPlanScheduleResponse> getResponseClass() {
		return QueryQuotaPlanScheduleResponse.class;
	}

}
