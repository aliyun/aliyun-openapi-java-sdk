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

package com.aliyuncs.reid.model.v20190928;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.reid.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ImportSpecialPersonnelRequest extends RpcAcsRequest<ImportSpecialPersonnelResponse> {
	   

	private Long ukId;

	private String description;

	private String externalId;

	private String personType;

	private String urls;

	private String personName;

	private String storeIds;

	private String status;
	public ImportSpecialPersonnelRequest() {
		super("reid", "2019-09-28", "ImportSpecialPersonnel", "1.1.2");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getUkId() {
		return this.ukId;
	}

	public void setUkId(Long ukId) {
		this.ukId = ukId;
		if(ukId != null){
			putBodyParameter("UkId", ukId.toString());
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public String getExternalId() {
		return this.externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
		if(externalId != null){
			putBodyParameter("ExternalId", externalId);
		}
	}

	public String getPersonType() {
		return this.personType;
	}

	public void setPersonType(String personType) {
		this.personType = personType;
		if(personType != null){
			putBodyParameter("PersonType", personType);
		}
	}

	public String getUrls() {
		return this.urls;
	}

	public void setUrls(String urls) {
		this.urls = urls;
		if(urls != null){
			putBodyParameter("Urls", urls);
		}
	}

	public String getPersonName() {
		return this.personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
		if(personName != null){
			putBodyParameter("PersonName", personName);
		}
	}

	public String getStoreIds() {
		return this.storeIds;
	}

	public void setStoreIds(String storeIds) {
		this.storeIds = storeIds;
		if(storeIds != null){
			putBodyParameter("StoreIds", storeIds);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status);
		}
	}

	@Override
	public Class<ImportSpecialPersonnelResponse> getResponseClass() {
		return ImportSpecialPersonnelResponse.class;
	}

}
