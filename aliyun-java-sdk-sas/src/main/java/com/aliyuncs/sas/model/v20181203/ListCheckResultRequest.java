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
public class ListCheckResultRequest extends RpcAcsRequest<ListCheckResultResponse> {
	   

	private List<Long> standardIdss;

	private List<String> riskLevelss;

	private List<String> instanceTypess;

	private String checkKey;

	private Integer pageSize;

	private String lang;

	private List<String> vendorss;

	private List<String> typess;

	private Integer currentPage;

	private List<Long> requirementIdss;

	private List<String> sortTypess;

	private List<String> instanceIdss;

	private List<String> statusess;
	public ListCheckResultRequest() {
		super("Sas", "2018-12-03", "ListCheckResult");
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

	public List<String> getRiskLevelss() {
		return this.riskLevelss;
	}

	public void setRiskLevelss(List<String> riskLevelss) {
		this.riskLevelss = riskLevelss;	
		if (riskLevelss != null) {
			for (int i = 0; i < riskLevelss.size(); i++) {
				putQueryParameter("RiskLevels." + (i + 1) , riskLevelss.get(i));
			}
		}	
	}

	public List<String> getInstanceTypess() {
		return this.instanceTypess;
	}

	public void setInstanceTypess(List<String> instanceTypess) {
		this.instanceTypess = instanceTypess;	
		if (instanceTypess != null) {
			for (int i = 0; i < instanceTypess.size(); i++) {
				putQueryParameter("InstanceTypes." + (i + 1) , instanceTypess.get(i));
			}
		}	
	}

	public String getCheckKey() {
		return this.checkKey;
	}

	public void setCheckKey(String checkKey) {
		this.checkKey = checkKey;
		if(checkKey != null){
			putQueryParameter("CheckKey", checkKey);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
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

	public List<String> getVendorss() {
		return this.vendorss;
	}

	public void setVendorss(List<String> vendorss) {
		this.vendorss = vendorss;	
		if (vendorss != null) {
			for (int i = 0; i < vendorss.size(); i++) {
				putQueryParameter("Vendors." + (i + 1) , vendorss.get(i));
			}
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

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
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

	public List<String> getSortTypess() {
		return this.sortTypess;
	}

	public void setSortTypess(List<String> sortTypess) {
		this.sortTypess = sortTypess;	
		if (sortTypess != null) {
			for (int i = 0; i < sortTypess.size(); i++) {
				putQueryParameter("SortTypes." + (i + 1) , sortTypess.get(i));
			}
		}	
	}

	public List<String> getInstanceIdss() {
		return this.instanceIdss;
	}

	public void setInstanceIdss(List<String> instanceIdss) {
		this.instanceIdss = instanceIdss;	
		if (instanceIdss != null) {
			for (int i = 0; i < instanceIdss.size(); i++) {
				putQueryParameter("InstanceIds." + (i + 1) , instanceIdss.get(i));
			}
		}	
	}

	public List<String> getStatusess() {
		return this.statusess;
	}

	public void setStatusess(List<String> statusess) {
		this.statusess = statusess;	
		if (statusess != null) {
			for (int i = 0; i < statusess.size(); i++) {
				putQueryParameter("Statuses." + (i + 1) , statusess.get(i));
			}
		}	
	}

	@Override
	public Class<ListCheckResultResponse> getResponseClass() {
		return ListCheckResultResponse.class;
	}

}
