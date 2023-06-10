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
public class ListCheckInstanceResultRequest extends RpcAcsRequest<ListCheckInstanceResultResponse> {
	   

	private String regionIdKey;

	private Integer pageSize;

	private String lang;

	private Long checkId;

	private Integer currentPage;

	private List<String> sortTypess;

	private String instanceIdKey;

	private String instanceNameKey;

	private List<String> instanceIdss;

	private List<String> statusess;
	public ListCheckInstanceResultRequest() {
		super("Sas", "2018-12-03", "ListCheckInstanceResult", "sas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRegionIdKey() {
		return this.regionIdKey;
	}

	public void setRegionIdKey(String regionIdKey) {
		this.regionIdKey = regionIdKey;
		if(regionIdKey != null){
			putQueryParameter("RegionIdKey", regionIdKey);
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

	public Long getCheckId() {
		return this.checkId;
	}

	public void setCheckId(Long checkId) {
		this.checkId = checkId;
		if(checkId != null){
			putQueryParameter("CheckId", checkId.toString());
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

	public String getInstanceIdKey() {
		return this.instanceIdKey;
	}

	public void setInstanceIdKey(String instanceIdKey) {
		this.instanceIdKey = instanceIdKey;
		if(instanceIdKey != null){
			putQueryParameter("InstanceIdKey", instanceIdKey);
		}
	}

	public String getInstanceNameKey() {
		return this.instanceNameKey;
	}

	public void setInstanceNameKey(String instanceNameKey) {
		this.instanceNameKey = instanceNameKey;
		if(instanceNameKey != null){
			putQueryParameter("InstanceNameKey", instanceNameKey);
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
	public Class<ListCheckInstanceResultResponse> getResponseClass() {
		return ListCheckInstanceResultResponse.class;
	}

}
