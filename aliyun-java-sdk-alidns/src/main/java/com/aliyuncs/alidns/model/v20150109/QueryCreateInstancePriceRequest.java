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

package com.aliyuncs.alidns.model.v20150109;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class QueryCreateInstancePriceRequest extends RpcAcsRequest<QueryCreateInstancePriceResponse> {
	
	public QueryCreateInstancePriceRequest() {
		super("Alidns", "2015-01-09", "QueryCreateInstancePrice", "Alidns");
	}

	private Integer month;

	private String userClientIp;

	private String lang;

	private String instanceVersion;

	private Long ownerId;

	public Integer getMonth() {
		return this.month;
	}

	public void setMonth(Integer month) {
		this.month = month;
		if(month != null){
			putQueryParameter("Month", month.toString());
		}
	}

	public String getUserClientIp() {
		return this.userClientIp;
	}

	public void setUserClientIp(String userClientIp) {
		this.userClientIp = userClientIp;
		if(userClientIp != null){
			putQueryParameter("UserClientIp", userClientIp);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public String getInstanceVersion() {
		return this.instanceVersion;
	}

	public void setInstanceVersion(String instanceVersion) {
		this.instanceVersion = instanceVersion;
		if(instanceVersion != null){
			putQueryParameter("InstanceVersion", instanceVersion);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	@Override
	public Class<QueryCreateInstancePriceResponse> getResponseClass() {
		return QueryCreateInstancePriceResponse.class;
	}

}
