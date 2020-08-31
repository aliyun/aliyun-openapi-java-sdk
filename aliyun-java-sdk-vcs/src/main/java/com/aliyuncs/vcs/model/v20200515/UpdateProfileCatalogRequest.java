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

package com.aliyuncs.vcs.model.v20200515;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vcs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateProfileCatalogRequest extends RpcAcsRequest<UpdateProfileCatalogResponse> {
	   

	private String isvSubId;

	private String corpId;

	private String catalogName;

	private Long catalogId;
	public UpdateProfileCatalogRequest() {
		super("Vcs", "2020-05-15", "UpdateProfileCatalog", "vcs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIsvSubId() {
		return this.isvSubId;
	}

	public void setIsvSubId(String isvSubId) {
		this.isvSubId = isvSubId;
		if(isvSubId != null){
			putBodyParameter("IsvSubId", isvSubId);
		}
	}

	public String getCorpId() {
		return this.corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
		if(corpId != null){
			putBodyParameter("CorpId", corpId);
		}
	}

	public String getCatalogName() {
		return this.catalogName;
	}

	public void setCatalogName(String catalogName) {
		this.catalogName = catalogName;
		if(catalogName != null){
			putBodyParameter("CatalogName", catalogName);
		}
	}

	public Long getCatalogId() {
		return this.catalogId;
	}

	public void setCatalogId(Long catalogId) {
		this.catalogId = catalogId;
		if(catalogId != null){
			putBodyParameter("CatalogId", catalogId.toString());
		}
	}

	@Override
	public Class<UpdateProfileCatalogResponse> getResponseClass() {
		return UpdateProfileCatalogResponse.class;
	}

}
