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

package com.aliyuncs.sddp.model.v20190103;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sddp.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyEventStatusRequest extends RpcAcsRequest<ModifyEventStatusResponse> {
	   

	private Boolean backed;

	private String dealReason;

	private Long id;

	private String lang;

	private Integer status;
	public ModifyEventStatusRequest() {
		super("Sddp", "2019-01-03", "ModifyEventStatus", "sddp");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getBacked() {
		return this.backed;
	}

	public void setBacked(Boolean backed) {
		this.backed = backed;
		if(backed != null){
			putQueryParameter("Backed", backed.toString());
		}
	}

	public String getDealReason() {
		return this.dealReason;
	}

	public void setDealReason(String dealReason) {
		this.dealReason = dealReason;
		if(dealReason != null){
			putQueryParameter("DealReason", dealReason);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
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

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status.toString());
		}
	}

	@Override
	public Class<ModifyEventStatusResponse> getResponseClass() {
		return ModifyEventStatusResponse.class;
	}

}
