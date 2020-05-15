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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryRmsAlarmHistorycountRequest extends RpcAcsRequest<QueryRmsAlarmHistorycountResponse> {
	   

	private Long from;

	private String envJsonStr;

	private Long to;
	public QueryRmsAlarmHistorycountRequest() {
		super("SOFA", "2019-08-15", "QueryRmsAlarmHistorycount", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getFrom() {
		return this.from;
	}

	public void setFrom(Long from) {
		this.from = from;
		if(from != null){
			putBodyParameter("From", from.toString());
		}
	}

	public String getEnvJsonStr() {
		return this.envJsonStr;
	}

	public void setEnvJsonStr(String envJsonStr) {
		this.envJsonStr = envJsonStr;
		if(envJsonStr != null){
			putBodyParameter("EnvJsonStr", envJsonStr);
		}
	}

	public Long getTo() {
		return this.to;
	}

	public void setTo(Long to) {
		this.to = to;
		if(to != null){
			putBodyParameter("To", to.toString());
		}
	}

	@Override
	public Class<QueryRmsAlarmHistorycountResponse> getResponseClass() {
		return QueryRmsAlarmHistorycountResponse.class;
	}

}
