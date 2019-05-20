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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GetAcquaintanceRequest extends RpcAcsRequest<GetAcquaintanceResponse> {
	
	public GetAcquaintanceRequest() {
		super("CloudCallCenter", "2017-07-05", "GetAcquaintance", "CloudCallCenter", "innerAPI");
	}

	private String number;

	private Integer limitCount;

	private Integer contactDisposition;

	private Integer contactType;

	private Integer days;

	private String tenant;

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
		if(number != null){
			putQueryParameter("Number", number);
		}
	}

	public Integer getLimitCount() {
		return this.limitCount;
	}

	public void setLimitCount(Integer limitCount) {
		this.limitCount = limitCount;
		if(limitCount != null){
			putQueryParameter("LimitCount", limitCount.toString());
		}
	}

	public Integer getContactDisposition() {
		return this.contactDisposition;
	}

	public void setContactDisposition(Integer contactDisposition) {
		this.contactDisposition = contactDisposition;
		if(contactDisposition != null){
			putQueryParameter("ContactDisposition", contactDisposition.toString());
		}
	}

	public Integer getContactType() {
		return this.contactType;
	}

	public void setContactType(Integer contactType) {
		this.contactType = contactType;
		if(contactType != null){
			putQueryParameter("ContactType", contactType.toString());
		}
	}

	public Integer getDays() {
		return this.days;
	}

	public void setDays(Integer days) {
		this.days = days;
		if(days != null){
			putQueryParameter("Days", days.toString());
		}
	}

	public String getTenant() {
		return this.tenant;
	}

	public void setTenant(String tenant) {
		this.tenant = tenant;
		if(tenant != null){
			putQueryParameter("Tenant", tenant);
		}
	}

	@Override
	public Class<GetAcquaintanceResponse> getResponseClass() {
		return GetAcquaintanceResponse.class;
	}

}
