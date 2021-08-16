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

package com.aliyuncs.das.model.v20200116;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.das.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class EnableSqlConcurrencyControlRequest extends RpcAcsRequest<EnableSqlConcurrencyControlResponse> {
	   

	private String sqlType;

	private String sqlKeywords;

	private String consoleContext;

	private String instanceId;

	private Long concurrencyControlTime;

	private Long maxConcurrency;
	public EnableSqlConcurrencyControlRequest() {
		super("DAS", "2020-01-16", "EnableSqlConcurrencyControl", "das");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSqlType() {
		return this.sqlType;
	}

	public void setSqlType(String sqlType) {
		this.sqlType = sqlType;
		if(sqlType != null){
			putQueryParameter("SqlType", sqlType);
		}
	}

	public String getSqlKeywords() {
		return this.sqlKeywords;
	}

	public void setSqlKeywords(String sqlKeywords) {
		this.sqlKeywords = sqlKeywords;
		if(sqlKeywords != null){
			putQueryParameter("SqlKeywords", sqlKeywords);
		}
	}

	public String getConsoleContext() {
		return this.consoleContext;
	}

	public void setConsoleContext(String consoleContext) {
		this.consoleContext = consoleContext;
		if(consoleContext != null){
			putQueryParameter("ConsoleContext", consoleContext);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public Long getConcurrencyControlTime() {
		return this.concurrencyControlTime;
	}

	public void setConcurrencyControlTime(Long concurrencyControlTime) {
		this.concurrencyControlTime = concurrencyControlTime;
		if(concurrencyControlTime != null){
			putQueryParameter("ConcurrencyControlTime", concurrencyControlTime.toString());
		}
	}

	public Long getMaxConcurrency() {
		return this.maxConcurrency;
	}

	public void setMaxConcurrency(Long maxConcurrency) {
		this.maxConcurrency = maxConcurrency;
		if(maxConcurrency != null){
			putQueryParameter("MaxConcurrency", maxConcurrency.toString());
		}
	}

	@Override
	public Class<EnableSqlConcurrencyControlResponse> getResponseClass() {
		return EnableSqlConcurrencyControlResponse.class;
	}

}
