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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class PageImageRegistryRequest extends RpcAcsRequest<PageImageRegistryResponse> {
	   

	private List<String> registryTypeNotInLists;

	private String sourceIp;

	private Integer pageSize;

	private String registryNameLike;

	private Integer currentPage;

	private List<String> registryTypeInLists;
	public PageImageRegistryRequest() {
		super("Sas", "2018-12-03", "PageImageRegistry", "sas");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getRegistryTypeNotInLists() {
		return this.registryTypeNotInLists;
	}

	public void setRegistryTypeNotInLists(List<String> registryTypeNotInLists) {
		this.registryTypeNotInLists = registryTypeNotInLists;	
		if (registryTypeNotInLists != null) {
			for (int i = 0; i < registryTypeNotInLists.size(); i++) {
				putBodyParameter("RegistryTypeNotInList." + (i + 1) , registryTypeNotInLists.get(i));
			}
		}	
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getRegistryNameLike() {
		return this.registryNameLike;
	}

	public void setRegistryNameLike(String registryNameLike) {
		this.registryNameLike = registryNameLike;
		if(registryNameLike != null){
			putBodyParameter("RegistryNameLike", registryNameLike);
		}
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putBodyParameter("CurrentPage", currentPage.toString());
		}
	}

	public List<String> getRegistryTypeInLists() {
		return this.registryTypeInLists;
	}

	public void setRegistryTypeInLists(List<String> registryTypeInLists) {
		this.registryTypeInLists = registryTypeInLists;	
		if (registryTypeInLists != null) {
			for (int i = 0; i < registryTypeInLists.size(); i++) {
				putBodyParameter("RegistryTypeInList." + (i + 1) , registryTypeInLists.get(i));
			}
		}	
	}

	@Override
	public Class<PageImageRegistryResponse> getResponseClass() {
		return PageImageRegistryResponse.class;
	}

}
