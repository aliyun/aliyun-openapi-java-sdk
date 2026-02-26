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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListInstanceCatalogRequest extends RpcAcsRequest<ListInstanceCatalogResponse> {
	   

	private List<Long> standardIdss;

	private String lang;

	private List<String> typess;

	private List<Long> requirementIdss;
	public ListInstanceCatalogRequest() {
		super("Sas", "2018-12-03", "ListInstanceCatalog");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Long> getStandardIdss() {
		return this.standardIdss;
	}

	public void setStandardIdss(List<Long> standardIdss) {
		this.standardIdss = standardIdss;	
		if (standardIdss != null) {
			for (int i = 0; i < standardIdss.size(); i++) {
				putQueryParameter("StandardIds." + (i + 1) , standardIdss.get(i));
			}
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

	public List<String> getTypess() {
		return this.typess;
	}

	public void setTypess(List<String> typess) {
		this.typess = typess;	
		if (typess != null) {
			for (int i = 0; i < typess.size(); i++) {
				putQueryParameter("Types." + (i + 1) , typess.get(i));
			}
		}	
	}

	public List<Long> getRequirementIdss() {
		return this.requirementIdss;
	}

	public void setRequirementIdss(List<Long> requirementIdss) {
		this.requirementIdss = requirementIdss;	
		if (requirementIdss != null) {
			for (int i = 0; i < requirementIdss.size(); i++) {
				putQueryParameter("RequirementIds." + (i + 1) , requirementIdss.get(i));
			}
		}	
	}

	@Override
	public Class<ListInstanceCatalogResponse> getResponseClass() {
		return ListInstanceCatalogResponse.class;
	}

}
